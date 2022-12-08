# ObjsFile

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Channels** | Pointer to **[]string** |  | [optional] 
**CommentsCount** | Pointer to **int32** |  | [optional] 
**Created** | Pointer to **int32** |  | [optional] 
**DateDelete** | Pointer to **int32** |  | [optional] 
**DisplayAsBot** | Pointer to **bool** |  | [optional] 
**Editable** | Pointer to **bool** |  | [optional] 
**Editor** | Pointer to **string** |  | [optional] 
**ExternalId** | Pointer to **string** |  | [optional] 
**ExternalType** | Pointer to **string** |  | [optional] 
**ExternalUrl** | Pointer to **string** |  | [optional] 
**Filetype** | Pointer to **string** |  | [optional] 
**Groups** | Pointer to **[]string** |  | [optional] 
**HasRichPreview** | Pointer to **bool** |  | [optional] 
**Id** | Pointer to **string** |  | [optional] 
**ImageExifRotation** | Pointer to **int32** |  | [optional] 
**Ims** | Pointer to **[]string** |  | [optional] 
**IsExternal** | Pointer to **bool** |  | [optional] 
**IsPublic** | Pointer to **bool** |  | [optional] 
**IsStarred** | Pointer to **bool** |  | [optional] 
**IsTombstoned** | Pointer to **bool** |  | [optional] 
**LastEditor** | Pointer to **string** |  | [optional] 
**Mimetype** | Pointer to **string** |  | [optional] 
**Mode** | Pointer to **string** |  | [optional] 
**Name** | Pointer to **string** |  | [optional] 
**NonOwnerEditable** | Pointer to **bool** |  | [optional] 
**NumStars** | Pointer to **int32** |  | [optional] 
**OriginalH** | Pointer to **int32** |  | [optional] 
**OriginalW** | Pointer to **int32** |  | [optional] 
**Permalink** | Pointer to **string** |  | [optional] 
**PermalinkPublic** | Pointer to **string** |  | [optional] 
**PinnedInfo** | Pointer to **map[string]interface{}** |  | [optional] 
**PinnedTo** | Pointer to **[]string** |  | [optional] 
**PrettyType** | Pointer to **string** |  | [optional] 
**Preview** | Pointer to **string** |  | [optional] 
**PublicUrlShared** | Pointer to **bool** |  | [optional] 
**Reactions** | Pointer to [**[]ObjsReaction**](ObjsReaction.md) |  | [optional] 
**Shares** | Pointer to [**ObjsFileShares**](ObjsFileShares.md) |  | [optional] 
**Size** | Pointer to **int32** |  | [optional] 
**SourceTeam** | Pointer to **string** |  | [optional] 
**State** | Pointer to **string** |  | [optional] 
**Thumb1024** | Pointer to **string** |  | [optional] 
**Thumb1024H** | Pointer to **int32** |  | [optional] 
**Thumb1024W** | Pointer to **int32** |  | [optional] 
**Thumb160** | Pointer to **string** |  | [optional] 
**Thumb360** | Pointer to **string** |  | [optional] 
**Thumb360H** | Pointer to **int32** |  | [optional] 
**Thumb360W** | Pointer to **int32** |  | [optional] 
**Thumb480** | Pointer to **string** |  | [optional] 
**Thumb480H** | Pointer to **int32** |  | [optional] 
**Thumb480W** | Pointer to **int32** |  | [optional] 
**Thumb64** | Pointer to **string** |  | [optional] 
**Thumb720** | Pointer to **string** |  | [optional] 
**Thumb720H** | Pointer to **int32** |  | [optional] 
**Thumb720W** | Pointer to **int32** |  | [optional] 
**Thumb80** | Pointer to **string** |  | [optional] 
**Thumb800** | Pointer to **string** |  | [optional] 
**Thumb800H** | Pointer to **int32** |  | [optional] 
**Thumb800W** | Pointer to **int32** |  | [optional] 
**Thumb960** | Pointer to **string** |  | [optional] 
**Thumb960H** | Pointer to **int32** |  | [optional] 
**Thumb960W** | Pointer to **int32** |  | [optional] 
**ThumbTiny** | Pointer to **string** |  | [optional] 
**Timestamp** | Pointer to **int32** |  | [optional] 
**Title** | Pointer to **string** |  | [optional] 
**Updated** | Pointer to **int32** |  | [optional] 
**UrlPrivate** | Pointer to **string** |  | [optional] 
**UrlPrivateDownload** | Pointer to **string** |  | [optional] 
**User** | Pointer to **string** |  | [optional] 
**UserTeam** | Pointer to **string** |  | [optional] 
**Username** | Pointer to **string** |  | [optional] 

## Methods

### NewObjsFile

`func NewObjsFile() *ObjsFile`

NewObjsFile instantiates a new ObjsFile object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewObjsFileWithDefaults

`func NewObjsFileWithDefaults() *ObjsFile`

NewObjsFileWithDefaults instantiates a new ObjsFile object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetChannels

`func (o *ObjsFile) GetChannels() []string`

GetChannels returns the Channels field if non-nil, zero value otherwise.

### GetChannelsOk

`func (o *ObjsFile) GetChannelsOk() (*[]string, bool)`

GetChannelsOk returns a tuple with the Channels field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChannels

`func (o *ObjsFile) SetChannels(v []string)`

SetChannels sets Channels field to given value.

### HasChannels

`func (o *ObjsFile) HasChannels() bool`

HasChannels returns a boolean if a field has been set.

### GetCommentsCount

`func (o *ObjsFile) GetCommentsCount() int32`

GetCommentsCount returns the CommentsCount field if non-nil, zero value otherwise.

### GetCommentsCountOk

`func (o *ObjsFile) GetCommentsCountOk() (*int32, bool)`

GetCommentsCountOk returns a tuple with the CommentsCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCommentsCount

`func (o *ObjsFile) SetCommentsCount(v int32)`

SetCommentsCount sets CommentsCount field to given value.

### HasCommentsCount

`func (o *ObjsFile) HasCommentsCount() bool`

HasCommentsCount returns a boolean if a field has been set.

### GetCreated

`func (o *ObjsFile) GetCreated() int32`

GetCreated returns the Created field if non-nil, zero value otherwise.

### GetCreatedOk

`func (o *ObjsFile) GetCreatedOk() (*int32, bool)`

GetCreatedOk returns a tuple with the Created field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreated

`func (o *ObjsFile) SetCreated(v int32)`

SetCreated sets Created field to given value.

### HasCreated

`func (o *ObjsFile) HasCreated() bool`

HasCreated returns a boolean if a field has been set.

### GetDateDelete

`func (o *ObjsFile) GetDateDelete() int32`

GetDateDelete returns the DateDelete field if non-nil, zero value otherwise.

### GetDateDeleteOk

`func (o *ObjsFile) GetDateDeleteOk() (*int32, bool)`

GetDateDeleteOk returns a tuple with the DateDelete field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDateDelete

`func (o *ObjsFile) SetDateDelete(v int32)`

SetDateDelete sets DateDelete field to given value.

### HasDateDelete

`func (o *ObjsFile) HasDateDelete() bool`

HasDateDelete returns a boolean if a field has been set.

### GetDisplayAsBot

`func (o *ObjsFile) GetDisplayAsBot() bool`

GetDisplayAsBot returns the DisplayAsBot field if non-nil, zero value otherwise.

### GetDisplayAsBotOk

`func (o *ObjsFile) GetDisplayAsBotOk() (*bool, bool)`

GetDisplayAsBotOk returns a tuple with the DisplayAsBot field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplayAsBot

`func (o *ObjsFile) SetDisplayAsBot(v bool)`

SetDisplayAsBot sets DisplayAsBot field to given value.

### HasDisplayAsBot

`func (o *ObjsFile) HasDisplayAsBot() bool`

HasDisplayAsBot returns a boolean if a field has been set.

### GetEditable

`func (o *ObjsFile) GetEditable() bool`

GetEditable returns the Editable field if non-nil, zero value otherwise.

### GetEditableOk

`func (o *ObjsFile) GetEditableOk() (*bool, bool)`

GetEditableOk returns a tuple with the Editable field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEditable

`func (o *ObjsFile) SetEditable(v bool)`

SetEditable sets Editable field to given value.

### HasEditable

`func (o *ObjsFile) HasEditable() bool`

HasEditable returns a boolean if a field has been set.

### GetEditor

`func (o *ObjsFile) GetEditor() string`

GetEditor returns the Editor field if non-nil, zero value otherwise.

### GetEditorOk

`func (o *ObjsFile) GetEditorOk() (*string, bool)`

GetEditorOk returns a tuple with the Editor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEditor

`func (o *ObjsFile) SetEditor(v string)`

SetEditor sets Editor field to given value.

### HasEditor

`func (o *ObjsFile) HasEditor() bool`

HasEditor returns a boolean if a field has been set.

### GetExternalId

`func (o *ObjsFile) GetExternalId() string`

GetExternalId returns the ExternalId field if non-nil, zero value otherwise.

### GetExternalIdOk

`func (o *ObjsFile) GetExternalIdOk() (*string, bool)`

GetExternalIdOk returns a tuple with the ExternalId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExternalId

`func (o *ObjsFile) SetExternalId(v string)`

SetExternalId sets ExternalId field to given value.

### HasExternalId

`func (o *ObjsFile) HasExternalId() bool`

HasExternalId returns a boolean if a field has been set.

### GetExternalType

`func (o *ObjsFile) GetExternalType() string`

GetExternalType returns the ExternalType field if non-nil, zero value otherwise.

### GetExternalTypeOk

`func (o *ObjsFile) GetExternalTypeOk() (*string, bool)`

GetExternalTypeOk returns a tuple with the ExternalType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExternalType

`func (o *ObjsFile) SetExternalType(v string)`

SetExternalType sets ExternalType field to given value.

### HasExternalType

`func (o *ObjsFile) HasExternalType() bool`

HasExternalType returns a boolean if a field has been set.

### GetExternalUrl

`func (o *ObjsFile) GetExternalUrl() string`

GetExternalUrl returns the ExternalUrl field if non-nil, zero value otherwise.

### GetExternalUrlOk

`func (o *ObjsFile) GetExternalUrlOk() (*string, bool)`

GetExternalUrlOk returns a tuple with the ExternalUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExternalUrl

`func (o *ObjsFile) SetExternalUrl(v string)`

SetExternalUrl sets ExternalUrl field to given value.

### HasExternalUrl

`func (o *ObjsFile) HasExternalUrl() bool`

HasExternalUrl returns a boolean if a field has been set.

### GetFiletype

`func (o *ObjsFile) GetFiletype() string`

GetFiletype returns the Filetype field if non-nil, zero value otherwise.

### GetFiletypeOk

`func (o *ObjsFile) GetFiletypeOk() (*string, bool)`

GetFiletypeOk returns a tuple with the Filetype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFiletype

`func (o *ObjsFile) SetFiletype(v string)`

SetFiletype sets Filetype field to given value.

### HasFiletype

`func (o *ObjsFile) HasFiletype() bool`

HasFiletype returns a boolean if a field has been set.

### GetGroups

`func (o *ObjsFile) GetGroups() []string`

GetGroups returns the Groups field if non-nil, zero value otherwise.

### GetGroupsOk

`func (o *ObjsFile) GetGroupsOk() (*[]string, bool)`

GetGroupsOk returns a tuple with the Groups field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroups

`func (o *ObjsFile) SetGroups(v []string)`

SetGroups sets Groups field to given value.

### HasGroups

`func (o *ObjsFile) HasGroups() bool`

HasGroups returns a boolean if a field has been set.

### GetHasRichPreview

`func (o *ObjsFile) GetHasRichPreview() bool`

GetHasRichPreview returns the HasRichPreview field if non-nil, zero value otherwise.

### GetHasRichPreviewOk

`func (o *ObjsFile) GetHasRichPreviewOk() (*bool, bool)`

GetHasRichPreviewOk returns a tuple with the HasRichPreview field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasRichPreview

`func (o *ObjsFile) SetHasRichPreview(v bool)`

SetHasRichPreview sets HasRichPreview field to given value.

### HasHasRichPreview

`func (o *ObjsFile) HasHasRichPreview() bool`

HasHasRichPreview returns a boolean if a field has been set.

### GetId

`func (o *ObjsFile) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ObjsFile) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ObjsFile) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *ObjsFile) HasId() bool`

HasId returns a boolean if a field has been set.

### GetImageExifRotation

`func (o *ObjsFile) GetImageExifRotation() int32`

GetImageExifRotation returns the ImageExifRotation field if non-nil, zero value otherwise.

### GetImageExifRotationOk

`func (o *ObjsFile) GetImageExifRotationOk() (*int32, bool)`

GetImageExifRotationOk returns a tuple with the ImageExifRotation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImageExifRotation

`func (o *ObjsFile) SetImageExifRotation(v int32)`

SetImageExifRotation sets ImageExifRotation field to given value.

### HasImageExifRotation

`func (o *ObjsFile) HasImageExifRotation() bool`

HasImageExifRotation returns a boolean if a field has been set.

### GetIms

`func (o *ObjsFile) GetIms() []string`

GetIms returns the Ims field if non-nil, zero value otherwise.

### GetImsOk

`func (o *ObjsFile) GetImsOk() (*[]string, bool)`

GetImsOk returns a tuple with the Ims field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIms

`func (o *ObjsFile) SetIms(v []string)`

SetIms sets Ims field to given value.

### HasIms

`func (o *ObjsFile) HasIms() bool`

HasIms returns a boolean if a field has been set.

### GetIsExternal

`func (o *ObjsFile) GetIsExternal() bool`

GetIsExternal returns the IsExternal field if non-nil, zero value otherwise.

### GetIsExternalOk

`func (o *ObjsFile) GetIsExternalOk() (*bool, bool)`

GetIsExternalOk returns a tuple with the IsExternal field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsExternal

`func (o *ObjsFile) SetIsExternal(v bool)`

SetIsExternal sets IsExternal field to given value.

### HasIsExternal

`func (o *ObjsFile) HasIsExternal() bool`

HasIsExternal returns a boolean if a field has been set.

### GetIsPublic

`func (o *ObjsFile) GetIsPublic() bool`

GetIsPublic returns the IsPublic field if non-nil, zero value otherwise.

### GetIsPublicOk

`func (o *ObjsFile) GetIsPublicOk() (*bool, bool)`

GetIsPublicOk returns a tuple with the IsPublic field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsPublic

`func (o *ObjsFile) SetIsPublic(v bool)`

SetIsPublic sets IsPublic field to given value.

### HasIsPublic

`func (o *ObjsFile) HasIsPublic() bool`

HasIsPublic returns a boolean if a field has been set.

### GetIsStarred

`func (o *ObjsFile) GetIsStarred() bool`

GetIsStarred returns the IsStarred field if non-nil, zero value otherwise.

### GetIsStarredOk

`func (o *ObjsFile) GetIsStarredOk() (*bool, bool)`

GetIsStarredOk returns a tuple with the IsStarred field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsStarred

`func (o *ObjsFile) SetIsStarred(v bool)`

SetIsStarred sets IsStarred field to given value.

### HasIsStarred

`func (o *ObjsFile) HasIsStarred() bool`

HasIsStarred returns a boolean if a field has been set.

### GetIsTombstoned

`func (o *ObjsFile) GetIsTombstoned() bool`

GetIsTombstoned returns the IsTombstoned field if non-nil, zero value otherwise.

### GetIsTombstonedOk

`func (o *ObjsFile) GetIsTombstonedOk() (*bool, bool)`

GetIsTombstonedOk returns a tuple with the IsTombstoned field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsTombstoned

`func (o *ObjsFile) SetIsTombstoned(v bool)`

SetIsTombstoned sets IsTombstoned field to given value.

### HasIsTombstoned

`func (o *ObjsFile) HasIsTombstoned() bool`

HasIsTombstoned returns a boolean if a field has been set.

### GetLastEditor

`func (o *ObjsFile) GetLastEditor() string`

GetLastEditor returns the LastEditor field if non-nil, zero value otherwise.

### GetLastEditorOk

`func (o *ObjsFile) GetLastEditorOk() (*string, bool)`

GetLastEditorOk returns a tuple with the LastEditor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastEditor

`func (o *ObjsFile) SetLastEditor(v string)`

SetLastEditor sets LastEditor field to given value.

### HasLastEditor

`func (o *ObjsFile) HasLastEditor() bool`

HasLastEditor returns a boolean if a field has been set.

### GetMimetype

`func (o *ObjsFile) GetMimetype() string`

GetMimetype returns the Mimetype field if non-nil, zero value otherwise.

### GetMimetypeOk

`func (o *ObjsFile) GetMimetypeOk() (*string, bool)`

GetMimetypeOk returns a tuple with the Mimetype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMimetype

`func (o *ObjsFile) SetMimetype(v string)`

SetMimetype sets Mimetype field to given value.

### HasMimetype

`func (o *ObjsFile) HasMimetype() bool`

HasMimetype returns a boolean if a field has been set.

### GetMode

`func (o *ObjsFile) GetMode() string`

GetMode returns the Mode field if non-nil, zero value otherwise.

### GetModeOk

`func (o *ObjsFile) GetModeOk() (*string, bool)`

GetModeOk returns a tuple with the Mode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMode

`func (o *ObjsFile) SetMode(v string)`

SetMode sets Mode field to given value.

### HasMode

`func (o *ObjsFile) HasMode() bool`

HasMode returns a boolean if a field has been set.

### GetName

`func (o *ObjsFile) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ObjsFile) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ObjsFile) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ObjsFile) HasName() bool`

HasName returns a boolean if a field has been set.

### GetNonOwnerEditable

`func (o *ObjsFile) GetNonOwnerEditable() bool`

GetNonOwnerEditable returns the NonOwnerEditable field if non-nil, zero value otherwise.

### GetNonOwnerEditableOk

`func (o *ObjsFile) GetNonOwnerEditableOk() (*bool, bool)`

GetNonOwnerEditableOk returns a tuple with the NonOwnerEditable field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNonOwnerEditable

`func (o *ObjsFile) SetNonOwnerEditable(v bool)`

SetNonOwnerEditable sets NonOwnerEditable field to given value.

### HasNonOwnerEditable

`func (o *ObjsFile) HasNonOwnerEditable() bool`

HasNonOwnerEditable returns a boolean if a field has been set.

### GetNumStars

`func (o *ObjsFile) GetNumStars() int32`

GetNumStars returns the NumStars field if non-nil, zero value otherwise.

### GetNumStarsOk

`func (o *ObjsFile) GetNumStarsOk() (*int32, bool)`

GetNumStarsOk returns a tuple with the NumStars field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumStars

`func (o *ObjsFile) SetNumStars(v int32)`

SetNumStars sets NumStars field to given value.

### HasNumStars

`func (o *ObjsFile) HasNumStars() bool`

HasNumStars returns a boolean if a field has been set.

### GetOriginalH

`func (o *ObjsFile) GetOriginalH() int32`

GetOriginalH returns the OriginalH field if non-nil, zero value otherwise.

### GetOriginalHOk

`func (o *ObjsFile) GetOriginalHOk() (*int32, bool)`

GetOriginalHOk returns a tuple with the OriginalH field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOriginalH

`func (o *ObjsFile) SetOriginalH(v int32)`

SetOriginalH sets OriginalH field to given value.

### HasOriginalH

`func (o *ObjsFile) HasOriginalH() bool`

HasOriginalH returns a boolean if a field has been set.

### GetOriginalW

`func (o *ObjsFile) GetOriginalW() int32`

GetOriginalW returns the OriginalW field if non-nil, zero value otherwise.

### GetOriginalWOk

`func (o *ObjsFile) GetOriginalWOk() (*int32, bool)`

GetOriginalWOk returns a tuple with the OriginalW field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOriginalW

`func (o *ObjsFile) SetOriginalW(v int32)`

SetOriginalW sets OriginalW field to given value.

### HasOriginalW

`func (o *ObjsFile) HasOriginalW() bool`

HasOriginalW returns a boolean if a field has been set.

### GetPermalink

`func (o *ObjsFile) GetPermalink() string`

GetPermalink returns the Permalink field if non-nil, zero value otherwise.

### GetPermalinkOk

`func (o *ObjsFile) GetPermalinkOk() (*string, bool)`

GetPermalinkOk returns a tuple with the Permalink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPermalink

`func (o *ObjsFile) SetPermalink(v string)`

SetPermalink sets Permalink field to given value.

### HasPermalink

`func (o *ObjsFile) HasPermalink() bool`

HasPermalink returns a boolean if a field has been set.

### GetPermalinkPublic

`func (o *ObjsFile) GetPermalinkPublic() string`

GetPermalinkPublic returns the PermalinkPublic field if non-nil, zero value otherwise.

### GetPermalinkPublicOk

`func (o *ObjsFile) GetPermalinkPublicOk() (*string, bool)`

GetPermalinkPublicOk returns a tuple with the PermalinkPublic field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPermalinkPublic

`func (o *ObjsFile) SetPermalinkPublic(v string)`

SetPermalinkPublic sets PermalinkPublic field to given value.

### HasPermalinkPublic

`func (o *ObjsFile) HasPermalinkPublic() bool`

HasPermalinkPublic returns a boolean if a field has been set.

### GetPinnedInfo

`func (o *ObjsFile) GetPinnedInfo() map[string]interface{}`

GetPinnedInfo returns the PinnedInfo field if non-nil, zero value otherwise.

### GetPinnedInfoOk

`func (o *ObjsFile) GetPinnedInfoOk() (*map[string]interface{}, bool)`

GetPinnedInfoOk returns a tuple with the PinnedInfo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPinnedInfo

`func (o *ObjsFile) SetPinnedInfo(v map[string]interface{})`

SetPinnedInfo sets PinnedInfo field to given value.

### HasPinnedInfo

`func (o *ObjsFile) HasPinnedInfo() bool`

HasPinnedInfo returns a boolean if a field has been set.

### GetPinnedTo

`func (o *ObjsFile) GetPinnedTo() []string`

GetPinnedTo returns the PinnedTo field if non-nil, zero value otherwise.

### GetPinnedToOk

`func (o *ObjsFile) GetPinnedToOk() (*[]string, bool)`

GetPinnedToOk returns a tuple with the PinnedTo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPinnedTo

`func (o *ObjsFile) SetPinnedTo(v []string)`

SetPinnedTo sets PinnedTo field to given value.

### HasPinnedTo

`func (o *ObjsFile) HasPinnedTo() bool`

HasPinnedTo returns a boolean if a field has been set.

### GetPrettyType

`func (o *ObjsFile) GetPrettyType() string`

GetPrettyType returns the PrettyType field if non-nil, zero value otherwise.

### GetPrettyTypeOk

`func (o *ObjsFile) GetPrettyTypeOk() (*string, bool)`

GetPrettyTypeOk returns a tuple with the PrettyType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrettyType

`func (o *ObjsFile) SetPrettyType(v string)`

SetPrettyType sets PrettyType field to given value.

### HasPrettyType

`func (o *ObjsFile) HasPrettyType() bool`

HasPrettyType returns a boolean if a field has been set.

### GetPreview

`func (o *ObjsFile) GetPreview() string`

GetPreview returns the Preview field if non-nil, zero value otherwise.

### GetPreviewOk

`func (o *ObjsFile) GetPreviewOk() (*string, bool)`

GetPreviewOk returns a tuple with the Preview field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreview

`func (o *ObjsFile) SetPreview(v string)`

SetPreview sets Preview field to given value.

### HasPreview

`func (o *ObjsFile) HasPreview() bool`

HasPreview returns a boolean if a field has been set.

### GetPublicUrlShared

`func (o *ObjsFile) GetPublicUrlShared() bool`

GetPublicUrlShared returns the PublicUrlShared field if non-nil, zero value otherwise.

### GetPublicUrlSharedOk

`func (o *ObjsFile) GetPublicUrlSharedOk() (*bool, bool)`

GetPublicUrlSharedOk returns a tuple with the PublicUrlShared field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPublicUrlShared

`func (o *ObjsFile) SetPublicUrlShared(v bool)`

SetPublicUrlShared sets PublicUrlShared field to given value.

### HasPublicUrlShared

`func (o *ObjsFile) HasPublicUrlShared() bool`

HasPublicUrlShared returns a boolean if a field has been set.

### GetReactions

`func (o *ObjsFile) GetReactions() []ObjsReaction`

GetReactions returns the Reactions field if non-nil, zero value otherwise.

### GetReactionsOk

`func (o *ObjsFile) GetReactionsOk() (*[]ObjsReaction, bool)`

GetReactionsOk returns a tuple with the Reactions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReactions

`func (o *ObjsFile) SetReactions(v []ObjsReaction)`

SetReactions sets Reactions field to given value.

### HasReactions

`func (o *ObjsFile) HasReactions() bool`

HasReactions returns a boolean if a field has been set.

### GetShares

`func (o *ObjsFile) GetShares() ObjsFileShares`

GetShares returns the Shares field if non-nil, zero value otherwise.

### GetSharesOk

`func (o *ObjsFile) GetSharesOk() (*ObjsFileShares, bool)`

GetSharesOk returns a tuple with the Shares field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShares

`func (o *ObjsFile) SetShares(v ObjsFileShares)`

SetShares sets Shares field to given value.

### HasShares

`func (o *ObjsFile) HasShares() bool`

HasShares returns a boolean if a field has been set.

### GetSize

`func (o *ObjsFile) GetSize() int32`

GetSize returns the Size field if non-nil, zero value otherwise.

### GetSizeOk

`func (o *ObjsFile) GetSizeOk() (*int32, bool)`

GetSizeOk returns a tuple with the Size field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSize

`func (o *ObjsFile) SetSize(v int32)`

SetSize sets Size field to given value.

### HasSize

`func (o *ObjsFile) HasSize() bool`

HasSize returns a boolean if a field has been set.

### GetSourceTeam

`func (o *ObjsFile) GetSourceTeam() string`

GetSourceTeam returns the SourceTeam field if non-nil, zero value otherwise.

### GetSourceTeamOk

`func (o *ObjsFile) GetSourceTeamOk() (*string, bool)`

GetSourceTeamOk returns a tuple with the SourceTeam field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSourceTeam

`func (o *ObjsFile) SetSourceTeam(v string)`

SetSourceTeam sets SourceTeam field to given value.

### HasSourceTeam

`func (o *ObjsFile) HasSourceTeam() bool`

HasSourceTeam returns a boolean if a field has been set.

### GetState

`func (o *ObjsFile) GetState() string`

GetState returns the State field if non-nil, zero value otherwise.

### GetStateOk

`func (o *ObjsFile) GetStateOk() (*string, bool)`

GetStateOk returns a tuple with the State field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetState

`func (o *ObjsFile) SetState(v string)`

SetState sets State field to given value.

### HasState

`func (o *ObjsFile) HasState() bool`

HasState returns a boolean if a field has been set.

### GetThumb1024

`func (o *ObjsFile) GetThumb1024() string`

GetThumb1024 returns the Thumb1024 field if non-nil, zero value otherwise.

### GetThumb1024Ok

`func (o *ObjsFile) GetThumb1024Ok() (*string, bool)`

GetThumb1024Ok returns a tuple with the Thumb1024 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetThumb1024

`func (o *ObjsFile) SetThumb1024(v string)`

SetThumb1024 sets Thumb1024 field to given value.

### HasThumb1024

`func (o *ObjsFile) HasThumb1024() bool`

HasThumb1024 returns a boolean if a field has been set.

### GetThumb1024H

`func (o *ObjsFile) GetThumb1024H() int32`

GetThumb1024H returns the Thumb1024H field if non-nil, zero value otherwise.

### GetThumb1024HOk

`func (o *ObjsFile) GetThumb1024HOk() (*int32, bool)`

GetThumb1024HOk returns a tuple with the Thumb1024H field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetThumb1024H

`func (o *ObjsFile) SetThumb1024H(v int32)`

SetThumb1024H sets Thumb1024H field to given value.

### HasThumb1024H

`func (o *ObjsFile) HasThumb1024H() bool`

HasThumb1024H returns a boolean if a field has been set.

### GetThumb1024W

`func (o *ObjsFile) GetThumb1024W() int32`

GetThumb1024W returns the Thumb1024W field if non-nil, zero value otherwise.

### GetThumb1024WOk

`func (o *ObjsFile) GetThumb1024WOk() (*int32, bool)`

GetThumb1024WOk returns a tuple with the Thumb1024W field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetThumb1024W

`func (o *ObjsFile) SetThumb1024W(v int32)`

SetThumb1024W sets Thumb1024W field to given value.

### HasThumb1024W

`func (o *ObjsFile) HasThumb1024W() bool`

HasThumb1024W returns a boolean if a field has been set.

### GetThumb160

`func (o *ObjsFile) GetThumb160() string`

GetThumb160 returns the Thumb160 field if non-nil, zero value otherwise.

### GetThumb160Ok

`func (o *ObjsFile) GetThumb160Ok() (*string, bool)`

GetThumb160Ok returns a tuple with the Thumb160 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetThumb160

`func (o *ObjsFile) SetThumb160(v string)`

SetThumb160 sets Thumb160 field to given value.

### HasThumb160

`func (o *ObjsFile) HasThumb160() bool`

HasThumb160 returns a boolean if a field has been set.

### GetThumb360

`func (o *ObjsFile) GetThumb360() string`

GetThumb360 returns the Thumb360 field if non-nil, zero value otherwise.

### GetThumb360Ok

`func (o *ObjsFile) GetThumb360Ok() (*string, bool)`

GetThumb360Ok returns a tuple with the Thumb360 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetThumb360

`func (o *ObjsFile) SetThumb360(v string)`

SetThumb360 sets Thumb360 field to given value.

### HasThumb360

`func (o *ObjsFile) HasThumb360() bool`

HasThumb360 returns a boolean if a field has been set.

### GetThumb360H

`func (o *ObjsFile) GetThumb360H() int32`

GetThumb360H returns the Thumb360H field if non-nil, zero value otherwise.

### GetThumb360HOk

`func (o *ObjsFile) GetThumb360HOk() (*int32, bool)`

GetThumb360HOk returns a tuple with the Thumb360H field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetThumb360H

`func (o *ObjsFile) SetThumb360H(v int32)`

SetThumb360H sets Thumb360H field to given value.

### HasThumb360H

`func (o *ObjsFile) HasThumb360H() bool`

HasThumb360H returns a boolean if a field has been set.

### GetThumb360W

`func (o *ObjsFile) GetThumb360W() int32`

GetThumb360W returns the Thumb360W field if non-nil, zero value otherwise.

### GetThumb360WOk

`func (o *ObjsFile) GetThumb360WOk() (*int32, bool)`

GetThumb360WOk returns a tuple with the Thumb360W field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetThumb360W

`func (o *ObjsFile) SetThumb360W(v int32)`

SetThumb360W sets Thumb360W field to given value.

### HasThumb360W

`func (o *ObjsFile) HasThumb360W() bool`

HasThumb360W returns a boolean if a field has been set.

### GetThumb480

`func (o *ObjsFile) GetThumb480() string`

GetThumb480 returns the Thumb480 field if non-nil, zero value otherwise.

### GetThumb480Ok

`func (o *ObjsFile) GetThumb480Ok() (*string, bool)`

GetThumb480Ok returns a tuple with the Thumb480 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetThumb480

`func (o *ObjsFile) SetThumb480(v string)`

SetThumb480 sets Thumb480 field to given value.

### HasThumb480

`func (o *ObjsFile) HasThumb480() bool`

HasThumb480 returns a boolean if a field has been set.

### GetThumb480H

`func (o *ObjsFile) GetThumb480H() int32`

GetThumb480H returns the Thumb480H field if non-nil, zero value otherwise.

### GetThumb480HOk

`func (o *ObjsFile) GetThumb480HOk() (*int32, bool)`

GetThumb480HOk returns a tuple with the Thumb480H field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetThumb480H

`func (o *ObjsFile) SetThumb480H(v int32)`

SetThumb480H sets Thumb480H field to given value.

### HasThumb480H

`func (o *ObjsFile) HasThumb480H() bool`

HasThumb480H returns a boolean if a field has been set.

### GetThumb480W

`func (o *ObjsFile) GetThumb480W() int32`

GetThumb480W returns the Thumb480W field if non-nil, zero value otherwise.

### GetThumb480WOk

`func (o *ObjsFile) GetThumb480WOk() (*int32, bool)`

GetThumb480WOk returns a tuple with the Thumb480W field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetThumb480W

`func (o *ObjsFile) SetThumb480W(v int32)`

SetThumb480W sets Thumb480W field to given value.

### HasThumb480W

`func (o *ObjsFile) HasThumb480W() bool`

HasThumb480W returns a boolean if a field has been set.

### GetThumb64

`func (o *ObjsFile) GetThumb64() string`

GetThumb64 returns the Thumb64 field if non-nil, zero value otherwise.

### GetThumb64Ok

`func (o *ObjsFile) GetThumb64Ok() (*string, bool)`

GetThumb64Ok returns a tuple with the Thumb64 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetThumb64

`func (o *ObjsFile) SetThumb64(v string)`

SetThumb64 sets Thumb64 field to given value.

### HasThumb64

`func (o *ObjsFile) HasThumb64() bool`

HasThumb64 returns a boolean if a field has been set.

### GetThumb720

`func (o *ObjsFile) GetThumb720() string`

GetThumb720 returns the Thumb720 field if non-nil, zero value otherwise.

### GetThumb720Ok

`func (o *ObjsFile) GetThumb720Ok() (*string, bool)`

GetThumb720Ok returns a tuple with the Thumb720 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetThumb720

`func (o *ObjsFile) SetThumb720(v string)`

SetThumb720 sets Thumb720 field to given value.

### HasThumb720

`func (o *ObjsFile) HasThumb720() bool`

HasThumb720 returns a boolean if a field has been set.

### GetThumb720H

`func (o *ObjsFile) GetThumb720H() int32`

GetThumb720H returns the Thumb720H field if non-nil, zero value otherwise.

### GetThumb720HOk

`func (o *ObjsFile) GetThumb720HOk() (*int32, bool)`

GetThumb720HOk returns a tuple with the Thumb720H field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetThumb720H

`func (o *ObjsFile) SetThumb720H(v int32)`

SetThumb720H sets Thumb720H field to given value.

### HasThumb720H

`func (o *ObjsFile) HasThumb720H() bool`

HasThumb720H returns a boolean if a field has been set.

### GetThumb720W

`func (o *ObjsFile) GetThumb720W() int32`

GetThumb720W returns the Thumb720W field if non-nil, zero value otherwise.

### GetThumb720WOk

`func (o *ObjsFile) GetThumb720WOk() (*int32, bool)`

GetThumb720WOk returns a tuple with the Thumb720W field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetThumb720W

`func (o *ObjsFile) SetThumb720W(v int32)`

SetThumb720W sets Thumb720W field to given value.

### HasThumb720W

`func (o *ObjsFile) HasThumb720W() bool`

HasThumb720W returns a boolean if a field has been set.

### GetThumb80

`func (o *ObjsFile) GetThumb80() string`

GetThumb80 returns the Thumb80 field if non-nil, zero value otherwise.

### GetThumb80Ok

`func (o *ObjsFile) GetThumb80Ok() (*string, bool)`

GetThumb80Ok returns a tuple with the Thumb80 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetThumb80

`func (o *ObjsFile) SetThumb80(v string)`

SetThumb80 sets Thumb80 field to given value.

### HasThumb80

`func (o *ObjsFile) HasThumb80() bool`

HasThumb80 returns a boolean if a field has been set.

### GetThumb800

`func (o *ObjsFile) GetThumb800() string`

GetThumb800 returns the Thumb800 field if non-nil, zero value otherwise.

### GetThumb800Ok

`func (o *ObjsFile) GetThumb800Ok() (*string, bool)`

GetThumb800Ok returns a tuple with the Thumb800 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetThumb800

`func (o *ObjsFile) SetThumb800(v string)`

SetThumb800 sets Thumb800 field to given value.

### HasThumb800

`func (o *ObjsFile) HasThumb800() bool`

HasThumb800 returns a boolean if a field has been set.

### GetThumb800H

`func (o *ObjsFile) GetThumb800H() int32`

GetThumb800H returns the Thumb800H field if non-nil, zero value otherwise.

### GetThumb800HOk

`func (o *ObjsFile) GetThumb800HOk() (*int32, bool)`

GetThumb800HOk returns a tuple with the Thumb800H field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetThumb800H

`func (o *ObjsFile) SetThumb800H(v int32)`

SetThumb800H sets Thumb800H field to given value.

### HasThumb800H

`func (o *ObjsFile) HasThumb800H() bool`

HasThumb800H returns a boolean if a field has been set.

### GetThumb800W

`func (o *ObjsFile) GetThumb800W() int32`

GetThumb800W returns the Thumb800W field if non-nil, zero value otherwise.

### GetThumb800WOk

`func (o *ObjsFile) GetThumb800WOk() (*int32, bool)`

GetThumb800WOk returns a tuple with the Thumb800W field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetThumb800W

`func (o *ObjsFile) SetThumb800W(v int32)`

SetThumb800W sets Thumb800W field to given value.

### HasThumb800W

`func (o *ObjsFile) HasThumb800W() bool`

HasThumb800W returns a boolean if a field has been set.

### GetThumb960

`func (o *ObjsFile) GetThumb960() string`

GetThumb960 returns the Thumb960 field if non-nil, zero value otherwise.

### GetThumb960Ok

`func (o *ObjsFile) GetThumb960Ok() (*string, bool)`

GetThumb960Ok returns a tuple with the Thumb960 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetThumb960

`func (o *ObjsFile) SetThumb960(v string)`

SetThumb960 sets Thumb960 field to given value.

### HasThumb960

`func (o *ObjsFile) HasThumb960() bool`

HasThumb960 returns a boolean if a field has been set.

### GetThumb960H

`func (o *ObjsFile) GetThumb960H() int32`

GetThumb960H returns the Thumb960H field if non-nil, zero value otherwise.

### GetThumb960HOk

`func (o *ObjsFile) GetThumb960HOk() (*int32, bool)`

GetThumb960HOk returns a tuple with the Thumb960H field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetThumb960H

`func (o *ObjsFile) SetThumb960H(v int32)`

SetThumb960H sets Thumb960H field to given value.

### HasThumb960H

`func (o *ObjsFile) HasThumb960H() bool`

HasThumb960H returns a boolean if a field has been set.

### GetThumb960W

`func (o *ObjsFile) GetThumb960W() int32`

GetThumb960W returns the Thumb960W field if non-nil, zero value otherwise.

### GetThumb960WOk

`func (o *ObjsFile) GetThumb960WOk() (*int32, bool)`

GetThumb960WOk returns a tuple with the Thumb960W field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetThumb960W

`func (o *ObjsFile) SetThumb960W(v int32)`

SetThumb960W sets Thumb960W field to given value.

### HasThumb960W

`func (o *ObjsFile) HasThumb960W() bool`

HasThumb960W returns a boolean if a field has been set.

### GetThumbTiny

`func (o *ObjsFile) GetThumbTiny() string`

GetThumbTiny returns the ThumbTiny field if non-nil, zero value otherwise.

### GetThumbTinyOk

`func (o *ObjsFile) GetThumbTinyOk() (*string, bool)`

GetThumbTinyOk returns a tuple with the ThumbTiny field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetThumbTiny

`func (o *ObjsFile) SetThumbTiny(v string)`

SetThumbTiny sets ThumbTiny field to given value.

### HasThumbTiny

`func (o *ObjsFile) HasThumbTiny() bool`

HasThumbTiny returns a boolean if a field has been set.

### GetTimestamp

`func (o *ObjsFile) GetTimestamp() int32`

GetTimestamp returns the Timestamp field if non-nil, zero value otherwise.

### GetTimestampOk

`func (o *ObjsFile) GetTimestampOk() (*int32, bool)`

GetTimestampOk returns a tuple with the Timestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimestamp

`func (o *ObjsFile) SetTimestamp(v int32)`

SetTimestamp sets Timestamp field to given value.

### HasTimestamp

`func (o *ObjsFile) HasTimestamp() bool`

HasTimestamp returns a boolean if a field has been set.

### GetTitle

`func (o *ObjsFile) GetTitle() string`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *ObjsFile) GetTitleOk() (*string, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *ObjsFile) SetTitle(v string)`

SetTitle sets Title field to given value.

### HasTitle

`func (o *ObjsFile) HasTitle() bool`

HasTitle returns a boolean if a field has been set.

### GetUpdated

`func (o *ObjsFile) GetUpdated() int32`

GetUpdated returns the Updated field if non-nil, zero value otherwise.

### GetUpdatedOk

`func (o *ObjsFile) GetUpdatedOk() (*int32, bool)`

GetUpdatedOk returns a tuple with the Updated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdated

`func (o *ObjsFile) SetUpdated(v int32)`

SetUpdated sets Updated field to given value.

### HasUpdated

`func (o *ObjsFile) HasUpdated() bool`

HasUpdated returns a boolean if a field has been set.

### GetUrlPrivate

`func (o *ObjsFile) GetUrlPrivate() string`

GetUrlPrivate returns the UrlPrivate field if non-nil, zero value otherwise.

### GetUrlPrivateOk

`func (o *ObjsFile) GetUrlPrivateOk() (*string, bool)`

GetUrlPrivateOk returns a tuple with the UrlPrivate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrlPrivate

`func (o *ObjsFile) SetUrlPrivate(v string)`

SetUrlPrivate sets UrlPrivate field to given value.

### HasUrlPrivate

`func (o *ObjsFile) HasUrlPrivate() bool`

HasUrlPrivate returns a boolean if a field has been set.

### GetUrlPrivateDownload

`func (o *ObjsFile) GetUrlPrivateDownload() string`

GetUrlPrivateDownload returns the UrlPrivateDownload field if non-nil, zero value otherwise.

### GetUrlPrivateDownloadOk

`func (o *ObjsFile) GetUrlPrivateDownloadOk() (*string, bool)`

GetUrlPrivateDownloadOk returns a tuple with the UrlPrivateDownload field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrlPrivateDownload

`func (o *ObjsFile) SetUrlPrivateDownload(v string)`

SetUrlPrivateDownload sets UrlPrivateDownload field to given value.

### HasUrlPrivateDownload

`func (o *ObjsFile) HasUrlPrivateDownload() bool`

HasUrlPrivateDownload returns a boolean if a field has been set.

### GetUser

`func (o *ObjsFile) GetUser() string`

GetUser returns the User field if non-nil, zero value otherwise.

### GetUserOk

`func (o *ObjsFile) GetUserOk() (*string, bool)`

GetUserOk returns a tuple with the User field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUser

`func (o *ObjsFile) SetUser(v string)`

SetUser sets User field to given value.

### HasUser

`func (o *ObjsFile) HasUser() bool`

HasUser returns a boolean if a field has been set.

### GetUserTeam

`func (o *ObjsFile) GetUserTeam() string`

GetUserTeam returns the UserTeam field if non-nil, zero value otherwise.

### GetUserTeamOk

`func (o *ObjsFile) GetUserTeamOk() (*string, bool)`

GetUserTeamOk returns a tuple with the UserTeam field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserTeam

`func (o *ObjsFile) SetUserTeam(v string)`

SetUserTeam sets UserTeam field to given value.

### HasUserTeam

`func (o *ObjsFile) HasUserTeam() bool`

HasUserTeam returns a boolean if a field has been set.

### GetUsername

`func (o *ObjsFile) GetUsername() string`

GetUsername returns the Username field if non-nil, zero value otherwise.

### GetUsernameOk

`func (o *ObjsFile) GetUsernameOk() (*string, bool)`

GetUsernameOk returns a tuple with the Username field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsername

`func (o *ObjsFile) SetUsername(v string)`

SetUsername sets Username field to given value.

### HasUsername

`func (o *ObjsFile) HasUsername() bool`

HasUsername returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


