# svix::EndpointHeadersIn

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **headers** | **Hash&lt;String, String&gt;** |  |  |

## Example

```ruby
require 'svix'

instance = svix::EndpointHeadersIn.new(
  headers: {&quot;X-Foobar&quot;:&quot;Bar&quot;,&quot;X-Example&quot;:&quot;123&quot;}
)
```

