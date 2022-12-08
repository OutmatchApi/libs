# slack::ConversationsRepliesErrorSchema

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **callstack** | **String** | Note: PHP callstack is only visible in dev/qa | [optional] |
| **error** | **String** |  |  |
| **needed** | **String** |  | [optional] |
| **ok** | [**DefsOkFalse**](DefsOkFalse.md) |  |  |
| **provided** | **String** |  | [optional] |

## Example

```ruby
require 'slack'

instance = slack::ConversationsRepliesErrorSchema.new(
  callstack: null,
  error: null,
  needed: null,
  ok: null,
  provided: null
)
```

