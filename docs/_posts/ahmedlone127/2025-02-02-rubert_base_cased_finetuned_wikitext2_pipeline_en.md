---
layout: model
title: English rubert_base_cased_finetuned_wikitext2_pipeline pipeline BertEmbeddings from emaximen
author: John Snow Labs
name: rubert_base_cased_finetuned_wikitext2_pipeline
date: 2025-02-02
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

Pretrained BertEmbeddings, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`rubert_base_cased_finetuned_wikitext2_pipeline` is a English model originally trained by emaximen.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/rubert_base_cased_finetuned_wikitext2_pipeline_en_5.5.1_3.0_1738475994072.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/rubert_base_cased_finetuned_wikitext2_pipeline_en_5.5.1_3.0_1738475994072.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("rubert_base_cased_finetuned_wikitext2_pipeline", lang = "en")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("rubert_base_cased_finetuned_wikitext2_pipeline", lang = "en")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|rubert_base_cased_finetuned_wikitext2_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.1+|
|License:|Open Source|
|Edition:|Official|
|Language:|en|
|Size:|664.1 MB|

## References

https://huggingface.co/emaximen/rubert-base-cased-finetuned-wikitext2

## Included Models

- DocumentAssembler
- TokenizerModel
- BertEmbeddings