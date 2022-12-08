# ConversationsRepliesSuccessSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**HasMore** | Pointer to **bool** |  | [optional] 
**Messages** | [**[][]ConversationsRepliesSuccessSchemaMessagesInnerInner**]([]ConversationsRepliesSuccessSchemaMessagesInnerInner.md) |  | 
**Ok** | [**DefsOkTrue**](DefsOkTrue.md) |  | 

## Methods

### NewConversationsRepliesSuccessSchema

`func NewConversationsRepliesSuccessSchema(messages [][]ConversationsRepliesSuccessSchemaMessagesInnerInner, ok DefsOkTrue, ) *ConversationsRepliesSuccessSchema`

NewConversationsRepliesSuccessSchema instantiates a new ConversationsRepliesSuccessSchema object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConversationsRepliesSuccessSchemaWithDefaults

`func NewConversationsRepliesSuccessSchemaWithDefaults() *ConversationsRepliesSuccessSchema`

NewConversationsRepliesSuccessSchemaWithDefaults instantiates a new ConversationsRepliesSuccessSchema object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetHasMore

`func (o *ConversationsRepliesSuccessSchema) GetHasMore() bool`

GetHasMore returns the HasMore field if non-nil, zero value otherwise.

### GetHasMoreOk

`func (o *ConversationsRepliesSuccessSchema) GetHasMoreOk() (*bool, bool)`

GetHasMoreOk returns a tuple with the HasMore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasMore

`func (o *ConversationsRepliesSuccessSchema) SetHasMore(v bool)`

SetHasMore sets HasMore field to given value.

### HasHasMore

`func (o *ConversationsRepliesSuccessSchema) HasHasMore() bool`

HasHasMore returns a boolean if a field has been set.

### GetMessages

`func (o *ConversationsRepliesSuccessSchema) GetMessages() [][]ConversationsRepliesSuccessSchemaMessagesInnerInner`

GetMessages returns the Messages field if non-nil, zero value otherwise.

### GetMessagesOk

`func (o *ConversationsRepliesSuccessSchema) GetMessagesOk() (*[][]ConversationsRepliesSuccessSchemaMessagesInnerInner, bool)`

GetMessagesOk returns a tuple with the Messages field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessages

`func (o *ConversationsRepliesSuccessSchema) SetMessages(v [][]ConversationsRepliesSuccessSchemaMessagesInnerInner)`

SetMessages sets Messages field to given value.


### GetOk

`func (o *ConversationsRepliesSuccessSchema) GetOk() DefsOkTrue`

GetOk returns the Ok field if non-nil, zero value otherwise.

### GetOkOk

`func (o *ConversationsRepliesSuccessSchema) GetOkOk() (*DefsOkTrue, bool)`

GetOkOk returns a tuple with the Ok field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOk

`func (o *ConversationsRepliesSuccessSchema) SetOk(v DefsOkTrue)`

SetOk sets Ok field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


