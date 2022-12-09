# video-api::PlayerAllOfAssets

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **link** | **String** | The path to the file containing your logo. | [optional] |
| **logo** | **String** | The name of the file containing the logo you want to use. | [optional] |

## Example

```ruby
require 'video-api'

instance = video-api::PlayerAllOfAssets.new(
  link: path/to/my/logo/mylogo.jpg,
  logo: mylogo.jpg
)
```

