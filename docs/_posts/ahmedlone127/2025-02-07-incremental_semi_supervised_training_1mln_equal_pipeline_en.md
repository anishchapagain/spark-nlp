---
layout: model
title: English incremental_semi_supervised_training_1mln_equal_pipeline pipeline RoBertaForSequenceClassification from bitsanlp
author: John Snow Labs
name: incremental_semi_supervised_training_1mln_equal_pipeline
date: 2025-02-07
tags: [en, open_source, pipeline, onnx]
task: Text Classification
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

Pretrained RoBertaForSequenceClassification, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`incremental_semi_supervised_training_1mln_equal_pipeline` is a English model originally trained by bitsanlp.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/incremental_semi_supervised_training_1mln_equal_pipeline_en_5.5.1_3.0_1738933463760.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/incremental_semi_supervised_training_1mln_equal_pipeline_en_5.5.1_3.0_1738933463760.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("incremental_semi_supervised_training_1mln_equal_pipeline", lang = "en")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("incremental_semi_supervised_training_1mln_equal_pipeline", lang = "en")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|incremental_semi_supervised_training_1mln_equal_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.1+|
|License:|Open Source|
|Edition:|Official|
|Language:|en|
|Size:|1.3 GB|

## References

https://huggingface.co/bitsanlp/incremental-semi-supervised-training-1mln-equal

## Included Models

- DocumentAssembler
- TokenizerModel
- RoBertaForSequenceClassification