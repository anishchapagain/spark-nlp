---
layout: model
title: Irish whisper_medium_ga2en_v5_2_1_r WhisperForCTC from ymoslem
author: John Snow Labs
name: whisper_medium_ga2en_v5_2_1_r
date: 2024-12-15
tags: [ga, open_source, onnx, asr, whisper]
task: Automatic Speech Recognition
language: ga
edition: Spark NLP 5.5.1
spark_version: 3.0
supported: true
engine: onnx
annotator: WhisperForCTC
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained WhisperForCTC model, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`whisper_medium_ga2en_v5_2_1_r` is a Irish model originally trained by ymoslem.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/whisper_medium_ga2en_v5_2_1_r_ga_5.5.1_3.0_1734236005947.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/whisper_medium_ga2en_v5_2_1_r_ga_5.5.1_3.0_1734236005947.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python
     
audioAssembler = AudioAssembler() \
	.setInputCol("audio_content") \
	.setOutputCol("audio_assembler")

speechToText  = WhisperForCTC.pretrained("whisper_medium_ga2en_v5_2_1_r","ga") \
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

val speechToText = WhisperForCTC.pretrained("whisper_medium_ga2en_v5_2_1_r", "ga")
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
|Model Name:|whisper_medium_ga2en_v5_2_1_r|
|Compatibility:|Spark NLP 5.5.1+|
|License:|Open Source|
|Edition:|Official|
|Input Labels:|[audio_assembler]|
|Output Labels:|[text]|
|Language:|ga|
|Size:|4.8 GB|

## References

https://huggingface.co/ymoslem/whisper-medium-ga2en-v5.2.1-r