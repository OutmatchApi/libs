# MessageObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attachments** | Pointer to **[]map[string]interface{}** |  | [optional] 
**Blocks** | Pointer to **map[string]interface{}** |  | [optional] 
**Text** | **string** |  | 

## Methods

### NewMessageObject

`func NewMessageObject(text string, ) *MessageObject`

NewMessageObject instantiates a new MessageObject object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessageObjectWithDefaults

`func NewMessageObjectWithDefaults() *MessageObject`

NewMessageObjectWithDefaults instantiates a new MessageObject object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAttachments

`func (o *MessageObject) GetAttachments() []map[string]interface{}`

GetAttachments returns the Attachments field if non-nil, zero value otherwise.

### GetAttachmentsOk

`func (o *MessageObject) GetAttachmentsOk() (*[]map[string]interface{}, bool)`

GetAttachmentsOk returns a tuple with the Attachments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttachments

`func (o *MessageObject) SetAttachments(v []map[string]interface{})`

SetAttachments sets Attachments field to given value.

### HasAttachments

`func (o *MessageObject) HasAttachments() bool`

HasAttachments returns a boolean if a field has been set.

### GetBlocks

`func (o *MessageObject) GetBlocks() map[string]interface{}`

GetBlocks returns the Blocks field if non-nil, zero value otherwise.

### GetBlocksOk

`func (o *MessageObject) GetBlocksOk() (*map[string]interface{}, bool)`

GetBlocksOk returns a tuple with the Blocks field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBlocks

`func (o *MessageObject) SetBlocks(v map[string]interface{})`

SetBlocks sets Blocks field to given value.

### HasBlocks

`func (o *MessageObject) HasBlocks() bool`

HasBlocks returns a boolean if a field has been set.

### GetText

`func (o *MessageObject) GetText() string`

GetText returns the Text field if non-nil, zero value otherwise.

### GetTextOk

`func (o *MessageObject) GetTextOk() (*string, bool)`

GetTextOk returns a tuple with the Text field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetText

`func (o *MessageObject) SetText(v string)`

SetText sets Text field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


