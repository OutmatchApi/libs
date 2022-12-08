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

// AdminConversationsSearchSchema Schema for successful response of admin.conversations.search
type AdminConversationsSearchSchema struct {
	Channels []ObjsChannel `json:"channels"`
	NextCursor string `json:"next_cursor"`
}

// NewAdminConversationsSearchSchema instantiates a new AdminConversationsSearchSchema object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAdminConversationsSearchSchema(channels []ObjsChannel, nextCursor string) *AdminConversationsSearchSchema {
	this := AdminConversationsSearchSchema{}
	this.Channels = channels
	this.NextCursor = nextCursor
	return &this
}

// NewAdminConversationsSearchSchemaWithDefaults instantiates a new AdminConversationsSearchSchema object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAdminConversationsSearchSchemaWithDefaults() *AdminConversationsSearchSchema {
	this := AdminConversationsSearchSchema{}
	return &this
}

// GetChannels returns the Channels field value
func (o *AdminConversationsSearchSchema) GetChannels() []ObjsChannel {
	if o == nil {
		var ret []ObjsChannel
		return ret
	}

	return o.Channels
}

// GetChannelsOk returns a tuple with the Channels field value
// and a boolean to check if the value has been set.
func (o *AdminConversationsSearchSchema) GetChannelsOk() ([]ObjsChannel, bool) {
	if o == nil {
    return nil, false
	}
	return o.Channels, true
}

// SetChannels sets field value
func (o *AdminConversationsSearchSchema) SetChannels(v []ObjsChannel) {
	o.Channels = v
}

// GetNextCursor returns the NextCursor field value
func (o *AdminConversationsSearchSchema) GetNextCursor() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.NextCursor
}

// GetNextCursorOk returns a tuple with the NextCursor field value
// and a boolean to check if the value has been set.
func (o *AdminConversationsSearchSchema) GetNextCursorOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.NextCursor, true
}

// SetNextCursor sets field value
func (o *AdminConversationsSearchSchema) SetNextCursor(v string) {
	o.NextCursor = v
}

func (o AdminConversationsSearchSchema) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["channels"] = o.Channels
	}
	if true {
		toSerialize["next_cursor"] = o.NextCursor
	}
	return json.Marshal(toSerialize)
}

type NullableAdminConversationsSearchSchema struct {
	value *AdminConversationsSearchSchema
	isSet bool
}

func (v NullableAdminConversationsSearchSchema) Get() *AdminConversationsSearchSchema {
	return v.value
}

func (v *NullableAdminConversationsSearchSchema) Set(val *AdminConversationsSearchSchema) {
	v.value = val
	v.isSet = true
}

func (v NullableAdminConversationsSearchSchema) IsSet() bool {
	return v.isSet
}

func (v *NullableAdminConversationsSearchSchema) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAdminConversationsSearchSchema(val *AdminConversationsSearchSchema) *NullableAdminConversationsSearchSchema {
	return &NullableAdminConversationsSearchSchema{value: val, isSet: true}
}

func (v NullableAdminConversationsSearchSchema) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAdminConversationsSearchSchema) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


