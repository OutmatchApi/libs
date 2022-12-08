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

// VideostatusEncoding struct for VideostatusEncoding
type VideostatusEncoding struct {
	Metadata *VideostatusEncodingMetadata `json:"metadata,omitempty"`
	// Whether the video is playable or not.
	Playable *bool `json:"playable,omitempty"`
	// Available qualities the video can be viewed in.
	Qualities []Quality `json:"qualities,omitempty"`
}

// NewVideostatusEncoding instantiates a new VideostatusEncoding object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewVideostatusEncoding() *VideostatusEncoding {
	this := VideostatusEncoding{}
	return &this
}

// NewVideostatusEncodingWithDefaults instantiates a new VideostatusEncoding object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewVideostatusEncodingWithDefaults() *VideostatusEncoding {
	this := VideostatusEncoding{}
	return &this
}

// GetMetadata returns the Metadata field value if set, zero value otherwise.
func (o *VideostatusEncoding) GetMetadata() VideostatusEncodingMetadata {
	if o == nil || isNil(o.Metadata) {
		var ret VideostatusEncodingMetadata
		return ret
	}
	return *o.Metadata
}

// GetMetadataOk returns a tuple with the Metadata field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *VideostatusEncoding) GetMetadataOk() (*VideostatusEncodingMetadata, bool) {
	if o == nil || isNil(o.Metadata) {
    return nil, false
	}
	return o.Metadata, true
}

// HasMetadata returns a boolean if a field has been set.
func (o *VideostatusEncoding) HasMetadata() bool {
	if o != nil && !isNil(o.Metadata) {
		return true
	}

	return false
}

// SetMetadata gets a reference to the given VideostatusEncodingMetadata and assigns it to the Metadata field.
func (o *VideostatusEncoding) SetMetadata(v VideostatusEncodingMetadata) {
	o.Metadata = &v
}

// GetPlayable returns the Playable field value if set, zero value otherwise.
func (o *VideostatusEncoding) GetPlayable() bool {
	if o == nil || isNil(o.Playable) {
		var ret bool
		return ret
	}
	return *o.Playable
}

// GetPlayableOk returns a tuple with the Playable field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *VideostatusEncoding) GetPlayableOk() (*bool, bool) {
	if o == nil || isNil(o.Playable) {
    return nil, false
	}
	return o.Playable, true
}

// HasPlayable returns a boolean if a field has been set.
func (o *VideostatusEncoding) HasPlayable() bool {
	if o != nil && !isNil(o.Playable) {
		return true
	}

	return false
}

// SetPlayable gets a reference to the given bool and assigns it to the Playable field.
func (o *VideostatusEncoding) SetPlayable(v bool) {
	o.Playable = &v
}

// GetQualities returns the Qualities field value if set, zero value otherwise.
func (o *VideostatusEncoding) GetQualities() []Quality {
	if o == nil || isNil(o.Qualities) {
		var ret []Quality
		return ret
	}
	return o.Qualities
}

// GetQualitiesOk returns a tuple with the Qualities field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *VideostatusEncoding) GetQualitiesOk() ([]Quality, bool) {
	if o == nil || isNil(o.Qualities) {
    return nil, false
	}
	return o.Qualities, true
}

// HasQualities returns a boolean if a field has been set.
func (o *VideostatusEncoding) HasQualities() bool {
	if o != nil && !isNil(o.Qualities) {
		return true
	}

	return false
}

// SetQualities gets a reference to the given []Quality and assigns it to the Qualities field.
func (o *VideostatusEncoding) SetQualities(v []Quality) {
	o.Qualities = v
}

func (o VideostatusEncoding) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Metadata) {
		toSerialize["metadata"] = o.Metadata
	}
	if !isNil(o.Playable) {
		toSerialize["playable"] = o.Playable
	}
	if !isNil(o.Qualities) {
		toSerialize["qualities"] = o.Qualities
	}
	return json.Marshal(toSerialize)
}

type NullableVideostatusEncoding struct {
	value *VideostatusEncoding
	isSet bool
}

func (v NullableVideostatusEncoding) Get() *VideostatusEncoding {
	return v.value
}

func (v *NullableVideostatusEncoding) Set(val *VideostatusEncoding) {
	v.value = val
	v.isSet = true
}

func (v NullableVideostatusEncoding) IsSet() bool {
	return v.isSet
}

func (v *NullableVideostatusEncoding) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableVideostatusEncoding(val *VideostatusEncoding) *NullableVideostatusEncoding {
	return &NullableVideostatusEncoding{value: val, isSet: true}
}

func (v NullableVideostatusEncoding) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableVideostatusEncoding) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


