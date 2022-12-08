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

// AdminConversationsSetConversationPrefsSchema Schema for successful response of admin.conversations.setConversationPrefs
type AdminConversationsSetConversationPrefsSchema struct {
	Ok DefsOkTrue `json:"ok"`
}

// NewAdminConversationsSetConversationPrefsSchema instantiates a new AdminConversationsSetConversationPrefsSchema object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAdminConversationsSetConversationPrefsSchema(ok DefsOkTrue) *AdminConversationsSetConversationPrefsSchema {
	this := AdminConversationsSetConversationPrefsSchema{}
	this.Ok = ok
	return &this
}

// NewAdminConversationsSetConversationPrefsSchemaWithDefaults instantiates a new AdminConversationsSetConversationPrefsSchema object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAdminConversationsSetConversationPrefsSchemaWithDefaults() *AdminConversationsSetConversationPrefsSchema {
	this := AdminConversationsSetConversationPrefsSchema{}
	return &this
}

// GetOk returns the Ok field value
func (o *AdminConversationsSetConversationPrefsSchema) GetOk() DefsOkTrue {
	if o == nil {
		var ret DefsOkTrue
		return ret
	}

	return o.Ok
}

// GetOkOk returns a tuple with the Ok field value
// and a boolean to check if the value has been set.
func (o *AdminConversationsSetConversationPrefsSchema) GetOkOk() (*DefsOkTrue, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Ok, true
}

// SetOk sets field value
func (o *AdminConversationsSetConversationPrefsSchema) SetOk(v DefsOkTrue) {
	o.Ok = v
}

func (o AdminConversationsSetConversationPrefsSchema) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["ok"] = o.Ok
	}
	return json.Marshal(toSerialize)
}

type NullableAdminConversationsSetConversationPrefsSchema struct {
	value *AdminConversationsSetConversationPrefsSchema
	isSet bool
}

func (v NullableAdminConversationsSetConversationPrefsSchema) Get() *AdminConversationsSetConversationPrefsSchema {
	return v.value
}

func (v *NullableAdminConversationsSetConversationPrefsSchema) Set(val *AdminConversationsSetConversationPrefsSchema) {
	v.value = val
	v.isSet = true
}

func (v NullableAdminConversationsSetConversationPrefsSchema) IsSet() bool {
	return v.isSet
}

func (v *NullableAdminConversationsSetConversationPrefsSchema) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAdminConversationsSetConversationPrefsSchema(val *AdminConversationsSetConversationPrefsSchema) *NullableAdminConversationsSetConversationPrefsSchema {
	return &NullableAdminConversationsSetConversationPrefsSchema{value: val, isSet: true}
}

func (v NullableAdminConversationsSetConversationPrefsSchema) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAdminConversationsSetConversationPrefsSchema) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


