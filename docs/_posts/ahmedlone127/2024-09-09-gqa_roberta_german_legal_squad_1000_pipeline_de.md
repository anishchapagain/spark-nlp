---
layout: model
title: German gqa_roberta_german_legal_squad_1000_pipeline pipeline RoBertaForQuestionAnswering from farid1088
author: John Snow Labs
name: gqa_roberta_german_legal_squad_1000_pipeline
date: 2024-09-09
tags: [de, open_source, pipeline, onnx]
task: Question Answering
language: de
edition: Spark NLP 5.5.0
spark_version: 3.0
supported: true
annotator: PipelineModel
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained RoBertaForQuestionAnswering, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`gqa_roberta_german_legal_squad_1000_pipeline` is a German model originally trained by farid1088.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/gqa_roberta_german_legal_squad_1000_pipeline_de_5.5.0_3.0_1725867538300.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/gqa_roberta_german_legal_squad_1000_pipeline_de_5.5.0_3.0_1725867538300.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("gqa_roberta_german_legal_squad_1000_pipeline", lang = "de")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("gqa_roberta_german_legal_squad_1000_pipeline", lang = "de")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|gqa_roberta_german_legal_squad_1000_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.0+|
|License:|Open Source|
|Edition:|Official|
|Language:|de|
|Size:|465.8 MB|

## References

https://huggingface.co/farid1088/GQA_RoBERTa_German_legal_SQuAD_1000

## Included Models

- MultiDocumentAssembler
- RoBertaForQuestionAnswering