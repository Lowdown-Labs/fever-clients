# CreateKeyRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customer_id** | Option<**String**> | For a scoped key, the single customer_id every request with this key is forced to. Must be empty for an admin key. | [optional]
**name** | Option<**String**> | Optional label for this API key (e.g. which app or integration uses it). | [optional]
**role** | Option<**Role**> | 'admin' keys search/ingest across all customers and may pass any customer_id; 'scoped' keys are locked server-side to one customer_id. If omitted it is inferred from customer_id (present means scoped, absent means admin). (enum: admin, scoped) | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


