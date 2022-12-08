# ConversationsJoinSuccessSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Channel** | [**[]ObjsConversationInner**](ObjsConversationInner.md) |  | 
**Ok** | [**DefsOkTrue**](DefsOkTrue.md) |  | 
**ResponseMetadata** | Pointer to [**ResponseMetadata**](ResponseMetadata.md) |  | [optional] 
**Warning** | Pointer to **string** |  | [optional] 

## Methods

### NewConversationsJoinSuccessSchema

`func NewConversationsJoinSuccessSchema(channel []ObjsConversationInner, ok DefsOkTrue, ) *ConversationsJoinSuccessSchema`

NewConversationsJoinSuccessSchema instantiates a new ConversationsJoinSuccessSchema object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConversationsJoinSuccessSchemaWithDefaults

`func NewConversationsJoinSuccessSchemaWithDefaults() *ConversationsJoinSuccessSchema`

NewConversationsJoinSuccessSchemaWithDefaults instantiates a new ConversationsJoinSuccessSchema object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetChannel

`func (o *ConversationsJoinSuccessSchema) GetChannel() []ObjsConversationInner`

GetChannel returns the Channel field if non-nil, zero value otherwise.

### GetChannelOk

`func (o *ConversationsJoinSuccessSchema) GetChannelOk() (*[]ObjsConversationInner, bool)`

GetChannelOk returns a tuple with the Channel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChannel

`func (o *ConversationsJoinSuccessSchema) SetChannel(v []ObjsConversationInner)`

SetChannel sets Channel field to given value.


### GetOk

`func (o *ConversationsJoinSuccessSchema) GetOk() DefsOkTrue`

GetOk returns the Ok field if non-nil, zero value otherwise.

### GetOkOk

`func (o *ConversationsJoinSuccessSchema) GetOkOk() (*DefsOkTrue, bool)`

GetOkOk returns a tuple with the Ok field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOk

`func (o *ConversationsJoinSuccessSchema) SetOk(v DefsOkTrue)`

SetOk sets Ok field to given value.


### GetResponseMetadata

`func (o *ConversationsJoinSuccessSchema) GetResponseMetadata() ResponseMetadata`

GetResponseMetadata returns the ResponseMetadata field if non-nil, zero value otherwise.

### GetResponseMetadataOk

`func (o *ConversationsJoinSuccessSchema) GetResponseMetadataOk() (*ResponseMetadata, bool)`

GetResponseMetadataOk returns a tuple with the ResponseMetadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponseMetadata

`func (o *ConversationsJoinSuccessSchema) SetResponseMetadata(v ResponseMetadata)`

SetResponseMetadata sets ResponseMetadata field to given value.

### HasResponseMetadata

`func (o *ConversationsJoinSuccessSchema) HasResponseMetadata() bool`

HasResponseMetadata returns a boolean if a field has been set.

### GetWarning

`func (o *ConversationsJoinSuccessSchema) GetWarning() string`

GetWarning returns the Warning field if non-nil, zero value otherwise.

### GetWarningOk

`func (o *ConversationsJoinSuccessSchema) GetWarningOk() (*string, bool)`

GetWarningOk returns a tuple with the Warning field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarning

`func (o *ConversationsJoinSuccessSchema) SetWarning(v string)`

SetWarning sets Warning field to given value.

### HasWarning

`func (o *ConversationsJoinSuccessSchema) HasWarning() bool`

HasWarning returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


