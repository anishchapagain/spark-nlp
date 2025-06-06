---
layout: model
title: Dutch, Flemish dutch_sarcasm_detector_pipeline pipeline BertForSequenceClassification from helinivan
author: John Snow Labs
name: dutch_sarcasm_detector_pipeline
date: 2025-04-09
tags: [nl, open_source, pipeline, onnx]
task: Text Classification
language: nl
edition: Spark NLP 5.5.1
spark_version: 3.0
supported: true
annotator: PipelineModel
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained BertForSequenceClassification, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`dutch_sarcasm_detector_pipeline` is a Dutch, Flemish model originally trained by helinivan.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/dutch_sarcasm_detector_pipeline_nl_5.5.1_3.0_1744180365077.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/dutch_sarcasm_detector_pipeline_nl_5.5.1_3.0_1744180365077.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("dutch_sarcasm_detector_pipeline", lang = "nl")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("dutch_sarcasm_detector_pipeline", lang = "nl")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|dutch_sarcasm_detector_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.1+|
|License:|Open Source|
|Edition:|Official|
|Language:|nl|
|Size:|409.1 MB|

## References

https://huggingface.co/helinivan/dutch-sarcasm-detector

## Included Models

- DocumentAssembler
- TokenizerModel
- BertForSequenceClassification