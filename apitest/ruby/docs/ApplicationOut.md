# apitest::ApplicationOut

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **uid** | **String** | Optional unique identifier for the application | [optional] |
| **name** | **String** |  |  |
| **rate_limit** | **Integer** |  | [optional] |
| **metadata** | **Hash&lt;String, String&gt;** |  | [optional] |
| **id** | **String** |  |  |
| **created_at** | **Time** |  |  |
| **updated_at** | **Time** |  |  |

## Example

```ruby
require 'apitest'

instance = apitest::ApplicationOut.new(
  uid: unique-app-identifier,
  name: My first application,
  rate_limit: 1000,
  metadata: null,
  id: app_1srOrx2ZWZBpBUvZwXKQmoEYga2,
  created_at: null,
  updated_at: null
)
```

