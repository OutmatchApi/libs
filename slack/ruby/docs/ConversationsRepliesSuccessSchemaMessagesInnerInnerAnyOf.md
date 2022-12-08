# slack::ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **last_read** | **String** |  | [optional] |
| **latest_reply** | **String** |  | [optional] |
| **reply_count** | **Integer** |  |  |
| **reply_users** | **Array&lt;String&gt;** |  | [optional] |
| **reply_users_count** | **Integer** |  | [optional] |
| **source_team** | **String** |  | [optional] |
| **subscribed** | **Boolean** |  |  |
| **team** | **String** |  | [optional] |
| **text** | **String** |  |  |
| **thread_ts** | **String** |  |  |
| **ts** | **String** |  |  |
| **type** | **String** |  |  |
| **unread_count** | **Integer** |  | [optional] |
| **user** | **String** |  |  |
| **user_profile** | [**ObjsUserProfileShort**](ObjsUserProfileShort.md) |  | [optional] |
| **user_team** | **String** |  | [optional] |

## Example

```ruby
require 'slack'

instance = slack::ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf.new(
  last_read: null,
  latest_reply: null,
  reply_count: null,
  reply_users: null,
  reply_users_count: null,
  source_team: null,
  subscribed: null,
  team: null,
  text: null,
  thread_ts: null,
  ts: null,
  type: null,
  unread_count: null,
  user: null,
  user_profile: null,
  user_team: null
)
```

