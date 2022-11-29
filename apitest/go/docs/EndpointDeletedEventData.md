# EndpointDeletedEventData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AppId** | **string** |  | 
**AppUid** | Pointer to **NullableString** | Optional unique identifier for the application | [optional] 
**EndpointId** | **string** |  | 
**EndpointUid** | Pointer to **NullableString** | Optional unique identifier for the endpoint | [optional] 

## Methods

### NewEndpointDeletedEventData

`func NewEndpointDeletedEventData(appId string, endpointId string, ) *EndpointDeletedEventData`

NewEndpointDeletedEventData instantiates a new EndpointDeletedEventData object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEndpointDeletedEventDataWithDefaults

`func NewEndpointDeletedEventDataWithDefaults() *EndpointDeletedEventData`

NewEndpointDeletedEventDataWithDefaults instantiates a new EndpointDeletedEventData object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAppId

`func (o *EndpointDeletedEventData) GetAppId() string`

GetAppId returns the AppId field if non-nil, zero value otherwise.

### GetAppIdOk

`func (o *EndpointDeletedEventData) GetAppIdOk() (*string, bool)`

GetAppIdOk returns a tuple with the AppId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAppId

`func (o *EndpointDeletedEventData) SetAppId(v string)`

SetAppId sets AppId field to given value.


### GetAppUid

`func (o *EndpointDeletedEventData) GetAppUid() string`

GetAppUid returns the AppUid field if non-nil, zero value otherwise.

### GetAppUidOk

`func (o *EndpointDeletedEventData) GetAppUidOk() (*string, bool)`

GetAppUidOk returns a tuple with the AppUid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAppUid

`func (o *EndpointDeletedEventData) SetAppUid(v string)`

SetAppUid sets AppUid field to given value.

### HasAppUid

`func (o *EndpointDeletedEventData) HasAppUid() bool`

HasAppUid returns a boolean if a field has been set.

### SetAppUidNil

`func (o *EndpointDeletedEventData) SetAppUidNil(b bool)`

 SetAppUidNil sets the value for AppUid to be an explicit nil

### UnsetAppUid
`func (o *EndpointDeletedEventData) UnsetAppUid()`

UnsetAppUid ensures that no value is present for AppUid, not even an explicit nil
### GetEndpointId

`func (o *EndpointDeletedEventData) GetEndpointId() string`

GetEndpointId returns the EndpointId field if non-nil, zero value otherwise.

### GetEndpointIdOk

`func (o *EndpointDeletedEventData) GetEndpointIdOk() (*string, bool)`

GetEndpointIdOk returns a tuple with the EndpointId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndpointId

`func (o *EndpointDeletedEventData) SetEndpointId(v string)`

SetEndpointId sets EndpointId field to given value.


### GetEndpointUid

`func (o *EndpointDeletedEventData) GetEndpointUid() string`

GetEndpointUid returns the EndpointUid field if non-nil, zero value otherwise.

### GetEndpointUidOk

`func (o *EndpointDeletedEventData) GetEndpointUidOk() (*string, bool)`

GetEndpointUidOk returns a tuple with the EndpointUid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndpointUid

`func (o *EndpointDeletedEventData) SetEndpointUid(v string)`

SetEndpointUid sets EndpointUid field to given value.

### HasEndpointUid

`func (o *EndpointDeletedEventData) HasEndpointUid() bool`

HasEndpointUid returns a boolean if a field has been set.

### SetEndpointUidNil

`func (o *EndpointDeletedEventData) SetEndpointUidNil(b bool)`

 SetEndpointUidNil sets the value for EndpointUid to be an explicit nil

### UnsetEndpointUid
`func (o *EndpointDeletedEventData) UnsetEndpointUid()`

UnsetEndpointUid ensures that no value is present for EndpointUid, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


