---
layout: model
title: Multilingual xlm_roberta_large_finetuned_conll03_english_pipeline pipeline XlmRoBertaForTokenClassification from FacebookAI
author: John Snow Labs
name: xlm_roberta_large_finetuned_conll03_english_pipeline
date: 2025-05-20
tags: [xx, open_source, pipeline, onnx]
task: Named Entity Recognition
language: xx
edition: Spark NLP 5.5.1
spark_version: 3.0
supported: true
annotator: PipelineModel
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained XlmRoBertaForTokenClassification, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`xlm_roberta_large_finetuned_conll03_english_pipeline` is a Multilingual model originally trained by FacebookAI.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/xlm_roberta_large_finetuned_conll03_english_pipeline_xx_5.5.1_3.0_1747754157297.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/xlm_roberta_large_finetuned_conll03_english_pipeline_xx_5.5.1_3.0_1747754157297.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("xlm_roberta_large_finetuned_conll03_english_pipeline", lang = "xx")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("xlm_roberta_large_finetuned_conll03_english_pipeline", lang = "xx")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|xlm_roberta_large_finetuned_conll03_english_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.1+|
|License:|Open Source|
|Edition:|Official|
|Language:|xx|
|Size:|1.8 GB|

## References

https://huggingface.co/FacebookAI/xlm-roberta-large-finetuned-conll03-english

## Included Models

- DocumentAssembler
- TokenizerModel
- XlmRoBertaForTokenClassification