package fever

import (
	"encoding/json"
	"bytes"
	"fmt"
)

var _ MappedNullable = &ExportResult{}

type ExportResult struct {
	Exported int32 `json:"exported"`
	S3Uri string `json:"s3_uri"`
}

type _ExportResult ExportResult

func NewExportResult(exported int32, s3Uri string) *ExportResult {
	this := ExportResult{}
	this.Exported = exported
	this.S3Uri = s3Uri
	return &this
}

func NewExportResultWithDefaults() *ExportResult {
	this := ExportResult{}
	return &this
}

func (o *ExportResult) GetExported() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Exported
}

func (o *ExportResult) GetExportedOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Exported, true
}

func (o *ExportResult) SetExported(v int32) {
	o.Exported = v
}

func (o *ExportResult) GetS3Uri() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.S3Uri
}

func (o *ExportResult) GetS3UriOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.S3Uri, true
}

func (o *ExportResult) SetS3Uri(v string) {
	o.S3Uri = v
}

func (o ExportResult) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ExportResult) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["exported"] = o.Exported
	toSerialize["s3_uri"] = o.S3Uri
	return toSerialize, nil
}

func (o *ExportResult) UnmarshalJSON(data []byte) (err error) {
	requiredProperties := []string{
		"exported",
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

	varExportResult := _ExportResult{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varExportResult)

	if err != nil {
		return err
	}

	*o = ExportResult(varExportResult)

	return err
}

type NullableExportResult struct {
	value *ExportResult
	isSet bool
}

func (v NullableExportResult) Get() *ExportResult {
	return v.value
}

func (v *NullableExportResult) Set(val *ExportResult) {
	v.value = val
	v.isSet = true
}

func (v NullableExportResult) IsSet() bool {
	return v.isSet
}

func (v *NullableExportResult) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableExportResult(val *ExportResult) *NullableExportResult {
	return &NullableExportResult{value: val, isSet: true}
}

func (v NullableExportResult) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableExportResult) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

