# LowdownLabs.Fever.Model.DatasetCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BlobIds** | **List&lt;int&gt;** | Optional initial items; every blob must belong to the dataset&#39;s customer. | [optional] 
**CustomerId** | **string** | Admin keys only: own this dataset to this customer. Scoped keys are always forced to their own customer_id. | [optional] 
**Name** | **string** | Dataset name, unique per tenant. | 
**SourceSql** | **string** | Provenance: the SELECT that produced the item set, kept so the curation query can be reviewed and refined later. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

