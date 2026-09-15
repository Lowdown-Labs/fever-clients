# LowdownLabs.Fever.Model.DuplicateCluster

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MemberCustomers** | **List&lt;string&gt;** | customer_id of each member, parallel to members; a cluster whose distinct customer count exceeds 1 is duplicated across accounts. | [optional] 
**Members** | **List&lt;int&gt;** | blob_ids of the items in this cluster. | 
**Size** | **int** | Number of items in this near-duplicate cluster. | 
**Tightness** | **decimal** | Minimum pairwise cosine similarity across the cluster. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

