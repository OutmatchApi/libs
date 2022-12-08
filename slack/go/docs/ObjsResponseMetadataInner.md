# ObjsResponseMetadataInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**NextCursor** | **string** |  | 
**Messages** | **[]string** |  | 
**Warnings** | **[]string** |  | 

## Methods

### NewObjsResponseMetadataInner

`func NewObjsResponseMetadataInner(nextCursor string, messages []string, warnings []string, ) *ObjsResponseMetadataInner`

NewObjsResponseMetadataInner instantiates a new ObjsResponseMetadataInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewObjsResponseMetadataInnerWithDefaults

`func NewObjsResponseMetadataInnerWithDefaults() *ObjsResponseMetadataInner`

NewObjsResponseMetadataInnerWithDefaults instantiates a new ObjsResponseMetadataInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetNextCursor

`func (o *ObjsResponseMetadataInner) GetNextCursor() string`

GetNextCursor returns the NextCursor field if non-nil, zero value otherwise.

### GetNextCursorOk

`func (o *ObjsResponseMetadataInner) GetNextCursorOk() (*string, bool)`

GetNextCursorOk returns a tuple with the NextCursor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNextCursor

`func (o *ObjsResponseMetadataInner) SetNextCursor(v string)`

SetNextCursor sets NextCursor field to given value.


### GetMessages

`func (o *ObjsResponseMetadataInner) GetMessages() []string`

GetMessages returns the Messages field if non-nil, zero value otherwise.

### GetMessagesOk

`func (o *ObjsResponseMetadataInner) GetMessagesOk() (*[]string, bool)`

GetMessagesOk returns a tuple with the Messages field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessages

`func (o *ObjsResponseMetadataInner) SetMessages(v []string)`

SetMessages sets Messages field to given value.


### GetWarnings

`func (o *ObjsResponseMetadataInner) GetWarnings() []string`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ObjsResponseMetadataInner) GetWarningsOk() (*[]string, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ObjsResponseMetadataInner) SetWarnings(v []string)`

SetWarnings sets Warnings field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


