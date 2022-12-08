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

// ObjsComment struct for ObjsComment
type ObjsComment struct {
	Comment string `json:"comment"`
	Created int32 `json:"created"`
	Id string `json:"id"`
	IsIntro bool `json:"is_intro"`
	IsStarred *bool `json:"is_starred,omitempty"`
	NumStars *int32 `json:"num_stars,omitempty"`
	PinnedInfo map[string]interface{} `json:"pinned_info,omitempty"`
	PinnedTo []string `json:"pinned_to,omitempty"`
	Reactions []ObjsReaction `json:"reactions,omitempty"`
	Timestamp int32 `json:"timestamp"`
	User string `json:"user"`
}

// NewObjsComment instantiates a new ObjsComment object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewObjsComment(comment string, created int32, id string, isIntro bool, timestamp int32, user string) *ObjsComment {
	this := ObjsComment{}
	this.Comment = comment
	this.Created = created
	this.Id = id
	this.IsIntro = isIntro
	this.Timestamp = timestamp
	this.User = user
	return &this
}

// NewObjsCommentWithDefaults instantiates a new ObjsComment object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewObjsCommentWithDefaults() *ObjsComment {
	this := ObjsComment{}
	return &this
}

// GetComment returns the Comment field value
func (o *ObjsComment) GetComment() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Comment
}

// GetCommentOk returns a tuple with the Comment field value
// and a boolean to check if the value has been set.
func (o *ObjsComment) GetCommentOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Comment, true
}

// SetComment sets field value
func (o *ObjsComment) SetComment(v string) {
	o.Comment = v
}

// GetCreated returns the Created field value
func (o *ObjsComment) GetCreated() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Created
}

// GetCreatedOk returns a tuple with the Created field value
// and a boolean to check if the value has been set.
func (o *ObjsComment) GetCreatedOk() (*int32, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Created, true
}

// SetCreated sets field value
func (o *ObjsComment) SetCreated(v int32) {
	o.Created = v
}

// GetId returns the Id field value
func (o *ObjsComment) GetId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *ObjsComment) GetIdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *ObjsComment) SetId(v string) {
	o.Id = v
}

// GetIsIntro returns the IsIntro field value
func (o *ObjsComment) GetIsIntro() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.IsIntro
}

// GetIsIntroOk returns a tuple with the IsIntro field value
// and a boolean to check if the value has been set.
func (o *ObjsComment) GetIsIntroOk() (*bool, bool) {
	if o == nil {
    return nil, false
	}
	return &o.IsIntro, true
}

// SetIsIntro sets field value
func (o *ObjsComment) SetIsIntro(v bool) {
	o.IsIntro = v
}

// GetIsStarred returns the IsStarred field value if set, zero value otherwise.
func (o *ObjsComment) GetIsStarred() bool {
	if o == nil || isNil(o.IsStarred) {
		var ret bool
		return ret
	}
	return *o.IsStarred
}

// GetIsStarredOk returns a tuple with the IsStarred field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ObjsComment) GetIsStarredOk() (*bool, bool) {
	if o == nil || isNil(o.IsStarred) {
    return nil, false
	}
	return o.IsStarred, true
}

// HasIsStarred returns a boolean if a field has been set.
func (o *ObjsComment) HasIsStarred() bool {
	if o != nil && !isNil(o.IsStarred) {
		return true
	}

	return false
}

// SetIsStarred gets a reference to the given bool and assigns it to the IsStarred field.
func (o *ObjsComment) SetIsStarred(v bool) {
	o.IsStarred = &v
}

// GetNumStars returns the NumStars field value if set, zero value otherwise.
func (o *ObjsComment) GetNumStars() int32 {
	if o == nil || isNil(o.NumStars) {
		var ret int32
		return ret
	}
	return *o.NumStars
}

// GetNumStarsOk returns a tuple with the NumStars field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ObjsComment) GetNumStarsOk() (*int32, bool) {
	if o == nil || isNil(o.NumStars) {
    return nil, false
	}
	return o.NumStars, true
}

// HasNumStars returns a boolean if a field has been set.
func (o *ObjsComment) HasNumStars() bool {
	if o != nil && !isNil(o.NumStars) {
		return true
	}

	return false
}

// SetNumStars gets a reference to the given int32 and assigns it to the NumStars field.
func (o *ObjsComment) SetNumStars(v int32) {
	o.NumStars = &v
}

// GetPinnedInfo returns the PinnedInfo field value if set, zero value otherwise.
func (o *ObjsComment) GetPinnedInfo() map[string]interface{} {
	if o == nil || isNil(o.PinnedInfo) {
		var ret map[string]interface{}
		return ret
	}
	return o.PinnedInfo
}

// GetPinnedInfoOk returns a tuple with the PinnedInfo field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ObjsComment) GetPinnedInfoOk() (map[string]interface{}, bool) {
	if o == nil || isNil(o.PinnedInfo) {
    return map[string]interface{}{}, false
	}
	return o.PinnedInfo, true
}

// HasPinnedInfo returns a boolean if a field has been set.
func (o *ObjsComment) HasPinnedInfo() bool {
	if o != nil && !isNil(o.PinnedInfo) {
		return true
	}

	return false
}

// SetPinnedInfo gets a reference to the given map[string]interface{} and assigns it to the PinnedInfo field.
func (o *ObjsComment) SetPinnedInfo(v map[string]interface{}) {
	o.PinnedInfo = v
}

// GetPinnedTo returns the PinnedTo field value if set, zero value otherwise.
func (o *ObjsComment) GetPinnedTo() []string {
	if o == nil || isNil(o.PinnedTo) {
		var ret []string
		return ret
	}
	return o.PinnedTo
}

// GetPinnedToOk returns a tuple with the PinnedTo field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ObjsComment) GetPinnedToOk() ([]string, bool) {
	if o == nil || isNil(o.PinnedTo) {
    return nil, false
	}
	return o.PinnedTo, true
}

// HasPinnedTo returns a boolean if a field has been set.
func (o *ObjsComment) HasPinnedTo() bool {
	if o != nil && !isNil(o.PinnedTo) {
		return true
	}

	return false
}

// SetPinnedTo gets a reference to the given []string and assigns it to the PinnedTo field.
func (o *ObjsComment) SetPinnedTo(v []string) {
	o.PinnedTo = v
}

// GetReactions returns the Reactions field value if set, zero value otherwise.
func (o *ObjsComment) GetReactions() []ObjsReaction {
	if o == nil || isNil(o.Reactions) {
		var ret []ObjsReaction
		return ret
	}
	return o.Reactions
}

// GetReactionsOk returns a tuple with the Reactions field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ObjsComment) GetReactionsOk() ([]ObjsReaction, bool) {
	if o == nil || isNil(o.Reactions) {
    return nil, false
	}
	return o.Reactions, true
}

// HasReactions returns a boolean if a field has been set.
func (o *ObjsComment) HasReactions() bool {
	if o != nil && !isNil(o.Reactions) {
		return true
	}

	return false
}

// SetReactions gets a reference to the given []ObjsReaction and assigns it to the Reactions field.
func (o *ObjsComment) SetReactions(v []ObjsReaction) {
	o.Reactions = v
}

// GetTimestamp returns the Timestamp field value
func (o *ObjsComment) GetTimestamp() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Timestamp
}

// GetTimestampOk returns a tuple with the Timestamp field value
// and a boolean to check if the value has been set.
func (o *ObjsComment) GetTimestampOk() (*int32, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Timestamp, true
}

// SetTimestamp sets field value
func (o *ObjsComment) SetTimestamp(v int32) {
	o.Timestamp = v
}

// GetUser returns the User field value
func (o *ObjsComment) GetUser() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.User
}

// GetUserOk returns a tuple with the User field value
// and a boolean to check if the value has been set.
func (o *ObjsComment) GetUserOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.User, true
}

// SetUser sets field value
func (o *ObjsComment) SetUser(v string) {
	o.User = v
}

func (o ObjsComment) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["comment"] = o.Comment
	}
	if true {
		toSerialize["created"] = o.Created
	}
	if true {
		toSerialize["id"] = o.Id
	}
	if true {
		toSerialize["is_intro"] = o.IsIntro
	}
	if !isNil(o.IsStarred) {
		toSerialize["is_starred"] = o.IsStarred
	}
	if !isNil(o.NumStars) {
		toSerialize["num_stars"] = o.NumStars
	}
	if !isNil(o.PinnedInfo) {
		toSerialize["pinned_info"] = o.PinnedInfo
	}
	if !isNil(o.PinnedTo) {
		toSerialize["pinned_to"] = o.PinnedTo
	}
	if !isNil(o.Reactions) {
		toSerialize["reactions"] = o.Reactions
	}
	if true {
		toSerialize["timestamp"] = o.Timestamp
	}
	if true {
		toSerialize["user"] = o.User
	}
	return json.Marshal(toSerialize)
}

type NullableObjsComment struct {
	value *ObjsComment
	isSet bool
}

func (v NullableObjsComment) Get() *ObjsComment {
	return v.value
}

func (v *NullableObjsComment) Set(val *ObjsComment) {
	v.value = val
	v.isSet = true
}

func (v NullableObjsComment) IsSet() bool {
	return v.isSet
}

func (v *NullableObjsComment) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableObjsComment(val *ObjsComment) *NullableObjsComment {
	return &NullableObjsComment{value: val, isSet: true}
}

func (v NullableObjsComment) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableObjsComment) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

