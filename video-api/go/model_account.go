/*
api.video

api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.

API version: 1.0.1
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package video-api

import (
	"encoding/json"
)

// Account struct for Account
type Account struct {
	// Deprecated. Whether you are using your production or sandbox API key will impact what environment is displayed here, as well as stats and features information. If you use your sandbox key, the environment is \"sandbox.\" If you use your production key, the environment is \"production.\"
	Environment *string `json:"environment,omitempty"`
	// Deprecated. What features are enabled for your account. Choices include: app.dynamic_metadata - the ability to dynamically tag videos to better segment and understand your audiences, app.event_log - the ability to create and retrieve a log detailing how your videos were interacted with, player.white_label - the ability to customise your player, stats.player_events - the ability to see statistics about how your player is being used, transcode.mp4_support - the ability to reformat content into mp4 using the H264 codec.
	Features []string `json:"features,omitempty"`
	Quota *AccountQuota `json:"quota,omitempty"`
}

// NewAccount instantiates a new Account object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAccount() *Account {
	this := Account{}
	return &this
}

// NewAccountWithDefaults instantiates a new Account object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAccountWithDefaults() *Account {
	this := Account{}
	return &this
}

// GetEnvironment returns the Environment field value if set, zero value otherwise.
func (o *Account) GetEnvironment() string {
	if o == nil || isNil(o.Environment) {
		var ret string
		return ret
	}
	return *o.Environment
}

// GetEnvironmentOk returns a tuple with the Environment field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Account) GetEnvironmentOk() (*string, bool) {
	if o == nil || isNil(o.Environment) {
    return nil, false
	}
	return o.Environment, true
}

// HasEnvironment returns a boolean if a field has been set.
func (o *Account) HasEnvironment() bool {
	if o != nil && !isNil(o.Environment) {
		return true
	}

	return false
}

// SetEnvironment gets a reference to the given string and assigns it to the Environment field.
func (o *Account) SetEnvironment(v string) {
	o.Environment = &v
}

// GetFeatures returns the Features field value if set, zero value otherwise.
func (o *Account) GetFeatures() []string {
	if o == nil || isNil(o.Features) {
		var ret []string
		return ret
	}
	return o.Features
}

// GetFeaturesOk returns a tuple with the Features field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Account) GetFeaturesOk() ([]string, bool) {
	if o == nil || isNil(o.Features) {
    return nil, false
	}
	return o.Features, true
}

// HasFeatures returns a boolean if a field has been set.
func (o *Account) HasFeatures() bool {
	if o != nil && !isNil(o.Features) {
		return true
	}

	return false
}

// SetFeatures gets a reference to the given []string and assigns it to the Features field.
func (o *Account) SetFeatures(v []string) {
	o.Features = v
}

// GetQuota returns the Quota field value if set, zero value otherwise.
func (o *Account) GetQuota() AccountQuota {
	if o == nil || isNil(o.Quota) {
		var ret AccountQuota
		return ret
	}
	return *o.Quota
}

// GetQuotaOk returns a tuple with the Quota field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Account) GetQuotaOk() (*AccountQuota, bool) {
	if o == nil || isNil(o.Quota) {
    return nil, false
	}
	return o.Quota, true
}

// HasQuota returns a boolean if a field has been set.
func (o *Account) HasQuota() bool {
	if o != nil && !isNil(o.Quota) {
		return true
	}

	return false
}

// SetQuota gets a reference to the given AccountQuota and assigns it to the Quota field.
func (o *Account) SetQuota(v AccountQuota) {
	o.Quota = &v
}

func (o Account) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Environment) {
		toSerialize["environment"] = o.Environment
	}
	if !isNil(o.Features) {
		toSerialize["features"] = o.Features
	}
	if !isNil(o.Quota) {
		toSerialize["quota"] = o.Quota
	}
	return json.Marshal(toSerialize)
}

type NullableAccount struct {
	value *Account
	isSet bool
}

func (v NullableAccount) Get() *Account {
	return v.value
}

func (v *NullableAccount) Set(val *Account) {
	v.value = val
	v.isSet = true
}

func (v NullableAccount) IsSet() bool {
	return v.isSet
}

func (v *NullableAccount) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAccount(val *Account) *NullableAccount {
	return &NullableAccount{value: val, isSet: true}
}

func (v NullableAccount) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAccount) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


