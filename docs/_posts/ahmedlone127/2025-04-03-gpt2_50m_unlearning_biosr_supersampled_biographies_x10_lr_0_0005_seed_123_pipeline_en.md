---
layout: model
title: English gpt2_50m_unlearning_biosr_supersampled_biographies_x10_lr_0_0005_seed_123_pipeline pipeline GPT2Transformer from akrishnan
author: John Snow Labs
name: gpt2_50m_unlearning_biosr_supersampled_biographies_x10_lr_0_0005_seed_123_pipeline
date: 2025-04-03
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

Pretrained GPT2Transformer, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`gpt2_50m_unlearning_biosr_supersampled_biographies_x10_lr_0_0005_seed_123_pipeline` is a English model originally trained by akrishnan.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/gpt2_50m_unlearning_biosr_supersampled_biographies_x10_lr_0_0005_seed_123_pipeline_en_5.5.1_3.0_1743669244909.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/gpt2_50m_unlearning_biosr_supersampled_biographies_x10_lr_0_0005_seed_123_pipeline_en_5.5.1_3.0_1743669244909.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("gpt2_50m_unlearning_biosr_supersampled_biographies_x10_lr_0_0005_seed_123_pipeline", lang = "en")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("gpt2_50m_unlearning_biosr_supersampled_biographies_x10_lr_0_0005_seed_123_pipeline", lang = "en")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|gpt2_50m_unlearning_biosr_supersampled_biographies_x10_lr_0_0005_seed_123_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.1+|
|License:|Open Source|
|Edition:|Official|
|Language:|en|
|Size:|123.8 MB|

## References

https://huggingface.co/akrishnan/gpt2-50M-unlearning-BIOSR_supersampled_biographies_x10_lr_0.0005_seed_123

## Included Models

- DocumentAssembler
- GPT2Transformer