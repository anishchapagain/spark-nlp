---
layout: model
title: English finetuned_token_itr0_0_0002_webdiscourse_16_02_2022_21_00_50 DistilBertForTokenClassification from ali2066
author: John Snow Labs
name: finetuned_token_itr0_0_0002_webdiscourse_16_02_2022_21_00_50
date: 2023-11-21
tags: [bert, en, open_source, token_classification, onnx]
task: Named Entity Recognition
language: en
edition: Spark NLP 5.2.0
spark_version: 3.0
supported: true
engine: onnx
annotator: DistilBertForTokenClassification
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained DistilBertForTokenClassification model, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`finetuned_token_itr0_0_0002_webdiscourse_16_02_2022_21_00_50` is a English model originally trained by ali2066.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/finetuned_token_itr0_0_0002_webdiscourse_16_02_2022_21_00_50_en_5.2.0_3.0_1700568882591.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/finetuned_token_itr0_0_0002_webdiscourse_16_02_2022_21_00_50_en_5.2.0_3.0_1700568882591.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python


documentAssembler = DocumentAssembler() \
    .setInputCol("text") \
    .setOutputCol("documents")
    
    
tokenClassifier = DistilBertForTokenClassification.pretrained("finetuned_token_itr0_0_0002_webdiscourse_16_02_2022_21_00_50","en") \
            .setInputCols(["documents","token"]) \
            .setOutputCol("ner")

pipeline = Pipeline().setStages([documentAssembler, tokenClassifier])

pipelineModel = pipeline.fit(data)

pipelineDF = pipelineModel.transform(data)

```
```scala


val documentAssembler = new DocumentAssembler()
    .setInputCol("text") 
    .setOutputCol("embeddings")
    
val tokenClassifier = DistilBertForTokenClassification  
    .pretrained("finetuned_token_itr0_0_0002_webdiscourse_16_02_2022_21_00_50", "en")
    .setInputCols(Array("documents","token")) 
    .setOutputCol("ner") 

val pipeline = new Pipeline().setStages(Array(documentAssembler, tokenClassifier))

val pipelineModel = pipeline.fit(data)

val pipelineDF = pipelineModel.transform(data)


```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|finetuned_token_itr0_0_0002_webdiscourse_16_02_2022_21_00_50|
|Compatibility:|Spark NLP 5.2.0+|
|License:|Open Source|
|Edition:|Official|
|Input Labels:|[documents, token]|
|Output Labels:|[ner]|
|Language:|en|
|Size:|247.2 MB|

## References

https://huggingface.co/ali2066/finetuned_token_itr0_0.0002_webDiscourse_16_02_2022-21_00_50