# OpenAPI\Client\AdminInviteRequestsApi

All URIs are relative to https://slack.com/api, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**adminInviteRequestsApprove()**](AdminInviteRequestsApi.md#adminInviteRequestsApprove) | **POST** /admin.inviteRequests.approve |  |
| [**adminInviteRequestsDeny()**](AdminInviteRequestsApi.md#adminInviteRequestsDeny) | **POST** /admin.inviteRequests.deny |  |
| [**adminInviteRequestsList()**](AdminInviteRequestsApi.md#adminInviteRequestsList) | **GET** /admin.inviteRequests.list |  |


## `adminInviteRequestsApprove()`

```php
adminInviteRequestsApprove($token, $admin_invite_requests_approve_request): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Approve a workspace invite request.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminInviteRequestsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.invites:write`
$admin_invite_requests_approve_request = new \OpenAPI\Client\Model\AdminInviteRequestsApproveRequest(); // \OpenAPI\Client\Model\AdminInviteRequestsApproveRequest

try {
    $result = $apiInstance->adminInviteRequestsApprove($token, $admin_invite_requests_approve_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminInviteRequestsApi->adminInviteRequestsApprove: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.invites:write&#x60; | |
| **admin_invite_requests_approve_request** | [**\OpenAPI\Client\Model\AdminInviteRequestsApproveRequest**](../Model/AdminInviteRequestsApproveRequest.md)|  | [optional] |

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

## `adminInviteRequestsDeny()`

```php
adminInviteRequestsDeny($token, $admin_invite_requests_approve_request): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Deny a workspace invite request.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminInviteRequestsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.invites:write`
$admin_invite_requests_approve_request = new \OpenAPI\Client\Model\AdminInviteRequestsApproveRequest(); // \OpenAPI\Client\Model\AdminInviteRequestsApproveRequest

try {
    $result = $apiInstance->adminInviteRequestsDeny($token, $admin_invite_requests_approve_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminInviteRequestsApi->adminInviteRequestsDeny: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.invites:write&#x60; | |
| **admin_invite_requests_approve_request** | [**\OpenAPI\Client\Model\AdminInviteRequestsApproveRequest**](../Model/AdminInviteRequestsApproveRequest.md)|  | [optional] |

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

## `adminInviteRequestsList()`

```php
adminInviteRequestsList($token, $team_id, $cursor, $limit): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



List all pending workspace invite requests.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminInviteRequestsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.invites:read`
$team_id = 'team_id_example'; // string | ID for the workspace where the invite requests were made.
$cursor = 'cursor_example'; // string | Value of the `next_cursor` field sent as part of the previous API response
$limit = 56; // int | The number of results that will be returned by the API on each invocation. Must be between 1 - 1000, both inclusive

try {
    $result = $apiInstance->adminInviteRequestsList($token, $team_id, $cursor, $limit);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminInviteRequestsApi->adminInviteRequestsList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.invites:read&#x60; | |
| **team_id** | **string**| ID for the workspace where the invite requests were made. | [optional] |
| **cursor** | **string**| Value of the &#x60;next_cursor&#x60; field sent as part of the previous API response | [optional] |
| **limit** | **int**| The number of results that will be returned by the API on each invocation. Must be between 1 - 1000, both inclusive | [optional] |

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
