# testing-api-video::PlayerSessionEvent

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **at** | **Integer** |  | [optional] |
| **emitted_at** | **Time** | When an event occurred, presented in ISO-8601 format. | [optional] |
| **from** | **Integer** |  | [optional] |
| **to** | **Integer** |  | [optional] |
| **type** | **String** | Possible values are: ready, play, pause, resume, seek.backward, seek.forward, end | [optional] |

## Example

```ruby
require 'testing-api-video'

instance = testing-api-video::PlayerSessionEvent.new(
  at: null,
  emitted_at: 2019-06-24T11:45:01.109Z,
  from: null,
  to: null,
  type: play
)
```

