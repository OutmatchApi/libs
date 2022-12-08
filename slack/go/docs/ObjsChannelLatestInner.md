# ObjsChannelLatestInner

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

### NewObjsChannelLatestInner

`func NewObjsChannelLatestInner(text string, ts string, type_ string, ) *ObjsChannelLatestInner`

NewObjsChannelLatestInner instantiates a new ObjsChannelLatestInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewObjsChannelLatestInnerWithDefaults

`func NewObjsChannelLatestInnerWithDefaults() *ObjsChannelLatestInner`

NewObjsChannelLatestInnerWithDefaults instantiates a new ObjsChannelLatestInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAttachments

`func (o *ObjsChannelLatestInner) GetAttachments() []ObjsMessageAttachmentsInner`

GetAttachments returns the Attachments field if non-nil, zero value otherwise.

### GetAttachmentsOk

`func (o *ObjsChannelLatestInner) GetAttachmentsOk() (*[]ObjsMessageAttachmentsInner, bool)`

GetAttachmentsOk returns a tuple with the Attachments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttachments

`func (o *ObjsChannelLatestInner) SetAttachments(v []ObjsMessageAttachmentsInner)`

SetAttachments sets Attachments field to given value.

### HasAttachments

`func (o *ObjsChannelLatestInner) HasAttachments() bool`

HasAttachments returns a boolean if a field has been set.

### GetBlocks

`func (o *ObjsChannelLatestInner) GetBlocks() []BlocksInner`

GetBlocks returns the Blocks field if non-nil, zero value otherwise.

### GetBlocksOk

`func (o *ObjsChannelLatestInner) GetBlocksOk() (*[]BlocksInner, bool)`

GetBlocksOk returns a tuple with the Blocks field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBlocks

`func (o *ObjsChannelLatestInner) SetBlocks(v []BlocksInner)`

SetBlocks sets Blocks field to given value.

### HasBlocks

`func (o *ObjsChannelLatestInner) HasBlocks() bool`

HasBlocks returns a boolean if a field has been set.

### GetBotId

`func (o *ObjsChannelLatestInner) GetBotId() []ObjsMessageBotIdInner`

GetBotId returns the BotId field if non-nil, zero value otherwise.

### GetBotIdOk

`func (o *ObjsChannelLatestInner) GetBotIdOk() (*[]ObjsMessageBotIdInner, bool)`

GetBotIdOk returns a tuple with the BotId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBotId

`func (o *ObjsChannelLatestInner) SetBotId(v []ObjsMessageBotIdInner)`

SetBotId sets BotId field to given value.

### HasBotId

`func (o *ObjsChannelLatestInner) HasBotId() bool`

HasBotId returns a boolean if a field has been set.

### GetBotProfile

`func (o *ObjsChannelLatestInner) GetBotProfile() ObjsBotProfile`

GetBotProfile returns the BotProfile field if non-nil, zero value otherwise.

### GetBotProfileOk

`func (o *ObjsChannelLatestInner) GetBotProfileOk() (*ObjsBotProfile, bool)`

GetBotProfileOk returns a tuple with the BotProfile field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBotProfile

`func (o *ObjsChannelLatestInner) SetBotProfile(v ObjsBotProfile)`

SetBotProfile sets BotProfile field to given value.

### HasBotProfile

`func (o *ObjsChannelLatestInner) HasBotProfile() bool`

HasBotProfile returns a boolean if a field has been set.

### GetClientMsgId

`func (o *ObjsChannelLatestInner) GetClientMsgId() string`

GetClientMsgId returns the ClientMsgId field if non-nil, zero value otherwise.

### GetClientMsgIdOk

`func (o *ObjsChannelLatestInner) GetClientMsgIdOk() (*string, bool)`

GetClientMsgIdOk returns a tuple with the ClientMsgId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClientMsgId

`func (o *ObjsChannelLatestInner) SetClientMsgId(v string)`

SetClientMsgId sets ClientMsgId field to given value.

### HasClientMsgId

`func (o *ObjsChannelLatestInner) HasClientMsgId() bool`

HasClientMsgId returns a boolean if a field has been set.

### GetComment

`func (o *ObjsChannelLatestInner) GetComment() ObjsComment`

GetComment returns the Comment field if non-nil, zero value otherwise.

### GetCommentOk

`func (o *ObjsChannelLatestInner) GetCommentOk() (*ObjsComment, bool)`

GetCommentOk returns a tuple with the Comment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComment

`func (o *ObjsChannelLatestInner) SetComment(v ObjsComment)`

SetComment sets Comment field to given value.

### HasComment

`func (o *ObjsChannelLatestInner) HasComment() bool`

HasComment returns a boolean if a field has been set.

### GetDisplayAsBot

`func (o *ObjsChannelLatestInner) GetDisplayAsBot() bool`

GetDisplayAsBot returns the DisplayAsBot field if non-nil, zero value otherwise.

### GetDisplayAsBotOk

`func (o *ObjsChannelLatestInner) GetDisplayAsBotOk() (*bool, bool)`

GetDisplayAsBotOk returns a tuple with the DisplayAsBot field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplayAsBot

`func (o *ObjsChannelLatestInner) SetDisplayAsBot(v bool)`

SetDisplayAsBot sets DisplayAsBot field to given value.

### HasDisplayAsBot

`func (o *ObjsChannelLatestInner) HasDisplayAsBot() bool`

HasDisplayAsBot returns a boolean if a field has been set.

### GetFile

`func (o *ObjsChannelLatestInner) GetFile() ObjsFile`

GetFile returns the File field if non-nil, zero value otherwise.

### GetFileOk

`func (o *ObjsChannelLatestInner) GetFileOk() (*ObjsFile, bool)`

GetFileOk returns a tuple with the File field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFile

`func (o *ObjsChannelLatestInner) SetFile(v ObjsFile)`

SetFile sets File field to given value.

### HasFile

`func (o *ObjsChannelLatestInner) HasFile() bool`

HasFile returns a boolean if a field has been set.

### GetFiles

`func (o *ObjsChannelLatestInner) GetFiles() []ObjsFile`

GetFiles returns the Files field if non-nil, zero value otherwise.

### GetFilesOk

`func (o *ObjsChannelLatestInner) GetFilesOk() (*[]ObjsFile, bool)`

GetFilesOk returns a tuple with the Files field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFiles

`func (o *ObjsChannelLatestInner) SetFiles(v []ObjsFile)`

SetFiles sets Files field to given value.

### HasFiles

`func (o *ObjsChannelLatestInner) HasFiles() bool`

HasFiles returns a boolean if a field has been set.

### GetIcons

`func (o *ObjsChannelLatestInner) GetIcons() ObjsMessageIcons`

GetIcons returns the Icons field if non-nil, zero value otherwise.

### GetIconsOk

`func (o *ObjsChannelLatestInner) GetIconsOk() (*ObjsMessageIcons, bool)`

GetIconsOk returns a tuple with the Icons field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIcons

`func (o *ObjsChannelLatestInner) SetIcons(v ObjsMessageIcons)`

SetIcons sets Icons field to given value.

### HasIcons

`func (o *ObjsChannelLatestInner) HasIcons() bool`

HasIcons returns a boolean if a field has been set.

### GetInviter

`func (o *ObjsChannelLatestInner) GetInviter() string`

GetInviter returns the Inviter field if non-nil, zero value otherwise.

### GetInviterOk

`func (o *ObjsChannelLatestInner) GetInviterOk() (*string, bool)`

GetInviterOk returns a tuple with the Inviter field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInviter

`func (o *ObjsChannelLatestInner) SetInviter(v string)`

SetInviter sets Inviter field to given value.

### HasInviter

`func (o *ObjsChannelLatestInner) HasInviter() bool`

HasInviter returns a boolean if a field has been set.

### GetIsDelayedMessage

`func (o *ObjsChannelLatestInner) GetIsDelayedMessage() bool`

GetIsDelayedMessage returns the IsDelayedMessage field if non-nil, zero value otherwise.

### GetIsDelayedMessageOk

`func (o *ObjsChannelLatestInner) GetIsDelayedMessageOk() (*bool, bool)`

GetIsDelayedMessageOk returns a tuple with the IsDelayedMessage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsDelayedMessage

`func (o *ObjsChannelLatestInner) SetIsDelayedMessage(v bool)`

SetIsDelayedMessage sets IsDelayedMessage field to given value.

### HasIsDelayedMessage

`func (o *ObjsChannelLatestInner) HasIsDelayedMessage() bool`

HasIsDelayedMessage returns a boolean if a field has been set.

### GetIsIntro

`func (o *ObjsChannelLatestInner) GetIsIntro() bool`

GetIsIntro returns the IsIntro field if non-nil, zero value otherwise.

### GetIsIntroOk

`func (o *ObjsChannelLatestInner) GetIsIntroOk() (*bool, bool)`

GetIsIntroOk returns a tuple with the IsIntro field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsIntro

`func (o *ObjsChannelLatestInner) SetIsIntro(v bool)`

SetIsIntro sets IsIntro field to given value.

### HasIsIntro

`func (o *ObjsChannelLatestInner) HasIsIntro() bool`

HasIsIntro returns a boolean if a field has been set.

### GetIsStarred

`func (o *ObjsChannelLatestInner) GetIsStarred() bool`

GetIsStarred returns the IsStarred field if non-nil, zero value otherwise.

### GetIsStarredOk

`func (o *ObjsChannelLatestInner) GetIsStarredOk() (*bool, bool)`

GetIsStarredOk returns a tuple with the IsStarred field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsStarred

`func (o *ObjsChannelLatestInner) SetIsStarred(v bool)`

SetIsStarred sets IsStarred field to given value.

### HasIsStarred

`func (o *ObjsChannelLatestInner) HasIsStarred() bool`

HasIsStarred returns a boolean if a field has been set.

### GetLastRead

`func (o *ObjsChannelLatestInner) GetLastRead() string`

GetLastRead returns the LastRead field if non-nil, zero value otherwise.

### GetLastReadOk

`func (o *ObjsChannelLatestInner) GetLastReadOk() (*string, bool)`

GetLastReadOk returns a tuple with the LastRead field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastRead

`func (o *ObjsChannelLatestInner) SetLastRead(v string)`

SetLastRead sets LastRead field to given value.

### HasLastRead

`func (o *ObjsChannelLatestInner) HasLastRead() bool`

HasLastRead returns a boolean if a field has been set.

### GetLatestReply

`func (o *ObjsChannelLatestInner) GetLatestReply() string`

GetLatestReply returns the LatestReply field if non-nil, zero value otherwise.

### GetLatestReplyOk

`func (o *ObjsChannelLatestInner) GetLatestReplyOk() (*string, bool)`

GetLatestReplyOk returns a tuple with the LatestReply field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLatestReply

`func (o *ObjsChannelLatestInner) SetLatestReply(v string)`

SetLatestReply sets LatestReply field to given value.

### HasLatestReply

`func (o *ObjsChannelLatestInner) HasLatestReply() bool`

HasLatestReply returns a boolean if a field has been set.

### GetName

`func (o *ObjsChannelLatestInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ObjsChannelLatestInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ObjsChannelLatestInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ObjsChannelLatestInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetOldName

`func (o *ObjsChannelLatestInner) GetOldName() string`

GetOldName returns the OldName field if non-nil, zero value otherwise.

### GetOldNameOk

`func (o *ObjsChannelLatestInner) GetOldNameOk() (*string, bool)`

GetOldNameOk returns a tuple with the OldName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOldName

`func (o *ObjsChannelLatestInner) SetOldName(v string)`

SetOldName sets OldName field to given value.

### HasOldName

`func (o *ObjsChannelLatestInner) HasOldName() bool`

HasOldName returns a boolean if a field has been set.

### GetParentUserId

`func (o *ObjsChannelLatestInner) GetParentUserId() string`

GetParentUserId returns the ParentUserId field if non-nil, zero value otherwise.

### GetParentUserIdOk

`func (o *ObjsChannelLatestInner) GetParentUserIdOk() (*string, bool)`

GetParentUserIdOk returns a tuple with the ParentUserId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParentUserId

`func (o *ObjsChannelLatestInner) SetParentUserId(v string)`

SetParentUserId sets ParentUserId field to given value.

### HasParentUserId

`func (o *ObjsChannelLatestInner) HasParentUserId() bool`

HasParentUserId returns a boolean if a field has been set.

### GetPermalink

`func (o *ObjsChannelLatestInner) GetPermalink() string`

GetPermalink returns the Permalink field if non-nil, zero value otherwise.

### GetPermalinkOk

`func (o *ObjsChannelLatestInner) GetPermalinkOk() (*string, bool)`

GetPermalinkOk returns a tuple with the Permalink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPermalink

`func (o *ObjsChannelLatestInner) SetPermalink(v string)`

SetPermalink sets Permalink field to given value.

### HasPermalink

`func (o *ObjsChannelLatestInner) HasPermalink() bool`

HasPermalink returns a boolean if a field has been set.

### GetPinnedTo

`func (o *ObjsChannelLatestInner) GetPinnedTo() []string`

GetPinnedTo returns the PinnedTo field if non-nil, zero value otherwise.

### GetPinnedToOk

`func (o *ObjsChannelLatestInner) GetPinnedToOk() (*[]string, bool)`

GetPinnedToOk returns a tuple with the PinnedTo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPinnedTo

`func (o *ObjsChannelLatestInner) SetPinnedTo(v []string)`

SetPinnedTo sets PinnedTo field to given value.

### HasPinnedTo

`func (o *ObjsChannelLatestInner) HasPinnedTo() bool`

HasPinnedTo returns a boolean if a field has been set.

### GetPurpose

`func (o *ObjsChannelLatestInner) GetPurpose() string`

GetPurpose returns the Purpose field if non-nil, zero value otherwise.

### GetPurposeOk

`func (o *ObjsChannelLatestInner) GetPurposeOk() (*string, bool)`

GetPurposeOk returns a tuple with the Purpose field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPurpose

`func (o *ObjsChannelLatestInner) SetPurpose(v string)`

SetPurpose sets Purpose field to given value.

### HasPurpose

`func (o *ObjsChannelLatestInner) HasPurpose() bool`

HasPurpose returns a boolean if a field has been set.

### GetReactions

`func (o *ObjsChannelLatestInner) GetReactions() []ObjsReaction`

GetReactions returns the Reactions field if non-nil, zero value otherwise.

### GetReactionsOk

`func (o *ObjsChannelLatestInner) GetReactionsOk() (*[]ObjsReaction, bool)`

GetReactionsOk returns a tuple with the Reactions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReactions

`func (o *ObjsChannelLatestInner) SetReactions(v []ObjsReaction)`

SetReactions sets Reactions field to given value.

### HasReactions

`func (o *ObjsChannelLatestInner) HasReactions() bool`

HasReactions returns a boolean if a field has been set.

### GetReplyCount

`func (o *ObjsChannelLatestInner) GetReplyCount() int32`

GetReplyCount returns the ReplyCount field if non-nil, zero value otherwise.

### GetReplyCountOk

`func (o *ObjsChannelLatestInner) GetReplyCountOk() (*int32, bool)`

GetReplyCountOk returns a tuple with the ReplyCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReplyCount

`func (o *ObjsChannelLatestInner) SetReplyCount(v int32)`

SetReplyCount sets ReplyCount field to given value.

### HasReplyCount

`func (o *ObjsChannelLatestInner) HasReplyCount() bool`

HasReplyCount returns a boolean if a field has been set.

### GetReplyUsers

`func (o *ObjsChannelLatestInner) GetReplyUsers() []string`

GetReplyUsers returns the ReplyUsers field if non-nil, zero value otherwise.

### GetReplyUsersOk

`func (o *ObjsChannelLatestInner) GetReplyUsersOk() (*[]string, bool)`

GetReplyUsersOk returns a tuple with the ReplyUsers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReplyUsers

`func (o *ObjsChannelLatestInner) SetReplyUsers(v []string)`

SetReplyUsers sets ReplyUsers field to given value.

### HasReplyUsers

`func (o *ObjsChannelLatestInner) HasReplyUsers() bool`

HasReplyUsers returns a boolean if a field has been set.

### GetReplyUsersCount

`func (o *ObjsChannelLatestInner) GetReplyUsersCount() int32`

GetReplyUsersCount returns the ReplyUsersCount field if non-nil, zero value otherwise.

### GetReplyUsersCountOk

`func (o *ObjsChannelLatestInner) GetReplyUsersCountOk() (*int32, bool)`

GetReplyUsersCountOk returns a tuple with the ReplyUsersCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReplyUsersCount

`func (o *ObjsChannelLatestInner) SetReplyUsersCount(v int32)`

SetReplyUsersCount sets ReplyUsersCount field to given value.

### HasReplyUsersCount

`func (o *ObjsChannelLatestInner) HasReplyUsersCount() bool`

HasReplyUsersCount returns a boolean if a field has been set.

### GetSourceTeam

`func (o *ObjsChannelLatestInner) GetSourceTeam() string`

GetSourceTeam returns the SourceTeam field if non-nil, zero value otherwise.

### GetSourceTeamOk

`func (o *ObjsChannelLatestInner) GetSourceTeamOk() (*string, bool)`

GetSourceTeamOk returns a tuple with the SourceTeam field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSourceTeam

`func (o *ObjsChannelLatestInner) SetSourceTeam(v string)`

SetSourceTeam sets SourceTeam field to given value.

### HasSourceTeam

`func (o *ObjsChannelLatestInner) HasSourceTeam() bool`

HasSourceTeam returns a boolean if a field has been set.

### GetSubscribed

`func (o *ObjsChannelLatestInner) GetSubscribed() bool`

GetSubscribed returns the Subscribed field if non-nil, zero value otherwise.

### GetSubscribedOk

`func (o *ObjsChannelLatestInner) GetSubscribedOk() (*bool, bool)`

GetSubscribedOk returns a tuple with the Subscribed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubscribed

`func (o *ObjsChannelLatestInner) SetSubscribed(v bool)`

SetSubscribed sets Subscribed field to given value.

### HasSubscribed

`func (o *ObjsChannelLatestInner) HasSubscribed() bool`

HasSubscribed returns a boolean if a field has been set.

### GetSubtype

`func (o *ObjsChannelLatestInner) GetSubtype() string`

GetSubtype returns the Subtype field if non-nil, zero value otherwise.

### GetSubtypeOk

`func (o *ObjsChannelLatestInner) GetSubtypeOk() (*string, bool)`

GetSubtypeOk returns a tuple with the Subtype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubtype

`func (o *ObjsChannelLatestInner) SetSubtype(v string)`

SetSubtype sets Subtype field to given value.

### HasSubtype

`func (o *ObjsChannelLatestInner) HasSubtype() bool`

HasSubtype returns a boolean if a field has been set.

### GetTeam

`func (o *ObjsChannelLatestInner) GetTeam() string`

GetTeam returns the Team field if non-nil, zero value otherwise.

### GetTeamOk

`func (o *ObjsChannelLatestInner) GetTeamOk() (*string, bool)`

GetTeamOk returns a tuple with the Team field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTeam

`func (o *ObjsChannelLatestInner) SetTeam(v string)`

SetTeam sets Team field to given value.

### HasTeam

`func (o *ObjsChannelLatestInner) HasTeam() bool`

HasTeam returns a boolean if a field has been set.

### GetText

`func (o *ObjsChannelLatestInner) GetText() string`

GetText returns the Text field if non-nil, zero value otherwise.

### GetTextOk

`func (o *ObjsChannelLatestInner) GetTextOk() (*string, bool)`

GetTextOk returns a tuple with the Text field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetText

`func (o *ObjsChannelLatestInner) SetText(v string)`

SetText sets Text field to given value.


### GetThreadTs

`func (o *ObjsChannelLatestInner) GetThreadTs() string`

GetThreadTs returns the ThreadTs field if non-nil, zero value otherwise.

### GetThreadTsOk

`func (o *ObjsChannelLatestInner) GetThreadTsOk() (*string, bool)`

GetThreadTsOk returns a tuple with the ThreadTs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetThreadTs

`func (o *ObjsChannelLatestInner) SetThreadTs(v string)`

SetThreadTs sets ThreadTs field to given value.

### HasThreadTs

`func (o *ObjsChannelLatestInner) HasThreadTs() bool`

HasThreadTs returns a boolean if a field has been set.

### GetTopic

`func (o *ObjsChannelLatestInner) GetTopic() string`

GetTopic returns the Topic field if non-nil, zero value otherwise.

### GetTopicOk

`func (o *ObjsChannelLatestInner) GetTopicOk() (*string, bool)`

GetTopicOk returns a tuple with the Topic field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTopic

`func (o *ObjsChannelLatestInner) SetTopic(v string)`

SetTopic sets Topic field to given value.

### HasTopic

`func (o *ObjsChannelLatestInner) HasTopic() bool`

HasTopic returns a boolean if a field has been set.

### GetTs

`func (o *ObjsChannelLatestInner) GetTs() string`

GetTs returns the Ts field if non-nil, zero value otherwise.

### GetTsOk

`func (o *ObjsChannelLatestInner) GetTsOk() (*string, bool)`

GetTsOk returns a tuple with the Ts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTs

`func (o *ObjsChannelLatestInner) SetTs(v string)`

SetTs sets Ts field to given value.


### GetType

`func (o *ObjsChannelLatestInner) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *ObjsChannelLatestInner) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *ObjsChannelLatestInner) SetType(v string)`

SetType sets Type field to given value.


### GetUnreadCount

`func (o *ObjsChannelLatestInner) GetUnreadCount() int32`

GetUnreadCount returns the UnreadCount field if non-nil, zero value otherwise.

### GetUnreadCountOk

`func (o *ObjsChannelLatestInner) GetUnreadCountOk() (*int32, bool)`

GetUnreadCountOk returns a tuple with the UnreadCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUnreadCount

`func (o *ObjsChannelLatestInner) SetUnreadCount(v int32)`

SetUnreadCount sets UnreadCount field to given value.

### HasUnreadCount

`func (o *ObjsChannelLatestInner) HasUnreadCount() bool`

HasUnreadCount returns a boolean if a field has been set.

### GetUpload

`func (o *ObjsChannelLatestInner) GetUpload() bool`

GetUpload returns the Upload field if non-nil, zero value otherwise.

### GetUploadOk

`func (o *ObjsChannelLatestInner) GetUploadOk() (*bool, bool)`

GetUploadOk returns a tuple with the Upload field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpload

`func (o *ObjsChannelLatestInner) SetUpload(v bool)`

SetUpload sets Upload field to given value.

### HasUpload

`func (o *ObjsChannelLatestInner) HasUpload() bool`

HasUpload returns a boolean if a field has been set.

### GetUser

`func (o *ObjsChannelLatestInner) GetUser() string`

GetUser returns the User field if non-nil, zero value otherwise.

### GetUserOk

`func (o *ObjsChannelLatestInner) GetUserOk() (*string, bool)`

GetUserOk returns a tuple with the User field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUser

`func (o *ObjsChannelLatestInner) SetUser(v string)`

SetUser sets User field to given value.

### HasUser

`func (o *ObjsChannelLatestInner) HasUser() bool`

HasUser returns a boolean if a field has been set.

### GetUserProfile

`func (o *ObjsChannelLatestInner) GetUserProfile() ObjsUserProfileShort`

GetUserProfile returns the UserProfile field if non-nil, zero value otherwise.

### GetUserProfileOk

`func (o *ObjsChannelLatestInner) GetUserProfileOk() (*ObjsUserProfileShort, bool)`

GetUserProfileOk returns a tuple with the UserProfile field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserProfile

`func (o *ObjsChannelLatestInner) SetUserProfile(v ObjsUserProfileShort)`

SetUserProfile sets UserProfile field to given value.

### HasUserProfile

`func (o *ObjsChannelLatestInner) HasUserProfile() bool`

HasUserProfile returns a boolean if a field has been set.

### GetUserTeam

`func (o *ObjsChannelLatestInner) GetUserTeam() string`

GetUserTeam returns the UserTeam field if non-nil, zero value otherwise.

### GetUserTeamOk

`func (o *ObjsChannelLatestInner) GetUserTeamOk() (*string, bool)`

GetUserTeamOk returns a tuple with the UserTeam field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserTeam

`func (o *ObjsChannelLatestInner) SetUserTeam(v string)`

SetUserTeam sets UserTeam field to given value.

### HasUserTeam

`func (o *ObjsChannelLatestInner) HasUserTeam() bool`

HasUserTeam returns a boolean if a field has been set.

### GetUsername

`func (o *ObjsChannelLatestInner) GetUsername() string`

GetUsername returns the Username field if non-nil, zero value otherwise.

### GetUsernameOk

`func (o *ObjsChannelLatestInner) GetUsernameOk() (*string, bool)`

GetUsernameOk returns a tuple with the Username field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsername

`func (o *ObjsChannelLatestInner) SetUsername(v string)`

SetUsername sets Username field to given value.

### HasUsername

`func (o *ObjsChannelLatestInner) HasUsername() bool`

HasUsername returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


