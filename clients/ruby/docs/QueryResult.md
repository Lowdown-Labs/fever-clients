# FeverClient::QueryResult

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **columns** | **Array&lt;String&gt;** | Result column names, in order. |  |
| **rows** | **Array&lt;Array&lt;Object&gt;&gt;** | Result rows, each a list of values in column order. Timestamps/bytes are JSON-safe (ISO strings / hex). |  |
| **truncated** | **Boolean** | True when more rows matched than were returned (hit the row cap). |  |

## Example

```ruby
require 'fever_client'

instance = FeverClient::QueryResult.new(
  columns: null,
  rows: null,
  truncated: null
)
```

