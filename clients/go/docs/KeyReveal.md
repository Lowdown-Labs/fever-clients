# KeyReveal

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ApiKey** | **string** | Bearer token for this appliance, shown ONCE. Store it now. | 
**CustomerId** | Pointer to **NullableString** |  | [optional] 
**Id** | **int32** |  | 
**Name** | Pointer to **NullableString** |  | [optional] 
**Role** | Pointer to **string** |  | [optional] [default to "scoped"]

## Methods

### NewKeyReveal

`func NewKeyReveal(apiKey string, id int32, ) *KeyReveal`

NewKeyReveal instantiates a new KeyReveal object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewKeyRevealWithDefaults

`func NewKeyRevealWithDefaults() *KeyReveal`

NewKeyRevealWithDefaults instantiates a new KeyReveal object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetApiKey

`func (o *KeyReveal) GetApiKey() string`

GetApiKey returns the ApiKey field if non-nil, zero value otherwise.

### GetApiKeyOk

`func (o *KeyReveal) GetApiKeyOk() (*string, bool)`

GetApiKeyOk returns a tuple with the ApiKey field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetApiKey

`func (o *KeyReveal) SetApiKey(v string)`

SetApiKey sets ApiKey field to given value.


### GetCustomerId

`func (o *KeyReveal) GetCustomerId() string`

GetCustomerId returns the CustomerId field if non-nil, zero value otherwise.

### GetCustomerIdOk

`func (o *KeyReveal) GetCustomerIdOk() (*string, bool)`

GetCustomerIdOk returns a tuple with the CustomerId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomerId

`func (o *KeyReveal) SetCustomerId(v string)`

SetCustomerId sets CustomerId field to given value.

### HasCustomerId

`func (o *KeyReveal) HasCustomerId() bool`

HasCustomerId returns a boolean if a field has been set.

### SetCustomerIdNil

`func (o *KeyReveal) SetCustomerIdNil(b bool)`

 SetCustomerIdNil sets the value for CustomerId to be an explicit nil

### UnsetCustomerId
`func (o *KeyReveal) UnsetCustomerId()`

UnsetCustomerId ensures that no value is present for CustomerId, not even an explicit nil
### GetId

`func (o *KeyReveal) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *KeyReveal) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *KeyReveal) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *KeyReveal) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *KeyReveal) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *KeyReveal) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *KeyReveal) HasName() bool`

HasName returns a boolean if a field has been set.

### SetNameNil

`func (o *KeyReveal) SetNameNil(b bool)`

 SetNameNil sets the value for Name to be an explicit nil

### UnsetName
`func (o *KeyReveal) UnsetName()`

UnsetName ensures that no value is present for Name, not even an explicit nil
### GetRole

`func (o *KeyReveal) GetRole() string`

GetRole returns the Role field if non-nil, zero value otherwise.

### GetRoleOk

`func (o *KeyReveal) GetRoleOk() (*string, bool)`

GetRoleOk returns a tuple with the Role field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRole

`func (o *KeyReveal) SetRole(v string)`

SetRole sets Role field to given value.

### HasRole

`func (o *KeyReveal) HasRole() bool`

HasRole returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


