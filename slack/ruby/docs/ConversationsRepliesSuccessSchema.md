# slack::ConversationsRepliesSuccessSchema

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **has_more** | **Boolean** |  | [optional] |
| **messages** | **Array&lt;Array&lt;ConversationsRepliesSuccessSchemaMessagesInnerInner&gt;&gt;** |  |  |
| **ok** | [**DefsOkTrue**](DefsOkTrue.md) |  |  |

## Example

```ruby
require 'slack'

instance = slack::ConversationsRepliesSuccessSchema.new(
  has_more: null,
  messages: null,
  ok: null
)
```

