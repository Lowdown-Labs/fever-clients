# DuplicateCluster

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MemberCustomers** | Pointer to **[]string** | customer_id of each member, parallel to members; a cluster whose distinct customer count exceeds 1 is duplicated across accounts. | [optional] 
**Members** | **[]int32** | blob_ids of the items in this cluster. | 
**Size** | **int32** | Number of items in this near-duplicate cluster. | 
**Tightness** | **float32** | Minimum pairwise cosine similarity across the cluster. | 

## Methods

### NewDuplicateCluster

`func NewDuplicateCluster(members []int32, size int32, tightness float32, ) *DuplicateCluster`

NewDuplicateCluster instantiates a new DuplicateCluster object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewDuplicateClusterWithDefaults

`func NewDuplicateClusterWithDefaults() *DuplicateCluster`

NewDuplicateClusterWithDefaults instantiates a new DuplicateCluster object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMemberCustomers

`func (o *DuplicateCluster) GetMemberCustomers() []*string`

GetMemberCustomers returns the MemberCustomers field if non-nil, zero value otherwise.

### GetMemberCustomersOk

`func (o *DuplicateCluster) GetMemberCustomersOk() (*[]*string, bool)`

GetMemberCustomersOk returns a tuple with the MemberCustomers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMemberCustomers

`func (o *DuplicateCluster) SetMemberCustomers(v []*string)`

SetMemberCustomers sets MemberCustomers field to given value.

### HasMemberCustomers

`func (o *DuplicateCluster) HasMemberCustomers() bool`

HasMemberCustomers returns a boolean if a field has been set.

### GetMembers

`func (o *DuplicateCluster) GetMembers() []int32`

GetMembers returns the Members field if non-nil, zero value otherwise.

### GetMembersOk

`func (o *DuplicateCluster) GetMembersOk() (*[]int32, bool)`

GetMembersOk returns a tuple with the Members field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMembers

`func (o *DuplicateCluster) SetMembers(v []int32)`

SetMembers sets Members field to given value.


### GetSize

`func (o *DuplicateCluster) GetSize() int32`

GetSize returns the Size field if non-nil, zero value otherwise.

### GetSizeOk

`func (o *DuplicateCluster) GetSizeOk() (*int32, bool)`

GetSizeOk returns a tuple with the Size field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSize

`func (o *DuplicateCluster) SetSize(v int32)`

SetSize sets Size field to given value.


### GetTightness

`func (o *DuplicateCluster) GetTightness() float32`

GetTightness returns the Tightness field if non-nil, zero value otherwise.

### GetTightnessOk

`func (o *DuplicateCluster) GetTightnessOk() (*float32, bool)`

GetTightnessOk returns a tuple with the Tightness field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTightness

`func (o *DuplicateCluster) SetTightness(v float32)`

SetTightness sets Tightness field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


