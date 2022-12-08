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

// DialogOpenSchema Schema for successful response from dialog.open method
type DialogOpenSchema struct {
	Ok DefsOkTrue `json:"ok"`
}

// NewDialogOpenSchema instantiates a new DialogOpenSchema object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewDialogOpenSchema(ok DefsOkTrue) *DialogOpenSchema {
	this := DialogOpenSchema{}
	this.Ok = ok
	return &this
}

// NewDialogOpenSchemaWithDefaults instantiates a new DialogOpenSchema object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewDialogOpenSchemaWithDefaults() *DialogOpenSchema {
	this := DialogOpenSchema{}
	return &this
}

// GetOk returns the Ok field value
func (o *DialogOpenSchema) GetOk() DefsOkTrue {
	if o == nil {
		var ret DefsOkTrue
		return ret
	}

	return o.Ok
}

// GetOkOk returns a tuple with the Ok field value
// and a boolean to check if the value has been set.
func (o *DialogOpenSchema) GetOkOk() (*DefsOkTrue, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Ok, true
}

// SetOk sets field value
func (o *DialogOpenSchema) SetOk(v DefsOkTrue) {
	o.Ok = v
}

func (o DialogOpenSchema) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["ok"] = o.Ok
	}
	return json.Marshal(toSerialize)
}

type NullableDialogOpenSchema struct {
	value *DialogOpenSchema
	isSet bool
}

func (v NullableDialogOpenSchema) Get() *DialogOpenSchema {
	return v.value
}

func (v *NullableDialogOpenSchema) Set(val *DialogOpenSchema) {
	v.value = val
	v.isSet = true
}

func (v NullableDialogOpenSchema) IsSet() bool {
	return v.isSet
}

func (v *NullableDialogOpenSchema) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableDialogOpenSchema(val *DialogOpenSchema) *NullableDialogOpenSchema {
	return &NullableDialogOpenSchema{value: val, isSet: true}
}

func (v NullableDialogOpenSchema) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableDialogOpenSchema) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


