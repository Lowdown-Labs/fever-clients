# LowdownLabs.Fever.Model.DuplicatesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CustomerId** | **string** | Restrict the scan to media tagged with this customer_id. A scoped key is always forced to its own customer_id; an admin key may pass any customer_id or none (all customers). | [optional] 
**CustomerIds** | **List&lt;string&gt;** | Admin only: restrict the scan to this set of customers. Spanning more than one customer is how cross-account duplicates (the same item submitted under different accounts) are found. Ignored for scoped keys, which stay pinned. | [optional] 
**Limit** | **int** | Max items to scan for near-duplicates. | [optional] [default to 500]
**Threshold** | **decimal** | Similarity cutoff 0..1; higher is stricter (1.0 &#x3D; near-identical). | [optional] [default to 0.92M]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

