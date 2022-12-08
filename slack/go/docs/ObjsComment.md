# ObjsComment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Comment** | **string** |  | 
**Created** | **int32** |  | 
**Id** | **string** |  | 
**IsIntro** | **bool** |  | 
**IsStarred** | Pointer to **bool** |  | [optional] 
**NumStars** | Pointer to **int32** |  | [optional] 
**PinnedInfo** | Pointer to **map[string]interface{}** |  | [optional] 
**PinnedTo** | Pointer to **[]string** |  | [optional] 
**Reactions** | Pointer to [**[]ObjsReaction**](ObjsReaction.md) |  | [optional] 
**Timestamp** | **int32** |  | 
**User** | **string** |  | 

## Methods

### NewObjsComment

`func NewObjsComment(comment string, created int32, id string, isIntro bool, timestamp int32, user string, ) *ObjsComment`

NewObjsComment instantiates a new ObjsComment object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewObjsCommentWithDefaults

`func NewObjsCommentWithDefaults() *ObjsComment`

NewObjsCommentWithDefaults instantiates a new ObjsComment object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetComment

`func (o *ObjsComment) GetComment() string`

GetComment returns the Comment field if non-nil, zero value otherwise.

### GetCommentOk

`func (o *ObjsComment) GetCommentOk() (*string, bool)`

GetCommentOk returns a tuple with the Comment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComment

`func (o *ObjsComment) SetComment(v string)`

SetComment sets Comment field to given value.


### GetCreated

`func (o *ObjsComment) GetCreated() int32`

GetCreated returns the Created field if non-nil, zero value otherwise.

### GetCreatedOk

`func (o *ObjsComment) GetCreatedOk() (*int32, bool)`

GetCreatedOk returns a tuple with the Created field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreated

`func (o *ObjsComment) SetCreated(v int32)`

SetCreated sets Created field to given value.


### GetId

`func (o *ObjsComment) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ObjsComment) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ObjsComment) SetId(v string)`

SetId sets Id field to given value.


### GetIsIntro

`func (o *ObjsComment) GetIsIntro() bool`

GetIsIntro returns the IsIntro field if non-nil, zero value otherwise.

### GetIsIntroOk

`func (o *ObjsComment) GetIsIntroOk() (*bool, bool)`

GetIsIntroOk returns a tuple with the IsIntro field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsIntro

`func (o *ObjsComment) SetIsIntro(v bool)`

SetIsIntro sets IsIntro field to given value.


### GetIsStarred

`func (o *ObjsComment) GetIsStarred() bool`

GetIsStarred returns the IsStarred field if non-nil, zero value otherwise.

### GetIsStarredOk

`func (o *ObjsComment) GetIsStarredOk() (*bool, bool)`

GetIsStarredOk returns a tuple with the IsStarred field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsStarred

`func (o *ObjsComment) SetIsStarred(v bool)`

SetIsStarred sets IsStarred field to given value.

### HasIsStarred

`func (o *ObjsComment) HasIsStarred() bool`

HasIsStarred returns a boolean if a field has been set.

### GetNumStars

`func (o *ObjsComment) GetNumStars() int32`

GetNumStars returns the NumStars field if non-nil, zero value otherwise.

### GetNumStarsOk

`func (o *ObjsComment) GetNumStarsOk() (*int32, bool)`

GetNumStarsOk returns a tuple with the NumStars field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumStars

`func (o *ObjsComment) SetNumStars(v int32)`

SetNumStars sets NumStars field to given value.

### HasNumStars

`func (o *ObjsComment) HasNumStars() bool`

HasNumStars returns a boolean if a field has been set.

### GetPinnedInfo

`func (o *ObjsComment) GetPinnedInfo() map[string]interface{}`

GetPinnedInfo returns the PinnedInfo field if non-nil, zero value otherwise.

### GetPinnedInfoOk

`func (o *ObjsComment) GetPinnedInfoOk() (*map[string]interface{}, bool)`

GetPinnedInfoOk returns a tuple with the PinnedInfo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPinnedInfo

`func (o *ObjsComment) SetPinnedInfo(v map[string]interface{})`

SetPinnedInfo sets PinnedInfo field to given value.

### HasPinnedInfo

`func (o *ObjsComment) HasPinnedInfo() bool`

HasPinnedInfo returns a boolean if a field has been set.

### GetPinnedTo

`func (o *ObjsComment) GetPinnedTo() []string`

GetPinnedTo returns the PinnedTo field if non-nil, zero value otherwise.

### GetPinnedToOk

`func (o *ObjsComment) GetPinnedToOk() (*[]string, bool)`

GetPinnedToOk returns a tuple with the PinnedTo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPinnedTo

`func (o *ObjsComment) SetPinnedTo(v []string)`

SetPinnedTo sets PinnedTo field to given value.

### HasPinnedTo

`func (o *ObjsComment) HasPinnedTo() bool`

HasPinnedTo returns a boolean if a field has been set.

### GetReactions

`func (o *ObjsComment) GetReactions() []ObjsReaction`

GetReactions returns the Reactions field if non-nil, zero value otherwise.

### GetReactionsOk

`func (o *ObjsComment) GetReactionsOk() (*[]ObjsReaction, bool)`

GetReactionsOk returns a tuple with the Reactions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReactions

`func (o *ObjsComment) SetReactions(v []ObjsReaction)`

SetReactions sets Reactions field to given value.

### HasReactions

`func (o *ObjsComment) HasReactions() bool`

HasReactions returns a boolean if a field has been set.

### GetTimestamp

`func (o *ObjsComment) GetTimestamp() int32`

GetTimestamp returns the Timestamp field if non-nil, zero value otherwise.

### GetTimestampOk

`func (o *ObjsComment) GetTimestampOk() (*int32, bool)`

GetTimestampOk returns a tuple with the Timestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimestamp

`func (o *ObjsComment) SetTimestamp(v int32)`

SetTimestamp sets Timestamp field to given value.


### GetUser

`func (o *ObjsComment) GetUser() string`

GetUser returns the User field if non-nil, zero value otherwise.

### GetUserOk

`func (o *ObjsComment) GetUserOk() (*string, bool)`

GetUserOk returns a tuple with the User field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUser

`func (o *ObjsComment) SetUser(v string)`

SetUser sets User field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


