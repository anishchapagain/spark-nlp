---
layout: model
title: English bert_network_packet_flow_header_payload DistilBertForSequenceClassification from rdpahalavan
author: John Snow Labs
name: bert_network_packet_flow_header_payload
date: 2023-11-18
tags: [bert, en, open_source, sequence_classification, onnx]
task: Text Classification
language: en
edition: Spark NLP 5.2.0
spark_version: 3.0
supported: true
engine: onnx
annotator: DistilBertForSequenceClassification
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained DistilBertForSequenceClassification model, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`bert_network_packet_flow_header_payload` is a English model originally trained by rdpahalavan.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/bert_network_packet_flow_header_payload_en_5.2.0_3.0_1700346824536.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/bert_network_packet_flow_header_payload_en_5.2.0_3.0_1700346824536.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

document_assembler = DocumentAssembler()\
    .setInputCol("text")\
    .setOutputCol("document")

tokenizer = Tokenizer()\
    .setInputCols("document")\
    .setOutputCol("token")  
    
sequenceClassifier = DistilBertForSequenceClassification.pretrained("bert_network_packet_flow_header_payload","en")\
            .setInputCols(["document","token"])\
            .setOutputCol("class")

pipeline = Pipeline().setStages([document_assembler, tokenizer, sequenceClassifier])

data = spark.createDataFrame([["PUT YOUR STRING HERE"]]).toDF("text")

result = pipeline.fit(data).transform(data)

```
```scala

val document_assembler = new DocumentAssembler()
    .setInputCol("text")
    .setOutputCol("document")

val tokenizer = new Tokenizer()
    .setInputCols("document") 
    .setOutputCol("token")  
    
val sequenceClassifier = DistilBertForSequenceClassification.pretrained("bert_network_packet_flow_header_payload","en")
            .setInputCols(Array("document","token"))
            .setOutputCol("class")

val pipeline = new Pipeline().setStages(Array(documentAssembler, tokenizer, sequenceClassifier))

val data = Seq("PUT YOUR STRING HERE").toDS.toDF("text")

val result = pipeline.fit(data).transform(data)


```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|bert_network_packet_flow_header_payload|
|Compatibility:|Spark NLP 5.2.0+|
|License:|Open Source|
|Edition:|Official|
|Input Labels:|[documents, token]|
|Output Labels:|[class]|
|Language:|en|
|Size:|246.0 MB|

## References

https://huggingface.co/rdpahalavan/bert-network-packet-flow-header-payload