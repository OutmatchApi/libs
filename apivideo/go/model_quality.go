/*
api.video

api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.

API version: 1.0.1
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package apivideo

import (
	"encoding/json"
)

// Quality struct for Quality
type Quality struct {
	// The quality of the video you have, in pixels. Choices include 360p, 480p, 720p, 1080p, and 2160p.
	Quality *string `json:"quality,omitempty"`
	// The status of your video. Statuses include waiting - the video is waiting to be encoded. encoding - the video is in the process of being encoded. encoded - the video was successfully encoded. failed - the video failed to be encoded.
	Status *string `json:"status,omitempty"`
}

// NewQuality instantiates a new Quality object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewQuality() *Quality {
	this := Quality{}
	return &this
}

// NewQualityWithDefaults instantiates a new Quality object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewQualityWithDefaults() *Quality {
	this := Quality{}
	return &this
}

// GetQuality returns the Quality field value if set, zero value otherwise.
func (o *Quality) GetQuality() string {
	if o == nil || isNil(o.Quality) {
		var ret string
		return ret
	}
	return *o.Quality
}

// GetQualityOk returns a tuple with the Quality field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Quality) GetQualityOk() (*string, bool) {
	if o == nil || isNil(o.Quality) {
    return nil, false
	}
	return o.Quality, true
}

// HasQuality returns a boolean if a field has been set.
func (o *Quality) HasQuality() bool {
	if o != nil && !isNil(o.Quality) {
		return true
	}

	return false
}

// SetQuality gets a reference to the given string and assigns it to the Quality field.
func (o *Quality) SetQuality(v string) {
	o.Quality = &v
}

// GetStatus returns the Status field value if set, zero value otherwise.
func (o *Quality) GetStatus() string {
	if o == nil || isNil(o.Status) {
		var ret string
		return ret
	}
	return *o.Status
}

// GetStatusOk returns a tuple with the Status field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Quality) GetStatusOk() (*string, bool) {
	if o == nil || isNil(o.Status) {
    return nil, false
	}
	return o.Status, true
}

// HasStatus returns a boolean if a field has been set.
func (o *Quality) HasStatus() bool {
	if o != nil && !isNil(o.Status) {
		return true
	}

	return false
}

// SetStatus gets a reference to the given string and assigns it to the Status field.
func (o *Quality) SetStatus(v string) {
	o.Status = &v
}

func (o Quality) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Quality) {
		toSerialize["quality"] = o.Quality
	}
	if !isNil(o.Status) {
		toSerialize["status"] = o.Status
	}
	return json.Marshal(toSerialize)
}

type NullableQuality struct {
	value *Quality
	isSet bool
}

func (v NullableQuality) Get() *Quality {
	return v.value
}

func (v *NullableQuality) Set(val *Quality) {
	v.value = val
	v.isSet = true
}

func (v NullableQuality) IsSet() bool {
	return v.isSet
}

func (v *NullableQuality) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableQuality(val *Quality) *NullableQuality {
	return &NullableQuality{value: val, isSet: true}
}

func (v NullableQuality) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableQuality) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


