---
layout: model
title: English bert_qa_xtremedistil_l6_h256_uncased_tquad_finetuned_lr_2e_05_epochs_9 BertForQuestionAnswering from husnu
author: John Snow Labs
name: bert_qa_xtremedistil_l6_h256_uncased_tquad_finetuned_lr_2e_05_epochs_9
date: 2023-11-16
tags: [bert, en, open_source, question_answering, onnx]
task: Question Answering
language: en
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

Pretrained BertForQuestionAnswering model, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`bert_qa_xtremedistil_l6_h256_uncased_tquad_finetuned_lr_2e_05_epochs_9` is a English model originally trained by husnu.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/bert_qa_xtremedistil_l6_h256_uncased_tquad_finetuned_lr_2e_05_epochs_9_en_5.2.0_3.0_1700171301368.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/bert_qa_xtremedistil_l6_h256_uncased_tquad_finetuned_lr_2e_05_epochs_9_en_5.2.0_3.0_1700171301368.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python


document_assembler = MultiDocumentAssembler() \
    .setInputCol(["question", "context"]) \
    .setOutputCol(["document_question", "document_context"])
    
    
spanClassifier = BertForQuestionAnswering.pretrained("bert_qa_xtremedistil_l6_h256_uncased_tquad_finetuned_lr_2e_05_epochs_9","en") \
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
    .pretrained("bert_qa_xtremedistil_l6_h256_uncased_tquad_finetuned_lr_2e_05_epochs_9", "en")
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
|Model Name:|bert_qa_xtremedistil_l6_h256_uncased_tquad_finetuned_lr_2e_05_epochs_9|
|Compatibility:|Spark NLP 5.2.0+|
|License:|Open Source|
|Edition:|Official|
|Input Labels:|[sentence, token]|
|Output Labels:|[embeddings]|
|Language:|en|
|Size:|47.3 MB|
|Case sensitive:|false|
|Max sentence length:|512|

## References

https://huggingface.co/husnu/xtremedistil-l6-h256-uncased-TQUAD-finetuned_lr-2e-05_epochs-9