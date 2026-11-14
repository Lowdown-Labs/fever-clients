# DatasetCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blob_ids** | Option<**Vec<i32>**> | Optional initial items; every blob must belong to the dataset's customer. | [optional]
**customer_id** | Option<**String**> | Admin keys only: own this dataset to this customer. Scoped keys are always forced to their own customer_id. | [optional]
**name** | **String** | Dataset name, unique per tenant. | 
**source_sql** | Option<**String**> | Provenance: the SELECT that produced the item set, kept so the curation query can be reviewed and refined later. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


