---
layout: model
title: Hebrew dictabert_chechen_pipeline pipeline BertForSequenceClassification from haguy77
author: John Snow Labs
name: dictabert_chechen_pipeline
date: 2025-02-01
tags: [he, open_source, pipeline, onnx]
task: Text Classification
language: he
edition: Spark NLP 5.5.1
spark_version: 3.0
supported: true
annotator: PipelineModel
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained BertForSequenceClassification, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`dictabert_chechen_pipeline` is a Hebrew model originally trained by haguy77.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/dictabert_chechen_pipeline_he_5.5.1_3.0_1738392782012.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/dictabert_chechen_pipeline_he_5.5.1_3.0_1738392782012.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("dictabert_chechen_pipeline", lang = "he")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("dictabert_chechen_pipeline", lang = "he")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|dictabert_chechen_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.1+|
|License:|Open Source|
|Edition:|Official|
|Language:|he|
|Size:|678.6 MB|

## References

https://huggingface.co/haguy77/dictabert-ce

## Included Models

- DocumentAssembler
- TokenizerModel
- BertForSequenceClassification