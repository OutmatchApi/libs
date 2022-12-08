# slack::ChatScheduledMessagesListSchema

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ok** | [**DefsOkTrue**](DefsOkTrue.md) |  |  |
| **response_metadata** | [**AdminConversationsGetTeamsSchemaResponseMetadata**](AdminConversationsGetTeamsSchemaResponseMetadata.md) |  |  |
| **scheduled_messages** | [**Array&lt;ChatScheduledMessagesListSchemaScheduledMessagesInner&gt;**](ChatScheduledMessagesListSchemaScheduledMessagesInner.md) |  |  |

## Example

```ruby
require 'slack'

instance = slack::ChatScheduledMessagesListSchema.new(
  ok: null,
  response_metadata: null,
  scheduled_messages: null
)
```

