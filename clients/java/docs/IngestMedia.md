

# IngestMedia


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**caption** | **String** | Optional caption/keywords; indexed at the highest text-search weight. |  [optional] |
|**customerId** | **String** | Optional tag attributing this item to one of your customers; filterable at search time. |  [optional] |
|**data** | **String** | Base64-encoded media item bytes. |  [optional] |
|**metadata** | **Map&lt;String, Object&gt;** | Opaque JSON returned with search hits. |  [optional] |
|**stripExif** | **Boolean** | Skip EXIF extraction/retention for this item. |  [optional] |
|**tags** | **List&lt;String&gt;** | Optional tags for this item; indexed for text search and returned on hits. Merged with the appliance&#39;s zero-shot autotags. |  [optional] |
|**url** | **String** | An s3:// URI to one media item you already store, instead of inline bytes. |  [optional] |



