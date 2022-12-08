# ConversationsOpenSuccessSchemaChannelInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Created** | Pointer to **string** |  | [optional] 
**Id** | **string** |  | 
**IsIm** | Pointer to **bool** |  | [optional] 
**IsOpen** | Pointer to **bool** |  | [optional] 
**LastRead** | Pointer to **string** |  | [optional] 
**Latest** | Pointer to [**ObjsMessage**](ObjsMessage.md) |  | [optional] 
**UnreadCount** | Pointer to **float32** |  | [optional] 
**UnreadCountDisplay** | Pointer to **float32** |  | [optional] 
**User** | Pointer to **string** |  | [optional] 

## Methods

### NewConversationsOpenSuccessSchemaChannelInner

`func NewConversationsOpenSuccessSchemaChannelInner(id string, ) *ConversationsOpenSuccessSchemaChannelInner`

NewConversationsOpenSuccessSchemaChannelInner instantiates a new ConversationsOpenSuccessSchemaChannelInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConversationsOpenSuccessSchemaChannelInnerWithDefaults

`func NewConversationsOpenSuccessSchemaChannelInnerWithDefaults() *ConversationsOpenSuccessSchemaChannelInner`

NewConversationsOpenSuccessSchemaChannelInnerWithDefaults instantiates a new ConversationsOpenSuccessSchemaChannelInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCreated

`func (o *ConversationsOpenSuccessSchemaChannelInner) GetCreated() string`

GetCreated returns the Created field if non-nil, zero value otherwise.

### GetCreatedOk

`func (o *ConversationsOpenSuccessSchemaChannelInner) GetCreatedOk() (*string, bool)`

GetCreatedOk returns a tuple with the Created field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreated

`func (o *ConversationsOpenSuccessSchemaChannelInner) SetCreated(v string)`

SetCreated sets Created field to given value.

### HasCreated

`func (o *ConversationsOpenSuccessSchemaChannelInner) HasCreated() bool`

HasCreated returns a boolean if a field has been set.

### GetId

`func (o *ConversationsOpenSuccessSchemaChannelInner) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ConversationsOpenSuccessSchemaChannelInner) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ConversationsOpenSuccessSchemaChannelInner) SetId(v string)`

SetId sets Id field to given value.


### GetIsIm

`func (o *ConversationsOpenSuccessSchemaChannelInner) GetIsIm() bool`

GetIsIm returns the IsIm field if non-nil, zero value otherwise.

### GetIsImOk

`func (o *ConversationsOpenSuccessSchemaChannelInner) GetIsImOk() (*bool, bool)`

GetIsImOk returns a tuple with the IsIm field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsIm

`func (o *ConversationsOpenSuccessSchemaChannelInner) SetIsIm(v bool)`

SetIsIm sets IsIm field to given value.

### HasIsIm

`func (o *ConversationsOpenSuccessSchemaChannelInner) HasIsIm() bool`

HasIsIm returns a boolean if a field has been set.

### GetIsOpen

`func (o *ConversationsOpenSuccessSchemaChannelInner) GetIsOpen() bool`

GetIsOpen returns the IsOpen field if non-nil, zero value otherwise.

### GetIsOpenOk

`func (o *ConversationsOpenSuccessSchemaChannelInner) GetIsOpenOk() (*bool, bool)`

GetIsOpenOk returns a tuple with the IsOpen field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsOpen

`func (o *ConversationsOpenSuccessSchemaChannelInner) SetIsOpen(v bool)`

SetIsOpen sets IsOpen field to given value.

### HasIsOpen

`func (o *ConversationsOpenSuccessSchemaChannelInner) HasIsOpen() bool`

HasIsOpen returns a boolean if a field has been set.

### GetLastRead

`func (o *ConversationsOpenSuccessSchemaChannelInner) GetLastRead() string`

GetLastRead returns the LastRead field if non-nil, zero value otherwise.

### GetLastReadOk

`func (o *ConversationsOpenSuccessSchemaChannelInner) GetLastReadOk() (*string, bool)`

GetLastReadOk returns a tuple with the LastRead field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastRead

`func (o *ConversationsOpenSuccessSchemaChannelInner) SetLastRead(v string)`

SetLastRead sets LastRead field to given value.

### HasLastRead

`func (o *ConversationsOpenSuccessSchemaChannelInner) HasLastRead() bool`

HasLastRead returns a boolean if a field has been set.

### GetLatest

`func (o *ConversationsOpenSuccessSchemaChannelInner) GetLatest() ObjsMessage`

GetLatest returns the Latest field if non-nil, zero value otherwise.

### GetLatestOk

`func (o *ConversationsOpenSuccessSchemaChannelInner) GetLatestOk() (*ObjsMessage, bool)`

GetLatestOk returns a tuple with the Latest field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLatest

`func (o *ConversationsOpenSuccessSchemaChannelInner) SetLatest(v ObjsMessage)`

SetLatest sets Latest field to given value.

### HasLatest

`func (o *ConversationsOpenSuccessSchemaChannelInner) HasLatest() bool`

HasLatest returns a boolean if a field has been set.

### GetUnreadCount

`func (o *ConversationsOpenSuccessSchemaChannelInner) GetUnreadCount() float32`

GetUnreadCount returns the UnreadCount field if non-nil, zero value otherwise.

### GetUnreadCountOk

`func (o *ConversationsOpenSuccessSchemaChannelInner) GetUnreadCountOk() (*float32, bool)`

GetUnreadCountOk returns a tuple with the UnreadCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUnreadCount

`func (o *ConversationsOpenSuccessSchemaChannelInner) SetUnreadCount(v float32)`

SetUnreadCount sets UnreadCount field to given value.

### HasUnreadCount

`func (o *ConversationsOpenSuccessSchemaChannelInner) HasUnreadCount() bool`

HasUnreadCount returns a boolean if a field has been set.

### GetUnreadCountDisplay

`func (o *ConversationsOpenSuccessSchemaChannelInner) GetUnreadCountDisplay() float32`

GetUnreadCountDisplay returns the UnreadCountDisplay field if non-nil, zero value otherwise.

### GetUnreadCountDisplayOk

`func (o *ConversationsOpenSuccessSchemaChannelInner) GetUnreadCountDisplayOk() (*float32, bool)`

GetUnreadCountDisplayOk returns a tuple with the UnreadCountDisplay field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUnreadCountDisplay

`func (o *ConversationsOpenSuccessSchemaChannelInner) SetUnreadCountDisplay(v float32)`

SetUnreadCountDisplay sets UnreadCountDisplay field to given value.

### HasUnreadCountDisplay

`func (o *ConversationsOpenSuccessSchemaChannelInner) HasUnreadCountDisplay() bool`

HasUnreadCountDisplay returns a boolean if a field has been set.

### GetUser

`func (o *ConversationsOpenSuccessSchemaChannelInner) GetUser() string`

GetUser returns the User field if non-nil, zero value otherwise.

### GetUserOk

`func (o *ConversationsOpenSuccessSchemaChannelInner) GetUserOk() (*string, bool)`

GetUserOk returns a tuple with the User field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUser

`func (o *ConversationsOpenSuccessSchemaChannelInner) SetUser(v string)`

SetUser sets User field to given value.

### HasUser

`func (o *ConversationsOpenSuccessSchemaChannelInner) HasUser() bool`

HasUser returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


