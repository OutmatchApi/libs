# apitest::MessageAttemptFailingEvent

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **type** | **String** |  | [optional][default to &#39;message.attempt.failing&#39;] |
| **data** | [**MessageAttemptFailingEventData**](MessageAttemptFailingEventData.md) |  |  |

## Example

```ruby
require 'apitest'

instance = apitest::MessageAttemptFailingEvent.new(
  type: null,
  data: null
)
```

