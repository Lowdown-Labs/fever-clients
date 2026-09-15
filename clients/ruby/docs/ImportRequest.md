# FeverClient::ImportRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **customer_id** | **String** | Tag every imported row with this customer_id (admin default: preserve the file&#39;s own). | [optional] |
| **s3_uri** | **String** | s3://bucket/prefix of a previous FEVER export (manifest.json + shard NDJSON). |  |

## Example

```ruby
require 'fever_client'

instance = FeverClient::ImportRequest.new(
  customer_id: null,
  s3_uri: null
)
```

