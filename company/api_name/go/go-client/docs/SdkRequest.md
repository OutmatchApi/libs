# SdkRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Languages** | Pointer to [**[]Language**](Language.md) |  | [optional] 

## Methods

### NewSdkRequest

`func NewSdkRequest() *SdkRequest`

NewSdkRequest instantiates a new SdkRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSdkRequestWithDefaults

`func NewSdkRequestWithDefaults() *SdkRequest`

NewSdkRequestWithDefaults instantiates a new SdkRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLanguages

`func (o *SdkRequest) GetLanguages() []Language`

GetLanguages returns the Languages field if non-nil, zero value otherwise.

### GetLanguagesOk

`func (o *SdkRequest) GetLanguagesOk() (*[]Language, bool)`

GetLanguagesOk returns a tuple with the Languages field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLanguages

`func (o *SdkRequest) SetLanguages(v []Language)`

SetLanguages sets Languages field to given value.

### HasLanguages

`func (o *SdkRequest) HasLanguages() bool`

HasLanguages returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


