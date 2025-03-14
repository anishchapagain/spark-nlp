---
layout: model
title: English tiny_random_t5forconditionalgeneration_trl_internal_testing_pipeline pipeline T5Transformer from trl-internal-testing
author: John Snow Labs
name: tiny_random_t5forconditionalgeneration_trl_internal_testing_pipeline
date: 2024-08-02
tags: [en, open_source, pipeline, onnx]
task: [Question Answering, Summarization, Translation, Text Generation]
language: en
edition: Spark NLP 5.4.2
spark_version: 3.0
supported: true
annotator: PipelineModel
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained T5Transformer, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`tiny_random_t5forconditionalgeneration_trl_internal_testing_pipeline` is a English model originally trained by trl-internal-testing.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/tiny_random_t5forconditionalgeneration_trl_internal_testing_pipeline_en_5.4.2_3.0_1722629223062.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/tiny_random_t5forconditionalgeneration_trl_internal_testing_pipeline_en_5.4.2_3.0_1722629223062.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("tiny_random_t5forconditionalgeneration_trl_internal_testing_pipeline", lang = "en")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("tiny_random_t5forconditionalgeneration_trl_internal_testing_pipeline", lang = "en")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|tiny_random_t5forconditionalgeneration_trl_internal_testing_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.4.2+|
|License:|Open Source|
|Edition:|Official|
|Language:|en|
|Size:|1.2 MB|

## References

https://huggingface.co/trl-internal-testing/tiny-random-T5ForConditionalGeneration

## Included Models

- DocumentAssembler
- T5Transformer