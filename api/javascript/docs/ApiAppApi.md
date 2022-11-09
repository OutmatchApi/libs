# SmoothApi.ApiAppApi

All URIs are relative to *http://localhost:8000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createApiApp**](ApiAppApi.md#createApiApp) | **POST** /apiApp | Create api app
[**createApiAppRelease**](ApiAppApi.md#createApiAppRelease) | **POST** /apiApp/{app_id}/release | Create api app release
[**createApiAppReleaseSdks**](ApiAppApi.md#createApiAppReleaseSdks) | **POST** /apiApp/{app_id}/release/{release_id}/sdk | Generate sdks for a relase



## createApiApp

> ApiApp createApiApp(opts)

Create api app

Create an api app for the authenticated user

### Example

```javascript
import SmoothApi from 'smooth_api';

let apiInstance = new SmoothApi.ApiAppApi();
let opts = {
  'apiAppRequest': new SmoothApi.ApiAppRequest() // ApiAppRequest | Created api app object
};
apiInstance.createApiApp(opts, (error, data, response) => {
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
 **apiAppRequest** | [**ApiAppRequest**](ApiAppRequest.md)| Created api app object | [optional] 

### Return type

[**ApiApp**](ApiApp.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## createApiAppRelease

> Release createApiAppRelease(appId, opts)

Create api app release

Create an api app release

### Example

```javascript
import SmoothApi from 'smooth_api';

let apiInstance = new SmoothApi.ApiAppApi();
let appId = "appId_example"; // String | app id to associate the release with
let opts = {
  'releaseRequest': new SmoothApi.ReleaseRequest() // ReleaseRequest | Created release object
};
apiInstance.createApiAppRelease(appId, opts, (error, data, response) => {
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
 **appId** | **String**| app id to associate the release with | 
 **releaseRequest** | [**ReleaseRequest**](ReleaseRequest.md)| Created release object | [optional] 

### Return type

[**Release**](Release.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## createApiAppReleaseSdks

> SdkResponse createApiAppReleaseSdks(appId, releaseId, opts)

Generate sdks for a relase

Generate sdks for a relase

### Example

```javascript
import SmoothApi from 'smooth_api';

let apiInstance = new SmoothApi.ApiAppApi();
let appId = "appId_example"; // String | app id
let releaseId = "releaseId_example"; // String | release id
let opts = {
  'sdkRequest': new SmoothApi.SdkRequest() // SdkRequest | Created sdks objects
};
apiInstance.createApiAppReleaseSdks(appId, releaseId, opts, (error, data, response) => {
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
 **appId** | **String**| app id | 
 **releaseId** | **String**| release id | 
 **sdkRequest** | [**SdkRequest**](SdkRequest.md)| Created sdks objects | [optional] 

### Return type

[**SdkResponse**](SdkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

