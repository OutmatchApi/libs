# testing-api-video::UploadToken

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **created_at** | **Time** | When the token was created, displayed in ISO-8601 format. | [optional] |
| **expires_at** | **Time** | When the token expires, displayed in ISO-8601 format. | [optional] |
| **token** | **String** | The unique identifier for the token you will use to authenticate an upload. | [optional] |
| **ttl** | **Integer** | Time-to-live - how long the upload token is valid for. | [optional] |

## Example

```ruby
require 'testing-api-video'

instance = testing-api-video::UploadToken.new(
  created_at: 2019-12-16T08:25:51Z,
  expires_at: 2019-12-16T09:25:51Z,
  token: to1tcmSFHeYY5KzyhOqVKMKb,
  ttl: null
)
```

