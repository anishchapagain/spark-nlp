---
layout: model
title: English vit_epochs5_batch32_lr5e_05_size224_tiles9_seed42_q2_complexity ViTForImageClassification from Omriy123
author: John Snow Labs
name: vit_epochs5_batch32_lr5e_05_size224_tiles9_seed42_q2_complexity
date: 2025-01-27
tags: [en, open_source, onnx, image_classification, vit]
task: Image Classification
language: en
edition: Spark NLP 5.5.1
spark_version: 3.0
supported: true
engine: onnx
annotator: ViTForImageClassification
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained ViTForImageClassification model, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`vit_epochs5_batch32_lr5e_05_size224_tiles9_seed42_q2_complexity` is a English model originally trained by Omriy123.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/vit_epochs5_batch32_lr5e_05_size224_tiles9_seed42_q2_complexity_en_5.5.1_3.0_1738022277308.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/vit_epochs5_batch32_lr5e_05_size224_tiles9_seed42_q2_complexity_en_5.5.1_3.0_1738022277308.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

		
		

image_assembler = ImageAssembler()\
  .setInputCol("image")\
  .setOutputCol("image_assembler")

imageClassifier = ViTForImageClassification.pretrained(""vit_epochs5_batch32_lr5e_05_size224_tiles9_seed42_q2_complexity","en")\
  .setInputCols("image_assembler")\
  .setOutputCol("class")

pipeline = Pipeline(stages=[
  image_assembler,
  imageClassifier,
])

pipelineModel = pipeline.fit(imageDF)

pipelineDF = pipelineModel.transform(imageDF)

```
```scala

val imageAssembler = new ImageAssembler()
    .setInputCol("image")
    .setOutputCol("image_assembler")

val imageClassifier =  ViTForImageClassification.pretrained("vit_epochs5_batch32_lr5e_05_size224_tiles9_seed42_q2_complexity","en") 
    .setInputCols("image_assembler") 
    .setOutputCol("class") 

val pipeline = new Pipeline().setStages(Array(imageAssembler, imageClassifier))

val pipelineModel = pipeline.fit(imageDF)

val pipelineDF = pipelineModel.transform(imageDF)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|vit_epochs5_batch32_lr5e_05_size224_tiles9_seed42_q2_complexity|
|Compatibility:|Spark NLP 5.5.1+|
|License:|Open Source|
|Edition:|Official|
|Input Labels:|[image_assembler]|
|Output Labels:|[label]|
|Language:|en|
|Size:|321.3 MB|

## References

https://huggingface.co/Omriy123/vit_epochs5_batch32_lr5e-05_size224_tiles9_seed42_q2_complexity