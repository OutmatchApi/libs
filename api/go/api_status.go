/*
Outmatch API

Outmatch API

API version: 0.0.37
Contact: internal@outmatchapi.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"bytes"
	"context"
	"io/ioutil"
	"net/http"
	"net/url"
)


// StatusApiService StatusApi service
type StatusApiService service

type ApiGetStatusRequest struct {
	ctx context.Context
	ApiService *StatusApiService
}

func (r ApiGetStatusRequest) Execute() (*http.Response, error) {
	return r.ApiService.GetStatusExecute(r)
}

/*
GetStatus Method for GetStatus

Check the API status

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiGetStatusRequest
*/
func (a *StatusApiService) GetStatus(ctx context.Context) ApiGetStatusRequest {
	return ApiGetStatusRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
func (a *StatusApiService) GetStatusExecute(r ApiGetStatusRequest) (*http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "StatusApiService.GetStatus")
	if err != nil {
		return nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/status"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarHTTPResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = ioutil.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		return localVarHTTPResponse, newErr
	}

	return localVarHTTPResponse, nil
}
