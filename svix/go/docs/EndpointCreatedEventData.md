# EndpointCreatedEventData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AppId** | **string** |  | 
**AppUid** | Pointer to **NullableString** | Optional unique identifier for the application | [optional] 
**EndpointId** | **string** |  | 
**EndpointUid** | Pointer to **NullableString** | Optional unique identifier for the endpoint | [optional] 

## Methods

### NewEndpointCreatedEventData

`func NewEndpointCreatedEventData(appId string, endpointId string, ) *EndpointCreatedEventData`

NewEndpointCreatedEventData instantiates a new EndpointCreatedEventData object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEndpointCreatedEventDataWithDefaults

`func NewEndpointCreatedEventDataWithDefaults() *EndpointCreatedEventData`

NewEndpointCreatedEventDataWithDefaults instantiates a new EndpointCreatedEventData object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAppId

`func (o *EndpointCreatedEventData) GetAppId() string`

GetAppId returns the AppId field if non-nil, zero value otherwise.

### GetAppIdOk

`func (o *EndpointCreatedEventData) GetAppIdOk() (*string, bool)`

GetAppIdOk returns a tuple with the AppId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAppId

`func (o *EndpointCreatedEventData) SetAppId(v string)`

SetAppId sets AppId field to given value.


### GetAppUid

`func (o *EndpointCreatedEventData) GetAppUid() string`

GetAppUid returns the AppUid field if non-nil, zero value otherwise.

### GetAppUidOk

`func (o *EndpointCreatedEventData) GetAppUidOk() (*string, bool)`

GetAppUidOk returns a tuple with the AppUid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAppUid

`func (o *EndpointCreatedEventData) SetAppUid(v string)`

SetAppUid sets AppUid field to given value.

### HasAppUid

`func (o *EndpointCreatedEventData) HasAppUid() bool`

HasAppUid returns a boolean if a field has been set.

### SetAppUidNil

`func (o *EndpointCreatedEventData) SetAppUidNil(b bool)`

 SetAppUidNil sets the value for AppUid to be an explicit nil

### UnsetAppUid
`func (o *EndpointCreatedEventData) UnsetAppUid()`

UnsetAppUid ensures that no value is present for AppUid, not even an explicit nil
### GetEndpointId

`func (o *EndpointCreatedEventData) GetEndpointId() string`

GetEndpointId returns the EndpointId field if non-nil, zero value otherwise.

### GetEndpointIdOk

`func (o *EndpointCreatedEventData) GetEndpointIdOk() (*string, bool)`

GetEndpointIdOk returns a tuple with the EndpointId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndpointId

`func (o *EndpointCreatedEventData) SetEndpointId(v string)`

SetEndpointId sets EndpointId field to given value.


### GetEndpointUid

`func (o *EndpointCreatedEventData) GetEndpointUid() string`

GetEndpointUid returns the EndpointUid field if non-nil, zero value otherwise.

### GetEndpointUidOk

`func (o *EndpointCreatedEventData) GetEndpointUidOk() (*string, bool)`

GetEndpointUidOk returns a tuple with the EndpointUid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndpointUid

`func (o *EndpointCreatedEventData) SetEndpointUid(v string)`

SetEndpointUid sets EndpointUid field to given value.

### HasEndpointUid

`func (o *EndpointCreatedEventData) HasEndpointUid() bool`

HasEndpointUid returns a boolean if a field has been set.

### SetEndpointUidNil

`func (o *EndpointCreatedEventData) SetEndpointUidNil(b bool)`

 SetEndpointUidNil sets the value for EndpointUid to be an explicit nil

### UnsetEndpointUid
`func (o *EndpointCreatedEventData) UnsetEndpointUid()`

UnsetEndpointUid ensures that no value is present for EndpointUid, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


