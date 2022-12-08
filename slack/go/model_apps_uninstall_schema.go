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

// AppsUninstallSchema Schema for successful response from apps.uninstall method
type AppsUninstallSchema struct {
	Ok DefsOkTrue `json:"ok"`
}

// NewAppsUninstallSchema instantiates a new AppsUninstallSchema object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAppsUninstallSchema(ok DefsOkTrue) *AppsUninstallSchema {
	this := AppsUninstallSchema{}
	this.Ok = ok
	return &this
}

// NewAppsUninstallSchemaWithDefaults instantiates a new AppsUninstallSchema object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAppsUninstallSchemaWithDefaults() *AppsUninstallSchema {
	this := AppsUninstallSchema{}
	return &this
}

// GetOk returns the Ok field value
func (o *AppsUninstallSchema) GetOk() DefsOkTrue {
	if o == nil {
		var ret DefsOkTrue
		return ret
	}

	return o.Ok
}

// GetOkOk returns a tuple with the Ok field value
// and a boolean to check if the value has been set.
func (o *AppsUninstallSchema) GetOkOk() (*DefsOkTrue, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Ok, true
}

// SetOk sets field value
func (o *AppsUninstallSchema) SetOk(v DefsOkTrue) {
	o.Ok = v
}

func (o AppsUninstallSchema) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["ok"] = o.Ok
	}
	return json.Marshal(toSerialize)
}

type NullableAppsUninstallSchema struct {
	value *AppsUninstallSchema
	isSet bool
}

func (v NullableAppsUninstallSchema) Get() *AppsUninstallSchema {
	return v.value
}

func (v *NullableAppsUninstallSchema) Set(val *AppsUninstallSchema) {
	v.value = val
	v.isSet = true
}

func (v NullableAppsUninstallSchema) IsSet() bool {
	return v.isSet
}

func (v *NullableAppsUninstallSchema) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAppsUninstallSchema(val *AppsUninstallSchema) *NullableAppsUninstallSchema {
	return &NullableAppsUninstallSchema{value: val, isSet: true}
}

func (v NullableAppsUninstallSchema) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAppsUninstallSchema) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

