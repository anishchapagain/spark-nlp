---
layout: model
title: Arabic camelbert_msa_qalb15_ged_13_pipeline pipeline BertForTokenClassification from CAMeL-Lab
author: John Snow Labs
name: camelbert_msa_qalb15_ged_13_pipeline
date: 2024-11-10
tags: [ar, open_source, pipeline, onnx]
task: Named Entity Recognition
language: ar
edition: Spark NLP 5.5.1
spark_version: 3.0
supported: true
annotator: PipelineModel
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained BertForTokenClassification, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`camelbert_msa_qalb15_ged_13_pipeline` is a Arabic model originally trained by CAMeL-Lab.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/camelbert_msa_qalb15_ged_13_pipeline_ar_5.5.1_3.0_1731280281051.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/camelbert_msa_qalb15_ged_13_pipeline_ar_5.5.1_3.0_1731280281051.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("camelbert_msa_qalb15_ged_13_pipeline", lang = "ar")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("camelbert_msa_qalb15_ged_13_pipeline", lang = "ar")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|camelbert_msa_qalb15_ged_13_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.1+|
|License:|Open Source|
|Edition:|Official|
|Language:|ar|
|Size:|406.4 MB|

## References

https://huggingface.co/CAMeL-Lab/camelbert-msa-qalb15-ged-13

## Included Models

- DocumentAssembler
- TokenizerModel
- BertForTokenClassification