# OpenAPI\Client\OauthV2Api

All URIs are relative to https://slack.com/api, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**oauthV2Access()**](OauthV2Api.md#oauthV2Access) | **GET** /oauth.v2.access |  |


## `oauthV2Access()`

```php
oauthV2Access($code, $client_id, $client_secret, $redirect_uri): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Exchanges a temporary OAuth verifier code for an access token.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\OauthV2Api(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$code = 'code_example'; // string | The `code` param returned via the OAuth callback.
$client_id = 'client_id_example'; // string | Issued when you created your application.
$client_secret = 'client_secret_example'; // string | Issued when you created your application.
$redirect_uri = 'redirect_uri_example'; // string | This must match the originally submitted URI (if one was sent).

try {
    $result = $apiInstance->oauthV2Access($code, $client_id, $client_secret, $redirect_uri);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OauthV2Api->oauthV2Access: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **code** | **string**| The &#x60;code&#x60; param returned via the OAuth callback. | |
| **client_id** | **string**| Issued when you created your application. | [optional] |
| **client_secret** | **string**| Issued when you created your application. | [optional] |
| **redirect_uri** | **string**| This must match the originally submitted URI (if one was sent). | [optional] |

### Return type

[**\OpenAPI\Client\Model\DefaultSuccessTemplate**](../Model/DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
