---
layout: model
title: English vit_large_patch16_224_dungeon_geo_morphs_0_4_26nov24_005_pipeline pipeline ViTForImageClassification from griffio
author: John Snow Labs
name: vit_large_patch16_224_dungeon_geo_morphs_0_4_26nov24_005_pipeline
date: 2025-02-06
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

Pretrained ViTForImageClassification, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`vit_large_patch16_224_dungeon_geo_morphs_0_4_26nov24_005_pipeline` is a English model originally trained by griffio.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/vit_large_patch16_224_dungeon_geo_morphs_0_4_26nov24_005_pipeline_en_5.5.1_3.0_1738881638382.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/vit_large_patch16_224_dungeon_geo_morphs_0_4_26nov24_005_pipeline_en_5.5.1_3.0_1738881638382.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("vit_large_patch16_224_dungeon_geo_morphs_0_4_26nov24_005_pipeline", lang = "en")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("vit_large_patch16_224_dungeon_geo_morphs_0_4_26nov24_005_pipeline", lang = "en")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|vit_large_patch16_224_dungeon_geo_morphs_0_4_26nov24_005_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.1+|
|License:|Open Source|
|Edition:|Official|
|Language:|en|
|Size:|1.1 GB|

## References

https://huggingface.co/griffio/vit-large-patch16-224-dungeon-geo-morphs-0-4-26Nov24-005

## Included Models

- ImageAssembler
- ViTForImageClassification