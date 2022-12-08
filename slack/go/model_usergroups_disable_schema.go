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

// UsergroupsDisableSchema Schema for successful response from usergroups.disable method
type UsergroupsDisableSchema struct {
	Ok DefsOkTrue `json:"ok"`
	Usergroup ObjsSubteam `json:"usergroup"`
}

// NewUsergroupsDisableSchema instantiates a new UsergroupsDisableSchema object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewUsergroupsDisableSchema(ok DefsOkTrue, usergroup ObjsSubteam) *UsergroupsDisableSchema {
	this := UsergroupsDisableSchema{}
	this.Ok = ok
	this.Usergroup = usergroup
	return &this
}

// NewUsergroupsDisableSchemaWithDefaults instantiates a new UsergroupsDisableSchema object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewUsergroupsDisableSchemaWithDefaults() *UsergroupsDisableSchema {
	this := UsergroupsDisableSchema{}
	return &this
}

// GetOk returns the Ok field value
func (o *UsergroupsDisableSchema) GetOk() DefsOkTrue {
	if o == nil {
		var ret DefsOkTrue
		return ret
	}

	return o.Ok
}

// GetOkOk returns a tuple with the Ok field value
// and a boolean to check if the value has been set.
func (o *UsergroupsDisableSchema) GetOkOk() (*DefsOkTrue, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Ok, true
}

// SetOk sets field value
func (o *UsergroupsDisableSchema) SetOk(v DefsOkTrue) {
	o.Ok = v
}

// GetUsergroup returns the Usergroup field value
func (o *UsergroupsDisableSchema) GetUsergroup() ObjsSubteam {
	if o == nil {
		var ret ObjsSubteam
		return ret
	}

	return o.Usergroup
}

// GetUsergroupOk returns a tuple with the Usergroup field value
// and a boolean to check if the value has been set.
func (o *UsergroupsDisableSchema) GetUsergroupOk() (*ObjsSubteam, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Usergroup, true
}

// SetUsergroup sets field value
func (o *UsergroupsDisableSchema) SetUsergroup(v ObjsSubteam) {
	o.Usergroup = v
}

func (o UsergroupsDisableSchema) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["ok"] = o.Ok
	}
	if true {
		toSerialize["usergroup"] = o.Usergroup
	}
	return json.Marshal(toSerialize)
}

type NullableUsergroupsDisableSchema struct {
	value *UsergroupsDisableSchema
	isSet bool
}

func (v NullableUsergroupsDisableSchema) Get() *UsergroupsDisableSchema {
	return v.value
}

func (v *NullableUsergroupsDisableSchema) Set(val *UsergroupsDisableSchema) {
	v.value = val
	v.isSet = true
}

func (v NullableUsergroupsDisableSchema) IsSet() bool {
	return v.isSet
}

func (v *NullableUsergroupsDisableSchema) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUsergroupsDisableSchema(val *UsergroupsDisableSchema) *NullableUsergroupsDisableSchema {
	return &NullableUsergroupsDisableSchema{value: val, isSet: true}
}

func (v NullableUsergroupsDisableSchema) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUsergroupsDisableSchema) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

