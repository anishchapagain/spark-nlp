---
layout: model
title: Hungarian sentiment_ohb3_xlm_roberta_hungarian_pipeline pipeline XlmRoBertaForSequenceClassification from NYTK
author: John Snow Labs
name: sentiment_ohb3_xlm_roberta_hungarian_pipeline
date: 2024-09-06
tags: [hu, open_source, pipeline, onnx]
task: Text Classification
language: hu
edition: Spark NLP 5.5.0
spark_version: 3.0
supported: true
annotator: PipelineModel
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained XlmRoBertaForSequenceClassification, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`sentiment_ohb3_xlm_roberta_hungarian_pipeline` is a Hungarian model originally trained by NYTK.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/sentiment_ohb3_xlm_roberta_hungarian_pipeline_hu_5.5.0_3.0_1725616265529.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/sentiment_ohb3_xlm_roberta_hungarian_pipeline_hu_5.5.0_3.0_1725616265529.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("sentiment_ohb3_xlm_roberta_hungarian_pipeline", lang = "hu")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("sentiment_ohb3_xlm_roberta_hungarian_pipeline", lang = "hu")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|sentiment_ohb3_xlm_roberta_hungarian_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.0+|
|License:|Open Source|
|Edition:|Official|
|Language:|hu|
|Size:|799.9 MB|

## References

https://huggingface.co/NYTK/sentiment-ohb3-xlm-roberta-hungarian

## Included Models

- DocumentAssembler
- TokenizerModel
- XlmRoBertaForSequenceClassification