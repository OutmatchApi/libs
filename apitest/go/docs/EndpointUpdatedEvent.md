# EndpointUpdatedEvent

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | Pointer to **string** |  | [optional] [default to "endpoint.updated"]
**Data** | [**EndpointUpdatedEventData**](EndpointUpdatedEventData.md) |  | 

## Methods

### NewEndpointUpdatedEvent

`func NewEndpointUpdatedEvent(data EndpointUpdatedEventData, ) *EndpointUpdatedEvent`

NewEndpointUpdatedEvent instantiates a new EndpointUpdatedEvent object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEndpointUpdatedEventWithDefaults

`func NewEndpointUpdatedEventWithDefaults() *EndpointUpdatedEvent`

NewEndpointUpdatedEventWithDefaults instantiates a new EndpointUpdatedEvent object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *EndpointUpdatedEvent) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *EndpointUpdatedEvent) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *EndpointUpdatedEvent) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *EndpointUpdatedEvent) HasType() bool`

HasType returns a boolean if a field has been set.

### GetData

`func (o *EndpointUpdatedEvent) GetData() EndpointUpdatedEventData`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *EndpointUpdatedEvent) GetDataOk() (*EndpointUpdatedEventData, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *EndpointUpdatedEvent) SetData(v EndpointUpdatedEventData)`

SetData sets Data field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


