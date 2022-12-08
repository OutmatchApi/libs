# slack::UsersProfileSetSchema

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **email_pending** | **String** |  | [optional] |
| **ok** | [**DefsOkTrue**](DefsOkTrue.md) |  |  |
| **profile** | [**ObjsUserProfile**](ObjsUserProfile.md) |  |  |
| **username** | **String** |  |  |

## Example

```ruby
require 'slack'

instance = slack::UsersProfileSetSchema.new(
  email_pending: null,
  ok: null,
  profile: null,
  username: null
)
```

