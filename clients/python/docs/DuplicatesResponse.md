# DuplicatesResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clusters** | **int** | Number of near-duplicate clusters found. | 
**duplicate_clusters** | [**List[DuplicateCluster]**](DuplicateCluster.md) | The near-duplicate clusters, largest and tightest first. | [optional] 
**total_duplicates** | **int** | Count of items that fall in any cluster of size &gt;&#x3D; 2. | 

## Example

```python
from fever_client.models.duplicates_response import DuplicatesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of DuplicatesResponse from a JSON string
duplicates_response_instance = DuplicatesResponse.from_json(json)
# print the JSON string representation of the object
print(DuplicatesResponse.to_json())

# convert the object into a dict
duplicates_response_dict = duplicates_response_instance.to_dict()
# create an instance of DuplicatesResponse from a dict
duplicates_response_from_dict = DuplicatesResponse.from_dict(duplicates_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


