---
layout: model
title: English shuffled_nodes_augmented_graphs_without_edge_document_level_basebart_run3 BartTransformer from sheoran95
author: John Snow Labs
name: shuffled_nodes_augmented_graphs_without_edge_document_level_basebart_run3
date: 2025-01-30
tags: [en, open_source, onnx, text_generation, bart]
task: [Question Answering, Summarization, Translation, Text Generation]
language: en
edition: Spark NLP 5.5.1
spark_version: 3.0
supported: true
engine: onnx
annotator: BartTransformer
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained BartTransformer model, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`shuffled_nodes_augmented_graphs_without_edge_document_level_basebart_run3` is a English model originally trained by sheoran95.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/shuffled_nodes_augmented_graphs_without_edge_document_level_basebart_run3_en_5.5.1_3.0_1738263317380.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/shuffled_nodes_augmented_graphs_without_edge_document_level_basebart_run3_en_5.5.1_3.0_1738263317380.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python
 
documentAssembler = DocumentAssembler() \
      .setInputCol("text") \
      .setOutputCol("document")

seq2seq = BartTransformer.pretrained("shuffled_nodes_augmented_graphs_without_edge_document_level_basebart_run3","en") \
      .setInputCols(["documents"]) \
      .setOutputCol("generation")       
        
pipeline = Pipeline().setStages([documentAssembler, seq2seq])
data = spark.createDataFrame([["I love spark-nlp"]]).toDF("text")
pipelineModel = pipeline.fit(data)
pipelineDF = pipelineModel.transform(data)

```
```scala

val documentAssembler = new DocumentAssembler() 
    .setInputCol("text") 
    .setOutputCol("document")
    
val seq2seq = BartTransformer.pretrained("shuffled_nodes_augmented_graphs_without_edge_document_level_basebart_run3","en") 
    .setInputCols(Array("documents")) 
    .setOutputCol("generation")

val pipeline = new Pipeline().setStages(Array(documentAssembler, seq2seq))
val data = Seq("I love spark-nlp").toDF("text")
val pipelineModel = pipeline.fit(data)
val pipelineDF = pipelineModel.transform(data)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|shuffled_nodes_augmented_graphs_without_edge_document_level_basebart_run3|
|Compatibility:|Spark NLP 5.5.1+|
|License:|Open Source|
|Edition:|Official|
|Input Labels:|[document]|
|Output Labels:|[output]|
|Language:|en|
|Size:|810.4 MB|

## References

https://huggingface.co/sheoran95/shuffled_nodes_augmented_graphs_without_edge_document_level_baseBART_run3