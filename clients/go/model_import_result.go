package fever

import (
	"encoding/json"
	"bytes"
	"fmt"
)

var _ MappedNullable = &ImportResult{}

type ImportResult struct {
	Imported int32 `json:"imported"`
	S3Uri string `json:"s3_uri"`
}

type _ImportResult ImportResult

func NewImportResult(imported int32, s3Uri string) *ImportResult {
	this := ImportResult{}
	this.Imported = imported
	this.S3Uri = s3Uri
	return &this
}

func NewImportResultWithDefaults() *ImportResult {
	this := ImportResult{}
	return &this
}

func (o *ImportResult) GetImported() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Imported
}

func (o *ImportResult) GetImportedOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Imported, true
}

func (o *ImportResult) SetImported(v int32) {
	o.Imported = v
}

func (o *ImportResult) GetS3Uri() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.S3Uri
}

func (o *ImportResult) GetS3UriOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.S3Uri, true
}

func (o *ImportResult) SetS3Uri(v string) {
	o.S3Uri = v
}

func (o ImportResult) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ImportResult) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["imported"] = o.Imported
	toSerialize["s3_uri"] = o.S3Uri
	return toSerialize, nil
}

func (o *ImportResult) UnmarshalJSON(data []byte) (err error) {
	requiredProperties := []string{
		"imported",
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

	varImportResult := _ImportResult{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varImportResult)

	if err != nil {
		return err
	}

	*o = ImportResult(varImportResult)

	return err
}

type NullableImportResult struct {
	value *ImportResult
	isSet bool
}

func (v NullableImportResult) Get() *ImportResult {
	return v.value
}

func (v *NullableImportResult) Set(val *ImportResult) {
	v.value = val
	v.isSet = true
}

func (v NullableImportResult) IsSet() bool {
	return v.isSet
}

func (v *NullableImportResult) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableImportResult(val *ImportResult) *NullableImportResult {
	return &NullableImportResult{value: val, isSet: true}
}

func (v NullableImportResult) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableImportResult) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

