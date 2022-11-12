# .SpecApi

All URIs are relative to *http://localhost:8000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**downloadSpec**](SpecApi.md#downloadSpec) | **GET** /spec/{app_id}/release/{release_version} | Download openapi spec


# **downloadSpec**
> downloadSpec()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .SpecApi(configuration);

let body:.SpecApiDownloadSpecRequest = {
  // string | app id
  appId: "app_id_example",
  // string | release id
  releaseVersion: "1.0.0",
};

apiInstance.downloadSpec(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | [**string**] | app id | defaults to undefined
 **releaseVersion** | [**string**] | release id | defaults to undefined


### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | successful operation |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


