# SmoothApi.UserApi

All URIs are relative to *http://localhost:8000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUser**](UserApi.md#createUser) | **POST** /user | Create user
[**updateUser**](UserApi.md#updateUser) | **PUT** /user/{user_id} | Update user



## createUser

> User createUser(opts)

Create user

This can only be done by the logged in user.

### Example

```javascript
import SmoothApi from 'smooth_api';

let apiInstance = new SmoothApi.UserApi();
let opts = {
  'userPostRequest': new SmoothApi.UserPostRequest() // UserPostRequest | Created user object
};
apiInstance.createUser(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userPostRequest** | [**UserPostRequest**](UserPostRequest.md)| Created user object | [optional] 

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## updateUser

> updateUser(userId, opts)

Update user

This can only be done by the logged in user.

### Example

```javascript
import SmoothApi from 'smooth_api';

let apiInstance = new SmoothApi.UserApi();
let userId = "userId_example"; // String | user id to update
let opts = {
  'userPutRequest': new SmoothApi.UserPutRequest() // UserPutRequest | Update an existent user in the store
};
apiInstance.updateUser(userId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| user id to update | 
 **userPutRequest** | [**UserPutRequest**](UserPutRequest.md)| Update an existent user in the store | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

