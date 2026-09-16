package fever

import (
	"encoding/json"
	"bytes"
	"fmt"
)

var _ MappedNullable = &ApiKey{}

type ApiKey struct {
	CreatedAt NullableString `json:"created_at,omitempty"`
	CustomerId NullableString `json:"customer_id,omitempty"`
	Id int32 `json:"id"`
	Name NullableString `json:"name,omitempty"`
	Revoked *bool `json:"revoked,omitempty"`
	Role *string `json:"role,omitempty"`
}

type _ApiKey ApiKey

func NewApiKey(id int32) *ApiKey {
	this := ApiKey{}
	this.Id = id
	var revoked bool = false
	this.Revoked = &revoked
	var role string = "scoped"
	this.Role = &role
	return &this
}

func NewApiKeyWithDefaults() *ApiKey {
	this := ApiKey{}
	var revoked bool = false
	this.Revoked = &revoked
	var role string = "scoped"
	this.Role = &role
	return &this
}

func (o *ApiKey) GetCreatedAt() string {
	if o == nil || IsNil(o.CreatedAt.Get()) {
		var ret string
		return ret
	}
	return *o.CreatedAt.Get()
}

func (o *ApiKey) GetCreatedAtOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.CreatedAt.Get(), o.CreatedAt.IsSet()
}

func (o *ApiKey) HasCreatedAt() bool {
	if o != nil && o.CreatedAt.IsSet() {
		return true
	}

	return false
}

func (o *ApiKey) SetCreatedAt(v string) {
	o.CreatedAt.Set(&v)
}
func (o *ApiKey) SetCreatedAtNil() {
	o.CreatedAt.Set(nil)
}

func (o *ApiKey) UnsetCreatedAt() {
	o.CreatedAt.Unset()
}

func (o *ApiKey) GetCustomerId() string {
	if o == nil || IsNil(o.CustomerId.Get()) {
		var ret string
		return ret
	}
	return *o.CustomerId.Get()
}

func (o *ApiKey) GetCustomerIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.CustomerId.Get(), o.CustomerId.IsSet()
}

func (o *ApiKey) HasCustomerId() bool {
	if o != nil && o.CustomerId.IsSet() {
		return true
	}

	return false
}

func (o *ApiKey) SetCustomerId(v string) {
	o.CustomerId.Set(&v)
}
func (o *ApiKey) SetCustomerIdNil() {
	o.CustomerId.Set(nil)
}

func (o *ApiKey) UnsetCustomerId() {
	o.CustomerId.Unset()
}

func (o *ApiKey) GetId() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Id
}

func (o *ApiKey) GetIdOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Id, true
}

func (o *ApiKey) SetId(v int32) {
	o.Id = v
}

func (o *ApiKey) GetName() string {
	if o == nil || IsNil(o.Name.Get()) {
		var ret string
		return ret
	}
	return *o.Name.Get()
}

func (o *ApiKey) GetNameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Name.Get(), o.Name.IsSet()
}

func (o *ApiKey) HasName() bool {
	if o != nil && o.Name.IsSet() {
		return true
	}

	return false
}

func (o *ApiKey) SetName(v string) {
	o.Name.Set(&v)
}
func (o *ApiKey) SetNameNil() {
	o.Name.Set(nil)
}

func (o *ApiKey) UnsetName() {
	o.Name.Unset()
}

func (o *ApiKey) GetRevoked() bool {
	if o == nil || IsNil(o.Revoked) {
		var ret bool
		return ret
	}
	return *o.Revoked
}

func (o *ApiKey) GetRevokedOk() (*bool, bool) {
	if o == nil || IsNil(o.Revoked) {
		return nil, false
	}
	return o.Revoked, true
}

func (o *ApiKey) HasRevoked() bool {
	if o != nil && !IsNil(o.Revoked) {
		return true
	}

	return false
}

func (o *ApiKey) SetRevoked(v bool) {
	o.Revoked = &v
}

func (o *ApiKey) GetRole() string {
	if o == nil || IsNil(o.Role) {
		var ret string
		return ret
	}
	return *o.Role
}

func (o *ApiKey) GetRoleOk() (*string, bool) {
	if o == nil || IsNil(o.Role) {
		return nil, false
	}
	return o.Role, true
}

func (o *ApiKey) HasRole() bool {
	if o != nil && !IsNil(o.Role) {
		return true
	}

	return false
}

func (o *ApiKey) SetRole(v string) {
	o.Role = &v
}

func (o ApiKey) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ApiKey) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if o.CreatedAt.IsSet() {
		toSerialize["created_at"] = o.CreatedAt.Get()
	}
	if o.CustomerId.IsSet() {
		toSerialize["customer_id"] = o.CustomerId.Get()
	}
	toSerialize["id"] = o.Id
	if o.Name.IsSet() {
		toSerialize["name"] = o.Name.Get()
	}
	if !IsNil(o.Revoked) {
		toSerialize["revoked"] = o.Revoked
	}
	if !IsNil(o.Role) {
		toSerialize["role"] = o.Role
	}
	return toSerialize, nil
}

func (o *ApiKey) UnmarshalJSON(data []byte) (err error) {
	requiredProperties := []string{
		"id",
	}

	allProperties := make(map[string]interface{})

	err = json.Unmarshal(data, &allProperties)

	if err != nil {
		return err;
	}

	for _, requiredProperty := range(requiredProperties) {
		if _, exists := allProperties[requiredProperty]; !exists {
			return fmt.Errorf("no value given for required property %v", requiredProperty)
		}
	}

	varApiKey := _ApiKey{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varApiKey)

	if err != nil {
		return err
	}

	*o = ApiKey(varApiKey)

	return err
}

type NullableApiKey struct {
	value *ApiKey
	isSet bool
}

func (v NullableApiKey) Get() *ApiKey {
	return v.value
}

func (v *NullableApiKey) Set(val *ApiKey) {
	v.value = val
	v.isSet = true
}

func (v NullableApiKey) IsSet() bool {
	return v.isSet
}

func (v *NullableApiKey) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableApiKey(val *ApiKey) *NullableApiKey {
	return &NullableApiKey{value: val, isSet: true}
}

func (v NullableApiKey) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableApiKey) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

