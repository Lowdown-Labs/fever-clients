# FeverClient::IngestSource

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **customer_id** | **String** | Tag every vacuumed item with this customer_id. | [optional] |
| **s3_uri** | **String** | s3://bucket/prefix in your VPC to vacuum every media item under. |  |
| **target_res** | **Integer** | Resolution to index at, in pixels (rounded to a multiple of 16). Images are resized to this before embedding; higher means more detail but slower. Leave unset for the fast production default (64). | [optional] |

## Example

```ruby
require 'fever_client'

instance = FeverClient::IngestSource.new(
  customer_id: null,
  s3_uri: null,
  target_res: null
)
```

