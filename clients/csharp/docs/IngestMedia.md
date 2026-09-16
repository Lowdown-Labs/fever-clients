# LowdownLabs.Fever.Model.IngestMedia

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Caption** | **string** | Optional caption/keywords; indexed at the highest text-search weight. | [optional] 
**CollectionId** | **string** | Optional grouping you own (project, case, site - FEVER stores and filters it, never interprets it). Filterable at search time; returned on hits. | [optional] 
**CustomerId** | **string** | Optional tag attributing this item to one of your customers; filterable at search time. | [optional] 
**Data** | **string** | Base64-encoded media item bytes. | [optional] 
**Filename** | **string** | Original file name. Drives format detection for inline documents and LiDAR (extensions like .csv or .las - office formats are recognized by their bytes alone) and is stored on the blob for media info and attachment listings. | [optional] 
**Metadata** | **Dictionary&lt;string, Object&gt;** | Opaque JSON returned with search hits. | [optional] 
**ParentRef** | **string** | Optional pointer to a related parent asset (its external_ref, key, or blob_id). Non-searchable companions such as LiDAR scans declare the photo or video they belong to; the parent&#39;s record lists them back as attachments. | [optional] 
**StripExif** | **bool** | Skip EXIF extraction/retention for this item. | [optional] [default to false]
**Tags** | **List&lt;string&gt;** | Optional tags for this item; indexed for text search and returned on hits. Merged with the appliance&#39;s zero-shot autotags. | [optional] 
**Url** | **string** | An s3:// URI to one media item you already store, instead of inline bytes. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

