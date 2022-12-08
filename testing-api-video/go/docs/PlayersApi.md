# \PlayersApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DELETEPlayersPlayerId**](PlayersApi.md#DELETEPlayersPlayerId) | **Delete** /players/{playerId} | Delete a player
[**DELETEPlayersPlayerIdLogo**](PlayersApi.md#DELETEPlayersPlayerIdLogo) | **Delete** /players/{playerId}/logo | Delete logo
[**GETPlayers**](PlayersApi.md#GETPlayers) | **Get** /players | List all players
[**GETPlayersPlayerId**](PlayersApi.md#GETPlayersPlayerId) | **Get** /players/{playerId} | Show a player
[**PATCHPlayersPlayerId**](PlayersApi.md#PATCHPlayersPlayerId) | **Patch** /players/{playerId} | Update a player
[**POSTPlayers**](PlayersApi.md#POSTPlayers) | **Post** /players | Create a player
[**POSTPlayersPlayerIdLogo**](PlayersApi.md#POSTPlayersPlayerIdLogo) | **Post** /players/{playerId}/logo | Upload a logo



## DELETEPlayersPlayerId

> DELETEPlayersPlayerId(ctx, playerId).Execute()

Delete a player



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
    playerId := "pl45d5vFFGrfdsdsd156dGhh" // string | The unique identifier for the player you want to delete.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.PlayersApi.DELETEPlayersPlayerId(context.Background(), playerId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `PlayersApi.DELETEPlayersPlayerId``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**playerId** | **string** | The unique identifier for the player you want to delete. | 

### Other Parameters

Other parameters are passed through a pointer to a apiDELETEPlayersPlayerIdRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

 (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DELETEPlayersPlayerIdLogo

> map[string]interface{} DELETEPlayersPlayerIdLogo(ctx, playerId).Execute()

Delete logo

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
    playerId := "pl14Db6oMJRH6SRVoOwORacK" // string | The unique identifier for the player.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.PlayersApi.DELETEPlayersPlayerIdLogo(context.Background(), playerId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `PlayersApi.DELETEPlayersPlayerIdLogo``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `DELETEPlayersPlayerIdLogo`: map[string]interface{}
    fmt.Fprintf(os.Stdout, "Response from `PlayersApi.DELETEPlayersPlayerIdLogo`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**playerId** | **string** | The unique identifier for the player. | 

### Other Parameters

Other parameters are passed through a pointer to a apiDELETEPlayersPlayerIdLogoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

**map[string]interface{}**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GETPlayers

> PlayersListResponse GETPlayers(ctx).SortBy(sortBy).SortOrder(sortOrder).CurrentPage(currentPage).PageSize(pageSize).Execute()

List all players



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
    sortBy := "createdAt" // string | createdAt is the time the player was created. updatedAt is the time the player was last updated. The time is presented in ISO-8601 format. (optional)
    sortOrder := "asc" // string | Allowed: asc, desc. Ascending for date and time means that earlier values precede later ones. Descending means that later values preced earlier ones. (optional)
    currentPage := int32(2) // int32 | Choose the number of search results to return per page. Minimum value: 1 (optional) (default to 1)
    pageSize := int32(30) // int32 | Results per page. Allowed values 1-100, default is 25. (optional) (default to 25)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.PlayersApi.GETPlayers(context.Background()).SortBy(sortBy).SortOrder(sortOrder).CurrentPage(currentPage).PageSize(pageSize).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `PlayersApi.GETPlayers``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GETPlayers`: PlayersListResponse
    fmt.Fprintf(os.Stdout, "Response from `PlayersApi.GETPlayers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGETPlayersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sortBy** | **string** | createdAt is the time the player was created. updatedAt is the time the player was last updated. The time is presented in ISO-8601 format. | 
 **sortOrder** | **string** | Allowed: asc, desc. Ascending for date and time means that earlier values precede later ones. Descending means that later values preced earlier ones. | 
 **currentPage** | **int32** | Choose the number of search results to return per page. Minimum value: 1 | [default to 1]
 **pageSize** | **int32** | Results per page. Allowed values 1-100, default is 25. | [default to 25]

### Return type

[**PlayersListResponse**](PlayersListResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GETPlayersPlayerId

> Player GETPlayersPlayerId(ctx, playerId).Execute()

Show a player



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
    playerId := "pl45d5vFFGrfdsdsd156dGhh" // string | The unique identifier for the player you want to retrieve. 

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.PlayersApi.GETPlayersPlayerId(context.Background(), playerId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `PlayersApi.GETPlayersPlayerId``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GETPlayersPlayerId`: Player
    fmt.Fprintf(os.Stdout, "Response from `PlayersApi.GETPlayersPlayerId`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**playerId** | **string** | The unique identifier for the player you want to retrieve.  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGETPlayersPlayerIdRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Player**](Player.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PATCHPlayersPlayerId

> Player PATCHPlayersPlayerId(ctx, playerId).PlayerUpdatePayload(playerUpdatePayload).Execute()

Update a player



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
    playerId := "pl45d5vFFGrfdsdsd156dGhh" // string | The unique identifier for the player.
    playerUpdatePayload := *openapiclient.NewPlayerUpdatePayload() // PlayerUpdatePayload | 

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.PlayersApi.PATCHPlayersPlayerId(context.Background(), playerId).PlayerUpdatePayload(playerUpdatePayload).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `PlayersApi.PATCHPlayersPlayerId``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `PATCHPlayersPlayerId`: Player
    fmt.Fprintf(os.Stdout, "Response from `PlayersApi.PATCHPlayersPlayerId`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**playerId** | **string** | The unique identifier for the player. | 

### Other Parameters

Other parameters are passed through a pointer to a apiPATCHPlayersPlayerIdRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **playerUpdatePayload** | [**PlayerUpdatePayload**](PlayerUpdatePayload.md) |  | 

### Return type

[**Player**](Player.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## POSTPlayers

> Player POSTPlayers(ctx).PlayerCreationPayload(playerCreationPayload).Execute()

Create a player



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
    playerCreationPayload := *openapiclient.NewPlayerCreationPayload() // PlayerCreationPayload | 

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.PlayersApi.POSTPlayers(context.Background()).PlayerCreationPayload(playerCreationPayload).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `PlayersApi.POSTPlayers``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `POSTPlayers`: Player
    fmt.Fprintf(os.Stdout, "Response from `PlayersApi.POSTPlayers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPOSTPlayersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playerCreationPayload** | [**PlayerCreationPayload**](PlayerCreationPayload.md) |  | 

### Return type

[**Player**](Player.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## POSTPlayersPlayerIdLogo

> Player POSTPlayersPlayerIdLogo(ctx, playerId).File(file).Link(link).Execute()

Upload a logo



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
    playerId := "pl14Db6oMJRH6SRVoOwORacK" // string | The unique identifier for the player.
    file := os.NewFile(1234, "some_file") // *os.File | The name of the file you want to use for your logo.
    link := "link_example" // string | The path to the file you want to upload and use as a logo.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.PlayersApi.POSTPlayersPlayerIdLogo(context.Background(), playerId).File(file).Link(link).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `PlayersApi.POSTPlayersPlayerIdLogo``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `POSTPlayersPlayerIdLogo`: Player
    fmt.Fprintf(os.Stdout, "Response from `PlayersApi.POSTPlayersPlayerIdLogo`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**playerId** | **string** | The unique identifier for the player. | 

### Other Parameters

Other parameters are passed through a pointer to a apiPOSTPlayersPlayerIdLogoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **file** | ***os.File** | The name of the file you want to use for your logo. | 
 **link** | **string** | The path to the file you want to upload and use as a logo. | 

### Return type

[**Player**](Player.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

