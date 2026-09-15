# FeverClient::IngestRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **media** | [**Array&lt;IngestMedia&gt;**](IngestMedia.md) | 1..N media items to ingest inline. | [optional] |
| **overwrite** | **Boolean** | Re-embed and update items already indexed (clobber). Default false &#x3D; delta ingest: content already indexed is skipped, so re-running an ingest only processes new items. | [optional][default to false] |
| **source** | [**IngestSource**](IngestSource.md) | Ingest every media item under an S3 prefix instead of sending bytes. | [optional] |
| **target_res** | **Integer** | Resolution to index this batch at, in pixels (rounded to a multiple of 16). Images are resized to this before embedding; higher means more detail but slower. Leave unset for the fast production default (64), which retains most of the search quality at a fraction of the cost. | [optional] |

## Example

```ruby
require 'fever_client'

instance = FeverClient::IngestRequest.new(
  media: null,
  overwrite: null,
  source: null,
  target_res: null
)
```

