# FeverClient::DuplicatesRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **customer_id** | **String** | Restrict the scan to media tagged with this customer_id. A scoped key is always forced to its own customer_id; an admin key may pass any customer_id or none (all customers). | [optional] |
| **customer_ids** | **Array&lt;String&gt;** | Admin only: restrict the scan to this set of customers. Spanning more than one customer is how cross-account duplicates (the same item submitted under different accounts) are found. Ignored for scoped keys, which stay pinned. | [optional] |
| **limit** | **Integer** | Max items to scan for near-duplicates. | [optional][default to 500] |
| **threshold** | **Float** | Similarity cutoff 0..1; higher is stricter (1.0 &#x3D; near-identical). | [optional][default to 0.92] |

## Example

```ruby
require 'fever_client'

instance = FeverClient::DuplicatesRequest.new(
  customer_id: null,
  customer_ids: null,
  limit: null,
  threshold: null
)
```

