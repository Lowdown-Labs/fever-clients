

# DuplicateCluster


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**memberCustomers** | **List&lt;String&gt;** | customer_id of each member, parallel to members; a cluster whose distinct customer count exceeds 1 is duplicated across accounts. |  [optional] |
|**members** | **List&lt;Integer&gt;** | blob_ids of the items in this cluster. |  |
|**size** | **Integer** | Number of items in this near-duplicate cluster. |  |
|**tightness** | **BigDecimal** | Minimum pairwise cosine similarity across the cluster. |  |



