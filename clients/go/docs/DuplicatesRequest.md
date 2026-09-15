# DuplicatesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CustomerId** | Pointer to **NullableString** | Restrict the scan to media tagged with this customer_id. A scoped key is always forced to its own customer_id; an admin key may pass any customer_id or none (all customers). | [optional] 
**CustomerIds** | Pointer to **[]string** | Admin only: restrict the scan to this set of customers. Spanning more than one customer is how cross-account duplicates (the same item submitted under different accounts) are found. Ignored for scoped keys, which stay pinned. | [optional] 
**Limit** | Pointer to **int32** | Max items to scan for near-duplicates. | [optional] [default to 500]
**Threshold** | Pointer to **float32** | Similarity cutoff 0..1; higher is stricter (1.0 &#x3D; near-identical). | [optional] [default to 0.92]

## Methods

### NewDuplicatesRequest

`func NewDuplicatesRequest() *DuplicatesRequest`

NewDuplicatesRequest instantiates a new DuplicatesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewDuplicatesRequestWithDefaults

`func NewDuplicatesRequestWithDefaults() *DuplicatesRequest`

NewDuplicatesRequestWithDefaults instantiates a new DuplicatesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCustomerId

`func (o *DuplicatesRequest) GetCustomerId() string`

GetCustomerId returns the CustomerId field if non-nil, zero value otherwise.

### GetCustomerIdOk

`func (o *DuplicatesRequest) GetCustomerIdOk() (*string, bool)`

GetCustomerIdOk returns a tuple with the CustomerId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomerId

`func (o *DuplicatesRequest) SetCustomerId(v string)`

SetCustomerId sets CustomerId field to given value.

### HasCustomerId

`func (o *DuplicatesRequest) HasCustomerId() bool`

HasCustomerId returns a boolean if a field has been set.

### SetCustomerIdNil

`func (o *DuplicatesRequest) SetCustomerIdNil(b bool)`

 SetCustomerIdNil sets the value for CustomerId to be an explicit nil

### UnsetCustomerId
`func (o *DuplicatesRequest) UnsetCustomerId()`

UnsetCustomerId ensures that no value is present for CustomerId, not even an explicit nil
### GetCustomerIds

`func (o *DuplicatesRequest) GetCustomerIds() []string`

GetCustomerIds returns the CustomerIds field if non-nil, zero value otherwise.

### GetCustomerIdsOk

`func (o *DuplicatesRequest) GetCustomerIdsOk() (*[]string, bool)`

GetCustomerIdsOk returns a tuple with the CustomerIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomerIds

`func (o *DuplicatesRequest) SetCustomerIds(v []string)`

SetCustomerIds sets CustomerIds field to given value.

### HasCustomerIds

`func (o *DuplicatesRequest) HasCustomerIds() bool`

HasCustomerIds returns a boolean if a field has been set.

### SetCustomerIdsNil

`func (o *DuplicatesRequest) SetCustomerIdsNil(b bool)`

 SetCustomerIdsNil sets the value for CustomerIds to be an explicit nil

### UnsetCustomerIds
`func (o *DuplicatesRequest) UnsetCustomerIds()`

UnsetCustomerIds ensures that no value is present for CustomerIds, not even an explicit nil
### GetLimit

`func (o *DuplicatesRequest) GetLimit() int32`

GetLimit returns the Limit field if non-nil, zero value otherwise.

### GetLimitOk

`func (o *DuplicatesRequest) GetLimitOk() (*int32, bool)`

GetLimitOk returns a tuple with the Limit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimit

`func (o *DuplicatesRequest) SetLimit(v int32)`

SetLimit sets Limit field to given value.

### HasLimit

`func (o *DuplicatesRequest) HasLimit() bool`

HasLimit returns a boolean if a field has been set.

### GetThreshold

`func (o *DuplicatesRequest) GetThreshold() float32`

GetThreshold returns the Threshold field if non-nil, zero value otherwise.

### GetThresholdOk

`func (o *DuplicatesRequest) GetThresholdOk() (*float32, bool)`

GetThresholdOk returns a tuple with the Threshold field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetThreshold

`func (o *DuplicatesRequest) SetThreshold(v float32)`

SetThreshold sets Threshold field to given value.

### HasThreshold

`func (o *DuplicatesRequest) HasThreshold() bool`

HasThreshold returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


