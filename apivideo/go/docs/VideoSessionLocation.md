# VideoSessionLocation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**City** | Pointer to **string** | The city of the viewer. | [optional] 
**Country** | Pointer to **string** | The country of the viewer. | [optional] 

## Methods

### NewVideoSessionLocation

`func NewVideoSessionLocation() *VideoSessionLocation`

NewVideoSessionLocation instantiates a new VideoSessionLocation object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewVideoSessionLocationWithDefaults

`func NewVideoSessionLocationWithDefaults() *VideoSessionLocation`

NewVideoSessionLocationWithDefaults instantiates a new VideoSessionLocation object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCity

`func (o *VideoSessionLocation) GetCity() string`

GetCity returns the City field if non-nil, zero value otherwise.

### GetCityOk

`func (o *VideoSessionLocation) GetCityOk() (*string, bool)`

GetCityOk returns a tuple with the City field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCity

`func (o *VideoSessionLocation) SetCity(v string)`

SetCity sets City field to given value.

### HasCity

`func (o *VideoSessionLocation) HasCity() bool`

HasCity returns a boolean if a field has been set.

### GetCountry

`func (o *VideoSessionLocation) GetCountry() string`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *VideoSessionLocation) GetCountryOk() (*string, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *VideoSessionLocation) SetCountry(v string)`

SetCountry sets Country field to given value.

### HasCountry

`func (o *VideoSessionLocation) HasCountry() bool`

HasCountry returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


