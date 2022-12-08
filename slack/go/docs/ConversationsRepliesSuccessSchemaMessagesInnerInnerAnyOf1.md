# ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IsStarred** | Pointer to **bool** |  | [optional] 
**ParentUserId** | **string** |  | 
**SourceTeam** | Pointer to **string** |  | [optional] 
**Team** | Pointer to **string** |  | [optional] 
**Text** | **string** |  | 
**ThreadTs** | **string** |  | 
**Ts** | **string** |  | 
**Type** | **string** |  | 
**User** | **string** |  | 
**UserProfile** | Pointer to [**ObjsUserProfileShort**](ObjsUserProfileShort.md) |  | [optional] 
**UserTeam** | Pointer to **string** |  | [optional] 

## Methods

### NewConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1

`func NewConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1(parentUserId string, text string, threadTs string, ts string, type_ string, user string, ) *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1`

NewConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1 instantiates a new ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1WithDefaults

`func NewConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1WithDefaults() *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1`

NewConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1WithDefaults instantiates a new ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIsStarred

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1) GetIsStarred() bool`

GetIsStarred returns the IsStarred field if non-nil, zero value otherwise.

### GetIsStarredOk

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1) GetIsStarredOk() (*bool, bool)`

GetIsStarredOk returns a tuple with the IsStarred field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsStarred

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1) SetIsStarred(v bool)`

SetIsStarred sets IsStarred field to given value.

### HasIsStarred

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1) HasIsStarred() bool`

HasIsStarred returns a boolean if a field has been set.

### GetParentUserId

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1) GetParentUserId() string`

GetParentUserId returns the ParentUserId field if non-nil, zero value otherwise.

### GetParentUserIdOk

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1) GetParentUserIdOk() (*string, bool)`

GetParentUserIdOk returns a tuple with the ParentUserId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParentUserId

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1) SetParentUserId(v string)`

SetParentUserId sets ParentUserId field to given value.


### GetSourceTeam

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1) GetSourceTeam() string`

GetSourceTeam returns the SourceTeam field if non-nil, zero value otherwise.

### GetSourceTeamOk

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1) GetSourceTeamOk() (*string, bool)`

GetSourceTeamOk returns a tuple with the SourceTeam field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSourceTeam

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1) SetSourceTeam(v string)`

SetSourceTeam sets SourceTeam field to given value.

### HasSourceTeam

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1) HasSourceTeam() bool`

HasSourceTeam returns a boolean if a field has been set.

### GetTeam

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1) GetTeam() string`

GetTeam returns the Team field if non-nil, zero value otherwise.

### GetTeamOk

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1) GetTeamOk() (*string, bool)`

GetTeamOk returns a tuple with the Team field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTeam

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1) SetTeam(v string)`

SetTeam sets Team field to given value.

### HasTeam

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1) HasTeam() bool`

HasTeam returns a boolean if a field has been set.

### GetText

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1) GetText() string`

GetText returns the Text field if non-nil, zero value otherwise.

### GetTextOk

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1) GetTextOk() (*string, bool)`

GetTextOk returns a tuple with the Text field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetText

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1) SetText(v string)`

SetText sets Text field to given value.


### GetThreadTs

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1) GetThreadTs() string`

GetThreadTs returns the ThreadTs field if non-nil, zero value otherwise.

### GetThreadTsOk

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1) GetThreadTsOk() (*string, bool)`

GetThreadTsOk returns a tuple with the ThreadTs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetThreadTs

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1) SetThreadTs(v string)`

SetThreadTs sets ThreadTs field to given value.


### GetTs

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1) GetTs() string`

GetTs returns the Ts field if non-nil, zero value otherwise.

### GetTsOk

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1) GetTsOk() (*string, bool)`

GetTsOk returns a tuple with the Ts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTs

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1) SetTs(v string)`

SetTs sets Ts field to given value.


### GetType

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1) SetType(v string)`

SetType sets Type field to given value.


### GetUser

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1) GetUser() string`

GetUser returns the User field if non-nil, zero value otherwise.

### GetUserOk

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1) GetUserOk() (*string, bool)`

GetUserOk returns a tuple with the User field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUser

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1) SetUser(v string)`

SetUser sets User field to given value.


### GetUserProfile

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1) GetUserProfile() ObjsUserProfileShort`

GetUserProfile returns the UserProfile field if non-nil, zero value otherwise.

### GetUserProfileOk

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1) GetUserProfileOk() (*ObjsUserProfileShort, bool)`

GetUserProfileOk returns a tuple with the UserProfile field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserProfile

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1) SetUserProfile(v ObjsUserProfileShort)`

SetUserProfile sets UserProfile field to given value.

### HasUserProfile

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1) HasUserProfile() bool`

HasUserProfile returns a boolean if a field has been set.

### GetUserTeam

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1) GetUserTeam() string`

GetUserTeam returns the UserTeam field if non-nil, zero value otherwise.

### GetUserTeamOk

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1) GetUserTeamOk() (*string, bool)`

GetUserTeamOk returns a tuple with the UserTeam field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserTeam

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1) SetUserTeam(v string)`

SetUserTeam sets UserTeam field to given value.

### HasUserTeam

`func (o *ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1) HasUserTeam() bool`

HasUserTeam returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


