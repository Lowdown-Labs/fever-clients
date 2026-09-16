# FeverClient::AssociateRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **collection_id** | **String** | Set/update the collection grouping for this blob. | [optional] |
| **parent_ref** | **String** | Set/update the pointer to this blob&#39;s related parent asset (its external_ref, key, or blob_id). | [optional] |

## Example

```ruby
require 'fever_client'

instance = FeverClient::AssociateRequest.new(
  collection_id: null,
  parent_ref: null
)
```

