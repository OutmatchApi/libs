# slack::AdminConversationsSearchSchema

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **channels** | [**Array&lt;ObjsChannel&gt;**](ObjsChannel.md) |  |  |
| **next_cursor** | **String** |  |  |

## Example

```ruby
require 'slack'

instance = slack::AdminConversationsSearchSchema.new(
  channels: null,
  next_cursor: null
)
```

