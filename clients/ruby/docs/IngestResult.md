# FeverClient::IngestResult

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **existing** | [**Array&lt;IngestedMedia&gt;**](IngestedMedia.md) | Items skipped by delta ingest because they were already indexed, returned with their current blob_ids (only when overwrite&#x3D;false). | [optional] |
| **ingested** | [**Array&lt;IngestedMedia&gt;**](IngestedMedia.md) | Media items processed inline (small requests). | [optional] |
| **job** | [**Job**](Job.md) | For large or bucket-source ingests, poll this job for progress. | [optional] |

## Example

```ruby
require 'fever_client'

instance = FeverClient::IngestResult.new(
  existing: null,
  ingested: null,
  job: null
)
```

