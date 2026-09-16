package fever

import (
	"encoding/json"
	"bytes"
	"fmt"
)

var _ MappedNullable = &ImportRequest{}

type ImportRequest struct {
	CustomerId NullableString `json:"customer_id,omitempty"`
	S3Uri string `json:"s3_uri"`
}

type _ImportRequest ImportRequest

func NewImportRequest(s3Uri string) *ImportRequest {
	this := ImportRequest{}
	this.S3Uri = s3Uri
	return &this
}

func NewImportRequestWithDefaults() *ImportRequest {
	this := ImportRequest{}
	return &this
}

func (o *ImportRequest) GetCustomerId() string {
	if o == nil || IsNil(o.CustomerId.Get()) {
		var ret string
		return ret
	}
	return *o.CustomerId.Get()
}

func (o *ImportRequest) GetCustomerIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.CustomerId.Get(), o.CustomerId.IsSet()
}

func (o *ImportRequest) HasCustomerId() bool {
	if o != nil && o.CustomerId.IsSet() {
		return true
	}

	return false
}

func (o *ImportRequest) SetCustomerId(v string) {
	o.CustomerId.Set(&v)
}
func (o *ImportRequest) SetCustomerIdNil() {
	o.CustomerId.Set(nil)
}

func (o *ImportRequest) UnsetCustomerId() {
	o.CustomerId.Unset()
}

func (o *ImportRequest) GetS3Uri() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.S3Uri
}

func (o *ImportRequest) GetS3UriOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.S3Uri, true
}

func (o *ImportRequest) SetS3Uri(v string) {
	o.S3Uri = v
}

func (o ImportRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ImportRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if o.CustomerId.IsSet() {
		toSerialize["customer_id"] = o.CustomerId.Get()
	}
	toSerialize["s3_uri"] = o.S3Uri
	return toSerialize, nil
}

func (o *ImportRequest) UnmarshalJSON(data []byte) (err error) {
	requiredProperties := []string{
		"s3_uri",
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

	varImportRequest := _ImportRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varImportRequest)

	if err != nil {
		return err
	}

	*o = ImportRequest(varImportRequest)

	return err
}

type NullableImportRequest struct {
	value *ImportRequest
	isSet bool
}

func (v NullableImportRequest) Get() *ImportRequest {
	return v.value
}

func (v *NullableImportRequest) Set(val *ImportRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableImportRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableImportRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableImportRequest(val *ImportRequest) *NullableImportRequest {
	return &NullableImportRequest{value: val, isSet: true}
}

func (v NullableImportRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableImportRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

