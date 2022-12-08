# slack::ConversationsInviteErrorSchema1

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **callstack** | **String** | Note: PHP callstack is only visible in dev/qa | [optional] |
| **error** | **String** |  | [optional] |
| **errors** | [**Array&lt;ErrorsIsReturnedWhenAnErrorAssociatesAnUserInner&gt;**](ErrorsIsReturnedWhenAnErrorAssociatesAnUserInner.md) |  | [optional] |
| **needed** | **String** |  | [optional] |
| **ok** | [**DefsOkFalse**](DefsOkFalse.md) |  |  |
| **provided** | **String** |  | [optional] |

## Example

```ruby
require 'slack'

instance = slack::ConversationsInviteErrorSchema1.new(
  callstack: null,
  error: null,
  errors: null,
  needed: null,
  ok: null,
  provided: null
)
```

