---
layout: model
title: None arabict5_large_arabic_english T5Transformer from sultan
author: John Snow Labs
name: arabict5_large_arabic_english
date: 2024-08-21
tags: [nan, open_source, onnx, t5, question_answering, summarization, translation, text_generation]
task: [Question Answering, Summarization, Translation, Text Generation]
language: nan
edition: Spark NLP 5.4.2
spark_version: 3.0
supported: true
engine: onnx
annotator: T5Transformer
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained T5Transformer model, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`arabict5_large_arabic_english` is a None model originally trained by sultan.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/arabict5_large_arabic_english_nan_5.4.2_3.0_1724237335832.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/arabict5_large_arabic_english_nan_5.4.2_3.0_1724237335832.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python
     
documentAssembler = DocumentAssembler() \
    .setInputCol('text') \
    .setOutputCol('document')

t5  = T5Transformer.pretrained("arabict5_large_arabic_english","nan") \
     .setInputCols(["document"]) \
     .setOutputCol("output")

pipeline = Pipeline().setStages([documentAssembler, t5])
data = spark.createDataFrame([["I love spark-nlp"]]).toDF("text")
pipelineModel = pipeline.fit(data)
pipelineDF = pipelineModel.transform(data)

```
```scala

val documentAssembler = new DocumentAssembler()
    .setInputCols("text")
    .setOutputCols("document")

val t5 = T5Transformer.pretrained("arabict5_large_arabic_english", "nan")
    .setInputCols(Array("documents")) 
    .setOutputCol("output") 
    
val pipeline = new Pipeline().setStages(Array(documentAssembler, t5))
val data = Seq("I love spark-nlp").toDS.toDF("text")
val pipelineModel = pipeline.fit(data)
val pipelineDF = pipelineModel.transform(data)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|arabict5_large_arabic_english|
|Compatibility:|Spark NLP 5.4.2+|
|License:|Open Source|
|Edition:|Official|
|Input Labels:|[document]|
|Output Labels:|[output]|
|Language:|nan|
|Size:|1.3 GB|

## References

https://huggingface.co/sultan/ArabicT5-Large_Ar-En