---
layout: model
title: English roberta_large_finetuned_ner_hypnosis0930_pipeline pipeline RoBertaForTokenClassification from hypnosis0930
author: John Snow Labs
name: roberta_large_finetuned_ner_hypnosis0930_pipeline
date: 2024-09-23
tags: [en, open_source, pipeline, onnx]
task: Named Entity Recognition
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

Pretrained RoBertaForTokenClassification, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`roberta_large_finetuned_ner_hypnosis0930_pipeline` is a English model originally trained by hypnosis0930.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/roberta_large_finetuned_ner_hypnosis0930_pipeline_en_5.5.0_3.0_1727072925612.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/roberta_large_finetuned_ner_hypnosis0930_pipeline_en_5.5.0_3.0_1727072925612.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("roberta_large_finetuned_ner_hypnosis0930_pipeline", lang = "en")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("roberta_large_finetuned_ner_hypnosis0930_pipeline", lang = "en")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|roberta_large_finetuned_ner_hypnosis0930_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.0+|
|License:|Open Source|
|Edition:|Official|
|Language:|en|
|Size:|1.3 GB|

## References

https://huggingface.co/hypnosis0930/roberta-large-finetuned-ner

## Included Models

- DocumentAssembler
- TokenizerModel
- RoBertaForTokenClassification