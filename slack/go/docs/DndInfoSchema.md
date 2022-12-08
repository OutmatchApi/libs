# DndInfoSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DndEnabled** | **bool** |  | 
**NextDndEndTs** | **int32** |  | 
**NextDndStartTs** | **int32** |  | 
**Ok** | [**DefsOkTrue**](DefsOkTrue.md) |  | 
**SnoozeEnabled** | Pointer to **bool** |  | [optional] 
**SnoozeEndtime** | Pointer to **int32** |  | [optional] 
**SnoozeRemaining** | Pointer to **int32** |  | [optional] 

## Methods

### NewDndInfoSchema

`func NewDndInfoSchema(dndEnabled bool, nextDndEndTs int32, nextDndStartTs int32, ok DefsOkTrue, ) *DndInfoSchema`

NewDndInfoSchema instantiates a new DndInfoSchema object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewDndInfoSchemaWithDefaults

`func NewDndInfoSchemaWithDefaults() *DndInfoSchema`

NewDndInfoSchemaWithDefaults instantiates a new DndInfoSchema object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDndEnabled

`func (o *DndInfoSchema) GetDndEnabled() bool`

GetDndEnabled returns the DndEnabled field if non-nil, zero value otherwise.

### GetDndEnabledOk

`func (o *DndInfoSchema) GetDndEnabledOk() (*bool, bool)`

GetDndEnabledOk returns a tuple with the DndEnabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDndEnabled

`func (o *DndInfoSchema) SetDndEnabled(v bool)`

SetDndEnabled sets DndEnabled field to given value.


### GetNextDndEndTs

`func (o *DndInfoSchema) GetNextDndEndTs() int32`

GetNextDndEndTs returns the NextDndEndTs field if non-nil, zero value otherwise.

### GetNextDndEndTsOk

`func (o *DndInfoSchema) GetNextDndEndTsOk() (*int32, bool)`

GetNextDndEndTsOk returns a tuple with the NextDndEndTs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNextDndEndTs

`func (o *DndInfoSchema) SetNextDndEndTs(v int32)`

SetNextDndEndTs sets NextDndEndTs field to given value.


### GetNextDndStartTs

`func (o *DndInfoSchema) GetNextDndStartTs() int32`

GetNextDndStartTs returns the NextDndStartTs field if non-nil, zero value otherwise.

### GetNextDndStartTsOk

`func (o *DndInfoSchema) GetNextDndStartTsOk() (*int32, bool)`

GetNextDndStartTsOk returns a tuple with the NextDndStartTs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNextDndStartTs

`func (o *DndInfoSchema) SetNextDndStartTs(v int32)`

SetNextDndStartTs sets NextDndStartTs field to given value.


### GetOk

`func (o *DndInfoSchema) GetOk() DefsOkTrue`

GetOk returns the Ok field if non-nil, zero value otherwise.

### GetOkOk

`func (o *DndInfoSchema) GetOkOk() (*DefsOkTrue, bool)`

GetOkOk returns a tuple with the Ok field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOk

`func (o *DndInfoSchema) SetOk(v DefsOkTrue)`

SetOk sets Ok field to given value.


### GetSnoozeEnabled

`func (o *DndInfoSchema) GetSnoozeEnabled() bool`

GetSnoozeEnabled returns the SnoozeEnabled field if non-nil, zero value otherwise.

### GetSnoozeEnabledOk

`func (o *DndInfoSchema) GetSnoozeEnabledOk() (*bool, bool)`

GetSnoozeEnabledOk returns a tuple with the SnoozeEnabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSnoozeEnabled

`func (o *DndInfoSchema) SetSnoozeEnabled(v bool)`

SetSnoozeEnabled sets SnoozeEnabled field to given value.

### HasSnoozeEnabled

`func (o *DndInfoSchema) HasSnoozeEnabled() bool`

HasSnoozeEnabled returns a boolean if a field has been set.

### GetSnoozeEndtime

`func (o *DndInfoSchema) GetSnoozeEndtime() int32`

GetSnoozeEndtime returns the SnoozeEndtime field if non-nil, zero value otherwise.

### GetSnoozeEndtimeOk

`func (o *DndInfoSchema) GetSnoozeEndtimeOk() (*int32, bool)`

GetSnoozeEndtimeOk returns a tuple with the SnoozeEndtime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSnoozeEndtime

`func (o *DndInfoSchema) SetSnoozeEndtime(v int32)`

SetSnoozeEndtime sets SnoozeEndtime field to given value.

### HasSnoozeEndtime

`func (o *DndInfoSchema) HasSnoozeEndtime() bool`

HasSnoozeEndtime returns a boolean if a field has been set.

### GetSnoozeRemaining

`func (o *DndInfoSchema) GetSnoozeRemaining() int32`

GetSnoozeRemaining returns the SnoozeRemaining field if non-nil, zero value otherwise.

### GetSnoozeRemainingOk

`func (o *DndInfoSchema) GetSnoozeRemainingOk() (*int32, bool)`

GetSnoozeRemainingOk returns a tuple with the SnoozeRemaining field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSnoozeRemaining

`func (o *DndInfoSchema) SetSnoozeRemaining(v int32)`

SetSnoozeRemaining sets SnoozeRemaining field to given value.

### HasSnoozeRemaining

`func (o *DndInfoSchema) HasSnoozeRemaining() bool`

HasSnoozeRemaining returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


