---
layout: model
title: Turkish mdeberta_v3_base_offensive_mlm_pipeline pipeline DeBertaEmbeddings from Overfit-GM
author: John Snow Labs
name: mdeberta_v3_base_offensive_mlm_pipeline
date: 2024-09-03
tags: [tr, open_source, pipeline, onnx]
task: Embeddings
language: tr
edition: Spark NLP 5.5.0
spark_version: 3.0
supported: true
annotator: PipelineModel
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained DeBertaEmbeddings, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`mdeberta_v3_base_offensive_mlm_pipeline` is a Turkish model originally trained by Overfit-GM.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/mdeberta_v3_base_offensive_mlm_pipeline_tr_5.5.0_3.0_1725377347324.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/mdeberta_v3_base_offensive_mlm_pipeline_tr_5.5.0_3.0_1725377347324.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("mdeberta_v3_base_offensive_mlm_pipeline", lang = "tr")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("mdeberta_v3_base_offensive_mlm_pipeline", lang = "tr")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|mdeberta_v3_base_offensive_mlm_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.0+|
|License:|Open Source|
|Edition:|Official|
|Language:|tr|
|Size:|1.0 GB|

## References

https://huggingface.co/Overfit-GM/mdeberta-v3-base-offensive-mlm

## Included Models

- DocumentAssembler
- TokenizerModel
- DeBertaEmbeddings