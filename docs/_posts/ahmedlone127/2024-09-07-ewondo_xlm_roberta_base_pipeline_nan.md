---
layout: model
title: None ewondo_xlm_roberta_base_pipeline pipeline XlmRoBertaEmbeddings from ELRs
author: John Snow Labs
name: ewondo_xlm_roberta_base_pipeline
date: 2024-09-07
tags: [nan, open_source, pipeline, onnx]
task: Embeddings
language: nan
edition: Spark NLP 5.5.0
spark_version: 3.0
supported: true
annotator: PipelineModel
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained XlmRoBertaEmbeddings, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`ewondo_xlm_roberta_base_pipeline` is a None model originally trained by ELRs.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/ewondo_xlm_roberta_base_pipeline_nan_5.5.0_3.0_1725677515205.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/ewondo_xlm_roberta_base_pipeline_nan_5.5.0_3.0_1725677515205.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("ewondo_xlm_roberta_base_pipeline", lang = "nan")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("ewondo_xlm_roberta_base_pipeline", lang = "nan")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|ewondo_xlm_roberta_base_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.0+|
|License:|Open Source|
|Edition:|Official|
|Language:|nan|
|Size:|1.0 GB|

## References

https://huggingface.co/ELRs/Ewondo_xlm-roberta-base

## Included Models

- DocumentAssembler
- TokenizerModel
- XlmRoBertaEmbeddings