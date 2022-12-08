# OpenAPI\Client\AppsPermissionsApi

All URIs are relative to https://slack.com/api, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**appsPermissionsInfo()**](AppsPermissionsApi.md#appsPermissionsInfo) | **GET** /apps.permissions.info |  |
| [**appsPermissionsRequest()**](AppsPermissionsApi.md#appsPermissionsRequest) | **GET** /apps.permissions.request |  |


## `appsPermissionsInfo()`

```php
appsPermissionsInfo($token): \OpenAPI\Client\Model\AppsPermissionsInfoSchema
```



Returns list of permissions this app has on a team.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AppsPermissionsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `none`

try {
    $result = $apiInstance->appsPermissionsInfo($token);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AppsPermissionsApi->appsPermissionsInfo: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;none&#x60; | [optional] |

### Return type

[**\OpenAPI\Client\Model\AppsPermissionsInfoSchema**](../Model/AppsPermissionsInfoSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `appsPermissionsRequest()`

```php
appsPermissionsRequest($token, $scopes, $trigger_id): \OpenAPI\Client\Model\AppsPermissionsRequestSchema
```



Allows an app to request additional scopes

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AppsPermissionsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `none`
$scopes = 'scopes_example'; // string | A comma separated list of scopes to request for
$trigger_id = 'trigger_id_example'; // string | Token used to trigger the permissions API

try {
    $result = $apiInstance->appsPermissionsRequest($token, $scopes, $trigger_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AppsPermissionsApi->appsPermissionsRequest: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;none&#x60; | |
| **scopes** | **string**| A comma separated list of scopes to request for | |
| **trigger_id** | **string**| Token used to trigger the permissions API | |

### Return type

[**\OpenAPI\Client\Model\AppsPermissionsRequestSchema**](../Model/AppsPermissionsRequestSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
