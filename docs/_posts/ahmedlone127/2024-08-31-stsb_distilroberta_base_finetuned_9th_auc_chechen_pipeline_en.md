---
layout: model
title: English stsb_distilroberta_base_finetuned_9th_auc_chechen_pipeline pipeline RoBertaForSequenceClassification from Katsiaryna
author: John Snow Labs
name: stsb_distilroberta_base_finetuned_9th_auc_chechen_pipeline
date: 2024-08-31
tags: [en, open_source, pipeline, onnx]
task: Text Classification
language: en
edition: Spark NLP 5.4.2
spark_version: 3.0
supported: true
annotator: PipelineModel
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained RoBertaForSequenceClassification, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`stsb_distilroberta_base_finetuned_9th_auc_chechen_pipeline` is a English model originally trained by Katsiaryna.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/stsb_distilroberta_base_finetuned_9th_auc_chechen_pipeline_en_5.4.2_3.0_1725123061311.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/stsb_distilroberta_base_finetuned_9th_auc_chechen_pipeline_en_5.4.2_3.0_1725123061311.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("stsb_distilroberta_base_finetuned_9th_auc_chechen_pipeline", lang = "en")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("stsb_distilroberta_base_finetuned_9th_auc_chechen_pipeline", lang = "en")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|stsb_distilroberta_base_finetuned_9th_auc_chechen_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.4.2+|
|License:|Open Source|
|Edition:|Official|
|Language:|en|
|Size:|309.1 MB|

## References

https://huggingface.co/Katsiaryna/stsb-distilroberta-base-finetuned_9th_auc_ce

## Included Models

- DocumentAssembler
- TokenizerModel
- RoBertaForSequenceClassification