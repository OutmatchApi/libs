# EndpointOut

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
**Id** | **string** |  | 
**CreatedAt** | **time.Time** |  | 
**UpdatedAt** | **time.Time** |  | 

## Methods

### NewEndpointOut

`func NewEndpointOut(url string, version int32, id string, createdAt time.Time, updatedAt time.Time, ) *EndpointOut`

NewEndpointOut instantiates a new EndpointOut object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEndpointOutWithDefaults

`func NewEndpointOutWithDefaults() *EndpointOut`

NewEndpointOutWithDefaults instantiates a new EndpointOut object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUid

`func (o *EndpointOut) GetUid() string`

GetUid returns the Uid field if non-nil, zero value otherwise.

### GetUidOk

`func (o *EndpointOut) GetUidOk() (*string, bool)`

GetUidOk returns a tuple with the Uid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUid

`func (o *EndpointOut) SetUid(v string)`

SetUid sets Uid field to given value.

### HasUid

`func (o *EndpointOut) HasUid() bool`

HasUid returns a boolean if a field has been set.

### SetUidNil

`func (o *EndpointOut) SetUidNil(b bool)`

 SetUidNil sets the value for Uid to be an explicit nil

### UnsetUid
`func (o *EndpointOut) UnsetUid()`

UnsetUid ensures that no value is present for Uid, not even an explicit nil
### GetUrl

`func (o *EndpointOut) GetUrl() string`

GetUrl returns the Url field if non-nil, zero value otherwise.

### GetUrlOk

`func (o *EndpointOut) GetUrlOk() (*string, bool)`

GetUrlOk returns a tuple with the Url field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrl

`func (o *EndpointOut) SetUrl(v string)`

SetUrl sets Url field to given value.


### GetVersion

`func (o *EndpointOut) GetVersion() int32`

GetVersion returns the Version field if non-nil, zero value otherwise.

### GetVersionOk

`func (o *EndpointOut) GetVersionOk() (*int32, bool)`

GetVersionOk returns a tuple with the Version field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersion

`func (o *EndpointOut) SetVersion(v int32)`

SetVersion sets Version field to given value.


### GetDescription

`func (o *EndpointOut) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *EndpointOut) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *EndpointOut) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *EndpointOut) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetFilterTypes

`func (o *EndpointOut) GetFilterTypes() []string`

GetFilterTypes returns the FilterTypes field if non-nil, zero value otherwise.

### GetFilterTypesOk

`func (o *EndpointOut) GetFilterTypesOk() (*[]string, bool)`

GetFilterTypesOk returns a tuple with the FilterTypes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilterTypes

`func (o *EndpointOut) SetFilterTypes(v []string)`

SetFilterTypes sets FilterTypes field to given value.

### HasFilterTypes

`func (o *EndpointOut) HasFilterTypes() bool`

HasFilterTypes returns a boolean if a field has been set.

### SetFilterTypesNil

`func (o *EndpointOut) SetFilterTypesNil(b bool)`

 SetFilterTypesNil sets the value for FilterTypes to be an explicit nil

### UnsetFilterTypes
`func (o *EndpointOut) UnsetFilterTypes()`

UnsetFilterTypes ensures that no value is present for FilterTypes, not even an explicit nil
### GetChannels

`func (o *EndpointOut) GetChannels() []string`

GetChannels returns the Channels field if non-nil, zero value otherwise.

### GetChannelsOk

`func (o *EndpointOut) GetChannelsOk() (*[]string, bool)`

GetChannelsOk returns a tuple with the Channels field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChannels

`func (o *EndpointOut) SetChannels(v []string)`

SetChannels sets Channels field to given value.

### HasChannels

`func (o *EndpointOut) HasChannels() bool`

HasChannels returns a boolean if a field has been set.

### SetChannelsNil

`func (o *EndpointOut) SetChannelsNil(b bool)`

 SetChannelsNil sets the value for Channels to be an explicit nil

### UnsetChannels
`func (o *EndpointOut) UnsetChannels()`

UnsetChannels ensures that no value is present for Channels, not even an explicit nil
### GetDisabled

`func (o *EndpointOut) GetDisabled() bool`

GetDisabled returns the Disabled field if non-nil, zero value otherwise.

### GetDisabledOk

`func (o *EndpointOut) GetDisabledOk() (*bool, bool)`

GetDisabledOk returns a tuple with the Disabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisabled

`func (o *EndpointOut) SetDisabled(v bool)`

SetDisabled sets Disabled field to given value.

### HasDisabled

`func (o *EndpointOut) HasDisabled() bool`

HasDisabled returns a boolean if a field has been set.

### GetRateLimit

`func (o *EndpointOut) GetRateLimit() int32`

GetRateLimit returns the RateLimit field if non-nil, zero value otherwise.

### GetRateLimitOk

`func (o *EndpointOut) GetRateLimitOk() (*int32, bool)`

GetRateLimitOk returns a tuple with the RateLimit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRateLimit

`func (o *EndpointOut) SetRateLimit(v int32)`

SetRateLimit sets RateLimit field to given value.

### HasRateLimit

`func (o *EndpointOut) HasRateLimit() bool`

HasRateLimit returns a boolean if a field has been set.

### SetRateLimitNil

`func (o *EndpointOut) SetRateLimitNil(b bool)`

 SetRateLimitNil sets the value for RateLimit to be an explicit nil

### UnsetRateLimit
`func (o *EndpointOut) UnsetRateLimit()`

UnsetRateLimit ensures that no value is present for RateLimit, not even an explicit nil
### GetMetadata

`func (o *EndpointOut) GetMetadata() map[string]string`

GetMetadata returns the Metadata field if non-nil, zero value otherwise.

### GetMetadataOk

`func (o *EndpointOut) GetMetadataOk() (*map[string]string, bool)`

GetMetadataOk returns a tuple with the Metadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMetadata

`func (o *EndpointOut) SetMetadata(v map[string]string)`

SetMetadata sets Metadata field to given value.

### HasMetadata

`func (o *EndpointOut) HasMetadata() bool`

HasMetadata returns a boolean if a field has been set.

### SetMetadataNil

`func (o *EndpointOut) SetMetadataNil(b bool)`

 SetMetadataNil sets the value for Metadata to be an explicit nil

### UnsetMetadata
`func (o *EndpointOut) UnsetMetadata()`

UnsetMetadata ensures that no value is present for Metadata, not even an explicit nil
### GetId

`func (o *EndpointOut) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *EndpointOut) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *EndpointOut) SetId(v string)`

SetId sets Id field to given value.


### GetCreatedAt

`func (o *EndpointOut) GetCreatedAt() time.Time`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *EndpointOut) GetCreatedAtOk() (*time.Time, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *EndpointOut) SetCreatedAt(v time.Time)`

SetCreatedAt sets CreatedAt field to given value.


### GetUpdatedAt

`func (o *EndpointOut) GetUpdatedAt() time.Time`

GetUpdatedAt returns the UpdatedAt field if non-nil, zero value otherwise.

### GetUpdatedAtOk

`func (o *EndpointOut) GetUpdatedAtOk() (*time.Time, bool)`

GetUpdatedAtOk returns a tuple with the UpdatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedAt

`func (o *EndpointOut) SetUpdatedAt(v time.Time)`

SetUpdatedAt sets UpdatedAt field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


