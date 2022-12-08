# UsersListSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CacheTs** | **int32** |  | 
**Members** | [**[][]ObjsUserInner**]([]ObjsUserInner.md) |  | 
**Ok** | [**DefsOkTrue**](DefsOkTrue.md) |  | 
**ResponseMetadata** | Pointer to [**[]ObjsResponseMetadataInner**](ObjsResponseMetadataInner.md) |  | [optional] 

## Methods

### NewUsersListSchema

`func NewUsersListSchema(cacheTs int32, members [][]ObjsUserInner, ok DefsOkTrue, ) *UsersListSchema`

NewUsersListSchema instantiates a new UsersListSchema object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUsersListSchemaWithDefaults

`func NewUsersListSchemaWithDefaults() *UsersListSchema`

NewUsersListSchemaWithDefaults instantiates a new UsersListSchema object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCacheTs

`func (o *UsersListSchema) GetCacheTs() int32`

GetCacheTs returns the CacheTs field if non-nil, zero value otherwise.

### GetCacheTsOk

`func (o *UsersListSchema) GetCacheTsOk() (*int32, bool)`

GetCacheTsOk returns a tuple with the CacheTs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCacheTs

`func (o *UsersListSchema) SetCacheTs(v int32)`

SetCacheTs sets CacheTs field to given value.


### GetMembers

`func (o *UsersListSchema) GetMembers() [][]ObjsUserInner`

GetMembers returns the Members field if non-nil, zero value otherwise.

### GetMembersOk

`func (o *UsersListSchema) GetMembersOk() (*[][]ObjsUserInner, bool)`

GetMembersOk returns a tuple with the Members field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMembers

`func (o *UsersListSchema) SetMembers(v [][]ObjsUserInner)`

SetMembers sets Members field to given value.


### GetOk

`func (o *UsersListSchema) GetOk() DefsOkTrue`

GetOk returns the Ok field if non-nil, zero value otherwise.

### GetOkOk

`func (o *UsersListSchema) GetOkOk() (*DefsOkTrue, bool)`

GetOkOk returns a tuple with the Ok field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOk

`func (o *UsersListSchema) SetOk(v DefsOkTrue)`

SetOk sets Ok field to given value.


### GetResponseMetadata

`func (o *UsersListSchema) GetResponseMetadata() []ObjsResponseMetadataInner`

GetResponseMetadata returns the ResponseMetadata field if non-nil, zero value otherwise.

### GetResponseMetadataOk

`func (o *UsersListSchema) GetResponseMetadataOk() (*[]ObjsResponseMetadataInner, bool)`

GetResponseMetadataOk returns a tuple with the ResponseMetadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponseMetadata

`func (o *UsersListSchema) SetResponseMetadata(v []ObjsResponseMetadataInner)`

SetResponseMetadata sets ResponseMetadata field to given value.

### HasResponseMetadata

`func (o *UsersListSchema) HasResponseMetadata() bool`

HasResponseMetadata returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


