# DndEndSnoozeSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DndEnabled** | **bool** |  | 
**NextDndEndTs** | **int32** |  | 
**NextDndStartTs** | **int32** |  | 
**Ok** | [**DefsOkTrue**](DefsOkTrue.md) |  | 
**SnoozeEnabled** | **bool** |  | 

## Methods

### NewDndEndSnoozeSchema

`func NewDndEndSnoozeSchema(dndEnabled bool, nextDndEndTs int32, nextDndStartTs int32, ok DefsOkTrue, snoozeEnabled bool, ) *DndEndSnoozeSchema`

NewDndEndSnoozeSchema instantiates a new DndEndSnoozeSchema object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewDndEndSnoozeSchemaWithDefaults

`func NewDndEndSnoozeSchemaWithDefaults() *DndEndSnoozeSchema`

NewDndEndSnoozeSchemaWithDefaults instantiates a new DndEndSnoozeSchema object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDndEnabled

`func (o *DndEndSnoozeSchema) GetDndEnabled() bool`

GetDndEnabled returns the DndEnabled field if non-nil, zero value otherwise.

### GetDndEnabledOk

`func (o *DndEndSnoozeSchema) GetDndEnabledOk() (*bool, bool)`

GetDndEnabledOk returns a tuple with the DndEnabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDndEnabled

`func (o *DndEndSnoozeSchema) SetDndEnabled(v bool)`

SetDndEnabled sets DndEnabled field to given value.


### GetNextDndEndTs

`func (o *DndEndSnoozeSchema) GetNextDndEndTs() int32`

GetNextDndEndTs returns the NextDndEndTs field if non-nil, zero value otherwise.

### GetNextDndEndTsOk

`func (o *DndEndSnoozeSchema) GetNextDndEndTsOk() (*int32, bool)`

GetNextDndEndTsOk returns a tuple with the NextDndEndTs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNextDndEndTs

`func (o *DndEndSnoozeSchema) SetNextDndEndTs(v int32)`

SetNextDndEndTs sets NextDndEndTs field to given value.


### GetNextDndStartTs

`func (o *DndEndSnoozeSchema) GetNextDndStartTs() int32`

GetNextDndStartTs returns the NextDndStartTs field if non-nil, zero value otherwise.

### GetNextDndStartTsOk

`func (o *DndEndSnoozeSchema) GetNextDndStartTsOk() (*int32, bool)`

GetNextDndStartTsOk returns a tuple with the NextDndStartTs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNextDndStartTs

`func (o *DndEndSnoozeSchema) SetNextDndStartTs(v int32)`

SetNextDndStartTs sets NextDndStartTs field to given value.


### GetOk

`func (o *DndEndSnoozeSchema) GetOk() DefsOkTrue`

GetOk returns the Ok field if non-nil, zero value otherwise.

### GetOkOk

`func (o *DndEndSnoozeSchema) GetOkOk() (*DefsOkTrue, bool)`

GetOkOk returns a tuple with the Ok field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOk

`func (o *DndEndSnoozeSchema) SetOk(v DefsOkTrue)`

SetOk sets Ok field to given value.


### GetSnoozeEnabled

`func (o *DndEndSnoozeSchema) GetSnoozeEnabled() bool`

GetSnoozeEnabled returns the SnoozeEnabled field if non-nil, zero value otherwise.

### GetSnoozeEnabledOk

`func (o *DndEndSnoozeSchema) GetSnoozeEnabledOk() (*bool, bool)`

GetSnoozeEnabledOk returns a tuple with the SnoozeEnabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSnoozeEnabled

`func (o *DndEndSnoozeSchema) SetSnoozeEnabled(v bool)`

SetSnoozeEnabled sets SnoozeEnabled field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


