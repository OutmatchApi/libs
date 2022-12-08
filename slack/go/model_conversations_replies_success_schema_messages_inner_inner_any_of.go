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

// ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf struct for ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf
type ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf struct {
	LastRead *string `json:"last_read,omitempty"`
	LatestReply *string `json:"latest_reply,omitempty"`
	ReplyCount int32 `json:"reply_count"`
	ReplyUsers []string `json:"reply_users,omitempty"`
	ReplyUsersCount *int32 `json:"reply_users_count,omitempty"`
	SourceTeam *string `json:"source_team,omitempty"`
	Subscribed bool `json:"subscribed"`
	Team *string `json:"team,omitempty"`
	Text string `json:"text"`
	ThreadTs string `json:"thread_ts"`
	Ts string `json:"ts"`
	Type string `json:"type"`
	UnreadCount *int32 `json:"unread_count,omitempty"`
	User string `json:"user"`
	UserProfile *ObjsUserProfileShort `json:"user_profile,omitempty"`
	UserTeam *string `json:"user_team,omitempty"`
}

// NewConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf instantiates a new ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf(replyCount int32, subscribed bool, text string, threadTs string, ts string, type_ string, user string) *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf {
	this := ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf{}
	this.ReplyCount = replyCount
	this.Subscribed = subscribed
	this.Text = text
	this.ThreadTs = threadTs
	this.Ts = ts
	this.Type = type_
	this.User = user
	return &this
}

// NewConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOfWithDefaults instantiates a new ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOfWithDefaults() *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf {
	this := ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf{}
	return &this
}

// GetLastRead returns the LastRead field value if set, zero value otherwise.
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetLastRead() string {
	if o == nil || isNil(o.LastRead) {
		var ret string
		return ret
	}
	return *o.LastRead
}

// GetLastReadOk returns a tuple with the LastRead field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetLastReadOk() (*string, bool) {
	if o == nil || isNil(o.LastRead) {
    return nil, false
	}
	return o.LastRead, true
}

// HasLastRead returns a boolean if a field has been set.
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) HasLastRead() bool {
	if o != nil && !isNil(o.LastRead) {
		return true
	}

	return false
}

// SetLastRead gets a reference to the given string and assigns it to the LastRead field.
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) SetLastRead(v string) {
	o.LastRead = &v
}

// GetLatestReply returns the LatestReply field value if set, zero value otherwise.
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetLatestReply() string {
	if o == nil || isNil(o.LatestReply) {
		var ret string
		return ret
	}
	return *o.LatestReply
}

// GetLatestReplyOk returns a tuple with the LatestReply field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetLatestReplyOk() (*string, bool) {
	if o == nil || isNil(o.LatestReply) {
    return nil, false
	}
	return o.LatestReply, true
}

// HasLatestReply returns a boolean if a field has been set.
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) HasLatestReply() bool {
	if o != nil && !isNil(o.LatestReply) {
		return true
	}

	return false
}

// SetLatestReply gets a reference to the given string and assigns it to the LatestReply field.
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) SetLatestReply(v string) {
	o.LatestReply = &v
}

// GetReplyCount returns the ReplyCount field value
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetReplyCount() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.ReplyCount
}

// GetReplyCountOk returns a tuple with the ReplyCount field value
// and a boolean to check if the value has been set.
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetReplyCountOk() (*int32, bool) {
	if o == nil {
    return nil, false
	}
	return &o.ReplyCount, true
}

// SetReplyCount sets field value
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) SetReplyCount(v int32) {
	o.ReplyCount = v
}

// GetReplyUsers returns the ReplyUsers field value if set, zero value otherwise.
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetReplyUsers() []string {
	if o == nil || isNil(o.ReplyUsers) {
		var ret []string
		return ret
	}
	return o.ReplyUsers
}

// GetReplyUsersOk returns a tuple with the ReplyUsers field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetReplyUsersOk() ([]string, bool) {
	if o == nil || isNil(o.ReplyUsers) {
    return nil, false
	}
	return o.ReplyUsers, true
}

// HasReplyUsers returns a boolean if a field has been set.
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) HasReplyUsers() bool {
	if o != nil && !isNil(o.ReplyUsers) {
		return true
	}

	return false
}

// SetReplyUsers gets a reference to the given []string and assigns it to the ReplyUsers field.
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) SetReplyUsers(v []string) {
	o.ReplyUsers = v
}

// GetReplyUsersCount returns the ReplyUsersCount field value if set, zero value otherwise.
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetReplyUsersCount() int32 {
	if o == nil || isNil(o.ReplyUsersCount) {
		var ret int32
		return ret
	}
	return *o.ReplyUsersCount
}

// GetReplyUsersCountOk returns a tuple with the ReplyUsersCount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetReplyUsersCountOk() (*int32, bool) {
	if o == nil || isNil(o.ReplyUsersCount) {
    return nil, false
	}
	return o.ReplyUsersCount, true
}

// HasReplyUsersCount returns a boolean if a field has been set.
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) HasReplyUsersCount() bool {
	if o != nil && !isNil(o.ReplyUsersCount) {
		return true
	}

	return false
}

// SetReplyUsersCount gets a reference to the given int32 and assigns it to the ReplyUsersCount field.
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) SetReplyUsersCount(v int32) {
	o.ReplyUsersCount = &v
}

// GetSourceTeam returns the SourceTeam field value if set, zero value otherwise.
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetSourceTeam() string {
	if o == nil || isNil(o.SourceTeam) {
		var ret string
		return ret
	}
	return *o.SourceTeam
}

// GetSourceTeamOk returns a tuple with the SourceTeam field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetSourceTeamOk() (*string, bool) {
	if o == nil || isNil(o.SourceTeam) {
    return nil, false
	}
	return o.SourceTeam, true
}

// HasSourceTeam returns a boolean if a field has been set.
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) HasSourceTeam() bool {
	if o != nil && !isNil(o.SourceTeam) {
		return true
	}

	return false
}

// SetSourceTeam gets a reference to the given string and assigns it to the SourceTeam field.
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) SetSourceTeam(v string) {
	o.SourceTeam = &v
}

// GetSubscribed returns the Subscribed field value
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetSubscribed() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Subscribed
}

// GetSubscribedOk returns a tuple with the Subscribed field value
// and a boolean to check if the value has been set.
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetSubscribedOk() (*bool, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Subscribed, true
}

// SetSubscribed sets field value
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) SetSubscribed(v bool) {
	o.Subscribed = v
}

// GetTeam returns the Team field value if set, zero value otherwise.
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetTeam() string {
	if o == nil || isNil(o.Team) {
		var ret string
		return ret
	}
	return *o.Team
}

// GetTeamOk returns a tuple with the Team field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetTeamOk() (*string, bool) {
	if o == nil || isNil(o.Team) {
    return nil, false
	}
	return o.Team, true
}

// HasTeam returns a boolean if a field has been set.
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) HasTeam() bool {
	if o != nil && !isNil(o.Team) {
		return true
	}

	return false
}

// SetTeam gets a reference to the given string and assigns it to the Team field.
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) SetTeam(v string) {
	o.Team = &v
}

// GetText returns the Text field value
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetText() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Text
}

// GetTextOk returns a tuple with the Text field value
// and a boolean to check if the value has been set.
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetTextOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Text, true
}

// SetText sets field value
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) SetText(v string) {
	o.Text = v
}

// GetThreadTs returns the ThreadTs field value
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetThreadTs() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.ThreadTs
}

// GetThreadTsOk returns a tuple with the ThreadTs field value
// and a boolean to check if the value has been set.
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetThreadTsOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.ThreadTs, true
}

// SetThreadTs sets field value
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) SetThreadTs(v string) {
	o.ThreadTs = v
}

// GetTs returns the Ts field value
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetTs() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Ts
}

// GetTsOk returns a tuple with the Ts field value
// and a boolean to check if the value has been set.
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetTsOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Ts, true
}

// SetTs sets field value
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) SetTs(v string) {
	o.Ts = v
}

// GetType returns the Type field value
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetType() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Type
}

// GetTypeOk returns a tuple with the Type field value
// and a boolean to check if the value has been set.
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetTypeOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Type, true
}

// SetType sets field value
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) SetType(v string) {
	o.Type = v
}

// GetUnreadCount returns the UnreadCount field value if set, zero value otherwise.
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetUnreadCount() int32 {
	if o == nil || isNil(o.UnreadCount) {
		var ret int32
		return ret
	}
	return *o.UnreadCount
}

// GetUnreadCountOk returns a tuple with the UnreadCount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetUnreadCountOk() (*int32, bool) {
	if o == nil || isNil(o.UnreadCount) {
    return nil, false
	}
	return o.UnreadCount, true
}

// HasUnreadCount returns a boolean if a field has been set.
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) HasUnreadCount() bool {
	if o != nil && !isNil(o.UnreadCount) {
		return true
	}

	return false
}

// SetUnreadCount gets a reference to the given int32 and assigns it to the UnreadCount field.
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) SetUnreadCount(v int32) {
	o.UnreadCount = &v
}

// GetUser returns the User field value
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetUser() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.User
}

// GetUserOk returns a tuple with the User field value
// and a boolean to check if the value has been set.
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetUserOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.User, true
}

// SetUser sets field value
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) SetUser(v string) {
	o.User = v
}

// GetUserProfile returns the UserProfile field value if set, zero value otherwise.
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetUserProfile() ObjsUserProfileShort {
	if o == nil || isNil(o.UserProfile) {
		var ret ObjsUserProfileShort
		return ret
	}
	return *o.UserProfile
}

// GetUserProfileOk returns a tuple with the UserProfile field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetUserProfileOk() (*ObjsUserProfileShort, bool) {
	if o == nil || isNil(o.UserProfile) {
    return nil, false
	}
	return o.UserProfile, true
}

// HasUserProfile returns a boolean if a field has been set.
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) HasUserProfile() bool {
	if o != nil && !isNil(o.UserProfile) {
		return true
	}

	return false
}

// SetUserProfile gets a reference to the given ObjsUserProfileShort and assigns it to the UserProfile field.
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) SetUserProfile(v ObjsUserProfileShort) {
	o.UserProfile = &v
}

// GetUserTeam returns the UserTeam field value if set, zero value otherwise.
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetUserTeam() string {
	if o == nil || isNil(o.UserTeam) {
		var ret string
		return ret
	}
	return *o.UserTeam
}

// GetUserTeamOk returns a tuple with the UserTeam field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetUserTeamOk() (*string, bool) {
	if o == nil || isNil(o.UserTeam) {
    return nil, false
	}
	return o.UserTeam, true
}

// HasUserTeam returns a boolean if a field has been set.
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) HasUserTeam() bool {
	if o != nil && !isNil(o.UserTeam) {
		return true
	}

	return false
}

// SetUserTeam gets a reference to the given string and assigns it to the UserTeam field.
func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) SetUserTeam(v string) {
	o.UserTeam = &v
}

func (o ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.LastRead) {
		toSerialize["last_read"] = o.LastRead
	}
	if !isNil(o.LatestReply) {
		toSerialize["latest_reply"] = o.LatestReply
	}
	if true {
		toSerialize["reply_count"] = o.ReplyCount
	}
	if !isNil(o.ReplyUsers) {
		toSerialize["reply_users"] = o.ReplyUsers
	}
	if !isNil(o.ReplyUsersCount) {
		toSerialize["reply_users_count"] = o.ReplyUsersCount
	}
	if !isNil(o.SourceTeam) {
		toSerialize["source_team"] = o.SourceTeam
	}
	if true {
		toSerialize["subscribed"] = o.Subscribed
	}
	if !isNil(o.Team) {
		toSerialize["team"] = o.Team
	}
	if true {
		toSerialize["text"] = o.Text
	}
	if true {
		toSerialize["thread_ts"] = o.ThreadTs
	}
	if true {
		toSerialize["ts"] = o.Ts
	}
	if true {
		toSerialize["type"] = o.Type
	}
	if !isNil(o.UnreadCount) {
		toSerialize["unread_count"] = o.UnreadCount
	}
	if true {
		toSerialize["user"] = o.User
	}
	if !isNil(o.UserProfile) {
		toSerialize["user_profile"] = o.UserProfile
	}
	if !isNil(o.UserTeam) {
		toSerialize["user_team"] = o.UserTeam
	}
	return json.Marshal(toSerialize)
}

type NullableConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf struct {
	value *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf
	isSet bool
}

func (v NullableConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) Get() *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf {
	return v.value
}

func (v *NullableConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) Set(val *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) {
	v.value = val
	v.isSet = true
}

func (v NullableConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) IsSet() bool {
	return v.isSet
}

func (v *NullableConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf(val *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) *NullableConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf {
	return &NullableConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf{value: val, isSet: true}
}

func (v NullableConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

