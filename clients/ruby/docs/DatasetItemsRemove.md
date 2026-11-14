# FeverClient::DatasetItemsRemove

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **blob_ids** | **Array&lt;Integer&gt;** | Items to remove; omit (or pass null) to clear every item from the dataset. | [optional] |

## Example

```ruby
require 'fever_client'

instance = FeverClient::DatasetItemsRemove.new(
  blob_ids: null
)
```

