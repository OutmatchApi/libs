# AppsPermissionsResourcesListSuccessSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ok** | [**DefsOkTrue**](DefsOkTrue.md) |  | 
**Resources** | [**[]AppsPermissionsResourcesListSuccessSchemaResourcesInner**](AppsPermissionsResourcesListSuccessSchemaResourcesInner.md) |  | 
**ResponseMetadata** | Pointer to [**AppsPermissionsResourcesListSuccessSchemaResponseMetadata**](AppsPermissionsResourcesListSuccessSchemaResponseMetadata.md) |  | [optional] 

## Methods

### NewAppsPermissionsResourcesListSuccessSchema

`func NewAppsPermissionsResourcesListSuccessSchema(ok DefsOkTrue, resources []AppsPermissionsResourcesListSuccessSchemaResourcesInner, ) *AppsPermissionsResourcesListSuccessSchema`

NewAppsPermissionsResourcesListSuccessSchema instantiates a new AppsPermissionsResourcesListSuccessSchema object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAppsPermissionsResourcesListSuccessSchemaWithDefaults

`func NewAppsPermissionsResourcesListSuccessSchemaWithDefaults() *AppsPermissionsResourcesListSuccessSchema`

NewAppsPermissionsResourcesListSuccessSchemaWithDefaults instantiates a new AppsPermissionsResourcesListSuccessSchema object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOk

`func (o *AppsPermissionsResourcesListSuccessSchema) GetOk() DefsOkTrue`

GetOk returns the Ok field if non-nil, zero value otherwise.

### GetOkOk

`func (o *AppsPermissionsResourcesListSuccessSchema) GetOkOk() (*DefsOkTrue, bool)`

GetOkOk returns a tuple with the Ok field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOk

`func (o *AppsPermissionsResourcesListSuccessSchema) SetOk(v DefsOkTrue)`

SetOk sets Ok field to given value.


### GetResources

`func (o *AppsPermissionsResourcesListSuccessSchema) GetResources() []AppsPermissionsResourcesListSuccessSchemaResourcesInner`

GetResources returns the Resources field if non-nil, zero value otherwise.

### GetResourcesOk

`func (o *AppsPermissionsResourcesListSuccessSchema) GetResourcesOk() (*[]AppsPermissionsResourcesListSuccessSchemaResourcesInner, bool)`

GetResourcesOk returns a tuple with the Resources field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResources

`func (o *AppsPermissionsResourcesListSuccessSchema) SetResources(v []AppsPermissionsResourcesListSuccessSchemaResourcesInner)`

SetResources sets Resources field to given value.


### GetResponseMetadata

`func (o *AppsPermissionsResourcesListSuccessSchema) GetResponseMetadata() AppsPermissionsResourcesListSuccessSchemaResponseMetadata`

GetResponseMetadata returns the ResponseMetadata field if non-nil, zero value otherwise.

### GetResponseMetadataOk

`func (o *AppsPermissionsResourcesListSuccessSchema) GetResponseMetadataOk() (*AppsPermissionsResourcesListSuccessSchemaResponseMetadata, bool)`

GetResponseMetadataOk returns a tuple with the ResponseMetadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponseMetadata

`func (o *AppsPermissionsResourcesListSuccessSchema) SetResponseMetadata(v AppsPermissionsResourcesListSuccessSchemaResponseMetadata)`

SetResponseMetadata sets ResponseMetadata field to given value.

### HasResponseMetadata

`func (o *AppsPermissionsResourcesListSuccessSchema) HasResponseMetadata() bool`

HasResponseMetadata returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


