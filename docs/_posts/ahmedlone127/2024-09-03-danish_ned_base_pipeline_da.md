---
layout: model
title: Danish danish_ned_base_pipeline pipeline XlmRoBertaForSequenceClassification from alexandrainst
author: John Snow Labs
name: danish_ned_base_pipeline
date: 2024-09-03
tags: [da, open_source, pipeline, onnx]
task: Text Classification
language: da
edition: Spark NLP 5.5.0
spark_version: 3.0
supported: true
annotator: PipelineModel
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained XlmRoBertaForSequenceClassification, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`danish_ned_base_pipeline` is a Danish model originally trained by alexandrainst.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/danish_ned_base_pipeline_da_5.5.0_3.0_1725395385865.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/danish_ned_base_pipeline_da_5.5.0_3.0_1725395385865.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("danish_ned_base_pipeline", lang = "da")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("danish_ned_base_pipeline", lang = "da")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|danish_ned_base_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.0+|
|License:|Open Source|
|Edition:|Official|
|Language:|da|
|Size:|881.6 MB|

## References

https://huggingface.co/alexandrainst/da-ned-base

## Included Models

- DocumentAssembler
- TokenizerModel
- XlmRoBertaForSequenceClassification