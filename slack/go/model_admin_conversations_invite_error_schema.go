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

// AdminConversationsInviteErrorSchema Schema for error response from admin.conversations.invite
type AdminConversationsInviteErrorSchema struct {
	Error string `json:"error"`
	Ok DefsOkFalse `json:"ok"`
	AdditionalProperties map[string]interface{}
}

type _AdminConversationsInviteErrorSchema AdminConversationsInviteErrorSchema

// NewAdminConversationsInviteErrorSchema instantiates a new AdminConversationsInviteErrorSchema object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAdminConversationsInviteErrorSchema(error_ string, ok DefsOkFalse) *AdminConversationsInviteErrorSchema {
	this := AdminConversationsInviteErrorSchema{}
	this.Error = error_
	this.Ok = ok
	return &this
}

// NewAdminConversationsInviteErrorSchemaWithDefaults instantiates a new AdminConversationsInviteErrorSchema object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAdminConversationsInviteErrorSchemaWithDefaults() *AdminConversationsInviteErrorSchema {
	this := AdminConversationsInviteErrorSchema{}
	return &this
}

// GetError returns the Error field value
func (o *AdminConversationsInviteErrorSchema) GetError() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Error
}

// GetErrorOk returns a tuple with the Error field value
// and a boolean to check if the value has been set.
func (o *AdminConversationsInviteErrorSchema) GetErrorOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Error, true
}

// SetError sets field value
func (o *AdminConversationsInviteErrorSchema) SetError(v string) {
	o.Error = v
}

// GetOk returns the Ok field value
func (o *AdminConversationsInviteErrorSchema) GetOk() DefsOkFalse {
	if o == nil {
		var ret DefsOkFalse
		return ret
	}

	return o.Ok
}

// GetOkOk returns a tuple with the Ok field value
// and a boolean to check if the value has been set.
func (o *AdminConversationsInviteErrorSchema) GetOkOk() (*DefsOkFalse, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Ok, true
}

// SetOk sets field value
func (o *AdminConversationsInviteErrorSchema) SetOk(v DefsOkFalse) {
	o.Ok = v
}

func (o AdminConversationsInviteErrorSchema) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["error"] = o.Error
	}
	if true {
		toSerialize["ok"] = o.Ok
	}

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return json.Marshal(toSerialize)
}

func (o *AdminConversationsInviteErrorSchema) UnmarshalJSON(bytes []byte) (err error) {
	varAdminConversationsInviteErrorSchema := _AdminConversationsInviteErrorSchema{}

	if err = json.Unmarshal(bytes, &varAdminConversationsInviteErrorSchema); err == nil {
		*o = AdminConversationsInviteErrorSchema(varAdminConversationsInviteErrorSchema)
	}

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(bytes, &additionalProperties); err == nil {
		delete(additionalProperties, "error")
		delete(additionalProperties, "ok")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableAdminConversationsInviteErrorSchema struct {
	value *AdminConversationsInviteErrorSchema
	isSet bool
}

func (v NullableAdminConversationsInviteErrorSchema) Get() *AdminConversationsInviteErrorSchema {
	return v.value
}

func (v *NullableAdminConversationsInviteErrorSchema) Set(val *AdminConversationsInviteErrorSchema) {
	v.value = val
	v.isSet = true
}

func (v NullableAdminConversationsInviteErrorSchema) IsSet() bool {
	return v.isSet
}

func (v *NullableAdminConversationsInviteErrorSchema) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAdminConversationsInviteErrorSchema(val *AdminConversationsInviteErrorSchema) *NullableAdminConversationsInviteErrorSchema {
	return &NullableAdminConversationsInviteErrorSchema{value: val, isSet: true}
}

func (v NullableAdminConversationsInviteErrorSchema) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAdminConversationsInviteErrorSchema) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

