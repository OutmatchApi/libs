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

// Videostatus struct for Videostatus
type Videostatus struct {
	Encoding *VideostatusEncoding `json:"encoding,omitempty"`
	Ingest *VideostatusIngest `json:"ingest,omitempty"`
}

// NewVideostatus instantiates a new Videostatus object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewVideostatus() *Videostatus {
	this := Videostatus{}
	return &this
}

// NewVideostatusWithDefaults instantiates a new Videostatus object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewVideostatusWithDefaults() *Videostatus {
	this := Videostatus{}
	return &this
}

// GetEncoding returns the Encoding field value if set, zero value otherwise.
func (o *Videostatus) GetEncoding() VideostatusEncoding {
	if o == nil || isNil(o.Encoding) {
		var ret VideostatusEncoding
		return ret
	}
	return *o.Encoding
}

// GetEncodingOk returns a tuple with the Encoding field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Videostatus) GetEncodingOk() (*VideostatusEncoding, bool) {
	if o == nil || isNil(o.Encoding) {
    return nil, false
	}
	return o.Encoding, true
}

// HasEncoding returns a boolean if a field has been set.
func (o *Videostatus) HasEncoding() bool {
	if o != nil && !isNil(o.Encoding) {
		return true
	}

	return false
}

// SetEncoding gets a reference to the given VideostatusEncoding and assigns it to the Encoding field.
func (o *Videostatus) SetEncoding(v VideostatusEncoding) {
	o.Encoding = &v
}

// GetIngest returns the Ingest field value if set, zero value otherwise.
func (o *Videostatus) GetIngest() VideostatusIngest {
	if o == nil || isNil(o.Ingest) {
		var ret VideostatusIngest
		return ret
	}
	return *o.Ingest
}

// GetIngestOk returns a tuple with the Ingest field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Videostatus) GetIngestOk() (*VideostatusIngest, bool) {
	if o == nil || isNil(o.Ingest) {
    return nil, false
	}
	return o.Ingest, true
}

// HasIngest returns a boolean if a field has been set.
func (o *Videostatus) HasIngest() bool {
	if o != nil && !isNil(o.Ingest) {
		return true
	}

	return false
}

// SetIngest gets a reference to the given VideostatusIngest and assigns it to the Ingest field.
func (o *Videostatus) SetIngest(v VideostatusIngest) {
	o.Ingest = &v
}

func (o Videostatus) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Encoding) {
		toSerialize["encoding"] = o.Encoding
	}
	if !isNil(o.Ingest) {
		toSerialize["ingest"] = o.Ingest
	}
	return json.Marshal(toSerialize)
}

type NullableVideostatus struct {
	value *Videostatus
	isSet bool
}

func (v NullableVideostatus) Get() *Videostatus {
	return v.value
}

func (v *NullableVideostatus) Set(val *Videostatus) {
	v.value = val
	v.isSet = true
}

func (v NullableVideostatus) IsSet() bool {
	return v.isSet
}

func (v *NullableVideostatus) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableVideostatus(val *Videostatus) *NullableVideostatus {
	return &NullableVideostatus{value: val, isSet: true}
}

func (v NullableVideostatus) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableVideostatus) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

