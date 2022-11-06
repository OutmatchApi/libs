# .UserApi

All URIs are relative to *http://localhost:8000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUser**](UserApi.md#createUser) | **POST** /user | Create user
[**updateUser**](UserApi.md#updateUser) | **PUT** /user/{id} | Update user


# **createUser**
> createUser()

This can only be done by the logged in user.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .UserApi(configuration);

let body:.UserApiCreateUserRequest = {
  // UserPostRequest | Created user object (optional)
  userPostRequest: {
    email: "john@email.com",
    firstName: "John",
    lastName: "James",
    company: "My Company",
  },
};

apiInstance.createUser(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userPostRequest** | **UserPostRequest**| Created user object |


### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | successful operation |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **updateUser**
> updateUser()

This can only be done by the logged in user.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .UserApi(configuration);

let body:.UserApiUpdateUserRequest = {
  // string | name that need to be deleted
  username: "username_example",
  // UserPutRequest | Update an existent user in the store (optional)
  userPutRequest: {
    firstName: "John",
    lastName: "James",
    company: "My Company",
  },
};

apiInstance.updateUser(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userPutRequest** | **UserPutRequest**| Update an existent user in the store |
 **username** | [**string**] | name that need to be deleted | defaults to undefined


### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | successful operation |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


