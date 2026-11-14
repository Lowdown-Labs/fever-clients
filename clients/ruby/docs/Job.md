# FeverClient::Job

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **customer_id** | **String** |  | [optional] |
| **done** | **Integer** |  | [optional][default to 0] |
| **error** | **String** |  | [optional] |
| **id** | **Integer** |  |  |
| **skipped** | **Integer** | Items skipped by delta ingest because their content was already indexed (overwrite&#x3D;false). | [optional][default to 0] |
| **status** | **String** |  |  |
| **total** | **Integer** |  | [optional][default to 0] |

## Example

```ruby
require 'fever_client'

instance = FeverClient::Job.new(
  customer_id: null,
  done: null,
  error: null,
  id: null,
  skipped: null,
  status: null,
  total: null
)
```

