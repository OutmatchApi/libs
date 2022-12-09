# video-api::VideoSessionSession

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ended_at** | **Time** | When the video session ended, presented in ISO-8601 format. | [optional] |
| **loaded_at** | **Time** | When the video session started, presented in ISO-8601 format. | [optional] |
| **session_id** | **String** | The unique identifier for the session that you can use to track what happens during it. | [optional] |

## Example

```ruby
require 'video-api'

instance = video-api::VideoSessionSession.new(
  ended_at: 2019-06-24T12:45:01.109Z,
  loaded_at: 2019-06-24T11:45:01.109Z,
  session_id: psEmFwGQUAXR2lFHj5nDOpy
)
```

