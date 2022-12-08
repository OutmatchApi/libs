# slack::UsersIdentitySchemaInnerAnyOf

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ok** | [**DefsOkTrue**](DefsOkTrue.md) |  |  |
| **team** | [**UsersIdentitySchemaInnerAnyOfTeam**](UsersIdentitySchemaInnerAnyOfTeam.md) |  |  |
| **user** | [**RtmConnectSchemaSelf**](RtmConnectSchemaSelf.md) |  |  |

## Example

```ruby
require 'slack'

instance = slack::UsersIdentitySchemaInnerAnyOf.new(
  ok: null,
  team: null,
  user: null
)
```

