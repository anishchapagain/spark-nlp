---
layout: model
title: English dragon_roberta_base_domain_specific_pipeline pipeline RoBertaEmbeddings from joeranbosma
author: John Snow Labs
name: dragon_roberta_base_domain_specific_pipeline
date: 2025-02-08
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

Pretrained RoBertaEmbeddings, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`dragon_roberta_base_domain_specific_pipeline` is a English model originally trained by joeranbosma.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/dragon_roberta_base_domain_specific_pipeline_en_5.5.1_3.0_1739027649650.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/dragon_roberta_base_domain_specific_pipeline_en_5.5.1_3.0_1739027649650.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("dragon_roberta_base_domain_specific_pipeline", lang = "en")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("dragon_roberta_base_domain_specific_pipeline", lang = "en")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|dragon_roberta_base_domain_specific_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.1+|
|License:|Open Source|
|Edition:|Official|
|Language:|en|
|Size:|465.2 MB|

## References

https://huggingface.co/joeranbosma/dragon-roberta-base-domain-specific

## Included Models

- DocumentAssembler
- TokenizerModel
- RoBertaEmbeddings