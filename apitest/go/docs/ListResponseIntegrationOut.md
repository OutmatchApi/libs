# ListResponseIntegrationOut

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | [**[]IntegrationOut**](IntegrationOut.md) |  | 
**Iterator** | Pointer to **NullableString** |  | [optional] 
**Done** | **bool** |  | 

## Methods

### NewListResponseIntegrationOut

`func NewListResponseIntegrationOut(data []IntegrationOut, done bool, ) *ListResponseIntegrationOut`

NewListResponseIntegrationOut instantiates a new ListResponseIntegrationOut object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewListResponseIntegrationOutWithDefaults

`func NewListResponseIntegrationOutWithDefaults() *ListResponseIntegrationOut`

NewListResponseIntegrationOutWithDefaults instantiates a new ListResponseIntegrationOut object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetData

`func (o *ListResponseIntegrationOut) GetData() []IntegrationOut`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *ListResponseIntegrationOut) GetDataOk() (*[]IntegrationOut, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *ListResponseIntegrationOut) SetData(v []IntegrationOut)`

SetData sets Data field to given value.


### GetIterator

`func (o *ListResponseIntegrationOut) GetIterator() string`

GetIterator returns the Iterator field if non-nil, zero value otherwise.

### GetIteratorOk

`func (o *ListResponseIntegrationOut) GetIteratorOk() (*string, bool)`

GetIteratorOk returns a tuple with the Iterator field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIterator

`func (o *ListResponseIntegrationOut) SetIterator(v string)`

SetIterator sets Iterator field to given value.

### HasIterator

`func (o *ListResponseIntegrationOut) HasIterator() bool`

HasIterator returns a boolean if a field has been set.

### SetIteratorNil

`func (o *ListResponseIntegrationOut) SetIteratorNil(b bool)`

 SetIteratorNil sets the value for Iterator to be an explicit nil

### UnsetIterator
`func (o *ListResponseIntegrationOut) UnsetIterator()`

UnsetIterator ensures that no value is present for Iterator, not even an explicit nil
### GetDone

`func (o *ListResponseIntegrationOut) GetDone() bool`

GetDone returns the Done field if non-nil, zero value otherwise.

### GetDoneOk

`func (o *ListResponseIntegrationOut) GetDoneOk() (*bool, bool)`

GetDoneOk returns a tuple with the Done field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDone

`func (o *ListResponseIntegrationOut) SetDone(v bool)`

SetDone sets Done field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


