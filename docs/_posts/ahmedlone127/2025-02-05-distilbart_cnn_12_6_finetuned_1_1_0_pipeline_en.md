---
layout: model
title: English distilbart_cnn_12_6_finetuned_1_1_0_pipeline pipeline BartTransformer from jamesesguerra
author: John Snow Labs
name: distilbart_cnn_12_6_finetuned_1_1_0_pipeline
date: 2025-02-05
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

Pretrained BartTransformer, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`distilbart_cnn_12_6_finetuned_1_1_0_pipeline` is a English model originally trained by jamesesguerra.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/distilbart_cnn_12_6_finetuned_1_1_0_pipeline_en_5.5.1_3.0_1738720832106.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/distilbart_cnn_12_6_finetuned_1_1_0_pipeline_en_5.5.1_3.0_1738720832106.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("distilbart_cnn_12_6_finetuned_1_1_0_pipeline", lang = "en")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("distilbart_cnn_12_6_finetuned_1_1_0_pipeline", lang = "en")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|distilbart_cnn_12_6_finetuned_1_1_0_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.1+|
|License:|Open Source|
|Edition:|Official|
|Language:|en|
|Size:|1.5 GB|

## References

https://huggingface.co/jamesesguerra/distilbart-cnn-12-6-finetuned-1.1.0

## Included Models

- DocumentAssembler
- BartTransformer