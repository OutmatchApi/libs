# OpenAPI\Client\TeamApi

All URIs are relative to https://slack.com/api, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**teamAccessLogs()**](TeamApi.md#teamAccessLogs) | **GET** /team.accessLogs |  |
| [**teamBillableInfo()**](TeamApi.md#teamBillableInfo) | **GET** /team.billableInfo |  |
| [**teamInfo()**](TeamApi.md#teamInfo) | **GET** /team.info |  |
| [**teamIntegrationLogs()**](TeamApi.md#teamIntegrationLogs) | **GET** /team.integrationLogs |  |
| [**teamProfileGet()**](TeamApi.md#teamProfileGet) | **GET** /team.profile.get |  |


## `teamAccessLogs()`

```php
teamAccessLogs($token, $before, $count, $page): \OpenAPI\Client\Model\TeamAccessLogsSchema
```



Gets the access logs for the current team.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\TeamApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin`
$before = 'before_example'; // string | End of time range of logs to include in results (inclusive).
$count = 'count_example'; // string
$page = 'page_example'; // string

try {
    $result = $apiInstance->teamAccessLogs($token, $before, $count, $page);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TeamApi->teamAccessLogs: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin&#x60; | |
| **before** | **string**| End of time range of logs to include in results (inclusive). | [optional] |
| **count** | **string**|  | [optional] |
| **page** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\TeamAccessLogsSchema**](../Model/TeamAccessLogsSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `teamBillableInfo()`

```php
teamBillableInfo($token, $user): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Gets billable users information for the current team.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\TeamApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin`
$user = 'user_example'; // string | A user to retrieve the billable information for. Defaults to all users.

try {
    $result = $apiInstance->teamBillableInfo($token, $user);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TeamApi->teamBillableInfo: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin&#x60; | |
| **user** | **string**| A user to retrieve the billable information for. Defaults to all users. | [optional] |

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

## `teamInfo()`

```php
teamInfo($token, $team): \OpenAPI\Client\Model\TeamInfoSchema
```



Gets information about the current team.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\TeamApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `team:read`
$team = 'team_example'; // string | Team to get info on, if omitted, will return information about the current team. Will only return team that the authenticated token is allowed to see through external shared channels

try {
    $result = $apiInstance->teamInfo($token, $team);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TeamApi->teamInfo: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;team:read&#x60; | |
| **team** | **string**| Team to get info on, if omitted, will return information about the current team. Will only return team that the authenticated token is allowed to see through external shared channels | [optional] |

### Return type

[**\OpenAPI\Client\Model\TeamInfoSchema**](../Model/TeamInfoSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `teamIntegrationLogs()`

```php
teamIntegrationLogs($token, $app_id, $change_type, $count, $page, $service_id, $user): \OpenAPI\Client\Model\TeamIntegrationLogsSchema
```



Gets the integration logs for the current team.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\TeamApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin`
$app_id = 'app_id_example'; // string | Filter logs to this Slack app. Defaults to all logs.
$change_type = 'change_type_example'; // string | Filter logs with this change type. Defaults to all logs.
$count = 'count_example'; // string
$page = 'page_example'; // string
$service_id = 'service_id_example'; // string | Filter logs to this service. Defaults to all logs.
$user = 'user_example'; // string | Filter logs generated by this userâ€™s actions. Defaults to all logs.

try {
    $result = $apiInstance->teamIntegrationLogs($token, $app_id, $change_type, $count, $page, $service_id, $user);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TeamApi->teamIntegrationLogs: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin&#x60; | |
| **app_id** | **string**| Filter logs to this Slack app. Defaults to all logs. | [optional] |
| **change_type** | **string**| Filter logs with this change type. Defaults to all logs. | [optional] |
| **count** | **string**|  | [optional] |
| **page** | **string**|  | [optional] |
| **service_id** | **string**| Filter logs to this service. Defaults to all logs. | [optional] |
| **user** | **string**| Filter logs generated by this userâ€™s actions. Defaults to all logs. | [optional] |

### Return type

[**\OpenAPI\Client\Model\TeamIntegrationLogsSchema**](../Model/TeamIntegrationLogsSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `teamProfileGet()`

```php
teamProfileGet($token, $visibility): \OpenAPI\Client\Model\TeamProfileGetSuccessSchema
```



Retrieve a team's profile.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\TeamApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `users.profile:read`
$visibility = 'visibility_example'; // string | Filter by visibility.

try {
    $result = $apiInstance->teamProfileGet($token, $visibility);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TeamApi->teamProfileGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;users.profile:read&#x60; | |
| **visibility** | **string**| Filter by visibility. | [optional] |

### Return type

[**\OpenAPI\Client\Model\TeamProfileGetSuccessSchema**](../Model/TeamProfileGetSuccessSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
