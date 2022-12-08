# slack::ConversationsHistorySuccessSchema

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **channel_actions_count** | **Integer** |  |  |
| **channel_actions_ts** | [**Array&lt;ConversationsHistorySuccessSchemaChannelActionsTsInner&gt;**](ConversationsHistorySuccessSchemaChannelActionsTsInner.md) |  |  |
| **has_more** | **Boolean** |  |  |
| **messages** | [**Array&lt;ObjsMessage&gt;**](ObjsMessage.md) |  |  |
| **ok** | [**DefsOkTrue**](DefsOkTrue.md) |  |  |
| **pin_count** | **Integer** |  |  |

## Example

```ruby
require 'slack'

instance = slack::ConversationsHistorySuccessSchema.new(
  channel_actions_count: null,
  channel_actions_ts: null,
  has_more: null,
  messages: null,
  ok: null,
  pin_count: null
)
```

