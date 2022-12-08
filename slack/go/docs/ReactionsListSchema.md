# ReactionsListSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**[][]ReactionsListSchemaItemsInnerInner**]([]ReactionsListSchemaItemsInnerInner.md) |  | 
**Ok** | [**DefsOkTrue**](DefsOkTrue.md) |  | 
**Paging** | Pointer to [**ObjsPaging**](ObjsPaging.md) |  | [optional] 
**ResponseMetadata** | Pointer to [**[]ObjsResponseMetadataInner**](ObjsResponseMetadataInner.md) |  | [optional] 

## Methods

### NewReactionsListSchema

`func NewReactionsListSchema(items [][]ReactionsListSchemaItemsInnerInner, ok DefsOkTrue, ) *ReactionsListSchema`

NewReactionsListSchema instantiates a new ReactionsListSchema object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewReactionsListSchemaWithDefaults

`func NewReactionsListSchemaWithDefaults() *ReactionsListSchema`

NewReactionsListSchemaWithDefaults instantiates a new ReactionsListSchema object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItems

`func (o *ReactionsListSchema) GetItems() [][]ReactionsListSchemaItemsInnerInner`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *ReactionsListSchema) GetItemsOk() (*[][]ReactionsListSchemaItemsInnerInner, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *ReactionsListSchema) SetItems(v [][]ReactionsListSchemaItemsInnerInner)`

SetItems sets Items field to given value.


### GetOk

`func (o *ReactionsListSchema) GetOk() DefsOkTrue`

GetOk returns the Ok field if non-nil, zero value otherwise.

### GetOkOk

`func (o *ReactionsListSchema) GetOkOk() (*DefsOkTrue, bool)`

GetOkOk returns a tuple with the Ok field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOk

`func (o *ReactionsListSchema) SetOk(v DefsOkTrue)`

SetOk sets Ok field to given value.


### GetPaging

`func (o *ReactionsListSchema) GetPaging() ObjsPaging`

GetPaging returns the Paging field if non-nil, zero value otherwise.

### GetPagingOk

`func (o *ReactionsListSchema) GetPagingOk() (*ObjsPaging, bool)`

GetPagingOk returns a tuple with the Paging field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaging

`func (o *ReactionsListSchema) SetPaging(v ObjsPaging)`

SetPaging sets Paging field to given value.

### HasPaging

`func (o *ReactionsListSchema) HasPaging() bool`

HasPaging returns a boolean if a field has been set.

### GetResponseMetadata

`func (o *ReactionsListSchema) GetResponseMetadata() []ObjsResponseMetadataInner`

GetResponseMetadata returns the ResponseMetadata field if non-nil, zero value otherwise.

### GetResponseMetadataOk

`func (o *ReactionsListSchema) GetResponseMetadataOk() (*[]ObjsResponseMetadataInner, bool)`

GetResponseMetadataOk returns a tuple with the ResponseMetadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponseMetadata

`func (o *ReactionsListSchema) SetResponseMetadata(v []ObjsResponseMetadataInner)`

SetResponseMetadata sets ResponseMetadata field to given value.

### HasResponseMetadata

`func (o *ReactionsListSchema) HasResponseMetadata() bool`

HasResponseMetadata returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


