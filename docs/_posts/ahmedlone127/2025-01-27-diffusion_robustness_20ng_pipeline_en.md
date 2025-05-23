---
layout: model
title: English diffusion_robustness_20ng_pipeline pipeline RoBertaEmbeddings from Maybe1407
author: John Snow Labs
name: diffusion_robustness_20ng_pipeline
date: 2025-01-27
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

Pretrained RoBertaEmbeddings, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`diffusion_robustness_20ng_pipeline` is a English model originally trained by Maybe1407.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/diffusion_robustness_20ng_pipeline_en_5.5.1_3.0_1738019914332.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/diffusion_robustness_20ng_pipeline_en_5.5.1_3.0_1738019914332.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("diffusion_robustness_20ng_pipeline", lang = "en")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("diffusion_robustness_20ng_pipeline", lang = "en")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|diffusion_robustness_20ng_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.1+|
|License:|Open Source|
|Edition:|Official|
|Language:|en|
|Size:|1.3 GB|

## References

https://huggingface.co/Maybe1407/diffusion_robustness_20ng

## Included Models

- DocumentAssembler
- TokenizerModel
- RoBertaEmbeddings