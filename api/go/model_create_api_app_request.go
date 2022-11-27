/*
Outmatch API

Outmatch API

API version: 0.0.39
Contact: internal@outmatchapi.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package api

import (
	"encoding/json"
)

// CreateApiAppRequest struct for CreateApiAppRequest
type CreateApiAppRequest struct {
	Name string `json:"name"`
}

// NewCreateApiAppRequest instantiates a new CreateApiAppRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCreateApiAppRequest(name string) *CreateApiAppRequest {
	this := CreateApiAppRequest{}
	this.Name = name
	return &this
}

// NewCreateApiAppRequestWithDefaults instantiates a new CreateApiAppRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCreateApiAppRequestWithDefaults() *CreateApiAppRequest {
	this := CreateApiAppRequest{}
	return &this
}

// GetName returns the Name field value
func (o *CreateApiAppRequest) GetName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Name
}

// GetNameOk returns a tuple with the Name field value
// and a boolean to check if the value has been set.
func (o *CreateApiAppRequest) GetNameOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Name, true
}

// SetName sets field value
func (o *CreateApiAppRequest) SetName(v string) {
	o.Name = v
}

func (o CreateApiAppRequest) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["name"] = o.Name
	}
	return json.Marshal(toSerialize)
}

type NullableCreateApiAppRequest struct {
	value *CreateApiAppRequest
	isSet bool
}

func (v NullableCreateApiAppRequest) Get() *CreateApiAppRequest {
	return v.value
}

func (v *NullableCreateApiAppRequest) Set(val *CreateApiAppRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableCreateApiAppRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableCreateApiAppRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCreateApiAppRequest(val *CreateApiAppRequest) *NullableCreateApiAppRequest {
	return &NullableCreateApiAppRequest{value: val, isSet: true}
}

func (v NullableCreateApiAppRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCreateApiAppRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


