---
layout: model
title: English debiasing_pre_trained_contextualised_embeddings_distil_bert DistilBertEmbeddings from Daniel-Saeedi
author: John Snow Labs
name: debiasing_pre_trained_contextualised_embeddings_distil_bert
date: 2024-12-15
tags: [distilbert, en, open_source, fill_mask, onnx]
task: Embeddings
language: en
edition: Spark NLP 5.5.1
spark_version: 3.0
supported: true
engine: onnx
annotator: DistilBertEmbeddings
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained DistilBertEmbeddings  model, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`debiasing_pre_trained_contextualised_embeddings_distil_bert` is a English model originally trained by Daniel-Saeedi.

## Predicted Entities



{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/debiasing_pre_trained_contextualised_embeddings_distil_bert_en_5.5.1_3.0_1734289221102.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/debiasing_pre_trained_contextualised_embeddings_distil_bert_en_5.5.1_3.0_1734289221102.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python
document_assembler = DocumentAssembler() \
    .setInputCol("text") \
    .setOutputCol("documents")
    
    
embeddings =DistilBertEmbeddings.pretrained("debiasing_pre_trained_contextualised_embeddings_distil_bert","en") \
            .setInputCols(["documents","token"]) \
            .setOutputCol("embeddings")

pipeline = Pipeline().setStages([document_assembler, embeddings])

pipelineModel = pipeline.fit(data)

pipelineDF = pipelineModel.transform(data)
```
```scala
val document_assembler = new DocumentAssembler()
    .setInputCol("text") 
    .setOutputCol("embeddings")
    
val embeddings = DistilBertEmbeddings 
    .pretrained("debiasing_pre_trained_contextualised_embeddings_distil_bert", "en")
    .setInputCols(Array("documents","token")) 
    .setOutputCol("embeddings") 

val pipeline = new Pipeline().setStages(Array(document_assembler, embeddings))

val pipelineModel = pipeline.fit(data)

val pipelineDF = pipelineModel.transform(data)
```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|debiasing_pre_trained_contextualised_embeddings_distil_bert|
|Compatibility:|Spark NLP 5.5.1+|
|License:|Open Source|
|Edition:|Official|
|Input Labels:|[document, token]|
|Output Labels:|[distilbert]|
|Language:|en|
|Size:|247.2 MB|

## References

References

https://huggingface.co/Daniel-Saeedi/debiasing_pre-trained_contextualised_embeddings_distil_bert