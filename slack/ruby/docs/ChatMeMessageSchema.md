# slack::ChatMeMessageSchema

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **channel** | **String** |  | [optional] |
| **ok** | [**DefsOkTrue**](DefsOkTrue.md) |  |  |
| **ts** | **String** |  | [optional] |

## Example

```ruby
require 'slack'

instance = slack::ChatMeMessageSchema.new(
  channel: null,
  ok: null,
  ts: null
)
```

