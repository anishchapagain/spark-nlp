---
layout: model
title: English sentiment_analysis_model1_pipeline pipeline DistilBertForSequenceClassification from dharanesh21114
author: John Snow Labs
name: sentiment_analysis_model1_pipeline
date: 2025-03-30
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

Pretrained DistilBertForSequenceClassification, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`sentiment_analysis_model1_pipeline` is a English model originally trained by dharanesh21114.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/sentiment_analysis_model1_pipeline_en_5.5.1_3.0_1743320427276.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/sentiment_analysis_model1_pipeline_en_5.5.1_3.0_1743320427276.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("sentiment_analysis_model1_pipeline", lang = "en")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("sentiment_analysis_model1_pipeline", lang = "en")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|sentiment_analysis_model1_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.1+|
|License:|Open Source|
|Edition:|Official|
|Language:|en|
|Size:|249.5 MB|

## References

https://huggingface.co/dharanesh21114/sentiment-analysis-model1

## Included Models

- DocumentAssembler
- TokenizerModel
- DistilBertForSequenceClassification