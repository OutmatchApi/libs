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

// ApiPermissionsScopesListSuccessSchemaScopes struct for ApiPermissionsScopesListSuccessSchemaScopes
type ApiPermissionsScopesListSuccessSchemaScopes struct {
	AppHome []string `json:"app_home,omitempty"`
	Channel []string `json:"channel,omitempty"`
	Group []string `json:"group,omitempty"`
	Im []string `json:"im,omitempty"`
	Mpim []string `json:"mpim,omitempty"`
	Team []string `json:"team,omitempty"`
	User []string `json:"user,omitempty"`
	AdditionalProperties map[string]interface{}
}

type _ApiPermissionsScopesListSuccessSchemaScopes ApiPermissionsScopesListSuccessSchemaScopes

// NewApiPermissionsScopesListSuccessSchemaScopes instantiates a new ApiPermissionsScopesListSuccessSchemaScopes object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewApiPermissionsScopesListSuccessSchemaScopes() *ApiPermissionsScopesListSuccessSchemaScopes {
	this := ApiPermissionsScopesListSuccessSchemaScopes{}
	return &this
}

// NewApiPermissionsScopesListSuccessSchemaScopesWithDefaults instantiates a new ApiPermissionsScopesListSuccessSchemaScopes object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewApiPermissionsScopesListSuccessSchemaScopesWithDefaults() *ApiPermissionsScopesListSuccessSchemaScopes {
	this := ApiPermissionsScopesListSuccessSchemaScopes{}
	return &this
}

// GetAppHome returns the AppHome field value if set, zero value otherwise.
func (o *ApiPermissionsScopesListSuccessSchemaScopes) GetAppHome() []string {
	if o == nil || isNil(o.AppHome) {
		var ret []string
		return ret
	}
	return o.AppHome
}

// GetAppHomeOk returns a tuple with the AppHome field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ApiPermissionsScopesListSuccessSchemaScopes) GetAppHomeOk() ([]string, bool) {
	if o == nil || isNil(o.AppHome) {
    return nil, false
	}
	return o.AppHome, true
}

// HasAppHome returns a boolean if a field has been set.
func (o *ApiPermissionsScopesListSuccessSchemaScopes) HasAppHome() bool {
	if o != nil && !isNil(o.AppHome) {
		return true
	}

	return false
}

// SetAppHome gets a reference to the given []string and assigns it to the AppHome field.
func (o *ApiPermissionsScopesListSuccessSchemaScopes) SetAppHome(v []string) {
	o.AppHome = v
}

// GetChannel returns the Channel field value if set, zero value otherwise.
func (o *ApiPermissionsScopesListSuccessSchemaScopes) GetChannel() []string {
	if o == nil || isNil(o.Channel) {
		var ret []string
		return ret
	}
	return o.Channel
}

// GetChannelOk returns a tuple with the Channel field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ApiPermissionsScopesListSuccessSchemaScopes) GetChannelOk() ([]string, bool) {
	if o == nil || isNil(o.Channel) {
    return nil, false
	}
	return o.Channel, true
}

// HasChannel returns a boolean if a field has been set.
func (o *ApiPermissionsScopesListSuccessSchemaScopes) HasChannel() bool {
	if o != nil && !isNil(o.Channel) {
		return true
	}

	return false
}

// SetChannel gets a reference to the given []string and assigns it to the Channel field.
func (o *ApiPermissionsScopesListSuccessSchemaScopes) SetChannel(v []string) {
	o.Channel = v
}

// GetGroup returns the Group field value if set, zero value otherwise.
func (o *ApiPermissionsScopesListSuccessSchemaScopes) GetGroup() []string {
	if o == nil || isNil(o.Group) {
		var ret []string
		return ret
	}
	return o.Group
}

// GetGroupOk returns a tuple with the Group field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ApiPermissionsScopesListSuccessSchemaScopes) GetGroupOk() ([]string, bool) {
	if o == nil || isNil(o.Group) {
    return nil, false
	}
	return o.Group, true
}

// HasGroup returns a boolean if a field has been set.
func (o *ApiPermissionsScopesListSuccessSchemaScopes) HasGroup() bool {
	if o != nil && !isNil(o.Group) {
		return true
	}

	return false
}

// SetGroup gets a reference to the given []string and assigns it to the Group field.
func (o *ApiPermissionsScopesListSuccessSchemaScopes) SetGroup(v []string) {
	o.Group = v
}

// GetIm returns the Im field value if set, zero value otherwise.
func (o *ApiPermissionsScopesListSuccessSchemaScopes) GetIm() []string {
	if o == nil || isNil(o.Im) {
		var ret []string
		return ret
	}
	return o.Im
}

// GetImOk returns a tuple with the Im field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ApiPermissionsScopesListSuccessSchemaScopes) GetImOk() ([]string, bool) {
	if o == nil || isNil(o.Im) {
    return nil, false
	}
	return o.Im, true
}

// HasIm returns a boolean if a field has been set.
func (o *ApiPermissionsScopesListSuccessSchemaScopes) HasIm() bool {
	if o != nil && !isNil(o.Im) {
		return true
	}

	return false
}

// SetIm gets a reference to the given []string and assigns it to the Im field.
func (o *ApiPermissionsScopesListSuccessSchemaScopes) SetIm(v []string) {
	o.Im = v
}

// GetMpim returns the Mpim field value if set, zero value otherwise.
func (o *ApiPermissionsScopesListSuccessSchemaScopes) GetMpim() []string {
	if o == nil || isNil(o.Mpim) {
		var ret []string
		return ret
	}
	return o.Mpim
}

// GetMpimOk returns a tuple with the Mpim field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ApiPermissionsScopesListSuccessSchemaScopes) GetMpimOk() ([]string, bool) {
	if o == nil || isNil(o.Mpim) {
    return nil, false
	}
	return o.Mpim, true
}

// HasMpim returns a boolean if a field has been set.
func (o *ApiPermissionsScopesListSuccessSchemaScopes) HasMpim() bool {
	if o != nil && !isNil(o.Mpim) {
		return true
	}

	return false
}

// SetMpim gets a reference to the given []string and assigns it to the Mpim field.
func (o *ApiPermissionsScopesListSuccessSchemaScopes) SetMpim(v []string) {
	o.Mpim = v
}

// GetTeam returns the Team field value if set, zero value otherwise.
func (o *ApiPermissionsScopesListSuccessSchemaScopes) GetTeam() []string {
	if o == nil || isNil(o.Team) {
		var ret []string
		return ret
	}
	return o.Team
}

// GetTeamOk returns a tuple with the Team field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ApiPermissionsScopesListSuccessSchemaScopes) GetTeamOk() ([]string, bool) {
	if o == nil || isNil(o.Team) {
    return nil, false
	}
	return o.Team, true
}

// HasTeam returns a boolean if a field has been set.
func (o *ApiPermissionsScopesListSuccessSchemaScopes) HasTeam() bool {
	if o != nil && !isNil(o.Team) {
		return true
	}

	return false
}

// SetTeam gets a reference to the given []string and assigns it to the Team field.
func (o *ApiPermissionsScopesListSuccessSchemaScopes) SetTeam(v []string) {
	o.Team = v
}

// GetUser returns the User field value if set, zero value otherwise.
func (o *ApiPermissionsScopesListSuccessSchemaScopes) GetUser() []string {
	if o == nil || isNil(o.User) {
		var ret []string
		return ret
	}
	return o.User
}

// GetUserOk returns a tuple with the User field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ApiPermissionsScopesListSuccessSchemaScopes) GetUserOk() ([]string, bool) {
	if o == nil || isNil(o.User) {
    return nil, false
	}
	return o.User, true
}

// HasUser returns a boolean if a field has been set.
func (o *ApiPermissionsScopesListSuccessSchemaScopes) HasUser() bool {
	if o != nil && !isNil(o.User) {
		return true
	}

	return false
}

// SetUser gets a reference to the given []string and assigns it to the User field.
func (o *ApiPermissionsScopesListSuccessSchemaScopes) SetUser(v []string) {
	o.User = v
}

func (o ApiPermissionsScopesListSuccessSchemaScopes) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.AppHome) {
		toSerialize["app_home"] = o.AppHome
	}
	if !isNil(o.Channel) {
		toSerialize["channel"] = o.Channel
	}
	if !isNil(o.Group) {
		toSerialize["group"] = o.Group
	}
	if !isNil(o.Im) {
		toSerialize["im"] = o.Im
	}
	if !isNil(o.Mpim) {
		toSerialize["mpim"] = o.Mpim
	}
	if !isNil(o.Team) {
		toSerialize["team"] = o.Team
	}
	if !isNil(o.User) {
		toSerialize["user"] = o.User
	}

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return json.Marshal(toSerialize)
}

func (o *ApiPermissionsScopesListSuccessSchemaScopes) UnmarshalJSON(bytes []byte) (err error) {
	varApiPermissionsScopesListSuccessSchemaScopes := _ApiPermissionsScopesListSuccessSchemaScopes{}

	if err = json.Unmarshal(bytes, &varApiPermissionsScopesListSuccessSchemaScopes); err == nil {
		*o = ApiPermissionsScopesListSuccessSchemaScopes(varApiPermissionsScopesListSuccessSchemaScopes)
	}

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(bytes, &additionalProperties); err == nil {
		delete(additionalProperties, "app_home")
		delete(additionalProperties, "channel")
		delete(additionalProperties, "group")
		delete(additionalProperties, "im")
		delete(additionalProperties, "mpim")
		delete(additionalProperties, "team")
		delete(additionalProperties, "user")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableApiPermissionsScopesListSuccessSchemaScopes struct {
	value *ApiPermissionsScopesListSuccessSchemaScopes
	isSet bool
}

func (v NullableApiPermissionsScopesListSuccessSchemaScopes) Get() *ApiPermissionsScopesListSuccessSchemaScopes {
	return v.value
}

func (v *NullableApiPermissionsScopesListSuccessSchemaScopes) Set(val *ApiPermissionsScopesListSuccessSchemaScopes) {
	v.value = val
	v.isSet = true
}

func (v NullableApiPermissionsScopesListSuccessSchemaScopes) IsSet() bool {
	return v.isSet
}

func (v *NullableApiPermissionsScopesListSuccessSchemaScopes) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableApiPermissionsScopesListSuccessSchemaScopes(val *ApiPermissionsScopesListSuccessSchemaScopes) *NullableApiPermissionsScopesListSuccessSchemaScopes {
	return &NullableApiPermissionsScopesListSuccessSchemaScopes{value: val, isSet: true}
}

func (v NullableApiPermissionsScopesListSuccessSchemaScopes) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableApiPermissionsScopesListSuccessSchemaScopes) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


