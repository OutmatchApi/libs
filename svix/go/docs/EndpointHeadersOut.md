# EndpointHeadersOut

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Headers** | **map[string]string** |  | 
**Sensitive** | **[]string** |  | 

## Methods

### NewEndpointHeadersOut

`func NewEndpointHeadersOut(headers map[string]string, sensitive []string, ) *EndpointHeadersOut`

NewEndpointHeadersOut instantiates a new EndpointHeadersOut object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEndpointHeadersOutWithDefaults

`func NewEndpointHeadersOutWithDefaults() *EndpointHeadersOut`

NewEndpointHeadersOutWithDefaults instantiates a new EndpointHeadersOut object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetHeaders

`func (o *EndpointHeadersOut) GetHeaders() map[string]string`

GetHeaders returns the Headers field if non-nil, zero value otherwise.

### GetHeadersOk

`func (o *EndpointHeadersOut) GetHeadersOk() (*map[string]string, bool)`

GetHeadersOk returns a tuple with the Headers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHeaders

`func (o *EndpointHeadersOut) SetHeaders(v map[string]string)`

SetHeaders sets Headers field to given value.


### GetSensitive

`func (o *EndpointHeadersOut) GetSensitive() []string`

GetSensitive returns the Sensitive field if non-nil, zero value otherwise.

### GetSensitiveOk

`func (o *EndpointHeadersOut) GetSensitiveOk() (*[]string, bool)`

GetSensitiveOk returns a tuple with the Sensitive field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSensitive

`func (o *EndpointHeadersOut) SetSensitive(v []string)`

SetSensitive sets Sensitive field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


