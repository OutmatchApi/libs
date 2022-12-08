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

// AppsPermissionsRequestSchema Schema for successful response from apps.permissions.request method
type AppsPermissionsRequestSchema struct {
	Ok DefsOkTrue `json:"ok"`
}

// NewAppsPermissionsRequestSchema instantiates a new AppsPermissionsRequestSchema object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAppsPermissionsRequestSchema(ok DefsOkTrue) *AppsPermissionsRequestSchema {
	this := AppsPermissionsRequestSchema{}
	this.Ok = ok
	return &this
}

// NewAppsPermissionsRequestSchemaWithDefaults instantiates a new AppsPermissionsRequestSchema object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAppsPermissionsRequestSchemaWithDefaults() *AppsPermissionsRequestSchema {
	this := AppsPermissionsRequestSchema{}
	return &this
}

// GetOk returns the Ok field value
func (o *AppsPermissionsRequestSchema) GetOk() DefsOkTrue {
	if o == nil {
		var ret DefsOkTrue
		return ret
	}

	return o.Ok
}

// GetOkOk returns a tuple with the Ok field value
// and a boolean to check if the value has been set.
func (o *AppsPermissionsRequestSchema) GetOkOk() (*DefsOkTrue, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Ok, true
}

// SetOk sets field value
func (o *AppsPermissionsRequestSchema) SetOk(v DefsOkTrue) {
	o.Ok = v
}

func (o AppsPermissionsRequestSchema) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["ok"] = o.Ok
	}
	return json.Marshal(toSerialize)
}

type NullableAppsPermissionsRequestSchema struct {
	value *AppsPermissionsRequestSchema
	isSet bool
}

func (v NullableAppsPermissionsRequestSchema) Get() *AppsPermissionsRequestSchema {
	return v.value
}

func (v *NullableAppsPermissionsRequestSchema) Set(val *AppsPermissionsRequestSchema) {
	v.value = val
	v.isSet = true
}

func (v NullableAppsPermissionsRequestSchema) IsSet() bool {
	return v.isSet
}

func (v *NullableAppsPermissionsRequestSchema) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAppsPermissionsRequestSchema(val *AppsPermissionsRequestSchema) *NullableAppsPermissionsRequestSchema {
	return &NullableAppsPermissionsRequestSchema{value: val, isSet: true}
}

func (v NullableAppsPermissionsRequestSchema) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAppsPermissionsRequestSchema) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

