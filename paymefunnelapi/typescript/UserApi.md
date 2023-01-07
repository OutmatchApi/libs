# .UserApi

All URIs are relative to *https://www.PayMeFunnel.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUser**](UserApi.md#createUser) | **POST** /user | Create user
[**updateUser**](UserApi.md#updateUser) | **PUT** /user | Update user


# **createUser**
> User createUser()

This can only be done by the logged in user.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .UserApi(configuration);

let body:.UserApiCreateUserRequest = {
  // CreateUserRequest (optional)
  createUserRequest: {
    email: "john@email.com",
    firstName: "John",
    lastName: "James",
    instagram: "@myIgHandle",
    tiktok: "@myTikTokHandle",
  },
};

apiInstance.createUser(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createUserRequest** | **CreateUserRequest**|  |


### Return type

**User**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | user created |  -  |
**4XX** | Client Error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **updateUser**
> void updateUser()

This can only be done by the logged in user.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .UserApi(configuration);

let body:.UserApiUpdateUserRequest = {
  // UpdateUserRequest (optional)
  updateUserRequest: {
    firstName: "John",
    lastName: "James",
    instagram: "@myIgHandle",
    tiktok: "@myTikTokHandle",
  },
};

apiInstance.updateUser(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateUserRequest** | **UpdateUserRequest**|  |


### Return type

**void**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | successful operation |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


