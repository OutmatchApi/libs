# ReplayIn

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Since** | **time.Time** |  | 
**Until** | Pointer to **NullableTime** |  | [optional] 

## Methods

### NewReplayIn

`func NewReplayIn(since time.Time, ) *ReplayIn`

NewReplayIn instantiates a new ReplayIn object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewReplayInWithDefaults

`func NewReplayInWithDefaults() *ReplayIn`

NewReplayInWithDefaults instantiates a new ReplayIn object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSince

`func (o *ReplayIn) GetSince() time.Time`

GetSince returns the Since field if non-nil, zero value otherwise.

### GetSinceOk

`func (o *ReplayIn) GetSinceOk() (*time.Time, bool)`

GetSinceOk returns a tuple with the Since field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSince

`func (o *ReplayIn) SetSince(v time.Time)`

SetSince sets Since field to given value.


### GetUntil

`func (o *ReplayIn) GetUntil() time.Time`

GetUntil returns the Until field if non-nil, zero value otherwise.

### GetUntilOk

`func (o *ReplayIn) GetUntilOk() (*time.Time, bool)`

GetUntilOk returns a tuple with the Until field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUntil

`func (o *ReplayIn) SetUntil(v time.Time)`

SetUntil sets Until field to given value.

### HasUntil

`func (o *ReplayIn) HasUntil() bool`

HasUntil returns a boolean if a field has been set.

### SetUntilNil

`func (o *ReplayIn) SetUntilNil(b bool)`

 SetUntilNil sets the value for Until to be an explicit nil

### UnsetUntil
`func (o *ReplayIn) UnsetUntil()`

UnsetUntil ensures that no value is present for Until, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


