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

// UsersListSchema Schema for successful response from users.list method
type UsersListSchema struct {
	CacheTs int32 `json:"cache_ts"`
	Members [][]ObjsUserInner `json:"members"`
	Ok DefsOkTrue `json:"ok"`
	ResponseMetadata []ObjsResponseMetadataInner `json:"response_metadata,omitempty"`
}

// NewUsersListSchema instantiates a new UsersListSchema object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewUsersListSchema(cacheTs int32, members [][]ObjsUserInner, ok DefsOkTrue) *UsersListSchema {
	this := UsersListSchema{}
	this.CacheTs = cacheTs
	this.Members = members
	this.Ok = ok
	return &this
}

// NewUsersListSchemaWithDefaults instantiates a new UsersListSchema object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewUsersListSchemaWithDefaults() *UsersListSchema {
	this := UsersListSchema{}
	return &this
}

// GetCacheTs returns the CacheTs field value
func (o *UsersListSchema) GetCacheTs() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.CacheTs
}

// GetCacheTsOk returns a tuple with the CacheTs field value
// and a boolean to check if the value has been set.
func (o *UsersListSchema) GetCacheTsOk() (*int32, bool) {
	if o == nil {
    return nil, false
	}
	return &o.CacheTs, true
}

// SetCacheTs sets field value
func (o *UsersListSchema) SetCacheTs(v int32) {
	o.CacheTs = v
}

// GetMembers returns the Members field value
func (o *UsersListSchema) GetMembers() [][]ObjsUserInner {
	if o == nil {
		var ret [][]ObjsUserInner
		return ret
	}

	return o.Members
}

// GetMembersOk returns a tuple with the Members field value
// and a boolean to check if the value has been set.
func (o *UsersListSchema) GetMembersOk() ([][]ObjsUserInner, bool) {
	if o == nil {
    return nil, false
	}
	return o.Members, true
}

// SetMembers sets field value
func (o *UsersListSchema) SetMembers(v [][]ObjsUserInner) {
	o.Members = v
}

// GetOk returns the Ok field value
func (o *UsersListSchema) GetOk() DefsOkTrue {
	if o == nil {
		var ret DefsOkTrue
		return ret
	}

	return o.Ok
}

// GetOkOk returns a tuple with the Ok field value
// and a boolean to check if the value has been set.
func (o *UsersListSchema) GetOkOk() (*DefsOkTrue, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Ok, true
}

// SetOk sets field value
func (o *UsersListSchema) SetOk(v DefsOkTrue) {
	o.Ok = v
}

// GetResponseMetadata returns the ResponseMetadata field value if set, zero value otherwise.
func (o *UsersListSchema) GetResponseMetadata() []ObjsResponseMetadataInner {
	if o == nil || isNil(o.ResponseMetadata) {
		var ret []ObjsResponseMetadataInner
		return ret
	}
	return o.ResponseMetadata
}

// GetResponseMetadataOk returns a tuple with the ResponseMetadata field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UsersListSchema) GetResponseMetadataOk() ([]ObjsResponseMetadataInner, bool) {
	if o == nil || isNil(o.ResponseMetadata) {
    return nil, false
	}
	return o.ResponseMetadata, true
}

// HasResponseMetadata returns a boolean if a field has been set.
func (o *UsersListSchema) HasResponseMetadata() bool {
	if o != nil && !isNil(o.ResponseMetadata) {
		return true
	}

	return false
}

// SetResponseMetadata gets a reference to the given []ObjsResponseMetadataInner and assigns it to the ResponseMetadata field.
func (o *UsersListSchema) SetResponseMetadata(v []ObjsResponseMetadataInner) {
	o.ResponseMetadata = v
}

func (o UsersListSchema) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["cache_ts"] = o.CacheTs
	}
	if true {
		toSerialize["members"] = o.Members
	}
	if true {
		toSerialize["ok"] = o.Ok
	}
	if !isNil(o.ResponseMetadata) {
		toSerialize["response_metadata"] = o.ResponseMetadata
	}
	return json.Marshal(toSerialize)
}

type NullableUsersListSchema struct {
	value *UsersListSchema
	isSet bool
}

func (v NullableUsersListSchema) Get() *UsersListSchema {
	return v.value
}

func (v *NullableUsersListSchema) Set(val *UsersListSchema) {
	v.value = val
	v.isSet = true
}

func (v NullableUsersListSchema) IsSet() bool {
	return v.isSet
}

func (v *NullableUsersListSchema) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUsersListSchema(val *UsersListSchema) *NullableUsersListSchema {
	return &NullableUsersListSchema{value: val, isSet: true}
}

func (v NullableUsersListSchema) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUsersListSchema) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


