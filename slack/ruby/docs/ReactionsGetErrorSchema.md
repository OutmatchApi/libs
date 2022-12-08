# slack::ReactionsGetErrorSchema

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **callstack** | **String** | Note: PHP callstack is only visible in dev/qa | [optional] |
| **error** | **String** |  |  |
| **ok** | [**DefsOkFalse**](DefsOkFalse.md) |  |  |

## Example

```ruby
require 'slack'

instance = slack::ReactionsGetErrorSchema.new(
  callstack: null,
  error: null,
  ok: null
)
```

