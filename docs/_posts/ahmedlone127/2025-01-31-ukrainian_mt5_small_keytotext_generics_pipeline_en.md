---
layout: model
title: English ukrainian_mt5_small_keytotext_generics_pipeline pipeline T5Transformer from iliushchenko
author: John Snow Labs
name: ukrainian_mt5_small_keytotext_generics_pipeline
date: 2025-01-31
tags: [en, open_source, pipeline, onnx]
task: [Question Answering, Summarization, Translation, Text Generation]
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

Pretrained T5Transformer, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`ukrainian_mt5_small_keytotext_generics_pipeline` is a English model originally trained by iliushchenko.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/ukrainian_mt5_small_keytotext_generics_pipeline_en_5.5.1_3.0_1738298949764.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/ukrainian_mt5_small_keytotext_generics_pipeline_en_5.5.1_3.0_1738298949764.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("ukrainian_mt5_small_keytotext_generics_pipeline", lang = "en")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("ukrainian_mt5_small_keytotext_generics_pipeline", lang = "en")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|ukrainian_mt5_small_keytotext_generics_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.1+|
|License:|Open Source|
|Edition:|Official|
|Language:|en|
|Size:|313.7 MB|

## References

https://huggingface.co/iliushchenko/uk-mt5-small-keytotext-generics

## Included Models

- DocumentAssembler
- T5Transformer