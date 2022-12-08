# ChatDeleteSuccessSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Channel** | **string** |  | 
**Ok** | [**DefsOkTrue**](DefsOkTrue.md) |  | 
**Ts** | **string** |  | 

## Methods

### NewChatDeleteSuccessSchema

`func NewChatDeleteSuccessSchema(channel string, ok DefsOkTrue, ts string, ) *ChatDeleteSuccessSchema`

NewChatDeleteSuccessSchema instantiates a new ChatDeleteSuccessSchema object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewChatDeleteSuccessSchemaWithDefaults

`func NewChatDeleteSuccessSchemaWithDefaults() *ChatDeleteSuccessSchema`

NewChatDeleteSuccessSchemaWithDefaults instantiates a new ChatDeleteSuccessSchema object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetChannel

`func (o *ChatDeleteSuccessSchema) GetChannel() string`

GetChannel returns the Channel field if non-nil, zero value otherwise.

### GetChannelOk

`func (o *ChatDeleteSuccessSchema) GetChannelOk() (*string, bool)`

GetChannelOk returns a tuple with the Channel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChannel

`func (o *ChatDeleteSuccessSchema) SetChannel(v string)`

SetChannel sets Channel field to given value.


### GetOk

`func (o *ChatDeleteSuccessSchema) GetOk() DefsOkTrue`

GetOk returns the Ok field if non-nil, zero value otherwise.

### GetOkOk

`func (o *ChatDeleteSuccessSchema) GetOkOk() (*DefsOkTrue, bool)`

GetOkOk returns a tuple with the Ok field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOk

`func (o *ChatDeleteSuccessSchema) SetOk(v DefsOkTrue)`

SetOk sets Ok field to given value.


### GetTs

`func (o *ChatDeleteSuccessSchema) GetTs() string`

GetTs returns the Ts field if non-nil, zero value otherwise.

### GetTsOk

`func (o *ChatDeleteSuccessSchema) GetTsOk() (*string, bool)`

GetTsOk returns a tuple with the Ts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTs

`func (o *ChatDeleteSuccessSchema) SetTs(v string)`

SetTs sets Ts field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


