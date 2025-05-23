---
layout: model
title: Thai wangchanberta_thai_wiki_qa_hyp_params_pipeline pipeline CamemBertForQuestionAnswering from powerpuf-bot
author: John Snow Labs
name: wangchanberta_thai_wiki_qa_hyp_params_pipeline
date: 2024-09-01
tags: [th, open_source, pipeline, onnx]
task: Question Answering
language: th
edition: Spark NLP 5.4.2
spark_version: 3.0
supported: true
annotator: PipelineModel
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained CamemBertForQuestionAnswering, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`wangchanberta_thai_wiki_qa_hyp_params_pipeline` is a Thai model originally trained by powerpuf-bot.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/wangchanberta_thai_wiki_qa_hyp_params_pipeline_th_5.4.2_3.0_1725162295489.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/wangchanberta_thai_wiki_qa_hyp_params_pipeline_th_5.4.2_3.0_1725162295489.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("wangchanberta_thai_wiki_qa_hyp_params_pipeline", lang = "th")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("wangchanberta_thai_wiki_qa_hyp_params_pipeline", lang = "th")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|wangchanberta_thai_wiki_qa_hyp_params_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.4.2+|
|License:|Open Source|
|Edition:|Official|
|Language:|th|
|Size:|392.1 MB|

## References

https://huggingface.co/powerpuf-bot/wangchanberta-th-wiki-qa_hyp-params

## Included Models

- MultiDocumentAssembler
- CamemBertForQuestionAnswering