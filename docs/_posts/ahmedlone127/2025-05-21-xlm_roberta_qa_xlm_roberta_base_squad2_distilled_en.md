---
layout: model
title: English XlmRoBertaForQuestionAnswering (from deepset)
author: John Snow Labs
name: xlm_roberta_qa_xlm_roberta_base_squad2_distilled
date: 2025-05-21
tags: [en, open_source, question_answering, xlmroberta, onnx, openvino]
task: Question Answering
language: en
edition: Spark NLP 5.5.1
spark_version: 3.0
supported: true
engine: openvino
annotator: XlmRoBertaForQuestionAnswering
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained Question Answering model, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP. `xlm-roberta-base-squad2-distilled` is a English model originally trained by `deepset`.

## Predicted Entities



{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/xlm_roberta_qa_xlm_roberta_base_squad2_distilled_en_5.5.1_3.0_1747822363958.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/xlm_roberta_qa_xlm_roberta_base_squad2_distilled_en_5.5.1_3.0_1747822363958.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python
document_assembler = MultiDocumentAssembler() \ 
.setInputCols(["question", "context"]) \
.setOutputCols(["document_question", "document_context"])

spanClassifier = XlmRoBertaForQuestionAnswering.pretrained("xlm_roberta_qa_xlm_roberta_base_squad2_distilled","en") \
.setInputCols(["document_question", "document_context"]) \
.setOutputCol("answer") \
.setCaseSensitive(True)

pipeline = Pipeline().setStages([
document_assembler,
spanClassifier
])

example = spark.createDataFrame([["What's my name?", "My name is Clara and I live in Berkeley."]]).toDF("question", "context")

result = pipeline.fit(example).transform(example)
```
```scala
val document = new MultiDocumentAssembler()
.setInputCols(Array("question", "context")) 
.setOutputCols(Array("document_question", "document_context"))

val spanClassifier = XlmRoBertaForQuestionAnswering
.pretrained("xlm_roberta_qa_xlm_roberta_base_squad2_distilled","en")
.setInputCols(Array("document_question", "document_context"))
.setOutputCol("answer")
.setCaseSensitive(true)
.setMaxSentenceLength(512)

val pipeline = new Pipeline().setStages(Array(document, spanClassifier))

val example = Seq(
("Where was John Lenon born?", "John Lenon was born in London and lived in Paris. My name is Sarah and I live in London."),
("What's my name?", "My name is Clara and I live in Berkeley."))
.toDF("question", "context")

val result = pipeline.fit(example).transform(example)
```

{:.nlu-block}
```python
import nlu
nlu.load("en.answer_question.squadv2.xlm_roberta.distilled_base").predict("""What's my name?|||"My name is Clara and I live in Berkeley.""")
```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|xlm_roberta_qa_xlm_roberta_base_squad2_distilled|
|Compatibility:|Spark NLP 5.5.1+|
|License:|Open Source|
|Edition:|Official|
|Input Labels:|[document_question, document_context]|
|Output Labels:|[answer]|
|Language:|en|
|Size:|853.7 MB|

## References

References

References

- https://huggingface.co/deepset/xlm-roberta-base-squad2-distilled
- https://www.linkedin.com/company/deepset-ai/
- https://twitter.com/deepset_ai
- http://www.deepset.ai/jobs
- https://haystack.deepset.ai/community/join
- https://github.com/deepset-ai/haystack/
- https://github.com/deepset-ai/FARM
- https://deepset.ai/germanquad
- https://deepset.ai
- https://deepset.ai/german-bert
- https://github.com/deepset-ai/haystack/discussions