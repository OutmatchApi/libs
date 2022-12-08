/*
api.video

api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.

API version: 1.0.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package testing-api-video

import (
	"bytes"
	"context"
	"io/ioutil"
	"net/http"
	"net/url"
	"strings"
	"reflect"
)


// AnalyticsApiService AnalyticsApi service
type AnalyticsApiService service

type ApiGETAnalyticsLiveStreamsLiveStreamIdRequest struct {
	ctx context.Context
	ApiService *AnalyticsApiService
	liveStreamId string
	period *string
	currentPage *int32
	pageSize *int32
}

// Period must have one of the following formats:  - For a day : \&quot;2018-01-01\&quot;, - For a week: \&quot;2018-W01\&quot;,  - For a month: \&quot;2018-01\&quot; - For a year: \&quot;2018\&quot; For a range period:  -  Date range: \&quot;2018-01-01/2018-01-15\&quot; 
func (r ApiGETAnalyticsLiveStreamsLiveStreamIdRequest) Period(period string) ApiGETAnalyticsLiveStreamsLiveStreamIdRequest {
	r.period = &period
	return r
}

// Choose the number of search results to return per page. Minimum value: 1
func (r ApiGETAnalyticsLiveStreamsLiveStreamIdRequest) CurrentPage(currentPage int32) ApiGETAnalyticsLiveStreamsLiveStreamIdRequest {
	r.currentPage = &currentPage
	return r
}

// Results per page. Allowed values 1-100, default is 25.
func (r ApiGETAnalyticsLiveStreamsLiveStreamIdRequest) PageSize(pageSize int32) ApiGETAnalyticsLiveStreamsLiveStreamIdRequest {
	r.pageSize = &pageSize
	return r
}

func (r ApiGETAnalyticsLiveStreamsLiveStreamIdRequest) Execute() (*RawStatisticsListLiveStreamAnalyticsResponse, *http.Response, error) {
	return r.ApiService.GETAnalyticsLiveStreamsLiveStreamIdExecute(r)
}

/*
GETAnalyticsLiveStreamsLiveStreamId List live stream player sessions

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @param liveStreamId The unique identifier for the live stream you want to retrieve analytics for.
 @return ApiGETAnalyticsLiveStreamsLiveStreamIdRequest
*/
func (a *AnalyticsApiService) GETAnalyticsLiveStreamsLiveStreamId(ctx context.Context, liveStreamId string) ApiGETAnalyticsLiveStreamsLiveStreamIdRequest {
	return ApiGETAnalyticsLiveStreamsLiveStreamIdRequest{
		ApiService: a,
		ctx: ctx,
		liveStreamId: liveStreamId,
	}
}

// Execute executes the request
//  @return RawStatisticsListLiveStreamAnalyticsResponse
func (a *AnalyticsApiService) GETAnalyticsLiveStreamsLiveStreamIdExecute(r ApiGETAnalyticsLiveStreamsLiveStreamIdRequest) (*RawStatisticsListLiveStreamAnalyticsResponse, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *RawStatisticsListLiveStreamAnalyticsResponse
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "AnalyticsApiService.GETAnalyticsLiveStreamsLiveStreamId")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/analytics/live-streams/{liveStreamId}"
	localVarPath = strings.Replace(localVarPath, "{"+"liveStreamId"+"}", url.PathEscape(parameterToString(r.liveStreamId, "")), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if r.period != nil {
		localVarQueryParams.Add("period", parameterToString(*r.period, ""))
	}
	if r.currentPage != nil {
		localVarQueryParams.Add("currentPage", parameterToString(*r.currentPage, ""))
	}
	if r.pageSize != nil {
		localVarQueryParams.Add("pageSize", parameterToString(*r.pageSize, ""))
	}
	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = ioutil.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		if localVarHTTPResponse.StatusCode == 404 {
			var v NotFound
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
            		newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
            		newErr.model = v
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}

type ApiGETAnalyticsSessionsSessionIdEventsRequest struct {
	ctx context.Context
	ApiService *AnalyticsApiService
	sessionId string
	currentPage *int32
	pageSize *int32
}

// Choose the number of search results to return per page. Minimum value: 1
func (r ApiGETAnalyticsSessionsSessionIdEventsRequest) CurrentPage(currentPage int32) ApiGETAnalyticsSessionsSessionIdEventsRequest {
	r.currentPage = &currentPage
	return r
}

// Results per page. Allowed values 1-100, default is 25.
func (r ApiGETAnalyticsSessionsSessionIdEventsRequest) PageSize(pageSize int32) ApiGETAnalyticsSessionsSessionIdEventsRequest {
	r.pageSize = &pageSize
	return r
}

func (r ApiGETAnalyticsSessionsSessionIdEventsRequest) Execute() (*RawStatisticsListPlayerSessionEventsResponse, *http.Response, error) {
	return r.ApiService.GETAnalyticsSessionsSessionIdEventsExecute(r)
}

/*
GETAnalyticsSessionsSessionIdEvents List player session events

Useful to track and measure video's engagement.

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @param sessionId A unique identifier you can use to reference and track a session with.
 @return ApiGETAnalyticsSessionsSessionIdEventsRequest
*/
func (a *AnalyticsApiService) GETAnalyticsSessionsSessionIdEvents(ctx context.Context, sessionId string) ApiGETAnalyticsSessionsSessionIdEventsRequest {
	return ApiGETAnalyticsSessionsSessionIdEventsRequest{
		ApiService: a,
		ctx: ctx,
		sessionId: sessionId,
	}
}

// Execute executes the request
//  @return RawStatisticsListPlayerSessionEventsResponse
func (a *AnalyticsApiService) GETAnalyticsSessionsSessionIdEventsExecute(r ApiGETAnalyticsSessionsSessionIdEventsRequest) (*RawStatisticsListPlayerSessionEventsResponse, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *RawStatisticsListPlayerSessionEventsResponse
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "AnalyticsApiService.GETAnalyticsSessionsSessionIdEvents")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/analytics/sessions/{sessionId}/events"
	localVarPath = strings.Replace(localVarPath, "{"+"sessionId"+"}", url.PathEscape(parameterToString(r.sessionId, "")), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if r.currentPage != nil {
		localVarQueryParams.Add("currentPage", parameterToString(*r.currentPage, ""))
	}
	if r.pageSize != nil {
		localVarQueryParams.Add("pageSize", parameterToString(*r.pageSize, ""))
	}
	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = ioutil.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		if localVarHTTPResponse.StatusCode == 404 {
			var v NotFound
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
            		newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
            		newErr.model = v
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}

type ApiGETAnalyticsVideosVideoIdRequest struct {
	ctx context.Context
	ApiService *AnalyticsApiService
	videoId string
	period *string
	metadata *[]string
	currentPage *int32
	pageSize *int32
}

// Period must have one of the following formats:  - For a day : 2018-01-01, - For a week: 2018-W01,  - For a month: 2018-01 - For a year: 2018 For a range period:  -  Date range: 2018-01-01/2018-01-15 
func (r ApiGETAnalyticsVideosVideoIdRequest) Period(period string) ApiGETAnalyticsVideosVideoIdRequest {
	r.period = &period
	return r
}

// Metadata and [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) filter. Send an array of key value pairs you want to filter sessios with.
func (r ApiGETAnalyticsVideosVideoIdRequest) Metadata(metadata []string) ApiGETAnalyticsVideosVideoIdRequest {
	r.metadata = &metadata
	return r
}

// Choose the number of search results to return per page. Minimum value: 1
func (r ApiGETAnalyticsVideosVideoIdRequest) CurrentPage(currentPage int32) ApiGETAnalyticsVideosVideoIdRequest {
	r.currentPage = &currentPage
	return r
}

// Results per page. Allowed values 1-100, default is 25.
func (r ApiGETAnalyticsVideosVideoIdRequest) PageSize(pageSize int32) ApiGETAnalyticsVideosVideoIdRequest {
	r.pageSize = &pageSize
	return r
}

func (r ApiGETAnalyticsVideosVideoIdRequest) Execute() (*RawStatisticsListSessionsResponse, *http.Response, error) {
	return r.ApiService.GETAnalyticsVideosVideoIdExecute(r)
}

/*
GETAnalyticsVideosVideoId List video player sessions

Retrieve all available user sessions for a specific video. Tutorials that use the [analytics endpoint](https://api.video/blog/endpoints/analytics).

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @param videoId The unique identifier for the video you want to retrieve session information for.
 @return ApiGETAnalyticsVideosVideoIdRequest
*/
func (a *AnalyticsApiService) GETAnalyticsVideosVideoId(ctx context.Context, videoId string) ApiGETAnalyticsVideosVideoIdRequest {
	return ApiGETAnalyticsVideosVideoIdRequest{
		ApiService: a,
		ctx: ctx,
		videoId: videoId,
	}
}

// Execute executes the request
//  @return RawStatisticsListSessionsResponse
func (a *AnalyticsApiService) GETAnalyticsVideosVideoIdExecute(r ApiGETAnalyticsVideosVideoIdRequest) (*RawStatisticsListSessionsResponse, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *RawStatisticsListSessionsResponse
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "AnalyticsApiService.GETAnalyticsVideosVideoId")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/analytics/videos/{videoId}"
	localVarPath = strings.Replace(localVarPath, "{"+"videoId"+"}", url.PathEscape(parameterToString(r.videoId, "")), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if r.period != nil {
		localVarQueryParams.Add("period", parameterToString(*r.period, ""))
	}
	if r.metadata != nil {
		t := *r.metadata
		if reflect.TypeOf(t).Kind() == reflect.Slice {
			s := reflect.ValueOf(t)
			for i := 0; i < s.Len(); i++ {
				localVarQueryParams.Add("metadata", parameterToString(s.Index(i), "multi"))
			}
		} else {
			localVarQueryParams.Add("metadata", parameterToString(t, "multi"))
		}
	}
	if r.currentPage != nil {
		localVarQueryParams.Add("currentPage", parameterToString(*r.currentPage, ""))
	}
	if r.pageSize != nil {
		localVarQueryParams.Add("pageSize", parameterToString(*r.pageSize, ""))
	}
	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = ioutil.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		if localVarHTTPResponse.StatusCode == 404 {
			var v NotFound
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
            		newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
            		newErr.model = v
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}
