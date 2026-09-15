# CreateKeyRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customer_id** | **str** | For a scoped key, the single customer_id every request with this key is forced to. Must be empty for an admin key. | [optional] 
**name** | **str** | Optional label for this API key (e.g. which app or integration uses it). | [optional] 
**role** | **str** | &#39;admin&#39; keys search/ingest across all customers and may pass any customer_id; &#39;scoped&#39; keys are locked server-side to one customer_id. If omitted it is inferred from customer_id (present means scoped, absent means admin). | [optional] 

## Example

```python
from fever_client.models.create_key_request import CreateKeyRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CreateKeyRequest from a JSON string
create_key_request_instance = CreateKeyRequest.from_json(json)
# print the JSON string representation of the object
print(CreateKeyRequest.to_json())

# convert the object into a dict
create_key_request_dict = create_key_request_instance.to_dict()
# create an instance of CreateKeyRequest from a dict
create_key_request_from_dict = CreateKeyRequest.from_dict(create_key_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


