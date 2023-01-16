# .FunnelApi

All URIs are relative to *https://www.PayMeFunnel.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**funnelCreate**](FunnelApi.md#funnelCreate) | **POST** /funnel | 


# **funnelCreate**
> Funnel funnelCreate()

create a new funnel

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .FunnelApi(configuration);

let body:.FunnelApiFunnelCreateRequest = {
  // FunnelCreateRequest (optional)
  funnelCreateRequest: {
    coverPhotoAssetId: "coverPhotoAssetId_example",
    profilePhotoAssetId: "profilePhotoAssetId_example",
    message: "message_example",
    assetIds: [
      "assetIds_example",
    ],
    expiry: 3.14,
    name: "name_example",
  },
};

apiInstance.funnelCreate(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **funnelCreateRequest** | **FunnelCreateRequest**|  |


### Return type

**Funnel**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


