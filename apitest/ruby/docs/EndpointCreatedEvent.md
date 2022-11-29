# apitest::EndpointCreatedEvent

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **type** | **String** |  | [optional][default to &#39;endpoint.created&#39;] |
| **data** | [**EndpointCreatedEventData**](EndpointCreatedEventData.md) |  |  |

## Example

```ruby
require 'apitest'

instance = apitest::EndpointCreatedEvent.new(
  type: null,
  data: null
)
```

