# ImportRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customer_id** | **str** | Tag every imported row with this customer_id (admin default: preserve the file&#39;s own). | [optional] 
**s3_uri** | **str** | s3://bucket/prefix of a previous FEVER export (manifest.json + shard NDJSON). | 

## Example

```python
from fever_client.models.import_request import ImportRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ImportRequest from a JSON string
import_request_instance = ImportRequest.from_json(json)
# print the JSON string representation of the object
print(ImportRequest.to_json())

# convert the object into a dict
import_request_dict = import_request_instance.to_dict()
# create an instance of ImportRequest from a dict
import_request_from_dict = ImportRequest.from_dict(import_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


