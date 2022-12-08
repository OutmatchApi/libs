# FilesInfoSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Comments** | **[]interface{}** |  | 
**ContentHtml** | Pointer to **interface{}** |  | [optional] 
**Editor** | Pointer to **string** |  | [optional] 
**File** | [**ObjsFile**](ObjsFile.md) |  | 
**Ok** | [**DefsOkTrue**](DefsOkTrue.md) |  | 
**Paging** | Pointer to [**ObjsPaging**](ObjsPaging.md) |  | [optional] 
**ResponseMetadata** | Pointer to [**[]ObjsResponseMetadataInner**](ObjsResponseMetadataInner.md) |  | [optional] 

## Methods

### NewFilesInfoSchema

`func NewFilesInfoSchema(comments []interface{}, file ObjsFile, ok DefsOkTrue, ) *FilesInfoSchema`

NewFilesInfoSchema instantiates a new FilesInfoSchema object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFilesInfoSchemaWithDefaults

`func NewFilesInfoSchemaWithDefaults() *FilesInfoSchema`

NewFilesInfoSchemaWithDefaults instantiates a new FilesInfoSchema object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetComments

`func (o *FilesInfoSchema) GetComments() []interface{}`

GetComments returns the Comments field if non-nil, zero value otherwise.

### GetCommentsOk

`func (o *FilesInfoSchema) GetCommentsOk() (*[]interface{}, bool)`

GetCommentsOk returns a tuple with the Comments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComments

`func (o *FilesInfoSchema) SetComments(v []interface{})`

SetComments sets Comments field to given value.


### GetContentHtml

`func (o *FilesInfoSchema) GetContentHtml() interface{}`

GetContentHtml returns the ContentHtml field if non-nil, zero value otherwise.

### GetContentHtmlOk

`func (o *FilesInfoSchema) GetContentHtmlOk() (*interface{}, bool)`

GetContentHtmlOk returns a tuple with the ContentHtml field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContentHtml

`func (o *FilesInfoSchema) SetContentHtml(v interface{})`

SetContentHtml sets ContentHtml field to given value.

### HasContentHtml

`func (o *FilesInfoSchema) HasContentHtml() bool`

HasContentHtml returns a boolean if a field has been set.

### SetContentHtmlNil

`func (o *FilesInfoSchema) SetContentHtmlNil(b bool)`

 SetContentHtmlNil sets the value for ContentHtml to be an explicit nil

### UnsetContentHtml
`func (o *FilesInfoSchema) UnsetContentHtml()`

UnsetContentHtml ensures that no value is present for ContentHtml, not even an explicit nil
### GetEditor

`func (o *FilesInfoSchema) GetEditor() string`

GetEditor returns the Editor field if non-nil, zero value otherwise.

### GetEditorOk

`func (o *FilesInfoSchema) GetEditorOk() (*string, bool)`

GetEditorOk returns a tuple with the Editor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEditor

`func (o *FilesInfoSchema) SetEditor(v string)`

SetEditor sets Editor field to given value.

### HasEditor

`func (o *FilesInfoSchema) HasEditor() bool`

HasEditor returns a boolean if a field has been set.

### GetFile

`func (o *FilesInfoSchema) GetFile() ObjsFile`

GetFile returns the File field if non-nil, zero value otherwise.

### GetFileOk

`func (o *FilesInfoSchema) GetFileOk() (*ObjsFile, bool)`

GetFileOk returns a tuple with the File field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFile

`func (o *FilesInfoSchema) SetFile(v ObjsFile)`

SetFile sets File field to given value.


### GetOk

`func (o *FilesInfoSchema) GetOk() DefsOkTrue`

GetOk returns the Ok field if non-nil, zero value otherwise.

### GetOkOk

`func (o *FilesInfoSchema) GetOkOk() (*DefsOkTrue, bool)`

GetOkOk returns a tuple with the Ok field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOk

`func (o *FilesInfoSchema) SetOk(v DefsOkTrue)`

SetOk sets Ok field to given value.


### GetPaging

`func (o *FilesInfoSchema) GetPaging() ObjsPaging`

GetPaging returns the Paging field if non-nil, zero value otherwise.

### GetPagingOk

`func (o *FilesInfoSchema) GetPagingOk() (*ObjsPaging, bool)`

GetPagingOk returns a tuple with the Paging field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaging

`func (o *FilesInfoSchema) SetPaging(v ObjsPaging)`

SetPaging sets Paging field to given value.

### HasPaging

`func (o *FilesInfoSchema) HasPaging() bool`

HasPaging returns a boolean if a field has been set.

### GetResponseMetadata

`func (o *FilesInfoSchema) GetResponseMetadata() []ObjsResponseMetadataInner`

GetResponseMetadata returns the ResponseMetadata field if non-nil, zero value otherwise.

### GetResponseMetadataOk

`func (o *FilesInfoSchema) GetResponseMetadataOk() (*[]ObjsResponseMetadataInner, bool)`

GetResponseMetadataOk returns a tuple with the ResponseMetadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponseMetadata

`func (o *FilesInfoSchema) SetResponseMetadata(v []ObjsResponseMetadataInner)`

SetResponseMetadata sets ResponseMetadata field to given value.

### HasResponseMetadata

`func (o *FilesInfoSchema) HasResponseMetadata() bool`

HasResponseMetadata returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


