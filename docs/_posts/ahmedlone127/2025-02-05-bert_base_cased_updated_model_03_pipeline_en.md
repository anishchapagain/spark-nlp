---
layout: model
title: English bert_base_cased_updated_model_03_pipeline pipeline BertForQuestionAnswering from Naima12
author: John Snow Labs
name: bert_base_cased_updated_model_03_pipeline
date: 2025-02-05
tags: [en, open_source, pipeline, onnx]
task: Question Answering
language: en
edition: Spark NLP 5.5.1
spark_version: 3.0
supported: true
annotator: PipelineModel
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained BertForQuestionAnswering, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`bert_base_cased_updated_model_03_pipeline` is a English model originally trained by Naima12.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/bert_base_cased_updated_model_03_pipeline_en_5.5.1_3.0_1738789887165.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/bert_base_cased_updated_model_03_pipeline_en_5.5.1_3.0_1738789887165.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("bert_base_cased_updated_model_03_pipeline", lang = "en")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("bert_base_cased_updated_model_03_pipeline", lang = "en")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|bert_base_cased_updated_model_03_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.1+|
|License:|Open Source|
|Edition:|Official|
|Language:|en|
|Size:|403.7 MB|

## References

https://huggingface.co/Naima12/Bert-base-cased-Updated-Model_03

## Included Models

- MultiDocumentAssembler
- BertForQuestionAnswering