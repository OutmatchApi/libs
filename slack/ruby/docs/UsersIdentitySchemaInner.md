# slack::UsersIdentitySchemaInner

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ok** | [**DefsOkTrue**](DefsOkTrue.md) |  |  |
| **team** | [**UsersIdentitySchemaInnerAnyOf3Team**](UsersIdentitySchemaInnerAnyOf3Team.md) |  |  |
| **user** | [**RtmConnectSchemaSelf**](RtmConnectSchemaSelf.md) |  |  |

## Example

```ruby
require 'slack'

instance = slack::UsersIdentitySchemaInner.new(
  ok: null,
  team: null,
  user: null
)
```

