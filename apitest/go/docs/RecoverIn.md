# RecoverIn

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Since** | **time.Time** |  | 
**Until** | Pointer to **NullableTime** |  | [optional] 

## Methods

### NewRecoverIn

`func NewRecoverIn(since time.Time, ) *RecoverIn`

NewRecoverIn instantiates a new RecoverIn object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRecoverInWithDefaults

`func NewRecoverInWithDefaults() *RecoverIn`

NewRecoverInWithDefaults instantiates a new RecoverIn object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSince

`func (o *RecoverIn) GetSince() time.Time`

GetSince returns the Since field if non-nil, zero value otherwise.

### GetSinceOk

`func (o *RecoverIn) GetSinceOk() (*time.Time, bool)`

GetSinceOk returns a tuple with the Since field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSince

`func (o *RecoverIn) SetSince(v time.Time)`

SetSince sets Since field to given value.


### GetUntil

`func (o *RecoverIn) GetUntil() time.Time`

GetUntil returns the Until field if non-nil, zero value otherwise.

### GetUntilOk

`func (o *RecoverIn) GetUntilOk() (*time.Time, bool)`

GetUntilOk returns a tuple with the Until field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUntil

`func (o *RecoverIn) SetUntil(v time.Time)`

SetUntil sets Until field to given value.

### HasUntil

`func (o *RecoverIn) HasUntil() bool`

HasUntil returns a boolean if a field has been set.

### SetUntilNil

`func (o *RecoverIn) SetUntilNil(b bool)`

 SetUntilNil sets the value for Until to be an explicit nil

### UnsetUntil
`func (o *RecoverIn) UnsetUntil()`

UnsetUntil ensures that no value is present for Until, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


