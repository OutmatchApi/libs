/*
api.video

api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.

API version: 1.0.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package testing-api-video

import (
	"encoding/json"
)

// VideostatusIngest Details about the capturing, transferring, and storing of your video for use immediately or in the future.
type VideostatusIngest struct {
	// The size of your file in bytes.
	Filesize *int32 `json:"filesize,omitempty"`
	// The total number of bytes received, listed for each chunk of the upload.
	ReceivedBytes []BytesRange `json:"receivedBytes,omitempty"`
	// There are three possible ingest statuses. missing - you are missing information required to ingest the video. uploading - the video is in the process of being uploaded. uploaded - the video is ready for use.
	Status *string `json:"status,omitempty"`
}

// NewVideostatusIngest instantiates a new VideostatusIngest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewVideostatusIngest() *VideostatusIngest {
	this := VideostatusIngest{}
	return &this
}

// NewVideostatusIngestWithDefaults instantiates a new VideostatusIngest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewVideostatusIngestWithDefaults() *VideostatusIngest {
	this := VideostatusIngest{}
	return &this
}

// GetFilesize returns the Filesize field value if set, zero value otherwise.
func (o *VideostatusIngest) GetFilesize() int32 {
	if o == nil || isNil(o.Filesize) {
		var ret int32
		return ret
	}
	return *o.Filesize
}

// GetFilesizeOk returns a tuple with the Filesize field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *VideostatusIngest) GetFilesizeOk() (*int32, bool) {
	if o == nil || isNil(o.Filesize) {
    return nil, false
	}
	return o.Filesize, true
}

// HasFilesize returns a boolean if a field has been set.
func (o *VideostatusIngest) HasFilesize() bool {
	if o != nil && !isNil(o.Filesize) {
		return true
	}

	return false
}

// SetFilesize gets a reference to the given int32 and assigns it to the Filesize field.
func (o *VideostatusIngest) SetFilesize(v int32) {
	o.Filesize = &v
}

// GetReceivedBytes returns the ReceivedBytes field value if set, zero value otherwise.
func (o *VideostatusIngest) GetReceivedBytes() []BytesRange {
	if o == nil || isNil(o.ReceivedBytes) {
		var ret []BytesRange
		return ret
	}
	return o.ReceivedBytes
}

// GetReceivedBytesOk returns a tuple with the ReceivedBytes field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *VideostatusIngest) GetReceivedBytesOk() ([]BytesRange, bool) {
	if o == nil || isNil(o.ReceivedBytes) {
    return nil, false
	}
	return o.ReceivedBytes, true
}

// HasReceivedBytes returns a boolean if a field has been set.
func (o *VideostatusIngest) HasReceivedBytes() bool {
	if o != nil && !isNil(o.ReceivedBytes) {
		return true
	}

	return false
}

// SetReceivedBytes gets a reference to the given []BytesRange and assigns it to the ReceivedBytes field.
func (o *VideostatusIngest) SetReceivedBytes(v []BytesRange) {
	o.ReceivedBytes = v
}

// GetStatus returns the Status field value if set, zero value otherwise.
func (o *VideostatusIngest) GetStatus() string {
	if o == nil || isNil(o.Status) {
		var ret string
		return ret
	}
	return *o.Status
}

// GetStatusOk returns a tuple with the Status field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *VideostatusIngest) GetStatusOk() (*string, bool) {
	if o == nil || isNil(o.Status) {
    return nil, false
	}
	return o.Status, true
}

// HasStatus returns a boolean if a field has been set.
func (o *VideostatusIngest) HasStatus() bool {
	if o != nil && !isNil(o.Status) {
		return true
	}

	return false
}

// SetStatus gets a reference to the given string and assigns it to the Status field.
func (o *VideostatusIngest) SetStatus(v string) {
	o.Status = &v
}

func (o VideostatusIngest) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Filesize) {
		toSerialize["filesize"] = o.Filesize
	}
	if !isNil(o.ReceivedBytes) {
		toSerialize["receivedBytes"] = o.ReceivedBytes
	}
	if !isNil(o.Status) {
		toSerialize["status"] = o.Status
	}
	return json.Marshal(toSerialize)
}

type NullableVideostatusIngest struct {
	value *VideostatusIngest
	isSet bool
}

func (v NullableVideostatusIngest) Get() *VideostatusIngest {
	return v.value
}

func (v *NullableVideostatusIngest) Set(val *VideostatusIngest) {
	v.value = val
	v.isSet = true
}

func (v NullableVideostatusIngest) IsSet() bool {
	return v.isSet
}

func (v *NullableVideostatusIngest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableVideostatusIngest(val *VideostatusIngest) *NullableVideostatusIngest {
	return &NullableVideostatusIngest{value: val, isSet: true}
}

func (v NullableVideostatusIngest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableVideostatusIngest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


