# ConversationsHistorySuccessSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ChannelActionsCount** | **int32** |  | 
**ChannelActionsTs** | [**[]ConversationsHistorySuccessSchemaChannelActionsTsInner**](ConversationsHistorySuccessSchemaChannelActionsTsInner.md) |  | 
**HasMore** | **bool** |  | 
**Messages** | [**[]ObjsMessage**](ObjsMessage.md) |  | 
**Ok** | [**DefsOkTrue**](DefsOkTrue.md) |  | 
**PinCount** | **int32** |  | 

## Methods

### NewConversationsHistorySuccessSchema

`func NewConversationsHistorySuccessSchema(channelActionsCount int32, channelActionsTs []ConversationsHistorySuccessSchemaChannelActionsTsInner, hasMore bool, messages []ObjsMessage, ok DefsOkTrue, pinCount int32, ) *ConversationsHistorySuccessSchema`

NewConversationsHistorySuccessSchema instantiates a new ConversationsHistorySuccessSchema object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConversationsHistorySuccessSchemaWithDefaults

`func NewConversationsHistorySuccessSchemaWithDefaults() *ConversationsHistorySuccessSchema`

NewConversationsHistorySuccessSchemaWithDefaults instantiates a new ConversationsHistorySuccessSchema object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetChannelActionsCount

`func (o *ConversationsHistorySuccessSchema) GetChannelActionsCount() int32`

GetChannelActionsCount returns the ChannelActionsCount field if non-nil, zero value otherwise.

### GetChannelActionsCountOk

`func (o *ConversationsHistorySuccessSchema) GetChannelActionsCountOk() (*int32, bool)`

GetChannelActionsCountOk returns a tuple with the ChannelActionsCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChannelActionsCount

`func (o *ConversationsHistorySuccessSchema) SetChannelActionsCount(v int32)`

SetChannelActionsCount sets ChannelActionsCount field to given value.


### GetChannelActionsTs

`func (o *ConversationsHistorySuccessSchema) GetChannelActionsTs() []ConversationsHistorySuccessSchemaChannelActionsTsInner`

GetChannelActionsTs returns the ChannelActionsTs field if non-nil, zero value otherwise.

### GetChannelActionsTsOk

`func (o *ConversationsHistorySuccessSchema) GetChannelActionsTsOk() (*[]ConversationsHistorySuccessSchemaChannelActionsTsInner, bool)`

GetChannelActionsTsOk returns a tuple with the ChannelActionsTs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChannelActionsTs

`func (o *ConversationsHistorySuccessSchema) SetChannelActionsTs(v []ConversationsHistorySuccessSchemaChannelActionsTsInner)`

SetChannelActionsTs sets ChannelActionsTs field to given value.


### GetHasMore

`func (o *ConversationsHistorySuccessSchema) GetHasMore() bool`

GetHasMore returns the HasMore field if non-nil, zero value otherwise.

### GetHasMoreOk

`func (o *ConversationsHistorySuccessSchema) GetHasMoreOk() (*bool, bool)`

GetHasMoreOk returns a tuple with the HasMore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasMore

`func (o *ConversationsHistorySuccessSchema) SetHasMore(v bool)`

SetHasMore sets HasMore field to given value.


### GetMessages

`func (o *ConversationsHistorySuccessSchema) GetMessages() []ObjsMessage`

GetMessages returns the Messages field if non-nil, zero value otherwise.

### GetMessagesOk

`func (o *ConversationsHistorySuccessSchema) GetMessagesOk() (*[]ObjsMessage, bool)`

GetMessagesOk returns a tuple with the Messages field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessages

`func (o *ConversationsHistorySuccessSchema) SetMessages(v []ObjsMessage)`

SetMessages sets Messages field to given value.


### GetOk

`func (o *ConversationsHistorySuccessSchema) GetOk() DefsOkTrue`

GetOk returns the Ok field if non-nil, zero value otherwise.

### GetOkOk

`func (o *ConversationsHistorySuccessSchema) GetOkOk() (*DefsOkTrue, bool)`

GetOkOk returns a tuple with the Ok field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOk

`func (o *ConversationsHistorySuccessSchema) SetOk(v DefsOkTrue)`

SetOk sets Ok field to given value.


### GetPinCount

`func (o *ConversationsHistorySuccessSchema) GetPinCount() int32`

GetPinCount returns the PinCount field if non-nil, zero value otherwise.

### GetPinCountOk

`func (o *ConversationsHistorySuccessSchema) GetPinCountOk() (*int32, bool)`

GetPinCountOk returns a tuple with the PinCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPinCount

`func (o *ConversationsHistorySuccessSchema) SetPinCount(v int32)`

SetPinCount sets PinCount field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


