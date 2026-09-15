# IngestMedia


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**caption** | **str** | Optional caption/keywords; indexed at the highest text-search weight. | [optional] 
**customer_id** | **str** | Optional tag attributing this item to one of your customers; filterable at search time. | [optional] 
**data** | **str** | Base64-encoded media item bytes. | [optional] 
**metadata** | **Dict[str, object]** | Opaque JSON returned with search hits. | [optional] 
**strip_exif** | **bool** | Skip EXIF extraction/retention for this item. | [optional] [default to False]
**tags** | **List[str]** | Optional tags for this item; indexed for text search and returned on hits. Merged with the appliance&#39;s zero-shot autotags. | [optional] 
**url** | **str** | An s3:// URI to one media item you already store, instead of inline bytes. | [optional] 

## Example

```python
from fever_client.models.ingest_media import IngestMedia

# TODO update the JSON string below
json = "{}"
# create an instance of IngestMedia from a JSON string
ingest_media_instance = IngestMedia.from_json(json)
# print the JSON string representation of the object
print(IngestMedia.to_json())

# convert the object into a dict
ingest_media_dict = ingest_media_instance.to_dict()
# create an instance of IngestMedia from a dict
ingest_media_from_dict = IngestMedia.from_dict(ingest_media_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


