# FilePin

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Created** | Pointer to **int32** |  | [optional] 
**CreatedBy** | Pointer to **string** |  | [optional] 
**File** | Pointer to [**ObjsFile**](ObjsFile.md) |  | [optional] 
**Type** | Pointer to **string** |  | [optional] 

## Methods

### NewFilePin

`func NewFilePin() *FilePin`

NewFilePin instantiates a new FilePin object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFilePinWithDefaults

`func NewFilePinWithDefaults() *FilePin`

NewFilePinWithDefaults instantiates a new FilePin object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCreated

`func (o *FilePin) GetCreated() int32`

GetCreated returns the Created field if non-nil, zero value otherwise.

### GetCreatedOk

`func (o *FilePin) GetCreatedOk() (*int32, bool)`

GetCreatedOk returns a tuple with the Created field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreated

`func (o *FilePin) SetCreated(v int32)`

SetCreated sets Created field to given value.

### HasCreated

`func (o *FilePin) HasCreated() bool`

HasCreated returns a boolean if a field has been set.

### GetCreatedBy

`func (o *FilePin) GetCreatedBy() string`

GetCreatedBy returns the CreatedBy field if non-nil, zero value otherwise.

### GetCreatedByOk

`func (o *FilePin) GetCreatedByOk() (*string, bool)`

GetCreatedByOk returns a tuple with the CreatedBy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedBy

`func (o *FilePin) SetCreatedBy(v string)`

SetCreatedBy sets CreatedBy field to given value.

### HasCreatedBy

`func (o *FilePin) HasCreatedBy() bool`

HasCreatedBy returns a boolean if a field has been set.

### GetFile

`func (o *FilePin) GetFile() ObjsFile`

GetFile returns the File field if non-nil, zero value otherwise.

### GetFileOk

`func (o *FilePin) GetFileOk() (*ObjsFile, bool)`

GetFileOk returns a tuple with the File field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFile

`func (o *FilePin) SetFile(v ObjsFile)`

SetFile sets File field to given value.

### HasFile

`func (o *FilePin) HasFile() bool`

HasFile returns a boolean if a field has been set.

### GetType

`func (o *FilePin) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *FilePin) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *FilePin) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *FilePin) HasType() bool`

HasType returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


