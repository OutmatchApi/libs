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

// AdminConversationsGetTeamsErrorSchema Schema for error response from admin.conversations.getTeams
type AdminConversationsGetTeamsErrorSchema struct {
	Error string `json:"error"`
	Ok DefsOkFalse `json:"ok"`
}

// NewAdminConversationsGetTeamsErrorSchema instantiates a new AdminConversationsGetTeamsErrorSchema object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAdminConversationsGetTeamsErrorSchema(error_ string, ok DefsOkFalse) *AdminConversationsGetTeamsErrorSchema {
	this := AdminConversationsGetTeamsErrorSchema{}
	this.Error = error_
	this.Ok = ok
	return &this
}

// NewAdminConversationsGetTeamsErrorSchemaWithDefaults instantiates a new AdminConversationsGetTeamsErrorSchema object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAdminConversationsGetTeamsErrorSchemaWithDefaults() *AdminConversationsGetTeamsErrorSchema {
	this := AdminConversationsGetTeamsErrorSchema{}
	return &this
}

// GetError returns the Error field value
func (o *AdminConversationsGetTeamsErrorSchema) GetError() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Error
}

// GetErrorOk returns a tuple with the Error field value
// and a boolean to check if the value has been set.
func (o *AdminConversationsGetTeamsErrorSchema) GetErrorOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Error, true
}

// SetError sets field value
func (o *AdminConversationsGetTeamsErrorSchema) SetError(v string) {
	o.Error = v
}

// GetOk returns the Ok field value
func (o *AdminConversationsGetTeamsErrorSchema) GetOk() DefsOkFalse {
	if o == nil {
		var ret DefsOkFalse
		return ret
	}

	return o.Ok
}

// GetOkOk returns a tuple with the Ok field value
// and a boolean to check if the value has been set.
func (o *AdminConversationsGetTeamsErrorSchema) GetOkOk() (*DefsOkFalse, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Ok, true
}

// SetOk sets field value
func (o *AdminConversationsGetTeamsErrorSchema) SetOk(v DefsOkFalse) {
	o.Ok = v
}

func (o AdminConversationsGetTeamsErrorSchema) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["error"] = o.Error
	}
	if true {
		toSerialize["ok"] = o.Ok
	}
	return json.Marshal(toSerialize)
}

type NullableAdminConversationsGetTeamsErrorSchema struct {
	value *AdminConversationsGetTeamsErrorSchema
	isSet bool
}

func (v NullableAdminConversationsGetTeamsErrorSchema) Get() *AdminConversationsGetTeamsErrorSchema {
	return v.value
}

func (v *NullableAdminConversationsGetTeamsErrorSchema) Set(val *AdminConversationsGetTeamsErrorSchema) {
	v.value = val
	v.isSet = true
}

func (v NullableAdminConversationsGetTeamsErrorSchema) IsSet() bool {
	return v.isSet
}

func (v *NullableAdminConversationsGetTeamsErrorSchema) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAdminConversationsGetTeamsErrorSchema(val *AdminConversationsGetTeamsErrorSchema) *NullableAdminConversationsGetTeamsErrorSchema {
	return &NullableAdminConversationsGetTeamsErrorSchema{value: val, isSet: true}
}

func (v NullableAdminConversationsGetTeamsErrorSchema) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAdminConversationsGetTeamsErrorSchema) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


