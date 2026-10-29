# FeverClient::IngestedMedia

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **blob_id** | **Integer** |  |  |
| **customer_id** | **String** | Echoed only when the ingest response carries embeddings (FEVER_RETURN_EMBEDDING_ON_INGEST / embedding-only mode). | [optional] |
| **embedding** | **Array&lt;Float&gt;** | The full embedding vector, returned only when the ingest response carries embeddings. | [optional] |
| **embedding_prefix** | **Array&lt;Float&gt;** | The coarse prefix vector, returned only when the ingest response carries embeddings. | [optional] |
| **external_ref** | **String** |  | [optional] |

## Example

```ruby
require 'fever_client'

instance = FeverClient::IngestedMedia.new(
  blob_id: null,
  customer_id: null,
  embedding: null,
  embedding_prefix: null,
  external_ref: null
)
```

