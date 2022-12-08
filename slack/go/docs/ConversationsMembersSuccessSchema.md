# ConversationsMembersSuccessSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Members** | **[]string** |  | 
**Ok** | [**DefsOkTrue**](DefsOkTrue.md) |  | 
**ResponseMetadata** | [**AdminConversationsGetTeamsSchemaResponseMetadata**](AdminConversationsGetTeamsSchemaResponseMetadata.md) |  | 

## Methods

### NewConversationsMembersSuccessSchema

`func NewConversationsMembersSuccessSchema(members []string, ok DefsOkTrue, responseMetadata AdminConversationsGetTeamsSchemaResponseMetadata, ) *ConversationsMembersSuccessSchema`

NewConversationsMembersSuccessSchema instantiates a new ConversationsMembersSuccessSchema object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConversationsMembersSuccessSchemaWithDefaults

`func NewConversationsMembersSuccessSchemaWithDefaults() *ConversationsMembersSuccessSchema`

NewConversationsMembersSuccessSchemaWithDefaults instantiates a new ConversationsMembersSuccessSchema object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMembers

`func (o *ConversationsMembersSuccessSchema) GetMembers() []string`

GetMembers returns the Members field if non-nil, zero value otherwise.

### GetMembersOk

`func (o *ConversationsMembersSuccessSchema) GetMembersOk() (*[]string, bool)`

GetMembersOk returns a tuple with the Members field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMembers

`func (o *ConversationsMembersSuccessSchema) SetMembers(v []string)`

SetMembers sets Members field to given value.


### GetOk

`func (o *ConversationsMembersSuccessSchema) GetOk() DefsOkTrue`

GetOk returns the Ok field if non-nil, zero value otherwise.

### GetOkOk

`func (o *ConversationsMembersSuccessSchema) GetOkOk() (*DefsOkTrue, bool)`

GetOkOk returns a tuple with the Ok field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOk

`func (o *ConversationsMembersSuccessSchema) SetOk(v DefsOkTrue)`

SetOk sets Ok field to given value.


### GetResponseMetadata

`func (o *ConversationsMembersSuccessSchema) GetResponseMetadata() AdminConversationsGetTeamsSchemaResponseMetadata`

GetResponseMetadata returns the ResponseMetadata field if non-nil, zero value otherwise.

### GetResponseMetadataOk

`func (o *ConversationsMembersSuccessSchema) GetResponseMetadataOk() (*AdminConversationsGetTeamsSchemaResponseMetadata, bool)`

GetResponseMetadataOk returns a tuple with the ResponseMetadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponseMetadata

`func (o *ConversationsMembersSuccessSchema) SetResponseMetadata(v AdminConversationsGetTeamsSchemaResponseMetadata)`

SetResponseMetadata sets ResponseMetadata field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


