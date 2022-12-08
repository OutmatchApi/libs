# ChatScheduledMessagesListSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ok** | [**DefsOkTrue**](DefsOkTrue.md) |  | 
**ResponseMetadata** | [**AdminConversationsGetTeamsSchemaResponseMetadata**](AdminConversationsGetTeamsSchemaResponseMetadata.md) |  | 
**ScheduledMessages** | [**[]ChatScheduledMessagesListSchemaScheduledMessagesInner**](ChatScheduledMessagesListSchemaScheduledMessagesInner.md) |  | 

## Methods

### NewChatScheduledMessagesListSchema

`func NewChatScheduledMessagesListSchema(ok DefsOkTrue, responseMetadata AdminConversationsGetTeamsSchemaResponseMetadata, scheduledMessages []ChatScheduledMessagesListSchemaScheduledMessagesInner, ) *ChatScheduledMessagesListSchema`

NewChatScheduledMessagesListSchema instantiates a new ChatScheduledMessagesListSchema object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewChatScheduledMessagesListSchemaWithDefaults

`func NewChatScheduledMessagesListSchemaWithDefaults() *ChatScheduledMessagesListSchema`

NewChatScheduledMessagesListSchemaWithDefaults instantiates a new ChatScheduledMessagesListSchema object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOk

`func (o *ChatScheduledMessagesListSchema) GetOk() DefsOkTrue`

GetOk returns the Ok field if non-nil, zero value otherwise.

### GetOkOk

`func (o *ChatScheduledMessagesListSchema) GetOkOk() (*DefsOkTrue, bool)`

GetOkOk returns a tuple with the Ok field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOk

`func (o *ChatScheduledMessagesListSchema) SetOk(v DefsOkTrue)`

SetOk sets Ok field to given value.


### GetResponseMetadata

`func (o *ChatScheduledMessagesListSchema) GetResponseMetadata() AdminConversationsGetTeamsSchemaResponseMetadata`

GetResponseMetadata returns the ResponseMetadata field if non-nil, zero value otherwise.

### GetResponseMetadataOk

`func (o *ChatScheduledMessagesListSchema) GetResponseMetadataOk() (*AdminConversationsGetTeamsSchemaResponseMetadata, bool)`

GetResponseMetadataOk returns a tuple with the ResponseMetadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponseMetadata

`func (o *ChatScheduledMessagesListSchema) SetResponseMetadata(v AdminConversationsGetTeamsSchemaResponseMetadata)`

SetResponseMetadata sets ResponseMetadata field to given value.


### GetScheduledMessages

`func (o *ChatScheduledMessagesListSchema) GetScheduledMessages() []ChatScheduledMessagesListSchemaScheduledMessagesInner`

GetScheduledMessages returns the ScheduledMessages field if non-nil, zero value otherwise.

### GetScheduledMessagesOk

`func (o *ChatScheduledMessagesListSchema) GetScheduledMessagesOk() (*[]ChatScheduledMessagesListSchemaScheduledMessagesInner, bool)`

GetScheduledMessagesOk returns a tuple with the ScheduledMessages field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScheduledMessages

`func (o *ChatScheduledMessagesListSchema) SetScheduledMessages(v []ChatScheduledMessagesListSchemaScheduledMessagesInner)`

SetScheduledMessages sets ScheduledMessages field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


