---
layout: model
title: English deberta_mlm_test_pipeline pipeline DeBertaEmbeddings from domenicrosati
author: John Snow Labs
name: deberta_mlm_test_pipeline
date: 2024-09-01
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

Pretrained DeBertaEmbeddings, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`deberta_mlm_test_pipeline` is a English model originally trained by domenicrosati.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/deberta_mlm_test_pipeline_en_5.5.0_3.0_1725230866061.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/deberta_mlm_test_pipeline_en_5.5.0_3.0_1725230866061.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("deberta_mlm_test_pipeline", lang = "en")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("deberta_mlm_test_pipeline", lang = "en")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|deberta_mlm_test_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.0+|
|License:|Open Source|
|Edition:|Official|
|Language:|en|
|Size:|265.4 MB|

## References

https://huggingface.co/domenicrosati/deberta-mlm-test

## Included Models

- DocumentAssembler
- TokenizerModel
- DeBertaEmbeddings