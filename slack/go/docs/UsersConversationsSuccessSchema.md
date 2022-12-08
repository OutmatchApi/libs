# UsersConversationsSuccessSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Channels** | [**[][]ObjsConversationInner**]([]ObjsConversationInner.md) |  | 
**Ok** | [**DefsOkTrue**](DefsOkTrue.md) |  | 
**ResponseMetadata** | Pointer to [**AdminConversationsGetTeamsSchemaResponseMetadata**](AdminConversationsGetTeamsSchemaResponseMetadata.md) |  | [optional] 

## Methods

### NewUsersConversationsSuccessSchema

`func NewUsersConversationsSuccessSchema(channels [][]ObjsConversationInner, ok DefsOkTrue, ) *UsersConversationsSuccessSchema`

NewUsersConversationsSuccessSchema instantiates a new UsersConversationsSuccessSchema object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUsersConversationsSuccessSchemaWithDefaults

`func NewUsersConversationsSuccessSchemaWithDefaults() *UsersConversationsSuccessSchema`

NewUsersConversationsSuccessSchemaWithDefaults instantiates a new UsersConversationsSuccessSchema object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetChannels

`func (o *UsersConversationsSuccessSchema) GetChannels() [][]ObjsConversationInner`

GetChannels returns the Channels field if non-nil, zero value otherwise.

### GetChannelsOk

`func (o *UsersConversationsSuccessSchema) GetChannelsOk() (*[][]ObjsConversationInner, bool)`

GetChannelsOk returns a tuple with the Channels field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChannels

`func (o *UsersConversationsSuccessSchema) SetChannels(v [][]ObjsConversationInner)`

SetChannels sets Channels field to given value.


### GetOk

`func (o *UsersConversationsSuccessSchema) GetOk() DefsOkTrue`

GetOk returns the Ok field if non-nil, zero value otherwise.

### GetOkOk

`func (o *UsersConversationsSuccessSchema) GetOkOk() (*DefsOkTrue, bool)`

GetOkOk returns a tuple with the Ok field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOk

`func (o *UsersConversationsSuccessSchema) SetOk(v DefsOkTrue)`

SetOk sets Ok field to given value.


### GetResponseMetadata

`func (o *UsersConversationsSuccessSchema) GetResponseMetadata() AdminConversationsGetTeamsSchemaResponseMetadata`

GetResponseMetadata returns the ResponseMetadata field if non-nil, zero value otherwise.

### GetResponseMetadataOk

`func (o *UsersConversationsSuccessSchema) GetResponseMetadataOk() (*AdminConversationsGetTeamsSchemaResponseMetadata, bool)`

GetResponseMetadataOk returns a tuple with the ResponseMetadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponseMetadata

`func (o *UsersConversationsSuccessSchema) SetResponseMetadata(v AdminConversationsGetTeamsSchemaResponseMetadata)`

SetResponseMetadata sets ResponseMetadata field to given value.

### HasResponseMetadata

`func (o *UsersConversationsSuccessSchema) HasResponseMetadata() bool`

HasResponseMetadata returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


