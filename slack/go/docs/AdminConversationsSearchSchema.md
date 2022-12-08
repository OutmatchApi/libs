# AdminConversationsSearchSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Channels** | [**[]ObjsChannel**](ObjsChannel.md) |  | 
**NextCursor** | **string** |  | 

## Methods

### NewAdminConversationsSearchSchema

`func NewAdminConversationsSearchSchema(channels []ObjsChannel, nextCursor string, ) *AdminConversationsSearchSchema`

NewAdminConversationsSearchSchema instantiates a new AdminConversationsSearchSchema object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdminConversationsSearchSchemaWithDefaults

`func NewAdminConversationsSearchSchemaWithDefaults() *AdminConversationsSearchSchema`

NewAdminConversationsSearchSchemaWithDefaults instantiates a new AdminConversationsSearchSchema object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetChannels

`func (o *AdminConversationsSearchSchema) GetChannels() []ObjsChannel`

GetChannels returns the Channels field if non-nil, zero value otherwise.

### GetChannelsOk

`func (o *AdminConversationsSearchSchema) GetChannelsOk() (*[]ObjsChannel, bool)`

GetChannelsOk returns a tuple with the Channels field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChannels

`func (o *AdminConversationsSearchSchema) SetChannels(v []ObjsChannel)`

SetChannels sets Channels field to given value.


### GetNextCursor

`func (o *AdminConversationsSearchSchema) GetNextCursor() string`

GetNextCursor returns the NextCursor field if non-nil, zero value otherwise.

### GetNextCursorOk

`func (o *AdminConversationsSearchSchema) GetNextCursorOk() (*string, bool)`

GetNextCursorOk returns a tuple with the NextCursor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNextCursor

`func (o *AdminConversationsSearchSchema) SetNextCursor(v string)`

SetNextCursor sets NextCursor field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


