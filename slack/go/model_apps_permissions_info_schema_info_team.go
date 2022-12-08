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

// AppsPermissionsInfoSchemaInfoTeam struct for AppsPermissionsInfoSchemaInfoTeam
type AppsPermissionsInfoSchemaInfoTeam struct {
	Resources ObjsResources `json:"resources"`
	Scopes []string `json:"scopes"`
}

// NewAppsPermissionsInfoSchemaInfoTeam instantiates a new AppsPermissionsInfoSchemaInfoTeam object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAppsPermissionsInfoSchemaInfoTeam(resources ObjsResources, scopes []string) *AppsPermissionsInfoSchemaInfoTeam {
	this := AppsPermissionsInfoSchemaInfoTeam{}
	this.Resources = resources
	this.Scopes = scopes
	return &this
}

// NewAppsPermissionsInfoSchemaInfoTeamWithDefaults instantiates a new AppsPermissionsInfoSchemaInfoTeam object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAppsPermissionsInfoSchemaInfoTeamWithDefaults() *AppsPermissionsInfoSchemaInfoTeam {
	this := AppsPermissionsInfoSchemaInfoTeam{}
	return &this
}

// GetResources returns the Resources field value
func (o *AppsPermissionsInfoSchemaInfoTeam) GetResources() ObjsResources {
	if o == nil {
		var ret ObjsResources
		return ret
	}

	return o.Resources
}

// GetResourcesOk returns a tuple with the Resources field value
// and a boolean to check if the value has been set.
func (o *AppsPermissionsInfoSchemaInfoTeam) GetResourcesOk() (*ObjsResources, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Resources, true
}

// SetResources sets field value
func (o *AppsPermissionsInfoSchemaInfoTeam) SetResources(v ObjsResources) {
	o.Resources = v
}

// GetScopes returns the Scopes field value
func (o *AppsPermissionsInfoSchemaInfoTeam) GetScopes() []string {
	if o == nil {
		var ret []string
		return ret
	}

	return o.Scopes
}

// GetScopesOk returns a tuple with the Scopes field value
// and a boolean to check if the value has been set.
func (o *AppsPermissionsInfoSchemaInfoTeam) GetScopesOk() ([]string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Scopes, true
}

// SetScopes sets field value
func (o *AppsPermissionsInfoSchemaInfoTeam) SetScopes(v []string) {
	o.Scopes = v
}

func (o AppsPermissionsInfoSchemaInfoTeam) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["resources"] = o.Resources
	}
	if true {
		toSerialize["scopes"] = o.Scopes
	}
	return json.Marshal(toSerialize)
}

type NullableAppsPermissionsInfoSchemaInfoTeam struct {
	value *AppsPermissionsInfoSchemaInfoTeam
	isSet bool
}

func (v NullableAppsPermissionsInfoSchemaInfoTeam) Get() *AppsPermissionsInfoSchemaInfoTeam {
	return v.value
}

func (v *NullableAppsPermissionsInfoSchemaInfoTeam) Set(val *AppsPermissionsInfoSchemaInfoTeam) {
	v.value = val
	v.isSet = true
}

func (v NullableAppsPermissionsInfoSchemaInfoTeam) IsSet() bool {
	return v.isSet
}

func (v *NullableAppsPermissionsInfoSchemaInfoTeam) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAppsPermissionsInfoSchemaInfoTeam(val *AppsPermissionsInfoSchemaInfoTeam) *NullableAppsPermissionsInfoSchemaInfoTeam {
	return &NullableAppsPermissionsInfoSchemaInfoTeam{value: val, isSet: true}
}

func (v NullableAppsPermissionsInfoSchemaInfoTeam) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAppsPermissionsInfoSchemaInfoTeam) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


