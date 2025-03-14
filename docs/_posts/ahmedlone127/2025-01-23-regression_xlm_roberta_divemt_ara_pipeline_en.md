---
layout: model
title: English regression_xlm_roberta_divemt_ara_pipeline pipeline XlmRoBertaForSequenceClassification from iknlpt3
author: John Snow Labs
name: regression_xlm_roberta_divemt_ara_pipeline
date: 2025-01-23
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

Pretrained XlmRoBertaForSequenceClassification, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`regression_xlm_roberta_divemt_ara_pipeline` is a English model originally trained by iknlpt3.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/regression_xlm_roberta_divemt_ara_pipeline_en_5.5.1_3.0_1737651901620.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/regression_xlm_roberta_divemt_ara_pipeline_en_5.5.1_3.0_1737651901620.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("regression_xlm_roberta_divemt_ara_pipeline", lang = "en")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("regression_xlm_roberta_divemt_ara_pipeline", lang = "en")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|regression_xlm_roberta_divemt_ara_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.1+|
|License:|Open Source|
|Edition:|Official|
|Language:|en|
|Size:|776.9 MB|

## References

https://huggingface.co/iknlpt3/regression_xlm_roberta_divemt_ara

## Included Models

- DocumentAssembler
- TokenizerModel
- XlmRoBertaForSequenceClassification