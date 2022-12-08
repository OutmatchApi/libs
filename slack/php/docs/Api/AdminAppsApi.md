# OpenAPI\Client\AdminAppsApi

All URIs are relative to https://slack.com/api, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**adminAppsApprove()**](AdminAppsApi.md#adminAppsApprove) | **POST** /admin.apps.approve |  |
| [**adminAppsRestrict()**](AdminAppsApi.md#adminAppsRestrict) | **POST** /admin.apps.restrict |  |


## `adminAppsApprove()`

```php
adminAppsApprove($token, $app_id, $request_id, $team_id): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Approve an app for installation on a workspace.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminAppsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.apps:write`
$app_id = 'app_id_example'; // string | The id of the app to approve.
$request_id = 'request_id_example'; // string | The id of the request to approve.
$team_id = 'team_id_example'; // string

try {
    $result = $apiInstance->adminAppsApprove($token, $app_id, $request_id, $team_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminAppsApi->adminAppsApprove: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.apps:write&#x60; | |
| **app_id** | **string**| The id of the app to approve. | [optional] |
| **request_id** | **string**| The id of the request to approve. | [optional] |
| **team_id** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\DefaultSuccessTemplate**](../Model/DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `adminAppsRestrict()`

```php
adminAppsRestrict($token, $app_id, $request_id, $team_id): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Restrict an app for installation on a workspace.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminAppsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.apps:write`
$app_id = 'app_id_example'; // string | The id of the app to restrict.
$request_id = 'request_id_example'; // string | The id of the request to restrict.
$team_id = 'team_id_example'; // string

try {
    $result = $apiInstance->adminAppsRestrict($token, $app_id, $request_id, $team_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminAppsApi->adminAppsRestrict: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.apps:write&#x60; | |
| **app_id** | **string**| The id of the app to restrict. | [optional] |
| **request_id** | **string**| The id of the request to restrict. | [optional] |
| **team_id** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\DefaultSuccessTemplate**](../Model/DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
