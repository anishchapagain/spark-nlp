---
layout: model
title: Gujarati sent_gujarati_in_devanagari_xlm_r_base_pipeline pipeline XlmRoBertaSentenceEmbeddings from ashwani-tanwar
author: John Snow Labs
name: sent_gujarati_in_devanagari_xlm_r_base_pipeline
date: 2024-09-08
tags: [gu, open_source, pipeline, onnx]
task: Embeddings
language: gu
edition: Spark NLP 5.5.0
spark_version: 3.0
supported: true
annotator: PipelineModel
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained XlmRoBertaSentenceEmbeddings, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`sent_gujarati_in_devanagari_xlm_r_base_pipeline` is a Gujarati model originally trained by ashwani-tanwar.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/sent_gujarati_in_devanagari_xlm_r_base_pipeline_gu_5.5.0_3.0_1725797631926.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/sent_gujarati_in_devanagari_xlm_r_base_pipeline_gu_5.5.0_3.0_1725797631926.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("sent_gujarati_in_devanagari_xlm_r_base_pipeline", lang = "gu")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("sent_gujarati_in_devanagari_xlm_r_base_pipeline", lang = "gu")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|sent_gujarati_in_devanagari_xlm_r_base_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.0+|
|License:|Open Source|
|Edition:|Official|
|Language:|gu|
|Size:|653.3 MB|

## References

https://huggingface.co/ashwani-tanwar/Gujarati-in-Devanagari-XLM-R-Base

## Included Models

- DocumentAssembler
- TokenizerModel
- SentenceDetectorDLModel
- XlmRoBertaSentenceEmbeddings