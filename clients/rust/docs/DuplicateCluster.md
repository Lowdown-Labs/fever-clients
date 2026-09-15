# DuplicateCluster

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**member_customers** | Option<**Vec<String>**> | customer_id of each member, parallel to members; a cluster whose distinct customer count exceeds 1 is duplicated across accounts. | [optional]
**members** | **Vec<i32>** | blob_ids of the items in this cluster. | 
**size** | **i32** | Number of items in this near-duplicate cluster. | 
**tightness** | **f64** | Minimum pairwise cosine similarity across the cluster. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


