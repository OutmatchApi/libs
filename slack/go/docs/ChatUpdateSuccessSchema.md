# ChatUpdateSuccessSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Channel** | **string** |  | 
**Message** | [**MessageObject**](MessageObject.md) |  | 
**Ok** | [**DefsOkTrue**](DefsOkTrue.md) |  | 
**Text** | **string** |  | 
**Ts** | **string** |  | 

## Methods

### NewChatUpdateSuccessSchema

`func NewChatUpdateSuccessSchema(channel string, message MessageObject, ok DefsOkTrue, text string, ts string, ) *ChatUpdateSuccessSchema`

NewChatUpdateSuccessSchema instantiates a new ChatUpdateSuccessSchema object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewChatUpdateSuccessSchemaWithDefaults

`func NewChatUpdateSuccessSchemaWithDefaults() *ChatUpdateSuccessSchema`

NewChatUpdateSuccessSchemaWithDefaults instantiates a new ChatUpdateSuccessSchema object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetChannel

`func (o *ChatUpdateSuccessSchema) GetChannel() string`

GetChannel returns the Channel field if non-nil, zero value otherwise.

### GetChannelOk

`func (o *ChatUpdateSuccessSchema) GetChannelOk() (*string, bool)`

GetChannelOk returns a tuple with the Channel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChannel

`func (o *ChatUpdateSuccessSchema) SetChannel(v string)`

SetChannel sets Channel field to given value.


### GetMessage

`func (o *ChatUpdateSuccessSchema) GetMessage() MessageObject`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *ChatUpdateSuccessSchema) GetMessageOk() (*MessageObject, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *ChatUpdateSuccessSchema) SetMessage(v MessageObject)`

SetMessage sets Message field to given value.


### GetOk

`func (o *ChatUpdateSuccessSchema) GetOk() DefsOkTrue`

GetOk returns the Ok field if non-nil, zero value otherwise.

### GetOkOk

`func (o *ChatUpdateSuccessSchema) GetOkOk() (*DefsOkTrue, bool)`

GetOkOk returns a tuple with the Ok field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOk

`func (o *ChatUpdateSuccessSchema) SetOk(v DefsOkTrue)`

SetOk sets Ok field to given value.


### GetText

`func (o *ChatUpdateSuccessSchema) GetText() string`

GetText returns the Text field if non-nil, zero value otherwise.

### GetTextOk

`func (o *ChatUpdateSuccessSchema) GetTextOk() (*string, bool)`

GetTextOk returns a tuple with the Text field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetText

`func (o *ChatUpdateSuccessSchema) SetText(v string)`

SetText sets Text field to given value.


### GetTs

`func (o *ChatUpdateSuccessSchema) GetTs() string`

GetTs returns the Ts field if non-nil, zero value otherwise.

### GetTsOk

`func (o *ChatUpdateSuccessSchema) GetTsOk() (*string, bool)`

GetTsOk returns a tuple with the Ts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTs

`func (o *ChatUpdateSuccessSchema) SetTs(v string)`

SetTs sets Ts field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


