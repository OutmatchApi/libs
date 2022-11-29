# svix::EndpointIn

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **uid** | **String** | Optional unique identifier for the endpoint | [optional] |
| **url** | **String** |  |  |
| **version** | **Integer** |  |  |
| **description** | **String** |  | [optional][default to &#39;&#39;] |
| **filter_types** | **Array&lt;String&gt;** |  | [optional] |
| **channels** | **Array&lt;String&gt;** | List of message channels this endpoint listens to (omit for all) | [optional] |
| **disabled** | **Boolean** |  | [optional][default to false] |
| **rate_limit** | **Integer** |  | [optional] |
| **metadata** | **Hash&lt;String, String&gt;** |  | [optional] |
| **secret** | **String** | The endpoint&#39;s verification secret. If &#x60;null&#x60; is passed, a secret is automatically generated. Format: &#x60;base64&#x60; encoded random bytes optionally prefixed with &#x60;whsec_&#x60;. Recommended size: 24. | [optional] |

## Example

```ruby
require 'svix'

instance = svix::EndpointIn.new(
  uid: unique-endpoint-identifier,
  url: https://example.com/webhook/,
  version: 1,
  description: An example endpoint name,
  filter_types: [&quot;user.signup&quot;,&quot;user.deleted&quot;],
  channels: [&quot;project_123&quot;,&quot;group_2&quot;],
  disabled: false,
  rate_limit: 1000,
  metadata: null,
  secret: whsec_C2FVsBQIhrscChlQIMV+b5sSYspob7oD
)
```

