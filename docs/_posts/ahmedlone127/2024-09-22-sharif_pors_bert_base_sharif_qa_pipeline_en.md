---
layout: model
title: English sharif_pors_bert_base_sharif_qa_pipeline pipeline BertForQuestionAnswering from parsi-ai-nlpclass
author: John Snow Labs
name: sharif_pors_bert_base_sharif_qa_pipeline
date: 2024-09-22
tags: [en, open_source, pipeline, onnx]
task: Question Answering
language: en
edition: Spark NLP 5.5.0
spark_version: 3.0
supported: true
annotator: PipelineModel
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained BertForQuestionAnswering, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`sharif_pors_bert_base_sharif_qa_pipeline` is a English model originally trained by parsi-ai-nlpclass.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/sharif_pors_bert_base_sharif_qa_pipeline_en_5.5.0_3.0_1727042513072.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/sharif_pors_bert_base_sharif_qa_pipeline_en_5.5.0_3.0_1727042513072.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("sharif_pors_bert_base_sharif_qa_pipeline", lang = "en")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("sharif_pors_bert_base_sharif_qa_pipeline", lang = "en")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|sharif_pors_bert_base_sharif_qa_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.0+|
|License:|Open Source|
|Edition:|Official|
|Language:|en|
|Size:|606.5 MB|

## References

https://huggingface.co/parsi-ai-nlpclass/Sharif-Pors-bert-base-sharif-qa

## Included Models

- MultiDocumentAssembler
- BertForQuestionAnswering