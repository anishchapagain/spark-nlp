---
layout: model
title: Japanese deberta_v2_base_japanese_finetuned_qae_pipeline pipeline DeBertaForQuestionAnswering from Mizuiro-sakura
author: John Snow Labs
name: deberta_v2_base_japanese_finetuned_qae_pipeline
date: 2024-09-01
tags: [ja, open_source, pipeline, onnx]
task: Question Answering
language: ja
edition: Spark NLP 5.5.0
spark_version: 3.0
supported: true
annotator: PipelineModel
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained DeBertaForQuestionAnswering, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`deberta_v2_base_japanese_finetuned_qae_pipeline` is a Japanese model originally trained by Mizuiro-sakura.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/deberta_v2_base_japanese_finetuned_qae_pipeline_ja_5.5.0_3.0_1725220749383.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/deberta_v2_base_japanese_finetuned_qae_pipeline_ja_5.5.0_3.0_1725220749383.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("deberta_v2_base_japanese_finetuned_qae_pipeline", lang = "ja")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("deberta_v2_base_japanese_finetuned_qae_pipeline", lang = "ja")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|deberta_v2_base_japanese_finetuned_qae_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.0+|
|License:|Open Source|
|Edition:|Official|
|Language:|ja|
|Size:|419.0 MB|

## References

https://huggingface.co/Mizuiro-sakura/deberta-v2-base-japanese-finetuned-QAe

## Included Models

- MultiDocumentAssembler
- DeBertaForQuestionAnswering