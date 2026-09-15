# DuplicateCluster

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**member_customers** | **string[]** | customer_id of each member, parallel to members; a cluster whose distinct customer count exceeds 1 is duplicated across accounts. | [optional]
**members** | **int[]** | blob_ids of the items in this cluster. |
**size** | **int** | Number of items in this near-duplicate cluster. |
**tightness** | **float** | Minimum pairwise cosine similarity across the cluster. |

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
