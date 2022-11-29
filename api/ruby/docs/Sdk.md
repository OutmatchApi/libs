# api::Sdk

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** |  |  |
| **language** | [**Language**](Language.md) |  |  |
| **sdk_version** | **String** |  |  |
| **code_url** | **String** |  |  |
| **package_url** | **String** |  |  |
| **status** | [**Status**](Status.md) |  |  |
| **error** | **String** |  |  |

## Example

```ruby
require 'api'

instance = api::Sdk.new(
  id: 0000-0000-0000-0000,
  language: null,
  sdk_version: 1.0.0,
  code_url: https://linktocode.com,
  package_url: https://linktopackage.com,
  status: null,
  error: error description
)
```

