# slack::ConversationIMChannelObjectFromConversationsMethods

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **created** | **Integer** |  |  |
| **has_pins** | **Boolean** |  | [optional] |
| **id** | **String** |  |  |
| **is_archived** | **Boolean** |  | [optional] |
| **is_ext_shared** | **Boolean** |  | [optional] |
| **is_frozen** | **Boolean** |  | [optional] |
| **is_im** | **Boolean** |  |  |
| **is_open** | **Boolean** |  | [optional] |
| **is_org_shared** | **Boolean** |  |  |
| **is_shared** | **Boolean** |  | [optional] |
| **is_starred** | **Boolean** |  | [optional] |
| **is_user_deleted** | **Boolean** |  | [optional] |
| **last_read** | **String** |  | [optional] |
| **latest** | [**Array&lt;ObjsChannelLatestInner&gt;**](ObjsChannelLatestInner.md) |  | [optional] |
| **parent_conversation** | [**Array&lt;ConversationObjectParentConversationInner&gt;**](ConversationObjectParentConversationInner.md) |  | [optional] |
| **pin_count** | **Integer** |  | [optional] |
| **priority** | **Float** |  |  |
| **shares** | [**Array&lt;ConversationIMChannelObjectFromConversationsMethodsSharesInner&gt;**](ConversationIMChannelObjectFromConversationsMethodsSharesInner.md) |  | [optional] |
| **unread_count** | **Integer** |  | [optional] |
| **unread_count_display** | **Integer** |  | [optional] |
| **user** | **String** |  |  |
| **version** | **Integer** |  | [optional] |

## Example

```ruby
require 'slack'

instance = slack::ConversationIMChannelObjectFromConversationsMethods.new(
  created: null,
  has_pins: null,
  id: null,
  is_archived: null,
  is_ext_shared: null,
  is_frozen: null,
  is_im: null,
  is_open: null,
  is_org_shared: null,
  is_shared: null,
  is_starred: null,
  is_user_deleted: null,
  last_read: null,
  latest: null,
  parent_conversation: null,
  pin_count: null,
  priority: null,
  shares: null,
  unread_count: null,
  unread_count_display: null,
  user: null,
  version: null
)
```

