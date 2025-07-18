---
layout: model
title: Dutch, Flemish robbert_v2_dutch_ner_pipeline pipeline RoBertaForTokenClassification from pdelobelle
author: John Snow Labs
name: robbert_v2_dutch_ner_pipeline
date: 2025-05-21
tags: [nl, open_source, pipeline, onnx]
task: Named Entity Recognition
language: nl
edition: Spark NLP 5.5.1
spark_version: 3.0
supported: true
annotator: PipelineModel
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained RoBertaForTokenClassification, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`robbert_v2_dutch_ner_pipeline` is a Dutch, Flemish model originally trained by pdelobelle.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/robbert_v2_dutch_ner_pipeline_nl_5.5.1_3.0_1747857746368.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/robbert_v2_dutch_ner_pipeline_nl_5.5.1_3.0_1747857746368.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("robbert_v2_dutch_ner_pipeline", lang = "nl")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("robbert_v2_dutch_ner_pipeline", lang = "nl")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|robbert_v2_dutch_ner_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.1+|
|License:|Open Source|
|Edition:|Official|
|Language:|nl|
|Size:|435.8 MB|

## References

https://huggingface.co/pdelobelle/robbert-v2-dutch-ner

## Included Models

- DocumentAssembler
- TokenizerModel
- RoBertaForTokenClassification