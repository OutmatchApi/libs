# slack::DndEndSnoozeSchema

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **dnd_enabled** | **Boolean** |  |  |
| **next_dnd_end_ts** | **Integer** |  |  |
| **next_dnd_start_ts** | **Integer** |  |  |
| **ok** | [**DefsOkTrue**](DefsOkTrue.md) |  |  |
| **snooze_enabled** | **Boolean** |  |  |

## Example

```ruby
require 'slack'

instance = slack::DndEndSnoozeSchema.new(
  dnd_enabled: null,
  next_dnd_end_ts: null,
  next_dnd_start_ts: null,
  ok: null,
  snooze_enabled: null
)
```

