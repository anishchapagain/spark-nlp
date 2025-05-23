---
layout: model
title: English snomed_ct_ner_v_2_manually_class_pipeline pipeline CamemBertForTokenClassification from Tippawan
author: John Snow Labs
name: snomed_ct_ner_v_2_manually_class_pipeline
date: 2024-08-31
tags: [en, open_source, pipeline, onnx]
task: Named Entity Recognition
language: en
edition: Spark NLP 5.4.2
spark_version: 3.0
supported: true
annotator: PipelineModel
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained CamemBertForTokenClassification, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`snomed_ct_ner_v_2_manually_class_pipeline` is a English model originally trained by Tippawan.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/snomed_ct_ner_v_2_manually_class_pipeline_en_5.4.2_3.0_1725140875327.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/snomed_ct_ner_v_2_manually_class_pipeline_en_5.4.2_3.0_1725140875327.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("snomed_ct_ner_v_2_manually_class_pipeline", lang = "en")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("snomed_ct_ner_v_2_manually_class_pipeline", lang = "en")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|snomed_ct_ner_v_2_manually_class_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.4.2+|
|License:|Open Source|
|Edition:|Official|
|Language:|en|
|Size:|392.2 MB|

## References

https://huggingface.co/Tippawan/SNOMED-CT-NER-V.2-manually-CLASS

## Included Models

- DocumentAssembler
- TokenizerModel
- CamemBertForTokenClassification