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

// AdminConversationsUnarchiveErrorSchema2 Schema for error response from admin.conversations.unarchive
type AdminConversationsUnarchiveErrorSchema2 struct {
	Error string `json:"error"`
	Ok DefsOkFalse `json:"ok"`
}

// NewAdminConversationsUnarchiveErrorSchema2 instantiates a new AdminConversationsUnarchiveErrorSchema2 object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAdminConversationsUnarchiveErrorSchema2(error_ string, ok DefsOkFalse) *AdminConversationsUnarchiveErrorSchema2 {
	this := AdminConversationsUnarchiveErrorSchema2{}
	this.Error = error_
	this.Ok = ok
	return &this
}

// NewAdminConversationsUnarchiveErrorSchema2WithDefaults instantiates a new AdminConversationsUnarchiveErrorSchema2 object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAdminConversationsUnarchiveErrorSchema2WithDefaults() *AdminConversationsUnarchiveErrorSchema2 {
	this := AdminConversationsUnarchiveErrorSchema2{}
	return &this
}

// GetError returns the Error field value
func (o *AdminConversationsUnarchiveErrorSchema2) GetError() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Error
}

// GetErrorOk returns a tuple with the Error field value
// and a boolean to check if the value has been set.
func (o *AdminConversationsUnarchiveErrorSchema2) GetErrorOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Error, true
}

// SetError sets field value
func (o *AdminConversationsUnarchiveErrorSchema2) SetError(v string) {
	o.Error = v
}

// GetOk returns the Ok field value
func (o *AdminConversationsUnarchiveErrorSchema2) GetOk() DefsOkFalse {
	if o == nil {
		var ret DefsOkFalse
		return ret
	}

	return o.Ok
}

// GetOkOk returns a tuple with the Ok field value
// and a boolean to check if the value has been set.
func (o *AdminConversationsUnarchiveErrorSchema2) GetOkOk() (*DefsOkFalse, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Ok, true
}

// SetOk sets field value
func (o *AdminConversationsUnarchiveErrorSchema2) SetOk(v DefsOkFalse) {
	o.Ok = v
}

func (o AdminConversationsUnarchiveErrorSchema2) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["error"] = o.Error
	}
	if true {
		toSerialize["ok"] = o.Ok
	}
	return json.Marshal(toSerialize)
}

type NullableAdminConversationsUnarchiveErrorSchema2 struct {
	value *AdminConversationsUnarchiveErrorSchema2
	isSet bool
}

func (v NullableAdminConversationsUnarchiveErrorSchema2) Get() *AdminConversationsUnarchiveErrorSchema2 {
	return v.value
}

func (v *NullableAdminConversationsUnarchiveErrorSchema2) Set(val *AdminConversationsUnarchiveErrorSchema2) {
	v.value = val
	v.isSet = true
}

func (v NullableAdminConversationsUnarchiveErrorSchema2) IsSet() bool {
	return v.isSet
}

func (v *NullableAdminConversationsUnarchiveErrorSchema2) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAdminConversationsUnarchiveErrorSchema2(val *AdminConversationsUnarchiveErrorSchema2) *NullableAdminConversationsUnarchiveErrorSchema2 {
	return &NullableAdminConversationsUnarchiveErrorSchema2{value: val, isSet: true}
}

func (v NullableAdminConversationsUnarchiveErrorSchema2) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAdminConversationsUnarchiveErrorSchema2) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


