# svix::EndpointHeadersOut

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **headers** | **Hash&lt;String, String&gt;** |  |  |
| **sensitive** | **Array&lt;String&gt;** |  |  |

## Example

```ruby
require 'svix'

instance = svix::EndpointHeadersOut.new(
  headers: {&quot;X-Foobar&quot;:&quot;Bar&quot;,&quot;X-Example&quot;:&quot;123&quot;},
  sensitive: [&quot;Authorization&quot;]
)
```

