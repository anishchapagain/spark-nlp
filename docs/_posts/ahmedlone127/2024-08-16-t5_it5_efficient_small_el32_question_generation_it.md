---
layout: model
title: Italian T5ForConditionalGeneration Small Cased model (from it5)
author: John Snow Labs
name: t5_it5_efficient_small_el32_question_generation
date: 2024-08-16
tags: [it, open_source, t5, onnx]
task: Text Generation
language: it
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

Pretrained T5ForConditionalGeneration model, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP. `it5-efficient-small-el32-question-generation` is a Italian model originally trained by `it5`.

## Predicted Entities



{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/t5_it5_efficient_small_el32_question_generation_it_5.4.2_3.0_1723806819443.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/t5_it5_efficient_small_el32_question_generation_it_5.4.2_3.0_1723806819443.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python
documentAssembler = DocumentAssembler() \
    .setInputCols("text") \
    .setOutputCols("document")

t5 = T5Transformer.pretrained("t5_it5_efficient_small_el32_question_generation","it") \
    .setInputCols("document") \
    .setOutputCol("answers")
    
pipeline = Pipeline(stages=[documentAssembler, t5])

data = spark.createDataFrame([["PUT YOUR STRING HERE"]]).toDF("text")

result = pipeline.fit(data).transform(data)
```
```scala
val documentAssembler = new DocumentAssembler() 
      .setInputCols("text")
      .setOutputCols("document")
       
val t5 = T5Transformer.pretrained("t5_it5_efficient_small_el32_question_generation","it") 
    .setInputCols("document")
    .setOutputCol("answers")
   
val pipeline = new Pipeline().setStages(Array(documentAssembler, t5))

val data = Seq("PUT YOUR STRING HERE").toDS.toDF("text")

val result = pipeline.fit(data).transform(data)
```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|t5_it5_efficient_small_el32_question_generation|
|Compatibility:|Spark NLP 5.4.2+|
|License:|Open Source|
|Edition:|Official|
|Input Labels:|[document]|
|Output Labels:|[output]|
|Language:|it|
|Size:|654.8 MB|

## References

References

- https://huggingface.co/it5/it5-efficient-small-el32-question-generation
- https://github.com/stefan-it
- https://arxiv.org/abs/2203.03759
- https://gsarti.com
- https://malvinanissim.github.io
- https://arxiv.org/abs/2109.10686
- https://github.com/gsarti/it5
- https://paperswithcode.com/sota?task=Question+generation&dataset=SQuAD-IT