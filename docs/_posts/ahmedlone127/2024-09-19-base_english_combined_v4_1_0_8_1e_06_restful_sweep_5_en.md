---
layout: model
title: English base_english_combined_v4_1_0_8_1e_06_restful_sweep_5 WhisperForCTC from saahith
author: John Snow Labs
name: base_english_combined_v4_1_0_8_1e_06_restful_sweep_5
date: 2024-09-19
tags: [en, open_source, onnx, asr, whisper]
task: Automatic Speech Recognition
language: en
edition: Spark NLP 5.5.0
spark_version: 3.0
supported: true
engine: onnx
annotator: WhisperForCTC
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained WhisperForCTC model, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`base_english_combined_v4_1_0_8_1e_06_restful_sweep_5` is a English model originally trained by saahith.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/base_english_combined_v4_1_0_8_1e_06_restful_sweep_5_en_5.5.0_3.0_1726758374750.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/base_english_combined_v4_1_0_8_1e_06_restful_sweep_5_en_5.5.0_3.0_1726758374750.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python
     
audioAssembler = AudioAssembler() \
	.setInputCol("audio_content") \
	.setOutputCol("audio_assembler")

speechToText  = WhisperForCTC.pretrained("base_english_combined_v4_1_0_8_1e_06_restful_sweep_5","en") \
     .setInputCols(["audio_assembler"]) \
     .setOutputCol("text")

pipeline = Pipeline().setStages([audioAssembler, speechToText])
pipelineModel = pipeline.fit(data)
pipelineDF = pipelineModel.transform(data)

```
```scala

val audioAssembler = new DocumentAssembler()
    .setInputCols("audio_content")
    .setOutputCols("audio_assembler")

val speechToText = WhisperForCTC.pretrained("base_english_combined_v4_1_0_8_1e_06_restful_sweep_5", "en")
    .setInputCols(Array("audio_assembler")) 
    .setOutputCol("text") 
    
val pipeline = new Pipeline().setStages(Array(documentAssembler, speechToText))
val pipelineModel = pipeline.fit(data)
val pipelineDF = pipelineModel.transform(data)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|base_english_combined_v4_1_0_8_1e_06_restful_sweep_5|
|Compatibility:|Spark NLP 5.5.0+|
|License:|Open Source|
|Edition:|Official|
|Input Labels:|[audio_assembler]|
|Output Labels:|[text]|
|Language:|en|
|Size:|646.1 MB|

## References

https://huggingface.co/saahith/base.en-combined_v4-1-0-8-1e-06-restful-sweep-5