---
layout: model
title: German BertForSequenceClassification Cased model (from cm-mueller)
author: John Snow Labs
name: bert_classifier_bacnet_klassifizierung_raumlufttechnik
date: 2024-09-01
tags: [de, open_source, bert, sequence_classification, classification, onnx]
task: Text Classification
language: de
edition: Spark NLP 5.4.2
spark_version: 3.0
supported: true
engine: onnx
annotator: BertForSequenceClassification
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained BertForSequenceClassification model, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP. `BACnet-Klassifizierung-Raumlufttechnik` is a German model originally trained by `cm-mueller`.

## Predicted Entities

`Wärmerückgewinnung`, `Zuluftuftfilter`, `Ventilator`, `Abluft`, `Vorerhitzer`, `Andere`, `Raum`, `Kühler`, `Erhitzer`, `Befeuchter`, `Zuluftventilator`, `Nacherhitzer`, `Aussenluftklappe`, `Brandschutz`, `Zuluft`, `Abluftventilator`, `RLT_Anlage`, `Brandschutzklappe`, `Abluftfilter`

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/bert_classifier_bacnet_klassifizierung_raumlufttechnik_de_5.4.2_3.0_1725204520455.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/bert_classifier_bacnet_klassifizierung_raumlufttechnik_de_5.4.2_3.0_1725204520455.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python
documentAssembler = DocumentAssembler() \
    .setInputCol("text") \
    .setOutputCol("document")

tokenizer = Tokenizer() \
    .setInputCols("document") \
    .setOutputCol("token")

seq_classifier = BertForSequenceClassification.pretrained("bert_classifier_bacnet_klassifizierung_raumlufttechnik","de") \
    .setInputCols(["document", "token"]) \
    .setOutputCol("class")

pipeline = Pipeline(stages=[documentAssembler, tokenizer, seq_classifier])

data = spark.createDataFrame([["PUT YOUR STRING HERE"]]).toDF("text")

result = pipeline.fit(data).transform(data)
```
```scala
val documentAssembler = new DocumentAssembler()
      .setInputCols(Array("text"))
      .setOutputCols(Array("document"))

val tokenizer = new Tokenizer()
    .setInputCols("document")
    .setOutputCol("token")

val seq_classifier = BertForSequenceClassification.pretrained("bert_classifier_bacnet_klassifizierung_raumlufttechnik","de")
    .setInputCols(Array("document", "token"))
    .setOutputCol("class")

val pipeline = new Pipeline().setStages(Array(documentAssembler, tokenizer, seq_classifier))

val data = Seq("PUT YOUR STRING HERE").toDS.toDF("text")

val result = pipeline.fit(data).transform(data)
```

{:.nlu-block}
```python
import nlu
nlu.load("de.classify.raumlufttechnik.bert.by_cm_mueller").predict("""PUT YOUR STRING HERE""")
```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|bert_classifier_bacnet_klassifizierung_raumlufttechnik|
|Compatibility:|Spark NLP 5.4.2+|
|License:|Open Source|
|Edition:|Official|
|Input Labels:|[document, token]|
|Output Labels:|[class]|
|Language:|de|
|Size:|409.2 MB|

## References

References

- https://huggingface.co/cm-mueller/BACnet-Klassifizierung-Raumlufttechnik