---
layout: model
title: English toxic_comment_model_toxicity_ft_pipeline pipeline DistilBertForSequenceClassification from fatmhd1995
author: John Snow Labs
name: toxic_comment_model_toxicity_ft_pipeline
date: 2024-09-21
tags: [en, open_source, pipeline, onnx]
task: Text Classification
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

Pretrained DistilBertForSequenceClassification, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`toxic_comment_model_toxicity_ft_pipeline` is a English model originally trained by fatmhd1995.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/toxic_comment_model_toxicity_ft_pipeline_en_5.5.0_3.0_1726953469297.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/toxic_comment_model_toxicity_ft_pipeline_en_5.5.0_3.0_1726953469297.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("toxic_comment_model_toxicity_ft_pipeline", lang = "en")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("toxic_comment_model_toxicity_ft_pipeline", lang = "en")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|toxic_comment_model_toxicity_ft_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.0+|
|License:|Open Source|
|Edition:|Official|
|Language:|en|
|Size:|249.5 MB|

## References

https://huggingface.co/fatmhd1995/toxic-comment-model-TOXICITY-FT

## Included Models

- DocumentAssembler
- TokenizerModel
- DistilBertForSequenceClassification