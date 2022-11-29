/*
Outmatch API

Outmatch API

API version: 0.0.43
Contact: internal@outmatchapi.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package api

import (
	"bytes"
	"context"
	"io/ioutil"
	"net/http"
	"net/url"
	"strings"
)


// ApiAppApiService ApiAppApi service
type ApiAppApiService service

type ApiCreateApiAppRequest struct {
	ctx context.Context
	ApiService *ApiAppApiService
	createApiAppRequest *CreateApiAppRequest
}

func (r ApiCreateApiAppRequest) CreateApiAppRequest(createApiAppRequest CreateApiAppRequest) ApiCreateApiAppRequest {
	r.createApiAppRequest = &createApiAppRequest
	return r
}

func (r ApiCreateApiAppRequest) Execute() (*ApiApp, *http.Response, error) {
	return r.ApiService.CreateApiAppExecute(r)
}

/*
CreateApiApp Create api app

Create an api app for the authenticated user

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiCreateApiAppRequest
*/
func (a *ApiAppApiService) CreateApiApp(ctx context.Context) ApiCreateApiAppRequest {
	return ApiCreateApiAppRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return ApiApp
func (a *ApiAppApiService) CreateApiAppExecute(r ApiCreateApiAppRequest) (*ApiApp, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodPost
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *ApiApp
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "ApiAppApiService.CreateApiApp")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/apiApp"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{"application/json"}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json", "application/xml"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	// body params
	localVarPostBody = r.createApiAppRequest
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
		if localVarHTTPResponse.StatusCode >= 400 && localVarHTTPResponse.StatusCode < 500 {
			var v Error
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

type ApiCreateApiAppReleaseRequest struct {
	ctx context.Context
	ApiService *ApiAppApiService
	appId string
	body *string
}

// Created release object
func (r ApiCreateApiAppReleaseRequest) Body(body string) ApiCreateApiAppReleaseRequest {
	r.body = &body
	return r
}

func (r ApiCreateApiAppReleaseRequest) Execute() (*Release, *http.Response, error) {
	return r.ApiService.CreateApiAppReleaseExecute(r)
}

/*
CreateApiAppRelease Create api app release

Create an api app release

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @param appId app id to associate the release with
 @return ApiCreateApiAppReleaseRequest
*/
func (a *ApiAppApiService) CreateApiAppRelease(ctx context.Context, appId string) ApiCreateApiAppReleaseRequest {
	return ApiCreateApiAppReleaseRequest{
		ApiService: a,
		ctx: ctx,
		appId: appId,
	}
}

// Execute executes the request
//  @return Release
func (a *ApiAppApiService) CreateApiAppReleaseExecute(r ApiCreateApiAppReleaseRequest) (*Release, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodPost
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *Release
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "ApiAppApiService.CreateApiAppRelease")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/apiApp/{app_id}/release"
	localVarPath = strings.Replace(localVarPath, "{"+"app_id"+"}", url.PathEscape(parameterToString(r.appId, "")), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{"text/plain"}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json", "application/xml"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	// body params
	localVarPostBody = r.body
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

type ApiCreateApiAppReleaseSdksRequest struct {
	ctx context.Context
	ApiService *ApiAppApiService
	appId string
	releaseVersion string
	createApiAppReleaseSdksRequest *CreateApiAppReleaseSdksRequest
}

func (r ApiCreateApiAppReleaseSdksRequest) CreateApiAppReleaseSdksRequest(createApiAppReleaseSdksRequest CreateApiAppReleaseSdksRequest) ApiCreateApiAppReleaseSdksRequest {
	r.createApiAppReleaseSdksRequest = &createApiAppReleaseSdksRequest
	return r
}

func (r ApiCreateApiAppReleaseSdksRequest) Execute() ([]Sdk, *http.Response, error) {
	return r.ApiService.CreateApiAppReleaseSdksExecute(r)
}

/*
CreateApiAppReleaseSdks Generate sdks for a relase

Generate sdks for a relase

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @param appId app id
 @param releaseVersion release id
 @return ApiCreateApiAppReleaseSdksRequest
*/
func (a *ApiAppApiService) CreateApiAppReleaseSdks(ctx context.Context, appId string, releaseVersion string) ApiCreateApiAppReleaseSdksRequest {
	return ApiCreateApiAppReleaseSdksRequest{
		ApiService: a,
		ctx: ctx,
		appId: appId,
		releaseVersion: releaseVersion,
	}
}

// Execute executes the request
//  @return []Sdk
func (a *ApiAppApiService) CreateApiAppReleaseSdksExecute(r ApiCreateApiAppReleaseSdksRequest) ([]Sdk, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodPost
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  []Sdk
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "ApiAppApiService.CreateApiAppReleaseSdks")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/apiApp/{app_id}/release/{release_version}/sdk"
	localVarPath = strings.Replace(localVarPath, "{"+"app_id"+"}", url.PathEscape(parameterToString(r.appId, "")), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"release_version"+"}", url.PathEscape(parameterToString(r.releaseVersion, "")), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{"application/json"}

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
	// body params
	localVarPostBody = r.createApiAppReleaseSdksRequest
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
