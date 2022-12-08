# ObjsResources

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ExcludedIds** | Pointer to [**[][]ObjsResourcesExcludedIdsInnerInner**]([]ObjsResourcesExcludedIdsInnerInner.md) |  | [optional] 
**Ids** | [**[][]ObjsResourcesExcludedIdsInnerInner**]([]ObjsResourcesExcludedIdsInnerInner.md) |  | 
**Wildcard** | Pointer to **bool** |  | [optional] 

## Methods

### NewObjsResources

`func NewObjsResources(ids [][]ObjsResourcesExcludedIdsInnerInner, ) *ObjsResources`

NewObjsResources instantiates a new ObjsResources object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewObjsResourcesWithDefaults

`func NewObjsResourcesWithDefaults() *ObjsResources`

NewObjsResourcesWithDefaults instantiates a new ObjsResources object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetExcludedIds

`func (o *ObjsResources) GetExcludedIds() [][]ObjsResourcesExcludedIdsInnerInner`

GetExcludedIds returns the ExcludedIds field if non-nil, zero value otherwise.

### GetExcludedIdsOk

`func (o *ObjsResources) GetExcludedIdsOk() (*[][]ObjsResourcesExcludedIdsInnerInner, bool)`

GetExcludedIdsOk returns a tuple with the ExcludedIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExcludedIds

`func (o *ObjsResources) SetExcludedIds(v [][]ObjsResourcesExcludedIdsInnerInner)`

SetExcludedIds sets ExcludedIds field to given value.

### HasExcludedIds

`func (o *ObjsResources) HasExcludedIds() bool`

HasExcludedIds returns a boolean if a field has been set.

### GetIds

`func (o *ObjsResources) GetIds() [][]ObjsResourcesExcludedIdsInnerInner`

GetIds returns the Ids field if non-nil, zero value otherwise.

### GetIdsOk

`func (o *ObjsResources) GetIdsOk() (*[][]ObjsResourcesExcludedIdsInnerInner, bool)`

GetIdsOk returns a tuple with the Ids field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIds

`func (o *ObjsResources) SetIds(v [][]ObjsResourcesExcludedIdsInnerInner)`

SetIds sets Ids field to given value.


### GetWildcard

`func (o *ObjsResources) GetWildcard() bool`

GetWildcard returns the Wildcard field if non-nil, zero value otherwise.

### GetWildcardOk

`func (o *ObjsResources) GetWildcardOk() (*bool, bool)`

GetWildcardOk returns a tuple with the Wildcard field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWildcard

`func (o *ObjsResources) SetWildcard(v bool)`

SetWildcard sets Wildcard field to given value.

### HasWildcard

`func (o *ObjsResources) HasWildcard() bool`

HasWildcard returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


