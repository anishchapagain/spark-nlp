---
layout: model
title: English oxford_pets_vit_from_scratch_shikun_pipeline pipeline ViTForImageClassification from Shikun
author: John Snow Labs
name: oxford_pets_vit_from_scratch_shikun_pipeline
date: 2025-01-31
tags: [en, open_source, pipeline, onnx]
task: Image Classification
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

Pretrained ViTForImageClassification, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`oxford_pets_vit_from_scratch_shikun_pipeline` is a English model originally trained by Shikun.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/oxford_pets_vit_from_scratch_shikun_pipeline_en_5.5.1_3.0_1738319289861.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/oxford_pets_vit_from_scratch_shikun_pipeline_en_5.5.1_3.0_1738319289861.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("oxford_pets_vit_from_scratch_shikun_pipeline", lang = "en")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("oxford_pets_vit_from_scratch_shikun_pipeline", lang = "en")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|oxford_pets_vit_from_scratch_shikun_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.1+|
|License:|Open Source|
|Edition:|Official|
|Language:|en|
|Size:|20.8 MB|

## References

https://huggingface.co/Shikun/oxford-pets-vit-from-scratch

## Included Models

- ImageAssembler
- ViTForImageClassification