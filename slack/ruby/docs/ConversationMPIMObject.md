# slack::ConversationMPIMObject

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **accepted_user** | **String** |  | [optional] |
| **connected_team_ids** | **Array&lt;String&gt;** |  | [optional] |
| **conversation_host_id** | **String** |  | [optional] |
| **created** | **Integer** |  |  |
| **creator** | **String** |  |  |
| **display_counts** | [**ConversationObjectDisplayCounts**](ConversationObjectDisplayCounts.md) |  | [optional] |
| **id** | **String** |  |  |
| **internal_team_ids** | **Array&lt;String&gt;** |  | [optional] |
| **is_archived** | **Boolean** |  |  |
| **is_channel** | **Boolean** |  |  |
| **is_ext_shared** | **Boolean** |  | [optional] |
| **is_frozen** | **Boolean** |  | [optional] |
| **is_general** | **Boolean** |  |  |
| **is_group** | **Boolean** |  |  |
| **is_im** | **Boolean** |  |  |
| **is_member** | **Boolean** |  | [optional] |
| **is_moved** | **Integer** |  | [optional] |
| **is_mpim** | **Boolean** |  |  |
| **is_non_threadable** | **Boolean** |  | [optional] |
| **is_open** | **Boolean** |  | [optional] |
| **is_org_shared** | **Boolean** |  |  |
| **is_pending_ext_shared** | **Boolean** |  | [optional] |
| **is_private** | **Boolean** |  |  |
| **is_read_only** | **Boolean** |  | [optional] |
| **is_shared** | **Boolean** |  |  |
| **is_starred** | **Boolean** |  | [optional] |
| **is_thread_only** | **Boolean** |  | [optional] |
| **last_read** | **String** |  | [optional] |
| **latest** | [**Array&lt;ObjsChannelLatestInner&gt;**](ObjsChannelLatestInner.md) |  | [optional] |
| **members** | **Array&lt;String&gt;** |  | [optional] |
| **name** | **String** |  |  |
| **name_normalized** | **String** |  |  |
| **num_members** | **Integer** |  | [optional] |
| **parent_conversation** | [**Array&lt;ConversationObjectParentConversationInner&gt;**](ConversationObjectParentConversationInner.md) |  | [optional] |
| **pending_connected_team_ids** | **Array&lt;String&gt;** |  | [optional] |
| **pending_shared** | **Array&lt;String&gt;** |  | [optional] |
| **pin_count** | **Integer** |  | [optional] |
| **previous_names** | **Array&lt;String&gt;** |  | [optional] |
| **priority** | **Float** |  | [optional] |
| **purpose** | [**ObjsChannelPurpose**](ObjsChannelPurpose.md) |  |  |
| **shared_team_ids** | **Array&lt;String&gt;** |  | [optional] |
| **shares** | [**Array&lt;ConversationObjectSharesInner&gt;**](ConversationObjectSharesInner.md) |  | [optional] |
| **timezone_count** | **Integer** |  | [optional] |
| **topic** | [**ObjsChannelPurpose**](ObjsChannelPurpose.md) |  |  |
| **unlinked** | **Integer** |  | [optional] |
| **unread_count** | **Integer** |  | [optional] |
| **unread_count_display** | **Integer** |  | [optional] |
| **user** | **String** |  | [optional] |
| **version** | **Integer** |  | [optional] |

## Example

```ruby
require 'slack'

instance = slack::ConversationMPIMObject.new(
  accepted_user: null,
  connected_team_ids: null,
  conversation_host_id: null,
  created: null,
  creator: null,
  display_counts: null,
  id: null,
  internal_team_ids: null,
  is_archived: null,
  is_channel: null,
  is_ext_shared: null,
  is_frozen: null,
  is_general: null,
  is_group: null,
  is_im: null,
  is_member: null,
  is_moved: null,
  is_mpim: null,
  is_non_threadable: null,
  is_open: null,
  is_org_shared: null,
  is_pending_ext_shared: null,
  is_private: null,
  is_read_only: null,
  is_shared: null,
  is_starred: null,
  is_thread_only: null,
  last_read: null,
  latest: null,
  members: null,
  name: null,
  name_normalized: null,
  num_members: null,
  parent_conversation: null,
  pending_connected_team_ids: null,
  pending_shared: null,
  pin_count: null,
  previous_names: null,
  priority: null,
  purpose: null,
  shared_team_ids: null,
  shares: null,
  timezone_count: null,
  topic: null,
  unlinked: null,
  unread_count: null,
  unread_count_display: null,
  user: null,
  version: null
)
```

