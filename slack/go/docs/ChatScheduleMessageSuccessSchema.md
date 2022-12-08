# ChatScheduleMessageSuccessSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Channel** | **string** |  | 
**Message** | [**ChatScheduleMessageSuccessSchemaMessage**](ChatScheduleMessageSuccessSchemaMessage.md) |  | 
**Ok** | [**DefsOkTrue**](DefsOkTrue.md) |  | 
**PostAt** | **int32** |  | 
**ScheduledMessageId** | **string** |  | 

## Methods

### NewChatScheduleMessageSuccessSchema

`func NewChatScheduleMessageSuccessSchema(channel string, message ChatScheduleMessageSuccessSchemaMessage, ok DefsOkTrue, postAt int32, scheduledMessageId string, ) *ChatScheduleMessageSuccessSchema`

NewChatScheduleMessageSuccessSchema instantiates a new ChatScheduleMessageSuccessSchema object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewChatScheduleMessageSuccessSchemaWithDefaults

`func NewChatScheduleMessageSuccessSchemaWithDefaults() *ChatScheduleMessageSuccessSchema`

NewChatScheduleMessageSuccessSchemaWithDefaults instantiates a new ChatScheduleMessageSuccessSchema object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetChannel

`func (o *ChatScheduleMessageSuccessSchema) GetChannel() string`

GetChannel returns the Channel field if non-nil, zero value otherwise.

### GetChannelOk

`func (o *ChatScheduleMessageSuccessSchema) GetChannelOk() (*string, bool)`

GetChannelOk returns a tuple with the Channel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChannel

`func (o *ChatScheduleMessageSuccessSchema) SetChannel(v string)`

SetChannel sets Channel field to given value.


### GetMessage

`func (o *ChatScheduleMessageSuccessSchema) GetMessage() ChatScheduleMessageSuccessSchemaMessage`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *ChatScheduleMessageSuccessSchema) GetMessageOk() (*ChatScheduleMessageSuccessSchemaMessage, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *ChatScheduleMessageSuccessSchema) SetMessage(v ChatScheduleMessageSuccessSchemaMessage)`

SetMessage sets Message field to given value.


### GetOk

`func (o *ChatScheduleMessageSuccessSchema) GetOk() DefsOkTrue`

GetOk returns the Ok field if non-nil, zero value otherwise.

### GetOkOk

`func (o *ChatScheduleMessageSuccessSchema) GetOkOk() (*DefsOkTrue, bool)`

GetOkOk returns a tuple with the Ok field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOk

`func (o *ChatScheduleMessageSuccessSchema) SetOk(v DefsOkTrue)`

SetOk sets Ok field to given value.


### GetPostAt

`func (o *ChatScheduleMessageSuccessSchema) GetPostAt() int32`

GetPostAt returns the PostAt field if non-nil, zero value otherwise.

### GetPostAtOk

`func (o *ChatScheduleMessageSuccessSchema) GetPostAtOk() (*int32, bool)`

GetPostAtOk returns a tuple with the PostAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPostAt

`func (o *ChatScheduleMessageSuccessSchema) SetPostAt(v int32)`

SetPostAt sets PostAt field to given value.


### GetScheduledMessageId

`func (o *ChatScheduleMessageSuccessSchema) GetScheduledMessageId() string`

GetScheduledMessageId returns the ScheduledMessageId field if non-nil, zero value otherwise.

### GetScheduledMessageIdOk

`func (o *ChatScheduleMessageSuccessSchema) GetScheduledMessageIdOk() (*string, bool)`

GetScheduledMessageIdOk returns a tuple with the ScheduledMessageId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScheduledMessageId

`func (o *ChatScheduleMessageSuccessSchema) SetScheduledMessageId(v string)`

SetScheduledMessageId sets ScheduledMessageId field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


