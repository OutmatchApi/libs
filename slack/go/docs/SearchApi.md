# \SearchApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**SearchMessages**](SearchApi.md#SearchMessages) | **Get** /search.messages | 



## SearchMessages

> DefaultSuccessTemplate SearchMessages(ctx).Token(token).Query(query).Count(count).Highlight(highlight).Page(page).Sort(sort).SortDir(sortDir).Execute()





### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    token := "token_example" // string | Authentication token. Requires scope: `search:read`
    query := "query_example" // string | Search query.
    count := int32(56) // int32 | Pass the number of results you want per \"page\". Maximum of `100`. (optional)
    highlight := true // bool | Pass a value of `true` to enable query highlight markers (see below). (optional)
    page := int32(56) // int32 |  (optional)
    sort := "sort_example" // string | Return matches sorted by either `score` or `timestamp`. (optional)
    sortDir := "sortDir_example" // string | Change sort direction to ascending (`asc`) or descending (`desc`). (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.SearchApi.SearchMessages(context.Background()).Token(token).Query(query).Count(count).Highlight(highlight).Page(page).Sort(sort).SortDir(sortDir).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SearchApi.SearchMessages``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `SearchMessages`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `SearchApi.SearchMessages`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSearchMessagesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;search:read&#x60; | 
 **query** | **string** | Search query. | 
 **count** | **int32** | Pass the number of results you want per \&quot;page\&quot;. Maximum of &#x60;100&#x60;. | 
 **highlight** | **bool** | Pass a value of &#x60;true&#x60; to enable query highlight markers (see below). | 
 **page** | **int32** |  | 
 **sort** | **string** | Return matches sorted by either &#x60;score&#x60; or &#x60;timestamp&#x60;. | 
 **sortDir** | **string** | Change sort direction to ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;). | 

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

