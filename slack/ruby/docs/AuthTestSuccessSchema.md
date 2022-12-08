# slack::AuthTestSuccessSchema

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **bot_id** | **String** |  | [optional] |
| **is_enterprise_install** | **Boolean** |  | [optional] |
| **ok** | [**DefsOkTrue**](DefsOkTrue.md) |  |  |
| **team** | **String** |  |  |
| **team_id** | **String** |  |  |
| **url** | **String** |  |  |
| **user** | **String** |  |  |
| **user_id** | **String** |  |  |

## Example

```ruby
require 'slack'

instance = slack::AuthTestSuccessSchema.new(
  bot_id: null,
  is_enterprise_install: null,
  ok: null,
  team: null,
  team_id: null,
  url: null,
  user: null,
  user_id: null
)
```

