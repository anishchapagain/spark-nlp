---
layout: model
title: German bart_large_cnn_gnad_pipeline pipeline BartTransformer from Einmalumdiewelt
author: John Snow Labs
name: bart_large_cnn_gnad_pipeline
date: 2025-04-04
tags: [de, open_source, pipeline, onnx]
task: [Question Answering, Summarization, Translation, Text Generation]
language: de
edition: Spark NLP 5.5.1
spark_version: 3.0
supported: true
annotator: PipelineModel
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained BartTransformer, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`bart_large_cnn_gnad_pipeline` is a German model originally trained by Einmalumdiewelt.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/bart_large_cnn_gnad_pipeline_de_5.5.1_3.0_1743731401511.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/bart_large_cnn_gnad_pipeline_de_5.5.1_3.0_1743731401511.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("bart_large_cnn_gnad_pipeline", lang = "de")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("bart_large_cnn_gnad_pipeline", lang = "de")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|bart_large_cnn_gnad_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.1+|
|License:|Open Source|
|Edition:|Official|
|Language:|de|
|Size:|1.9 GB|

## References

https://huggingface.co/Einmalumdiewelt/BART_large_CNN_GNAD

## Included Models

- DocumentAssembler
- BartTransformer