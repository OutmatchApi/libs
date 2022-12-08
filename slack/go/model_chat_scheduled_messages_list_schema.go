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

// ChatScheduledMessagesListSchema Schema for successful response from chat.scheduledMessages.list method
type ChatScheduledMessagesListSchema struct {
	Ok DefsOkTrue `json:"ok"`
	ResponseMetadata AdminConversationsGetTeamsSchemaResponseMetadata `json:"response_metadata"`
	ScheduledMessages []ChatScheduledMessagesListSchemaScheduledMessagesInner `json:"scheduled_messages"`
}

// NewChatScheduledMessagesListSchema instantiates a new ChatScheduledMessagesListSchema object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewChatScheduledMessagesListSchema(ok DefsOkTrue, responseMetadata AdminConversationsGetTeamsSchemaResponseMetadata, scheduledMessages []ChatScheduledMessagesListSchemaScheduledMessagesInner) *ChatScheduledMessagesListSchema {
	this := ChatScheduledMessagesListSchema{}
	this.Ok = ok
	this.ResponseMetadata = responseMetadata
	this.ScheduledMessages = scheduledMessages
	return &this
}

// NewChatScheduledMessagesListSchemaWithDefaults instantiates a new ChatScheduledMessagesListSchema object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewChatScheduledMessagesListSchemaWithDefaults() *ChatScheduledMessagesListSchema {
	this := ChatScheduledMessagesListSchema{}
	return &this
}

// GetOk returns the Ok field value
func (o *ChatScheduledMessagesListSchema) GetOk() DefsOkTrue {
	if o == nil {
		var ret DefsOkTrue
		return ret
	}

	return o.Ok
}

// GetOkOk returns a tuple with the Ok field value
// and a boolean to check if the value has been set.
func (o *ChatScheduledMessagesListSchema) GetOkOk() (*DefsOkTrue, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Ok, true
}

// SetOk sets field value
func (o *ChatScheduledMessagesListSchema) SetOk(v DefsOkTrue) {
	o.Ok = v
}

// GetResponseMetadata returns the ResponseMetadata field value
func (o *ChatScheduledMessagesListSchema) GetResponseMetadata() AdminConversationsGetTeamsSchemaResponseMetadata {
	if o == nil {
		var ret AdminConversationsGetTeamsSchemaResponseMetadata
		return ret
	}

	return o.ResponseMetadata
}

// GetResponseMetadataOk returns a tuple with the ResponseMetadata field value
// and a boolean to check if the value has been set.
func (o *ChatScheduledMessagesListSchema) GetResponseMetadataOk() (*AdminConversationsGetTeamsSchemaResponseMetadata, bool) {
	if o == nil {
    return nil, false
	}
	return &o.ResponseMetadata, true
}

// SetResponseMetadata sets field value
func (o *ChatScheduledMessagesListSchema) SetResponseMetadata(v AdminConversationsGetTeamsSchemaResponseMetadata) {
	o.ResponseMetadata = v
}

// GetScheduledMessages returns the ScheduledMessages field value
func (o *ChatScheduledMessagesListSchema) GetScheduledMessages() []ChatScheduledMessagesListSchemaScheduledMessagesInner {
	if o == nil {
		var ret []ChatScheduledMessagesListSchemaScheduledMessagesInner
		return ret
	}

	return o.ScheduledMessages
}

// GetScheduledMessagesOk returns a tuple with the ScheduledMessages field value
// and a boolean to check if the value has been set.
func (o *ChatScheduledMessagesListSchema) GetScheduledMessagesOk() ([]ChatScheduledMessagesListSchemaScheduledMessagesInner, bool) {
	if o == nil {
    return nil, false
	}
	return o.ScheduledMessages, true
}

// SetScheduledMessages sets field value
func (o *ChatScheduledMessagesListSchema) SetScheduledMessages(v []ChatScheduledMessagesListSchemaScheduledMessagesInner) {
	o.ScheduledMessages = v
}

func (o ChatScheduledMessagesListSchema) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["ok"] = o.Ok
	}
	if true {
		toSerialize["response_metadata"] = o.ResponseMetadata
	}
	if true {
		toSerialize["scheduled_messages"] = o.ScheduledMessages
	}
	return json.Marshal(toSerialize)
}

type NullableChatScheduledMessagesListSchema struct {
	value *ChatScheduledMessagesListSchema
	isSet bool
}

func (v NullableChatScheduledMessagesListSchema) Get() *ChatScheduledMessagesListSchema {
	return v.value
}

func (v *NullableChatScheduledMessagesListSchema) Set(val *ChatScheduledMessagesListSchema) {
	v.value = val
	v.isSet = true
}

func (v NullableChatScheduledMessagesListSchema) IsSet() bool {
	return v.isSet
}

func (v *NullableChatScheduledMessagesListSchema) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableChatScheduledMessagesListSchema(val *ChatScheduledMessagesListSchema) *NullableChatScheduledMessagesListSchema {
	return &NullableChatScheduledMessagesListSchema{value: val, isSet: true}
}

func (v NullableChatScheduledMessagesListSchema) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableChatScheduledMessagesListSchema) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


