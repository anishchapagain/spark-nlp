---
layout: model
title: DistilBERT base model (uncased)
author: John Snow Labs
name: distilbert_base_uncased
date: 2025-06-24
tags: [distilbert, en, english, embeddings, open_source, onnx, openvino]
task: Embeddings
language: en
edition: Spark NLP 5.5.1
spark_version: 3.0
supported: true
engine: openvino
annotator: DistilBertEmbeddings
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

This model is a distilled version of the [BERT base model](https://huggingface.co/bert-base-cased). It was introduced in [this paper](https://arxiv.org/abs/1910.01108). The code for the distillation process can be found [here](https://github.com/huggingface/transformers/tree/master/examples/research_projects/distillation). This model is uncased: it does not make a difference between english and English.

## Predicted Entities



{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/distilbert_base_uncased_en_5.5.1_3.0_1750780431485.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/distilbert_base_uncased_en_5.5.1_3.0_1750780431485.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python
embeddings = DistilBertEmbeddings.pretrained("distilbert_base_uncased", "en") \
.setInputCols("sentence", "token") \
.setOutputCol("embeddings")
nlp_pipeline = Pipeline(stages=[document_assembler, sentence_detector, tokenizer, embeddings])
```
```scala
val embeddings = DistilBertEmbeddings.pretrained("distilbert_base_uncased", "en")
.setInputCols("sentence", "token")
.setOutputCol("embeddings")
val pipeline = new Pipeline().setStages(Array(document_assembler, sentence_detector, tokenizer, embeddings))
```

{:.nlu-block}
```python
import nlu
nlu.load("en.embed.distilbert.base.uncased").predict("""Put your text here.""")
```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|distilbert_base_uncased|
|Compatibility:|Spark NLP 5.5.1+|
|License:|Open Source|
|Edition:|Official|
|Input Labels:|[document, token]|
|Output Labels:|[distilbert]|
|Language:|en|
|Size:|247.2 MB|

## References

References

References

[https://huggingface.co/distilbert-base-uncased](https://huggingface.co/distilbert-base-uncased)

## Benchmarking

```bash


Benchmarking


When fine-tuned on downstream tasks, this model achieves the following results:

Glue test results:

| Task | MNLI | QQP  | QNLI | SST-2 | CoLA | STS-B | MRPC | RTE  |
|:----:|:----:|:----:|:----:|:-----:|:----:|:-----:|:----:|:----:|
|      | 82.2 | 88.5 | 89.2 | 91.3  | 51.3 | 85.8  | 87.5 | 59.9 |
```