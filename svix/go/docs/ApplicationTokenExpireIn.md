# ApplicationTokenExpireIn

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Expiry** | Pointer to **NullableInt32** | How many seconds until the old key is expired. | [optional] 

## Methods

### NewApplicationTokenExpireIn

`func NewApplicationTokenExpireIn() *ApplicationTokenExpireIn`

NewApplicationTokenExpireIn instantiates a new ApplicationTokenExpireIn object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewApplicationTokenExpireInWithDefaults

`func NewApplicationTokenExpireInWithDefaults() *ApplicationTokenExpireIn`

NewApplicationTokenExpireInWithDefaults instantiates a new ApplicationTokenExpireIn object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetExpiry

`func (o *ApplicationTokenExpireIn) GetExpiry() int32`

GetExpiry returns the Expiry field if non-nil, zero value otherwise.

### GetExpiryOk

`func (o *ApplicationTokenExpireIn) GetExpiryOk() (*int32, bool)`

GetExpiryOk returns a tuple with the Expiry field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpiry

`func (o *ApplicationTokenExpireIn) SetExpiry(v int32)`

SetExpiry sets Expiry field to given value.

### HasExpiry

`func (o *ApplicationTokenExpireIn) HasExpiry() bool`

HasExpiry returns a boolean if a field has been set.

### SetExpiryNil

`func (o *ApplicationTokenExpireIn) SetExpiryNil(b bool)`

 SetExpiryNil sets the value for Expiry to be an explicit nil

### UnsetExpiry
`func (o *ApplicationTokenExpireIn) UnsetExpiry()`

UnsetExpiry ensures that no value is present for Expiry, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


