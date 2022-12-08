# StarsListSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**[][]StarsListSchemaItemsInnerInner**]([]StarsListSchemaItemsInnerInner.md) |  | 
**Ok** | [**DefsOkTrue**](DefsOkTrue.md) |  | 
**Paging** | Pointer to [**ObjsPaging**](ObjsPaging.md) |  | [optional] 

## Methods

### NewStarsListSchema

`func NewStarsListSchema(items [][]StarsListSchemaItemsInnerInner, ok DefsOkTrue, ) *StarsListSchema`

NewStarsListSchema instantiates a new StarsListSchema object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewStarsListSchemaWithDefaults

`func NewStarsListSchemaWithDefaults() *StarsListSchema`

NewStarsListSchemaWithDefaults instantiates a new StarsListSchema object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItems

`func (o *StarsListSchema) GetItems() [][]StarsListSchemaItemsInnerInner`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *StarsListSchema) GetItemsOk() (*[][]StarsListSchemaItemsInnerInner, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *StarsListSchema) SetItems(v [][]StarsListSchemaItemsInnerInner)`

SetItems sets Items field to given value.


### GetOk

`func (o *StarsListSchema) GetOk() DefsOkTrue`

GetOk returns the Ok field if non-nil, zero value otherwise.

### GetOkOk

`func (o *StarsListSchema) GetOkOk() (*DefsOkTrue, bool)`

GetOkOk returns a tuple with the Ok field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOk

`func (o *StarsListSchema) SetOk(v DefsOkTrue)`

SetOk sets Ok field to given value.


### GetPaging

`func (o *StarsListSchema) GetPaging() ObjsPaging`

GetPaging returns the Paging field if non-nil, zero value otherwise.

### GetPagingOk

`func (o *StarsListSchema) GetPagingOk() (*ObjsPaging, bool)`

GetPagingOk returns a tuple with the Paging field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaging

`func (o *StarsListSchema) SetPaging(v ObjsPaging)`

SetPaging sets Paging field to given value.

### HasPaging

`func (o *StarsListSchema) HasPaging() bool`

HasPaging returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


