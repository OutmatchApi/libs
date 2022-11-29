# EndpointIn

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Uid** | Pointer to **NullableString** | Optional unique identifier for the endpoint | [optional] 
**Url** | **string** |  | 
**Version** | **int32** |  | 
**Description** | Pointer to **string** |  | [optional] [default to ""]
**FilterTypes** | Pointer to **[]string** |  | [optional] 
**Channels** | Pointer to **[]string** | List of message channels this endpoint listens to (omit for all) | [optional] 
**Disabled** | Pointer to **bool** |  | [optional] [default to false]
**RateLimit** | Pointer to **NullableInt32** |  | [optional] 
**Metadata** | Pointer to **map[string]string** |  | [optional] 
**Secret** | Pointer to **NullableString** | The endpoint&#39;s verification secret. If &#x60;null&#x60; is passed, a secret is automatically generated. Format: &#x60;base64&#x60; encoded random bytes optionally prefixed with &#x60;whsec_&#x60;. Recommended size: 24. | [optional] 

## Methods

### NewEndpointIn

`func NewEndpointIn(url string, version int32, ) *EndpointIn`

NewEndpointIn instantiates a new EndpointIn object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEndpointInWithDefaults

`func NewEndpointInWithDefaults() *EndpointIn`

NewEndpointInWithDefaults instantiates a new EndpointIn object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUid

`func (o *EndpointIn) GetUid() string`

GetUid returns the Uid field if non-nil, zero value otherwise.

### GetUidOk

`func (o *EndpointIn) GetUidOk() (*string, bool)`

GetUidOk returns a tuple with the Uid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUid

`func (o *EndpointIn) SetUid(v string)`

SetUid sets Uid field to given value.

### HasUid

`func (o *EndpointIn) HasUid() bool`

HasUid returns a boolean if a field has been set.

### SetUidNil

`func (o *EndpointIn) SetUidNil(b bool)`

 SetUidNil sets the value for Uid to be an explicit nil

### UnsetUid
`func (o *EndpointIn) UnsetUid()`

UnsetUid ensures that no value is present for Uid, not even an explicit nil
### GetUrl

`func (o *EndpointIn) GetUrl() string`

GetUrl returns the Url field if non-nil, zero value otherwise.

### GetUrlOk

`func (o *EndpointIn) GetUrlOk() (*string, bool)`

GetUrlOk returns a tuple with the Url field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrl

`func (o *EndpointIn) SetUrl(v string)`

SetUrl sets Url field to given value.


### GetVersion

`func (o *EndpointIn) GetVersion() int32`

GetVersion returns the Version field if non-nil, zero value otherwise.

### GetVersionOk

`func (o *EndpointIn) GetVersionOk() (*int32, bool)`

GetVersionOk returns a tuple with the Version field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersion

`func (o *EndpointIn) SetVersion(v int32)`

SetVersion sets Version field to given value.


### GetDescription

`func (o *EndpointIn) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *EndpointIn) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *EndpointIn) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *EndpointIn) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetFilterTypes

`func (o *EndpointIn) GetFilterTypes() []string`

GetFilterTypes returns the FilterTypes field if non-nil, zero value otherwise.

### GetFilterTypesOk

`func (o *EndpointIn) GetFilterTypesOk() (*[]string, bool)`

GetFilterTypesOk returns a tuple with the FilterTypes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilterTypes

`func (o *EndpointIn) SetFilterTypes(v []string)`

SetFilterTypes sets FilterTypes field to given value.

### HasFilterTypes

`func (o *EndpointIn) HasFilterTypes() bool`

HasFilterTypes returns a boolean if a field has been set.

### SetFilterTypesNil

`func (o *EndpointIn) SetFilterTypesNil(b bool)`

 SetFilterTypesNil sets the value for FilterTypes to be an explicit nil

### UnsetFilterTypes
`func (o *EndpointIn) UnsetFilterTypes()`

UnsetFilterTypes ensures that no value is present for FilterTypes, not even an explicit nil
### GetChannels

`func (o *EndpointIn) GetChannels() []string`

GetChannels returns the Channels field if non-nil, zero value otherwise.

### GetChannelsOk

`func (o *EndpointIn) GetChannelsOk() (*[]string, bool)`

GetChannelsOk returns a tuple with the Channels field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChannels

`func (o *EndpointIn) SetChannels(v []string)`

SetChannels sets Channels field to given value.

### HasChannels

`func (o *EndpointIn) HasChannels() bool`

HasChannels returns a boolean if a field has been set.

### SetChannelsNil

`func (o *EndpointIn) SetChannelsNil(b bool)`

 SetChannelsNil sets the value for Channels to be an explicit nil

### UnsetChannels
`func (o *EndpointIn) UnsetChannels()`

UnsetChannels ensures that no value is present for Channels, not even an explicit nil
### GetDisabled

`func (o *EndpointIn) GetDisabled() bool`

GetDisabled returns the Disabled field if non-nil, zero value otherwise.

### GetDisabledOk

`func (o *EndpointIn) GetDisabledOk() (*bool, bool)`

GetDisabledOk returns a tuple with the Disabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisabled

`func (o *EndpointIn) SetDisabled(v bool)`

SetDisabled sets Disabled field to given value.

### HasDisabled

`func (o *EndpointIn) HasDisabled() bool`

HasDisabled returns a boolean if a field has been set.

### GetRateLimit

`func (o *EndpointIn) GetRateLimit() int32`

GetRateLimit returns the RateLimit field if non-nil, zero value otherwise.

### GetRateLimitOk

`func (o *EndpointIn) GetRateLimitOk() (*int32, bool)`

GetRateLimitOk returns a tuple with the RateLimit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRateLimit

`func (o *EndpointIn) SetRateLimit(v int32)`

SetRateLimit sets RateLimit field to given value.

### HasRateLimit

`func (o *EndpointIn) HasRateLimit() bool`

HasRateLimit returns a boolean if a field has been set.

### SetRateLimitNil

`func (o *EndpointIn) SetRateLimitNil(b bool)`

 SetRateLimitNil sets the value for RateLimit to be an explicit nil

### UnsetRateLimit
`func (o *EndpointIn) UnsetRateLimit()`

UnsetRateLimit ensures that no value is present for RateLimit, not even an explicit nil
### GetMetadata

`func (o *EndpointIn) GetMetadata() map[string]string`

GetMetadata returns the Metadata field if non-nil, zero value otherwise.

### GetMetadataOk

`func (o *EndpointIn) GetMetadataOk() (*map[string]string, bool)`

GetMetadataOk returns a tuple with the Metadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMetadata

`func (o *EndpointIn) SetMetadata(v map[string]string)`

SetMetadata sets Metadata field to given value.

### HasMetadata

`func (o *EndpointIn) HasMetadata() bool`

HasMetadata returns a boolean if a field has been set.

### SetMetadataNil

`func (o *EndpointIn) SetMetadataNil(b bool)`

 SetMetadataNil sets the value for Metadata to be an explicit nil

### UnsetMetadata
`func (o *EndpointIn) UnsetMetadata()`

UnsetMetadata ensures that no value is present for Metadata, not even an explicit nil
### GetSecret

`func (o *EndpointIn) GetSecret() string`

GetSecret returns the Secret field if non-nil, zero value otherwise.

### GetSecretOk

`func (o *EndpointIn) GetSecretOk() (*string, bool)`

GetSecretOk returns a tuple with the Secret field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSecret

`func (o *EndpointIn) SetSecret(v string)`

SetSecret sets Secret field to given value.

### HasSecret

`func (o *EndpointIn) HasSecret() bool`

HasSecret returns a boolean if a field has been set.

### SetSecretNil

`func (o *EndpointIn) SetSecretNil(b bool)`

 SetSecretNil sets the value for Secret to be an explicit nil

### UnsetSecret
`func (o *EndpointIn) UnsetSecret()`

UnsetSecret ensures that no value is present for Secret, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


