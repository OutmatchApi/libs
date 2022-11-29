# ListResponseEventTypeOut

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | [**[]EventTypeOut**](EventTypeOut.md) |  | 
**Iterator** | Pointer to **NullableString** |  | [optional] 
**Done** | **bool** |  | 

## Methods

### NewListResponseEventTypeOut

`func NewListResponseEventTypeOut(data []EventTypeOut, done bool, ) *ListResponseEventTypeOut`

NewListResponseEventTypeOut instantiates a new ListResponseEventTypeOut object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewListResponseEventTypeOutWithDefaults

`func NewListResponseEventTypeOutWithDefaults() *ListResponseEventTypeOut`

NewListResponseEventTypeOutWithDefaults instantiates a new ListResponseEventTypeOut object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetData

`func (o *ListResponseEventTypeOut) GetData() []EventTypeOut`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *ListResponseEventTypeOut) GetDataOk() (*[]EventTypeOut, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *ListResponseEventTypeOut) SetData(v []EventTypeOut)`

SetData sets Data field to given value.


### GetIterator

`func (o *ListResponseEventTypeOut) GetIterator() string`

GetIterator returns the Iterator field if non-nil, zero value otherwise.

### GetIteratorOk

`func (o *ListResponseEventTypeOut) GetIteratorOk() (*string, bool)`

GetIteratorOk returns a tuple with the Iterator field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIterator

`func (o *ListResponseEventTypeOut) SetIterator(v string)`

SetIterator sets Iterator field to given value.

### HasIterator

`func (o *ListResponseEventTypeOut) HasIterator() bool`

HasIterator returns a boolean if a field has been set.

### SetIteratorNil

`func (o *ListResponseEventTypeOut) SetIteratorNil(b bool)`

 SetIteratorNil sets the value for Iterator to be an explicit nil

### UnsetIterator
`func (o *ListResponseEventTypeOut) UnsetIterator()`

UnsetIterator ensures that no value is present for Iterator, not even an explicit nil
### GetDone

`func (o *ListResponseEventTypeOut) GetDone() bool`

GetDone returns the Done field if non-nil, zero value otherwise.

### GetDoneOk

`func (o *ListResponseEventTypeOut) GetDoneOk() (*bool, bool)`

GetDoneOk returns a tuple with the Done field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDone

`func (o *ListResponseEventTypeOut) SetDone(v bool)`

SetDone sets Done field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


