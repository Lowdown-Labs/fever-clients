# FeverClient::Dataset

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **created_at** | **String** |  | [optional] |
| **customer_id** | **String** |  | [optional] |
| **id** | **Integer** |  |  |
| **item_count** | **Integer** |  | [optional][default to 0] |
| **name** | **String** |  |  |
| **source_sql** | **String** |  | [optional] |

## Example

```ruby
require 'fever_client'

instance = FeverClient::Dataset.new(
  created_at: null,
  customer_id: null,
  id: null,
  item_count: null,
  name: null,
  source_sql: null
)
```

