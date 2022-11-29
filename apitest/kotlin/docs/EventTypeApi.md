# EventTypeApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEventTypeApiV1EventTypePost**](EventTypeApi.md#createEventTypeApiV1EventTypePost) | **POST** /api/v1/event-type/ | Create Event Type
[**deleteEventTypeApiV1EventTypeEventTypeNameDelete**](EventTypeApi.md#deleteEventTypeApiV1EventTypeEventTypeNameDelete) | **DELETE** /api/v1/event-type/{event_type_name}/ | Archive Event Type
[**getEventTypeApiV1EventTypeEventTypeNameGet**](EventTypeApi.md#getEventTypeApiV1EventTypeEventTypeNameGet) | **GET** /api/v1/event-type/{event_type_name}/ | Get Event Type
[**listEventTypesApiV1EventTypeGet**](EventTypeApi.md#listEventTypesApiV1EventTypeGet) | **GET** /api/v1/event-type/ | List Event Types
[**updateEventTypeApiV1EventTypeEventTypeNamePut**](EventTypeApi.md#updateEventTypeApiV1EventTypeEventTypeNamePut) | **PUT** /api/v1/event-type/{event_type_name}/ | Update Event Type


<a name="createEventTypeApiV1EventTypePost"></a>
# **createEventTypeApiV1EventTypePost**
> EventTypeOut createEventTypeApiV1EventTypePost(eventTypeIn, idempotencyKey)

Create Event Type

Create new or unarchive existing event type.  Unarchiving an event type will allow endpoints to filter on it and messages to be sent with it. Endpoints filtering on the event type before archival will continue to filter on it. This operation does not preserve the description and schemas.

### Example
```kotlin
// Import classes:
//import apitest.infrastructure.*
//import com.outmatchapi.apitest.*

val apiInstance = EventTypeApi()
val eventTypeIn : EventTypeIn =  // EventTypeIn | 
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | The request's idempotency key
try {
    val result : EventTypeOut = apiInstance.createEventTypeApiV1EventTypePost(eventTypeIn, idempotencyKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventTypeApi#createEventTypeApiV1EventTypePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventTypeApi#createEventTypeApiV1EventTypePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventTypeIn** | [**EventTypeIn**](EventTypeIn.md)|  |
 **idempotencyKey** | **kotlin.String**| The request&#39;s idempotency key | [optional]

### Return type

[**EventTypeOut**](EventTypeOut.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteEventTypeApiV1EventTypeEventTypeNameDelete"></a>
# **deleteEventTypeApiV1EventTypeEventTypeNameDelete**
> deleteEventTypeApiV1EventTypeEventTypeNameDelete(eventTypeName, idempotencyKey)

Archive Event Type

Archive an event type.  Endpoints already configured to filter on an event type will continue to do so after archival. However, new messages can not be sent with it and endpoints can not filter on it. An event type can be unarchived with the [create operation](#operation/create_event_type_api_v1_event_type__post).

### Example
```kotlin
// Import classes:
//import apitest.infrastructure.*
//import com.outmatchapi.apitest.*

val apiInstance = EventTypeApi()
val eventTypeName : kotlin.String = user.signup // kotlin.String | 
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | The request's idempotency key
try {
    apiInstance.deleteEventTypeApiV1EventTypeEventTypeNameDelete(eventTypeName, idempotencyKey)
} catch (e: ClientException) {
    println("4xx response calling EventTypeApi#deleteEventTypeApiV1EventTypeEventTypeNameDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventTypeApi#deleteEventTypeApiV1EventTypeEventTypeNameDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventTypeName** | **kotlin.String**|  |
 **idempotencyKey** | **kotlin.String**| The request&#39;s idempotency key | [optional]

### Return type

null (empty response body)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEventTypeApiV1EventTypeEventTypeNameGet"></a>
# **getEventTypeApiV1EventTypeEventTypeNameGet**
> EventTypeOut getEventTypeApiV1EventTypeEventTypeNameGet(eventTypeName, idempotencyKey)

Get Event Type

Get an event type.

### Example
```kotlin
// Import classes:
//import apitest.infrastructure.*
//import com.outmatchapi.apitest.*

val apiInstance = EventTypeApi()
val eventTypeName : kotlin.String = user.signup // kotlin.String | 
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | The request's idempotency key
try {
    val result : EventTypeOut = apiInstance.getEventTypeApiV1EventTypeEventTypeNameGet(eventTypeName, idempotencyKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventTypeApi#getEventTypeApiV1EventTypeEventTypeNameGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventTypeApi#getEventTypeApiV1EventTypeEventTypeNameGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventTypeName** | **kotlin.String**|  |
 **idempotencyKey** | **kotlin.String**| The request&#39;s idempotency key | [optional]

### Return type

[**EventTypeOut**](EventTypeOut.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listEventTypesApiV1EventTypeGet"></a>
# **listEventTypesApiV1EventTypeGet**
> ListResponseEventTypeOut listEventTypesApiV1EventTypeGet(iterator, limit, withContent, includeArchived, idempotencyKey)

List Event Types

Return the list of event types.

### Example
```kotlin
// Import classes:
//import apitest.infrastructure.*
//import com.outmatchapi.apitest.*

val apiInstance = EventTypeApi()
val iterator : kotlin.String = user.signup // kotlin.String | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val withContent : kotlin.Boolean = true // kotlin.Boolean | 
val includeArchived : kotlin.Boolean = true // kotlin.Boolean | 
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | The request's idempotency key
try {
    val result : ListResponseEventTypeOut = apiInstance.listEventTypesApiV1EventTypeGet(iterator, limit, withContent, includeArchived, idempotencyKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventTypeApi#listEventTypesApiV1EventTypeGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventTypeApi#listEventTypesApiV1EventTypeGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **iterator** | **kotlin.String**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional] [default to 50]
 **withContent** | **kotlin.Boolean**|  | [optional] [default to false]
 **includeArchived** | **kotlin.Boolean**|  | [optional] [default to false]
 **idempotencyKey** | **kotlin.String**| The request&#39;s idempotency key | [optional]

### Return type

[**ListResponseEventTypeOut**](ListResponseEventTypeOut.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateEventTypeApiV1EventTypeEventTypeNamePut"></a>
# **updateEventTypeApiV1EventTypeEventTypeNamePut**
> EventTypeOut updateEventTypeApiV1EventTypeEventTypeNamePut(eventTypeName, eventTypeUpdate, idempotencyKey)

Update Event Type

Update an event type.

### Example
```kotlin
// Import classes:
//import apitest.infrastructure.*
//import com.outmatchapi.apitest.*

val apiInstance = EventTypeApi()
val eventTypeName : kotlin.String = user.signup // kotlin.String | 
val eventTypeUpdate : EventTypeUpdate =  // EventTypeUpdate | 
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | The request's idempotency key
try {
    val result : EventTypeOut = apiInstance.updateEventTypeApiV1EventTypeEventTypeNamePut(eventTypeName, eventTypeUpdate, idempotencyKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventTypeApi#updateEventTypeApiV1EventTypeEventTypeNamePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventTypeApi#updateEventTypeApiV1EventTypeEventTypeNamePut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventTypeName** | **kotlin.String**|  |
 **eventTypeUpdate** | [**EventTypeUpdate**](EventTypeUpdate.md)|  |
 **idempotencyKey** | **kotlin.String**| The request&#39;s idempotency key | [optional]

### Return type

[**EventTypeOut**](EventTypeOut.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

