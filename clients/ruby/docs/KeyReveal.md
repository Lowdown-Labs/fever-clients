# FeverClient::KeyReveal

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **api_key** | **String** | Bearer token for this appliance, shown ONCE. Store it now. |  |
| **customer_id** | **String** |  | [optional] |
| **id** | **Integer** |  |  |
| **name** | **String** |  | [optional] |
| **role** | **String** |  | [optional][default to &#39;scoped&#39;] |

## Example

```ruby
require 'fever_client'

instance = FeverClient::KeyReveal.new(
  api_key: null,
  customer_id: null,
  id: null,
  name: null,
  role: null
)
```

