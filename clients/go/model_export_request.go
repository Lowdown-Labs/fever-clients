package fever

import (
	"encoding/json"
	"bytes"
	"fmt"
)

var _ MappedNullable = &ExportRequest{}

type ExportRequest struct {
	CustomerId NullableString `json:"customer_id,omitempty"`
	Format *string `json:"format,omitempty"`
	Kind NullableString `json:"kind,omitempty"`
	S3Uri string `json:"s3_uri"`
	Tag NullableString `json:"tag,omitempty"`
}

type _ExportRequest ExportRequest

func NewExportRequest(s3Uri string) *ExportRequest {
	this := ExportRequest{}
	var format string = "ndjson"
	this.Format = &format
	this.S3Uri = s3Uri
	return &this
}

func NewExportRequestWithDefaults() *ExportRequest {
	this := ExportRequest{}
	var format string = "ndjson"
	this.Format = &format
	return &this
}

func (o *ExportRequest) GetCustomerId() string {
	if o == nil || IsNil(o.CustomerId.Get()) {
		var ret string
		return ret
	}
	return *o.CustomerId.Get()
}

func (o *ExportRequest) GetCustomerIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.CustomerId.Get(), o.CustomerId.IsSet()
}

func (o *ExportRequest) HasCustomerId() bool {
	if o != nil && o.CustomerId.IsSet() {
		return true
	}

	return false
}

func (o *ExportRequest) SetCustomerId(v string) {
	o.CustomerId.Set(&v)
}
func (o *ExportRequest) SetCustomerIdNil() {
	o.CustomerId.Set(nil)
}

func (o *ExportRequest) UnsetCustomerId() {
	o.CustomerId.Unset()
}

func (o *ExportRequest) GetFormat() string {
	if o == nil || IsNil(o.Format) {
		var ret string
		return ret
	}
	return *o.Format
}

func (o *ExportRequest) GetFormatOk() (*string, bool) {
	if o == nil || IsNil(o.Format) {
		return nil, false
	}
	return o.Format, true
}

func (o *ExportRequest) HasFormat() bool {
	if o != nil && !IsNil(o.Format) {
		return true
	}

	return false
}

func (o *ExportRequest) SetFormat(v string) {
	o.Format = &v
}

func (o *ExportRequest) GetKind() string {
	if o == nil || IsNil(o.Kind.Get()) {
		var ret string
		return ret
	}
	return *o.Kind.Get()
}

func (o *ExportRequest) GetKindOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Kind.Get(), o.Kind.IsSet()
}

func (o *ExportRequest) HasKind() bool {
	if o != nil && o.Kind.IsSet() {
		return true
	}

	return false
}

func (o *ExportRequest) SetKind(v string) {
	o.Kind.Set(&v)
}
func (o *ExportRequest) SetKindNil() {
	o.Kind.Set(nil)
}

func (o *ExportRequest) UnsetKind() {
	o.Kind.Unset()
}

func (o *ExportRequest) GetS3Uri() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.S3Uri
}

func (o *ExportRequest) GetS3UriOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.S3Uri, true
}

func (o *ExportRequest) SetS3Uri(v string) {
	o.S3Uri = v
}

func (o *ExportRequest) GetTag() string {
	if o == nil || IsNil(o.Tag.Get()) {
		var ret string
		return ret
	}
	return *o.Tag.Get()
}

func (o *ExportRequest) GetTagOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Tag.Get(), o.Tag.IsSet()
}

func (o *ExportRequest) HasTag() bool {
	if o != nil && o.Tag.IsSet() {
		return true
	}

	return false
}

func (o *ExportRequest) SetTag(v string) {
	o.Tag.Set(&v)
}
func (o *ExportRequest) SetTagNil() {
	o.Tag.Set(nil)
}

func (o *ExportRequest) UnsetTag() {
	o.Tag.Unset()
}

func (o ExportRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ExportRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if o.CustomerId.IsSet() {
		toSerialize["customer_id"] = o.CustomerId.Get()
	}
	if !IsNil(o.Format) {
		toSerialize["format"] = o.Format
	}
	if o.Kind.IsSet() {
		toSerialize["kind"] = o.Kind.Get()
	}
	toSerialize["s3_uri"] = o.S3Uri
	if o.Tag.IsSet() {
		toSerialize["tag"] = o.Tag.Get()
	}
	return toSerialize, nil
}

func (o *ExportRequest) UnmarshalJSON(data []byte) (err error) {
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

	varExportRequest := _ExportRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varExportRequest)

	if err != nil {
		return err
	}

	*o = ExportRequest(varExportRequest)

	return err
}

type NullableExportRequest struct {
	value *ExportRequest
	isSet bool
}

func (v NullableExportRequest) Get() *ExportRequest {
	return v.value
}

func (v *NullableExportRequest) Set(val *ExportRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableExportRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableExportRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableExportRequest(val *ExportRequest) *NullableExportRequest {
	return &NullableExportRequest{value: val, isSet: true}
}

func (v NullableExportRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableExportRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

