# OpenAPI\Client\AdminTeamsOwnersApi

All URIs are relative to https://slack.com/api, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**adminTeamsOwnersList()**](AdminTeamsOwnersApi.md#adminTeamsOwnersList) | **GET** /admin.teams.owners.list |  |


## `adminTeamsOwnersList()`

```php
adminTeamsOwnersList($token, $team_id, $limit, $cursor): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



List all of the owners on a given workspace.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminTeamsOwnersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.teams:read`
$team_id = 'team_id_example'; // string
$limit = 56; // int | The maximum number of items to return. Must be between 1 - 1000 both inclusive.
$cursor = 'cursor_example'; // string | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page.

try {
    $result = $apiInstance->adminTeamsOwnersList($token, $team_id, $limit, $cursor);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminTeamsOwnersApi->adminTeamsOwnersList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.teams:read&#x60; | |
| **team_id** | **string**|  | |
| **limit** | **int**| The maximum number of items to return. Must be between 1 - 1000 both inclusive. | [optional] |
| **cursor** | **string**| Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page. | [optional] |

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
