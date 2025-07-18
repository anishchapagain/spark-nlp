---
layout: model
title: English persian_xlm_roberta_large_pipeline pipeline XlmRoBertaForQuestionAnswering from pedramyazdipoor
author: John Snow Labs
name: persian_xlm_roberta_large_pipeline
date: 2025-05-21
tags: [en, open_source, pipeline, onnx]
task: Question Answering
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

Pretrained XlmRoBertaForQuestionAnswering, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`persian_xlm_roberta_large_pipeline` is a English model originally trained by pedramyazdipoor.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/persian_xlm_roberta_large_pipeline_en_5.5.1_3.0_1747822746377.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/persian_xlm_roberta_large_pipeline_en_5.5.1_3.0_1747822746377.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("persian_xlm_roberta_large_pipeline", lang = "en")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("persian_xlm_roberta_large_pipeline", lang = "en")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|persian_xlm_roberta_large_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.1+|
|License:|Open Source|
|Edition:|Official|
|Language:|en|
|Size:|1.9 GB|

## References

https://huggingface.co/pedramyazdipoor/persian_xlm_roberta_large

## Included Models

- MultiDocumentAssembler
- XlmRoBertaForQuestionAnswering