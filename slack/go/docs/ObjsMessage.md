# ObjsMessage

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attachments** | Pointer to [**[]ObjsMessageAttachmentsInner**](ObjsMessageAttachmentsInner.md) |  | [optional] 
**Blocks** | Pointer to [**[]BlocksInner**](BlocksInner.md) | This is a very loose definition, in the future, we&#39;ll populate this with deeper schema in this definition namespace. | [optional] 
**BotId** | Pointer to [**[]ObjsMessageBotIdInner**](ObjsMessageBotIdInner.md) |  | [optional] 
**BotProfile** | Pointer to [**ObjsBotProfile**](ObjsBotProfile.md) |  | [optional] 
**ClientMsgId** | Pointer to **string** |  | [optional] 
**Comment** | Pointer to [**ObjsComment**](ObjsComment.md) |  | [optional] 
**DisplayAsBot** | Pointer to **bool** |  | [optional] 
**File** | Pointer to [**ObjsFile**](ObjsFile.md) |  | [optional] 
**Files** | Pointer to [**[]ObjsFile**](ObjsFile.md) |  | [optional] 
**Icons** | Pointer to [**ObjsMessageIcons**](ObjsMessageIcons.md) |  | [optional] 
**Inviter** | Pointer to **string** |  | [optional] 
**IsDelayedMessage** | Pointer to **bool** |  | [optional] 
**IsIntro** | Pointer to **bool** |  | [optional] 
**IsStarred** | Pointer to **bool** |  | [optional] 
**LastRead** | Pointer to **string** |  | [optional] 
**LatestReply** | Pointer to **string** |  | [optional] 
**Name** | Pointer to **string** |  | [optional] 
**OldName** | Pointer to **string** |  | [optional] 
**ParentUserId** | Pointer to **string** |  | [optional] 
**Permalink** | Pointer to **string** |  | [optional] 
**PinnedTo** | Pointer to **[]string** |  | [optional] 
**Purpose** | Pointer to **string** |  | [optional] 
**Reactions** | Pointer to [**[]ObjsReaction**](ObjsReaction.md) |  | [optional] 
**ReplyCount** | Pointer to **int32** |  | [optional] 
**ReplyUsers** | Pointer to **[]string** |  | [optional] 
**ReplyUsersCount** | Pointer to **int32** |  | [optional] 
**SourceTeam** | Pointer to **string** |  | [optional] 
**Subscribed** | Pointer to **bool** |  | [optional] 
**Subtype** | Pointer to **string** |  | [optional] 
**Team** | Pointer to **string** |  | [optional] 
**Text** | **string** |  | 
**ThreadTs** | Pointer to **string** |  | [optional] 
**Topic** | Pointer to **string** |  | [optional] 
**Ts** | **string** |  | 
**Type** | **string** |  | 
**UnreadCount** | Pointer to **int32** |  | [optional] 
**Upload** | Pointer to **bool** |  | [optional] 
**User** | Pointer to **string** |  | [optional] 
**UserProfile** | Pointer to [**ObjsUserProfileShort**](ObjsUserProfileShort.md) |  | [optional] 
**UserTeam** | Pointer to **string** |  | [optional] 
**Username** | Pointer to **string** |  | [optional] 

## Methods

### NewObjsMessage

`func NewObjsMessage(text string, ts string, type_ string, ) *ObjsMessage`

NewObjsMessage instantiates a new ObjsMessage object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewObjsMessageWithDefaults

`func NewObjsMessageWithDefaults() *ObjsMessage`

NewObjsMessageWithDefaults instantiates a new ObjsMessage object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAttachments

`func (o *ObjsMessage) GetAttachments() []ObjsMessageAttachmentsInner`

GetAttachments returns the Attachments field if non-nil, zero value otherwise.

### GetAttachmentsOk

`func (o *ObjsMessage) GetAttachmentsOk() (*[]ObjsMessageAttachmentsInner, bool)`

GetAttachmentsOk returns a tuple with the Attachments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttachments

`func (o *ObjsMessage) SetAttachments(v []ObjsMessageAttachmentsInner)`

SetAttachments sets Attachments field to given value.

### HasAttachments

`func (o *ObjsMessage) HasAttachments() bool`

HasAttachments returns a boolean if a field has been set.

### GetBlocks

`func (o *ObjsMessage) GetBlocks() []BlocksInner`

GetBlocks returns the Blocks field if non-nil, zero value otherwise.

### GetBlocksOk

`func (o *ObjsMessage) GetBlocksOk() (*[]BlocksInner, bool)`

GetBlocksOk returns a tuple with the Blocks field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBlocks

`func (o *ObjsMessage) SetBlocks(v []BlocksInner)`

SetBlocks sets Blocks field to given value.

### HasBlocks

`func (o *ObjsMessage) HasBlocks() bool`

HasBlocks returns a boolean if a field has been set.

### GetBotId

`func (o *ObjsMessage) GetBotId() []ObjsMessageBotIdInner`

GetBotId returns the BotId field if non-nil, zero value otherwise.

### GetBotIdOk

`func (o *ObjsMessage) GetBotIdOk() (*[]ObjsMessageBotIdInner, bool)`

GetBotIdOk returns a tuple with the BotId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBotId

`func (o *ObjsMessage) SetBotId(v []ObjsMessageBotIdInner)`

SetBotId sets BotId field to given value.

### HasBotId

`func (o *ObjsMessage) HasBotId() bool`

HasBotId returns a boolean if a field has been set.

### GetBotProfile

`func (o *ObjsMessage) GetBotProfile() ObjsBotProfile`

GetBotProfile returns the BotProfile field if non-nil, zero value otherwise.

### GetBotProfileOk

`func (o *ObjsMessage) GetBotProfileOk() (*ObjsBotProfile, bool)`

GetBotProfileOk returns a tuple with the BotProfile field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBotProfile

`func (o *ObjsMessage) SetBotProfile(v ObjsBotProfile)`

SetBotProfile sets BotProfile field to given value.

### HasBotProfile

`func (o *ObjsMessage) HasBotProfile() bool`

HasBotProfile returns a boolean if a field has been set.

### GetClientMsgId

`func (o *ObjsMessage) GetClientMsgId() string`

GetClientMsgId returns the ClientMsgId field if non-nil, zero value otherwise.

### GetClientMsgIdOk

`func (o *ObjsMessage) GetClientMsgIdOk() (*string, bool)`

GetClientMsgIdOk returns a tuple with the ClientMsgId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClientMsgId

`func (o *ObjsMessage) SetClientMsgId(v string)`

SetClientMsgId sets ClientMsgId field to given value.

### HasClientMsgId

`func (o *ObjsMessage) HasClientMsgId() bool`

HasClientMsgId returns a boolean if a field has been set.

### GetComment

`func (o *ObjsMessage) GetComment() ObjsComment`

GetComment returns the Comment field if non-nil, zero value otherwise.

### GetCommentOk

`func (o *ObjsMessage) GetCommentOk() (*ObjsComment, bool)`

GetCommentOk returns a tuple with the Comment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComment

`func (o *ObjsMessage) SetComment(v ObjsComment)`

SetComment sets Comment field to given value.

### HasComment

`func (o *ObjsMessage) HasComment() bool`

HasComment returns a boolean if a field has been set.

### GetDisplayAsBot

`func (o *ObjsMessage) GetDisplayAsBot() bool`

GetDisplayAsBot returns the DisplayAsBot field if non-nil, zero value otherwise.

### GetDisplayAsBotOk

`func (o *ObjsMessage) GetDisplayAsBotOk() (*bool, bool)`

GetDisplayAsBotOk returns a tuple with the DisplayAsBot field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplayAsBot

`func (o *ObjsMessage) SetDisplayAsBot(v bool)`

SetDisplayAsBot sets DisplayAsBot field to given value.

### HasDisplayAsBot

`func (o *ObjsMessage) HasDisplayAsBot() bool`

HasDisplayAsBot returns a boolean if a field has been set.

### GetFile

`func (o *ObjsMessage) GetFile() ObjsFile`

GetFile returns the File field if non-nil, zero value otherwise.

### GetFileOk

`func (o *ObjsMessage) GetFileOk() (*ObjsFile, bool)`

GetFileOk returns a tuple with the File field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFile

`func (o *ObjsMessage) SetFile(v ObjsFile)`

SetFile sets File field to given value.

### HasFile

`func (o *ObjsMessage) HasFile() bool`

HasFile returns a boolean if a field has been set.

### GetFiles

`func (o *ObjsMessage) GetFiles() []ObjsFile`

GetFiles returns the Files field if non-nil, zero value otherwise.

### GetFilesOk

`func (o *ObjsMessage) GetFilesOk() (*[]ObjsFile, bool)`

GetFilesOk returns a tuple with the Files field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFiles

`func (o *ObjsMessage) SetFiles(v []ObjsFile)`

SetFiles sets Files field to given value.

### HasFiles

`func (o *ObjsMessage) HasFiles() bool`

HasFiles returns a boolean if a field has been set.

### GetIcons

`func (o *ObjsMessage) GetIcons() ObjsMessageIcons`

GetIcons returns the Icons field if non-nil, zero value otherwise.

### GetIconsOk

`func (o *ObjsMessage) GetIconsOk() (*ObjsMessageIcons, bool)`

GetIconsOk returns a tuple with the Icons field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIcons

`func (o *ObjsMessage) SetIcons(v ObjsMessageIcons)`

SetIcons sets Icons field to given value.

### HasIcons

`func (o *ObjsMessage) HasIcons() bool`

HasIcons returns a boolean if a field has been set.

### GetInviter

`func (o *ObjsMessage) GetInviter() string`

GetInviter returns the Inviter field if non-nil, zero value otherwise.

### GetInviterOk

`func (o *ObjsMessage) GetInviterOk() (*string, bool)`

GetInviterOk returns a tuple with the Inviter field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInviter

`func (o *ObjsMessage) SetInviter(v string)`

SetInviter sets Inviter field to given value.

### HasInviter

`func (o *ObjsMessage) HasInviter() bool`

HasInviter returns a boolean if a field has been set.

### GetIsDelayedMessage

`func (o *ObjsMessage) GetIsDelayedMessage() bool`

GetIsDelayedMessage returns the IsDelayedMessage field if non-nil, zero value otherwise.

### GetIsDelayedMessageOk

`func (o *ObjsMessage) GetIsDelayedMessageOk() (*bool, bool)`

GetIsDelayedMessageOk returns a tuple with the IsDelayedMessage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsDelayedMessage

`func (o *ObjsMessage) SetIsDelayedMessage(v bool)`

SetIsDelayedMessage sets IsDelayedMessage field to given value.

### HasIsDelayedMessage

`func (o *ObjsMessage) HasIsDelayedMessage() bool`

HasIsDelayedMessage returns a boolean if a field has been set.

### GetIsIntro

`func (o *ObjsMessage) GetIsIntro() bool`

GetIsIntro returns the IsIntro field if non-nil, zero value otherwise.

### GetIsIntroOk

`func (o *ObjsMessage) GetIsIntroOk() (*bool, bool)`

GetIsIntroOk returns a tuple with the IsIntro field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsIntro

`func (o *ObjsMessage) SetIsIntro(v bool)`

SetIsIntro sets IsIntro field to given value.

### HasIsIntro

`func (o *ObjsMessage) HasIsIntro() bool`

HasIsIntro returns a boolean if a field has been set.

### GetIsStarred

`func (o *ObjsMessage) GetIsStarred() bool`

GetIsStarred returns the IsStarred field if non-nil, zero value otherwise.

### GetIsStarredOk

`func (o *ObjsMessage) GetIsStarredOk() (*bool, bool)`

GetIsStarredOk returns a tuple with the IsStarred field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsStarred

`func (o *ObjsMessage) SetIsStarred(v bool)`

SetIsStarred sets IsStarred field to given value.

### HasIsStarred

`func (o *ObjsMessage) HasIsStarred() bool`

HasIsStarred returns a boolean if a field has been set.

### GetLastRead

`func (o *ObjsMessage) GetLastRead() string`

GetLastRead returns the LastRead field if non-nil, zero value otherwise.

### GetLastReadOk

`func (o *ObjsMessage) GetLastReadOk() (*string, bool)`

GetLastReadOk returns a tuple with the LastRead field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastRead

`func (o *ObjsMessage) SetLastRead(v string)`

SetLastRead sets LastRead field to given value.

### HasLastRead

`func (o *ObjsMessage) HasLastRead() bool`

HasLastRead returns a boolean if a field has been set.

### GetLatestReply

`func (o *ObjsMessage) GetLatestReply() string`

GetLatestReply returns the LatestReply field if non-nil, zero value otherwise.

### GetLatestReplyOk

`func (o *ObjsMessage) GetLatestReplyOk() (*string, bool)`

GetLatestReplyOk returns a tuple with the LatestReply field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLatestReply

`func (o *ObjsMessage) SetLatestReply(v string)`

SetLatestReply sets LatestReply field to given value.

### HasLatestReply

`func (o *ObjsMessage) HasLatestReply() bool`

HasLatestReply returns a boolean if a field has been set.

### GetName

`func (o *ObjsMessage) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ObjsMessage) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ObjsMessage) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ObjsMessage) HasName() bool`

HasName returns a boolean if a field has been set.

### GetOldName

`func (o *ObjsMessage) GetOldName() string`

GetOldName returns the OldName field if non-nil, zero value otherwise.

### GetOldNameOk

`func (o *ObjsMessage) GetOldNameOk() (*string, bool)`

GetOldNameOk returns a tuple with the OldName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOldName

`func (o *ObjsMessage) SetOldName(v string)`

SetOldName sets OldName field to given value.

### HasOldName

`func (o *ObjsMessage) HasOldName() bool`

HasOldName returns a boolean if a field has been set.

### GetParentUserId

`func (o *ObjsMessage) GetParentUserId() string`

GetParentUserId returns the ParentUserId field if non-nil, zero value otherwise.

### GetParentUserIdOk

`func (o *ObjsMessage) GetParentUserIdOk() (*string, bool)`

GetParentUserIdOk returns a tuple with the ParentUserId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParentUserId

`func (o *ObjsMessage) SetParentUserId(v string)`

SetParentUserId sets ParentUserId field to given value.

### HasParentUserId

`func (o *ObjsMessage) HasParentUserId() bool`

HasParentUserId returns a boolean if a field has been set.

### GetPermalink

`func (o *ObjsMessage) GetPermalink() string`

GetPermalink returns the Permalink field if non-nil, zero value otherwise.

### GetPermalinkOk

`func (o *ObjsMessage) GetPermalinkOk() (*string, bool)`

GetPermalinkOk returns a tuple with the Permalink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPermalink

`func (o *ObjsMessage) SetPermalink(v string)`

SetPermalink sets Permalink field to given value.

### HasPermalink

`func (o *ObjsMessage) HasPermalink() bool`

HasPermalink returns a boolean if a field has been set.

### GetPinnedTo

`func (o *ObjsMessage) GetPinnedTo() []string`

GetPinnedTo returns the PinnedTo field if non-nil, zero value otherwise.

### GetPinnedToOk

`func (o *ObjsMessage) GetPinnedToOk() (*[]string, bool)`

GetPinnedToOk returns a tuple with the PinnedTo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPinnedTo

`func (o *ObjsMessage) SetPinnedTo(v []string)`

SetPinnedTo sets PinnedTo field to given value.

### HasPinnedTo

`func (o *ObjsMessage) HasPinnedTo() bool`

HasPinnedTo returns a boolean if a field has been set.

### GetPurpose

`func (o *ObjsMessage) GetPurpose() string`

GetPurpose returns the Purpose field if non-nil, zero value otherwise.

### GetPurposeOk

`func (o *ObjsMessage) GetPurposeOk() (*string, bool)`

GetPurposeOk returns a tuple with the Purpose field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPurpose

`func (o *ObjsMessage) SetPurpose(v string)`

SetPurpose sets Purpose field to given value.

### HasPurpose

`func (o *ObjsMessage) HasPurpose() bool`

HasPurpose returns a boolean if a field has been set.

### GetReactions

`func (o *ObjsMessage) GetReactions() []ObjsReaction`

GetReactions returns the Reactions field if non-nil, zero value otherwise.

### GetReactionsOk

`func (o *ObjsMessage) GetReactionsOk() (*[]ObjsReaction, bool)`

GetReactionsOk returns a tuple with the Reactions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReactions

`func (o *ObjsMessage) SetReactions(v []ObjsReaction)`

SetReactions sets Reactions field to given value.

### HasReactions

`func (o *ObjsMessage) HasReactions() bool`

HasReactions returns a boolean if a field has been set.

### GetReplyCount

`func (o *ObjsMessage) GetReplyCount() int32`

GetReplyCount returns the ReplyCount field if non-nil, zero value otherwise.

### GetReplyCountOk

`func (o *ObjsMessage) GetReplyCountOk() (*int32, bool)`

GetReplyCountOk returns a tuple with the ReplyCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReplyCount

`func (o *ObjsMessage) SetReplyCount(v int32)`

SetReplyCount sets ReplyCount field to given value.

### HasReplyCount

`func (o *ObjsMessage) HasReplyCount() bool`

HasReplyCount returns a boolean if a field has been set.

### GetReplyUsers

`func (o *ObjsMessage) GetReplyUsers() []string`

GetReplyUsers returns the ReplyUsers field if non-nil, zero value otherwise.

### GetReplyUsersOk

`func (o *ObjsMessage) GetReplyUsersOk() (*[]string, bool)`

GetReplyUsersOk returns a tuple with the ReplyUsers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReplyUsers

`func (o *ObjsMessage) SetReplyUsers(v []string)`

SetReplyUsers sets ReplyUsers field to given value.

### HasReplyUsers

`func (o *ObjsMessage) HasReplyUsers() bool`

HasReplyUsers returns a boolean if a field has been set.

### GetReplyUsersCount

`func (o *ObjsMessage) GetReplyUsersCount() int32`

GetReplyUsersCount returns the ReplyUsersCount field if non-nil, zero value otherwise.

### GetReplyUsersCountOk

`func (o *ObjsMessage) GetReplyUsersCountOk() (*int32, bool)`

GetReplyUsersCountOk returns a tuple with the ReplyUsersCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReplyUsersCount

`func (o *ObjsMessage) SetReplyUsersCount(v int32)`

SetReplyUsersCount sets ReplyUsersCount field to given value.

### HasReplyUsersCount

`func (o *ObjsMessage) HasReplyUsersCount() bool`

HasReplyUsersCount returns a boolean if a field has been set.

### GetSourceTeam

`func (o *ObjsMessage) GetSourceTeam() string`

GetSourceTeam returns the SourceTeam field if non-nil, zero value otherwise.

### GetSourceTeamOk

`func (o *ObjsMessage) GetSourceTeamOk() (*string, bool)`

GetSourceTeamOk returns a tuple with the SourceTeam field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSourceTeam

`func (o *ObjsMessage) SetSourceTeam(v string)`

SetSourceTeam sets SourceTeam field to given value.

### HasSourceTeam

`func (o *ObjsMessage) HasSourceTeam() bool`

HasSourceTeam returns a boolean if a field has been set.

### GetSubscribed

`func (o *ObjsMessage) GetSubscribed() bool`

GetSubscribed returns the Subscribed field if non-nil, zero value otherwise.

### GetSubscribedOk

`func (o *ObjsMessage) GetSubscribedOk() (*bool, bool)`

GetSubscribedOk returns a tuple with the Subscribed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubscribed

`func (o *ObjsMessage) SetSubscribed(v bool)`

SetSubscribed sets Subscribed field to given value.

### HasSubscribed

`func (o *ObjsMessage) HasSubscribed() bool`

HasSubscribed returns a boolean if a field has been set.

### GetSubtype

`func (o *ObjsMessage) GetSubtype() string`

GetSubtype returns the Subtype field if non-nil, zero value otherwise.

### GetSubtypeOk

`func (o *ObjsMessage) GetSubtypeOk() (*string, bool)`

GetSubtypeOk returns a tuple with the Subtype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubtype

`func (o *ObjsMessage) SetSubtype(v string)`

SetSubtype sets Subtype field to given value.

### HasSubtype

`func (o *ObjsMessage) HasSubtype() bool`

HasSubtype returns a boolean if a field has been set.

### GetTeam

`func (o *ObjsMessage) GetTeam() string`

GetTeam returns the Team field if non-nil, zero value otherwise.

### GetTeamOk

`func (o *ObjsMessage) GetTeamOk() (*string, bool)`

GetTeamOk returns a tuple with the Team field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTeam

`func (o *ObjsMessage) SetTeam(v string)`

SetTeam sets Team field to given value.

### HasTeam

`func (o *ObjsMessage) HasTeam() bool`

HasTeam returns a boolean if a field has been set.

### GetText

`func (o *ObjsMessage) GetText() string`

GetText returns the Text field if non-nil, zero value otherwise.

### GetTextOk

`func (o *ObjsMessage) GetTextOk() (*string, bool)`

GetTextOk returns a tuple with the Text field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetText

`func (o *ObjsMessage) SetText(v string)`

SetText sets Text field to given value.


### GetThreadTs

`func (o *ObjsMessage) GetThreadTs() string`

GetThreadTs returns the ThreadTs field if non-nil, zero value otherwise.

### GetThreadTsOk

`func (o *ObjsMessage) GetThreadTsOk() (*string, bool)`

GetThreadTsOk returns a tuple with the ThreadTs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetThreadTs

`func (o *ObjsMessage) SetThreadTs(v string)`

SetThreadTs sets ThreadTs field to given value.

### HasThreadTs

`func (o *ObjsMessage) HasThreadTs() bool`

HasThreadTs returns a boolean if a field has been set.

### GetTopic

`func (o *ObjsMessage) GetTopic() string`

GetTopic returns the Topic field if non-nil, zero value otherwise.

### GetTopicOk

`func (o *ObjsMessage) GetTopicOk() (*string, bool)`

GetTopicOk returns a tuple with the Topic field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTopic

`func (o *ObjsMessage) SetTopic(v string)`

SetTopic sets Topic field to given value.

### HasTopic

`func (o *ObjsMessage) HasTopic() bool`

HasTopic returns a boolean if a field has been set.

### GetTs

`func (o *ObjsMessage) GetTs() string`

GetTs returns the Ts field if non-nil, zero value otherwise.

### GetTsOk

`func (o *ObjsMessage) GetTsOk() (*string, bool)`

GetTsOk returns a tuple with the Ts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTs

`func (o *ObjsMessage) SetTs(v string)`

SetTs sets Ts field to given value.


### GetType

`func (o *ObjsMessage) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *ObjsMessage) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *ObjsMessage) SetType(v string)`

SetType sets Type field to given value.


### GetUnreadCount

`func (o *ObjsMessage) GetUnreadCount() int32`

GetUnreadCount returns the UnreadCount field if non-nil, zero value otherwise.

### GetUnreadCountOk

`func (o *ObjsMessage) GetUnreadCountOk() (*int32, bool)`

GetUnreadCountOk returns a tuple with the UnreadCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUnreadCount

`func (o *ObjsMessage) SetUnreadCount(v int32)`

SetUnreadCount sets UnreadCount field to given value.

### HasUnreadCount

`func (o *ObjsMessage) HasUnreadCount() bool`

HasUnreadCount returns a boolean if a field has been set.

### GetUpload

`func (o *ObjsMessage) GetUpload() bool`

GetUpload returns the Upload field if non-nil, zero value otherwise.

### GetUploadOk

`func (o *ObjsMessage) GetUploadOk() (*bool, bool)`

GetUploadOk returns a tuple with the Upload field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpload

`func (o *ObjsMessage) SetUpload(v bool)`

SetUpload sets Upload field to given value.

### HasUpload

`func (o *ObjsMessage) HasUpload() bool`

HasUpload returns a boolean if a field has been set.

### GetUser

`func (o *ObjsMessage) GetUser() string`

GetUser returns the User field if non-nil, zero value otherwise.

### GetUserOk

`func (o *ObjsMessage) GetUserOk() (*string, bool)`

GetUserOk returns a tuple with the User field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUser

`func (o *ObjsMessage) SetUser(v string)`

SetUser sets User field to given value.

### HasUser

`func (o *ObjsMessage) HasUser() bool`

HasUser returns a boolean if a field has been set.

### GetUserProfile

`func (o *ObjsMessage) GetUserProfile() ObjsUserProfileShort`

GetUserProfile returns the UserProfile field if non-nil, zero value otherwise.

### GetUserProfileOk

`func (o *ObjsMessage) GetUserProfileOk() (*ObjsUserProfileShort, bool)`

GetUserProfileOk returns a tuple with the UserProfile field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserProfile

`func (o *ObjsMessage) SetUserProfile(v ObjsUserProfileShort)`

SetUserProfile sets UserProfile field to given value.

### HasUserProfile

`func (o *ObjsMessage) HasUserProfile() bool`

HasUserProfile returns a boolean if a field has been set.

### GetUserTeam

`func (o *ObjsMessage) GetUserTeam() string`

GetUserTeam returns the UserTeam field if non-nil, zero value otherwise.

### GetUserTeamOk

`func (o *ObjsMessage) GetUserTeamOk() (*string, bool)`

GetUserTeamOk returns a tuple with the UserTeam field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserTeam

`func (o *ObjsMessage) SetUserTeam(v string)`

SetUserTeam sets UserTeam field to given value.

### HasUserTeam

`func (o *ObjsMessage) HasUserTeam() bool`

HasUserTeam returns a boolean if a field has been set.

### GetUsername

`func (o *ObjsMessage) GetUsername() string`

GetUsername returns the Username field if non-nil, zero value otherwise.

### GetUsernameOk

`func (o *ObjsMessage) GetUsernameOk() (*string, bool)`

GetUsernameOk returns a tuple with the Username field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsername

`func (o *ObjsMessage) SetUsername(v string)`

SetUsername sets Username field to given value.

### HasUsername

`func (o *ObjsMessage) HasUsername() bool`

HasUsername returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


