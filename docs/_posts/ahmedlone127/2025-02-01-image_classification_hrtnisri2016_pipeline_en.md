---
layout: model
title: English image_classification_hrtnisri2016_pipeline pipeline ViTForImageClassification from hrtnisri2016
author: John Snow Labs
name: image_classification_hrtnisri2016_pipeline
date: 2025-02-01
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

Pretrained ViTForImageClassification, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`image_classification_hrtnisri2016_pipeline` is a English model originally trained by hrtnisri2016.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/image_classification_hrtnisri2016_pipeline_en_5.5.1_3.0_1738377899774.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/image_classification_hrtnisri2016_pipeline_en_5.5.1_3.0_1738377899774.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("image_classification_hrtnisri2016_pipeline", lang = "en")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("image_classification_hrtnisri2016_pipeline", lang = "en")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|image_classification_hrtnisri2016_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.1+|
|License:|Open Source|
|Edition:|Official|
|Language:|en|
|Size:|321.3 MB|

## References

https://huggingface.co/hrtnisri2016/image_classification

## Included Models

- ImageAssembler
- ViTForImageClassification