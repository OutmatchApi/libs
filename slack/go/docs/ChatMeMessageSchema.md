# ChatMeMessageSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Channel** | Pointer to **string** |  | [optional] 
**Ok** | [**DefsOkTrue**](DefsOkTrue.md) |  | 
**Ts** | Pointer to **string** |  | [optional] 

## Methods

### NewChatMeMessageSchema

`func NewChatMeMessageSchema(ok DefsOkTrue, ) *ChatMeMessageSchema`

NewChatMeMessageSchema instantiates a new ChatMeMessageSchema object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewChatMeMessageSchemaWithDefaults

`func NewChatMeMessageSchemaWithDefaults() *ChatMeMessageSchema`

NewChatMeMessageSchemaWithDefaults instantiates a new ChatMeMessageSchema object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetChannel

`func (o *ChatMeMessageSchema) GetChannel() string`

GetChannel returns the Channel field if non-nil, zero value otherwise.

### GetChannelOk

`func (o *ChatMeMessageSchema) GetChannelOk() (*string, bool)`

GetChannelOk returns a tuple with the Channel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChannel

`func (o *ChatMeMessageSchema) SetChannel(v string)`

SetChannel sets Channel field to given value.

### HasChannel

`func (o *ChatMeMessageSchema) HasChannel() bool`

HasChannel returns a boolean if a field has been set.

### GetOk

`func (o *ChatMeMessageSchema) GetOk() DefsOkTrue`

GetOk returns the Ok field if non-nil, zero value otherwise.

### GetOkOk

`func (o *ChatMeMessageSchema) GetOkOk() (*DefsOkTrue, bool)`

GetOkOk returns a tuple with the Ok field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOk

`func (o *ChatMeMessageSchema) SetOk(v DefsOkTrue)`

SetOk sets Ok field to given value.


### GetTs

`func (o *ChatMeMessageSchema) GetTs() string`

GetTs returns the Ts field if non-nil, zero value otherwise.

### GetTsOk

`func (o *ChatMeMessageSchema) GetTsOk() (*string, bool)`

GetTsOk returns a tuple with the Ts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTs

`func (o *ChatMeMessageSchema) SetTs(v string)`

SetTs sets Ts field to given value.

### HasTs

`func (o *ChatMeMessageSchema) HasTs() bool`

HasTs returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


