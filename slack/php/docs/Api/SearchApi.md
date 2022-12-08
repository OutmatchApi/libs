# OpenAPI\Client\SearchApi

All URIs are relative to https://slack.com/api, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**searchMessages()**](SearchApi.md#searchMessages) | **GET** /search.messages |  |


## `searchMessages()`

```php
searchMessages($token, $query, $count, $highlight, $page, $sort, $sort_dir): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Searches for messages matching a query.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\SearchApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `search:read`
$query = 'query_example'; // string | Search query.
$count = 56; // int | Pass the number of results you want per \"page\". Maximum of `100`.
$highlight = True; // bool | Pass a value of `true` to enable query highlight markers (see below).
$page = 56; // int
$sort = 'sort_example'; // string | Return matches sorted by either `score` or `timestamp`.
$sort_dir = 'sort_dir_example'; // string | Change sort direction to ascending (`asc`) or descending (`desc`).

try {
    $result = $apiInstance->searchMessages($token, $query, $count, $highlight, $page, $sort, $sort_dir);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SearchApi->searchMessages: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;search:read&#x60; | |
| **query** | **string**| Search query. | |
| **count** | **int**| Pass the number of results you want per \&quot;page\&quot;. Maximum of &#x60;100&#x60;. | [optional] |
| **highlight** | **bool**| Pass a value of &#x60;true&#x60; to enable query highlight markers (see below). | [optional] |
| **page** | **int**|  | [optional] |
| **sort** | **string**| Return matches sorted by either &#x60;score&#x60; or &#x60;timestamp&#x60;. | [optional] |
| **sort_dir** | **string**| Change sort direction to ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;). | [optional] |

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
