---
layout: model
title: English less_100000_xlm_roberta_mmar_recipe_10_base_pipeline pipeline XlmRoBertaEmbeddings from CennetOguz
author: John Snow Labs
name: less_100000_xlm_roberta_mmar_recipe_10_base_pipeline
date: 2024-09-02
tags: [en, open_source, pipeline, onnx]
task: Embeddings
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

Pretrained XlmRoBertaEmbeddings, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`less_100000_xlm_roberta_mmar_recipe_10_base_pipeline` is a English model originally trained by CennetOguz.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/less_100000_xlm_roberta_mmar_recipe_10_base_pipeline_en_5.5.0_3.0_1725271212541.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/less_100000_xlm_roberta_mmar_recipe_10_base_pipeline_en_5.5.0_3.0_1725271212541.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("less_100000_xlm_roberta_mmar_recipe_10_base_pipeline", lang = "en")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("less_100000_xlm_roberta_mmar_recipe_10_base_pipeline", lang = "en")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|less_100000_xlm_roberta_mmar_recipe_10_base_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.0+|
|License:|Open Source|
|Edition:|Official|
|Language:|en|
|Size:|1.0 GB|

## References

https://huggingface.co/CennetOguz/less_100000_xlm_roberta_mmar_recipe_10_base

## Included Models

- DocumentAssembler
- TokenizerModel
- XlmRoBertaEmbeddings