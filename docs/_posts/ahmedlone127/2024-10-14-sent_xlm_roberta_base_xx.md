---
layout: model
title: XLM-RoBERTa Base Sentence Embeddings (sent_xlm_roberta_base)
author: John Snow Labs
name: sent_xlm_roberta_base
date: 2024-10-14
tags: [multilingual, xx, sentence_embeddings, xlm_roberta, open_source, tensorflow]
task: Embeddings
language: xx
edition: Spark NLP 5.5.0
spark_version: 3.0
supported: true
engine: tensorflow
annotator: XlmRoBertaSentenceEmbeddings
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

[XLM-RoBERTa](https://ai.facebook.com/blog/-xlm-r-state-of-the-art-cross-lingual-understanding-through-self-supervision/) is a scaled cross-lingual sentence encoder. It is trained on 2.5T of data across 100 languages data filtered from Common Crawl. XLM-R achieves state-of-the-arts results on multiple cross-lingual benchmarks.

The XLM-RoBERTa model was proposed in [Unsupervised Cross-lingual Representation Learning at Scale](https://arxiv.org/abs/1911.02116) by Alexis Conneau, Kartikay Khandelwal, Naman Goyal, Vishrav Chaudhary, Guillaume Wenzek, Francisco GuzmÃ¡n, Edouard Grave, Myle Ott, Luke Zettlemoyer, and Veselin Stoyanov. 

It is based on Facebook's RoBERTa model released in 2019. It is a large multi-lingual language model, trained on 2.5TB of filtered CommonCrawl data.

## Predicted Entities



{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/sent_xlm_roberta_base_xx_5.5.0_3.0_1728933428578.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/sent_xlm_roberta_base_xx_5.5.0_3.0_1728933428578.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python
embeddings = XlmRoBertaSentenceEmbeddings.pretrained("sent_xlm_roberta_base", "xx") \
      .setInputCols("sentence") \
      .setOutputCol("embeddings")
```
```scala
val embeddings = XlmRoBertaSentenceEmbeddings.pretrained("sent_xlm_roberta_base", "xx")
      .setInputCols("sentence")
      .setOutputCol("embeddings")
```

{:.nlu-block}
```python
import nlu
nlu.load("xx.embed_sentence.xlm_roberta.base").predict("""Put your text here.""")
```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|sent_xlm_roberta_base|
|Compatibility:|Spark NLP 5.5.0+|
|License:|Open Source|
|Edition:|Official|
|Input Labels:|[sentence]|
|Output Labels:|[sentence_embeddings]|
|Language:|xx|
|Size:|655.0 MB|
|Case sensitive:|true|
|Max sentence length:|32|

## References

https://huggingface.co/xlm-roberta-base