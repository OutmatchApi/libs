# Sdk

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** |  | 
**Language** | [**Language**](Language.md) |  | 
**SdkVersion** | **string** |  | 
**CodeUrl** | **string** |  | 
**PackageUrl** | **string** |  | 
**Status** | [**Status**](Status.md) |  | 
**Error** | **string** |  | 

## Methods

### NewSdk

`func NewSdk(id string, language Language, sdkVersion string, codeUrl string, packageUrl string, status Status, error_ string, ) *Sdk`

NewSdk instantiates a new Sdk object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSdkWithDefaults

`func NewSdkWithDefaults() *Sdk`

NewSdkWithDefaults instantiates a new Sdk object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *Sdk) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Sdk) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Sdk) SetId(v string)`

SetId sets Id field to given value.


### GetLanguage

`func (o *Sdk) GetLanguage() Language`

GetLanguage returns the Language field if non-nil, zero value otherwise.

### GetLanguageOk

`func (o *Sdk) GetLanguageOk() (*Language, bool)`

GetLanguageOk returns a tuple with the Language field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLanguage

`func (o *Sdk) SetLanguage(v Language)`

SetLanguage sets Language field to given value.


### GetSdkVersion

`func (o *Sdk) GetSdkVersion() string`

GetSdkVersion returns the SdkVersion field if non-nil, zero value otherwise.

### GetSdkVersionOk

`func (o *Sdk) GetSdkVersionOk() (*string, bool)`

GetSdkVersionOk returns a tuple with the SdkVersion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSdkVersion

`func (o *Sdk) SetSdkVersion(v string)`

SetSdkVersion sets SdkVersion field to given value.


### GetCodeUrl

`func (o *Sdk) GetCodeUrl() string`

GetCodeUrl returns the CodeUrl field if non-nil, zero value otherwise.

### GetCodeUrlOk

`func (o *Sdk) GetCodeUrlOk() (*string, bool)`

GetCodeUrlOk returns a tuple with the CodeUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCodeUrl

`func (o *Sdk) SetCodeUrl(v string)`

SetCodeUrl sets CodeUrl field to given value.


### GetPackageUrl

`func (o *Sdk) GetPackageUrl() string`

GetPackageUrl returns the PackageUrl field if non-nil, zero value otherwise.

### GetPackageUrlOk

`func (o *Sdk) GetPackageUrlOk() (*string, bool)`

GetPackageUrlOk returns a tuple with the PackageUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPackageUrl

`func (o *Sdk) SetPackageUrl(v string)`

SetPackageUrl sets PackageUrl field to given value.


### GetStatus

`func (o *Sdk) GetStatus() Status`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *Sdk) GetStatusOk() (*Status, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *Sdk) SetStatus(v Status)`

SetStatus sets Status field to given value.


### GetError

`func (o *Sdk) GetError() string`

GetError returns the Error field if non-nil, zero value otherwise.

### GetErrorOk

`func (o *Sdk) GetErrorOk() (*string, bool)`

GetErrorOk returns a tuple with the Error field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetError

`func (o *Sdk) SetError(v string)`

SetError sets Error field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


