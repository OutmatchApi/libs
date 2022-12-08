# AdminConversationsCreateSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ChannelId** | Pointer to **string** |  | [optional] 
**Ok** | [**DefsOkTrue**](DefsOkTrue.md) |  | 

## Methods

### NewAdminConversationsCreateSchema

`func NewAdminConversationsCreateSchema(ok DefsOkTrue, ) *AdminConversationsCreateSchema`

NewAdminConversationsCreateSchema instantiates a new AdminConversationsCreateSchema object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdminConversationsCreateSchemaWithDefaults

`func NewAdminConversationsCreateSchemaWithDefaults() *AdminConversationsCreateSchema`

NewAdminConversationsCreateSchemaWithDefaults instantiates a new AdminConversationsCreateSchema object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetChannelId

`func (o *AdminConversationsCreateSchema) GetChannelId() string`

GetChannelId returns the ChannelId field if non-nil, zero value otherwise.

### GetChannelIdOk

`func (o *AdminConversationsCreateSchema) GetChannelIdOk() (*string, bool)`

GetChannelIdOk returns a tuple with the ChannelId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChannelId

`func (o *AdminConversationsCreateSchema) SetChannelId(v string)`

SetChannelId sets ChannelId field to given value.

### HasChannelId

`func (o *AdminConversationsCreateSchema) HasChannelId() bool`

HasChannelId returns a boolean if a field has been set.

### GetOk

`func (o *AdminConversationsCreateSchema) GetOk() DefsOkTrue`

GetOk returns the Ok field if non-nil, zero value otherwise.

### GetOkOk

`func (o *AdminConversationsCreateSchema) GetOkOk() (*DefsOkTrue, bool)`

GetOkOk returns a tuple with the Ok field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOk

`func (o *AdminConversationsCreateSchema) SetOk(v DefsOkTrue)`

SetOk sets Ok field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


