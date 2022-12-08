# slack::ConversationsListSuccessSchema

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **channels** | **Array&lt;Array&gt;** |  |  |
| **ok** | [**DefsOkTrue**](DefsOkTrue.md) |  |  |
| **response_metadata** | [**AdminConversationsGetTeamsSchemaResponseMetadata**](AdminConversationsGetTeamsSchemaResponseMetadata.md) |  | [optional] |

## Example

```ruby
require 'slack'

instance = slack::ConversationsListSuccessSchema.new(
  channels: null,
  ok: null,
  response_metadata: null
)
```

