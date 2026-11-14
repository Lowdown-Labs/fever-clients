# DatasetItemsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blob_ids** | **List[int]** |  | 

## Example

```python
from fever_client.models.dataset_items_request import DatasetItemsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of DatasetItemsRequest from a JSON string
dataset_items_request_instance = DatasetItemsRequest.from_json(json)
# print the JSON string representation of the object
print(DatasetItemsRequest.to_json())

# convert the object into a dict
dataset_items_request_dict = dataset_items_request_instance.to_dict()
# create an instance of DatasetItemsRequest from a dict
dataset_items_request_from_dict = DatasetItemsRequest.from_dict(dataset_items_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


