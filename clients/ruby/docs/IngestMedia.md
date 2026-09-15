# FeverClient::IngestMedia

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **caption** | **String** | Optional caption/keywords; indexed at the highest text-search weight. | [optional] |
| **customer_id** | **String** | Optional tag attributing this item to one of your customers; filterable at search time. | [optional] |
| **data** | **String** | Base64-encoded media item bytes. | [optional] |
| **metadata** | **Hash&lt;String, Object&gt;** | Opaque JSON returned with search hits. | [optional] |
| **strip_exif** | **Boolean** | Skip EXIF extraction/retention for this item. | [optional][default to false] |
| **tags** | **Array&lt;String&gt;** | Optional tags for this item; indexed for text search and returned on hits. Merged with the appliance&#39;s zero-shot autotags. | [optional] |
| **url** | **String** | An s3:// URI to one media item you already store, instead of inline bytes. | [optional] |

## Example

```ruby
require 'fever_client'

instance = FeverClient::IngestMedia.new(
  caption: null,
  customer_id: null,
  data: null,
  metadata: null,
  strip_exif: null,
  tags: null,
  url: null
)
```

