---
layout: model
title: German ElectraForQuestionAnswering Distilled model (from deepset)
author: John Snow Labs
name: electra_qa_g_base_germanquad_distilled
date: 2023-11-16
tags: [de, open_source, electra, question_answering, onnx]
task: Question Answering
language: de
edition: Spark NLP 5.2.0
spark_version: 3.0
supported: true
engine: onnx
annotator: BertForQuestionAnswering
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained Question Answering model, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP. `gelectra-base-germanquad-distilled` is a German model originally trained by `deepset`.

## Predicted Entities



{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/electra_qa_g_base_germanquad_distilled_de_5.2.0_3.0_1700100818667.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/electra_qa_g_base_germanquad_distilled_de_5.2.0_3.0_1700100818667.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python
documentAssembler = MultiDocumentAssembler() \
.setInputCols(["question", "context"]) \
.setOutputCols(["document_question", "document_context"])

spanClassifier = BertForQuestionAnswering.pretrained("electra_qa_g_base_germanquad_distilled","de") \
.setInputCols(["document_question", "document_context"]) \
.setOutputCol("answer")\
.setCaseSensitive(True)

pipeline = Pipeline(stages=[documentAssembler, spanClassifier])

data = spark.createDataFrame([["Was ist mein Name?", "Mein Name ist Clara und ich lebe in Berkeley."]]).toDF("question", "context")

result = pipeline.fit(data).transform(data)
```
```scala
val documentAssembler = new MultiDocumentAssembler() 
.setInputCols(Array("question", "context")) 
.setOutputCols(Array("document_question", "document_context"))

val spanClassifer = BertForQuestionAnswering.pretrained("electra_qa_g_base_germanquad_distilled","de") 
.setInputCols(Array("document", "token")) 
.setOutputCol("answer")
.setCaseSensitive(true)

val pipeline = new Pipeline().setStages(Array(documentAssembler, spanClassifier))

val data = Seq("Was ist mein Name?", "Mein Name ist Clara und ich lebe in Berkeley.").toDF("question", "context")

val result = pipeline.fit(data).transform(data)
```

{:.nlu-block}
```python
import nlu
nlu.load("de.answer_question.electra.distilled_base").predict("""Was ist mein Name?|||"Mein Name ist Clara und ich lebe in Berkeley.""")
```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|electra_qa_g_base_germanquad_distilled|
|Compatibility:|Spark NLP 5.2.0+|
|License:|Open Source|
|Edition:|Official|
|Input Labels:|[document_question, document_context]|
|Output Labels:|[answer]|
|Language:|de|
|Size:|410.2 MB|
|Case sensitive:|true|
|Max sentence length:|512|

## References

References

- https://huggingface.co/deepset/gelectra-base-germanquad-distilled
- https://deepset.ai/germanquad
- https://deepset.ai/german-bert
- https://github.com/deepset-ai/FARM
- https://github.com/deepset-ai/haystack/
- https://haystack.deepset.ai/community/join