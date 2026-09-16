# IngestMedia


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**caption** | **str** | Optional caption/keywords; indexed at the highest text-search weight. | [optional] 
**collection_id** | **str** | Optional grouping you own (project, case, site - FEVER stores and filters it, never interprets it). Filterable at search time; returned on hits. | [optional] 
**customer_id** | **str** | Optional tag attributing this item to one of your customers; filterable at search time. | [optional] 
**data** | **str** | Base64-encoded media item bytes. | [optional] 
**filename** | **str** | Original file name. Drives format detection for inline documents and LiDAR (extensions like .csv or .las - office formats are recognized by their bytes alone) and is stored on the blob for media info and attachment listings. | [optional] 
**metadata** | **Dict[str, object]** | Opaque JSON returned with search hits. | [optional] 
**parent_ref** | **str** | Optional pointer to a related parent asset (its external_ref, key, or blob_id). Non-searchable companions such as LiDAR scans declare the photo or video they belong to; the parent&#39;s record lists them back as attachments. | [optional] 
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


