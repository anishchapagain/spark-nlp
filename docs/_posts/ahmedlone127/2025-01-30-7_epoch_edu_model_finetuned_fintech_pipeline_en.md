---
layout: model
title: English 7_epoch_edu_model_finetuned_fintech_pipeline pipeline BertEmbeddings from Pastushoc
author: John Snow Labs
name: 7_epoch_edu_model_finetuned_fintech_pipeline
date: 2025-01-30
tags: [en, open_source, pipeline, onnx]
task: Embeddings
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

Pretrained BertEmbeddings, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`7_epoch_edu_model_finetuned_fintech_pipeline` is a English model originally trained by Pastushoc.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/7_epoch_edu_model_finetuned_fintech_pipeline_en_5.5.1_3.0_1738200075923.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/7_epoch_edu_model_finetuned_fintech_pipeline_en_5.5.1_3.0_1738200075923.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("7_epoch_edu_model_finetuned_fintech_pipeline", lang = "en")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("7_epoch_edu_model_finetuned_fintech_pipeline", lang = "en")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|7_epoch_edu_model_finetuned_fintech_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.1+|
|License:|Open Source|
|Edition:|Official|
|Language:|en|
|Size:|108.8 MB|

## References

https://huggingface.co/Pastushoc/7_epoch_edu_model-finetuned-fintech

## Included Models

- DocumentAssembler
- TokenizerModel
- BertEmbeddings