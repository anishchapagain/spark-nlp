---
layout: model
title: English chonky_distilbert_base_uncased_1_pipeline pipeline DistilBertForTokenClassification from mirth
author: John Snow Labs
name: chonky_distilbert_base_uncased_1_pipeline
date: 2025-05-25
tags: [en, open_source, pipeline, onnx]
task: Named Entity Recognition
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

Pretrained DistilBertForTokenClassification, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`chonky_distilbert_base_uncased_1_pipeline` is a English model originally trained by mirth.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/chonky_distilbert_base_uncased_1_pipeline_en_5.5.1_3.0_1748182819529.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/chonky_distilbert_base_uncased_1_pipeline_en_5.5.1_3.0_1748182819529.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("chonky_distilbert_base_uncased_1_pipeline", lang = "en")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("chonky_distilbert_base_uncased_1_pipeline", lang = "en")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|chonky_distilbert_base_uncased_1_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.1+|
|License:|Open Source|
|Edition:|Official|
|Language:|en|
|Size:|247.3 MB|

## References

https://huggingface.co/mirth/chonky_distilbert_base_uncased_1

## Included Models

- DocumentAssembler
- TokenizerModel
- DistilBertForTokenClassification