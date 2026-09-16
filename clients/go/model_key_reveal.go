package fever

import (
	"encoding/json"
	"bytes"
	"fmt"
)

var _ MappedNullable = &KeyReveal{}

type KeyReveal struct {
	ApiKey string `json:"api_key"`
	CustomerId NullableString `json:"customer_id,omitempty"`
	Id int32 `json:"id"`
	Name NullableString `json:"name,omitempty"`
	Role *string `json:"role,omitempty"`
}

type _KeyReveal KeyReveal

func NewKeyReveal(apiKey string, id int32) *KeyReveal {
	this := KeyReveal{}
	this.ApiKey = apiKey
	this.Id = id
	var role string = "scoped"
	this.Role = &role
	return &this
}

func NewKeyRevealWithDefaults() *KeyReveal {
	this := KeyReveal{}
	var role string = "scoped"
	this.Role = &role
	return &this
}

func (o *KeyReveal) GetApiKey() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.ApiKey
}

func (o *KeyReveal) GetApiKeyOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.ApiKey, true
}

func (o *KeyReveal) SetApiKey(v string) {
	o.ApiKey = v
}

func (o *KeyReveal) GetCustomerId() string {
	if o == nil || IsNil(o.CustomerId.Get()) {
		var ret string
		return ret
	}
	return *o.CustomerId.Get()
}

func (o *KeyReveal) GetCustomerIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.CustomerId.Get(), o.CustomerId.IsSet()
}

func (o *KeyReveal) HasCustomerId() bool {
	if o != nil && o.CustomerId.IsSet() {
		return true
	}

	return false
}

func (o *KeyReveal) SetCustomerId(v string) {
	o.CustomerId.Set(&v)
}
func (o *KeyReveal) SetCustomerIdNil() {
	o.CustomerId.Set(nil)
}

func (o *KeyReveal) UnsetCustomerId() {
	o.CustomerId.Unset()
}

func (o *KeyReveal) GetId() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Id
}

func (o *KeyReveal) GetIdOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Id, true
}

func (o *KeyReveal) SetId(v int32) {
	o.Id = v
}

func (o *KeyReveal) GetName() string {
	if o == nil || IsNil(o.Name.Get()) {
		var ret string
		return ret
	}
	return *o.Name.Get()
}

func (o *KeyReveal) GetNameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Name.Get(), o.Name.IsSet()
}

func (o *KeyReveal) HasName() bool {
	if o != nil && o.Name.IsSet() {
		return true
	}

	return false
}

func (o *KeyReveal) SetName(v string) {
	o.Name.Set(&v)
}
func (o *KeyReveal) SetNameNil() {
	o.Name.Set(nil)
}

func (o *KeyReveal) UnsetName() {
	o.Name.Unset()
}

func (o *KeyReveal) GetRole() string {
	if o == nil || IsNil(o.Role) {
		var ret string
		return ret
	}
	return *o.Role
}

func (o *KeyReveal) GetRoleOk() (*string, bool) {
	if o == nil || IsNil(o.Role) {
		return nil, false
	}
	return o.Role, true
}

func (o *KeyReveal) HasRole() bool {
	if o != nil && !IsNil(o.Role) {
		return true
	}

	return false
}

func (o *KeyReveal) SetRole(v string) {
	o.Role = &v
}

func (o KeyReveal) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o KeyReveal) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["api_key"] = o.ApiKey
	if o.CustomerId.IsSet() {
		toSerialize["customer_id"] = o.CustomerId.Get()
	}
	toSerialize["id"] = o.Id
	if o.Name.IsSet() {
		toSerialize["name"] = o.Name.Get()
	}
	if !IsNil(o.Role) {
		toSerialize["role"] = o.Role
	}
	return toSerialize, nil
}

func (o *KeyReveal) UnmarshalJSON(data []byte) (err error) {
	requiredProperties := []string{
		"api_key",
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

	varKeyReveal := _KeyReveal{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varKeyReveal)

	if err != nil {
		return err
	}

	*o = KeyReveal(varKeyReveal)

	return err
}

type NullableKeyReveal struct {
	value *KeyReveal
	isSet bool
}

func (v NullableKeyReveal) Get() *KeyReveal {
	return v.value
}

func (v *NullableKeyReveal) Set(val *KeyReveal) {
	v.value = val
	v.isSet = true
}

func (v NullableKeyReveal) IsSet() bool {
	return v.isSet
}

func (v *NullableKeyReveal) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableKeyReveal(val *KeyReveal) *NullableKeyReveal {
	return &NullableKeyReveal{value: val, isSet: true}
}

func (v NullableKeyReveal) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableKeyReveal) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

