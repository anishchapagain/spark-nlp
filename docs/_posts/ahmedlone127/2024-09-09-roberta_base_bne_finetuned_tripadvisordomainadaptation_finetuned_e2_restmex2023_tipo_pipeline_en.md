---
layout: model
title: English roberta_base_bne_finetuned_tripadvisordomainadaptation_finetuned_e2_restmex2023_tipo_pipeline pipeline RoBertaForSequenceClassification from vg055
author: John Snow Labs
name: roberta_base_bne_finetuned_tripadvisordomainadaptation_finetuned_e2_restmex2023_tipo_pipeline
date: 2024-09-09
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

Pretrained RoBertaForSequenceClassification, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`roberta_base_bne_finetuned_tripadvisordomainadaptation_finetuned_e2_restmex2023_tipo_pipeline` is a English model originally trained by vg055.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/roberta_base_bne_finetuned_tripadvisordomainadaptation_finetuned_e2_restmex2023_tipo_pipeline_en_5.5.0_3.0_1725903384952.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/roberta_base_bne_finetuned_tripadvisordomainadaptation_finetuned_e2_restmex2023_tipo_pipeline_en_5.5.0_3.0_1725903384952.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("roberta_base_bne_finetuned_tripadvisordomainadaptation_finetuned_e2_restmex2023_tipo_pipeline", lang = "en")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("roberta_base_bne_finetuned_tripadvisordomainadaptation_finetuned_e2_restmex2023_tipo_pipeline", lang = "en")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|roberta_base_bne_finetuned_tripadvisordomainadaptation_finetuned_e2_restmex2023_tipo_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.0+|
|License:|Open Source|
|Edition:|Official|
|Language:|en|
|Size:|466.3 MB|

## References

https://huggingface.co/vg055/roberta-base-bne-finetuned-TripAdvisorDomainAdaptation-finetuned-e2-RestMex2023-tipo

## Included Models

- DocumentAssembler
- TokenizerModel
- RoBertaForSequenceClassification