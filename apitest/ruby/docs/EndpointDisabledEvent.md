# apitest::EndpointDisabledEvent

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **type** | **String** |  | [optional][default to &#39;endpoint.disabled&#39;] |
| **data** | [**EndpointDisabledEventData**](EndpointDisabledEventData.md) |  |  |

## Example

```ruby
require 'apitest'

instance = apitest::EndpointDisabledEvent.new(
  type: null,
  data: null
)
```

