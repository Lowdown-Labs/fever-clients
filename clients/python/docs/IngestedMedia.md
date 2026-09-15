# IngestedMedia


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blob_id** | **int** |  | 
**external_ref** | **str** |  | [optional] 

## Example

```python
from fever_client.models.ingested_media import IngestedMedia

# TODO update the JSON string below
json = "{}"
# create an instance of IngestedMedia from a JSON string
ingested_media_instance = IngestedMedia.from_json(json)
# print the JSON string representation of the object
print(IngestedMedia.to_json())

# convert the object into a dict
ingested_media_dict = ingested_media_instance.to_dict()
# create an instance of IngestedMedia from a dict
ingested_media_from_dict = IngestedMedia.from_dict(ingested_media_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


