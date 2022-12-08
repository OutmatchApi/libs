# TeamIntegrationLogsSchemaLogsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdminAppId** | Pointer to **string** |  | [optional] 
**AppId** | **string** |  | 
**AppType** | **string** |  | 
**ChangeType** | **string** |  | 
**Channel** | Pointer to **string** |  | [optional] 
**Date** | **string** |  | 
**Scope** | **string** |  | 
**ServiceId** | Pointer to **string** |  | [optional] 
**ServiceType** | Pointer to **string** |  | [optional] 
**UserId** | **string** |  | 
**UserName** | **string** |  | 

## Methods

### NewTeamIntegrationLogsSchemaLogsInner

`func NewTeamIntegrationLogsSchemaLogsInner(appId string, appType string, changeType string, date string, scope string, userId string, userName string, ) *TeamIntegrationLogsSchemaLogsInner`

NewTeamIntegrationLogsSchemaLogsInner instantiates a new TeamIntegrationLogsSchemaLogsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTeamIntegrationLogsSchemaLogsInnerWithDefaults

`func NewTeamIntegrationLogsSchemaLogsInnerWithDefaults() *TeamIntegrationLogsSchemaLogsInner`

NewTeamIntegrationLogsSchemaLogsInnerWithDefaults instantiates a new TeamIntegrationLogsSchemaLogsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdminAppId

`func (o *TeamIntegrationLogsSchemaLogsInner) GetAdminAppId() string`

GetAdminAppId returns the AdminAppId field if non-nil, zero value otherwise.

### GetAdminAppIdOk

`func (o *TeamIntegrationLogsSchemaLogsInner) GetAdminAppIdOk() (*string, bool)`

GetAdminAppIdOk returns a tuple with the AdminAppId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdminAppId

`func (o *TeamIntegrationLogsSchemaLogsInner) SetAdminAppId(v string)`

SetAdminAppId sets AdminAppId field to given value.

### HasAdminAppId

`func (o *TeamIntegrationLogsSchemaLogsInner) HasAdminAppId() bool`

HasAdminAppId returns a boolean if a field has been set.

### GetAppId

`func (o *TeamIntegrationLogsSchemaLogsInner) GetAppId() string`

GetAppId returns the AppId field if non-nil, zero value otherwise.

### GetAppIdOk

`func (o *TeamIntegrationLogsSchemaLogsInner) GetAppIdOk() (*string, bool)`

GetAppIdOk returns a tuple with the AppId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAppId

`func (o *TeamIntegrationLogsSchemaLogsInner) SetAppId(v string)`

SetAppId sets AppId field to given value.


### GetAppType

`func (o *TeamIntegrationLogsSchemaLogsInner) GetAppType() string`

GetAppType returns the AppType field if non-nil, zero value otherwise.

### GetAppTypeOk

`func (o *TeamIntegrationLogsSchemaLogsInner) GetAppTypeOk() (*string, bool)`

GetAppTypeOk returns a tuple with the AppType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAppType

`func (o *TeamIntegrationLogsSchemaLogsInner) SetAppType(v string)`

SetAppType sets AppType field to given value.


### GetChangeType

`func (o *TeamIntegrationLogsSchemaLogsInner) GetChangeType() string`

GetChangeType returns the ChangeType field if non-nil, zero value otherwise.

### GetChangeTypeOk

`func (o *TeamIntegrationLogsSchemaLogsInner) GetChangeTypeOk() (*string, bool)`

GetChangeTypeOk returns a tuple with the ChangeType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChangeType

`func (o *TeamIntegrationLogsSchemaLogsInner) SetChangeType(v string)`

SetChangeType sets ChangeType field to given value.


### GetChannel

`func (o *TeamIntegrationLogsSchemaLogsInner) GetChannel() string`

GetChannel returns the Channel field if non-nil, zero value otherwise.

### GetChannelOk

`func (o *TeamIntegrationLogsSchemaLogsInner) GetChannelOk() (*string, bool)`

GetChannelOk returns a tuple with the Channel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChannel

`func (o *TeamIntegrationLogsSchemaLogsInner) SetChannel(v string)`

SetChannel sets Channel field to given value.

### HasChannel

`func (o *TeamIntegrationLogsSchemaLogsInner) HasChannel() bool`

HasChannel returns a boolean if a field has been set.

### GetDate

`func (o *TeamIntegrationLogsSchemaLogsInner) GetDate() string`

GetDate returns the Date field if non-nil, zero value otherwise.

### GetDateOk

`func (o *TeamIntegrationLogsSchemaLogsInner) GetDateOk() (*string, bool)`

GetDateOk returns a tuple with the Date field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDate

`func (o *TeamIntegrationLogsSchemaLogsInner) SetDate(v string)`

SetDate sets Date field to given value.


### GetScope

`func (o *TeamIntegrationLogsSchemaLogsInner) GetScope() string`

GetScope returns the Scope field if non-nil, zero value otherwise.

### GetScopeOk

`func (o *TeamIntegrationLogsSchemaLogsInner) GetScopeOk() (*string, bool)`

GetScopeOk returns a tuple with the Scope field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScope

`func (o *TeamIntegrationLogsSchemaLogsInner) SetScope(v string)`

SetScope sets Scope field to given value.


### GetServiceId

`func (o *TeamIntegrationLogsSchemaLogsInner) GetServiceId() string`

GetServiceId returns the ServiceId field if non-nil, zero value otherwise.

### GetServiceIdOk

`func (o *TeamIntegrationLogsSchemaLogsInner) GetServiceIdOk() (*string, bool)`

GetServiceIdOk returns a tuple with the ServiceId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetServiceId

`func (o *TeamIntegrationLogsSchemaLogsInner) SetServiceId(v string)`

SetServiceId sets ServiceId field to given value.

### HasServiceId

`func (o *TeamIntegrationLogsSchemaLogsInner) HasServiceId() bool`

HasServiceId returns a boolean if a field has been set.

### GetServiceType

`func (o *TeamIntegrationLogsSchemaLogsInner) GetServiceType() string`

GetServiceType returns the ServiceType field if non-nil, zero value otherwise.

### GetServiceTypeOk

`func (o *TeamIntegrationLogsSchemaLogsInner) GetServiceTypeOk() (*string, bool)`

GetServiceTypeOk returns a tuple with the ServiceType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetServiceType

`func (o *TeamIntegrationLogsSchemaLogsInner) SetServiceType(v string)`

SetServiceType sets ServiceType field to given value.

### HasServiceType

`func (o *TeamIntegrationLogsSchemaLogsInner) HasServiceType() bool`

HasServiceType returns a boolean if a field has been set.

### GetUserId

`func (o *TeamIntegrationLogsSchemaLogsInner) GetUserId() string`

GetUserId returns the UserId field if non-nil, zero value otherwise.

### GetUserIdOk

`func (o *TeamIntegrationLogsSchemaLogsInner) GetUserIdOk() (*string, bool)`

GetUserIdOk returns a tuple with the UserId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserId

`func (o *TeamIntegrationLogsSchemaLogsInner) SetUserId(v string)`

SetUserId sets UserId field to given value.


### GetUserName

`func (o *TeamIntegrationLogsSchemaLogsInner) GetUserName() string`

GetUserName returns the UserName field if non-nil, zero value otherwise.

### GetUserNameOk

`func (o *TeamIntegrationLogsSchemaLogsInner) GetUserNameOk() (*string, bool)`

GetUserNameOk returns a tuple with the UserName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserName

`func (o *TeamIntegrationLogsSchemaLogsInner) SetUserName(v string)`

SetUserName sets UserName field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


