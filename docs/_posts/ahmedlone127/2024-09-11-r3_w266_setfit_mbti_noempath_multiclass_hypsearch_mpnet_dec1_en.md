---
layout: model
title: English r3_w266_setfit_mbti_noempath_multiclass_hypsearch_mpnet_dec1 MPNetEmbeddings from shrinivasbjoshi
author: John Snow Labs
name: r3_w266_setfit_mbti_noempath_multiclass_hypsearch_mpnet_dec1
date: 2024-09-11
tags: [en, open_source, onnx, embeddings, mpnet]
task: Embeddings
language: en
edition: Spark NLP 5.5.0
spark_version: 3.0
supported: true
engine: onnx
annotator: MPNetEmbeddings
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained MPNetEmbeddings model, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`r3_w266_setfit_mbti_noempath_multiclass_hypsearch_mpnet_dec1` is a English model originally trained by shrinivasbjoshi.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/r3_w266_setfit_mbti_noempath_multiclass_hypsearch_mpnet_dec1_en_5.5.0_3.0_1726054782357.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/r3_w266_setfit_mbti_noempath_multiclass_hypsearch_mpnet_dec1_en_5.5.0_3.0_1726054782357.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python
 
documentAssembler = DocumentAssembler() \
      .setInputCol("text") \
      .setOutputCol("document")
    
embeddings = MPNetEmbeddings.pretrained("r3_w266_setfit_mbti_noempath_multiclass_hypsearch_mpnet_dec1","en") \
      .setInputCols(["document"]) \
      .setOutputCol("embeddings")       
        
pipeline = Pipeline().setStages([documentAssembler, embeddings])
data = spark.createDataFrame([["I love spark-nlp"]]).toDF("text")
pipelineModel = pipeline.fit(data)
pipelineDF = pipelineModel.transform(data)

```
```scala

val documentAssembler = new DocumentAssembler() 
    .setInputCol("text") 
    .setOutputCol("document")
    
val embeddings = MPNetEmbeddings.pretrained("r3_w266_setfit_mbti_noempath_multiclass_hypsearch_mpnet_dec1","en") 
    .setInputCols(Array("document")) 
    .setOutputCol("embeddings")

val pipeline = new Pipeline().setStages(Array(documentAssembler, embeddings))
val data = Seq("I love spark-nlp").toDF("text")
val pipelineModel = pipeline.fit(data)
val pipelineDF = pipelineModel.transform(data)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|r3_w266_setfit_mbti_noempath_multiclass_hypsearch_mpnet_dec1|
|Compatibility:|Spark NLP 5.5.0+|
|License:|Open Source|
|Edition:|Official|
|Input Labels:|[document]|
|Output Labels:|[mpnet]|
|Language:|en|
|Size:|407.3 MB|

## References

https://huggingface.co/shrinivasbjoshi/r3-w266-setfit-mbti-noempath-multiclass-hypsearch-mpnet-dec1