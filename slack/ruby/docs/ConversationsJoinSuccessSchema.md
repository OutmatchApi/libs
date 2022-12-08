# slack::ConversationsJoinSuccessSchema

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **channel** | [**Array&lt;ObjsConversationInner&gt;**](ObjsConversationInner.md) |  |  |
| **ok** | [**DefsOkTrue**](DefsOkTrue.md) |  |  |
| **response_metadata** | [**ResponseMetadata**](ResponseMetadata.md) |  | [optional] |
| **warning** | **String** |  | [optional] |

## Example

```ruby
require 'slack'

instance = slack::ConversationsJoinSuccessSchema.new(
  channel: null,
  ok: null,
  response_metadata: null,
  warning: null
)
```

