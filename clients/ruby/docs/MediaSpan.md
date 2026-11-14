# FeverClient::MediaSpan

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **end_ms** | **Integer** |  |  |
| **score** | **Float** | Best frame score inside the range (video frame match ranges only). | [optional] |
| **start_ms** | **Integer** |  |  |
| **text** | **String** |  | [optional] |

## Example

```ruby
require 'fever_client'

instance = FeverClient::MediaSpan.new(
  end_ms: null,
  score: null,
  start_ms: null,
  text: null
)
```

