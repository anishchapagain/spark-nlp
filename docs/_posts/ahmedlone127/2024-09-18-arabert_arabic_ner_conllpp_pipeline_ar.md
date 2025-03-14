---
layout: model
title: Arabic arabert_arabic_ner_conllpp_pipeline pipeline BertForTokenClassification from MostafaAhmed98
author: John Snow Labs
name: arabert_arabic_ner_conllpp_pipeline
date: 2024-09-18
tags: [ar, open_source, pipeline, onnx]
task: Named Entity Recognition
language: ar
edition: Spark NLP 5.5.0
spark_version: 3.0
supported: true
annotator: PipelineModel
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained BertForTokenClassification, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`arabert_arabic_ner_conllpp_pipeline` is a Arabic model originally trained by MostafaAhmed98.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/arabert_arabic_ner_conllpp_pipeline_ar_5.5.0_3.0_1726673958857.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/arabert_arabic_ner_conllpp_pipeline_ar_5.5.0_3.0_1726673958857.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("arabert_arabic_ner_conllpp_pipeline", lang = "ar")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("arabert_arabic_ner_conllpp_pipeline", lang = "ar")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|arabert_arabic_ner_conllpp_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.0+|
|License:|Open Source|
|Edition:|Official|
|Language:|ar|
|Size:|505.1 MB|

## References

https://huggingface.co/MostafaAhmed98/AraBert-Arabic-NER-CoNLLpp

## Included Models

- DocumentAssembler
- TokenizerModel
- BertForTokenClassification