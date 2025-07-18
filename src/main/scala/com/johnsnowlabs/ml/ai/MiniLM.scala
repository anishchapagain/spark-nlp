/*
 * Copyright 2017 - 2023  John Snow Labs
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.johnsnowlabs.ml.ai

import ai.onnxruntime.{OnnxTensor, TensorInfo}
import com.johnsnowlabs.ml.onnx.{OnnxSession, OnnxWrapper}
import com.johnsnowlabs.ml.openvino.OpenvinoWrapper
import com.johnsnowlabs.ml.tensorflow.sign.{ModelSignatureConstants, ModelSignatureManager}
import com.johnsnowlabs.ml.util.{LinAlg, ONNX, Openvino}
import com.johnsnowlabs.nlp.annotators.common._
import com.johnsnowlabs.nlp.{Annotation, AnnotatorType}
import org.slf4j.{Logger, LoggerFactory}

import scala.collection.JavaConverters._

/** MiniLM Sentence embeddings model
  * @param onnxWrapper
  *   onnx wrapper
  * @param openvinoWrapper
  *   openvino wrapper
  * @param configProtoBytes
  *   config proto bytes
  * @param sentenceStartTokenId
  *   sentence start token id
  * @param sentenceEndTokenId
  *   sentence end token id
  * @param signatures
  *   signatures
  */
private[johnsnowlabs] class MiniLM(
    val onnxWrapper: Option[OnnxWrapper],
    val openvinoWrapper: Option[OpenvinoWrapper],
    configProtoBytes: Option[Array[Byte]] = None,
    sentenceStartTokenId: Int,
    sentenceEndTokenId: Int,
    signatures: Option[Map[String, String]] = None)
    extends Serializable {

  protected val logger: Logger = LoggerFactory.getLogger("MiniLM")
  private val _tfInstructorSignatures: Map[String, String] =
    signatures.getOrElse(ModelSignatureManager.apply())
  private val paddingTokenId = 0

  val detectedEngine: String =
    if (onnxWrapper.isDefined) ONNX.name
    else if (openvinoWrapper.isDefined) Openvino.name
    else Openvino.name
  private val onnxSessionOptions: Map[String, String] = new OnnxSession().getSessionOptions

  /** Get sentence embeddings for a batch of sentences
    * @param batch
    *   batch of sentences
    * @return
    *   sentence embeddings
    */
  private def getSentenceEmbedding(batch: Seq[Array[Int]]): Array[Array[Float]] = {
    val maxSentenceLength = batch.map(pieceIds => pieceIds.length).max
    val paddedBatch = batch.map(arr => padArrayWithZeros(arr, maxSentenceLength))
    val embeddings = detectedEngine match {
      case Openvino.name =>
        getSentenceEmbeddingFromOv(paddedBatch, maxSentenceLength)
      case ONNX.name =>
        getSentenceEmbeddingFromOnnx(paddedBatch, maxSentenceLength)
      case _ =>
        getSentenceEmbeddingFromOv(paddedBatch, maxSentenceLength)
    }
    embeddings
  }

  private def padArrayWithZeros(arr: Array[Int], maxLength: Int): Array[Int] = {
    if (arr.length >= maxLength) {
      arr
    } else {
      arr ++ Array.fill(maxLength - arr.length)(0)
    }
  }

  private def getSentenceEmbeddingFromOnnx(
      batch: Seq[Array[Int]],
      maxSentenceLength: Int): Array[Array[Float]] = {

    val inputIds = batch.map(x => x.map(x => x.toLong)).toArray
    val attentionMask = batch.map(sentence => sentence.map(x => if (x == 0L) 0L else 1L)).toArray

    val (runner, env) = onnxWrapper.get.getSession(onnxSessionOptions)

    val tokenTensors = OnnxTensor.createTensor(env, inputIds)
    val maskTensors = OnnxTensor.createTensor(env, attentionMask)
    val segmentTensors =
      OnnxTensor.createTensor(env, batch.map(x => Array.fill(maxSentenceLength)(0L)).toArray)
    val inputs =
      Map(
        "input_ids" -> tokenTensors,
        "attention_mask" -> maskTensors,
        "token_type_ids" -> segmentTensors).asJava

    // TODO:  A try without a catch or finally is equivalent to putting its body in a block; no exceptions are handled.
    try {
      val results = runner.run(inputs)
      val lastHiddenState = results.get("last_hidden_state").get()
      val info = lastHiddenState.getInfo.asInstanceOf[TensorInfo]
      val shape = info.getShape
      try {
        val flattenEmbeddings = lastHiddenState
          .asInstanceOf[OnnxTensor]
          .getFloatBuffer
          .array()

        val embeddings = LinAlg.avgPooling(flattenEmbeddings, attentionMask, shape)
        val normalizedEmbeddings = LinAlg.l2Normalize(embeddings)
        LinAlg.denseMatrixToArray(normalizedEmbeddings)
      } finally if (results != null) results.close()
    } catch {
      case e: Exception =>
        // Handle exceptions by logging or other means.
        e.printStackTrace()
        Array.empty[Array[Float]] // Return an empty array or appropriate error handling
    } finally {
      // Close tensors outside the try-catch to avoid repeated null checks.
      // These resources are initialized before the try-catch, so they should be closed here.
      tokenTensors.close()
      maskTensors.close()
      segmentTensors.close()
    }
  }

  private def getSentenceEmbeddingFromOv(
      batch: Seq[Array[Int]],
      maxSentenceLength: Int): Array[Array[Float]] = {
    val batchLength = batch.length
    val inputIds = batch.flatMap(x => x.map(x => x.toLong)).toArray
    val attentionMask = batch.map(sentence => sentence.map(x => if (x == 0L) 0L else 1L)).toArray

    val shape = Array(batchLength, maxSentenceLength)
    val tokenTensors = new org.intel.openvino.Tensor(shape, inputIds)
    val maskTensors = new org.intel.openvino.Tensor(shape, attentionMask.flatten)
    val segmentTensors =
      new org.intel.openvino.Tensor(shape, Array.fill(batchLength * maxSentenceLength)(0L))

    val model = openvinoWrapper.get.getCompiledModel()
    val inferRequest = model.create_infer_request()

    inferRequest.set_tensor("input_ids", tokenTensors)
    inferRequest.set_tensor("attention_mask", maskTensors)
    inferRequest.set_tensor("token_type_ids", segmentTensors)

    inferRequest.infer()

    val embeddings = inferRequest.get_tensor("last_hidden_state")

    val dim = embeddings.get_shape().map(_.toLong)
    val avgPooling =
      LinAlg.avgPooling(embeddings.data(), attentionMask, dim)
    val normalizedEmbeddings = LinAlg.l2Normalize(avgPooling)
    LinAlg.denseMatrixToArray(normalizedEmbeddings)
  }

  /** Predict sentence embeddings for a batch of sentences
    * @param sentences
    *   sentences
    * @param tokenizedSentences
    *   tokenized sentences
    * @param batchSize
    *   batch size
    * @param maxSentenceLength
    *   max sentence length
    * @return
    */
  def predict(
      sentences: Seq[Annotation],
      tokenizedSentences: Seq[WordpieceTokenizedSentence],
      batchSize: Int,
      maxSentenceLength: Int): Seq[Annotation] = {

    tokenizedSentences
      .zip(sentences)
      .zipWithIndex
      .grouped(batchSize)
      .toArray
      .flatMap { batch =>
        val tokensBatch = batch.map(x => x._1._1.tokens)
        val tokens = tokensBatch.map(x =>
          Array(sentenceStartTokenId) ++ x
            .map(y => y.pieceId)
            .take(maxSentenceLength - 2) ++ Array(sentenceEndTokenId))

        val sentenceEmbeddings = getSentenceEmbedding(tokens)

        batch.zip(sentenceEmbeddings).map { case (sentence, vectors) =>
          Annotation(
            annotatorType = AnnotatorType.SENTENCE_EMBEDDINGS,
            begin = sentence._1._2.begin,
            end = sentence._1._2.end,
            result = sentence._1._2.result,
            metadata = sentence._1._2.metadata,
            embeddings = vectors)
        }
      }
  }

}
