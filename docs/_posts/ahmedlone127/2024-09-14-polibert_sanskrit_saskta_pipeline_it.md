---
layout: model
title: Italian polibert_sanskrit_saskta_pipeline pipeline BertForSequenceClassification from gbarone77
author: John Snow Labs
name: polibert_sanskrit_saskta_pipeline
date: 2024-09-14
tags: [it, open_source, pipeline, onnx]
task: Text Classification
language: it
edition: Spark NLP 5.5.0
spark_version: 3.0
supported: true
annotator: PipelineModel
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained BertForSequenceClassification, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`polibert_sanskrit_saskta_pipeline` is a Italian model originally trained by gbarone77.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/polibert_sanskrit_saskta_pipeline_it_5.5.0_3.0_1726347731679.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/polibert_sanskrit_saskta_pipeline_it_5.5.0_3.0_1726347731679.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("polibert_sanskrit_saskta_pipeline", lang = "it")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("polibert_sanskrit_saskta_pipeline", lang = "it")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|polibert_sanskrit_saskta_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.0+|
|License:|Open Source|
|Edition:|Official|
|Language:|it|
|Size:|414.8 MB|

## References

https://huggingface.co/gbarone77/polibert_sa

## Included Models

- DocumentAssembler
- TokenizerModel
- BertForSequenceClassification