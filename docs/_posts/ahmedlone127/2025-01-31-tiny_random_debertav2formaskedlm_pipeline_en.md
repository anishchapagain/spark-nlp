---
layout: model
title: English tiny_random_debertav2formaskedlm_pipeline pipeline BertEmbeddings from hf-tiny-model-private
author: John Snow Labs
name: tiny_random_debertav2formaskedlm_pipeline
date: 2025-01-31
tags: [en, open_source, pipeline, onnx]
task: Embeddings
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

Pretrained BertEmbeddings, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`tiny_random_debertav2formaskedlm_pipeline` is a English model originally trained by hf-tiny-model-private.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/tiny_random_debertav2formaskedlm_pipeline_en_5.5.1_3.0_1738351074220.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/tiny_random_debertav2formaskedlm_pipeline_en_5.5.1_3.0_1738351074220.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("tiny_random_debertav2formaskedlm_pipeline", lang = "en")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("tiny_random_debertav2formaskedlm_pipeline", lang = "en")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|tiny_random_debertav2formaskedlm_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.1+|
|License:|Open Source|
|Edition:|Official|
|Language:|en|
|Size:|17.0 MB|

## References

https://huggingface.co/hf-tiny-model-private/tiny-random-DebertaV2ForMaskedLM

## Included Models

- DocumentAssembler
- TokenizerModel
- BertEmbeddings