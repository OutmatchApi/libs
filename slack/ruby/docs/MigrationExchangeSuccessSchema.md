# slack::MigrationExchangeSuccessSchema

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **enterprise_id** | **String** |  |  |
| **invalid_user_ids** | **Array&lt;String&gt;** |  | [optional] |
| **ok** | [**DefsOkTrue**](DefsOkTrue.md) |  |  |
| **team_id** | **String** |  |  |
| **user_id_map** | **Hash&lt;String, Object&gt;** |  | [optional] |

## Example

```ruby
require 'slack'

instance = slack::MigrationExchangeSuccessSchema.new(
  enterprise_id: null,
  invalid_user_ids: null,
  ok: null,
  team_id: null,
  user_id_map: null
)
```

