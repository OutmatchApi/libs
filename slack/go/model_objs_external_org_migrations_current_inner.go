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

// ObjsExternalOrgMigrationsCurrentInner struct for ObjsExternalOrgMigrationsCurrentInner
type ObjsExternalOrgMigrationsCurrentInner struct {
	DateStarted int32 `json:"date_started"`
	TeamId string `json:"team_id"`
}

// NewObjsExternalOrgMigrationsCurrentInner instantiates a new ObjsExternalOrgMigrationsCurrentInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewObjsExternalOrgMigrationsCurrentInner(dateStarted int32, teamId string) *ObjsExternalOrgMigrationsCurrentInner {
	this := ObjsExternalOrgMigrationsCurrentInner{}
	this.DateStarted = dateStarted
	this.TeamId = teamId
	return &this
}

// NewObjsExternalOrgMigrationsCurrentInnerWithDefaults instantiates a new ObjsExternalOrgMigrationsCurrentInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewObjsExternalOrgMigrationsCurrentInnerWithDefaults() *ObjsExternalOrgMigrationsCurrentInner {
	this := ObjsExternalOrgMigrationsCurrentInner{}
	return &this
}

// GetDateStarted returns the DateStarted field value
func (o *ObjsExternalOrgMigrationsCurrentInner) GetDateStarted() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.DateStarted
}

// GetDateStartedOk returns a tuple with the DateStarted field value
// and a boolean to check if the value has been set.
func (o *ObjsExternalOrgMigrationsCurrentInner) GetDateStartedOk() (*int32, bool) {
	if o == nil {
    return nil, false
	}
	return &o.DateStarted, true
}

// SetDateStarted sets field value
func (o *ObjsExternalOrgMigrationsCurrentInner) SetDateStarted(v int32) {
	o.DateStarted = v
}

// GetTeamId returns the TeamId field value
func (o *ObjsExternalOrgMigrationsCurrentInner) GetTeamId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.TeamId
}

// GetTeamIdOk returns a tuple with the TeamId field value
// and a boolean to check if the value has been set.
func (o *ObjsExternalOrgMigrationsCurrentInner) GetTeamIdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.TeamId, true
}

// SetTeamId sets field value
func (o *ObjsExternalOrgMigrationsCurrentInner) SetTeamId(v string) {
	o.TeamId = v
}

func (o ObjsExternalOrgMigrationsCurrentInner) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["date_started"] = o.DateStarted
	}
	if true {
		toSerialize["team_id"] = o.TeamId
	}
	return json.Marshal(toSerialize)
}

type NullableObjsExternalOrgMigrationsCurrentInner struct {
	value *ObjsExternalOrgMigrationsCurrentInner
	isSet bool
}

func (v NullableObjsExternalOrgMigrationsCurrentInner) Get() *ObjsExternalOrgMigrationsCurrentInner {
	return v.value
}

func (v *NullableObjsExternalOrgMigrationsCurrentInner) Set(val *ObjsExternalOrgMigrationsCurrentInner) {
	v.value = val
	v.isSet = true
}

func (v NullableObjsExternalOrgMigrationsCurrentInner) IsSet() bool {
	return v.isSet
}

func (v *NullableObjsExternalOrgMigrationsCurrentInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableObjsExternalOrgMigrationsCurrentInner(val *ObjsExternalOrgMigrationsCurrentInner) *NullableObjsExternalOrgMigrationsCurrentInner {
	return &NullableObjsExternalOrgMigrationsCurrentInner{value: val, isSet: true}
}

func (v NullableObjsExternalOrgMigrationsCurrentInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableObjsExternalOrgMigrationsCurrentInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


