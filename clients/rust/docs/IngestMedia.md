# IngestMedia

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**caption** | Option<**String**> | Optional caption/keywords; indexed at the highest text-search weight. | [optional]
**collection_id** | Option<**String**> | Optional grouping you own (project, case, site - FEVER stores and filters it, never interprets it). Filterable at search time; returned on hits. | [optional]
**customer_id** | Option<**String**> | Optional tag attributing this item to one of your customers; filterable at search time. | [optional]
**data** | Option<**String**> | Base64-encoded media item bytes. | [optional]
**filename** | Option<**String**> | Original file name. Drives format detection for inline documents and LiDAR (extensions like .csv or .las - office formats are recognized by their bytes alone) and is stored on the blob for media info and attachment listings. | [optional]
**metadata** | Option<**std::collections::HashMap<String, serde_json::Value>**> | Opaque JSON returned with search hits. | [optional]
**parent_ref** | Option<**String**> | Optional pointer to a related parent asset (its external_ref, key, or blob_id). Non-searchable companions such as LiDAR scans declare the photo or video they belong to; the parent's record lists them back as attachments. | [optional]
**strip_exif** | Option<**bool**> | Skip EXIF extraction/retention for this item. | [optional][default to false]
**tags** | Option<**Vec<String>**> | Optional tags for this item; indexed for text search and returned on hits. Merged with the appliance's zero-shot autotags. | [optional]
**url** | Option<**String**> | An s3:// URI to one media item you already store, instead of inline bytes. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


