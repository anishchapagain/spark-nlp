---
layout: model
title: Arabic xlm_roberta_qa_xlm_roberta_base_arabic_pipeline pipeline XlmRoBertaForQuestionAnswering from bhavikardeshna
author: John Snow Labs
name: xlm_roberta_qa_xlm_roberta_base_arabic_pipeline
date: 2025-05-21
tags: [ar, open_source, pipeline, onnx]
task: Question Answering
language: ar
edition: Spark NLP 5.5.1
spark_version: 3.0
supported: true
annotator: PipelineModel
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained XlmRoBertaForQuestionAnswering, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`xlm_roberta_qa_xlm_roberta_base_arabic_pipeline` is a Arabic model originally trained by bhavikardeshna.

## Predicted Entities



{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/xlm_roberta_qa_xlm_roberta_base_arabic_pipeline_ar_5.5.1_3.0_1747822350186.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/xlm_roberta_qa_xlm_roberta_base_arabic_pipeline_ar_5.5.1_3.0_1747822350186.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python
pipeline = PretrainedPipeline("xlm_roberta_qa_xlm_roberta_base_arabic_pipeline", lang = "ar")
annotations =  pipeline.transform(df)
```
```scala
val pipeline = new PretrainedPipeline("xlm_roberta_qa_xlm_roberta_base_arabic_pipeline", lang = "ar")
val annotations = pipeline.transform(df)
```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|xlm_roberta_qa_xlm_roberta_base_arabic_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.1+|
|License:|Open Source|
|Edition:|Official|
|Language:|ar|
|Size:|884.0 MB|

## References

References

https://huggingface.co/bhavikardeshna/xlm-roberta-base-arabic

## Included Models

- MultiDocumentAssembler
- XlmRoBertaForQuestionAnswering