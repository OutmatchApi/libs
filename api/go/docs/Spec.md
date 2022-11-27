# Spec

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** |  | 
**SpecType** | **string** |  | 
**Link** | **string** |  | 
**Title** | **string** |  | 
**Description** | **string** |  | 
**Version** | **string** |  | 
**Logo** | [**Logo**](Logo.md) |  | 

## Methods

### NewSpec

`func NewSpec(id string, specType string, link string, title string, description string, version string, logo Logo, ) *Spec`

NewSpec instantiates a new Spec object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSpecWithDefaults

`func NewSpecWithDefaults() *Spec`

NewSpecWithDefaults instantiates a new Spec object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *Spec) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Spec) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Spec) SetId(v string)`

SetId sets Id field to given value.


### GetSpecType

`func (o *Spec) GetSpecType() string`

GetSpecType returns the SpecType field if non-nil, zero value otherwise.

### GetSpecTypeOk

`func (o *Spec) GetSpecTypeOk() (*string, bool)`

GetSpecTypeOk returns a tuple with the SpecType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSpecType

`func (o *Spec) SetSpecType(v string)`

SetSpecType sets SpecType field to given value.


### GetLink

`func (o *Spec) GetLink() string`

GetLink returns the Link field if non-nil, zero value otherwise.

### GetLinkOk

`func (o *Spec) GetLinkOk() (*string, bool)`

GetLinkOk returns a tuple with the Link field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLink

`func (o *Spec) SetLink(v string)`

SetLink sets Link field to given value.


### GetTitle

`func (o *Spec) GetTitle() string`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *Spec) GetTitleOk() (*string, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *Spec) SetTitle(v string)`

SetTitle sets Title field to given value.


### GetDescription

`func (o *Spec) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *Spec) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *Spec) SetDescription(v string)`

SetDescription sets Description field to given value.


### GetVersion

`func (o *Spec) GetVersion() string`

GetVersion returns the Version field if non-nil, zero value otherwise.

### GetVersionOk

`func (o *Spec) GetVersionOk() (*string, bool)`

GetVersionOk returns a tuple with the Version field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersion

`func (o *Spec) SetVersion(v string)`

SetVersion sets Version field to given value.


### GetLogo

`func (o *Spec) GetLogo() Logo`

GetLogo returns the Logo field if non-nil, zero value otherwise.

### GetLogoOk

`func (o *Spec) GetLogoOk() (*Logo, bool)`

GetLogoOk returns a tuple with the Logo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLogo

`func (o *Spec) SetLogo(v Logo)`

SetLogo sets Logo field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


