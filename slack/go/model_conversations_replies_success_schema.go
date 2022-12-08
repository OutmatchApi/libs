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

// ConversationsRepliesSuccessSchema Schema for successful response from conversations.replies method
type ConversationsRepliesSuccessSchema struct {
	HasMore *bool `json:"has_more,omitempty"`
	Messages [][]ConversationsRepliesSuccessSchemaMessagesInnerInner `json:"messages"`
	Ok DefsOkTrue `json:"ok"`
}

// NewConversationsRepliesSuccessSchema instantiates a new ConversationsRepliesSuccessSchema object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewConversationsRepliesSuccessSchema(messages [][]ConversationsRepliesSuccessSchemaMessagesInnerInner, ok DefsOkTrue) *ConversationsRepliesSuccessSchema {
	this := ConversationsRepliesSuccessSchema{}
	this.Messages = messages
	this.Ok = ok
	return &this
}

// NewConversationsRepliesSuccessSchemaWithDefaults instantiates a new ConversationsRepliesSuccessSchema object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewConversationsRepliesSuccessSchemaWithDefaults() *ConversationsRepliesSuccessSchema {
	this := ConversationsRepliesSuccessSchema{}
	return &this
}

// GetHasMore returns the HasMore field value if set, zero value otherwise.
func (o *ConversationsRepliesSuccessSchema) GetHasMore() bool {
	if o == nil || isNil(o.HasMore) {
		var ret bool
		return ret
	}
	return *o.HasMore
}

// GetHasMoreOk returns a tuple with the HasMore field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConversationsRepliesSuccessSchema) GetHasMoreOk() (*bool, bool) {
	if o == nil || isNil(o.HasMore) {
    return nil, false
	}
	return o.HasMore, true
}

// HasHasMore returns a boolean if a field has been set.
func (o *ConversationsRepliesSuccessSchema) HasHasMore() bool {
	if o != nil && !isNil(o.HasMore) {
		return true
	}

	return false
}

// SetHasMore gets a reference to the given bool and assigns it to the HasMore field.
func (o *ConversationsRepliesSuccessSchema) SetHasMore(v bool) {
	o.HasMore = &v
}

// GetMessages returns the Messages field value
func (o *ConversationsRepliesSuccessSchema) GetMessages() [][]ConversationsRepliesSuccessSchemaMessagesInnerInner {
	if o == nil {
		var ret [][]ConversationsRepliesSuccessSchemaMessagesInnerInner
		return ret
	}

	return o.Messages
}

// GetMessagesOk returns a tuple with the Messages field value
// and a boolean to check if the value has been set.
func (o *ConversationsRepliesSuccessSchema) GetMessagesOk() ([][]ConversationsRepliesSuccessSchemaMessagesInnerInner, bool) {
	if o == nil {
    return nil, false
	}
	return o.Messages, true
}

// SetMessages sets field value
func (o *ConversationsRepliesSuccessSchema) SetMessages(v [][]ConversationsRepliesSuccessSchemaMessagesInnerInner) {
	o.Messages = v
}

// GetOk returns the Ok field value
func (o *ConversationsRepliesSuccessSchema) GetOk() DefsOkTrue {
	if o == nil {
		var ret DefsOkTrue
		return ret
	}

	return o.Ok
}

// GetOkOk returns a tuple with the Ok field value
// and a boolean to check if the value has been set.
func (o *ConversationsRepliesSuccessSchema) GetOkOk() (*DefsOkTrue, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Ok, true
}

// SetOk sets field value
func (o *ConversationsRepliesSuccessSchema) SetOk(v DefsOkTrue) {
	o.Ok = v
}

func (o ConversationsRepliesSuccessSchema) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.HasMore) {
		toSerialize["has_more"] = o.HasMore
	}
	if true {
		toSerialize["messages"] = o.Messages
	}
	if true {
		toSerialize["ok"] = o.Ok
	}
	return json.Marshal(toSerialize)
}

type NullableConversationsRepliesSuccessSchema struct {
	value *ConversationsRepliesSuccessSchema
	isSet bool
}

func (v NullableConversationsRepliesSuccessSchema) Get() *ConversationsRepliesSuccessSchema {
	return v.value
}

func (v *NullableConversationsRepliesSuccessSchema) Set(val *ConversationsRepliesSuccessSchema) {
	v.value = val
	v.isSet = true
}

func (v NullableConversationsRepliesSuccessSchema) IsSet() bool {
	return v.isSet
}

func (v *NullableConversationsRepliesSuccessSchema) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableConversationsRepliesSuccessSchema(val *ConversationsRepliesSuccessSchema) *NullableConversationsRepliesSuccessSchema {
	return &NullableConversationsRepliesSuccessSchema{value: val, isSet: true}
}

func (v NullableConversationsRepliesSuccessSchema) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableConversationsRepliesSuccessSchema) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

