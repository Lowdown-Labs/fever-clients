# FeverClient::DuplicateCluster

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **member_customers** | **Array&lt;String&gt;** | customer_id of each member, parallel to members; a cluster whose distinct customer count exceeds 1 is duplicated across accounts. | [optional] |
| **members** | **Array&lt;Integer&gt;** | blob_ids of the items in this cluster. |  |
| **size** | **Integer** | Number of items in this near-duplicate cluster. |  |
| **tightness** | **Float** | Minimum pairwise cosine similarity across the cluster. |  |

## Example

```ruby
require 'fever_client'

instance = FeverClient::DuplicateCluster.new(
  member_customers: null,
  members: null,
  size: null,
  tightness: null
)
```

