# slack::ConversationsCloseSuccessSchema

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **already_closed** | **Boolean** |  | [optional] |
| **no_op** | **Boolean** |  | [optional] |
| **ok** | [**DefsOkTrue**](DefsOkTrue.md) |  |  |

## Example

```ruby
require 'slack'

instance = slack::ConversationsCloseSuccessSchema.new(
  already_closed: null,
  no_op: null,
  ok: null
)
```

