---
layout: model
title: Turkish BertForQuestionAnswering Cased model (from Aybars)
author: John Snow Labs
name: bert_qa_modelontquad
date: 2023-11-14
tags: [tr, open_source, bert, question_answering, onnx]
task: Question Answering
language: tr
edition: Spark NLP 5.2.0
spark_version: 3.0
supported: true
engine: onnx
annotator: BertForQuestionAnswering
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained Question Answering model, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP. `ModelOnTquad` is a Turkish model originally trained by `Aybars`.

## Predicted Entities



{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/bert_qa_modelontquad_tr_5.2.0_3.0_1700003570293.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/bert_qa_modelontquad_tr_5.2.0_3.0_1700003570293.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python
documentAssembler = MultiDocumentAssembler() \
    .setInputCols(["question", "context"]) \
    .setOutputCols(["document_question", "document_context"])

spanClassifier = BertForQuestionAnswering.pretrained("bert_qa_modelontquad","tr") \
    .setInputCols(["document_question", "document_context"]) \
    .setOutputCol("answer")\
    .setCaseSensitive(True)
    
pipeline = Pipeline(stages=[documentAssembler, spanClassifier])

data = spark.createDataFrame([["Benim adım ne?", "Benim adım Clara ve Berkeley'de yaşıyorum."]]).toDF("question", "context")

result = pipeline.fit(data).transform(data)
```
```scala
val documentAssembler = new MultiDocumentAssembler() 
      .setInputCols(Array("question", "context")) 
      .setOutputCols(Array("document_question", "document_context"))
 
val spanClassifer = BertForQuestionAnswering.pretrained("bert_qa_modelontquad","tr") 
    .setInputCols(Array("document", "token")) 
    .setOutputCol("answer")
    .setCaseSensitive(true)

val pipeline = new Pipeline().setStages(Array(documentAssembler, spanClassifier))

val data = Seq("Benim adım ne?", "Benim adım Clara ve Berkeley'de yaşıyorum.").toDF("question", "context")

val result = pipeline.fit(data).transform(data)
```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|bert_qa_modelontquad|
|Compatibility:|Spark NLP 5.2.0+|
|License:|Open Source|
|Edition:|Official|
|Input Labels:|[document_question, document_context]|
|Output Labels:|[answer]|
|Language:|tr|
|Size:|688.9 MB|
|Case sensitive:|true|
|Max sentence length:|512|

## References

References

- https://huggingface.co/Aybars/ModelOnTquad