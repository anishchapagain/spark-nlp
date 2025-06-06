---
layout: model
title: Telugu sent_telugu_bertu_pipeline pipeline BertSentenceEmbeddings from kuppuluri
author: John Snow Labs
name: sent_telugu_bertu_pipeline
date: 2024-09-07
tags: [te, open_source, pipeline, onnx]
task: Embeddings
language: te
edition: Spark NLP 5.5.0
spark_version: 3.0
supported: true
annotator: PipelineModel
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained BertSentenceEmbeddings, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`sent_telugu_bertu_pipeline` is a Telugu model originally trained by kuppuluri.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/sent_telugu_bertu_pipeline_te_5.5.0_3.0_1725700998383.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/sent_telugu_bertu_pipeline_te_5.5.0_3.0_1725700998383.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("sent_telugu_bertu_pipeline", lang = "te")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("sent_telugu_bertu_pipeline", lang = "te")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|sent_telugu_bertu_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.0+|
|License:|Open Source|
|Edition:|Official|
|Language:|te|
|Size:|413.1 MB|

## References

https://huggingface.co/kuppuluri/telugu_bertu

## Included Models

- DocumentAssembler
- TokenizerModel
- SentenceDetectorDLModel
- BertSentenceEmbeddings