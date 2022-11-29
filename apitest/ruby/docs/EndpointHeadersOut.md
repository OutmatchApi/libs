# apitest::EndpointHeadersOut

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **headers** | **Hash&lt;String, String&gt;** |  |  |
| **sensitive** | **Array&lt;String&gt;** |  |  |

## Example

```ruby
require 'apitest'

instance = apitest::EndpointHeadersOut.new(
  headers: {&quot;X-Foobar&quot;:&quot;Bar&quot;,&quot;X-Example&quot;:&quot;123&quot;},
  sensitive: [&quot;Authorization&quot;]
)
```

