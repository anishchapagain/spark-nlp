---
layout: model
title: Hebrew het5_base_pipeline pipeline T5Transformer from imvladikon
author: John Snow Labs
name: het5_base_pipeline
date: 2024-08-19
tags: [he, open_source, pipeline, onnx]
task: [Question Answering, Summarization, Translation, Text Generation]
language: he
edition: Spark NLP 5.4.2
spark_version: 3.0
supported: true
annotator: PipelineModel
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained T5Transformer, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`het5_base_pipeline` is a Hebrew model originally trained by imvladikon.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/het5_base_pipeline_he_5.4.2_3.0_1724037064457.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/het5_base_pipeline_he_5.4.2_3.0_1724037064457.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("het5_base_pipeline", lang = "he")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("het5_base_pipeline", lang = "he")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|het5_base_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.4.2+|
|License:|Open Source|
|Edition:|Official|
|Language:|he|
|Size:|511.6 MB|

## References

https://huggingface.co/imvladikon/het5-base

## Included Models

- DocumentAssembler
- T5Transformer