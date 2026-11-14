# FeverClient::ReportSlot

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **caption** | **String** | Extra caption text, appended to the search query. | [optional] |
| **label** | **String** | Slot label; doubles as the text search query for this slot. |  |
| **min_score** | **Float** | Per-slot confidence gate (cosine). Defaults to FEVER_REPORT_MIN_SCORE (0.25). | [optional] |

## Example

```ruby
require 'fever_client'

instance = FeverClient::ReportSlot.new(
  caption: null,
  label: null,
  min_score: null
)
```

