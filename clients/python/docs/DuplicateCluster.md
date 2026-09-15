# DuplicateCluster


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**member_customers** | **List[Optional[str]]** | customer_id of each member, parallel to members; a cluster whose distinct customer count exceeds 1 is duplicated across accounts. | [optional] 
**members** | **List[int]** | blob_ids of the items in this cluster. | 
**size** | **int** | Number of items in this near-duplicate cluster. | 
**tightness** | **float** | Minimum pairwise cosine similarity across the cluster. | 

## Example

```python
from fever_client.models.duplicate_cluster import DuplicateCluster

# TODO update the JSON string below
json = "{}"
# create an instance of DuplicateCluster from a JSON string
duplicate_cluster_instance = DuplicateCluster.from_json(json)
# print the JSON string representation of the object
print(DuplicateCluster.to_json())

# convert the object into a dict
duplicate_cluster_dict = duplicate_cluster_instance.to_dict()
# create an instance of DuplicateCluster from a dict
duplicate_cluster_from_dict = DuplicateCluster.from_dict(duplicate_cluster_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


