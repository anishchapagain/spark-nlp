---
layout: model
title: English argureviews_sentiment_roberta_v1_pipeline pipeline XlmRoBertaForSequenceClassification from nihiluis
author: John Snow Labs
name: argureviews_sentiment_roberta_v1_pipeline
date: 2024-09-07
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

Pretrained XlmRoBertaForSequenceClassification, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`argureviews_sentiment_roberta_v1_pipeline` is a English model originally trained by nihiluis.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/argureviews_sentiment_roberta_v1_pipeline_en_5.5.0_3.0_1725713061496.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/argureviews_sentiment_roberta_v1_pipeline_en_5.5.0_3.0_1725713061496.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("argureviews_sentiment_roberta_v1_pipeline", lang = "en")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("argureviews_sentiment_roberta_v1_pipeline", lang = "en")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|argureviews_sentiment_roberta_v1_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.0+|
|License:|Open Source|
|Edition:|Official|
|Language:|en|
|Size:|834.2 MB|

## References

https://huggingface.co/nihiluis/argureviews-sentiment-roberta_v1

## Included Models

- DocumentAssembler
- TokenizerModel
- XlmRoBertaForSequenceClassification