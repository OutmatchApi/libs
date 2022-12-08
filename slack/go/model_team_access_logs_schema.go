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

// TeamAccessLogsSchema Schema for successful response from team.accessLogs method
type TeamAccessLogsSchema struct {
	Logins []TeamAccessLogsSchemaLoginsInner `json:"logins"`
	Ok DefsOkTrue `json:"ok"`
	Paging ObjsPaging `json:"paging"`
}

// NewTeamAccessLogsSchema instantiates a new TeamAccessLogsSchema object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewTeamAccessLogsSchema(logins []TeamAccessLogsSchemaLoginsInner, ok DefsOkTrue, paging ObjsPaging) *TeamAccessLogsSchema {
	this := TeamAccessLogsSchema{}
	this.Logins = logins
	this.Ok = ok
	this.Paging = paging
	return &this
}

// NewTeamAccessLogsSchemaWithDefaults instantiates a new TeamAccessLogsSchema object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewTeamAccessLogsSchemaWithDefaults() *TeamAccessLogsSchema {
	this := TeamAccessLogsSchema{}
	return &this
}

// GetLogins returns the Logins field value
func (o *TeamAccessLogsSchema) GetLogins() []TeamAccessLogsSchemaLoginsInner {
	if o == nil {
		var ret []TeamAccessLogsSchemaLoginsInner
		return ret
	}

	return o.Logins
}

// GetLoginsOk returns a tuple with the Logins field value
// and a boolean to check if the value has been set.
func (o *TeamAccessLogsSchema) GetLoginsOk() ([]TeamAccessLogsSchemaLoginsInner, bool) {
	if o == nil {
    return nil, false
	}
	return o.Logins, true
}

// SetLogins sets field value
func (o *TeamAccessLogsSchema) SetLogins(v []TeamAccessLogsSchemaLoginsInner) {
	o.Logins = v
}

// GetOk returns the Ok field value
func (o *TeamAccessLogsSchema) GetOk() DefsOkTrue {
	if o == nil {
		var ret DefsOkTrue
		return ret
	}

	return o.Ok
}

// GetOkOk returns a tuple with the Ok field value
// and a boolean to check if the value has been set.
func (o *TeamAccessLogsSchema) GetOkOk() (*DefsOkTrue, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Ok, true
}

// SetOk sets field value
func (o *TeamAccessLogsSchema) SetOk(v DefsOkTrue) {
	o.Ok = v
}

// GetPaging returns the Paging field value
func (o *TeamAccessLogsSchema) GetPaging() ObjsPaging {
	if o == nil {
		var ret ObjsPaging
		return ret
	}

	return o.Paging
}

// GetPagingOk returns a tuple with the Paging field value
// and a boolean to check if the value has been set.
func (o *TeamAccessLogsSchema) GetPagingOk() (*ObjsPaging, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Paging, true
}

// SetPaging sets field value
func (o *TeamAccessLogsSchema) SetPaging(v ObjsPaging) {
	o.Paging = v
}

func (o TeamAccessLogsSchema) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["logins"] = o.Logins
	}
	if true {
		toSerialize["ok"] = o.Ok
	}
	if true {
		toSerialize["paging"] = o.Paging
	}
	return json.Marshal(toSerialize)
}

type NullableTeamAccessLogsSchema struct {
	value *TeamAccessLogsSchema
	isSet bool
}

func (v NullableTeamAccessLogsSchema) Get() *TeamAccessLogsSchema {
	return v.value
}

func (v *NullableTeamAccessLogsSchema) Set(val *TeamAccessLogsSchema) {
	v.value = val
	v.isSet = true
}

func (v NullableTeamAccessLogsSchema) IsSet() bool {
	return v.isSet
}

func (v *NullableTeamAccessLogsSchema) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableTeamAccessLogsSchema(val *TeamAccessLogsSchema) *NullableTeamAccessLogsSchema {
	return &NullableTeamAccessLogsSchema{value: val, isSet: true}
}

func (v NullableTeamAccessLogsSchema) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableTeamAccessLogsSchema) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


