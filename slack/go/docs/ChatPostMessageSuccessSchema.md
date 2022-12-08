# ChatPostMessageSuccessSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Channel** | **string** |  | 
**Message** | [**ObjsMessage**](ObjsMessage.md) |  | 
**Ok** | [**DefsOkTrue**](DefsOkTrue.md) |  | 
**Ts** | **string** |  | 

## Methods

### NewChatPostMessageSuccessSchema

`func NewChatPostMessageSuccessSchema(channel string, message ObjsMessage, ok DefsOkTrue, ts string, ) *ChatPostMessageSuccessSchema`

NewChatPostMessageSuccessSchema instantiates a new ChatPostMessageSuccessSchema object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewChatPostMessageSuccessSchemaWithDefaults

`func NewChatPostMessageSuccessSchemaWithDefaults() *ChatPostMessageSuccessSchema`

NewChatPostMessageSuccessSchemaWithDefaults instantiates a new ChatPostMessageSuccessSchema object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetChannel

`func (o *ChatPostMessageSuccessSchema) GetChannel() string`

GetChannel returns the Channel field if non-nil, zero value otherwise.

### GetChannelOk

`func (o *ChatPostMessageSuccessSchema) GetChannelOk() (*string, bool)`

GetChannelOk returns a tuple with the Channel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChannel

`func (o *ChatPostMessageSuccessSchema) SetChannel(v string)`

SetChannel sets Channel field to given value.


### GetMessage

`func (o *ChatPostMessageSuccessSchema) GetMessage() ObjsMessage`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *ChatPostMessageSuccessSchema) GetMessageOk() (*ObjsMessage, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *ChatPostMessageSuccessSchema) SetMessage(v ObjsMessage)`

SetMessage sets Message field to given value.


### GetOk

`func (o *ChatPostMessageSuccessSchema) GetOk() DefsOkTrue`

GetOk returns the Ok field if non-nil, zero value otherwise.

### GetOkOk

`func (o *ChatPostMessageSuccessSchema) GetOkOk() (*DefsOkTrue, bool)`

GetOkOk returns a tuple with the Ok field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOk

`func (o *ChatPostMessageSuccessSchema) SetOk(v DefsOkTrue)`

SetOk sets Ok field to given value.


### GetTs

`func (o *ChatPostMessageSuccessSchema) GetTs() string`

GetTs returns the Ts field if non-nil, zero value otherwise.

### GetTsOk

`func (o *ChatPostMessageSuccessSchema) GetTsOk() (*string, bool)`

GetTsOk returns a tuple with the Ts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTs

`func (o *ChatPostMessageSuccessSchema) SetTs(v string)`

SetTs sets Ts field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


