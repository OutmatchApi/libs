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

// AdminConversationsGetTeamsSchemaResponseMetadata struct for AdminConversationsGetTeamsSchemaResponseMetadata
type AdminConversationsGetTeamsSchemaResponseMetadata struct {
	NextCursor string `json:"next_cursor"`
}

// NewAdminConversationsGetTeamsSchemaResponseMetadata instantiates a new AdminConversationsGetTeamsSchemaResponseMetadata object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAdminConversationsGetTeamsSchemaResponseMetadata(nextCursor string) *AdminConversationsGetTeamsSchemaResponseMetadata {
	this := AdminConversationsGetTeamsSchemaResponseMetadata{}
	this.NextCursor = nextCursor
	return &this
}

// NewAdminConversationsGetTeamsSchemaResponseMetadataWithDefaults instantiates a new AdminConversationsGetTeamsSchemaResponseMetadata object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAdminConversationsGetTeamsSchemaResponseMetadataWithDefaults() *AdminConversationsGetTeamsSchemaResponseMetadata {
	this := AdminConversationsGetTeamsSchemaResponseMetadata{}
	return &this
}

// GetNextCursor returns the NextCursor field value
func (o *AdminConversationsGetTeamsSchemaResponseMetadata) GetNextCursor() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.NextCursor
}

// GetNextCursorOk returns a tuple with the NextCursor field value
// and a boolean to check if the value has been set.
func (o *AdminConversationsGetTeamsSchemaResponseMetadata) GetNextCursorOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.NextCursor, true
}

// SetNextCursor sets field value
func (o *AdminConversationsGetTeamsSchemaResponseMetadata) SetNextCursor(v string) {
	o.NextCursor = v
}

func (o AdminConversationsGetTeamsSchemaResponseMetadata) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["next_cursor"] = o.NextCursor
	}
	return json.Marshal(toSerialize)
}

type NullableAdminConversationsGetTeamsSchemaResponseMetadata struct {
	value *AdminConversationsGetTeamsSchemaResponseMetadata
	isSet bool
}

func (v NullableAdminConversationsGetTeamsSchemaResponseMetadata) Get() *AdminConversationsGetTeamsSchemaResponseMetadata {
	return v.value
}

func (v *NullableAdminConversationsGetTeamsSchemaResponseMetadata) Set(val *AdminConversationsGetTeamsSchemaResponseMetadata) {
	v.value = val
	v.isSet = true
}

func (v NullableAdminConversationsGetTeamsSchemaResponseMetadata) IsSet() bool {
	return v.isSet
}

func (v *NullableAdminConversationsGetTeamsSchemaResponseMetadata) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAdminConversationsGetTeamsSchemaResponseMetadata(val *AdminConversationsGetTeamsSchemaResponseMetadata) *NullableAdminConversationsGetTeamsSchemaResponseMetadata {
	return &NullableAdminConversationsGetTeamsSchemaResponseMetadata{value: val, isSet: true}
}

func (v NullableAdminConversationsGetTeamsSchemaResponseMetadata) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAdminConversationsGetTeamsSchemaResponseMetadata) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


