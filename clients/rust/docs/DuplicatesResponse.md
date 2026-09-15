# DuplicatesResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clusters** | **i32** | Number of near-duplicate clusters found. | 
**duplicate_clusters** | Option<[**Vec<models::DuplicateCluster>**](DuplicateCluster.md)> | The near-duplicate clusters, largest and tightest first. | [optional]
**total_duplicates** | **i32** | Count of items that fall in any cluster of size >= 2. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


