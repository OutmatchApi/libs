# ChatGetPermalinkSuccessSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Channel** | **string** |  | 
**Ok** | [**DefsOkTrue**](DefsOkTrue.md) |  | 
**Permalink** | **string** |  | 

## Methods

### NewChatGetPermalinkSuccessSchema

`func NewChatGetPermalinkSuccessSchema(channel string, ok DefsOkTrue, permalink string, ) *ChatGetPermalinkSuccessSchema`

NewChatGetPermalinkSuccessSchema instantiates a new ChatGetPermalinkSuccessSchema object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewChatGetPermalinkSuccessSchemaWithDefaults

`func NewChatGetPermalinkSuccessSchemaWithDefaults() *ChatGetPermalinkSuccessSchema`

NewChatGetPermalinkSuccessSchemaWithDefaults instantiates a new ChatGetPermalinkSuccessSchema object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetChannel

`func (o *ChatGetPermalinkSuccessSchema) GetChannel() string`

GetChannel returns the Channel field if non-nil, zero value otherwise.

### GetChannelOk

`func (o *ChatGetPermalinkSuccessSchema) GetChannelOk() (*string, bool)`

GetChannelOk returns a tuple with the Channel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChannel

`func (o *ChatGetPermalinkSuccessSchema) SetChannel(v string)`

SetChannel sets Channel field to given value.


### GetOk

`func (o *ChatGetPermalinkSuccessSchema) GetOk() DefsOkTrue`

GetOk returns the Ok field if non-nil, zero value otherwise.

### GetOkOk

`func (o *ChatGetPermalinkSuccessSchema) GetOkOk() (*DefsOkTrue, bool)`

GetOkOk returns a tuple with the Ok field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOk

`func (o *ChatGetPermalinkSuccessSchema) SetOk(v DefsOkTrue)`

SetOk sets Ok field to given value.


### GetPermalink

`func (o *ChatGetPermalinkSuccessSchema) GetPermalink() string`

GetPermalink returns the Permalink field if non-nil, zero value otherwise.

### GetPermalinkOk

`func (o *ChatGetPermalinkSuccessSchema) GetPermalinkOk() (*string, bool)`

GetPermalinkOk returns a tuple with the Permalink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPermalink

`func (o *ChatGetPermalinkSuccessSchema) SetPermalink(v string)`

SetPermalink sets Permalink field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


