---
layout: model
title: English distilbart_cnn_12_6_summarization_final_labeled_data_pipeline pipeline BartTransformer from varun500
author: John Snow Labs
name: distilbart_cnn_12_6_summarization_final_labeled_data_pipeline
date: 2025-02-06
tags: [en, open_source, pipeline, onnx]
task: [Question Answering, Summarization, Translation, Text Generation]
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

Pretrained BartTransformer, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`distilbart_cnn_12_6_summarization_final_labeled_data_pipeline` is a English model originally trained by varun500.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/distilbart_cnn_12_6_summarization_final_labeled_data_pipeline_en_5.5.1_3.0_1738851512866.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/distilbart_cnn_12_6_summarization_final_labeled_data_pipeline_en_5.5.1_3.0_1738851512866.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("distilbart_cnn_12_6_summarization_final_labeled_data_pipeline", lang = "en")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("distilbart_cnn_12_6_summarization_final_labeled_data_pipeline", lang = "en")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|distilbart_cnn_12_6_summarization_final_labeled_data_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.1+|
|License:|Open Source|
|Edition:|Official|
|Language:|en|
|Size:|1.5 GB|

## References

https://huggingface.co/varun500/distilbart-cnn-12-6-summarization_final_labeled_data

## Included Models

- DocumentAssembler
- BartTransformer