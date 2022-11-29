# svix::MessageAttemptFailingEventData

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_id** | **String** |  |  |
| **app_uid** | **String** | Optional unique identifier for the application | [optional] |
| **msg_id** | **String** |  |  |
| **msg_event_id** | **String** | Optional unique identifier for the message | [optional] |
| **endpoint_id** | **String** |  |  |
| **last_attempt** | [**MessageAttemptFailedData**](MessageAttemptFailedData.md) |  |  |

## Example

```ruby
require 'svix'

instance = svix::MessageAttemptFailingEventData.new(
  app_id: app_1srOrx2ZWZBpBUvZwXKQmoEYga2,
  app_uid: unique-app-identifier,
  msg_id: msg_1srOrx2ZWZBpBUvZwXKQmoEYga2,
  msg_event_id: evt_pNZKtWg8Azow,
  endpoint_id: ep_1srOrx2ZWZBpBUvZwXKQmoEYga2,
  last_attempt: null
)
```

