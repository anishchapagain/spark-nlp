---
layout: model
title: English wlhb_english_chinese_marian_1_pipeline pipeline MarianTransformer from Goshective
author: John Snow Labs
name: wlhb_english_chinese_marian_1_pipeline
date: 2024-12-17
tags: [en, open_source, pipeline, onnx]
task: Translation
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

Pretrained MarianTransformer, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`wlhb_english_chinese_marian_1_pipeline` is a English model originally trained by Goshective.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/wlhb_english_chinese_marian_1_pipeline_en_5.5.1_3.0_1734408934012.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/wlhb_english_chinese_marian_1_pipeline_en_5.5.1_3.0_1734408934012.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("wlhb_english_chinese_marian_1_pipeline", lang = "en")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("wlhb_english_chinese_marian_1_pipeline", lang = "en")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|wlhb_english_chinese_marian_1_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.1+|
|License:|Open Source|
|Edition:|Official|
|Language:|en|
|Size:|541.5 MB|

## References

https://huggingface.co/Goshective/wlhb_en_zh_marian_1

## Included Models

- DocumentAssembler
- SentenceDetectorDLModel
- MarianTransformer