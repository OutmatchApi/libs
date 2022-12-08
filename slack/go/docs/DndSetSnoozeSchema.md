# DndSetSnoozeSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ok** | [**DefsOkTrue**](DefsOkTrue.md) |  | 
**SnoozeEnabled** | **bool** |  | 
**SnoozeEndtime** | **int32** |  | 
**SnoozeRemaining** | **int32** |  | 

## Methods

### NewDndSetSnoozeSchema

`func NewDndSetSnoozeSchema(ok DefsOkTrue, snoozeEnabled bool, snoozeEndtime int32, snoozeRemaining int32, ) *DndSetSnoozeSchema`

NewDndSetSnoozeSchema instantiates a new DndSetSnoozeSchema object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewDndSetSnoozeSchemaWithDefaults

`func NewDndSetSnoozeSchemaWithDefaults() *DndSetSnoozeSchema`

NewDndSetSnoozeSchemaWithDefaults instantiates a new DndSetSnoozeSchema object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOk

`func (o *DndSetSnoozeSchema) GetOk() DefsOkTrue`

GetOk returns the Ok field if non-nil, zero value otherwise.

### GetOkOk

`func (o *DndSetSnoozeSchema) GetOkOk() (*DefsOkTrue, bool)`

GetOkOk returns a tuple with the Ok field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOk

`func (o *DndSetSnoozeSchema) SetOk(v DefsOkTrue)`

SetOk sets Ok field to given value.


### GetSnoozeEnabled

`func (o *DndSetSnoozeSchema) GetSnoozeEnabled() bool`

GetSnoozeEnabled returns the SnoozeEnabled field if non-nil, zero value otherwise.

### GetSnoozeEnabledOk

`func (o *DndSetSnoozeSchema) GetSnoozeEnabledOk() (*bool, bool)`

GetSnoozeEnabledOk returns a tuple with the SnoozeEnabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSnoozeEnabled

`func (o *DndSetSnoozeSchema) SetSnoozeEnabled(v bool)`

SetSnoozeEnabled sets SnoozeEnabled field to given value.


### GetSnoozeEndtime

`func (o *DndSetSnoozeSchema) GetSnoozeEndtime() int32`

GetSnoozeEndtime returns the SnoozeEndtime field if non-nil, zero value otherwise.

### GetSnoozeEndtimeOk

`func (o *DndSetSnoozeSchema) GetSnoozeEndtimeOk() (*int32, bool)`

GetSnoozeEndtimeOk returns a tuple with the SnoozeEndtime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSnoozeEndtime

`func (o *DndSetSnoozeSchema) SetSnoozeEndtime(v int32)`

SetSnoozeEndtime sets SnoozeEndtime field to given value.


### GetSnoozeRemaining

`func (o *DndSetSnoozeSchema) GetSnoozeRemaining() int32`

GetSnoozeRemaining returns the SnoozeRemaining field if non-nil, zero value otherwise.

### GetSnoozeRemainingOk

`func (o *DndSetSnoozeSchema) GetSnoozeRemainingOk() (*int32, bool)`

GetSnoozeRemainingOk returns a tuple with the SnoozeRemaining field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSnoozeRemaining

`func (o *DndSetSnoozeSchema) SetSnoozeRemaining(v int32)`

SetSnoozeRemaining sets SnoozeRemaining field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


