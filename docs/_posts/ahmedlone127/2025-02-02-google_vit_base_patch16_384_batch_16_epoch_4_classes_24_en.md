---
layout: model
title: English google_vit_base_patch16_384_batch_16_epoch_4_classes_24 ViTForImageClassification from ZaneHorrible
author: John Snow Labs
name: google_vit_base_patch16_384_batch_16_epoch_4_classes_24
date: 2025-02-02
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

Pretrained ViTForImageClassification model, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`google_vit_base_patch16_384_batch_16_epoch_4_classes_24` is a English model originally trained by ZaneHorrible.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/google_vit_base_patch16_384_batch_16_epoch_4_classes_24_en_5.5.1_3.0_1738478970781.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/google_vit_base_patch16_384_batch_16_epoch_4_classes_24_en_5.5.1_3.0_1738478970781.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

		
		

image_assembler = ImageAssembler()\
  .setInputCol("image")\
  .setOutputCol("image_assembler")

imageClassifier = ViTForImageClassification.pretrained(""google_vit_base_patch16_384_batch_16_epoch_4_classes_24","en")\
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

val imageClassifier =  ViTForImageClassification.pretrained("google_vit_base_patch16_384_batch_16_epoch_4_classes_24","en") 
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
|Model Name:|google_vit_base_patch16_384_batch_16_epoch_4_classes_24|
|Compatibility:|Spark NLP 5.5.1+|
|License:|Open Source|
|Edition:|Official|
|Input Labels:|[image_assembler]|
|Output Labels:|[label]|
|Language:|en|
|Size:|322.5 MB|

## References

https://huggingface.co/ZaneHorrible/google-vit-base-patch16-384-batch_16_epoch_4_classes_24