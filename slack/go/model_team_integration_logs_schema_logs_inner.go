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

// TeamIntegrationLogsSchemaLogsInner struct for TeamIntegrationLogsSchemaLogsInner
type TeamIntegrationLogsSchemaLogsInner struct {
	AdminAppId *string `json:"admin_app_id,omitempty"`
	AppId string `json:"app_id"`
	AppType string `json:"app_type"`
	ChangeType string `json:"change_type"`
	Channel *string `json:"channel,omitempty"`
	Date string `json:"date"`
	Scope string `json:"scope"`
	ServiceId *string `json:"service_id,omitempty"`
	ServiceType *string `json:"service_type,omitempty"`
	UserId string `json:"user_id"`
	UserName string `json:"user_name"`
}

// NewTeamIntegrationLogsSchemaLogsInner instantiates a new TeamIntegrationLogsSchemaLogsInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewTeamIntegrationLogsSchemaLogsInner(appId string, appType string, changeType string, date string, scope string, userId string, userName string) *TeamIntegrationLogsSchemaLogsInner {
	this := TeamIntegrationLogsSchemaLogsInner{}
	this.AppId = appId
	this.AppType = appType
	this.ChangeType = changeType
	this.Date = date
	this.Scope = scope
	this.UserId = userId
	this.UserName = userName
	return &this
}

// NewTeamIntegrationLogsSchemaLogsInnerWithDefaults instantiates a new TeamIntegrationLogsSchemaLogsInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewTeamIntegrationLogsSchemaLogsInnerWithDefaults() *TeamIntegrationLogsSchemaLogsInner {
	this := TeamIntegrationLogsSchemaLogsInner{}
	return &this
}

// GetAdminAppId returns the AdminAppId field value if set, zero value otherwise.
func (o *TeamIntegrationLogsSchemaLogsInner) GetAdminAppId() string {
	if o == nil || isNil(o.AdminAppId) {
		var ret string
		return ret
	}
	return *o.AdminAppId
}

// GetAdminAppIdOk returns a tuple with the AdminAppId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *TeamIntegrationLogsSchemaLogsInner) GetAdminAppIdOk() (*string, bool) {
	if o == nil || isNil(o.AdminAppId) {
    return nil, false
	}
	return o.AdminAppId, true
}

// HasAdminAppId returns a boolean if a field has been set.
func (o *TeamIntegrationLogsSchemaLogsInner) HasAdminAppId() bool {
	if o != nil && !isNil(o.AdminAppId) {
		return true
	}

	return false
}

// SetAdminAppId gets a reference to the given string and assigns it to the AdminAppId field.
func (o *TeamIntegrationLogsSchemaLogsInner) SetAdminAppId(v string) {
	o.AdminAppId = &v
}

// GetAppId returns the AppId field value
func (o *TeamIntegrationLogsSchemaLogsInner) GetAppId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.AppId
}

// GetAppIdOk returns a tuple with the AppId field value
// and a boolean to check if the value has been set.
func (o *TeamIntegrationLogsSchemaLogsInner) GetAppIdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.AppId, true
}

// SetAppId sets field value
func (o *TeamIntegrationLogsSchemaLogsInner) SetAppId(v string) {
	o.AppId = v
}

// GetAppType returns the AppType field value
func (o *TeamIntegrationLogsSchemaLogsInner) GetAppType() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.AppType
}

// GetAppTypeOk returns a tuple with the AppType field value
// and a boolean to check if the value has been set.
func (o *TeamIntegrationLogsSchemaLogsInner) GetAppTypeOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.AppType, true
}

// SetAppType sets field value
func (o *TeamIntegrationLogsSchemaLogsInner) SetAppType(v string) {
	o.AppType = v
}

// GetChangeType returns the ChangeType field value
func (o *TeamIntegrationLogsSchemaLogsInner) GetChangeType() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.ChangeType
}

// GetChangeTypeOk returns a tuple with the ChangeType field value
// and a boolean to check if the value has been set.
func (o *TeamIntegrationLogsSchemaLogsInner) GetChangeTypeOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.ChangeType, true
}

// SetChangeType sets field value
func (o *TeamIntegrationLogsSchemaLogsInner) SetChangeType(v string) {
	o.ChangeType = v
}

// GetChannel returns the Channel field value if set, zero value otherwise.
func (o *TeamIntegrationLogsSchemaLogsInner) GetChannel() string {
	if o == nil || isNil(o.Channel) {
		var ret string
		return ret
	}
	return *o.Channel
}

// GetChannelOk returns a tuple with the Channel field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *TeamIntegrationLogsSchemaLogsInner) GetChannelOk() (*string, bool) {
	if o == nil || isNil(o.Channel) {
    return nil, false
	}
	return o.Channel, true
}

// HasChannel returns a boolean if a field has been set.
func (o *TeamIntegrationLogsSchemaLogsInner) HasChannel() bool {
	if o != nil && !isNil(o.Channel) {
		return true
	}

	return false
}

// SetChannel gets a reference to the given string and assigns it to the Channel field.
func (o *TeamIntegrationLogsSchemaLogsInner) SetChannel(v string) {
	o.Channel = &v
}

// GetDate returns the Date field value
func (o *TeamIntegrationLogsSchemaLogsInner) GetDate() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Date
}

// GetDateOk returns a tuple with the Date field value
// and a boolean to check if the value has been set.
func (o *TeamIntegrationLogsSchemaLogsInner) GetDateOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Date, true
}

// SetDate sets field value
func (o *TeamIntegrationLogsSchemaLogsInner) SetDate(v string) {
	o.Date = v
}

// GetScope returns the Scope field value
func (o *TeamIntegrationLogsSchemaLogsInner) GetScope() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Scope
}

// GetScopeOk returns a tuple with the Scope field value
// and a boolean to check if the value has been set.
func (o *TeamIntegrationLogsSchemaLogsInner) GetScopeOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Scope, true
}

// SetScope sets field value
func (o *TeamIntegrationLogsSchemaLogsInner) SetScope(v string) {
	o.Scope = v
}

// GetServiceId returns the ServiceId field value if set, zero value otherwise.
func (o *TeamIntegrationLogsSchemaLogsInner) GetServiceId() string {
	if o == nil || isNil(o.ServiceId) {
		var ret string
		return ret
	}
	return *o.ServiceId
}

// GetServiceIdOk returns a tuple with the ServiceId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *TeamIntegrationLogsSchemaLogsInner) GetServiceIdOk() (*string, bool) {
	if o == nil || isNil(o.ServiceId) {
    return nil, false
	}
	return o.ServiceId, true
}

// HasServiceId returns a boolean if a field has been set.
func (o *TeamIntegrationLogsSchemaLogsInner) HasServiceId() bool {
	if o != nil && !isNil(o.ServiceId) {
		return true
	}

	return false
}

// SetServiceId gets a reference to the given string and assigns it to the ServiceId field.
func (o *TeamIntegrationLogsSchemaLogsInner) SetServiceId(v string) {
	o.ServiceId = &v
}

// GetServiceType returns the ServiceType field value if set, zero value otherwise.
func (o *TeamIntegrationLogsSchemaLogsInner) GetServiceType() string {
	if o == nil || isNil(o.ServiceType) {
		var ret string
		return ret
	}
	return *o.ServiceType
}

// GetServiceTypeOk returns a tuple with the ServiceType field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *TeamIntegrationLogsSchemaLogsInner) GetServiceTypeOk() (*string, bool) {
	if o == nil || isNil(o.ServiceType) {
    return nil, false
	}
	return o.ServiceType, true
}

// HasServiceType returns a boolean if a field has been set.
func (o *TeamIntegrationLogsSchemaLogsInner) HasServiceType() bool {
	if o != nil && !isNil(o.ServiceType) {
		return true
	}

	return false
}

// SetServiceType gets a reference to the given string and assigns it to the ServiceType field.
func (o *TeamIntegrationLogsSchemaLogsInner) SetServiceType(v string) {
	o.ServiceType = &v
}

// GetUserId returns the UserId field value
func (o *TeamIntegrationLogsSchemaLogsInner) GetUserId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.UserId
}

// GetUserIdOk returns a tuple with the UserId field value
// and a boolean to check if the value has been set.
func (o *TeamIntegrationLogsSchemaLogsInner) GetUserIdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.UserId, true
}

// SetUserId sets field value
func (o *TeamIntegrationLogsSchemaLogsInner) SetUserId(v string) {
	o.UserId = v
}

// GetUserName returns the UserName field value
func (o *TeamIntegrationLogsSchemaLogsInner) GetUserName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.UserName
}

// GetUserNameOk returns a tuple with the UserName field value
// and a boolean to check if the value has been set.
func (o *TeamIntegrationLogsSchemaLogsInner) GetUserNameOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.UserName, true
}

// SetUserName sets field value
func (o *TeamIntegrationLogsSchemaLogsInner) SetUserName(v string) {
	o.UserName = v
}

func (o TeamIntegrationLogsSchemaLogsInner) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.AdminAppId) {
		toSerialize["admin_app_id"] = o.AdminAppId
	}
	if true {
		toSerialize["app_id"] = o.AppId
	}
	if true {
		toSerialize["app_type"] = o.AppType
	}
	if true {
		toSerialize["change_type"] = o.ChangeType
	}
	if !isNil(o.Channel) {
		toSerialize["channel"] = o.Channel
	}
	if true {
		toSerialize["date"] = o.Date
	}
	if true {
		toSerialize["scope"] = o.Scope
	}
	if !isNil(o.ServiceId) {
		toSerialize["service_id"] = o.ServiceId
	}
	if !isNil(o.ServiceType) {
		toSerialize["service_type"] = o.ServiceType
	}
	if true {
		toSerialize["user_id"] = o.UserId
	}
	if true {
		toSerialize["user_name"] = o.UserName
	}
	return json.Marshal(toSerialize)
}

type NullableTeamIntegrationLogsSchemaLogsInner struct {
	value *TeamIntegrationLogsSchemaLogsInner
	isSet bool
}

func (v NullableTeamIntegrationLogsSchemaLogsInner) Get() *TeamIntegrationLogsSchemaLogsInner {
	return v.value
}

func (v *NullableTeamIntegrationLogsSchemaLogsInner) Set(val *TeamIntegrationLogsSchemaLogsInner) {
	v.value = val
	v.isSet = true
}

func (v NullableTeamIntegrationLogsSchemaLogsInner) IsSet() bool {
	return v.isSet
}

func (v *NullableTeamIntegrationLogsSchemaLogsInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableTeamIntegrationLogsSchemaLogsInner(val *TeamIntegrationLogsSchemaLogsInner) *NullableTeamIntegrationLogsSchemaLogsInner {
	return &NullableTeamIntegrationLogsSchemaLogsInner{value: val, isSet: true}
}

func (v NullableTeamIntegrationLogsSchemaLogsInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableTeamIntegrationLogsSchemaLogsInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


