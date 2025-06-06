---
layout: model
title: English vit_base_patch16_224_trial007_yel_stem_pipeline pipeline ViTForImageClassification from sbaner24
author: John Snow Labs
name: vit_base_patch16_224_trial007_yel_stem_pipeline
date: 2025-03-29
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

Pretrained ViTForImageClassification, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`vit_base_patch16_224_trial007_yel_stem_pipeline` is a English model originally trained by sbaner24.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/vit_base_patch16_224_trial007_yel_stem_pipeline_en_5.5.1_3.0_1743266846505.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/vit_base_patch16_224_trial007_yel_stem_pipeline_en_5.5.1_3.0_1743266846505.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("vit_base_patch16_224_trial007_yel_stem_pipeline", lang = "en")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("vit_base_patch16_224_trial007_yel_stem_pipeline", lang = "en")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|vit_base_patch16_224_trial007_yel_stem_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.1+|
|License:|Open Source|
|Edition:|Official|
|Language:|en|
|Size:|321.3 MB|

## References

https://huggingface.co/sbaner24/vit-base-patch16-224-Trial007-YEL_STEM

## Included Models

- ImageAssembler
- ViTForImageClassification