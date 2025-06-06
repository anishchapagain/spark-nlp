---
layout: model
title: Multilingual bert_qa_mbert_finetuned_mlqa_chinese_hindi_dev BertForQuestionAnswering from roshnir
author: John Snow Labs
name: bert_qa_mbert_finetuned_mlqa_chinese_hindi_dev
date: 2023-11-15
tags: [bert, xx, open_source, question_answering, onnx]
task: Question Answering
language: xx
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

Pretrained BertForQuestionAnswering model, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`bert_qa_mbert_finetuned_mlqa_chinese_hindi_dev` is a Multilingual model originally trained by roshnir.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/bert_qa_mbert_finetuned_mlqa_chinese_hindi_dev_xx_5.2.0_3.0_1700007162317.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/bert_qa_mbert_finetuned_mlqa_chinese_hindi_dev_xx_5.2.0_3.0_1700007162317.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python


document_assembler = MultiDocumentAssembler() \
    .setInputCol(["question", "context"]) \
    .setOutputCol(["document_question", "document_context"])
    
    
spanClassifier = BertForQuestionAnswering.pretrained("bert_qa_mbert_finetuned_mlqa_chinese_hindi_dev","xx") \
            .setInputCols(["document_question","document_context"]) \
            .setOutputCol("answer")

pipeline = Pipeline().setStages([document_assembler, spanClassifier])

pipelineModel = pipeline.fit(data)

pipelineDF = pipelineModel.transform(data)

```
```scala


val document_assembler = new MultiDocumentAssembler()
    .setInputCol(Array("question", "context")) 
    .setOutputCol(Array("document_question", "document_context"))
    
val spanClassifier = BertForQuestionAnswering  
    .pretrained("bert_qa_mbert_finetuned_mlqa_chinese_hindi_dev", "xx")
    .setInputCols(Array("document_question","document_context")) 
    .setOutputCol("answer") 

val pipeline = new Pipeline().setStages(Array(document_assembler, spanClassifier))

val pipelineModel = pipeline.fit(data)

val pipelineDF = pipelineModel.transform(data)


```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|bert_qa_mbert_finetuned_mlqa_chinese_hindi_dev|
|Compatibility:|Spark NLP 5.2.0+|
|License:|Open Source|
|Edition:|Official|
|Input Labels:|[document_question, document_context]|
|Output Labels:|[answer]|
|Language:|xx|
|Size:|625.5 MB|

## References

https://huggingface.co/roshnir/mBert-finetuned-mlqa-dev-zh-hi