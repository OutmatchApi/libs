# OpenAPI\Client\AppsPermissionsScopesApi

All URIs are relative to https://slack.com/api, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**appsPermissionsScopesList()**](AppsPermissionsScopesApi.md#appsPermissionsScopesList) | **GET** /apps.permissions.scopes.list |  |


## `appsPermissionsScopesList()`

```php
appsPermissionsScopesList($token): \OpenAPI\Client\Model\ApiPermissionsScopesListSuccessSchema
```



Returns list of scopes this app has on a team.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AppsPermissionsScopesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `none`

try {
    $result = $apiInstance->appsPermissionsScopesList($token);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AppsPermissionsScopesApi->appsPermissionsScopesList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;none&#x60; | |

### Return type

[**\OpenAPI\Client\Model\ApiPermissionsScopesListSuccessSchema**](../Model/ApiPermissionsScopesListSuccessSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
