---
layout: model
title: Korean sent_korean_albert_base_v1_pipeline pipeline BertSentenceEmbeddings from lots-o
author: John Snow Labs
name: sent_korean_albert_base_v1_pipeline
date: 2024-09-21
tags: [ko, open_source, pipeline, onnx]
task: Embeddings
language: ko
edition: Spark NLP 5.5.0
spark_version: 3.0
supported: true
annotator: PipelineModel
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained BertSentenceEmbeddings, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`sent_korean_albert_base_v1_pipeline` is a Korean model originally trained by lots-o.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/sent_korean_albert_base_v1_pipeline_ko_5.5.0_3.0_1726941866082.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/sent_korean_albert_base_v1_pipeline_ko_5.5.0_3.0_1726941866082.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("sent_korean_albert_base_v1_pipeline", lang = "ko")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("sent_korean_albert_base_v1_pipeline", lang = "ko")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|sent_korean_albert_base_v1_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.0+|
|License:|Open Source|
|Edition:|Official|
|Language:|ko|
|Size:|48.3 MB|

## References

https://huggingface.co/lots-o/ko-albert-base-v1

## Included Models

- DocumentAssembler
- TokenizerModel
- SentenceDetectorDLModel
- BertSentenceEmbeddings