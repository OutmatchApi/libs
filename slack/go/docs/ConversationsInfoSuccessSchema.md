# ConversationsInfoSuccessSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Channel** | [**[]ObjsConversationInner**](ObjsConversationInner.md) |  | 
**Ok** | [**DefsOkTrue**](DefsOkTrue.md) |  | 

## Methods

### NewConversationsInfoSuccessSchema

`func NewConversationsInfoSuccessSchema(channel []ObjsConversationInner, ok DefsOkTrue, ) *ConversationsInfoSuccessSchema`

NewConversationsInfoSuccessSchema instantiates a new ConversationsInfoSuccessSchema object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConversationsInfoSuccessSchemaWithDefaults

`func NewConversationsInfoSuccessSchemaWithDefaults() *ConversationsInfoSuccessSchema`

NewConversationsInfoSuccessSchemaWithDefaults instantiates a new ConversationsInfoSuccessSchema object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetChannel

`func (o *ConversationsInfoSuccessSchema) GetChannel() []ObjsConversationInner`

GetChannel returns the Channel field if non-nil, zero value otherwise.

### GetChannelOk

`func (o *ConversationsInfoSuccessSchema) GetChannelOk() (*[]ObjsConversationInner, bool)`

GetChannelOk returns a tuple with the Channel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChannel

`func (o *ConversationsInfoSuccessSchema) SetChannel(v []ObjsConversationInner)`

SetChannel sets Channel field to given value.


### GetOk

`func (o *ConversationsInfoSuccessSchema) GetOk() DefsOkTrue`

GetOk returns the Ok field if non-nil, zero value otherwise.

### GetOkOk

`func (o *ConversationsInfoSuccessSchema) GetOkOk() (*DefsOkTrue, bool)`

GetOkOk returns a tuple with the Ok field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOk

`func (o *ConversationsInfoSuccessSchema) SetOk(v DefsOkTrue)`

SetOk sets Ok field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


