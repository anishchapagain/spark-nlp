---
layout: model
title: English qa_redaction_nov1_19_a_pipeline pipeline XlmRoBertaForQuestionAnswering from prajwalJumde
author: John Snow Labs
name: qa_redaction_nov1_19_a_pipeline
date: 2024-12-15
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

Pretrained XlmRoBertaForQuestionAnswering, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`qa_redaction_nov1_19_a_pipeline` is a English model originally trained by prajwalJumde.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/qa_redaction_nov1_19_a_pipeline_en_5.5.1_3.0_1734231113212.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/qa_redaction_nov1_19_a_pipeline_en_5.5.1_3.0_1734231113212.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("qa_redaction_nov1_19_a_pipeline", lang = "en")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("qa_redaction_nov1_19_a_pipeline", lang = "en")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|qa_redaction_nov1_19_a_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.1+|
|License:|Open Source|
|Edition:|Official|
|Language:|en|
|Size:|797.0 MB|

## References

https://huggingface.co/prajwalJumde/QA_REDACTION_NOV1_19-a

## Included Models

- MultiDocumentAssembler
- XlmRoBertaForQuestionAnswering