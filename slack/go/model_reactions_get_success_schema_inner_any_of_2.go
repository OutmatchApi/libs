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

// ReactionsGetSuccessSchemaInnerAnyOf2 struct for ReactionsGetSuccessSchemaInnerAnyOf2
type ReactionsGetSuccessSchemaInnerAnyOf2 struct {
	Comment ObjsComment `json:"comment"`
	File ObjsFile `json:"file"`
	Ok DefsOkTrue `json:"ok"`
	Type string `json:"type"`
}

// NewReactionsGetSuccessSchemaInnerAnyOf2 instantiates a new ReactionsGetSuccessSchemaInnerAnyOf2 object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewReactionsGetSuccessSchemaInnerAnyOf2(comment ObjsComment, file ObjsFile, ok DefsOkTrue, type_ string) *ReactionsGetSuccessSchemaInnerAnyOf2 {
	this := ReactionsGetSuccessSchemaInnerAnyOf2{}
	this.Comment = comment
	this.File = file
	this.Ok = ok
	this.Type = type_
	return &this
}

// NewReactionsGetSuccessSchemaInnerAnyOf2WithDefaults instantiates a new ReactionsGetSuccessSchemaInnerAnyOf2 object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewReactionsGetSuccessSchemaInnerAnyOf2WithDefaults() *ReactionsGetSuccessSchemaInnerAnyOf2 {
	this := ReactionsGetSuccessSchemaInnerAnyOf2{}
	return &this
}

// GetComment returns the Comment field value
func (o *ReactionsGetSuccessSchemaInnerAnyOf2) GetComment() ObjsComment {
	if o == nil {
		var ret ObjsComment
		return ret
	}

	return o.Comment
}

// GetCommentOk returns a tuple with the Comment field value
// and a boolean to check if the value has been set.
func (o *ReactionsGetSuccessSchemaInnerAnyOf2) GetCommentOk() (*ObjsComment, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Comment, true
}

// SetComment sets field value
func (o *ReactionsGetSuccessSchemaInnerAnyOf2) SetComment(v ObjsComment) {
	o.Comment = v
}

// GetFile returns the File field value
func (o *ReactionsGetSuccessSchemaInnerAnyOf2) GetFile() ObjsFile {
	if o == nil {
		var ret ObjsFile
		return ret
	}

	return o.File
}

// GetFileOk returns a tuple with the File field value
// and a boolean to check if the value has been set.
func (o *ReactionsGetSuccessSchemaInnerAnyOf2) GetFileOk() (*ObjsFile, bool) {
	if o == nil {
    return nil, false
	}
	return &o.File, true
}

// SetFile sets field value
func (o *ReactionsGetSuccessSchemaInnerAnyOf2) SetFile(v ObjsFile) {
	o.File = v
}

// GetOk returns the Ok field value
func (o *ReactionsGetSuccessSchemaInnerAnyOf2) GetOk() DefsOkTrue {
	if o == nil {
		var ret DefsOkTrue
		return ret
	}

	return o.Ok
}

// GetOkOk returns a tuple with the Ok field value
// and a boolean to check if the value has been set.
func (o *ReactionsGetSuccessSchemaInnerAnyOf2) GetOkOk() (*DefsOkTrue, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Ok, true
}

// SetOk sets field value
func (o *ReactionsGetSuccessSchemaInnerAnyOf2) SetOk(v DefsOkTrue) {
	o.Ok = v
}

// GetType returns the Type field value
func (o *ReactionsGetSuccessSchemaInnerAnyOf2) GetType() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Type
}

// GetTypeOk returns a tuple with the Type field value
// and a boolean to check if the value has been set.
func (o *ReactionsGetSuccessSchemaInnerAnyOf2) GetTypeOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Type, true
}

// SetType sets field value
func (o *ReactionsGetSuccessSchemaInnerAnyOf2) SetType(v string) {
	o.Type = v
}

func (o ReactionsGetSuccessSchemaInnerAnyOf2) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["comment"] = o.Comment
	}
	if true {
		toSerialize["file"] = o.File
	}
	if true {
		toSerialize["ok"] = o.Ok
	}
	if true {
		toSerialize["type"] = o.Type
	}
	return json.Marshal(toSerialize)
}

type NullableReactionsGetSuccessSchemaInnerAnyOf2 struct {
	value *ReactionsGetSuccessSchemaInnerAnyOf2
	isSet bool
}

func (v NullableReactionsGetSuccessSchemaInnerAnyOf2) Get() *ReactionsGetSuccessSchemaInnerAnyOf2 {
	return v.value
}

func (v *NullableReactionsGetSuccessSchemaInnerAnyOf2) Set(val *ReactionsGetSuccessSchemaInnerAnyOf2) {
	v.value = val
	v.isSet = true
}

func (v NullableReactionsGetSuccessSchemaInnerAnyOf2) IsSet() bool {
	return v.isSet
}

func (v *NullableReactionsGetSuccessSchemaInnerAnyOf2) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableReactionsGetSuccessSchemaInnerAnyOf2(val *ReactionsGetSuccessSchemaInnerAnyOf2) *NullableReactionsGetSuccessSchemaInnerAnyOf2 {
	return &NullableReactionsGetSuccessSchemaInnerAnyOf2{value: val, isSet: true}
}

func (v NullableReactionsGetSuccessSchemaInnerAnyOf2) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableReactionsGetSuccessSchemaInnerAnyOf2) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


