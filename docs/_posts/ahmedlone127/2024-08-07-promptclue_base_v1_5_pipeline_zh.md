---
layout: model
title: Chinese promptclue_base_v1_5_pipeline pipeline T5Transformer from ClueAI
author: John Snow Labs
name: promptclue_base_v1_5_pipeline
date: 2024-08-07
tags: [zh, open_source, pipeline, onnx]
task: [Question Answering, Summarization, Translation, Text Generation]
language: zh
edition: Spark NLP 5.4.2
spark_version: 3.0
supported: true
annotator: PipelineModel
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained T5Transformer, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`promptclue_base_v1_5_pipeline` is a Chinese model originally trained by ClueAI.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/promptclue_base_v1_5_pipeline_zh_5.4.2_3.0_1723039021605.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/promptclue_base_v1_5_pipeline_zh_5.4.2_3.0_1723039021605.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("promptclue_base_v1_5_pipeline", lang = "zh")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("promptclue_base_v1_5_pipeline", lang = "zh")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|promptclue_base_v1_5_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.4.2+|
|License:|Open Source|
|Edition:|Official|
|Language:|zh|
|Size:|520.9 MB|

## References

https://huggingface.co/ClueAI/PromptCLUE-base-v1-5

## Included Models

- DocumentAssembler
- T5Transformer