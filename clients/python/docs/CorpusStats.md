# CorpusStats


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**kinds** | **Dict[str, int]** |  | 
**top_tags** | [**List[CorpusTag]**](CorpusTag.md) |  | 

## Example

```python
from fever_client.models.corpus_stats import CorpusStats

# TODO update the JSON string below
json = "{}"
# create an instance of CorpusStats from a JSON string
corpus_stats_instance = CorpusStats.from_json(json)
# print the JSON string representation of the object
print(CorpusStats.to_json())

# convert the object into a dict
corpus_stats_dict = corpus_stats_instance.to_dict()
# create an instance of CorpusStats from a dict
corpus_stats_from_dict = CorpusStats.from_dict(corpus_stats_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


