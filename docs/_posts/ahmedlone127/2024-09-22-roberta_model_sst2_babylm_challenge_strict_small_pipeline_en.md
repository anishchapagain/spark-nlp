---
layout: model
title: English roberta_model_sst2_babylm_challenge_strict_small_pipeline pipeline RoBertaForSequenceClassification from TheBguy87
author: John Snow Labs
name: roberta_model_sst2_babylm_challenge_strict_small_pipeline
date: 2024-09-22
tags: [en, open_source, pipeline, onnx]
task: Text Classification
language: en
edition: Spark NLP 5.5.0
spark_version: 3.0
supported: true
annotator: PipelineModel
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained RoBertaForSequenceClassification, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`roberta_model_sst2_babylm_challenge_strict_small_pipeline` is a English model originally trained by TheBguy87.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/roberta_model_sst2_babylm_challenge_strict_small_pipeline_en_5.5.0_3.0_1727037316848.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/roberta_model_sst2_babylm_challenge_strict_small_pipeline_en_5.5.0_3.0_1727037316848.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("roberta_model_sst2_babylm_challenge_strict_small_pipeline", lang = "en")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("roberta_model_sst2_babylm_challenge_strict_small_pipeline", lang = "en")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|roberta_model_sst2_babylm_challenge_strict_small_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.0+|
|License:|Open Source|
|Edition:|Official|
|Language:|en|
|Size:|313.7 MB|

## References

https://huggingface.co/TheBguy87/roBERTa-Model-sst2-BabyLM-Challenge-Strict-Small

## Included Models

- DocumentAssembler
- TokenizerModel
- RoBertaForSequenceClassification