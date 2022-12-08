# slack::ChatPostMessageSuccessSchema

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **channel** | **String** |  |  |
| **message** | [**ObjsMessage**](ObjsMessage.md) |  |  |
| **ok** | [**DefsOkTrue**](DefsOkTrue.md) |  |  |
| **ts** | **String** |  |  |

## Example

```ruby
require 'slack'

instance = slack::ChatPostMessageSuccessSchema.new(
  channel: null,
  message: null,
  ok: null,
  ts: null
)
```

