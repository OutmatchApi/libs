
# ConversationObject

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created** | **kotlin.Int** |  | 
**creator** | **kotlin.String** |  | 
**id** | **kotlin.String** |  | 
**isArchived** | **kotlin.Boolean** |  | 
**isChannel** | **kotlin.Boolean** |  | 
**isGeneral** | **kotlin.Boolean** |  | 
**isGroup** | **kotlin.Boolean** |  | 
**isIm** | **kotlin.Boolean** |  | 
**isMpim** | [**inline**](#IsMpim) |  | 
**isOrgShared** | **kotlin.Boolean** |  | 
**isPrivate** | **kotlin.Boolean** |  | 
**isShared** | **kotlin.Boolean** |  | 
**name** | **kotlin.String** |  | 
**nameNormalized** | **kotlin.String** |  | 
**purpose** | [**ObjsChannelPurpose**](ObjsChannelPurpose.md) |  | 
**topic** | [**ObjsChannelPurpose**](ObjsChannelPurpose.md) |  | 
**acceptedUser** | **kotlin.String** |  |  [optional]
**connectedTeamIds** | **kotlin.collections.Set&lt;kotlin.String&gt;** |  |  [optional]
**conversationHostId** | **kotlin.String** |  |  [optional]
**displayCounts** | [**ConversationObjectDisplayCounts**](ConversationObjectDisplayCounts.md) |  |  [optional]
**enterpriseId** | **kotlin.String** |  |  [optional]
**hasPins** | **kotlin.Boolean** |  |  [optional]
**internalTeamIds** | **kotlin.collections.Set&lt;kotlin.String&gt;** |  |  [optional]
**isExtShared** | **kotlin.Boolean** |  |  [optional]
**isFrozen** | **kotlin.Boolean** |  |  [optional]
**isGlobalShared** | **kotlin.Boolean** |  |  [optional]
**isMember** | **kotlin.Boolean** |  |  [optional]
**isMoved** | **kotlin.Int** |  |  [optional]
**isNonThreadable** | **kotlin.Boolean** |  |  [optional]
**isOpen** | **kotlin.Boolean** |  |  [optional]
**isOrgDefault** | **kotlin.Boolean** |  |  [optional]
**isOrgMandatory** | **kotlin.Boolean** |  |  [optional]
**isPendingExtShared** | **kotlin.Boolean** |  |  [optional]
**isReadOnly** | **kotlin.Boolean** |  |  [optional]
**isStarred** | **kotlin.Boolean** |  |  [optional]
**isThreadOnly** | **kotlin.Boolean** |  |  [optional]
**lastRead** | **kotlin.String** |  |  [optional]
**latest** | [**kotlin.collections.List&lt;ObjsChannelLatestInner&gt;**](ObjsChannelLatestInner.md) |  |  [optional]
**members** | **kotlin.collections.Set&lt;kotlin.String&gt;** |  |  [optional]
**numMembers** | **kotlin.Int** |  |  [optional]
**parentConversation** | [**kotlin.collections.List&lt;ConversationObjectParentConversationInner&gt;**](ConversationObjectParentConversationInner.md) |  |  [optional]
**pendingConnectedTeamIds** | **kotlin.collections.Set&lt;kotlin.String&gt;** |  |  [optional]
**pendingShared** | **kotlin.collections.Set&lt;kotlin.String&gt;** |  |  [optional]
**pinCount** | **kotlin.Int** |  |  [optional]
**previousNames** | **kotlin.collections.Set&lt;kotlin.String&gt;** |  |  [optional]
**priority** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]
**sharedTeamIds** | **kotlin.collections.Set&lt;kotlin.String&gt;** |  |  [optional]
**shares** | [**kotlin.collections.Set&lt;ConversationObjectSharesInner&gt;**](ConversationObjectSharesInner.md) |  |  [optional]
**timezoneCount** | **kotlin.Int** |  |  [optional]
**unlinked** | **kotlin.Int** |  |  [optional]
**unreadCount** | **kotlin.Int** |  |  [optional]
**unreadCountDisplay** | **kotlin.Int** |  |  [optional]
**useCase** | **kotlin.String** |  |  [optional]
**user** | **kotlin.String** |  |  [optional]
**version** | **kotlin.Int** |  |  [optional]


<a name="IsMpim"></a>
## Enum: is_mpim
Name | Value
---- | -----
isMpim | false



