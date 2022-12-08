# OpenAPI\Client\OauthApi

All URIs are relative to https://slack.com/api, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**oauthAccess()**](OauthApi.md#oauthAccess) | **GET** /oauth.access |  |
| [**oauthToken()**](OauthApi.md#oauthToken) | **GET** /oauth.token |  |
| [**oauthV2Access()**](OauthApi.md#oauthV2Access) | **GET** /oauth.v2.access |  |


## `oauthAccess()`

```php
oauthAccess($client_id, $client_secret, $code, $redirect_uri, $single_channel): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Exchanges a temporary OAuth verifier code for an access token.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\OauthApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$client_id = 'client_id_example'; // string | Issued when you created your application.
$client_secret = 'client_secret_example'; // string | Issued when you created your application.
$code = 'code_example'; // string | The `code` param returned via the OAuth callback.
$redirect_uri = 'redirect_uri_example'; // string | This must match the originally submitted URI (if one was sent).
$single_channel = True; // bool | Request the user to add your app only to a single channel. Only valid with a [legacy workspace app](https://api.slack.com/legacy-workspace-apps).

try {
    $result = $apiInstance->oauthAccess($client_id, $client_secret, $code, $redirect_uri, $single_channel);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OauthApi->oauthAccess: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **client_id** | **string**| Issued when you created your application. | [optional] |
| **client_secret** | **string**| Issued when you created your application. | [optional] |
| **code** | **string**| The &#x60;code&#x60; param returned via the OAuth callback. | [optional] |
| **redirect_uri** | **string**| This must match the originally submitted URI (if one was sent). | [optional] |
| **single_channel** | **bool**| Request the user to add your app only to a single channel. Only valid with a [legacy workspace app](https://api.slack.com/legacy-workspace-apps). | [optional] |

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

## `oauthToken()`

```php
oauthToken($client_id, $client_secret, $code, $redirect_uri, $single_channel): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Exchanges a temporary OAuth verifier code for a workspace token.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\OauthApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$client_id = 'client_id_example'; // string | Issued when you created your application.
$client_secret = 'client_secret_example'; // string | Issued when you created your application.
$code = 'code_example'; // string | The `code` param returned via the OAuth callback.
$redirect_uri = 'redirect_uri_example'; // string | This must match the originally submitted URI (if one was sent).
$single_channel = True; // bool | Request the user to add your app only to a single channel.

try {
    $result = $apiInstance->oauthToken($client_id, $client_secret, $code, $redirect_uri, $single_channel);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OauthApi->oauthToken: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **client_id** | **string**| Issued when you created your application. | [optional] |
| **client_secret** | **string**| Issued when you created your application. | [optional] |
| **code** | **string**| The &#x60;code&#x60; param returned via the OAuth callback. | [optional] |
| **redirect_uri** | **string**| This must match the originally submitted URI (if one was sent). | [optional] |
| **single_channel** | **bool**| Request the user to add your app only to a single channel. | [optional] |

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


$apiInstance = new OpenAPI\Client\Api\OauthApi(
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
    echo 'Exception when calling OauthApi->oauthV2Access: ', $e->getMessage(), PHP_EOL;
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
