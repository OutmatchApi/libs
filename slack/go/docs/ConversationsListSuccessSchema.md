# ConversationsListSuccessSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Channels** | [**[][]ObjsConversationInner**]([]ObjsConversationInner.md) |  | 
**Ok** | [**DefsOkTrue**](DefsOkTrue.md) |  | 
**ResponseMetadata** | Pointer to [**AdminConversationsGetTeamsSchemaResponseMetadata**](AdminConversationsGetTeamsSchemaResponseMetadata.md) |  | [optional] 

## Methods

### NewConversationsListSuccessSchema

`func NewConversationsListSuccessSchema(channels [][]ObjsConversationInner, ok DefsOkTrue, ) *ConversationsListSuccessSchema`

NewConversationsListSuccessSchema instantiates a new ConversationsListSuccessSchema object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConversationsListSuccessSchemaWithDefaults

`func NewConversationsListSuccessSchemaWithDefaults() *ConversationsListSuccessSchema`

NewConversationsListSuccessSchemaWithDefaults instantiates a new ConversationsListSuccessSchema object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetChannels

`func (o *ConversationsListSuccessSchema) GetChannels() [][]ObjsConversationInner`

GetChannels returns the Channels field if non-nil, zero value otherwise.

### GetChannelsOk

`func (o *ConversationsListSuccessSchema) GetChannelsOk() (*[][]ObjsConversationInner, bool)`

GetChannelsOk returns a tuple with the Channels field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChannels

`func (o *ConversationsListSuccessSchema) SetChannels(v [][]ObjsConversationInner)`

SetChannels sets Channels field to given value.


### GetOk

`func (o *ConversationsListSuccessSchema) GetOk() DefsOkTrue`

GetOk returns the Ok field if non-nil, zero value otherwise.

### GetOkOk

`func (o *ConversationsListSuccessSchema) GetOkOk() (*DefsOkTrue, bool)`

GetOkOk returns a tuple with the Ok field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOk

`func (o *ConversationsListSuccessSchema) SetOk(v DefsOkTrue)`

SetOk sets Ok field to given value.


### GetResponseMetadata

`func (o *ConversationsListSuccessSchema) GetResponseMetadata() AdminConversationsGetTeamsSchemaResponseMetadata`

GetResponseMetadata returns the ResponseMetadata field if non-nil, zero value otherwise.

### GetResponseMetadataOk

`func (o *ConversationsListSuccessSchema) GetResponseMetadataOk() (*AdminConversationsGetTeamsSchemaResponseMetadata, bool)`

GetResponseMetadataOk returns a tuple with the ResponseMetadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponseMetadata

`func (o *ConversationsListSuccessSchema) SetResponseMetadata(v AdminConversationsGetTeamsSchemaResponseMetadata)`

SetResponseMetadata sets ResponseMetadata field to given value.

### HasResponseMetadata

`func (o *ConversationsListSuccessSchema) HasResponseMetadata() bool`

HasResponseMetadata returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


