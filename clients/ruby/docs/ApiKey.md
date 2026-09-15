# FeverClient::ApiKey

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **created_at** | **String** |  | [optional] |
| **customer_id** | **String** |  | [optional] |
| **id** | **Integer** |  |  |
| **name** | **String** |  | [optional] |
| **revoked** | **Boolean** |  | [optional][default to false] |
| **role** | **String** |  | [optional][default to &#39;scoped&#39;] |

## Example

```ruby
require 'fever_client'

instance = FeverClient::ApiKey.new(
  created_at: null,
  customer_id: null,
  id: null,
  name: null,
  revoked: null,
  role: null
)
```

