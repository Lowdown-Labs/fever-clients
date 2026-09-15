# DuplicatesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customer_id** | **str** | Restrict the scan to media tagged with this customer_id. A scoped key is always forced to its own customer_id; an admin key may pass any customer_id or none (all customers). | [optional] 
**customer_ids** | **List[str]** | Admin only: restrict the scan to this set of customers. Spanning more than one customer is how cross-account duplicates (the same item submitted under different accounts) are found. Ignored for scoped keys, which stay pinned. | [optional] 
**limit** | **int** | Max items to scan for near-duplicates. | [optional] [default to 500]
**threshold** | **float** | Similarity cutoff 0..1; higher is stricter (1.0 &#x3D; near-identical). | [optional] [default to 0.92]

## Example

```python
from fever_client.models.duplicates_request import DuplicatesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of DuplicatesRequest from a JSON string
duplicates_request_instance = DuplicatesRequest.from_json(json)
# print the JSON string representation of the object
print(DuplicatesRequest.to_json())

# convert the object into a dict
duplicates_request_dict = duplicates_request_instance.to_dict()
# create an instance of DuplicatesRequest from a dict
duplicates_request_from_dict = DuplicatesRequest.from_dict(duplicates_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


