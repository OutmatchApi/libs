# FilesListSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Files** | [**[]ObjsFile**](ObjsFile.md) |  | 
**Ok** | [**DefsOkTrue**](DefsOkTrue.md) |  | 
**Paging** | [**ObjsPaging**](ObjsPaging.md) |  | 

## Methods

### NewFilesListSchema

`func NewFilesListSchema(files []ObjsFile, ok DefsOkTrue, paging ObjsPaging, ) *FilesListSchema`

NewFilesListSchema instantiates a new FilesListSchema object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFilesListSchemaWithDefaults

`func NewFilesListSchemaWithDefaults() *FilesListSchema`

NewFilesListSchemaWithDefaults instantiates a new FilesListSchema object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFiles

`func (o *FilesListSchema) GetFiles() []ObjsFile`

GetFiles returns the Files field if non-nil, zero value otherwise.

### GetFilesOk

`func (o *FilesListSchema) GetFilesOk() (*[]ObjsFile, bool)`

GetFilesOk returns a tuple with the Files field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFiles

`func (o *FilesListSchema) SetFiles(v []ObjsFile)`

SetFiles sets Files field to given value.


### GetOk

`func (o *FilesListSchema) GetOk() DefsOkTrue`

GetOk returns the Ok field if non-nil, zero value otherwise.

### GetOkOk

`func (o *FilesListSchema) GetOkOk() (*DefsOkTrue, bool)`

GetOkOk returns a tuple with the Ok field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOk

`func (o *FilesListSchema) SetOk(v DefsOkTrue)`

SetOk sets Ok field to given value.


### GetPaging

`func (o *FilesListSchema) GetPaging() ObjsPaging`

GetPaging returns the Paging field if non-nil, zero value otherwise.

### GetPagingOk

`func (o *FilesListSchema) GetPagingOk() (*ObjsPaging, bool)`

GetPagingOk returns a tuple with the Paging field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaging

`func (o *FilesListSchema) SetPaging(v ObjsPaging)`

SetPaging sets Paging field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


