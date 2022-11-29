# apitest::EndpointDeletedEventData

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_id** | **String** |  |  |
| **app_uid** | **String** | Optional unique identifier for the application | [optional] |
| **endpoint_id** | **String** |  |  |
| **endpoint_uid** | **String** | Optional unique identifier for the endpoint | [optional] |

## Example

```ruby
require 'apitest'

instance = apitest::EndpointDeletedEventData.new(
  app_id: app_1srOrx2ZWZBpBUvZwXKQmoEYga2,
  app_uid: unique-app-identifier,
  endpoint_id: ep_1srOrx2ZWZBpBUvZwXKQmoEYga2,
  endpoint_uid: unique-endpoint-identifier
)
```

