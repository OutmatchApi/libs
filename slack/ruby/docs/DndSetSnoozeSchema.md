# slack::DndSetSnoozeSchema

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ok** | [**DefsOkTrue**](DefsOkTrue.md) |  |  |
| **snooze_enabled** | **Boolean** |  |  |
| **snooze_endtime** | **Integer** |  |  |
| **snooze_remaining** | **Integer** |  |  |

## Example

```ruby
require 'slack'

instance = slack::DndSetSnoozeSchema.new(
  ok: null,
  snooze_enabled: null,
  snooze_endtime: null,
  snooze_remaining: null
)
```

