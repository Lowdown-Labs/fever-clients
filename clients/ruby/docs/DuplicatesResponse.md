# FeverClient::DuplicatesResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **clusters** | **Integer** | Number of near-duplicate clusters found. |  |
| **duplicate_clusters** | [**Array&lt;DuplicateCluster&gt;**](DuplicateCluster.md) | The near-duplicate clusters, largest and tightest first. | [optional] |
| **total_duplicates** | **Integer** | Count of items that fall in any cluster of size &gt;&#x3D; 2. |  |

## Example

```ruby
require 'fever_client'

instance = FeverClient::DuplicatesResponse.new(
  clusters: null,
  duplicate_clusters: null,
  total_duplicates: null
)
```

