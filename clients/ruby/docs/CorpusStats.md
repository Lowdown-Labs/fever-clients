# FeverClient::CorpusStats

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **index_bytes** | **Integer** |  |  |
| **kinds** | **Hash&lt;String, Integer&gt;** |  |  |
| **storage_bytes** | **Integer** |  |  |
| **top_tags** | [**Array&lt;CorpusTag&gt;**](CorpusTag.md) |  |  |

## Example

```ruby
require 'fever_client'

instance = FeverClient::CorpusStats.new(
  index_bytes: null,
  kinds: null,
  storage_bytes: null,
  top_tags: null
)
```

