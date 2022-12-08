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

// ConversationsMembersSuccessSchema Schema for successful response conversations.members method
type ConversationsMembersSuccessSchema struct {
	Members []string `json:"members"`
	Ok DefsOkTrue `json:"ok"`
	ResponseMetadata AdminConversationsGetTeamsSchemaResponseMetadata `json:"response_metadata"`
}

// NewConversationsMembersSuccessSchema instantiates a new ConversationsMembersSuccessSchema object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewConversationsMembersSuccessSchema(members []string, ok DefsOkTrue, responseMetadata AdminConversationsGetTeamsSchemaResponseMetadata) *ConversationsMembersSuccessSchema {
	this := ConversationsMembersSuccessSchema{}
	this.Members = members
	this.Ok = ok
	this.ResponseMetadata = responseMetadata
	return &this
}

// NewConversationsMembersSuccessSchemaWithDefaults instantiates a new ConversationsMembersSuccessSchema object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewConversationsMembersSuccessSchemaWithDefaults() *ConversationsMembersSuccessSchema {
	this := ConversationsMembersSuccessSchema{}
	return &this
}

// GetMembers returns the Members field value
func (o *ConversationsMembersSuccessSchema) GetMembers() []string {
	if o == nil {
		var ret []string
		return ret
	}

	return o.Members
}

// GetMembersOk returns a tuple with the Members field value
// and a boolean to check if the value has been set.
func (o *ConversationsMembersSuccessSchema) GetMembersOk() ([]string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Members, true
}

// SetMembers sets field value
func (o *ConversationsMembersSuccessSchema) SetMembers(v []string) {
	o.Members = v
}

// GetOk returns the Ok field value
func (o *ConversationsMembersSuccessSchema) GetOk() DefsOkTrue {
	if o == nil {
		var ret DefsOkTrue
		return ret
	}

	return o.Ok
}

// GetOkOk returns a tuple with the Ok field value
// and a boolean to check if the value has been set.
func (o *ConversationsMembersSuccessSchema) GetOkOk() (*DefsOkTrue, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Ok, true
}

// SetOk sets field value
func (o *ConversationsMembersSuccessSchema) SetOk(v DefsOkTrue) {
	o.Ok = v
}

// GetResponseMetadata returns the ResponseMetadata field value
func (o *ConversationsMembersSuccessSchema) GetResponseMetadata() AdminConversationsGetTeamsSchemaResponseMetadata {
	if o == nil {
		var ret AdminConversationsGetTeamsSchemaResponseMetadata
		return ret
	}

	return o.ResponseMetadata
}

// GetResponseMetadataOk returns a tuple with the ResponseMetadata field value
// and a boolean to check if the value has been set.
func (o *ConversationsMembersSuccessSchema) GetResponseMetadataOk() (*AdminConversationsGetTeamsSchemaResponseMetadata, bool) {
	if o == nil {
    return nil, false
	}
	return &o.ResponseMetadata, true
}

// SetResponseMetadata sets field value
func (o *ConversationsMembersSuccessSchema) SetResponseMetadata(v AdminConversationsGetTeamsSchemaResponseMetadata) {
	o.ResponseMetadata = v
}

func (o ConversationsMembersSuccessSchema) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["members"] = o.Members
	}
	if true {
		toSerialize["ok"] = o.Ok
	}
	if true {
		toSerialize["response_metadata"] = o.ResponseMetadata
	}
	return json.Marshal(toSerialize)
}

type NullableConversationsMembersSuccessSchema struct {
	value *ConversationsMembersSuccessSchema
	isSet bool
}

func (v NullableConversationsMembersSuccessSchema) Get() *ConversationsMembersSuccessSchema {
	return v.value
}

func (v *NullableConversationsMembersSuccessSchema) Set(val *ConversationsMembersSuccessSchema) {
	v.value = val
	v.isSet = true
}

func (v NullableConversationsMembersSuccessSchema) IsSet() bool {
	return v.isSet
}

func (v *NullableConversationsMembersSuccessSchema) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableConversationsMembersSuccessSchema(val *ConversationsMembersSuccessSchema) *NullableConversationsMembersSuccessSchema {
	return &NullableConversationsMembersSuccessSchema{value: val, isSet: true}
}

func (v NullableConversationsMembersSuccessSchema) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableConversationsMembersSuccessSchema) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

