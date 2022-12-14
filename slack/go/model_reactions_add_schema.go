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

// ReactionsAddSchema Schema for successful response from reactions.add method
type ReactionsAddSchema struct {
	Ok DefsOkTrue `json:"ok"`
}

// NewReactionsAddSchema instantiates a new ReactionsAddSchema object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewReactionsAddSchema(ok DefsOkTrue) *ReactionsAddSchema {
	this := ReactionsAddSchema{}
	this.Ok = ok
	return &this
}

// NewReactionsAddSchemaWithDefaults instantiates a new ReactionsAddSchema object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewReactionsAddSchemaWithDefaults() *ReactionsAddSchema {
	this := ReactionsAddSchema{}
	return &this
}

// GetOk returns the Ok field value
func (o *ReactionsAddSchema) GetOk() DefsOkTrue {
	if o == nil {
		var ret DefsOkTrue
		return ret
	}

	return o.Ok
}

// GetOkOk returns a tuple with the Ok field value
// and a boolean to check if the value has been set.
func (o *ReactionsAddSchema) GetOkOk() (*DefsOkTrue, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Ok, true
}

// SetOk sets field value
func (o *ReactionsAddSchema) SetOk(v DefsOkTrue) {
	o.Ok = v
}

func (o ReactionsAddSchema) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["ok"] = o.Ok
	}
	return json.Marshal(toSerialize)
}

type NullableReactionsAddSchema struct {
	value *ReactionsAddSchema
	isSet bool
}

func (v NullableReactionsAddSchema) Get() *ReactionsAddSchema {
	return v.value
}

func (v *NullableReactionsAddSchema) Set(val *ReactionsAddSchema) {
	v.value = val
	v.isSet = true
}

func (v NullableReactionsAddSchema) IsSet() bool {
	return v.isSet
}

func (v *NullableReactionsAddSchema) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableReactionsAddSchema(val *ReactionsAddSchema) *NullableReactionsAddSchema {
	return &NullableReactionsAddSchema{value: val, isSet: true}
}

func (v NullableReactionsAddSchema) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableReactionsAddSchema) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


