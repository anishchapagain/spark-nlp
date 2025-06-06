---
layout: model
title: Castilian, Spanish prof_ner_spanish_pipeline pipeline RoBertaForTokenClassification from BSC-NLP4BIA
author: John Snow Labs
name: prof_ner_spanish_pipeline
date: 2024-09-07
tags: [es, open_source, pipeline, onnx]
task: Named Entity Recognition
language: es
edition: Spark NLP 5.5.0
spark_version: 3.0
supported: true
annotator: PipelineModel
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained RoBertaForTokenClassification, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`prof_ner_spanish_pipeline` is a Castilian, Spanish model originally trained by BSC-NLP4BIA.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/prof_ner_spanish_pipeline_es_5.5.0_3.0_1725707981089.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/prof_ner_spanish_pipeline_es_5.5.0_3.0_1725707981089.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("prof_ner_spanish_pipeline", lang = "es")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("prof_ner_spanish_pipeline", lang = "es")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|prof_ner_spanish_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.0+|
|License:|Open Source|
|Edition:|Official|
|Language:|es|
|Size:|453.1 MB|

## References

https://huggingface.co/BSC-NLP4BIA/prof-ner-es

## Included Models

- DocumentAssembler
- TokenizerModel
- RoBertaForTokenClassification