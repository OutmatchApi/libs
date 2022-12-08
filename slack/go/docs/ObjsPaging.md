# ObjsPaging

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Count** | Pointer to **int32** |  | [optional] 
**Page** | **int32** |  | 
**Pages** | Pointer to **int32** |  | [optional] 
**PerPage** | Pointer to **int32** |  | [optional] 
**Spill** | Pointer to **int32** |  | [optional] 
**Total** | **int32** |  | 

## Methods

### NewObjsPaging

`func NewObjsPaging(page int32, total int32, ) *ObjsPaging`

NewObjsPaging instantiates a new ObjsPaging object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewObjsPagingWithDefaults

`func NewObjsPagingWithDefaults() *ObjsPaging`

NewObjsPagingWithDefaults instantiates a new ObjsPaging object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCount

`func (o *ObjsPaging) GetCount() int32`

GetCount returns the Count field if non-nil, zero value otherwise.

### GetCountOk

`func (o *ObjsPaging) GetCountOk() (*int32, bool)`

GetCountOk returns a tuple with the Count field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCount

`func (o *ObjsPaging) SetCount(v int32)`

SetCount sets Count field to given value.

### HasCount

`func (o *ObjsPaging) HasCount() bool`

HasCount returns a boolean if a field has been set.

### GetPage

`func (o *ObjsPaging) GetPage() int32`

GetPage returns the Page field if non-nil, zero value otherwise.

### GetPageOk

`func (o *ObjsPaging) GetPageOk() (*int32, bool)`

GetPageOk returns a tuple with the Page field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPage

`func (o *ObjsPaging) SetPage(v int32)`

SetPage sets Page field to given value.


### GetPages

`func (o *ObjsPaging) GetPages() int32`

GetPages returns the Pages field if non-nil, zero value otherwise.

### GetPagesOk

`func (o *ObjsPaging) GetPagesOk() (*int32, bool)`

GetPagesOk returns a tuple with the Pages field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPages

`func (o *ObjsPaging) SetPages(v int32)`

SetPages sets Pages field to given value.

### HasPages

`func (o *ObjsPaging) HasPages() bool`

HasPages returns a boolean if a field has been set.

### GetPerPage

`func (o *ObjsPaging) GetPerPage() int32`

GetPerPage returns the PerPage field if non-nil, zero value otherwise.

### GetPerPageOk

`func (o *ObjsPaging) GetPerPageOk() (*int32, bool)`

GetPerPageOk returns a tuple with the PerPage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPerPage

`func (o *ObjsPaging) SetPerPage(v int32)`

SetPerPage sets PerPage field to given value.

### HasPerPage

`func (o *ObjsPaging) HasPerPage() bool`

HasPerPage returns a boolean if a field has been set.

### GetSpill

`func (o *ObjsPaging) GetSpill() int32`

GetSpill returns the Spill field if non-nil, zero value otherwise.

### GetSpillOk

`func (o *ObjsPaging) GetSpillOk() (*int32, bool)`

GetSpillOk returns a tuple with the Spill field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSpill

`func (o *ObjsPaging) SetSpill(v int32)`

SetSpill sets Spill field to given value.

### HasSpill

`func (o *ObjsPaging) HasSpill() bool`

HasSpill returns a boolean if a field has been set.

### GetTotal

`func (o *ObjsPaging) GetTotal() int32`

GetTotal returns the Total field if non-nil, zero value otherwise.

### GetTotalOk

`func (o *ObjsPaging) GetTotalOk() (*int32, bool)`

GetTotalOk returns a tuple with the Total field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotal

`func (o *ObjsPaging) SetTotal(v int32)`

SetTotal sets Total field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


