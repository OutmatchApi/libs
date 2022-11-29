# EndpointSecretRotateIn

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Key** | Pointer to **NullableString** | The endpoint&#39;s verification secret. If &#x60;null&#x60; is passed, a secret is automatically generated. Format: &#x60;base64&#x60; encoded random bytes optionally prefixed with &#x60;whsec_&#x60;. Recommended size: 24. | [optional] 

## Methods

### NewEndpointSecretRotateIn

`func NewEndpointSecretRotateIn() *EndpointSecretRotateIn`

NewEndpointSecretRotateIn instantiates a new EndpointSecretRotateIn object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEndpointSecretRotateInWithDefaults

`func NewEndpointSecretRotateInWithDefaults() *EndpointSecretRotateIn`

NewEndpointSecretRotateInWithDefaults instantiates a new EndpointSecretRotateIn object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetKey

`func (o *EndpointSecretRotateIn) GetKey() string`

GetKey returns the Key field if non-nil, zero value otherwise.

### GetKeyOk

`func (o *EndpointSecretRotateIn) GetKeyOk() (*string, bool)`

GetKeyOk returns a tuple with the Key field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKey

`func (o *EndpointSecretRotateIn) SetKey(v string)`

SetKey sets Key field to given value.

### HasKey

`func (o *EndpointSecretRotateIn) HasKey() bool`

HasKey returns a boolean if a field has been set.

### SetKeyNil

`func (o *EndpointSecretRotateIn) SetKeyNil(b bool)`

 SetKeyNil sets the value for Key to be an explicit nil

### UnsetKey
`func (o *EndpointSecretRotateIn) UnsetKey()`

UnsetKey ensures that no value is present for Key, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


