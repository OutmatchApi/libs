# OpenAPI\Client\AdminTeamsApi

All URIs are relative to https://slack.com/api, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**adminTeamsCreate()**](AdminTeamsApi.md#adminTeamsCreate) | **POST** /admin.teams.create |  |
| [**adminTeamsList()**](AdminTeamsApi.md#adminTeamsList) | **GET** /admin.teams.list |  |


## `adminTeamsCreate()`

```php
adminTeamsCreate($token, $team_domain, $team_name, $team_description, $team_discoverability): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Create an Enterprise team.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminTeamsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.teams:write`
$team_domain = 'team_domain_example'; // string | Team domain (for example, slacksoftballteam).
$team_name = 'team_name_example'; // string | Team name (for example, Slack Softball Team).
$team_description = 'team_description_example'; // string | Description for the team.
$team_discoverability = 'team_discoverability_example'; // string | Who can join the team. A team's discoverability can be `open`, `closed`, `invite_only`, or `unlisted`.

try {
    $result = $apiInstance->adminTeamsCreate($token, $team_domain, $team_name, $team_description, $team_discoverability);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminTeamsApi->adminTeamsCreate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.teams:write&#x60; | |
| **team_domain** | **string**| Team domain (for example, slacksoftballteam). | |
| **team_name** | **string**| Team name (for example, Slack Softball Team). | |
| **team_description** | **string**| Description for the team. | [optional] |
| **team_discoverability** | **string**| Who can join the team. A team&#39;s discoverability can be &#x60;open&#x60;, &#x60;closed&#x60;, &#x60;invite_only&#x60;, or &#x60;unlisted&#x60;. | [optional] |

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

## `adminTeamsList()`

```php
adminTeamsList($token, $limit, $cursor): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



List all teams on an Enterprise organization

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminTeamsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.teams:read`
$limit = 56; // int | The maximum number of items to return. Must be between 1 - 100 both inclusive.
$cursor = 'cursor_example'; // string | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page.

try {
    $result = $apiInstance->adminTeamsList($token, $limit, $cursor);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminTeamsApi->adminTeamsList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.teams:read&#x60; | |
| **limit** | **int**| The maximum number of items to return. Must be between 1 - 100 both inclusive. | [optional] |
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
