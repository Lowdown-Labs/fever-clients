# DuplicatesResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Clusters** | **int32** | Number of near-duplicate clusters found. | 
**DuplicateClusters** | Pointer to [**[]DuplicateCluster**](DuplicateCluster.md) | The near-duplicate clusters, largest and tightest first. | [optional] 
**TotalDuplicates** | **int32** | Count of items that fall in any cluster of size &gt;&#x3D; 2. | 

## Methods

### NewDuplicatesResponse

`func NewDuplicatesResponse(clusters int32, totalDuplicates int32, ) *DuplicatesResponse`

NewDuplicatesResponse instantiates a new DuplicatesResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewDuplicatesResponseWithDefaults

`func NewDuplicatesResponseWithDefaults() *DuplicatesResponse`

NewDuplicatesResponseWithDefaults instantiates a new DuplicatesResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetClusters

`func (o *DuplicatesResponse) GetClusters() int32`

GetClusters returns the Clusters field if non-nil, zero value otherwise.

### GetClustersOk

`func (o *DuplicatesResponse) GetClustersOk() (*int32, bool)`

GetClustersOk returns a tuple with the Clusters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClusters

`func (o *DuplicatesResponse) SetClusters(v int32)`

SetClusters sets Clusters field to given value.


### GetDuplicateClusters

`func (o *DuplicatesResponse) GetDuplicateClusters() []DuplicateCluster`

GetDuplicateClusters returns the DuplicateClusters field if non-nil, zero value otherwise.

### GetDuplicateClustersOk

`func (o *DuplicatesResponse) GetDuplicateClustersOk() (*[]DuplicateCluster, bool)`

GetDuplicateClustersOk returns a tuple with the DuplicateClusters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDuplicateClusters

`func (o *DuplicatesResponse) SetDuplicateClusters(v []DuplicateCluster)`

SetDuplicateClusters sets DuplicateClusters field to given value.

### HasDuplicateClusters

`func (o *DuplicatesResponse) HasDuplicateClusters() bool`

HasDuplicateClusters returns a boolean if a field has been set.

### GetTotalDuplicates

`func (o *DuplicatesResponse) GetTotalDuplicates() int32`

GetTotalDuplicates returns the TotalDuplicates field if non-nil, zero value otherwise.

### GetTotalDuplicatesOk

`func (o *DuplicatesResponse) GetTotalDuplicatesOk() (*int32, bool)`

GetTotalDuplicatesOk returns a tuple with the TotalDuplicates field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalDuplicates

`func (o *DuplicatesResponse) SetTotalDuplicates(v int32)`

SetTotalDuplicates sets TotalDuplicates field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


