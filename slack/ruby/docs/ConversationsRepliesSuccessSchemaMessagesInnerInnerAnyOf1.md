# slack::ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **is_starred** | **Boolean** |  | [optional] |
| **parent_user_id** | **String** |  |  |
| **source_team** | **String** |  | [optional] |
| **team** | **String** |  | [optional] |
| **text** | **String** |  |  |
| **thread_ts** | **String** |  |  |
| **ts** | **String** |  |  |
| **type** | **String** |  |  |
| **user** | **String** |  |  |
| **user_profile** | [**ObjsUserProfileShort**](ObjsUserProfileShort.md) |  | [optional] |
| **user_team** | **String** |  | [optional] |

## Example

```ruby
require 'slack'

instance = slack::ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1.new(
  is_starred: null,
  parent_user_id: null,
  source_team: null,
  team: null,
  text: null,
  thread_ts: null,
  ts: null,
  type: null,
  user: null,
  user_profile: null,
  user_team: null
)
```

