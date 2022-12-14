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

// UsersIdentitySchemaInnerAnyOf3 Schema for 'identity.basic,identity.team' scopes
type UsersIdentitySchemaInnerAnyOf3 struct {
	Ok DefsOkTrue `json:"ok"`
	Team UsersIdentitySchemaInnerAnyOf3Team `json:"team"`
	User RtmConnectSchemaSelf `json:"user"`
}

// NewUsersIdentitySchemaInnerAnyOf3 instantiates a new UsersIdentitySchemaInnerAnyOf3 object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewUsersIdentitySchemaInnerAnyOf3(ok DefsOkTrue, team UsersIdentitySchemaInnerAnyOf3Team, user RtmConnectSchemaSelf) *UsersIdentitySchemaInnerAnyOf3 {
	this := UsersIdentitySchemaInnerAnyOf3{}
	this.Ok = ok
	this.Team = team
	this.User = user
	return &this
}

// NewUsersIdentitySchemaInnerAnyOf3WithDefaults instantiates a new UsersIdentitySchemaInnerAnyOf3 object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewUsersIdentitySchemaInnerAnyOf3WithDefaults() *UsersIdentitySchemaInnerAnyOf3 {
	this := UsersIdentitySchemaInnerAnyOf3{}
	return &this
}

// GetOk returns the Ok field value
func (o *UsersIdentitySchemaInnerAnyOf3) GetOk() DefsOkTrue {
	if o == nil {
		var ret DefsOkTrue
		return ret
	}

	return o.Ok
}

// GetOkOk returns a tuple with the Ok field value
// and a boolean to check if the value has been set.
func (o *UsersIdentitySchemaInnerAnyOf3) GetOkOk() (*DefsOkTrue, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Ok, true
}

// SetOk sets field value
func (o *UsersIdentitySchemaInnerAnyOf3) SetOk(v DefsOkTrue) {
	o.Ok = v
}

// GetTeam returns the Team field value
func (o *UsersIdentitySchemaInnerAnyOf3) GetTeam() UsersIdentitySchemaInnerAnyOf3Team {
	if o == nil {
		var ret UsersIdentitySchemaInnerAnyOf3Team
		return ret
	}

	return o.Team
}

// GetTeamOk returns a tuple with the Team field value
// and a boolean to check if the value has been set.
func (o *UsersIdentitySchemaInnerAnyOf3) GetTeamOk() (*UsersIdentitySchemaInnerAnyOf3Team, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Team, true
}

// SetTeam sets field value
func (o *UsersIdentitySchemaInnerAnyOf3) SetTeam(v UsersIdentitySchemaInnerAnyOf3Team) {
	o.Team = v
}

// GetUser returns the User field value
func (o *UsersIdentitySchemaInnerAnyOf3) GetUser() RtmConnectSchemaSelf {
	if o == nil {
		var ret RtmConnectSchemaSelf
		return ret
	}

	return o.User
}

// GetUserOk returns a tuple with the User field value
// and a boolean to check if the value has been set.
func (o *UsersIdentitySchemaInnerAnyOf3) GetUserOk() (*RtmConnectSchemaSelf, bool) {
	if o == nil {
    return nil, false
	}
	return &o.User, true
}

// SetUser sets field value
func (o *UsersIdentitySchemaInnerAnyOf3) SetUser(v RtmConnectSchemaSelf) {
	o.User = v
}

func (o UsersIdentitySchemaInnerAnyOf3) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["ok"] = o.Ok
	}
	if true {
		toSerialize["team"] = o.Team
	}
	if true {
		toSerialize["user"] = o.User
	}
	return json.Marshal(toSerialize)
}

type NullableUsersIdentitySchemaInnerAnyOf3 struct {
	value *UsersIdentitySchemaInnerAnyOf3
	isSet bool
}

func (v NullableUsersIdentitySchemaInnerAnyOf3) Get() *UsersIdentitySchemaInnerAnyOf3 {
	return v.value
}

func (v *NullableUsersIdentitySchemaInnerAnyOf3) Set(val *UsersIdentitySchemaInnerAnyOf3) {
	v.value = val
	v.isSet = true
}

func (v NullableUsersIdentitySchemaInnerAnyOf3) IsSet() bool {
	return v.isSet
}

func (v *NullableUsersIdentitySchemaInnerAnyOf3) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUsersIdentitySchemaInnerAnyOf3(val *UsersIdentitySchemaInnerAnyOf3) *NullableUsersIdentitySchemaInnerAnyOf3 {
	return &NullableUsersIdentitySchemaInnerAnyOf3{value: val, isSet: true}
}

func (v NullableUsersIdentitySchemaInnerAnyOf3) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUsersIdentitySchemaInnerAnyOf3) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


