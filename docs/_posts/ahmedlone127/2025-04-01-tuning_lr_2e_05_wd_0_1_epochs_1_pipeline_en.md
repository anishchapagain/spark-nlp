---
layout: model
title: English tuning_lr_2e_05_wd_0_1_epochs_1_pipeline pipeline DistilBertForSequenceClassification from ash-akjp-ga
author: John Snow Labs
name: tuning_lr_2e_05_wd_0_1_epochs_1_pipeline
date: 2025-04-01
tags: [en, open_source, pipeline, onnx]
task: Text Classification
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

Pretrained DistilBertForSequenceClassification, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`tuning_lr_2e_05_wd_0_1_epochs_1_pipeline` is a English model originally trained by ash-akjp-ga.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/tuning_lr_2e_05_wd_0_1_epochs_1_pipeline_en_5.5.1_3.0_1743525709291.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/tuning_lr_2e_05_wd_0_1_epochs_1_pipeline_en_5.5.1_3.0_1743525709291.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("tuning_lr_2e_05_wd_0_1_epochs_1_pipeline", lang = "en")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("tuning_lr_2e_05_wd_0_1_epochs_1_pipeline", lang = "en")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|tuning_lr_2e_05_wd_0_1_epochs_1_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.1+|
|License:|Open Source|
|Edition:|Official|
|Language:|en|
|Size:|252.6 MB|

## References

https://huggingface.co/ash-akjp-ga/tuning_lr_2e-05_wd_0.1_epochs_1

## Included Models

- DocumentAssembler
- TokenizerModel
- DistilBertForSequenceClassification