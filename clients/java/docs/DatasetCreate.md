

# DatasetCreate


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**blobIds** | **List&lt;Integer&gt;** | Optional initial items; every blob must belong to the dataset&#39;s customer. |  [optional] |
|**customerId** | **String** | Admin keys only: own this dataset to this customer. Scoped keys are always forced to their own customer_id. |  [optional] |
|**name** | **String** | Dataset name, unique per tenant. |  |
|**sourceSql** | **String** | Provenance: the SELECT that produced the item set, kept so the curation query can be reviewed and refined later. |  [optional] |



