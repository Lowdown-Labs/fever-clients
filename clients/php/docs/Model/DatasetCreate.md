# DatasetCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blob_ids** | **int[]** | Optional initial items; every blob must belong to the dataset&#39;s customer. | [optional]
**customer_id** | **string** | Admin keys only: own this dataset to this customer. Scoped keys are always forced to their own customer_id. | [optional]
**name** | **string** | Dataset name, unique per tenant. |
**source_sql** | **string** | Provenance: the SELECT that produced the item set, kept so the curation query can be reviewed and refined later. | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
