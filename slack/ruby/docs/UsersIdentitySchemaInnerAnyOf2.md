# slack::UsersIdentitySchemaInnerAnyOf2

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ok** | [**DefsOkTrue**](DefsOkTrue.md) |  |  |
| **team** | [**UsersIdentitySchemaInnerAnyOfTeam**](UsersIdentitySchemaInnerAnyOfTeam.md) |  |  |
| **user** | [**UsersIdentitySchemaInnerAnyOf2User**](UsersIdentitySchemaInnerAnyOf2User.md) |  |  |

## Example

```ruby
require 'slack'

instance = slack::UsersIdentitySchemaInnerAnyOf2.new(
  ok: null,
  team: null,
  user: null
)
```

