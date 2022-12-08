/*
Slack Web API

One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.

API version: 1.7.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package slack

import (
	"encoding/json"
)

// PinsAddSchema Schema for successful response from pins.add method
type PinsAddSchema struct {
	Ok DefsOkTrue `json:"ok"`
}

// NewPinsAddSchema instantiates a new PinsAddSchema object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewPinsAddSchema(ok DefsOkTrue) *PinsAddSchema {
	this := PinsAddSchema{}
	this.Ok = ok
	return &this
}

// NewPinsAddSchemaWithDefaults instantiates a new PinsAddSchema object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewPinsAddSchemaWithDefaults() *PinsAddSchema {
	this := PinsAddSchema{}
	return &this
}

// GetOk returns the Ok field value
func (o *PinsAddSchema) GetOk() DefsOkTrue {
	if o == nil {
		var ret DefsOkTrue
		return ret
	}

	return o.Ok
}

// GetOkOk returns a tuple with the Ok field value
// and a boolean to check if the value has been set.
func (o *PinsAddSchema) GetOkOk() (*DefsOkTrue, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Ok, true
}

// SetOk sets field value
func (o *PinsAddSchema) SetOk(v DefsOkTrue) {
	o.Ok = v
}

func (o PinsAddSchema) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["ok"] = o.Ok
	}
	return json.Marshal(toSerialize)
}

type NullablePinsAddSchema struct {
	value *PinsAddSchema
	isSet bool
}

func (v NullablePinsAddSchema) Get() *PinsAddSchema {
	return v.value
}

func (v *NullablePinsAddSchema) Set(val *PinsAddSchema) {
	v.value = val
	v.isSet = true
}

func (v NullablePinsAddSchema) IsSet() bool {
	return v.isSet
}

func (v *NullablePinsAddSchema) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullablePinsAddSchema(val *PinsAddSchema) *NullablePinsAddSchema {
	return &NullablePinsAddSchema{value: val, isSet: true}
}

func (v NullablePinsAddSchema) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullablePinsAddSchema) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


