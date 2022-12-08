# slack::ChatUpdateSuccessSchema

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **channel** | **String** |  |  |
| **message** | [**MessageObject**](MessageObject.md) |  |  |
| **ok** | [**DefsOkTrue**](DefsOkTrue.md) |  |  |
| **text** | **String** |  |  |
| **ts** | **String** |  |  |

## Example

```ruby
require 'slack'

instance = slack::ChatUpdateSuccessSchema.new(
  channel: null,
  message: null,
  ok: null,
  text: null,
  ts: null
)
```

