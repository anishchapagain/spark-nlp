---
layout: model
title: Guarani sent_guaran_bert_small_cased_pipeline pipeline BertSentenceEmbeddings from mmaguero
author: John Snow Labs
name: sent_guaran_bert_small_cased_pipeline
date: 2025-04-05
tags: [gn, open_source, pipeline, onnx]
task: Embeddings
language: gn
edition: Spark NLP 5.5.1
spark_version: 3.0
supported: true
annotator: PipelineModel
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained BertSentenceEmbeddings, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`sent_guaran_bert_small_cased_pipeline` is a Guarani model originally trained by mmaguero.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/sent_guaran_bert_small_cased_pipeline_gn_5.5.1_3.0_1743823658609.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/sent_guaran_bert_small_cased_pipeline_gn_5.5.1_3.0_1743823658609.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("sent_guaran_bert_small_cased_pipeline", lang = "gn")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("sent_guaran_bert_small_cased_pipeline", lang = "gn")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|sent_guaran_bert_small_cased_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.1+|
|License:|Open Source|
|Edition:|Official|
|Language:|gn|
|Size:|247.8 MB|

## References

https://huggingface.co/mmaguero/gn-bert-small-cased

## Included Models

- DocumentAssembler
- TokenizerModel
- SentenceDetectorDLModel
- BertSentenceEmbeddings