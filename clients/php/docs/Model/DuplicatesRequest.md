# DuplicatesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customer_id** | **string** | Restrict the scan to media tagged with this customer_id. A scoped key is always forced to its own customer_id; an admin key may pass any customer_id or none (all customers). | [optional]
**customer_ids** | **string[]** | Admin only: restrict the scan to this set of customers. Spanning more than one customer is how cross-account duplicates (the same item submitted under different accounts) are found. Ignored for scoped keys, which stay pinned. | [optional]
**limit** | **int** | Max items to scan for near-duplicates. | [optional] [default to 500]
**threshold** | **float** | Similarity cutoff 0..1; higher is stricter (1.0 &#x3D; near-identical). | [optional] [default to 0.92]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
