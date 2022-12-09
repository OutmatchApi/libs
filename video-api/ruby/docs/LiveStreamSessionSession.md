# video-api::LiveStreamSessionSession

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ended_at** | **Time** | When the session ended, with the date and time presented in ISO-8601 format. | [optional] |
| **loaded_at** | **Time** | When the session started, with the date and time presented in ISO-8601 format. | [optional] |
| **session_id** | **String** | A unique identifier for your session. You can use this to track what happens during a specific session. | [optional] |

## Example

```ruby
require 'video-api'

instance = video-api::LiveStreamSessionSession.new(
  ended_at: 2019-06-24T12:45:01.109Z,
  loaded_at: 2019-06-24T11:45:01.109Z,
  session_id: null
)
```

