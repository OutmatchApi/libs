# VideoCreatePayload

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Description** | Pointer to **string** | A brief description of your video. | [optional] 
**Metadata** | Pointer to [**[]Metadata**](Metadata.md) | A list of key value pairs that you use to provide metadata for your video. These pairs can be made dynamic, allowing you to segment your audience. Read more on [dynamic metadata](https://api.video/blog/endpoints/dynamic-metadata). | [optional] 
**Mp4Support** | Pointer to **bool** | Enables mp4 version in addition to streamed version. | [optional] [default to true]
**Panoramic** | Pointer to **bool** | Indicates if your video is a 360/immersive video. | [optional] [default to false]
**PlayerId** | Pointer to **string** | The unique identification number for your video player. | [optional] 
**Public** | Pointer to **bool** | Whether your video can be viewed by everyone, or requires authentication to see it. A setting of false will require a unique token for each view. Default is true. Tutorials on [private videos](https://api.video/blog/endpoints/private-videos). | [optional] [default to true]
**PublishedAt** | Pointer to **time.Time** | The API uses ISO-8601 format for time, and includes 3 places for milliseconds. | [optional] 
**Source** | Pointer to **string** | If you add a video already on the web, this is where you enter the url for the video. | [optional] 
**Tags** | Pointer to **[]string** | A list of tags you want to use to describe your video. | [optional] 
**Title** | **string** | The title of your new video. | 

## Methods

### NewVideoCreatePayload

`func NewVideoCreatePayload(title string, ) *VideoCreatePayload`

NewVideoCreatePayload instantiates a new VideoCreatePayload object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewVideoCreatePayloadWithDefaults

`func NewVideoCreatePayloadWithDefaults() *VideoCreatePayload`

NewVideoCreatePayloadWithDefaults instantiates a new VideoCreatePayload object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDescription

`func (o *VideoCreatePayload) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *VideoCreatePayload) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *VideoCreatePayload) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *VideoCreatePayload) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetMetadata

`func (o *VideoCreatePayload) GetMetadata() []Metadata`

GetMetadata returns the Metadata field if non-nil, zero value otherwise.

### GetMetadataOk

`func (o *VideoCreatePayload) GetMetadataOk() (*[]Metadata, bool)`

GetMetadataOk returns a tuple with the Metadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMetadata

`func (o *VideoCreatePayload) SetMetadata(v []Metadata)`

SetMetadata sets Metadata field to given value.

### HasMetadata

`func (o *VideoCreatePayload) HasMetadata() bool`

HasMetadata returns a boolean if a field has been set.

### GetMp4Support

`func (o *VideoCreatePayload) GetMp4Support() bool`

GetMp4Support returns the Mp4Support field if non-nil, zero value otherwise.

### GetMp4SupportOk

`func (o *VideoCreatePayload) GetMp4SupportOk() (*bool, bool)`

GetMp4SupportOk returns a tuple with the Mp4Support field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMp4Support

`func (o *VideoCreatePayload) SetMp4Support(v bool)`

SetMp4Support sets Mp4Support field to given value.

### HasMp4Support

`func (o *VideoCreatePayload) HasMp4Support() bool`

HasMp4Support returns a boolean if a field has been set.

### GetPanoramic

`func (o *VideoCreatePayload) GetPanoramic() bool`

GetPanoramic returns the Panoramic field if non-nil, zero value otherwise.

### GetPanoramicOk

`func (o *VideoCreatePayload) GetPanoramicOk() (*bool, bool)`

GetPanoramicOk returns a tuple with the Panoramic field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPanoramic

`func (o *VideoCreatePayload) SetPanoramic(v bool)`

SetPanoramic sets Panoramic field to given value.

### HasPanoramic

`func (o *VideoCreatePayload) HasPanoramic() bool`

HasPanoramic returns a boolean if a field has been set.

### GetPlayerId

`func (o *VideoCreatePayload) GetPlayerId() string`

GetPlayerId returns the PlayerId field if non-nil, zero value otherwise.

### GetPlayerIdOk

`func (o *VideoCreatePayload) GetPlayerIdOk() (*string, bool)`

GetPlayerIdOk returns a tuple with the PlayerId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlayerId

`func (o *VideoCreatePayload) SetPlayerId(v string)`

SetPlayerId sets PlayerId field to given value.

### HasPlayerId

`func (o *VideoCreatePayload) HasPlayerId() bool`

HasPlayerId returns a boolean if a field has been set.

### GetPublic

`func (o *VideoCreatePayload) GetPublic() bool`

GetPublic returns the Public field if non-nil, zero value otherwise.

### GetPublicOk

`func (o *VideoCreatePayload) GetPublicOk() (*bool, bool)`

GetPublicOk returns a tuple with the Public field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPublic

`func (o *VideoCreatePayload) SetPublic(v bool)`

SetPublic sets Public field to given value.

### HasPublic

`func (o *VideoCreatePayload) HasPublic() bool`

HasPublic returns a boolean if a field has been set.

### GetPublishedAt

`func (o *VideoCreatePayload) GetPublishedAt() time.Time`

GetPublishedAt returns the PublishedAt field if non-nil, zero value otherwise.

### GetPublishedAtOk

`func (o *VideoCreatePayload) GetPublishedAtOk() (*time.Time, bool)`

GetPublishedAtOk returns a tuple with the PublishedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPublishedAt

`func (o *VideoCreatePayload) SetPublishedAt(v time.Time)`

SetPublishedAt sets PublishedAt field to given value.

### HasPublishedAt

`func (o *VideoCreatePayload) HasPublishedAt() bool`

HasPublishedAt returns a boolean if a field has been set.

### GetSource

`func (o *VideoCreatePayload) GetSource() string`

GetSource returns the Source field if non-nil, zero value otherwise.

### GetSourceOk

`func (o *VideoCreatePayload) GetSourceOk() (*string, bool)`

GetSourceOk returns a tuple with the Source field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSource

`func (o *VideoCreatePayload) SetSource(v string)`

SetSource sets Source field to given value.

### HasSource

`func (o *VideoCreatePayload) HasSource() bool`

HasSource returns a boolean if a field has been set.

### GetTags

`func (o *VideoCreatePayload) GetTags() []string`

GetTags returns the Tags field if non-nil, zero value otherwise.

### GetTagsOk

`func (o *VideoCreatePayload) GetTagsOk() (*[]string, bool)`

GetTagsOk returns a tuple with the Tags field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTags

`func (o *VideoCreatePayload) SetTags(v []string)`

SetTags sets Tags field to given value.

### HasTags

`func (o *VideoCreatePayload) HasTags() bool`

HasTags returns a boolean if a field has been set.

### GetTitle

`func (o *VideoCreatePayload) GetTitle() string`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *VideoCreatePayload) GetTitleOk() (*string, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *VideoCreatePayload) SetTitle(v string)`

SetTitle sets Title field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


