package fever

import (
	"encoding/json"
	"bytes"
	"fmt"
)

var _ MappedNullable = &IngestedMedia{}

type IngestedMedia struct {
	BlobId int32 `json:"blob_id"`
	ExternalRef NullableString `json:"external_ref,omitempty"`
}

type _IngestedMedia IngestedMedia

func NewIngestedMedia(blobId int32) *IngestedMedia {
	this := IngestedMedia{}
	this.BlobId = blobId
	return &this
}

func NewIngestedMediaWithDefaults() *IngestedMedia {
	this := IngestedMedia{}
	return &this
}

func (o *IngestedMedia) GetBlobId() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.BlobId
}

func (o *IngestedMedia) GetBlobIdOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.BlobId, true
}

func (o *IngestedMedia) SetBlobId(v int32) {
	o.BlobId = v
}

func (o *IngestedMedia) GetExternalRef() string {
	if o == nil || IsNil(o.ExternalRef.Get()) {
		var ret string
		return ret
	}
	return *o.ExternalRef.Get()
}

func (o *IngestedMedia) GetExternalRefOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.ExternalRef.Get(), o.ExternalRef.IsSet()
}

func (o *IngestedMedia) HasExternalRef() bool {
	if o != nil && o.ExternalRef.IsSet() {
		return true
	}

	return false
}

func (o *IngestedMedia) SetExternalRef(v string) {
	o.ExternalRef.Set(&v)
}
func (o *IngestedMedia) SetExternalRefNil() {
	o.ExternalRef.Set(nil)
}

func (o *IngestedMedia) UnsetExternalRef() {
	o.ExternalRef.Unset()
}

func (o IngestedMedia) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o IngestedMedia) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["blob_id"] = o.BlobId
	if o.ExternalRef.IsSet() {
		toSerialize["external_ref"] = o.ExternalRef.Get()
	}
	return toSerialize, nil
}

func (o *IngestedMedia) UnmarshalJSON(data []byte) (err error) {
	requiredProperties := []string{
		"blob_id",
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

	varIngestedMedia := _IngestedMedia{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varIngestedMedia)

	if err != nil {
		return err
	}

	*o = IngestedMedia(varIngestedMedia)

	return err
}

type NullableIngestedMedia struct {
	value *IngestedMedia
	isSet bool
}

func (v NullableIngestedMedia) Get() *IngestedMedia {
	return v.value
}

func (v *NullableIngestedMedia) Set(val *IngestedMedia) {
	v.value = val
	v.isSet = true
}

func (v NullableIngestedMedia) IsSet() bool {
	return v.isSet
}

func (v *NullableIngestedMedia) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableIngestedMedia(val *IngestedMedia) *NullableIngestedMedia {
	return &NullableIngestedMedia{value: val, isSet: true}
}

func (v NullableIngestedMedia) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableIngestedMedia) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

