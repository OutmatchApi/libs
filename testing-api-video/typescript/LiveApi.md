# .LiveApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dELETELiveStreamsLiveStreamId**](LiveApi.md#dELETELiveStreamsLiveStreamId) | **DELETE** /live-streams/{liveStreamId} | Delete a live stream
[**dELETELiveStreamsLiveStreamIdThumbnail**](LiveApi.md#dELETELiveStreamsLiveStreamIdThumbnail) | **DELETE** /live-streams/{liveStreamId}/thumbnail | Delete a thumbnail
[**gETLiveStreams**](LiveApi.md#gETLiveStreams) | **GET** /live-streams | List all live streams
[**gETLiveStreamsLiveStreamId**](LiveApi.md#gETLiveStreamsLiveStreamId) | **GET** /live-streams/{liveStreamId} | Show live stream
[**pATCHLiveStreamsLiveStreamId**](LiveApi.md#pATCHLiveStreamsLiveStreamId) | **PATCH** /live-streams/{liveStreamId} | Update a live stream
[**pOSTLiveStreams**](LiveApi.md#pOSTLiveStreams) | **POST** /live-streams | Create live stream
[**pOSTLiveStreamsLiveStreamIdThumbnail**](LiveApi.md#pOSTLiveStreamsLiveStreamIdThumbnail) | **POST** /live-streams/{liveStreamId}/thumbnail | Upload a thumbnail


# **dELETELiveStreamsLiveStreamId**
> void dELETELiveStreamsLiveStreamId()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .LiveApi(configuration);

let body:.LiveApiDELETELiveStreamsLiveStreamIdRequest = {
  // string | The unique ID for the live stream that you want to remove.
  liveStreamId: "li400mYKSgQ6xs7taUeSaEKr",
};

apiInstance.dELETELiveStreamsLiveStreamId(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **liveStreamId** | [**string**] | The unique ID for the live stream that you want to remove. | defaults to undefined


### Return type

**void**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **dELETELiveStreamsLiveStreamIdThumbnail**
> LiveStream dELETELiveStreamsLiveStreamIdThumbnail()

Send the unique identifier for a live stream to delete it from the system.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .LiveApi(configuration);

let body:.LiveApiDELETELiveStreamsLiveStreamIdThumbnailRequest = {
  // string | The unique identifier for the live stream you want to delete. 
  liveStreamId: "li400mYKSgQ6xs7taUeSaEKr",
};

apiInstance.dELETELiveStreamsLiveStreamIdThumbnail(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **liveStreamId** | [**string**] | The unique identifier for the live stream you want to delete.  | defaults to undefined


### Return type

**LiveStream**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **gETLiveStreams**
> LiveStreamListResponse gETLiveStreams()

With no parameters added to the url, this will return all livestreams. Query by name or key to limit the list.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .LiveApi(configuration);

let body:.LiveApiGETLiveStreamsRequest = {
  // string | The unique stream key that allows you to stream videos. (optional)
  streamKey: "30087931-229e-42cf-b5f9-e91bcc1f7332",
  // string | You can filter live streams by their name or a part of their name. (optional)
  name: "My Video",
  // string | Allowed: createdAt, publishedAt, name. createdAt - the time a livestream was created using the specified streamKey. publishedAt - the time a livestream was published using the specified streamKey. name - the name of the livestream. If you choose one of the time based options, the time is presented in ISO-8601 format. (optional)
  sortBy: "createdAt",
  // 'asc' | 'desc' | Allowed: asc, desc. Ascending for date and time means that earlier values precede later ones. Descending means that later values preced earlier ones. For title, it is 0-9 and A-Z ascending and Z-A, 9-0 descending. (optional)
  sortOrder: "desc",
  // number | Choose the number of search results to return per page. Minimum value: 1 (optional)
  currentPage: 2,
  // number | Results per page. Allowed values 1-100, default is 25. (optional)
  pageSize: 30,
};

apiInstance.gETLiveStreams(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamKey** | [**string**] | The unique stream key that allows you to stream videos. | (optional) defaults to undefined
 **name** | [**string**] | You can filter live streams by their name or a part of their name. | (optional) defaults to undefined
 **sortBy** | [**string**] | Allowed: createdAt, publishedAt, name. createdAt - the time a livestream was created using the specified streamKey. publishedAt - the time a livestream was published using the specified streamKey. name - the name of the livestream. If you choose one of the time based options, the time is presented in ISO-8601 format. | (optional) defaults to undefined
 **sortOrder** | [**&#39;asc&#39; | &#39;desc&#39;**]**Array<&#39;asc&#39; &#124; &#39;desc&#39;>** | Allowed: asc, desc. Ascending for date and time means that earlier values precede later ones. Descending means that later values preced earlier ones. For title, it is 0-9 and A-Z ascending and Z-A, 9-0 descending. | (optional) defaults to undefined
 **currentPage** | [**number**] | Choose the number of search results to return per page. Minimum value: 1 | (optional) defaults to 1
 **pageSize** | [**number**] | Results per page. Allowed values 1-100, default is 25. | (optional) defaults to 25


### Return type

**LiveStreamListResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **gETLiveStreamsLiveStreamId**
> LiveStream gETLiveStreamsLiveStreamId()

Supply a LivestreamId, and you'll get all the details for streaming into, and watching the livestream. Tutorials that use the [show livestream endpoint](https://api.video/blog/endpoints/live-stream-status).

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .LiveApi(configuration);

let body:.LiveApiGETLiveStreamsLiveStreamIdRequest = {
  // string | The unique ID for the live stream you want to watch.
  liveStreamId: "li400mYKSgQ6xs7taUeSaEKr",
};

apiInstance.gETLiveStreamsLiveStreamId(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **liveStreamId** | [**string**] | The unique ID for the live stream you want to watch. | defaults to undefined


### Return type

**LiveStream**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **pATCHLiveStreamsLiveStreamId**
> LiveStream pATCHLiveStreamsLiveStreamId()

Use this endpoint to update the player, or to turn recording on/off (saving a copy of the livestream). NOTE: If the livestream is actively streaming, changing the recording status will only affect the NEXT stream.    The public=false 'private livestream' is available as a BETA feature, and should be limited to livestreams of 3,000 viewers or fewer.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .LiveApi(configuration);

let body:.LiveApiPATCHLiveStreamsLiveStreamIdRequest = {
  // string | The unique ID for the live stream that you want to update information for such as player details, or whether you want the recording on or off.
  liveStreamId: "li400mYKSgQ6xs7taUeSaEKr",
  // LiveStreamUpdatePayload (optional)
  liveStreamUpdatePayload: {
    name: "My Live Stream Video",
    playerId: "pl45KFKdlddgk654dspkze",
    _public: true,
    record: true,
  },
};

apiInstance.pATCHLiveStreamsLiveStreamId(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **liveStreamUpdatePayload** | **LiveStreamUpdatePayload**|  |
 **liveStreamId** | [**string**] | The unique ID for the live stream that you want to update information for such as player details, or whether you want the recording on or off. | defaults to undefined


### Return type

**LiveStream**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **pOSTLiveStreams**
> LiveStream pOSTLiveStreams()

A live stream will give you the 'connection point' to RTMP your video stream to api.video. It will also give you the details for viewers to watch the same livestream.  The public=false 'private livestream' is available as a BETA feature, and should be limited to livestreams of 3,000 viewers or fewer. See our [Live Stream Tutorial](https://api.video/blog/tutorials/live-stream-tutorial) for a walkthrough of this API with OBS. Your RTMP endpoint for the livestream is rtmp://broadcast.api.video/s/{streamKey} Tutorials that [create live streams](https://api.video/blog/endpoints/live-create).

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .LiveApi(configuration);

let body:.LiveApiPOSTLiveStreamsRequest = {
  // LiveStreamCreatePayload (optional)
  liveStreamCreatePayload: {
    name: "My Live Stream Video",
    playerId: "pl4f4ferf5erfr5zed4fsdd",
    _public: true,
    record: true,
  },
};

apiInstance.pOSTLiveStreams(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **liveStreamCreatePayload** | **LiveStreamCreatePayload**|  |


### Return type

**LiveStream**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **pOSTLiveStreamsLiveStreamIdThumbnail**
> LiveStream pOSTLiveStreamsLiveStreamIdThumbnail()

Upload an image to use as a backdrop for your livestream. Tutorials that [update live stream thumbnails](https://api.video/blog/endpoints/live-upload-a-thumbnail).

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .LiveApi(configuration);

let body:.LiveApiPOSTLiveStreamsLiveStreamIdThumbnailRequest = {
  // string | The unique ID for the live stream you want to upload.
  liveStreamId: "vi4k0jvEUuaTdRAEjQ4Jfrgz",
  // HttpFile | The image to be added as a thumbnail.
  file: { data: Buffer.from(fs.readFileSync('/path/to/file', 'utf-8')), name: '/path/to/file' },
};

apiInstance.pOSTLiveStreamsLiveStreamIdThumbnail(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **liveStreamId** | [**string**] | The unique ID for the live stream you want to upload. | defaults to undefined
 **file** | [**HttpFile**] | The image to be added as a thumbnail. | defaults to undefined


### Return type

**LiveStream**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


