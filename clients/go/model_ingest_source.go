package fever

import (
	"encoding/json"
	"bytes"
	"fmt"
)

var _ MappedNullable = &IngestSource{}

type IngestSource struct {
	CustomerId NullableString `json:"customer_id,omitempty"`
	S3Uri string `json:"s3_uri"`
	TargetRes NullableInt32 `json:"target_res,omitempty"`
}

type _IngestSource IngestSource

func NewIngestSource(s3Uri string) *IngestSource {
	this := IngestSource{}
	this.S3Uri = s3Uri
	return &this
}

func NewIngestSourceWithDefaults() *IngestSource {
	this := IngestSource{}
	return &this
}

func (o *IngestSource) GetCustomerId() string {
	if o == nil || IsNil(o.CustomerId.Get()) {
		var ret string
		return ret
	}
	return *o.CustomerId.Get()
}

func (o *IngestSource) GetCustomerIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.CustomerId.Get(), o.CustomerId.IsSet()
}

func (o *IngestSource) HasCustomerId() bool {
	if o != nil && o.CustomerId.IsSet() {
		return true
	}

	return false
}

func (o *IngestSource) SetCustomerId(v string) {
	o.CustomerId.Set(&v)
}
func (o *IngestSource) SetCustomerIdNil() {
	o.CustomerId.Set(nil)
}

func (o *IngestSource) UnsetCustomerId() {
	o.CustomerId.Unset()
}

func (o *IngestSource) GetS3Uri() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.S3Uri
}

func (o *IngestSource) GetS3UriOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.S3Uri, true
}

func (o *IngestSource) SetS3Uri(v string) {
	o.S3Uri = v
}

func (o *IngestSource) GetTargetRes() int32 {
	if o == nil || IsNil(o.TargetRes.Get()) {
		var ret int32
		return ret
	}
	return *o.TargetRes.Get()
}

func (o *IngestSource) GetTargetResOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return o.TargetRes.Get(), o.TargetRes.IsSet()
}

func (o *IngestSource) HasTargetRes() bool {
	if o != nil && o.TargetRes.IsSet() {
		return true
	}

	return false
}

func (o *IngestSource) SetTargetRes(v int32) {
	o.TargetRes.Set(&v)
}
func (o *IngestSource) SetTargetResNil() {
	o.TargetRes.Set(nil)
}

func (o *IngestSource) UnsetTargetRes() {
	o.TargetRes.Unset()
}

func (o IngestSource) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o IngestSource) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if o.CustomerId.IsSet() {
		toSerialize["customer_id"] = o.CustomerId.Get()
	}
	toSerialize["s3_uri"] = o.S3Uri
	if o.TargetRes.IsSet() {
		toSerialize["target_res"] = o.TargetRes.Get()
	}
	return toSerialize, nil
}

func (o *IngestSource) UnmarshalJSON(data []byte) (err error) {
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

	varIngestSource := _IngestSource{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varIngestSource)

	if err != nil {
		return err
	}

	*o = IngestSource(varIngestSource)

	return err
}

type NullableIngestSource struct {
	value *IngestSource
	isSet bool
}

func (v NullableIngestSource) Get() *IngestSource {
	return v.value
}

func (v *NullableIngestSource) Set(val *IngestSource) {
	v.value = val
	v.isSet = true
}

func (v NullableIngestSource) IsSet() bool {
	return v.isSet
}

func (v *NullableIngestSource) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableIngestSource(val *IngestSource) *NullableIngestSource {
	return &NullableIngestSource{value: val, isSet: true}
}

func (v NullableIngestSource) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableIngestSource) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

