# apitest::MessageEndpointOut

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
| **id** | **String** |  |  |
| **created_at** | **Time** |  |  |
| **status** | [**MessageStatus**](MessageStatus.md) |  |  |
| **next_attempt** | **Time** |  | [optional] |

## Example

```ruby
require 'apitest'

instance = apitest::MessageEndpointOut.new(
  uid: unique-endpoint-identifier,
  url: https://example.com/webhook/,
  version: 1,
  description: An example endpoint name,
  filter_types: [&quot;user.signup&quot;,&quot;user.deleted&quot;],
  channels: [&quot;project_123&quot;,&quot;group_2&quot;],
  disabled: false,
  rate_limit: 1000,
  metadata: null,
  id: ep_1srOrx2ZWZBpBUvZwXKQmoEYga2,
  created_at: null,
  status: null,
  next_attempt: null
)
```

