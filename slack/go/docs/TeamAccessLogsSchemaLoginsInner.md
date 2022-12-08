# TeamAccessLogsSchemaLoginsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Count** | **int32** |  | 
**Country** | **NullableString** |  | 
**DateFirst** | **int32** |  | 
**DateLast** | **int32** |  | 
**Ip** | **NullableString** |  | 
**Isp** | **NullableString** |  | 
**Region** | **NullableString** |  | 
**UserAgent** | **string** |  | 
**UserId** | **string** |  | 
**Username** | **string** |  | 

## Methods

### NewTeamAccessLogsSchemaLoginsInner

`func NewTeamAccessLogsSchemaLoginsInner(count int32, country NullableString, dateFirst int32, dateLast int32, ip NullableString, isp NullableString, region NullableString, userAgent string, userId string, username string, ) *TeamAccessLogsSchemaLoginsInner`

NewTeamAccessLogsSchemaLoginsInner instantiates a new TeamAccessLogsSchemaLoginsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTeamAccessLogsSchemaLoginsInnerWithDefaults

`func NewTeamAccessLogsSchemaLoginsInnerWithDefaults() *TeamAccessLogsSchemaLoginsInner`

NewTeamAccessLogsSchemaLoginsInnerWithDefaults instantiates a new TeamAccessLogsSchemaLoginsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCount

`func (o *TeamAccessLogsSchemaLoginsInner) GetCount() int32`

GetCount returns the Count field if non-nil, zero value otherwise.

### GetCountOk

`func (o *TeamAccessLogsSchemaLoginsInner) GetCountOk() (*int32, bool)`

GetCountOk returns a tuple with the Count field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCount

`func (o *TeamAccessLogsSchemaLoginsInner) SetCount(v int32)`

SetCount sets Count field to given value.


### GetCountry

`func (o *TeamAccessLogsSchemaLoginsInner) GetCountry() string`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *TeamAccessLogsSchemaLoginsInner) GetCountryOk() (*string, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *TeamAccessLogsSchemaLoginsInner) SetCountry(v string)`

SetCountry sets Country field to given value.


### SetCountryNil

`func (o *TeamAccessLogsSchemaLoginsInner) SetCountryNil(b bool)`

 SetCountryNil sets the value for Country to be an explicit nil

### UnsetCountry
`func (o *TeamAccessLogsSchemaLoginsInner) UnsetCountry()`

UnsetCountry ensures that no value is present for Country, not even an explicit nil
### GetDateFirst

`func (o *TeamAccessLogsSchemaLoginsInner) GetDateFirst() int32`

GetDateFirst returns the DateFirst field if non-nil, zero value otherwise.

### GetDateFirstOk

`func (o *TeamAccessLogsSchemaLoginsInner) GetDateFirstOk() (*int32, bool)`

GetDateFirstOk returns a tuple with the DateFirst field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDateFirst

`func (o *TeamAccessLogsSchemaLoginsInner) SetDateFirst(v int32)`

SetDateFirst sets DateFirst field to given value.


### GetDateLast

`func (o *TeamAccessLogsSchemaLoginsInner) GetDateLast() int32`

GetDateLast returns the DateLast field if non-nil, zero value otherwise.

### GetDateLastOk

`func (o *TeamAccessLogsSchemaLoginsInner) GetDateLastOk() (*int32, bool)`

GetDateLastOk returns a tuple with the DateLast field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDateLast

`func (o *TeamAccessLogsSchemaLoginsInner) SetDateLast(v int32)`

SetDateLast sets DateLast field to given value.


### GetIp

`func (o *TeamAccessLogsSchemaLoginsInner) GetIp() string`

GetIp returns the Ip field if non-nil, zero value otherwise.

### GetIpOk

`func (o *TeamAccessLogsSchemaLoginsInner) GetIpOk() (*string, bool)`

GetIpOk returns a tuple with the Ip field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIp

`func (o *TeamAccessLogsSchemaLoginsInner) SetIp(v string)`

SetIp sets Ip field to given value.


### SetIpNil

`func (o *TeamAccessLogsSchemaLoginsInner) SetIpNil(b bool)`

 SetIpNil sets the value for Ip to be an explicit nil

### UnsetIp
`func (o *TeamAccessLogsSchemaLoginsInner) UnsetIp()`

UnsetIp ensures that no value is present for Ip, not even an explicit nil
### GetIsp

`func (o *TeamAccessLogsSchemaLoginsInner) GetIsp() string`

GetIsp returns the Isp field if non-nil, zero value otherwise.

### GetIspOk

`func (o *TeamAccessLogsSchemaLoginsInner) GetIspOk() (*string, bool)`

GetIspOk returns a tuple with the Isp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsp

`func (o *TeamAccessLogsSchemaLoginsInner) SetIsp(v string)`

SetIsp sets Isp field to given value.


### SetIspNil

`func (o *TeamAccessLogsSchemaLoginsInner) SetIspNil(b bool)`

 SetIspNil sets the value for Isp to be an explicit nil

### UnsetIsp
`func (o *TeamAccessLogsSchemaLoginsInner) UnsetIsp()`

UnsetIsp ensures that no value is present for Isp, not even an explicit nil
### GetRegion

`func (o *TeamAccessLogsSchemaLoginsInner) GetRegion() string`

GetRegion returns the Region field if non-nil, zero value otherwise.

### GetRegionOk

`func (o *TeamAccessLogsSchemaLoginsInner) GetRegionOk() (*string, bool)`

GetRegionOk returns a tuple with the Region field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRegion

`func (o *TeamAccessLogsSchemaLoginsInner) SetRegion(v string)`

SetRegion sets Region field to given value.


### SetRegionNil

`func (o *TeamAccessLogsSchemaLoginsInner) SetRegionNil(b bool)`

 SetRegionNil sets the value for Region to be an explicit nil

### UnsetRegion
`func (o *TeamAccessLogsSchemaLoginsInner) UnsetRegion()`

UnsetRegion ensures that no value is present for Region, not even an explicit nil
### GetUserAgent

`func (o *TeamAccessLogsSchemaLoginsInner) GetUserAgent() string`

GetUserAgent returns the UserAgent field if non-nil, zero value otherwise.

### GetUserAgentOk

`func (o *TeamAccessLogsSchemaLoginsInner) GetUserAgentOk() (*string, bool)`

GetUserAgentOk returns a tuple with the UserAgent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserAgent

`func (o *TeamAccessLogsSchemaLoginsInner) SetUserAgent(v string)`

SetUserAgent sets UserAgent field to given value.


### GetUserId

`func (o *TeamAccessLogsSchemaLoginsInner) GetUserId() string`

GetUserId returns the UserId field if non-nil, zero value otherwise.

### GetUserIdOk

`func (o *TeamAccessLogsSchemaLoginsInner) GetUserIdOk() (*string, bool)`

GetUserIdOk returns a tuple with the UserId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserId

`func (o *TeamAccessLogsSchemaLoginsInner) SetUserId(v string)`

SetUserId sets UserId field to given value.


### GetUsername

`func (o *TeamAccessLogsSchemaLoginsInner) GetUsername() string`

GetUsername returns the Username field if non-nil, zero value otherwise.

### GetUsernameOk

`func (o *TeamAccessLogsSchemaLoginsInner) GetUsernameOk() (*string, bool)`

GetUsernameOk returns a tuple with the Username field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsername

`func (o *TeamAccessLogsSchemaLoginsInner) SetUsername(v string)`

SetUsername sets Username field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


