---
layout: model
title: English clip_large_fp16_pipeline pipeline CLIPForZeroShotClassification from dahwinsingularity
author: John Snow Labs
name: clip_large_fp16_pipeline
date: 2024-09-05
tags: [en, open_source, pipeline, onnx]
task: Zero-Shot Classification
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

Pretrained CLIPForZeroShotClassification, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`clip_large_fp16_pipeline` is a English model originally trained by dahwinsingularity.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/clip_large_fp16_pipeline_en_5.5.0_3.0_1725523747363.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/clip_large_fp16_pipeline_en_5.5.0_3.0_1725523747363.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("clip_large_fp16_pipeline", lang = "en")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("clip_large_fp16_pipeline", lang = "en")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|clip_large_fp16_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.0+|
|License:|Open Source|
|Edition:|Official|
|Language:|en|
|Size:|1.0 GB|

## References

https://huggingface.co/dahwinsingularity/clip_large_fp16

## Included Models

- ImageAssembler
- CLIPForZeroShotClassification