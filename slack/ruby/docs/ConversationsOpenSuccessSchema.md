# slack::ConversationsOpenSuccessSchema

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **already_open** | **Boolean** |  | [optional] |
| **channel** | [**Array&lt;ConversationsOpenSuccessSchemaChannelInner&gt;**](ConversationsOpenSuccessSchemaChannelInner.md) |  |  |
| **no_op** | **Boolean** |  | [optional] |
| **ok** | [**DefsOkTrue**](DefsOkTrue.md) |  |  |

## Example

```ruby
require 'slack'

instance = slack::ConversationsOpenSuccessSchema.new(
  already_open: null,
  channel: null,
  no_op: null,
  ok: null
)
```

