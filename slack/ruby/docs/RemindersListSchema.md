# slack::RemindersListSchema

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ok** | [**DefsOkTrue**](DefsOkTrue.md) |  |  |
| **reminders** | [**Array&lt;ObjsReminder&gt;**](ObjsReminder.md) |  |  |

## Example

```ruby
require 'slack'

instance = slack::RemindersListSchema.new(
  ok: null,
  reminders: null
)
```

