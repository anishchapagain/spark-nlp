---
layout: model
title: German schwurpert_pipeline pipeline BertEmbeddings from ausgerechnet
author: John Snow Labs
name: schwurpert_pipeline
date: 2025-04-02
tags: [de, open_source, pipeline, onnx]
task: Embeddings
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

Pretrained BertEmbeddings, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`schwurpert_pipeline` is a German model originally trained by ausgerechnet.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/schwurpert_pipeline_de_5.5.1_3.0_1743597987398.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/schwurpert_pipeline_de_5.5.1_3.0_1743597987398.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("schwurpert_pipeline", lang = "de")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("schwurpert_pipeline", lang = "de")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|schwurpert_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.1+|
|License:|Open Source|
|Edition:|Official|
|Language:|de|
|Size:|1.3 GB|

## References

https://huggingface.co/ausgerechnet/schwurpert

## Included Models

- DocumentAssembler
- TokenizerModel
- BertEmbeddings