# DuplicatesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customer_id** | Option<**String**> | Restrict the scan to media tagged with this customer_id. A scoped key is always forced to its own customer_id; an admin key may pass any customer_id or none (all customers). | [optional]
**customer_ids** | Option<**Vec<String>**> | Admin only: restrict the scan to this set of customers. Spanning more than one customer is how cross-account duplicates (the same item submitted under different accounts) are found. Ignored for scoped keys, which stay pinned. | [optional]
**limit** | Option<**i32**> | Max items to scan for near-duplicates. | [optional][default to 500]
**threshold** | Option<**f64**> | Similarity cutoff 0..1; higher is stricter (1.0 = near-identical). | [optional][default to 0.92]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


