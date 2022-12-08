# ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LastRead** | Pointer to **string** |  | [optional] 
**LatestReply** | Pointer to **string** |  | [optional] 
**ReplyCount** | **int32** |  | 
**ReplyUsers** | Pointer to **[]string** |  | [optional] 
**ReplyUsersCount** | Pointer to **int32** |  | [optional] 
**SourceTeam** | Pointer to **string** |  | [optional] 
**Subscribed** | **bool** |  | 
**Team** | Pointer to **string** |  | [optional] 
**Text** | **string** |  | 
**ThreadTs** | **string** |  | 
**Ts** | **string** |  | 
**Type** | **string** |  | 
**UnreadCount** | Pointer to **int32** |  | [optional] 
**User** | **string** |  | 
**UserProfile** | Pointer to [**ObjsUserProfileShort**](ObjsUserProfileShort.md) |  | [optional] 
**UserTeam** | Pointer to **string** |  | [optional] 

## Methods

### NewConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf

`func NewConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf(replyCount int32, subscribed bool, text string, threadTs string, ts string, type_ string, user string, ) *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf`

NewConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf instantiates a new ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOfWithDefaults

`func NewConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOfWithDefaults() *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf`

NewConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOfWithDefaults instantiates a new ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLastRead

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetLastRead() string`

GetLastRead returns the LastRead field if non-nil, zero value otherwise.

### GetLastReadOk

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetLastReadOk() (*string, bool)`

GetLastReadOk returns a tuple with the LastRead field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastRead

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) SetLastRead(v string)`

SetLastRead sets LastRead field to given value.

### HasLastRead

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) HasLastRead() bool`

HasLastRead returns a boolean if a field has been set.

### GetLatestReply

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetLatestReply() string`

GetLatestReply returns the LatestReply field if non-nil, zero value otherwise.

### GetLatestReplyOk

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetLatestReplyOk() (*string, bool)`

GetLatestReplyOk returns a tuple with the LatestReply field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLatestReply

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) SetLatestReply(v string)`

SetLatestReply sets LatestReply field to given value.

### HasLatestReply

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) HasLatestReply() bool`

HasLatestReply returns a boolean if a field has been set.

### GetReplyCount

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetReplyCount() int32`

GetReplyCount returns the ReplyCount field if non-nil, zero value otherwise.

### GetReplyCountOk

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetReplyCountOk() (*int32, bool)`

GetReplyCountOk returns a tuple with the ReplyCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReplyCount

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) SetReplyCount(v int32)`

SetReplyCount sets ReplyCount field to given value.


### GetReplyUsers

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetReplyUsers() []string`

GetReplyUsers returns the ReplyUsers field if non-nil, zero value otherwise.

### GetReplyUsersOk

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetReplyUsersOk() (*[]string, bool)`

GetReplyUsersOk returns a tuple with the ReplyUsers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReplyUsers

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) SetReplyUsers(v []string)`

SetReplyUsers sets ReplyUsers field to given value.

### HasReplyUsers

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) HasReplyUsers() bool`

HasReplyUsers returns a boolean if a field has been set.

### GetReplyUsersCount

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetReplyUsersCount() int32`

GetReplyUsersCount returns the ReplyUsersCount field if non-nil, zero value otherwise.

### GetReplyUsersCountOk

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetReplyUsersCountOk() (*int32, bool)`

GetReplyUsersCountOk returns a tuple with the ReplyUsersCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReplyUsersCount

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) SetReplyUsersCount(v int32)`

SetReplyUsersCount sets ReplyUsersCount field to given value.

### HasReplyUsersCount

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) HasReplyUsersCount() bool`

HasReplyUsersCount returns a boolean if a field has been set.

### GetSourceTeam

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetSourceTeam() string`

GetSourceTeam returns the SourceTeam field if non-nil, zero value otherwise.

### GetSourceTeamOk

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetSourceTeamOk() (*string, bool)`

GetSourceTeamOk returns a tuple with the SourceTeam field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSourceTeam

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) SetSourceTeam(v string)`

SetSourceTeam sets SourceTeam field to given value.

### HasSourceTeam

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) HasSourceTeam() bool`

HasSourceTeam returns a boolean if a field has been set.

### GetSubscribed

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetSubscribed() bool`

GetSubscribed returns the Subscribed field if non-nil, zero value otherwise.

### GetSubscribedOk

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetSubscribedOk() (*bool, bool)`

GetSubscribedOk returns a tuple with the Subscribed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubscribed

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) SetSubscribed(v bool)`

SetSubscribed sets Subscribed field to given value.


### GetTeam

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetTeam() string`

GetTeam returns the Team field if non-nil, zero value otherwise.

### GetTeamOk

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetTeamOk() (*string, bool)`

GetTeamOk returns a tuple with the Team field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTeam

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) SetTeam(v string)`

SetTeam sets Team field to given value.

### HasTeam

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) HasTeam() bool`

HasTeam returns a boolean if a field has been set.

### GetText

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetText() string`

GetText returns the Text field if non-nil, zero value otherwise.

### GetTextOk

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetTextOk() (*string, bool)`

GetTextOk returns a tuple with the Text field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetText

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) SetText(v string)`

SetText sets Text field to given value.


### GetThreadTs

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetThreadTs() string`

GetThreadTs returns the ThreadTs field if non-nil, zero value otherwise.

### GetThreadTsOk

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetThreadTsOk() (*string, bool)`

GetThreadTsOk returns a tuple with the ThreadTs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetThreadTs

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) SetThreadTs(v string)`

SetThreadTs sets ThreadTs field to given value.


### GetTs

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetTs() string`

GetTs returns the Ts field if non-nil, zero value otherwise.

### GetTsOk

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetTsOk() (*string, bool)`

GetTsOk returns a tuple with the Ts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTs

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) SetTs(v string)`

SetTs sets Ts field to given value.


### GetType

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) SetType(v string)`

SetType sets Type field to given value.


### GetUnreadCount

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetUnreadCount() int32`

GetUnreadCount returns the UnreadCount field if non-nil, zero value otherwise.

### GetUnreadCountOk

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetUnreadCountOk() (*int32, bool)`

GetUnreadCountOk returns a tuple with the UnreadCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUnreadCount

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) SetUnreadCount(v int32)`

SetUnreadCount sets UnreadCount field to given value.

### HasUnreadCount

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) HasUnreadCount() bool`

HasUnreadCount returns a boolean if a field has been set.

### GetUser

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetUser() string`

GetUser returns the User field if non-nil, zero value otherwise.

### GetUserOk

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetUserOk() (*string, bool)`

GetUserOk returns a tuple with the User field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUser

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) SetUser(v string)`

SetUser sets User field to given value.


### GetUserProfile

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetUserProfile() ObjsUserProfileShort`

GetUserProfile returns the UserProfile field if non-nil, zero value otherwise.

### GetUserProfileOk

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetUserProfileOk() (*ObjsUserProfileShort, bool)`

GetUserProfileOk returns a tuple with the UserProfile field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserProfile

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) SetUserProfile(v ObjsUserProfileShort)`

SetUserProfile sets UserProfile field to given value.

### HasUserProfile

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) HasUserProfile() bool`

HasUserProfile returns a boolean if a field has been set.

### GetUserTeam

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetUserTeam() string`

GetUserTeam returns the UserTeam field if non-nil, zero value otherwise.

### GetUserTeamOk

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) GetUserTeamOk() (*string, bool)`

GetUserTeamOk returns a tuple with the UserTeam field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserTeam

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) SetUserTeam(v string)`

SetUserTeam sets UserTeam field to given value.

### HasUserTeam

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf) HasUserTeam() bool`

HasUserTeam returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


