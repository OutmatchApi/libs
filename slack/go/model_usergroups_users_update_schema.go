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

// UsergroupsUsersUpdateSchema Schema for successful response from usergroups.users.update method
type UsergroupsUsersUpdateSchema struct {
	Ok DefsOkTrue `json:"ok"`
	Usergroup ObjsSubteam `json:"usergroup"`
}

// NewUsergroupsUsersUpdateSchema instantiates a new UsergroupsUsersUpdateSchema object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewUsergroupsUsersUpdateSchema(ok DefsOkTrue, usergroup ObjsSubteam) *UsergroupsUsersUpdateSchema {
	this := UsergroupsUsersUpdateSchema{}
	this.Ok = ok
	this.Usergroup = usergroup
	return &this
}

// NewUsergroupsUsersUpdateSchemaWithDefaults instantiates a new UsergroupsUsersUpdateSchema object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewUsergroupsUsersUpdateSchemaWithDefaults() *UsergroupsUsersUpdateSchema {
	this := UsergroupsUsersUpdateSchema{}
	return &this
}

// GetOk returns the Ok field value
func (o *UsergroupsUsersUpdateSchema) GetOk() DefsOkTrue {
	if o == nil {
		var ret DefsOkTrue
		return ret
	}

	return o.Ok
}

// GetOkOk returns a tuple with the Ok field value
// and a boolean to check if the value has been set.
func (o *UsergroupsUsersUpdateSchema) GetOkOk() (*DefsOkTrue, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Ok, true
}

// SetOk sets field value
func (o *UsergroupsUsersUpdateSchema) SetOk(v DefsOkTrue) {
	o.Ok = v
}

// GetUsergroup returns the Usergroup field value
func (o *UsergroupsUsersUpdateSchema) GetUsergroup() ObjsSubteam {
	if o == nil {
		var ret ObjsSubteam
		return ret
	}

	return o.Usergroup
}

// GetUsergroupOk returns a tuple with the Usergroup field value
// and a boolean to check if the value has been set.
func (o *UsergroupsUsersUpdateSchema) GetUsergroupOk() (*ObjsSubteam, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Usergroup, true
}

// SetUsergroup sets field value
func (o *UsergroupsUsersUpdateSchema) SetUsergroup(v ObjsSubteam) {
	o.Usergroup = v
}

func (o UsergroupsUsersUpdateSchema) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["ok"] = o.Ok
	}
	if true {
		toSerialize["usergroup"] = o.Usergroup
	}
	return json.Marshal(toSerialize)
}

type NullableUsergroupsUsersUpdateSchema struct {
	value *UsergroupsUsersUpdateSchema
	isSet bool
}

func (v NullableUsergroupsUsersUpdateSchema) Get() *UsergroupsUsersUpdateSchema {
	return v.value
}

func (v *NullableUsergroupsUsersUpdateSchema) Set(val *UsergroupsUsersUpdateSchema) {
	v.value = val
	v.isSet = true
}

func (v NullableUsergroupsUsersUpdateSchema) IsSet() bool {
	return v.isSet
}

func (v *NullableUsergroupsUsersUpdateSchema) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUsergroupsUsersUpdateSchema(val *UsergroupsUsersUpdateSchema) *NullableUsergroupsUsersUpdateSchema {
	return &NullableUsergroupsUsersUpdateSchema{value: val, isSet: true}
}

func (v NullableUsergroupsUsersUpdateSchema) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUsergroupsUsersUpdateSchema) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


