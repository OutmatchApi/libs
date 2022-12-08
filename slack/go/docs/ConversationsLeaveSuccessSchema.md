# ConversationsLeaveSuccessSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**NotInChannel** | Pointer to **bool** |  | [optional] 
**Ok** | [**DefsOkTrue**](DefsOkTrue.md) |  | 

## Methods

### NewConversationsLeaveSuccessSchema

`func NewConversationsLeaveSuccessSchema(ok DefsOkTrue, ) *ConversationsLeaveSuccessSchema`

NewConversationsLeaveSuccessSchema instantiates a new ConversationsLeaveSuccessSchema object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConversationsLeaveSuccessSchemaWithDefaults

`func NewConversationsLeaveSuccessSchemaWithDefaults() *ConversationsLeaveSuccessSchema`

NewConversationsLeaveSuccessSchemaWithDefaults instantiates a new ConversationsLeaveSuccessSchema object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetNotInChannel

`func (o *ConversationsLeaveSuccessSchema) GetNotInChannel() bool`

GetNotInChannel returns the NotInChannel field if non-nil, zero value otherwise.

### GetNotInChannelOk

`func (o *ConversationsLeaveSuccessSchema) GetNotInChannelOk() (*bool, bool)`

GetNotInChannelOk returns a tuple with the NotInChannel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNotInChannel

`func (o *ConversationsLeaveSuccessSchema) SetNotInChannel(v bool)`

SetNotInChannel sets NotInChannel field to given value.

### HasNotInChannel

`func (o *ConversationsLeaveSuccessSchema) HasNotInChannel() bool`

HasNotInChannel returns a boolean if a field has been set.

### GetOk

`func (o *ConversationsLeaveSuccessSchema) GetOk() DefsOkTrue`

GetOk returns the Ok field if non-nil, zero value otherwise.

### GetOkOk

`func (o *ConversationsLeaveSuccessSchema) GetOkOk() (*DefsOkTrue, bool)`

GetOkOk returns a tuple with the Ok field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOk

`func (o *ConversationsLeaveSuccessSchema) SetOk(v DefsOkTrue)`

SetOk sets Ok field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


