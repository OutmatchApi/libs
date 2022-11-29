# EndpointDisabledEventData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AppId** | **string** |  | 
**AppUid** | Pointer to **NullableString** | Optional unique identifier for the application | [optional] 
**EndpointId** | **string** |  | 
**EndpointUid** | Pointer to **NullableString** | Optional unique identifier for the endpoint | [optional] 
**FailSince** | **time.Time** |  | 

## Methods

### NewEndpointDisabledEventData

`func NewEndpointDisabledEventData(appId string, endpointId string, failSince time.Time, ) *EndpointDisabledEventData`

NewEndpointDisabledEventData instantiates a new EndpointDisabledEventData object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEndpointDisabledEventDataWithDefaults

`func NewEndpointDisabledEventDataWithDefaults() *EndpointDisabledEventData`

NewEndpointDisabledEventDataWithDefaults instantiates a new EndpointDisabledEventData object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAppId

`func (o *EndpointDisabledEventData) GetAppId() string`

GetAppId returns the AppId field if non-nil, zero value otherwise.

### GetAppIdOk

`func (o *EndpointDisabledEventData) GetAppIdOk() (*string, bool)`

GetAppIdOk returns a tuple with the AppId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAppId

`func (o *EndpointDisabledEventData) SetAppId(v string)`

SetAppId sets AppId field to given value.


### GetAppUid

`func (o *EndpointDisabledEventData) GetAppUid() string`

GetAppUid returns the AppUid field if non-nil, zero value otherwise.

### GetAppUidOk

`func (o *EndpointDisabledEventData) GetAppUidOk() (*string, bool)`

GetAppUidOk returns a tuple with the AppUid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAppUid

`func (o *EndpointDisabledEventData) SetAppUid(v string)`

SetAppUid sets AppUid field to given value.

### HasAppUid

`func (o *EndpointDisabledEventData) HasAppUid() bool`

HasAppUid returns a boolean if a field has been set.

### SetAppUidNil

`func (o *EndpointDisabledEventData) SetAppUidNil(b bool)`

 SetAppUidNil sets the value for AppUid to be an explicit nil

### UnsetAppUid
`func (o *EndpointDisabledEventData) UnsetAppUid()`

UnsetAppUid ensures that no value is present for AppUid, not even an explicit nil
### GetEndpointId

`func (o *EndpointDisabledEventData) GetEndpointId() string`

GetEndpointId returns the EndpointId field if non-nil, zero value otherwise.

### GetEndpointIdOk

`func (o *EndpointDisabledEventData) GetEndpointIdOk() (*string, bool)`

GetEndpointIdOk returns a tuple with the EndpointId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndpointId

`func (o *EndpointDisabledEventData) SetEndpointId(v string)`

SetEndpointId sets EndpointId field to given value.


### GetEndpointUid

`func (o *EndpointDisabledEventData) GetEndpointUid() string`

GetEndpointUid returns the EndpointUid field if non-nil, zero value otherwise.

### GetEndpointUidOk

`func (o *EndpointDisabledEventData) GetEndpointUidOk() (*string, bool)`

GetEndpointUidOk returns a tuple with the EndpointUid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndpointUid

`func (o *EndpointDisabledEventData) SetEndpointUid(v string)`

SetEndpointUid sets EndpointUid field to given value.

### HasEndpointUid

`func (o *EndpointDisabledEventData) HasEndpointUid() bool`

HasEndpointUid returns a boolean if a field has been set.

### SetEndpointUidNil

`func (o *EndpointDisabledEventData) SetEndpointUidNil(b bool)`

 SetEndpointUidNil sets the value for EndpointUid to be an explicit nil

### UnsetEndpointUid
`func (o *EndpointDisabledEventData) UnsetEndpointUid()`

UnsetEndpointUid ensures that no value is present for EndpointUid, not even an explicit nil
### GetFailSince

`func (o *EndpointDisabledEventData) GetFailSince() time.Time`

GetFailSince returns the FailSince field if non-nil, zero value otherwise.

### GetFailSinceOk

`func (o *EndpointDisabledEventData) GetFailSinceOk() (*time.Time, bool)`

GetFailSinceOk returns a tuple with the FailSince field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFailSince

`func (o *EndpointDisabledEventData) SetFailSince(v time.Time)`

SetFailSince sets FailSince field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


