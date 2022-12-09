# apivideo::VideoSessionOs

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **name** | **String** | The name of the operating system. | [optional] |
| **shortname** | **String** | The nickname for the operating system, often representing the version. | [optional] |
| **version** | **String** | The version of the operating system. | [optional] |

## Example

```ruby
require 'apivideo'

instance = apivideo::VideoSessionOs.new(
  name: Microsoft Windows,
  shortname: W10,
  version: Windows 10
)
```

