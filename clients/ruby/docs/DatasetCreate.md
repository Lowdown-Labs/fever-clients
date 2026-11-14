# FeverClient::DatasetCreate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **blob_ids** | **Array&lt;Integer&gt;** | Optional initial items; every blob must belong to the dataset&#39;s customer. | [optional] |
| **customer_id** | **String** | Admin keys only: own this dataset to this customer. Scoped keys are always forced to their own customer_id. | [optional] |
| **name** | **String** | Dataset name, unique per tenant. |  |
| **source_sql** | **String** | Provenance: the SELECT that produced the item set, kept so the curation query can be reviewed and refined later. | [optional] |

## Example

```ruby
require 'fever_client'

instance = FeverClient::DatasetCreate.new(
  blob_ids: null,
  customer_id: null,
  name: null,
  source_sql: null
)
```

