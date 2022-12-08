# AdminConversationsGetTeamsSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ok** | [**DefsOkTrue**](DefsOkTrue.md) |  | 
**ResponseMetadata** | Pointer to [**AdminConversationsGetTeamsSchemaResponseMetadata**](AdminConversationsGetTeamsSchemaResponseMetadata.md) |  | [optional] 
**TeamIds** | **[]string** |  | 

## Methods

### NewAdminConversationsGetTeamsSchema

`func NewAdminConversationsGetTeamsSchema(ok DefsOkTrue, teamIds []string, ) *AdminConversationsGetTeamsSchema`

NewAdminConversationsGetTeamsSchema instantiates a new AdminConversationsGetTeamsSchema object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdminConversationsGetTeamsSchemaWithDefaults

`func NewAdminConversationsGetTeamsSchemaWithDefaults() *AdminConversationsGetTeamsSchema`

NewAdminConversationsGetTeamsSchemaWithDefaults instantiates a new AdminConversationsGetTeamsSchema object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOk

`func (o *AdminConversationsGetTeamsSchema) GetOk() DefsOkTrue`

GetOk returns the Ok field if non-nil, zero value otherwise.

### GetOkOk

`func (o *AdminConversationsGetTeamsSchema) GetOkOk() (*DefsOkTrue, bool)`

GetOkOk returns a tuple with the Ok field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOk

`func (o *AdminConversationsGetTeamsSchema) SetOk(v DefsOkTrue)`

SetOk sets Ok field to given value.


### GetResponseMetadata

`func (o *AdminConversationsGetTeamsSchema) GetResponseMetadata() AdminConversationsGetTeamsSchemaResponseMetadata`

GetResponseMetadata returns the ResponseMetadata field if non-nil, zero value otherwise.

### GetResponseMetadataOk

`func (o *AdminConversationsGetTeamsSchema) GetResponseMetadataOk() (*AdminConversationsGetTeamsSchemaResponseMetadata, bool)`

GetResponseMetadataOk returns a tuple with the ResponseMetadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponseMetadata

`func (o *AdminConversationsGetTeamsSchema) SetResponseMetadata(v AdminConversationsGetTeamsSchemaResponseMetadata)`

SetResponseMetadata sets ResponseMetadata field to given value.

### HasResponseMetadata

`func (o *AdminConversationsGetTeamsSchema) HasResponseMetadata() bool`

HasResponseMetadata returns a boolean if a field has been set.

### GetTeamIds

`func (o *AdminConversationsGetTeamsSchema) GetTeamIds() []string`

GetTeamIds returns the TeamIds field if non-nil, zero value otherwise.

### GetTeamIdsOk

`func (o *AdminConversationsGetTeamsSchema) GetTeamIdsOk() (*[]string, bool)`

GetTeamIdsOk returns a tuple with the TeamIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTeamIds

`func (o *AdminConversationsGetTeamsSchema) SetTeamIds(v []string)`

SetTeamIds sets TeamIds field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


