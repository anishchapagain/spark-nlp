---
layout: model
title: English dataequity_kde4_english_spanish_qlora_pipeline pipeline MarianTransformer from dataequity
author: John Snow Labs
name: dataequity_kde4_english_spanish_qlora_pipeline
date: 2024-09-05
tags: [en, open_source, pipeline, onnx]
task: Translation
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

Pretrained MarianTransformer, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`dataequity_kde4_english_spanish_qlora_pipeline` is a English model originally trained by dataequity.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/dataequity_kde4_english_spanish_qlora_pipeline_en_5.5.0_3.0_1725546302764.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/dataequity_kde4_english_spanish_qlora_pipeline_en_5.5.0_3.0_1725546302764.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("dataequity_kde4_english_spanish_qlora_pipeline", lang = "en")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("dataequity_kde4_english_spanish_qlora_pipeline", lang = "en")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|dataequity_kde4_english_spanish_qlora_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.0+|
|License:|Open Source|
|Edition:|Official|
|Language:|en|
|Size:|342.6 MB|

## References

https://huggingface.co/dataequity/dataequity-kde4-en-es-qlora

## Included Models

- DocumentAssembler
- SentenceDetectorDLModel
- MarianTransformer