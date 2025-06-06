---
layout: model
title: Multilingual formality_classifier_mdeberta_v3_base_pipeline pipeline DeBertaForSequenceClassification from LenDigLearn
author: John Snow Labs
name: formality_classifier_mdeberta_v3_base_pipeline
date: 2025-02-06
tags: [xx, open_source, pipeline, onnx]
task: Text Classification
language: xx
edition: Spark NLP 5.5.1
spark_version: 3.0
supported: true
annotator: PipelineModel
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained DeBertaForSequenceClassification, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`formality_classifier_mdeberta_v3_base_pipeline` is a Multilingual model originally trained by LenDigLearn.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/formality_classifier_mdeberta_v3_base_pipeline_xx_5.5.1_3.0_1738874728533.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/formality_classifier_mdeberta_v3_base_pipeline_xx_5.5.1_3.0_1738874728533.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("formality_classifier_mdeberta_v3_base_pipeline", lang = "xx")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("formality_classifier_mdeberta_v3_base_pipeline", lang = "xx")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|formality_classifier_mdeberta_v3_base_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.1+|
|License:|Open Source|
|Edition:|Official|
|Language:|xx|
|Size:|815.0 MB|

## References

https://huggingface.co/LenDigLearn/formality-classifier-mdeberta-v3-base

## Included Models

- DocumentAssembler
- TokenizerModel
- DeBertaForSequenceClassification