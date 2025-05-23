---
layout: model
title: English helsinki_nlp_opus_maltese_polish_english_opus100_finetune_pipeline pipeline MarianTransformer from MikolajDeja
author: John Snow Labs
name: helsinki_nlp_opus_maltese_polish_english_opus100_finetune_pipeline
date: 2024-12-17
tags: [en, open_source, pipeline, onnx]
task: Translation
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

Pretrained MarianTransformer, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`helsinki_nlp_opus_maltese_polish_english_opus100_finetune_pipeline` is a English model originally trained by MikolajDeja.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/helsinki_nlp_opus_maltese_polish_english_opus100_finetune_pipeline_en_5.5.1_3.0_1734408278038.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/helsinki_nlp_opus_maltese_polish_english_opus100_finetune_pipeline_en_5.5.1_3.0_1734408278038.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("helsinki_nlp_opus_maltese_polish_english_opus100_finetune_pipeline", lang = "en")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("helsinki_nlp_opus_maltese_polish_english_opus100_finetune_pipeline", lang = "en")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|helsinki_nlp_opus_maltese_polish_english_opus100_finetune_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.1+|
|License:|Open Source|
|Edition:|Official|
|Language:|en|
|Size:|529.6 MB|

## References

https://huggingface.co/MikolajDeja/Helsinki-NLP-opus-mt-pl-en-opus100-finetune

## Included Models

- DocumentAssembler
- SentenceDetectorDLModel
- MarianTransformer