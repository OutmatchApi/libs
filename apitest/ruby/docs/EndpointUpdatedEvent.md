# apitest::EndpointUpdatedEvent

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **type** | **String** |  | [optional][default to &#39;endpoint.updated&#39;] |
| **data** | [**EndpointUpdatedEventData**](EndpointUpdatedEventData.md) |  |  |

## Example

```ruby
require 'apitest'

instance = apitest::EndpointUpdatedEvent.new(
  type: null,
  data: null
)
```

