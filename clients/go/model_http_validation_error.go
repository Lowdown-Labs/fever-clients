package fever

import (
	"encoding/json"
)

var _ MappedNullable = &HTTPValidationError{}

type HTTPValidationError struct {
	Detail []ValidationError `json:"detail,omitempty"`
}

func NewHTTPValidationError() *HTTPValidationError {
	this := HTTPValidationError{}
	return &this
}

func NewHTTPValidationErrorWithDefaults() *HTTPValidationError {
	this := HTTPValidationError{}
	return &this
}

func (o *HTTPValidationError) GetDetail() []ValidationError {
	if o == nil || IsNil(o.Detail) {
		var ret []ValidationError
		return ret
	}
	return o.Detail
}

func (o *HTTPValidationError) GetDetailOk() ([]ValidationError, bool) {
	if o == nil || IsNil(o.Detail) {
		return nil, false
	}
	return o.Detail, true
}

func (o *HTTPValidationError) HasDetail() bool {
	if o != nil && !IsNil(o.Detail) {
		return true
	}

	return false
}

func (o *HTTPValidationError) SetDetail(v []ValidationError) {
	o.Detail = v
}

func (o HTTPValidationError) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o HTTPValidationError) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Detail) {
		toSerialize["detail"] = o.Detail
	}
	return toSerialize, nil
}

type NullableHTTPValidationError struct {
	value *HTTPValidationError
	isSet bool
}

func (v NullableHTTPValidationError) Get() *HTTPValidationError {
	return v.value
}

func (v *NullableHTTPValidationError) Set(val *HTTPValidationError) {
	v.value = val
	v.isSet = true
}

func (v NullableHTTPValidationError) IsSet() bool {
	return v.isSet
}

func (v *NullableHTTPValidationError) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableHTTPValidationError(val *HTTPValidationError) *NullableHTTPValidationError {
	return &NullableHTTPValidationError{value: val, isSet: true}
}

func (v NullableHTTPValidationError) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableHTTPValidationError) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

