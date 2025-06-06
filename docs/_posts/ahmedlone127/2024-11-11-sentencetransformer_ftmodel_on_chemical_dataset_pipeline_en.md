---
layout: model
title: English sentencetransformer_ftmodel_on_chemical_dataset_pipeline pipeline MPNetEmbeddings from Saideepthi55
author: John Snow Labs
name: sentencetransformer_ftmodel_on_chemical_dataset_pipeline
date: 2024-11-11
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

Pretrained MPNetEmbeddings, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`sentencetransformer_ftmodel_on_chemical_dataset_pipeline` is a English model originally trained by Saideepthi55.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/sentencetransformer_ftmodel_on_chemical_dataset_pipeline_en_5.5.1_3.0_1731295052812.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/sentencetransformer_ftmodel_on_chemical_dataset_pipeline_en_5.5.1_3.0_1731295052812.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("sentencetransformer_ftmodel_on_chemical_dataset_pipeline", lang = "en")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("sentencetransformer_ftmodel_on_chemical_dataset_pipeline", lang = "en")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|sentencetransformer_ftmodel_on_chemical_dataset_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.1+|
|License:|Open Source|
|Edition:|Official|
|Language:|en|
|Size:|402.5 MB|

## References

https://huggingface.co/Saideepthi55/sentencetransformer_ftmodel_on_chemical_dataset

## Included Models

- DocumentAssembler
- MPNetEmbeddings