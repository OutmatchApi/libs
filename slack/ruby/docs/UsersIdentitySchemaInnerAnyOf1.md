# slack::UsersIdentitySchemaInnerAnyOf1

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ok** | [**DefsOkTrue**](DefsOkTrue.md) |  |  |
| **team** | [**UsersIdentitySchemaInnerAnyOfTeam**](UsersIdentitySchemaInnerAnyOfTeam.md) |  |  |
| **user** | [**UsersIdentitySchemaInnerAnyOf1User**](UsersIdentitySchemaInnerAnyOf1User.md) |  |  |

## Example

```ruby
require 'slack'

instance = slack::UsersIdentitySchemaInnerAnyOf1.new(
  ok: null,
  team: null,
  user: null
)
```

