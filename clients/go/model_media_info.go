package fever

import (
	"encoding/json"
	"time"
	"bytes"
	"fmt"
)

var _ MappedNullable = &MediaInfo{}

type MediaInfo struct {
	BlobId int32 `json:"blob_id"`
	Caption NullableString `json:"caption,omitempty"`
	CapturedAt NullableTime `json:"captured_at,omitempty"`
	CustomerId NullableString `json:"customer_id,omitempty"`
	Device NullableString `json:"device,omitempty"`
	ExternalRef NullableString `json:"external_ref,omitempty"`
	FrameCount *int32 `json:"frame_count,omitempty"`
	GpsLat NullableFloat32 `json:"gps_lat,omitempty"`
	GpsLon NullableFloat32 `json:"gps_lon,omitempty"`
	Kind NullableString `json:"kind,omitempty"`
	Metadata map[string]interface{} `json:"metadata,omitempty"`
	OcrText NullableString `json:"ocr_text,omitempty"`
	Synthetic NullableFloat32 `json:"synthetic,omitempty"`
	Tags []string `json:"tags,omitempty"`
	TranscriptSegments *int32 `json:"transcript_segments,omitempty"`
}

type _MediaInfo MediaInfo

func NewMediaInfo(blobId int32) *MediaInfo {
	this := MediaInfo{}
	this.BlobId = blobId
	var frameCount int32 = 0
	this.FrameCount = &frameCount
	var transcriptSegments int32 = 0
	this.TranscriptSegments = &transcriptSegments
	return &this
}

func NewMediaInfoWithDefaults() *MediaInfo {
	this := MediaInfo{}
	var frameCount int32 = 0
	this.FrameCount = &frameCount
	var transcriptSegments int32 = 0
	this.TranscriptSegments = &transcriptSegments
	return &this
}

func (o *MediaInfo) GetBlobId() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.BlobId
}

func (o *MediaInfo) GetBlobIdOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.BlobId, true
}

func (o *MediaInfo) SetBlobId(v int32) {
	o.BlobId = v
}

func (o *MediaInfo) GetCaption() string {
	if o == nil || IsNil(o.Caption.Get()) {
		var ret string
		return ret
	}
	return *o.Caption.Get()
}

func (o *MediaInfo) GetCaptionOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Caption.Get(), o.Caption.IsSet()
}

func (o *MediaInfo) HasCaption() bool {
	if o != nil && o.Caption.IsSet() {
		return true
	}

	return false
}

func (o *MediaInfo) SetCaption(v string) {
	o.Caption.Set(&v)
}
func (o *MediaInfo) SetCaptionNil() {
	o.Caption.Set(nil)
}

func (o *MediaInfo) UnsetCaption() {
	o.Caption.Unset()
}

func (o *MediaInfo) GetCapturedAt() time.Time {
	if o == nil || IsNil(o.CapturedAt.Get()) {
		var ret time.Time
		return ret
	}
	return *o.CapturedAt.Get()
}

func (o *MediaInfo) GetCapturedAtOk() (*time.Time, bool) {
	if o == nil {
		return nil, false
	}
	return o.CapturedAt.Get(), o.CapturedAt.IsSet()
}

func (o *MediaInfo) HasCapturedAt() bool {
	if o != nil && o.CapturedAt.IsSet() {
		return true
	}

	return false
}

func (o *MediaInfo) SetCapturedAt(v time.Time) {
	o.CapturedAt.Set(&v)
}
func (o *MediaInfo) SetCapturedAtNil() {
	o.CapturedAt.Set(nil)
}

func (o *MediaInfo) UnsetCapturedAt() {
	o.CapturedAt.Unset()
}

func (o *MediaInfo) GetCustomerId() string {
	if o == nil || IsNil(o.CustomerId.Get()) {
		var ret string
		return ret
	}
	return *o.CustomerId.Get()
}

func (o *MediaInfo) GetCustomerIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.CustomerId.Get(), o.CustomerId.IsSet()
}

func (o *MediaInfo) HasCustomerId() bool {
	if o != nil && o.CustomerId.IsSet() {
		return true
	}

	return false
}

func (o *MediaInfo) SetCustomerId(v string) {
	o.CustomerId.Set(&v)
}
func (o *MediaInfo) SetCustomerIdNil() {
	o.CustomerId.Set(nil)
}

func (o *MediaInfo) UnsetCustomerId() {
	o.CustomerId.Unset()
}

func (o *MediaInfo) GetDevice() string {
	if o == nil || IsNil(o.Device.Get()) {
		var ret string
		return ret
	}
	return *o.Device.Get()
}

func (o *MediaInfo) GetDeviceOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Device.Get(), o.Device.IsSet()
}

func (o *MediaInfo) HasDevice() bool {
	if o != nil && o.Device.IsSet() {
		return true
	}

	return false
}

func (o *MediaInfo) SetDevice(v string) {
	o.Device.Set(&v)
}
func (o *MediaInfo) SetDeviceNil() {
	o.Device.Set(nil)
}

func (o *MediaInfo) UnsetDevice() {
	o.Device.Unset()
}

func (o *MediaInfo) GetExternalRef() string {
	if o == nil || IsNil(o.ExternalRef.Get()) {
		var ret string
		return ret
	}
	return *o.ExternalRef.Get()
}

func (o *MediaInfo) GetExternalRefOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.ExternalRef.Get(), o.ExternalRef.IsSet()
}

func (o *MediaInfo) HasExternalRef() bool {
	if o != nil && o.ExternalRef.IsSet() {
		return true
	}

	return false
}

func (o *MediaInfo) SetExternalRef(v string) {
	o.ExternalRef.Set(&v)
}
func (o *MediaInfo) SetExternalRefNil() {
	o.ExternalRef.Set(nil)
}

func (o *MediaInfo) UnsetExternalRef() {
	o.ExternalRef.Unset()
}

func (o *MediaInfo) GetFrameCount() int32 {
	if o == nil || IsNil(o.FrameCount) {
		var ret int32
		return ret
	}
	return *o.FrameCount
}

func (o *MediaInfo) GetFrameCountOk() (*int32, bool) {
	if o == nil || IsNil(o.FrameCount) {
		return nil, false
	}
	return o.FrameCount, true
}

func (o *MediaInfo) HasFrameCount() bool {
	if o != nil && !IsNil(o.FrameCount) {
		return true
	}

	return false
}

func (o *MediaInfo) SetFrameCount(v int32) {
	o.FrameCount = &v
}

func (o *MediaInfo) GetGpsLat() float32 {
	if o == nil || IsNil(o.GpsLat.Get()) {
		var ret float32
		return ret
	}
	return *o.GpsLat.Get()
}

func (o *MediaInfo) GetGpsLatOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return o.GpsLat.Get(), o.GpsLat.IsSet()
}

func (o *MediaInfo) HasGpsLat() bool {
	if o != nil && o.GpsLat.IsSet() {
		return true
	}

	return false
}

func (o *MediaInfo) SetGpsLat(v float32) {
	o.GpsLat.Set(&v)
}
func (o *MediaInfo) SetGpsLatNil() {
	o.GpsLat.Set(nil)
}

func (o *MediaInfo) UnsetGpsLat() {
	o.GpsLat.Unset()
}

func (o *MediaInfo) GetGpsLon() float32 {
	if o == nil || IsNil(o.GpsLon.Get()) {
		var ret float32
		return ret
	}
	return *o.GpsLon.Get()
}

func (o *MediaInfo) GetGpsLonOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return o.GpsLon.Get(), o.GpsLon.IsSet()
}

func (o *MediaInfo) HasGpsLon() bool {
	if o != nil && o.GpsLon.IsSet() {
		return true
	}

	return false
}

func (o *MediaInfo) SetGpsLon(v float32) {
	o.GpsLon.Set(&v)
}
func (o *MediaInfo) SetGpsLonNil() {
	o.GpsLon.Set(nil)
}

func (o *MediaInfo) UnsetGpsLon() {
	o.GpsLon.Unset()
}

func (o *MediaInfo) GetKind() string {
	if o == nil || IsNil(o.Kind.Get()) {
		var ret string
		return ret
	}
	return *o.Kind.Get()
}

func (o *MediaInfo) GetKindOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Kind.Get(), o.Kind.IsSet()
}

func (o *MediaInfo) HasKind() bool {
	if o != nil && o.Kind.IsSet() {
		return true
	}

	return false
}

func (o *MediaInfo) SetKind(v string) {
	o.Kind.Set(&v)
}
func (o *MediaInfo) SetKindNil() {
	o.Kind.Set(nil)
}

func (o *MediaInfo) UnsetKind() {
	o.Kind.Unset()
}

func (o *MediaInfo) GetMetadata() map[string]interface{} {
	if o == nil {
		var ret map[string]interface{}
		return ret
	}
	return o.Metadata
}

func (o *MediaInfo) GetMetadataOk() (map[string]interface{}, bool) {
	if o == nil || IsNil(o.Metadata) {
		return map[string]interface{}{}, false
	}
	return o.Metadata, true
}

func (o *MediaInfo) HasMetadata() bool {
	if o != nil && !IsNil(o.Metadata) {
		return true
	}

	return false
}

func (o *MediaInfo) SetMetadata(v map[string]interface{}) {
	o.Metadata = v
}

func (o *MediaInfo) GetOcrText() string {
	if o == nil || IsNil(o.OcrText.Get()) {
		var ret string
		return ret
	}
	return *o.OcrText.Get()
}

func (o *MediaInfo) GetOcrTextOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.OcrText.Get(), o.OcrText.IsSet()
}

func (o *MediaInfo) HasOcrText() bool {
	if o != nil && o.OcrText.IsSet() {
		return true
	}

	return false
}

func (o *MediaInfo) SetOcrText(v string) {
	o.OcrText.Set(&v)
}
func (o *MediaInfo) SetOcrTextNil() {
	o.OcrText.Set(nil)
}

func (o *MediaInfo) UnsetOcrText() {
	o.OcrText.Unset()
}

func (o *MediaInfo) GetSynthetic() float32 {
	if o == nil || IsNil(o.Synthetic.Get()) {
		var ret float32
		return ret
	}
	return *o.Synthetic.Get()
}

func (o *MediaInfo) GetSyntheticOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return o.Synthetic.Get(), o.Synthetic.IsSet()
}

func (o *MediaInfo) HasSynthetic() bool {
	if o != nil && o.Synthetic.IsSet() {
		return true
	}

	return false
}

func (o *MediaInfo) SetSynthetic(v float32) {
	o.Synthetic.Set(&v)
}
func (o *MediaInfo) SetSyntheticNil() {
	o.Synthetic.Set(nil)
}

func (o *MediaInfo) UnsetSynthetic() {
	o.Synthetic.Unset()
}

func (o *MediaInfo) GetTags() []string {
	if o == nil || IsNil(o.Tags) {
		var ret []string
		return ret
	}
	return o.Tags
}

func (o *MediaInfo) GetTagsOk() ([]string, bool) {
	if o == nil || IsNil(o.Tags) {
		return nil, false
	}
	return o.Tags, true
}

func (o *MediaInfo) HasTags() bool {
	if o != nil && !IsNil(o.Tags) {
		return true
	}

	return false
}

func (o *MediaInfo) SetTags(v []string) {
	o.Tags = v
}

func (o *MediaInfo) GetTranscriptSegments() int32 {
	if o == nil || IsNil(o.TranscriptSegments) {
		var ret int32
		return ret
	}
	return *o.TranscriptSegments
}

func (o *MediaInfo) GetTranscriptSegmentsOk() (*int32, bool) {
	if o == nil || IsNil(o.TranscriptSegments) {
		return nil, false
	}
	return o.TranscriptSegments, true
}

func (o *MediaInfo) HasTranscriptSegments() bool {
	if o != nil && !IsNil(o.TranscriptSegments) {
		return true
	}

	return false
}

func (o *MediaInfo) SetTranscriptSegments(v int32) {
	o.TranscriptSegments = &v
}

func (o MediaInfo) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o MediaInfo) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["blob_id"] = o.BlobId
	if o.Caption.IsSet() {
		toSerialize["caption"] = o.Caption.Get()
	}
	if o.CapturedAt.IsSet() {
		toSerialize["captured_at"] = o.CapturedAt.Get()
	}
	if o.CustomerId.IsSet() {
		toSerialize["customer_id"] = o.CustomerId.Get()
	}
	if o.Device.IsSet() {
		toSerialize["device"] = o.Device.Get()
	}
	if o.ExternalRef.IsSet() {
		toSerialize["external_ref"] = o.ExternalRef.Get()
	}
	if !IsNil(o.FrameCount) {
		toSerialize["frame_count"] = o.FrameCount
	}
	if o.GpsLat.IsSet() {
		toSerialize["gps_lat"] = o.GpsLat.Get()
	}
	if o.GpsLon.IsSet() {
		toSerialize["gps_lon"] = o.GpsLon.Get()
	}
	if o.Kind.IsSet() {
		toSerialize["kind"] = o.Kind.Get()
	}
	if o.Metadata != nil {
		toSerialize["metadata"] = o.Metadata
	}
	if o.OcrText.IsSet() {
		toSerialize["ocr_text"] = o.OcrText.Get()
	}
	if o.Synthetic.IsSet() {
		toSerialize["synthetic"] = o.Synthetic.Get()
	}
	if !IsNil(o.Tags) {
		toSerialize["tags"] = o.Tags
	}
	if !IsNil(o.TranscriptSegments) {
		toSerialize["transcript_segments"] = o.TranscriptSegments
	}
	return toSerialize, nil
}

func (o *MediaInfo) UnmarshalJSON(data []byte) (err error) {
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

	varMediaInfo := _MediaInfo{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varMediaInfo)

	if err != nil {
		return err
	}

	*o = MediaInfo(varMediaInfo)

	return err
}

type NullableMediaInfo struct {
	value *MediaInfo
	isSet bool
}

func (v NullableMediaInfo) Get() *MediaInfo {
	return v.value
}

func (v *NullableMediaInfo) Set(val *MediaInfo) {
	v.value = val
	v.isSet = true
}

func (v NullableMediaInfo) IsSet() bool {
	return v.isSet
}

func (v *NullableMediaInfo) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableMediaInfo(val *MediaInfo) *NullableMediaInfo {
	return &NullableMediaInfo{value: val, isSet: true}
}

func (v NullableMediaInfo) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableMediaInfo) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

