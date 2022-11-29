# apitest::EndpointSecretOut

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **key** | **String** | The endpoint&#39;s verification secret. If &#x60;null&#x60; is passed, a secret is automatically generated. Format: &#x60;base64&#x60; encoded random bytes optionally prefixed with &#x60;whsec_&#x60;. Recommended size: 24. |  |

## Example

```ruby
require 'apitest'

instance = apitest::EndpointSecretOut.new(
  key: whsec_C2FVsBQIhrscChlQIMV+b5sSYspob7oD
)
```

