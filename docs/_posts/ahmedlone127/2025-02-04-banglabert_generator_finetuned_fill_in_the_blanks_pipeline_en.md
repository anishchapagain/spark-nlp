---
layout: model
title: English banglabert_generator_finetuned_fill_in_the_blanks_pipeline pipeline BertEmbeddings from myahan007
author: John Snow Labs
name: banglabert_generator_finetuned_fill_in_the_blanks_pipeline
date: 2025-02-04
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

Pretrained BertEmbeddings, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`banglabert_generator_finetuned_fill_in_the_blanks_pipeline` is a English model originally trained by myahan007.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/banglabert_generator_finetuned_fill_in_the_blanks_pipeline_en_5.5.1_3.0_1738694831905.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/banglabert_generator_finetuned_fill_in_the_blanks_pipeline_en_5.5.1_3.0_1738694831905.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("banglabert_generator_finetuned_fill_in_the_blanks_pipeline", lang = "en")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("banglabert_generator_finetuned_fill_in_the_blanks_pipeline", lang = "en")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|banglabert_generator_finetuned_fill_in_the_blanks_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.1+|
|License:|Open Source|
|Edition:|Official|
|Language:|en|
|Size:|130.0 MB|

## References

https://huggingface.co/myahan007/banglabert_generator-finetuned-fill-in-the-blanks

## Included Models

- DocumentAssembler
- TokenizerModel
- BertEmbeddings