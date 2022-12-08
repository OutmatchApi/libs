# slack::ChatScheduleMessageSuccessSchema

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **channel** | **String** |  |  |
| **message** | [**ChatScheduleMessageSuccessSchemaMessage**](ChatScheduleMessageSuccessSchemaMessage.md) |  |  |
| **ok** | [**DefsOkTrue**](DefsOkTrue.md) |  |  |
| **post_at** | **Integer** |  |  |
| **scheduled_message_id** | **String** |  |  |

## Example

```ruby
require 'slack'

instance = slack::ChatScheduleMessageSuccessSchema.new(
  channel: null,
  message: null,
  ok: null,
  post_at: null,
  scheduled_message_id: null
)
```

