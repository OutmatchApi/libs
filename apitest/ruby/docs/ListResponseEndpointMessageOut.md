# apitest::ListResponseEndpointMessageOut

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **data** | [**Array&lt;EndpointMessageOut&gt;**](EndpointMessageOut.md) |  |  |
| **iterator** | **String** |  | [optional] |
| **prev_iterator** | **String** |  | [optional] |
| **done** | **Boolean** |  |  |

## Example

```ruby
require 'apitest'

instance = apitest::ListResponseEndpointMessageOut.new(
  data: null,
  iterator: iterator,
  prev_iterator: -iterator,
  done: null
)
```

