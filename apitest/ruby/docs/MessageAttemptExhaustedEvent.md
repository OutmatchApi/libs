# apitest::MessageAttemptExhaustedEvent

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **type** | **String** |  | [optional][default to &#39;message.attempt.exhausted&#39;] |
| **data** | [**MessageAttemptExhaustedEventData**](MessageAttemptExhaustedEventData.md) |  |  |

## Example

```ruby
require 'apitest'

instance = apitest::MessageAttemptExhaustedEvent.new(
  type: null,
  data: null
)
```

