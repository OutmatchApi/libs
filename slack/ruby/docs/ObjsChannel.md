# slack::ObjsChannel

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **accepted_user** | **String** |  | [optional] |
| **created** | **Integer** |  |  |
| **creator** | **String** |  |  |
| **id** | **String** |  |  |
| **is_archived** | **Boolean** |  | [optional] |
| **is_channel** | **Boolean** |  |  |
| **is_frozen** | **Boolean** |  | [optional] |
| **is_general** | **Boolean** |  | [optional] |
| **is_member** | **Boolean** |  | [optional] |
| **is_moved** | **Integer** |  | [optional] |
| **is_mpim** | **Boolean** |  |  |
| **is_non_threadable** | **Boolean** |  | [optional] |
| **is_org_shared** | **Boolean** |  |  |
| **is_pending_ext_shared** | **Boolean** |  | [optional] |
| **is_private** | **Boolean** |  |  |
| **is_read_only** | **Boolean** |  | [optional] |
| **is_shared** | **Boolean** |  |  |
| **is_thread_only** | **Boolean** |  | [optional] |
| **last_read** | **String** |  | [optional] |
| **latest** | [**Array&lt;ObjsChannelLatestInner&gt;**](ObjsChannelLatestInner.md) |  | [optional] |
| **members** | **Array&lt;String&gt;** |  |  |
| **name** | **String** |  |  |
| **name_normalized** | **String** |  |  |
| **num_members** | **Integer** |  | [optional] |
| **pending_shared** | **Array&lt;String&gt;** |  | [optional] |
| **previous_names** | **Array&lt;String&gt;** |  | [optional] |
| **priority** | **Float** |  | [optional] |
| **purpose** | [**ObjsChannelPurpose**](ObjsChannelPurpose.md) |  |  |
| **topic** | [**ObjsChannelPurpose**](ObjsChannelPurpose.md) |  |  |
| **unlinked** | **Integer** |  | [optional] |
| **unread_count** | **Integer** |  | [optional] |
| **unread_count_display** | **Integer** |  | [optional] |

## Example

```ruby
require 'slack'

instance = slack::ObjsChannel.new(
  accepted_user: null,
  created: null,
  creator: null,
  id: null,
  is_archived: null,
  is_channel: null,
  is_frozen: null,
  is_general: null,
  is_member: null,
  is_moved: null,
  is_mpim: null,
  is_non_threadable: null,
  is_org_shared: null,
  is_pending_ext_shared: null,
  is_private: null,
  is_read_only: null,
  is_shared: null,
  is_thread_only: null,
  last_read: null,
  latest: null,
  members: null,
  name: null,
  name_normalized: null,
  num_members: null,
  pending_shared: null,
  previous_names: null,
  priority: null,
  purpose: null,
  topic: null,
  unlinked: null,
  unread_count: null,
  unread_count_display: null
)
```

