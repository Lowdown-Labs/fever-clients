# IngestRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**media** | [**List[IngestMedia]**](IngestMedia.md) | 1..N media items to ingest inline. | [optional] 
**overwrite** | **bool** | Re-embed and update items already indexed (clobber). Default false &#x3D; delta ingest: content already indexed is skipped, so re-running an ingest only processes new items. | [optional] [default to False]
**source** | [**IngestSource**](IngestSource.md) | Ingest every media item under an S3 prefix instead of sending bytes. | [optional] 
**target_res** | **int** | Resolution to index this batch at, in pixels (rounded to a multiple of 16). Images are resized to this before embedding; higher means more detail but slower. Leave unset for the fast production default (64), which retains most of the search quality at a fraction of the cost. | [optional] 

## Example

```python
from fever_client.models.ingest_request import IngestRequest

# TODO update the JSON string below
json = "{}"
# create an instance of IngestRequest from a JSON string
ingest_request_instance = IngestRequest.from_json(json)
# print the JSON string representation of the object
print(IngestRequest.to_json())

# convert the object into a dict
ingest_request_dict = ingest_request_instance.to_dict()
# create an instance of IngestRequest from a dict
ingest_request_from_dict = IngestRequest.from_dict(ingest_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


