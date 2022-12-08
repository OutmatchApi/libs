# slack::AdminConversationsGetTeamsSchema

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ok** | [**DefsOkTrue**](DefsOkTrue.md) |  |  |
| **response_metadata** | [**AdminConversationsGetTeamsSchemaResponseMetadata**](AdminConversationsGetTeamsSchemaResponseMetadata.md) |  | [optional] |
| **team_ids** | **Array&lt;String&gt;** |  |  |

## Example

```ruby
require 'slack'

instance = slack::AdminConversationsGetTeamsSchema.new(
  ok: null,
  response_metadata: null,
  team_ids: null
)
```

