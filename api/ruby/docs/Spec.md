# api::Spec

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** |  |  |
| **spec_type** | **String** |  |  |
| **link** | **String** |  |  |
| **title** | **String** |  |  |
| **description** | **String** |  |  |
| **version** | **String** |  |  |
| **logo** | [**Logo**](Logo.md) |  |  |

## Example

```ruby
require 'api'

instance = api::Spec.new(
  id: 0000-0000-0000-0000,
  spec_type: openapi 3.0.3,
  link: https://linktoschema.com,
  title: my api,
  description: my api description,
  version: 1.0.0,
  logo: null
)
```

