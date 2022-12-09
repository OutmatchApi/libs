# PlayersApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dELETEPlayersPlayerId**](PlayersApi.md#dELETEPlayersPlayerId) | **DELETE** /players/{playerId} | Delete a player
[**dELETEPlayersPlayerIdLogo**](PlayersApi.md#dELETEPlayersPlayerIdLogo) | **DELETE** /players/{playerId}/logo | Delete logo
[**gETPlayers**](PlayersApi.md#gETPlayers) | **GET** /players | List all players
[**gETPlayersPlayerId**](PlayersApi.md#gETPlayersPlayerId) | **GET** /players/{playerId} | Show a player
[**pATCHPlayersPlayerId**](PlayersApi.md#pATCHPlayersPlayerId) | **PATCH** /players/{playerId} | Update a player
[**pOSTPlayers**](PlayersApi.md#pOSTPlayers) | **POST** /players | Create a player
[**pOSTPlayersPlayerIdLogo**](PlayersApi.md#pOSTPlayersPlayerIdLogo) | **POST** /players/{playerId}/logo | Upload a logo


<a name="dELETEPlayersPlayerId"></a>
# **dELETEPlayersPlayerId**
> dELETEPlayersPlayerId(playerId)

Delete a player

Delete a player if you no longer need it. You can delete any player that you have the player ID for.

### Example
```kotlin
// Import classes:
//import apivideo.infrastructure.*
//import com.outmatchapi.apivideo.*

val apiInstance = PlayersApi()
val playerId : kotlin.String = pl45d5vFFGrfdsdsd156dGhh // kotlin.String | The unique identifier for the player you want to delete.
try {
    apiInstance.dELETEPlayersPlayerId(playerId)
} catch (e: ClientException) {
    println("4xx response calling PlayersApi#dELETEPlayersPlayerId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlayersApi#dELETEPlayersPlayerId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playerId** | **kotlin.String**| The unique identifier for the player you want to delete. |

### Return type

null (empty response body)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dELETEPlayersPlayerIdLogo"></a>
# **dELETEPlayersPlayerIdLogo**
> kotlin.Any dELETEPlayersPlayerIdLogo(playerId)

Delete logo

### Example
```kotlin
// Import classes:
//import apivideo.infrastructure.*
//import com.outmatchapi.apivideo.*

val apiInstance = PlayersApi()
val playerId : kotlin.String = pl14Db6oMJRH6SRVoOwORacK // kotlin.String | The unique identifier for the player.
try {
    val result : kotlin.Any = apiInstance.dELETEPlayersPlayerIdLogo(playerId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlayersApi#dELETEPlayersPlayerIdLogo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlayersApi#dELETEPlayersPlayerIdLogo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playerId** | **kotlin.String**| The unique identifier for the player. |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETPlayers"></a>
# **gETPlayers**
> PlayersMinusListMinusResponse gETPlayers(sortBy, sortOrder, currentPage, pageSize)

List all players

Retrieve a list of all the players you created, as well as details about each one. Tutorials that use the [player endpoint](https://api.video/blog/endpoints/player).

### Example
```kotlin
// Import classes:
//import apivideo.infrastructure.*
//import com.outmatchapi.apivideo.*

val apiInstance = PlayersApi()
val sortBy : kotlin.String = createdAt // kotlin.String | createdAt is the time the player was created. updatedAt is the time the player was last updated. The time is presented in ISO-8601 format.
val sortOrder : kotlin.String = asc // kotlin.String | Allowed: asc, desc. Ascending for date and time means that earlier values precede later ones. Descending means that later values preced earlier ones.
val currentPage : kotlin.Int = 2 // kotlin.Int | Choose the number of search results to return per page. Minimum value: 1
val pageSize : kotlin.Int = 30 // kotlin.Int | Results per page. Allowed values 1-100, default is 25.
try {
    val result : PlayersMinusListMinusResponse = apiInstance.gETPlayers(sortBy, sortOrder, currentPage, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlayersApi#gETPlayers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlayersApi#gETPlayers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sortBy** | **kotlin.String**| createdAt is the time the player was created. updatedAt is the time the player was last updated. The time is presented in ISO-8601 format. | [optional] [enum: createdAt, updatedAt]
 **sortOrder** | **kotlin.String**| Allowed: asc, desc. Ascending for date and time means that earlier values precede later ones. Descending means that later values preced earlier ones. | [optional] [enum: asc, desc]
 **currentPage** | **kotlin.Int**| Choose the number of search results to return per page. Minimum value: 1 | [optional] [default to 1]
 **pageSize** | **kotlin.Int**| Results per page. Allowed values 1-100, default is 25. | [optional] [default to 25]

### Return type

[**PlayersMinusListMinusResponse**](PlayersMinusListMinusResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETPlayersPlayerId"></a>
# **gETPlayersPlayerId**
> Player gETPlayersPlayerId(playerId)

Show a player

Use a player ID to retrieve details about the player and display it for viewers.

### Example
```kotlin
// Import classes:
//import apivideo.infrastructure.*
//import com.outmatchapi.apivideo.*

val apiInstance = PlayersApi()
val playerId : kotlin.String = pl45d5vFFGrfdsdsd156dGhh // kotlin.String | The unique identifier for the player you want to retrieve. 
try {
    val result : Player = apiInstance.gETPlayersPlayerId(playerId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlayersApi#gETPlayersPlayerId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlayersApi#gETPlayersPlayerId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playerId** | **kotlin.String**| The unique identifier for the player you want to retrieve.  |

### Return type

[**Player**](Player.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pATCHPlayersPlayerId"></a>
# **pATCHPlayersPlayerId**
> Player pATCHPlayersPlayerId(playerId, playerUpdatePayload)

Update a player

Use a player ID to update specific details for a player. NOTE: It may take up to 10 min before the new player configuration is available from our CDN.

### Example
```kotlin
// Import classes:
//import apivideo.infrastructure.*
//import com.outmatchapi.apivideo.*

val apiInstance = PlayersApi()
val playerId : kotlin.String = pl45d5vFFGrfdsdsd156dGhh // kotlin.String | The unique identifier for the player.
val playerUpdatePayload : PlayerUpdatePayload =  // PlayerUpdatePayload | 
try {
    val result : Player = apiInstance.pATCHPlayersPlayerId(playerId, playerUpdatePayload)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlayersApi#pATCHPlayersPlayerId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlayersApi#pATCHPlayersPlayerId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playerId** | **kotlin.String**| The unique identifier for the player. |
 **playerUpdatePayload** | [**PlayerUpdatePayload**](PlayerUpdatePayload.md)|  |

### Return type

[**Player**](Player.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pOSTPlayers"></a>
# **pOSTPlayers**
> Player pOSTPlayers(playerCreationPayload)

Create a player

Create a player for your video, and customise it.

### Example
```kotlin
// Import classes:
//import apivideo.infrastructure.*
//import com.outmatchapi.apivideo.*

val apiInstance = PlayersApi()
val playerCreationPayload : PlayerCreationPayload =  // PlayerCreationPayload | 
try {
    val result : Player = apiInstance.pOSTPlayers(playerCreationPayload)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlayersApi#pOSTPlayers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlayersApi#pOSTPlayers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playerCreationPayload** | [**PlayerCreationPayload**](PlayerCreationPayload.md)|  |

### Return type

[**Player**](Player.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pOSTPlayersPlayerIdLogo"></a>
# **pOSTPlayersPlayerIdLogo**
> Player pOSTPlayersPlayerIdLogo(playerId, file, link)

Upload a logo

The uploaded image maximum size should be 200x100 and its weight should be 200KB.  It will be scaled down to 30px height and converted to PNG to be displayed in the player.

### Example
```kotlin
// Import classes:
//import apivideo.infrastructure.*
//import com.outmatchapi.apivideo.*

val apiInstance = PlayersApi()
val playerId : kotlin.String = pl14Db6oMJRH6SRVoOwORacK // kotlin.String | The unique identifier for the player.
val file : java.io.File = BINARY_DATA_HERE // java.io.File | The name of the file you want to use for your logo.
val link : kotlin.String = link_example // kotlin.String | The path to the file you want to upload and use as a logo.
try {
    val result : Player = apiInstance.pOSTPlayersPlayerIdLogo(playerId, file, link)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlayersApi#pOSTPlayersPlayerIdLogo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlayersApi#pOSTPlayersPlayerIdLogo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playerId** | **kotlin.String**| The unique identifier for the player. |
 **file** | **java.io.File**| The name of the file you want to use for your logo. |
 **link** | **kotlin.String**| The path to the file you want to upload and use as a logo. |

### Return type

[**Player**](Player.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

