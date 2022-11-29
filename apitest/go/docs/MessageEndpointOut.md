# MessageEndpointOut

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
**Status** | [**MessageStatus**](MessageStatus.md) |  | 
**NextAttempt** | Pointer to **NullableTime** |  | [optional] 

## Methods

### NewMessageEndpointOut

`func NewMessageEndpointOut(url string, version int32, id string, createdAt time.Time, status MessageStatus, ) *MessageEndpointOut`

NewMessageEndpointOut instantiates a new MessageEndpointOut object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessageEndpointOutWithDefaults

`func NewMessageEndpointOutWithDefaults() *MessageEndpointOut`

NewMessageEndpointOutWithDefaults instantiates a new MessageEndpointOut object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUid

`func (o *MessageEndpointOut) GetUid() string`

GetUid returns the Uid field if non-nil, zero value otherwise.

### GetUidOk

`func (o *MessageEndpointOut) GetUidOk() (*string, bool)`

GetUidOk returns a tuple with the Uid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUid

`func (o *MessageEndpointOut) SetUid(v string)`

SetUid sets Uid field to given value.

### HasUid

`func (o *MessageEndpointOut) HasUid() bool`

HasUid returns a boolean if a field has been set.

### SetUidNil

`func (o *MessageEndpointOut) SetUidNil(b bool)`

 SetUidNil sets the value for Uid to be an explicit nil

### UnsetUid
`func (o *MessageEndpointOut) UnsetUid()`

UnsetUid ensures that no value is present for Uid, not even an explicit nil
### GetUrl

`func (o *MessageEndpointOut) GetUrl() string`

GetUrl returns the Url field if non-nil, zero value otherwise.

### GetUrlOk

`func (o *MessageEndpointOut) GetUrlOk() (*string, bool)`

GetUrlOk returns a tuple with the Url field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrl

`func (o *MessageEndpointOut) SetUrl(v string)`

SetUrl sets Url field to given value.


### GetVersion

`func (o *MessageEndpointOut) GetVersion() int32`

GetVersion returns the Version field if non-nil, zero value otherwise.

### GetVersionOk

`func (o *MessageEndpointOut) GetVersionOk() (*int32, bool)`

GetVersionOk returns a tuple with the Version field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersion

`func (o *MessageEndpointOut) SetVersion(v int32)`

SetVersion sets Version field to given value.


### GetDescription

`func (o *MessageEndpointOut) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *MessageEndpointOut) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *MessageEndpointOut) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *MessageEndpointOut) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetFilterTypes

`func (o *MessageEndpointOut) GetFilterTypes() []string`

GetFilterTypes returns the FilterTypes field if non-nil, zero value otherwise.

### GetFilterTypesOk

`func (o *MessageEndpointOut) GetFilterTypesOk() (*[]string, bool)`

GetFilterTypesOk returns a tuple with the FilterTypes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilterTypes

`func (o *MessageEndpointOut) SetFilterTypes(v []string)`

SetFilterTypes sets FilterTypes field to given value.

### HasFilterTypes

`func (o *MessageEndpointOut) HasFilterTypes() bool`

HasFilterTypes returns a boolean if a field has been set.

### SetFilterTypesNil

`func (o *MessageEndpointOut) SetFilterTypesNil(b bool)`

 SetFilterTypesNil sets the value for FilterTypes to be an explicit nil

### UnsetFilterTypes
`func (o *MessageEndpointOut) UnsetFilterTypes()`

UnsetFilterTypes ensures that no value is present for FilterTypes, not even an explicit nil
### GetChannels

`func (o *MessageEndpointOut) GetChannels() []string`

GetChannels returns the Channels field if non-nil, zero value otherwise.

### GetChannelsOk

`func (o *MessageEndpointOut) GetChannelsOk() (*[]string, bool)`

GetChannelsOk returns a tuple with the Channels field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChannels

`func (o *MessageEndpointOut) SetChannels(v []string)`

SetChannels sets Channels field to given value.

### HasChannels

`func (o *MessageEndpointOut) HasChannels() bool`

HasChannels returns a boolean if a field has been set.

### SetChannelsNil

`func (o *MessageEndpointOut) SetChannelsNil(b bool)`

 SetChannelsNil sets the value for Channels to be an explicit nil

### UnsetChannels
`func (o *MessageEndpointOut) UnsetChannels()`

UnsetChannels ensures that no value is present for Channels, not even an explicit nil
### GetDisabled

`func (o *MessageEndpointOut) GetDisabled() bool`

GetDisabled returns the Disabled field if non-nil, zero value otherwise.

### GetDisabledOk

`func (o *MessageEndpointOut) GetDisabledOk() (*bool, bool)`

GetDisabledOk returns a tuple with the Disabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisabled

`func (o *MessageEndpointOut) SetDisabled(v bool)`

SetDisabled sets Disabled field to given value.

### HasDisabled

`func (o *MessageEndpointOut) HasDisabled() bool`

HasDisabled returns a boolean if a field has been set.

### GetRateLimit

`func (o *MessageEndpointOut) GetRateLimit() int32`

GetRateLimit returns the RateLimit field if non-nil, zero value otherwise.

### GetRateLimitOk

`func (o *MessageEndpointOut) GetRateLimitOk() (*int32, bool)`

GetRateLimitOk returns a tuple with the RateLimit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRateLimit

`func (o *MessageEndpointOut) SetRateLimit(v int32)`

SetRateLimit sets RateLimit field to given value.

### HasRateLimit

`func (o *MessageEndpointOut) HasRateLimit() bool`

HasRateLimit returns a boolean if a field has been set.

### SetRateLimitNil

`func (o *MessageEndpointOut) SetRateLimitNil(b bool)`

 SetRateLimitNil sets the value for RateLimit to be an explicit nil

### UnsetRateLimit
`func (o *MessageEndpointOut) UnsetRateLimit()`

UnsetRateLimit ensures that no value is present for RateLimit, not even an explicit nil
### GetMetadata

`func (o *MessageEndpointOut) GetMetadata() map[string]string`

GetMetadata returns the Metadata field if non-nil, zero value otherwise.

### GetMetadataOk

`func (o *MessageEndpointOut) GetMetadataOk() (*map[string]string, bool)`

GetMetadataOk returns a tuple with the Metadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMetadata

`func (o *MessageEndpointOut) SetMetadata(v map[string]string)`

SetMetadata sets Metadata field to given value.

### HasMetadata

`func (o *MessageEndpointOut) HasMetadata() bool`

HasMetadata returns a boolean if a field has been set.

### SetMetadataNil

`func (o *MessageEndpointOut) SetMetadataNil(b bool)`

 SetMetadataNil sets the value for Metadata to be an explicit nil

### UnsetMetadata
`func (o *MessageEndpointOut) UnsetMetadata()`

UnsetMetadata ensures that no value is present for Metadata, not even an explicit nil
### GetId

`func (o *MessageEndpointOut) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *MessageEndpointOut) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *MessageEndpointOut) SetId(v string)`

SetId sets Id field to given value.


### GetCreatedAt

`func (o *MessageEndpointOut) GetCreatedAt() time.Time`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *MessageEndpointOut) GetCreatedAtOk() (*time.Time, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *MessageEndpointOut) SetCreatedAt(v time.Time)`

SetCreatedAt sets CreatedAt field to given value.


### GetStatus

`func (o *MessageEndpointOut) GetStatus() MessageStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *MessageEndpointOut) GetStatusOk() (*MessageStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *MessageEndpointOut) SetStatus(v MessageStatus)`

SetStatus sets Status field to given value.


### GetNextAttempt

`func (o *MessageEndpointOut) GetNextAttempt() time.Time`

GetNextAttempt returns the NextAttempt field if non-nil, zero value otherwise.

### GetNextAttemptOk

`func (o *MessageEndpointOut) GetNextAttemptOk() (*time.Time, bool)`

GetNextAttemptOk returns a tuple with the NextAttempt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNextAttempt

`func (o *MessageEndpointOut) SetNextAttempt(v time.Time)`

SetNextAttempt sets NextAttempt field to given value.

### HasNextAttempt

`func (o *MessageEndpointOut) HasNextAttempt() bool`

HasNextAttempt returns a boolean if a field has been set.

### SetNextAttemptNil

`func (o *MessageEndpointOut) SetNextAttemptNil(b bool)`

 SetNextAttemptNil sets the value for NextAttempt to be an explicit nil

### UnsetNextAttempt
`func (o *MessageEndpointOut) UnsetNextAttempt()`

UnsetNextAttempt ensures that no value is present for NextAttempt, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


