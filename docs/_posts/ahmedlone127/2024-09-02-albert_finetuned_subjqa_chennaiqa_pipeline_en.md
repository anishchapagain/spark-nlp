---
layout: model
title: English albert_finetuned_subjqa_chennaiqa_pipeline pipeline AlbertForQuestionAnswering from aditi2212
author: John Snow Labs
name: albert_finetuned_subjqa_chennaiqa_pipeline
date: 2024-09-02
tags: [en, open_source, pipeline, onnx]
task: Question Answering
language: en
edition: Spark NLP 5.5.0
spark_version: 3.0
supported: true
annotator: PipelineModel
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained AlbertForQuestionAnswering, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`albert_finetuned_subjqa_chennaiqa_pipeline` is a English model originally trained by aditi2212.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/albert_finetuned_subjqa_chennaiqa_pipeline_en_5.5.0_3.0_1725310026923.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/albert_finetuned_subjqa_chennaiqa_pipeline_en_5.5.0_3.0_1725310026923.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("albert_finetuned_subjqa_chennaiqa_pipeline", lang = "en")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("albert_finetuned_subjqa_chennaiqa_pipeline", lang = "en")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|albert_finetuned_subjqa_chennaiqa_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.0+|
|License:|Open Source|
|Edition:|Official|
|Language:|en|
|Size:|42.0 MB|

## References

https://huggingface.co/aditi2212/albert-finetuned-subjqa-ChennaiQA

## Included Models

- MultiDocumentAssembler
- AlbertForQuestionAnswering