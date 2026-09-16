package fever

import (
	"encoding/json"
	"bytes"
	"fmt"
)

var _ MappedNullable = &MediaFormats{}

type MediaFormats struct {
	Audio []string `json:"audio"`
	Document []string `json:"document"`
	Image []string `json:"image"`
	Video []string `json:"video"`
}

type _MediaFormats MediaFormats

func NewMediaFormats(audio []string, document []string, image []string, video []string) *MediaFormats {
	this := MediaFormats{}
	this.Audio = audio
	this.Document = document
	this.Image = image
	this.Video = video
	return &this
}

func NewMediaFormatsWithDefaults() *MediaFormats {
	this := MediaFormats{}
	return &this
}

func (o *MediaFormats) GetAudio() []string {
	if o == nil {
		var ret []string
		return ret
	}

	return o.Audio
}

func (o *MediaFormats) GetAudioOk() ([]string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Audio, true
}

func (o *MediaFormats) SetAudio(v []string) {
	o.Audio = v
}

func (o *MediaFormats) GetDocument() []string {
	if o == nil {
		var ret []string
		return ret
	}

	return o.Document
}

func (o *MediaFormats) GetDocumentOk() ([]string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Document, true
}

func (o *MediaFormats) SetDocument(v []string) {
	o.Document = v
}

func (o *MediaFormats) GetImage() []string {
	if o == nil {
		var ret []string
		return ret
	}

	return o.Image
}

func (o *MediaFormats) GetImageOk() ([]string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Image, true
}

func (o *MediaFormats) SetImage(v []string) {
	o.Image = v
}

func (o *MediaFormats) GetVideo() []string {
	if o == nil {
		var ret []string
		return ret
	}

	return o.Video
}

func (o *MediaFormats) GetVideoOk() ([]string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Video, true
}

func (o *MediaFormats) SetVideo(v []string) {
	o.Video = v
}

func (o MediaFormats) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o MediaFormats) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["audio"] = o.Audio
	toSerialize["document"] = o.Document
	toSerialize["image"] = o.Image
	toSerialize["video"] = o.Video
	return toSerialize, nil
}

func (o *MediaFormats) UnmarshalJSON(data []byte) (err error) {
	requiredProperties := []string{
		"audio",
		"document",
		"image",
		"video",
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

	varMediaFormats := _MediaFormats{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varMediaFormats)

	if err != nil {
		return err
	}

	*o = MediaFormats(varMediaFormats)

	return err
}

type NullableMediaFormats struct {
	value *MediaFormats
	isSet bool
}

func (v NullableMediaFormats) Get() *MediaFormats {
	return v.value
}

func (v *NullableMediaFormats) Set(val *MediaFormats) {
	v.value = val
	v.isSet = true
}

func (v NullableMediaFormats) IsSet() bool {
	return v.isSet
}

func (v *NullableMediaFormats) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableMediaFormats(val *MediaFormats) *NullableMediaFormats {
	return &NullableMediaFormats{value: val, isSet: true}
}

func (v NullableMediaFormats) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableMediaFormats) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

