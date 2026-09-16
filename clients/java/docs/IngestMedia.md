

# IngestMedia


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**caption** | **String** | Optional caption/keywords; indexed at the highest text-search weight. |  [optional] |
|**collectionId** | **String** | Optional grouping you own (project, case, site - FEVER stores and filters it, never interprets it). Filterable at search time; returned on hits. |  [optional] |
|**customerId** | **String** | Optional tag attributing this item to one of your customers; filterable at search time. |  [optional] |
|**data** | **String** | Base64-encoded media item bytes. |  [optional] |
|**filename** | **String** | Original file name. Drives format detection for inline documents and LiDAR (extensions like .csv or .las - office formats are recognized by their bytes alone) and is stored on the blob for media info and attachment listings. |  [optional] |
|**metadata** | **Map&lt;String, Object&gt;** | Opaque JSON returned with search hits. |  [optional] |
|**parentRef** | **String** | Optional pointer to a related parent asset (its external_ref, key, or blob_id). Non-searchable companions such as LiDAR scans declare the photo or video they belong to; the parent&#39;s record lists them back as attachments. |  [optional] |
|**stripExif** | **Boolean** | Skip EXIF extraction/retention for this item. |  [optional] |
|**tags** | **List&lt;String&gt;** | Optional tags for this item; indexed for text search and returned on hits. Merged with the appliance&#39;s zero-shot autotags. |  [optional] |
|**url** | **String** | An s3:// URI to one media item you already store, instead of inline bytes. |  [optional] |



