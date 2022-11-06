/*
Smooth API

Smooth API

API version: 0.0.1
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
)

// SdkResponse struct for SdkResponse
type SdkResponse struct {
	Sdks []Sdk `json:"sdks,omitempty"`
}

// NewSdkResponse instantiates a new SdkResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewSdkResponse() *SdkResponse {
	this := SdkResponse{}
	return &this
}

// NewSdkResponseWithDefaults instantiates a new SdkResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewSdkResponseWithDefaults() *SdkResponse {
	this := SdkResponse{}
	return &this
}

// GetSdks returns the Sdks field value if set, zero value otherwise.
func (o *SdkResponse) GetSdks() []Sdk {
	if o == nil || isNil(o.Sdks) {
		var ret []Sdk
		return ret
	}
	return o.Sdks
}

// GetSdksOk returns a tuple with the Sdks field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SdkResponse) GetSdksOk() ([]Sdk, bool) {
	if o == nil || isNil(o.Sdks) {
    return nil, false
	}
	return o.Sdks, true
}

// HasSdks returns a boolean if a field has been set.
func (o *SdkResponse) HasSdks() bool {
	if o != nil && !isNil(o.Sdks) {
		return true
	}

	return false
}

// SetSdks gets a reference to the given []Sdk and assigns it to the Sdks field.
func (o *SdkResponse) SetSdks(v []Sdk) {
	o.Sdks = v
}

func (o SdkResponse) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Sdks) {
		toSerialize["sdks"] = o.Sdks
	}
	return json.Marshal(toSerialize)
}

type NullableSdkResponse struct {
	value *SdkResponse
	isSet bool
}

func (v NullableSdkResponse) Get() *SdkResponse {
	return v.value
}

func (v *NullableSdkResponse) Set(val *SdkResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableSdkResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableSdkResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSdkResponse(val *SdkResponse) *NullableSdkResponse {
	return &NullableSdkResponse{value: val, isSet: true}
}

func (v NullableSdkResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSdkResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


