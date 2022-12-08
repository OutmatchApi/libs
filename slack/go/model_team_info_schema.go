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

// TeamInfoSchema Schema for successful response from team.info method
type TeamInfoSchema struct {
	Ok DefsOkTrue `json:"ok"`
	Team ObjsTeam `json:"team"`
}

// NewTeamInfoSchema instantiates a new TeamInfoSchema object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewTeamInfoSchema(ok DefsOkTrue, team ObjsTeam) *TeamInfoSchema {
	this := TeamInfoSchema{}
	this.Ok = ok
	this.Team = team
	return &this
}

// NewTeamInfoSchemaWithDefaults instantiates a new TeamInfoSchema object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewTeamInfoSchemaWithDefaults() *TeamInfoSchema {
	this := TeamInfoSchema{}
	return &this
}

// GetOk returns the Ok field value
func (o *TeamInfoSchema) GetOk() DefsOkTrue {
	if o == nil {
		var ret DefsOkTrue
		return ret
	}

	return o.Ok
}

// GetOkOk returns a tuple with the Ok field value
// and a boolean to check if the value has been set.
func (o *TeamInfoSchema) GetOkOk() (*DefsOkTrue, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Ok, true
}

// SetOk sets field value
func (o *TeamInfoSchema) SetOk(v DefsOkTrue) {
	o.Ok = v
}

// GetTeam returns the Team field value
func (o *TeamInfoSchema) GetTeam() ObjsTeam {
	if o == nil {
		var ret ObjsTeam
		return ret
	}

	return o.Team
}

// GetTeamOk returns a tuple with the Team field value
// and a boolean to check if the value has been set.
func (o *TeamInfoSchema) GetTeamOk() (*ObjsTeam, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Team, true
}

// SetTeam sets field value
func (o *TeamInfoSchema) SetTeam(v ObjsTeam) {
	o.Team = v
}

func (o TeamInfoSchema) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["ok"] = o.Ok
	}
	if true {
		toSerialize["team"] = o.Team
	}
	return json.Marshal(toSerialize)
}

type NullableTeamInfoSchema struct {
	value *TeamInfoSchema
	isSet bool
}

func (v NullableTeamInfoSchema) Get() *TeamInfoSchema {
	return v.value
}

func (v *NullableTeamInfoSchema) Set(val *TeamInfoSchema) {
	v.value = val
	v.isSet = true
}

func (v NullableTeamInfoSchema) IsSet() bool {
	return v.isSet
}

func (v *NullableTeamInfoSchema) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableTeamInfoSchema(val *TeamInfoSchema) *NullableTeamInfoSchema {
	return &NullableTeamInfoSchema{value: val, isSet: true}
}

func (v NullableTeamInfoSchema) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableTeamInfoSchema) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

