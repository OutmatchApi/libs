# apitest::ListResponseMessageOut

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **data** | [**Array&lt;MessageOut&gt;**](MessageOut.md) |  |  |
| **iterator** | **String** |  | [optional] |
| **prev_iterator** | **String** |  | [optional] |
| **done** | **Boolean** |  |  |

## Example

```ruby
require 'apitest'

instance = apitest::ListResponseMessageOut.new(
  data: null,
  iterator: iterator,
  prev_iterator: -iterator,
  done: null
)
```

