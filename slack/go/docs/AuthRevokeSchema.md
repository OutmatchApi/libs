# AuthRevokeSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ok** | [**DefsOkTrue**](DefsOkTrue.md) |  | 
**Revoked** | **bool** |  | 

## Methods

### NewAuthRevokeSchema

`func NewAuthRevokeSchema(ok DefsOkTrue, revoked bool, ) *AuthRevokeSchema`

NewAuthRevokeSchema instantiates a new AuthRevokeSchema object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAuthRevokeSchemaWithDefaults

`func NewAuthRevokeSchemaWithDefaults() *AuthRevokeSchema`

NewAuthRevokeSchemaWithDefaults instantiates a new AuthRevokeSchema object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOk

`func (o *AuthRevokeSchema) GetOk() DefsOkTrue`

GetOk returns the Ok field if non-nil, zero value otherwise.

### GetOkOk

`func (o *AuthRevokeSchema) GetOkOk() (*DefsOkTrue, bool)`

GetOkOk returns a tuple with the Ok field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOk

`func (o *AuthRevokeSchema) SetOk(v DefsOkTrue)`

SetOk sets Ok field to given value.


### GetRevoked

`func (o *AuthRevokeSchema) GetRevoked() bool`

GetRevoked returns the Revoked field if non-nil, zero value otherwise.

### GetRevokedOk

`func (o *AuthRevokeSchema) GetRevokedOk() (*bool, bool)`

GetRevokedOk returns a tuple with the Revoked field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRevoked

`func (o *AuthRevokeSchema) SetRevoked(v bool)`

SetRevoked sets Revoked field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


