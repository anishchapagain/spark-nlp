---
layout: model
title: English hate_hate_random1_seed2_bernice_pipeline pipeline XlmRoBertaForSequenceClassification from tweettemposhift
author: John Snow Labs
name: hate_hate_random1_seed2_bernice_pipeline
date: 2024-09-18
tags: [en, open_source, pipeline, onnx]
task: Text Classification
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

Pretrained XlmRoBertaForSequenceClassification, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`hate_hate_random1_seed2_bernice_pipeline` is a English model originally trained by tweettemposhift.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/hate_hate_random1_seed2_bernice_pipeline_en_5.5.0_3.0_1726633296716.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/hate_hate_random1_seed2_bernice_pipeline_en_5.5.0_3.0_1726633296716.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("hate_hate_random1_seed2_bernice_pipeline", lang = "en")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("hate_hate_random1_seed2_bernice_pipeline", lang = "en")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|hate_hate_random1_seed2_bernice_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.0+|
|License:|Open Source|
|Edition:|Official|
|Language:|en|
|Size:|783.4 MB|

## References

https://huggingface.co/tweettemposhift/hate-hate_random1_seed2-bernice

## Included Models

- DocumentAssembler
- TokenizerModel
- XlmRoBertaForSequenceClassification