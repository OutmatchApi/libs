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

// ReactionsGetSuccessSchemaInnerAnyOf1 struct for ReactionsGetSuccessSchemaInnerAnyOf1
type ReactionsGetSuccessSchemaInnerAnyOf1 struct {
	File ObjsFile `json:"file"`
	Ok DefsOkTrue `json:"ok"`
	Type string `json:"type"`
}

// NewReactionsGetSuccessSchemaInnerAnyOf1 instantiates a new ReactionsGetSuccessSchemaInnerAnyOf1 object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewReactionsGetSuccessSchemaInnerAnyOf1(file ObjsFile, ok DefsOkTrue, type_ string) *ReactionsGetSuccessSchemaInnerAnyOf1 {
	this := ReactionsGetSuccessSchemaInnerAnyOf1{}
	this.File = file
	this.Ok = ok
	this.Type = type_
	return &this
}

// NewReactionsGetSuccessSchemaInnerAnyOf1WithDefaults instantiates a new ReactionsGetSuccessSchemaInnerAnyOf1 object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewReactionsGetSuccessSchemaInnerAnyOf1WithDefaults() *ReactionsGetSuccessSchemaInnerAnyOf1 {
	this := ReactionsGetSuccessSchemaInnerAnyOf1{}
	return &this
}

// GetFile returns the File field value
func (o *ReactionsGetSuccessSchemaInnerAnyOf1) GetFile() ObjsFile {
	if o == nil {
		var ret ObjsFile
		return ret
	}

	return o.File
}

// GetFileOk returns a tuple with the File field value
// and a boolean to check if the value has been set.
func (o *ReactionsGetSuccessSchemaInnerAnyOf1) GetFileOk() (*ObjsFile, bool) {
	if o == nil {
    return nil, false
	}
	return &o.File, true
}

// SetFile sets field value
func (o *ReactionsGetSuccessSchemaInnerAnyOf1) SetFile(v ObjsFile) {
	o.File = v
}

// GetOk returns the Ok field value
func (o *ReactionsGetSuccessSchemaInnerAnyOf1) GetOk() DefsOkTrue {
	if o == nil {
		var ret DefsOkTrue
		return ret
	}

	return o.Ok
}

// GetOkOk returns a tuple with the Ok field value
// and a boolean to check if the value has been set.
func (o *ReactionsGetSuccessSchemaInnerAnyOf1) GetOkOk() (*DefsOkTrue, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Ok, true
}

// SetOk sets field value
func (o *ReactionsGetSuccessSchemaInnerAnyOf1) SetOk(v DefsOkTrue) {
	o.Ok = v
}

// GetType returns the Type field value
func (o *ReactionsGetSuccessSchemaInnerAnyOf1) GetType() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Type
}

// GetTypeOk returns a tuple with the Type field value
// and a boolean to check if the value has been set.
func (o *ReactionsGetSuccessSchemaInnerAnyOf1) GetTypeOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Type, true
}

// SetType sets field value
func (o *ReactionsGetSuccessSchemaInnerAnyOf1) SetType(v string) {
	o.Type = v
}

func (o ReactionsGetSuccessSchemaInnerAnyOf1) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["file"] = o.File
	}
	if true {
		toSerialize["ok"] = o.Ok
	}
	if true {
		toSerialize["type"] = o.Type
	}
	return json.Marshal(toSerialize)
}

type NullableReactionsGetSuccessSchemaInnerAnyOf1 struct {
	value *ReactionsGetSuccessSchemaInnerAnyOf1
	isSet bool
}

func (v NullableReactionsGetSuccessSchemaInnerAnyOf1) Get() *ReactionsGetSuccessSchemaInnerAnyOf1 {
	return v.value
}

func (v *NullableReactionsGetSuccessSchemaInnerAnyOf1) Set(val *ReactionsGetSuccessSchemaInnerAnyOf1) {
	v.value = val
	v.isSet = true
}

func (v NullableReactionsGetSuccessSchemaInnerAnyOf1) IsSet() bool {
	return v.isSet
}

func (v *NullableReactionsGetSuccessSchemaInnerAnyOf1) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableReactionsGetSuccessSchemaInnerAnyOf1(val *ReactionsGetSuccessSchemaInnerAnyOf1) *NullableReactionsGetSuccessSchemaInnerAnyOf1 {
	return &NullableReactionsGetSuccessSchemaInnerAnyOf1{value: val, isSet: true}
}

func (v NullableReactionsGetSuccessSchemaInnerAnyOf1) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableReactionsGetSuccessSchemaInnerAnyOf1) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

