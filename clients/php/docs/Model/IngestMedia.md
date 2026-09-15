# IngestMedia

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**caption** | **string** | Optional caption/keywords; indexed at the highest text-search weight. | [optional]
**customer_id** | **string** | Optional tag attributing this item to one of your customers; filterable at search time. | [optional]
**data** | **string** | Base64-encoded media item bytes. | [optional]
**metadata** | **array<string,mixed>** | Opaque JSON returned with search hits. | [optional]
**strip_exif** | **bool** | Skip EXIF extraction/retention for this item. | [optional] [default to false]
**tags** | **string[]** | Optional tags for this item; indexed for text search and returned on hits. Merged with the appliance&#39;s zero-shot autotags. | [optional]
**url** | **string** | An s3:// URI to one media item you already store, instead of inline bytes. | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
