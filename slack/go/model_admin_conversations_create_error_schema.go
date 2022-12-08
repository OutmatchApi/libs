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

// AdminConversationsCreateErrorSchema Schema for error response from admin.conversations.create
type AdminConversationsCreateErrorSchema struct {
	Error string `json:"error"`
	Ok DefsOkFalse `json:"ok"`
}

// NewAdminConversationsCreateErrorSchema instantiates a new AdminConversationsCreateErrorSchema object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAdminConversationsCreateErrorSchema(error_ string, ok DefsOkFalse) *AdminConversationsCreateErrorSchema {
	this := AdminConversationsCreateErrorSchema{}
	this.Error = error_
	this.Ok = ok
	return &this
}

// NewAdminConversationsCreateErrorSchemaWithDefaults instantiates a new AdminConversationsCreateErrorSchema object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAdminConversationsCreateErrorSchemaWithDefaults() *AdminConversationsCreateErrorSchema {
	this := AdminConversationsCreateErrorSchema{}
	return &this
}

// GetError returns the Error field value
func (o *AdminConversationsCreateErrorSchema) GetError() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Error
}

// GetErrorOk returns a tuple with the Error field value
// and a boolean to check if the value has been set.
func (o *AdminConversationsCreateErrorSchema) GetErrorOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Error, true
}

// SetError sets field value
func (o *AdminConversationsCreateErrorSchema) SetError(v string) {
	o.Error = v
}

// GetOk returns the Ok field value
func (o *AdminConversationsCreateErrorSchema) GetOk() DefsOkFalse {
	if o == nil {
		var ret DefsOkFalse
		return ret
	}

	return o.Ok
}

// GetOkOk returns a tuple with the Ok field value
// and a boolean to check if the value has been set.
func (o *AdminConversationsCreateErrorSchema) GetOkOk() (*DefsOkFalse, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Ok, true
}

// SetOk sets field value
func (o *AdminConversationsCreateErrorSchema) SetOk(v DefsOkFalse) {
	o.Ok = v
}

func (o AdminConversationsCreateErrorSchema) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["error"] = o.Error
	}
	if true {
		toSerialize["ok"] = o.Ok
	}
	return json.Marshal(toSerialize)
}

type NullableAdminConversationsCreateErrorSchema struct {
	value *AdminConversationsCreateErrorSchema
	isSet bool
}

func (v NullableAdminConversationsCreateErrorSchema) Get() *AdminConversationsCreateErrorSchema {
	return v.value
}

func (v *NullableAdminConversationsCreateErrorSchema) Set(val *AdminConversationsCreateErrorSchema) {
	v.value = val
	v.isSet = true
}

func (v NullableAdminConversationsCreateErrorSchema) IsSet() bool {
	return v.isSet
}

func (v *NullableAdminConversationsCreateErrorSchema) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAdminConversationsCreateErrorSchema(val *AdminConversationsCreateErrorSchema) *NullableAdminConversationsCreateErrorSchema {
	return &NullableAdminConversationsCreateErrorSchema{value: val, isSet: true}
}

func (v NullableAdminConversationsCreateErrorSchema) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAdminConversationsCreateErrorSchema) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


