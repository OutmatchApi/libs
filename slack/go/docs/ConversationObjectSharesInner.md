# ConversationObjectSharesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AcceptedUser** | Pointer to **string** |  | [optional] 
**IsActive** | **bool** |  | 
**Team** | [**ObjsTeam**](ObjsTeam.md) |  | 
**User** | **string** |  | 

## Methods

### NewConversationObjectSharesInner

`func NewConversationObjectSharesInner(isActive bool, team ObjsTeam, user string, ) *ConversationObjectSharesInner`

NewConversationObjectSharesInner instantiates a new ConversationObjectSharesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConversationObjectSharesInnerWithDefaults

`func NewConversationObjectSharesInnerWithDefaults() *ConversationObjectSharesInner`

NewConversationObjectSharesInnerWithDefaults instantiates a new ConversationObjectSharesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAcceptedUser

`func (o *ConversationObjectSharesInner) GetAcceptedUser() string`

GetAcceptedUser returns the AcceptedUser field if non-nil, zero value otherwise.

### GetAcceptedUserOk

`func (o *ConversationObjectSharesInner) GetAcceptedUserOk() (*string, bool)`

GetAcceptedUserOk returns a tuple with the AcceptedUser field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAcceptedUser

`func (o *ConversationObjectSharesInner) SetAcceptedUser(v string)`

SetAcceptedUser sets AcceptedUser field to given value.

### HasAcceptedUser

`func (o *ConversationObjectSharesInner) HasAcceptedUser() bool`

HasAcceptedUser returns a boolean if a field has been set.

### GetIsActive

`func (o *ConversationObjectSharesInner) GetIsActive() bool`

GetIsActive returns the IsActive field if non-nil, zero value otherwise.

### GetIsActiveOk

`func (o *ConversationObjectSharesInner) GetIsActiveOk() (*bool, bool)`

GetIsActiveOk returns a tuple with the IsActive field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsActive

`func (o *ConversationObjectSharesInner) SetIsActive(v bool)`

SetIsActive sets IsActive field to given value.


### GetTeam

`func (o *ConversationObjectSharesInner) GetTeam() ObjsTeam`

GetTeam returns the Team field if non-nil, zero value otherwise.

### GetTeamOk

`func (o *ConversationObjectSharesInner) GetTeamOk() (*ObjsTeam, bool)`

GetTeamOk returns a tuple with the Team field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTeam

`func (o *ConversationObjectSharesInner) SetTeam(v ObjsTeam)`

SetTeam sets Team field to given value.


### GetUser

`func (o *ConversationObjectSharesInner) GetUser() string`

GetUser returns the User field if non-nil, zero value otherwise.

### GetUserOk

`func (o *ConversationObjectSharesInner) GetUserOk() (*string, bool)`

GetUserOk returns a tuple with the User field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUser

`func (o *ConversationObjectSharesInner) SetUser(v string)`

SetUser sets User field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


