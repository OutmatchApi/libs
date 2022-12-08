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

// AuthTestSuccessSchema Schema for successful response auth.test method
type AuthTestSuccessSchema struct {
	BotId *string `json:"bot_id,omitempty"`
	IsEnterpriseInstall *bool `json:"is_enterprise_install,omitempty"`
	Ok DefsOkTrue `json:"ok"`
	Team string `json:"team"`
	TeamId string `json:"team_id"`
	Url string `json:"url"`
	User string `json:"user"`
	UserId string `json:"user_id"`
}

// NewAuthTestSuccessSchema instantiates a new AuthTestSuccessSchema object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAuthTestSuccessSchema(ok DefsOkTrue, team string, teamId string, url string, user string, userId string) *AuthTestSuccessSchema {
	this := AuthTestSuccessSchema{}
	this.Ok = ok
	this.Team = team
	this.TeamId = teamId
	this.Url = url
	this.User = user
	this.UserId = userId
	return &this
}

// NewAuthTestSuccessSchemaWithDefaults instantiates a new AuthTestSuccessSchema object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAuthTestSuccessSchemaWithDefaults() *AuthTestSuccessSchema {
	this := AuthTestSuccessSchema{}
	return &this
}

// GetBotId returns the BotId field value if set, zero value otherwise.
func (o *AuthTestSuccessSchema) GetBotId() string {
	if o == nil || isNil(o.BotId) {
		var ret string
		return ret
	}
	return *o.BotId
}

// GetBotIdOk returns a tuple with the BotId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AuthTestSuccessSchema) GetBotIdOk() (*string, bool) {
	if o == nil || isNil(o.BotId) {
    return nil, false
	}
	return o.BotId, true
}

// HasBotId returns a boolean if a field has been set.
func (o *AuthTestSuccessSchema) HasBotId() bool {
	if o != nil && !isNil(o.BotId) {
		return true
	}

	return false
}

// SetBotId gets a reference to the given string and assigns it to the BotId field.
func (o *AuthTestSuccessSchema) SetBotId(v string) {
	o.BotId = &v
}

// GetIsEnterpriseInstall returns the IsEnterpriseInstall field value if set, zero value otherwise.
func (o *AuthTestSuccessSchema) GetIsEnterpriseInstall() bool {
	if o == nil || isNil(o.IsEnterpriseInstall) {
		var ret bool
		return ret
	}
	return *o.IsEnterpriseInstall
}

// GetIsEnterpriseInstallOk returns a tuple with the IsEnterpriseInstall field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AuthTestSuccessSchema) GetIsEnterpriseInstallOk() (*bool, bool) {
	if o == nil || isNil(o.IsEnterpriseInstall) {
    return nil, false
	}
	return o.IsEnterpriseInstall, true
}

// HasIsEnterpriseInstall returns a boolean if a field has been set.
func (o *AuthTestSuccessSchema) HasIsEnterpriseInstall() bool {
	if o != nil && !isNil(o.IsEnterpriseInstall) {
		return true
	}

	return false
}

// SetIsEnterpriseInstall gets a reference to the given bool and assigns it to the IsEnterpriseInstall field.
func (o *AuthTestSuccessSchema) SetIsEnterpriseInstall(v bool) {
	o.IsEnterpriseInstall = &v
}

// GetOk returns the Ok field value
func (o *AuthTestSuccessSchema) GetOk() DefsOkTrue {
	if o == nil {
		var ret DefsOkTrue
		return ret
	}

	return o.Ok
}

// GetOkOk returns a tuple with the Ok field value
// and a boolean to check if the value has been set.
func (o *AuthTestSuccessSchema) GetOkOk() (*DefsOkTrue, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Ok, true
}

// SetOk sets field value
func (o *AuthTestSuccessSchema) SetOk(v DefsOkTrue) {
	o.Ok = v
}

// GetTeam returns the Team field value
func (o *AuthTestSuccessSchema) GetTeam() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Team
}

// GetTeamOk returns a tuple with the Team field value
// and a boolean to check if the value has been set.
func (o *AuthTestSuccessSchema) GetTeamOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Team, true
}

// SetTeam sets field value
func (o *AuthTestSuccessSchema) SetTeam(v string) {
	o.Team = v
}

// GetTeamId returns the TeamId field value
func (o *AuthTestSuccessSchema) GetTeamId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.TeamId
}

// GetTeamIdOk returns a tuple with the TeamId field value
// and a boolean to check if the value has been set.
func (o *AuthTestSuccessSchema) GetTeamIdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.TeamId, true
}

// SetTeamId sets field value
func (o *AuthTestSuccessSchema) SetTeamId(v string) {
	o.TeamId = v
}

// GetUrl returns the Url field value
func (o *AuthTestSuccessSchema) GetUrl() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Url
}

// GetUrlOk returns a tuple with the Url field value
// and a boolean to check if the value has been set.
func (o *AuthTestSuccessSchema) GetUrlOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Url, true
}

// SetUrl sets field value
func (o *AuthTestSuccessSchema) SetUrl(v string) {
	o.Url = v
}

// GetUser returns the User field value
func (o *AuthTestSuccessSchema) GetUser() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.User
}

// GetUserOk returns a tuple with the User field value
// and a boolean to check if the value has been set.
func (o *AuthTestSuccessSchema) GetUserOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.User, true
}

// SetUser sets field value
func (o *AuthTestSuccessSchema) SetUser(v string) {
	o.User = v
}

// GetUserId returns the UserId field value
func (o *AuthTestSuccessSchema) GetUserId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.UserId
}

// GetUserIdOk returns a tuple with the UserId field value
// and a boolean to check if the value has been set.
func (o *AuthTestSuccessSchema) GetUserIdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.UserId, true
}

// SetUserId sets field value
func (o *AuthTestSuccessSchema) SetUserId(v string) {
	o.UserId = v
}

func (o AuthTestSuccessSchema) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.BotId) {
		toSerialize["bot_id"] = o.BotId
	}
	if !isNil(o.IsEnterpriseInstall) {
		toSerialize["is_enterprise_install"] = o.IsEnterpriseInstall
	}
	if true {
		toSerialize["ok"] = o.Ok
	}
	if true {
		toSerialize["team"] = o.Team
	}
	if true {
		toSerialize["team_id"] = o.TeamId
	}
	if true {
		toSerialize["url"] = o.Url
	}
	if true {
		toSerialize["user"] = o.User
	}
	if true {
		toSerialize["user_id"] = o.UserId
	}
	return json.Marshal(toSerialize)
}

type NullableAuthTestSuccessSchema struct {
	value *AuthTestSuccessSchema
	isSet bool
}

func (v NullableAuthTestSuccessSchema) Get() *AuthTestSuccessSchema {
	return v.value
}

func (v *NullableAuthTestSuccessSchema) Set(val *AuthTestSuccessSchema) {
	v.value = val
	v.isSet = true
}

func (v NullableAuthTestSuccessSchema) IsSet() bool {
	return v.isSet
}

func (v *NullableAuthTestSuccessSchema) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAuthTestSuccessSchema(val *AuthTestSuccessSchema) *NullableAuthTestSuccessSchema {
	return &NullableAuthTestSuccessSchema{value: val, isSet: true}
}

func (v NullableAuthTestSuccessSchema) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAuthTestSuccessSchema) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

