# video-api::TokenCreatePayload

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ttl** | **Integer** | Time in seconds that the token will be active. A value of 0 means that the token has no exipration date. The default is to have no expiration. | [optional][default to 0] |

## Example

```ruby
require 'video-api'

instance = video-api::TokenCreatePayload.new(
  ttl: null
)
```

