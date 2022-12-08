# slack::AdminConversationsGetConversationPrefsSchemaPrefs

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **can_thread** | [**AdminConversationsGetConversationPrefsSchemaPrefsCanThread**](AdminConversationsGetConversationPrefsSchemaPrefsCanThread.md) |  | [optional] |
| **who_can_post** | [**AdminConversationsGetConversationPrefsSchemaPrefsCanThread**](AdminConversationsGetConversationPrefsSchemaPrefsCanThread.md) |  | [optional] |

## Example

```ruby
require 'slack'

instance = slack::AdminConversationsGetConversationPrefsSchemaPrefs.new(
  can_thread: null,
  who_can_post: null
)
```

