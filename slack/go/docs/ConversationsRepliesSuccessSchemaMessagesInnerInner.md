# ConversationsRepliesSuccessSchemaMessagesInnerInner

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
**IsStarred** | Pointer to **bool** |  | [optional] 
**ParentUserId** | **string** |  | 

## Methods

### NewConversationsRepliesSuccessSchemaMessagesInnerInner

`func NewConversationsRepliesSuccessSchemaMessagesInnerInner(replyCount int32, subscribed bool, text string, threadTs string, ts string, type_ string, user string, parentUserId string, ) *ConversationsRepliesSuccessSchemaMessagesInnerInner`

NewConversationsRepliesSuccessSchemaMessagesInnerInner instantiates a new ConversationsRepliesSuccessSchemaMessagesInnerInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConversationsRepliesSuccessSchemaMessagesInnerInnerWithDefaults

`func NewConversationsRepliesSuccessSchemaMessagesInnerInnerWithDefaults() *ConversationsRepliesSuccessSchemaMessagesInnerInner`

NewConversationsRepliesSuccessSchemaMessagesInnerInnerWithDefaults instantiates a new ConversationsRepliesSuccessSchemaMessagesInnerInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLastRead

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) GetLastRead() string`

GetLastRead returns the LastRead field if non-nil, zero value otherwise.

### GetLastReadOk

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) GetLastReadOk() (*string, bool)`

GetLastReadOk returns a tuple with the LastRead field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastRead

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) SetLastRead(v string)`

SetLastRead sets LastRead field to given value.

### HasLastRead

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) HasLastRead() bool`

HasLastRead returns a boolean if a field has been set.

### GetLatestReply

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) GetLatestReply() string`

GetLatestReply returns the LatestReply field if non-nil, zero value otherwise.

### GetLatestReplyOk

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) GetLatestReplyOk() (*string, bool)`

GetLatestReplyOk returns a tuple with the LatestReply field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLatestReply

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) SetLatestReply(v string)`

SetLatestReply sets LatestReply field to given value.

### HasLatestReply

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) HasLatestReply() bool`

HasLatestReply returns a boolean if a field has been set.

### GetReplyCount

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) GetReplyCount() int32`

GetReplyCount returns the ReplyCount field if non-nil, zero value otherwise.

### GetReplyCountOk

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) GetReplyCountOk() (*int32, bool)`

GetReplyCountOk returns a tuple with the ReplyCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReplyCount

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) SetReplyCount(v int32)`

SetReplyCount sets ReplyCount field to given value.


### GetReplyUsers

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) GetReplyUsers() []string`

GetReplyUsers returns the ReplyUsers field if non-nil, zero value otherwise.

### GetReplyUsersOk

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) GetReplyUsersOk() (*[]string, bool)`

GetReplyUsersOk returns a tuple with the ReplyUsers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReplyUsers

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) SetReplyUsers(v []string)`

SetReplyUsers sets ReplyUsers field to given value.

### HasReplyUsers

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) HasReplyUsers() bool`

HasReplyUsers returns a boolean if a field has been set.

### GetReplyUsersCount

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) GetReplyUsersCount() int32`

GetReplyUsersCount returns the ReplyUsersCount field if non-nil, zero value otherwise.

### GetReplyUsersCountOk

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) GetReplyUsersCountOk() (*int32, bool)`

GetReplyUsersCountOk returns a tuple with the ReplyUsersCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReplyUsersCount

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) SetReplyUsersCount(v int32)`

SetReplyUsersCount sets ReplyUsersCount field to given value.

### HasReplyUsersCount

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) HasReplyUsersCount() bool`

HasReplyUsersCount returns a boolean if a field has been set.

### GetSourceTeam

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) GetSourceTeam() string`

GetSourceTeam returns the SourceTeam field if non-nil, zero value otherwise.

### GetSourceTeamOk

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) GetSourceTeamOk() (*string, bool)`

GetSourceTeamOk returns a tuple with the SourceTeam field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSourceTeam

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) SetSourceTeam(v string)`

SetSourceTeam sets SourceTeam field to given value.

### HasSourceTeam

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) HasSourceTeam() bool`

HasSourceTeam returns a boolean if a field has been set.

### GetSubscribed

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) GetSubscribed() bool`

GetSubscribed returns the Subscribed field if non-nil, zero value otherwise.

### GetSubscribedOk

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) GetSubscribedOk() (*bool, bool)`

GetSubscribedOk returns a tuple with the Subscribed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubscribed

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) SetSubscribed(v bool)`

SetSubscribed sets Subscribed field to given value.


### GetTeam

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) GetTeam() string`

GetTeam returns the Team field if non-nil, zero value otherwise.

### GetTeamOk

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) GetTeamOk() (*string, bool)`

GetTeamOk returns a tuple with the Team field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTeam

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) SetTeam(v string)`

SetTeam sets Team field to given value.

### HasTeam

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) HasTeam() bool`

HasTeam returns a boolean if a field has been set.

### GetText

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) GetText() string`

GetText returns the Text field if non-nil, zero value otherwise.

### GetTextOk

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) GetTextOk() (*string, bool)`

GetTextOk returns a tuple with the Text field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetText

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) SetText(v string)`

SetText sets Text field to given value.


### GetThreadTs

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) GetThreadTs() string`

GetThreadTs returns the ThreadTs field if non-nil, zero value otherwise.

### GetThreadTsOk

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) GetThreadTsOk() (*string, bool)`

GetThreadTsOk returns a tuple with the ThreadTs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetThreadTs

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) SetThreadTs(v string)`

SetThreadTs sets ThreadTs field to given value.


### GetTs

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) GetTs() string`

GetTs returns the Ts field if non-nil, zero value otherwise.

### GetTsOk

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) GetTsOk() (*string, bool)`

GetTsOk returns a tuple with the Ts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTs

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) SetTs(v string)`

SetTs sets Ts field to given value.


### GetType

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) SetType(v string)`

SetType sets Type field to given value.


### GetUnreadCount

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) GetUnreadCount() int32`

GetUnreadCount returns the UnreadCount field if non-nil, zero value otherwise.

### GetUnreadCountOk

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) GetUnreadCountOk() (*int32, bool)`

GetUnreadCountOk returns a tuple with the UnreadCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUnreadCount

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) SetUnreadCount(v int32)`

SetUnreadCount sets UnreadCount field to given value.

### HasUnreadCount

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) HasUnreadCount() bool`

HasUnreadCount returns a boolean if a field has been set.

### GetUser

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) GetUser() string`

GetUser returns the User field if non-nil, zero value otherwise.

### GetUserOk

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) GetUserOk() (*string, bool)`

GetUserOk returns a tuple with the User field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUser

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) SetUser(v string)`

SetUser sets User field to given value.


### GetUserProfile

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) GetUserProfile() ObjsUserProfileShort`

GetUserProfile returns the UserProfile field if non-nil, zero value otherwise.

### GetUserProfileOk

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) GetUserProfileOk() (*ObjsUserProfileShort, bool)`

GetUserProfileOk returns a tuple with the UserProfile field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserProfile

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) SetUserProfile(v ObjsUserProfileShort)`

SetUserProfile sets UserProfile field to given value.

### HasUserProfile

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) HasUserProfile() bool`

HasUserProfile returns a boolean if a field has been set.

### GetUserTeam

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) GetUserTeam() string`

GetUserTeam returns the UserTeam field if non-nil, zero value otherwise.

### GetUserTeamOk

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) GetUserTeamOk() (*string, bool)`

GetUserTeamOk returns a tuple with the UserTeam field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserTeam

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) SetUserTeam(v string)`

SetUserTeam sets UserTeam field to given value.

### HasUserTeam

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) HasUserTeam() bool`

HasUserTeam returns a boolean if a field has been set.

### GetIsStarred

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) GetIsStarred() bool`

GetIsStarred returns the IsStarred field if non-nil, zero value otherwise.

### GetIsStarredOk

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) GetIsStarredOk() (*bool, bool)`

GetIsStarredOk returns a tuple with the IsStarred field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsStarred

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) SetIsStarred(v bool)`

SetIsStarred sets IsStarred field to given value.

### HasIsStarred

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) HasIsStarred() bool`

HasIsStarred returns a boolean if a field has been set.

### GetParentUserId

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) GetParentUserId() string`

GetParentUserId returns the ParentUserId field if non-nil, zero value otherwise.

### GetParentUserIdOk

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) GetParentUserIdOk() (*string, bool)`

GetParentUserIdOk returns a tuple with the ParentUserId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParentUserId

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInner) SetParentUserId(v string)`

SetParentUserId sets ParentUserId field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


