# WebhookTypes

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**A** | [**EndpointDisabledEvent**](EndpointDisabledEvent.md) |  | 
**B** | [**EndpointCreatedEvent**](EndpointCreatedEvent.md) |  | 
**C** | [**EndpointUpdatedEvent**](EndpointUpdatedEvent.md) |  | 
**D** | [**EndpointDeletedEvent**](EndpointDeletedEvent.md) |  | 
**E** | [**MessageAttemptExhaustedEvent**](MessageAttemptExhaustedEvent.md) |  | 
**A1** | [**MessageAttemptFailingEvent**](MessageAttemptFailingEvent.md) |  | 

## Methods

### NewWebhookTypes

`func NewWebhookTypes(a EndpointDisabledEvent, b EndpointCreatedEvent, c EndpointUpdatedEvent, d EndpointDeletedEvent, e MessageAttemptExhaustedEvent, a1 MessageAttemptFailingEvent, ) *WebhookTypes`

NewWebhookTypes instantiates a new WebhookTypes object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewWebhookTypesWithDefaults

`func NewWebhookTypesWithDefaults() *WebhookTypes`

NewWebhookTypesWithDefaults instantiates a new WebhookTypes object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetA

`func (o *WebhookTypes) GetA() EndpointDisabledEvent`

GetA returns the A field if non-nil, zero value otherwise.

### GetAOk

`func (o *WebhookTypes) GetAOk() (*EndpointDisabledEvent, bool)`

GetAOk returns a tuple with the A field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetA

`func (o *WebhookTypes) SetA(v EndpointDisabledEvent)`

SetA sets A field to given value.


### GetB

`func (o *WebhookTypes) GetB() EndpointCreatedEvent`

GetB returns the B field if non-nil, zero value otherwise.

### GetBOk

`func (o *WebhookTypes) GetBOk() (*EndpointCreatedEvent, bool)`

GetBOk returns a tuple with the B field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetB

`func (o *WebhookTypes) SetB(v EndpointCreatedEvent)`

SetB sets B field to given value.


### GetC

`func (o *WebhookTypes) GetC() EndpointUpdatedEvent`

GetC returns the C field if non-nil, zero value otherwise.

### GetCOk

`func (o *WebhookTypes) GetCOk() (*EndpointUpdatedEvent, bool)`

GetCOk returns a tuple with the C field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetC

`func (o *WebhookTypes) SetC(v EndpointUpdatedEvent)`

SetC sets C field to given value.


### GetD

`func (o *WebhookTypes) GetD() EndpointDeletedEvent`

GetD returns the D field if non-nil, zero value otherwise.

### GetDOk

`func (o *WebhookTypes) GetDOk() (*EndpointDeletedEvent, bool)`

GetDOk returns a tuple with the D field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetD

`func (o *WebhookTypes) SetD(v EndpointDeletedEvent)`

SetD sets D field to given value.


### GetE

`func (o *WebhookTypes) GetE() MessageAttemptExhaustedEvent`

GetE returns the E field if non-nil, zero value otherwise.

### GetEOk

`func (o *WebhookTypes) GetEOk() (*MessageAttemptExhaustedEvent, bool)`

GetEOk returns a tuple with the E field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetE

`func (o *WebhookTypes) SetE(v MessageAttemptExhaustedEvent)`

SetE sets E field to given value.


### GetA1

`func (o *WebhookTypes) GetA1() MessageAttemptFailingEvent`

GetA1 returns the A1 field if non-nil, zero value otherwise.

### GetA1Ok

`func (o *WebhookTypes) GetA1Ok() (*MessageAttemptFailingEvent, bool)`

GetA1Ok returns a tuple with the A1 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetA1

`func (o *WebhookTypes) SetA1(v MessageAttemptFailingEvent)`

SetA1 sets A1 field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


