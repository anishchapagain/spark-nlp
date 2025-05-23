---
layout: model
title: Hindi Named Entity Recognition (from sagorsarker)
author: John Snow Labs
name: bert_ner_codeswitch_hineng_lid_lince
date: 2023-11-06
tags: [bert, ner, token_classification, hi, open_source, onnx]
task: Named Entity Recognition
language: hi
edition: Spark NLP 5.2.0
spark_version: 3.0
supported: true
engine: onnx
annotator: BertForTokenClassification
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained Named Entity Recognition model, uploaded to Hugging Face, adapted and imported into Spark NLP. `codeswitch-hineng-lid-lince` is a Hindi model orginally trained by `sagorsarker`.

## Predicted Entities

`mixed`, `hin`, `other`, `unk`, `en`, `ambiguous`, `ne`, `fw`

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/bert_ner_codeswitch_hineng_lid_lince_hi_5.2.0_3.0_1699290564166.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/bert_ner_codeswitch_hineng_lid_lince_hi_5.2.0_3.0_1699290564166.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python
documentAssembler = DocumentAssembler() \
        .setInputCol("text") \
        .setOutputCol("document")

sentenceDetector = SentenceDetectorDLModel.pretrained("sentence_detector_dl", "xx")\
       .setInputCols(["document"])\
       .setOutputCol("sentence")

tokenizer = Tokenizer() \
    .setInputCols("sentence") \
    .setOutputCol("token")

tokenClassifier = BertForTokenClassification.pretrained("bert_ner_codeswitch_hineng_lid_lince","hi") \
    .setInputCols(["sentence", "token"]) \
    .setOutputCol("ner")

pipeline = Pipeline(stages=[documentAssembler, sentenceDetector, tokenizer, tokenClassifier])

data = spark.createDataFrame([["मुझे स्पार्क एनएलपी बहुत पसंद है"]]).toDF("text")

result = pipeline.fit(data).transform(data)
```
```scala
val documentAssembler = new DocumentAssembler() 
          .setInputCol("text") 
          .setOutputCol("document")

val sentenceDetector = SentenceDetectorDLModel.pretrained("sentence_detector_dl", "xx")
       .setInputCols(Array("document"))
       .setOutputCol("sentence")

val tokenizer = new Tokenizer() 
    .setInputCols(Array("sentence"))
    .setOutputCol("token")

val tokenClassifier = BertForTokenClassification.pretrained("bert_ner_codeswitch_hineng_lid_lince","hi") 
    .setInputCols(Array("sentence", "token")) 
    .setOutputCol("ner")

val pipeline = new Pipeline().setStages(Array(documentAssembler,sentenceDetector, tokenizer, tokenClassifier))

val data = Seq("मुझे स्पार्क एनएलपी बहुत पसंद है").toDF("text")

val result = pipeline.fit(data).transform(data)
```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|bert_ner_codeswitch_hineng_lid_lince|
|Compatibility:|Spark NLP 5.2.0+|
|License:|Open Source|
|Edition:|Official|
|Input Labels:|[document, token]|
|Output Labels:|[ner]|
|Language:|hi|
|Size:|665.1 MB|
|Case sensitive:|true|
|Max sentence length:|128|

## References

References

- https://huggingface.co/sagorsarker/codeswitch-hineng-lid-lince
- https://ritual.uh.edu/lince/home
- https://github.com/sagorbrur/codeswitch