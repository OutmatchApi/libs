# ConversationsOpenSuccessSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AlreadyOpen** | Pointer to **bool** |  | [optional] 
**Channel** | [**[]ConversationsOpenSuccessSchemaChannelInner**](ConversationsOpenSuccessSchemaChannelInner.md) |  | 
**NoOp** | Pointer to **bool** |  | [optional] 
**Ok** | [**DefsOkTrue**](DefsOkTrue.md) |  | 

## Methods

### NewConversationsOpenSuccessSchema

`func NewConversationsOpenSuccessSchema(channel []ConversationsOpenSuccessSchemaChannelInner, ok DefsOkTrue, ) *ConversationsOpenSuccessSchema`

NewConversationsOpenSuccessSchema instantiates a new ConversationsOpenSuccessSchema object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConversationsOpenSuccessSchemaWithDefaults

`func NewConversationsOpenSuccessSchemaWithDefaults() *ConversationsOpenSuccessSchema`

NewConversationsOpenSuccessSchemaWithDefaults instantiates a new ConversationsOpenSuccessSchema object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAlreadyOpen

`func (o *ConversationsOpenSuccessSchema) GetAlreadyOpen() bool`

GetAlreadyOpen returns the AlreadyOpen field if non-nil, zero value otherwise.

### GetAlreadyOpenOk

`func (o *ConversationsOpenSuccessSchema) GetAlreadyOpenOk() (*bool, bool)`

GetAlreadyOpenOk returns a tuple with the AlreadyOpen field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAlreadyOpen

`func (o *ConversationsOpenSuccessSchema) SetAlreadyOpen(v bool)`

SetAlreadyOpen sets AlreadyOpen field to given value.

### HasAlreadyOpen

`func (o *ConversationsOpenSuccessSchema) HasAlreadyOpen() bool`

HasAlreadyOpen returns a boolean if a field has been set.

### GetChannel

`func (o *ConversationsOpenSuccessSchema) GetChannel() []ConversationsOpenSuccessSchemaChannelInner`

GetChannel returns the Channel field if non-nil, zero value otherwise.

### GetChannelOk

`func (o *ConversationsOpenSuccessSchema) GetChannelOk() (*[]ConversationsOpenSuccessSchemaChannelInner, bool)`

GetChannelOk returns a tuple with the Channel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChannel

`func (o *ConversationsOpenSuccessSchema) SetChannel(v []ConversationsOpenSuccessSchemaChannelInner)`

SetChannel sets Channel field to given value.


### GetNoOp

`func (o *ConversationsOpenSuccessSchema) GetNoOp() bool`

GetNoOp returns the NoOp field if non-nil, zero value otherwise.

### GetNoOpOk

`func (o *ConversationsOpenSuccessSchema) GetNoOpOk() (*bool, bool)`

GetNoOpOk returns a tuple with the NoOp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNoOp

`func (o *ConversationsOpenSuccessSchema) SetNoOp(v bool)`

SetNoOp sets NoOp field to given value.

### HasNoOp

`func (o *ConversationsOpenSuccessSchema) HasNoOp() bool`

HasNoOp returns a boolean if a field has been set.

### GetOk

`func (o *ConversationsOpenSuccessSchema) GetOk() DefsOkTrue`

GetOk returns the Ok field if non-nil, zero value otherwise.

### GetOkOk

`func (o *ConversationsOpenSuccessSchema) GetOkOk() (*DefsOkTrue, bool)`

GetOkOk returns a tuple with the Ok field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOk

`func (o *ConversationsOpenSuccessSchema) SetOk(v DefsOkTrue)`

SetOk sets Ok field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


