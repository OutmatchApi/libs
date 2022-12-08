# slack::UsersSetPhotoErrorSchema

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **callstack** | **String** | Note: PHP callstack is only visible in dev/qa | [optional] |
| **debug_step** | **String** | possibly DEV/QA only | [optional] |
| **dims** | **String** | possibly DEV/QA only | [optional] |
| **error** | **String** |  |  |
| **ok** | [**DefsOkFalse**](DefsOkFalse.md) |  |  |
| **time_ident** | **Integer** | possibly DEV/QA only | [optional] |

## Example

```ruby
require 'slack'

instance = slack::UsersSetPhotoErrorSchema.new(
  callstack: null,
  debug_step: null,
  dims: null,
  error: null,
  ok: null,
  time_ident: null
)
```

