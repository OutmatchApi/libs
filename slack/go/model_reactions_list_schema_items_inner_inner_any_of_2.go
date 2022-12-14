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

// ReactionsListSchemaItemsInnerInnerAnyOf2 struct for ReactionsListSchemaItemsInnerInnerAnyOf2
type ReactionsListSchemaItemsInnerInnerAnyOf2 struct {
	Comment ObjsComment `json:"comment"`
	File ObjsFile `json:"file"`
	Type string `json:"type"`
}

// NewReactionsListSchemaItemsInnerInnerAnyOf2 instantiates a new ReactionsListSchemaItemsInnerInnerAnyOf2 object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewReactionsListSchemaItemsInnerInnerAnyOf2(comment ObjsComment, file ObjsFile, type_ string) *ReactionsListSchemaItemsInnerInnerAnyOf2 {
	this := ReactionsListSchemaItemsInnerInnerAnyOf2{}
	this.Comment = comment
	this.File = file
	this.Type = type_
	return &this
}

// NewReactionsListSchemaItemsInnerInnerAnyOf2WithDefaults instantiates a new ReactionsListSchemaItemsInnerInnerAnyOf2 object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewReactionsListSchemaItemsInnerInnerAnyOf2WithDefaults() *ReactionsListSchemaItemsInnerInnerAnyOf2 {
	this := ReactionsListSchemaItemsInnerInnerAnyOf2{}
	return &this
}

// GetComment returns the Comment field value
func (o *ReactionsListSchemaItemsInnerInnerAnyOf2) GetComment() ObjsComment {
	if o == nil {
		var ret ObjsComment
		return ret
	}

	return o.Comment
}

// GetCommentOk returns a tuple with the Comment field value
// and a boolean to check if the value has been set.
func (o *ReactionsListSchemaItemsInnerInnerAnyOf2) GetCommentOk() (*ObjsComment, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Comment, true
}

// SetComment sets field value
func (o *ReactionsListSchemaItemsInnerInnerAnyOf2) SetComment(v ObjsComment) {
	o.Comment = v
}

// GetFile returns the File field value
func (o *ReactionsListSchemaItemsInnerInnerAnyOf2) GetFile() ObjsFile {
	if o == nil {
		var ret ObjsFile
		return ret
	}

	return o.File
}

// GetFileOk returns a tuple with the File field value
// and a boolean to check if the value has been set.
func (o *ReactionsListSchemaItemsInnerInnerAnyOf2) GetFileOk() (*ObjsFile, bool) {
	if o == nil {
    return nil, false
	}
	return &o.File, true
}

// SetFile sets field value
func (o *ReactionsListSchemaItemsInnerInnerAnyOf2) SetFile(v ObjsFile) {
	o.File = v
}

// GetType returns the Type field value
func (o *ReactionsListSchemaItemsInnerInnerAnyOf2) GetType() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Type
}

// GetTypeOk returns a tuple with the Type field value
// and a boolean to check if the value has been set.
func (o *ReactionsListSchemaItemsInnerInnerAnyOf2) GetTypeOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Type, true
}

// SetType sets field value
func (o *ReactionsListSchemaItemsInnerInnerAnyOf2) SetType(v string) {
	o.Type = v
}

func (o ReactionsListSchemaItemsInnerInnerAnyOf2) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["comment"] = o.Comment
	}
	if true {
		toSerialize["file"] = o.File
	}
	if true {
		toSerialize["type"] = o.Type
	}
	return json.Marshal(toSerialize)
}

type NullableReactionsListSchemaItemsInnerInnerAnyOf2 struct {
	value *ReactionsListSchemaItemsInnerInnerAnyOf2
	isSet bool
}

func (v NullableReactionsListSchemaItemsInnerInnerAnyOf2) Get() *ReactionsListSchemaItemsInnerInnerAnyOf2 {
	return v.value
}

func (v *NullableReactionsListSchemaItemsInnerInnerAnyOf2) Set(val *ReactionsListSchemaItemsInnerInnerAnyOf2) {
	v.value = val
	v.isSet = true
}

func (v NullableReactionsListSchemaItemsInnerInnerAnyOf2) IsSet() bool {
	return v.isSet
}

func (v *NullableReactionsListSchemaItemsInnerInnerAnyOf2) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableReactionsListSchemaItemsInnerInnerAnyOf2(val *ReactionsListSchemaItemsInnerInnerAnyOf2) *NullableReactionsListSchemaItemsInnerInnerAnyOf2 {
	return &NullableReactionsListSchemaItemsInnerInnerAnyOf2{value: val, isSet: true}
}

func (v NullableReactionsListSchemaItemsInnerInnerAnyOf2) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableReactionsListSchemaItemsInnerInnerAnyOf2) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


