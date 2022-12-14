/*
Outmatch API

Outmatch API

API version: 0.0.45
Contact: internal@outmatchapi.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package api

import (
	"encoding/json"
)

// Release struct for Release
type Release struct {
	Id string `json:"id"`
	Spec Spec `json:"spec"`
}

// NewRelease instantiates a new Release object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewRelease(id string, spec Spec) *Release {
	this := Release{}
	this.Id = id
	this.Spec = spec
	return &this
}

// NewReleaseWithDefaults instantiates a new Release object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewReleaseWithDefaults() *Release {
	this := Release{}
	return &this
}

// GetId returns the Id field value
func (o *Release) GetId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *Release) GetIdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *Release) SetId(v string) {
	o.Id = v
}

// GetSpec returns the Spec field value
func (o *Release) GetSpec() Spec {
	if o == nil {
		var ret Spec
		return ret
	}

	return o.Spec
}

// GetSpecOk returns a tuple with the Spec field value
// and a boolean to check if the value has been set.
func (o *Release) GetSpecOk() (*Spec, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Spec, true
}

// SetSpec sets field value
func (o *Release) SetSpec(v Spec) {
	o.Spec = v
}

func (o Release) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["id"] = o.Id
	}
	if true {
		toSerialize["spec"] = o.Spec
	}
	return json.Marshal(toSerialize)
}

type NullableRelease struct {
	value *Release
	isSet bool
}

func (v NullableRelease) Get() *Release {
	return v.value
}

func (v *NullableRelease) Set(val *Release) {
	v.value = val
	v.isSet = true
}

func (v NullableRelease) IsSet() bool {
	return v.isSet
}

func (v *NullableRelease) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableRelease(val *Release) *NullableRelease {
	return &NullableRelease{value: val, isSet: true}
}

func (v NullableRelease) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableRelease) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


