# CorpusTag


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** |  | 
**tag** | **str** |  | 

## Example

```python
from fever_client.models.corpus_tag import CorpusTag

# TODO update the JSON string below
json = "{}"
# create an instance of CorpusTag from a JSON string
corpus_tag_instance = CorpusTag.from_json(json)
# print the JSON string representation of the object
print(CorpusTag.to_json())

# convert the object into a dict
corpus_tag_dict = corpus_tag_instance.to_dict()
# create an instance of CorpusTag from a dict
corpus_tag_from_dict = CorpusTag.from_dict(corpus_tag_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


