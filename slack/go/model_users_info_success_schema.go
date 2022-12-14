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

// UsersInfoSuccessSchema Schema for successful response from users.info method
type UsersInfoSuccessSchema struct {
	Ok DefsOkTrue `json:"ok"`
	User []ObjsUserInner `json:"user"`
	AdditionalProperties map[string]interface{}
}

type _UsersInfoSuccessSchema UsersInfoSuccessSchema

// NewUsersInfoSuccessSchema instantiates a new UsersInfoSuccessSchema object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewUsersInfoSuccessSchema(ok DefsOkTrue, user []ObjsUserInner) *UsersInfoSuccessSchema {
	this := UsersInfoSuccessSchema{}
	this.Ok = ok
	this.User = user
	return &this
}

// NewUsersInfoSuccessSchemaWithDefaults instantiates a new UsersInfoSuccessSchema object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewUsersInfoSuccessSchemaWithDefaults() *UsersInfoSuccessSchema {
	this := UsersInfoSuccessSchema{}
	return &this
}

// GetOk returns the Ok field value
func (o *UsersInfoSuccessSchema) GetOk() DefsOkTrue {
	if o == nil {
		var ret DefsOkTrue
		return ret
	}

	return o.Ok
}

// GetOkOk returns a tuple with the Ok field value
// and a boolean to check if the value has been set.
func (o *UsersInfoSuccessSchema) GetOkOk() (*DefsOkTrue, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Ok, true
}

// SetOk sets field value
func (o *UsersInfoSuccessSchema) SetOk(v DefsOkTrue) {
	o.Ok = v
}

// GetUser returns the User field value
func (o *UsersInfoSuccessSchema) GetUser() []ObjsUserInner {
	if o == nil {
		var ret []ObjsUserInner
		return ret
	}

	return o.User
}

// GetUserOk returns a tuple with the User field value
// and a boolean to check if the value has been set.
func (o *UsersInfoSuccessSchema) GetUserOk() ([]ObjsUserInner, bool) {
	if o == nil {
    return nil, false
	}
	return o.User, true
}

// SetUser sets field value
func (o *UsersInfoSuccessSchema) SetUser(v []ObjsUserInner) {
	o.User = v
}

func (o UsersInfoSuccessSchema) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["ok"] = o.Ok
	}
	if true {
		toSerialize["user"] = o.User
	}

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return json.Marshal(toSerialize)
}

func (o *UsersInfoSuccessSchema) UnmarshalJSON(bytes []byte) (err error) {
	varUsersInfoSuccessSchema := _UsersInfoSuccessSchema{}

	if err = json.Unmarshal(bytes, &varUsersInfoSuccessSchema); err == nil {
		*o = UsersInfoSuccessSchema(varUsersInfoSuccessSchema)
	}

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(bytes, &additionalProperties); err == nil {
		delete(additionalProperties, "ok")
		delete(additionalProperties, "user")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableUsersInfoSuccessSchema struct {
	value *UsersInfoSuccessSchema
	isSet bool
}

func (v NullableUsersInfoSuccessSchema) Get() *UsersInfoSuccessSchema {
	return v.value
}

func (v *NullableUsersInfoSuccessSchema) Set(val *UsersInfoSuccessSchema) {
	v.value = val
	v.isSet = true
}

func (v NullableUsersInfoSuccessSchema) IsSet() bool {
	return v.isSet
}

func (v *NullableUsersInfoSuccessSchema) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUsersInfoSuccessSchema(val *UsersInfoSuccessSchema) *NullableUsersInfoSuccessSchema {
	return &NullableUsersInfoSuccessSchema{value: val, isSet: true}
}

func (v NullableUsersInfoSuccessSchema) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUsersInfoSuccessSchema) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


