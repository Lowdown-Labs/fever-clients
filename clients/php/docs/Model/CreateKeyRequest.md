# CreateKeyRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customer_id** | **string** | For a scoped key, the single customer_id every request with this key is forced to. Must be empty for an admin key. | [optional]
**name** | **string** | Optional label for this API key (e.g. which app or integration uses it). | [optional]
**role** | **string** | &#39;admin&#39; keys search/ingest across all customers and may pass any customer_id; &#39;scoped&#39; keys are locked server-side to one customer_id. If omitted it is inferred from customer_id (present means scoped, absent means admin). | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
