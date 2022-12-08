/*
Slack Web API

One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.

API version: 1.7.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package slack

import (
	"bytes"
	"context"
	"io/ioutil"
	"net/http"
	"net/url"
)


// PinsApiService PinsApi service
type PinsApiService service

type ApiPinsAddRequest struct {
	ctx context.Context
	ApiService *PinsApiService
	token *string
	channel *string
	timestamp *string
}

// Authentication token. Requires scope: &#x60;pins:write&#x60;
func (r ApiPinsAddRequest) Token(token string) ApiPinsAddRequest {
	r.token = &token
	return r
}

// Channel to pin the item in.
func (r ApiPinsAddRequest) Channel(channel string) ApiPinsAddRequest {
	r.channel = &channel
	return r
}

// Timestamp of the message to pin.
func (r ApiPinsAddRequest) Timestamp(timestamp string) ApiPinsAddRequest {
	r.timestamp = &timestamp
	return r
}

func (r ApiPinsAddRequest) Execute() (*PinsAddSchema, *http.Response, error) {
	return r.ApiService.PinsAddExecute(r)
}

/*
PinsAdd Method for PinsAdd

Pins an item to a channel.

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiPinsAddRequest
*/
func (a *PinsApiService) PinsAdd(ctx context.Context) ApiPinsAddRequest {
	return ApiPinsAddRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return PinsAddSchema
func (a *PinsApiService) PinsAddExecute(r ApiPinsAddRequest) (*PinsAddSchema, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodPost
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *PinsAddSchema
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "PinsApiService.PinsAdd")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/pins.add"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.token == nil {
		return localVarReturnValue, nil, reportError("token is required and must be specified")
	}
	if r.channel == nil {
		return localVarReturnValue, nil, reportError("channel is required and must be specified")
	}

	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{"application/x-www-form-urlencoded"}

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
	localVarHeaderParams["token"] = parameterToString(*r.token, "")
	localVarFormParams.Add("channel", parameterToString(*r.channel, ""))
	if r.timestamp != nil {
		localVarFormParams.Add("timestamp", parameterToString(*r.timestamp, ""))
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
			var v PinsAddErrorSchema
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
            		newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
            		newErr.model = v
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

type ApiPinsListRequest struct {
	ctx context.Context
	ApiService *PinsApiService
	token *string
	channel *string
}

// Authentication token. Requires scope: &#x60;pins:read&#x60;
func (r ApiPinsListRequest) Token(token string) ApiPinsListRequest {
	r.token = &token
	return r
}

// Channel to get pinned items for.
func (r ApiPinsListRequest) Channel(channel string) ApiPinsListRequest {
	r.channel = &channel
	return r
}

func (r ApiPinsListRequest) Execute() ([]PinsListSuccessSchemaInner, *http.Response, error) {
	return r.ApiService.PinsListExecute(r)
}

/*
PinsList Method for PinsList

Lists items pinned to a channel.

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiPinsListRequest
*/
func (a *PinsApiService) PinsList(ctx context.Context) ApiPinsListRequest {
	return ApiPinsListRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return []PinsListSuccessSchemaInner
func (a *PinsApiService) PinsListExecute(r ApiPinsListRequest) ([]PinsListSuccessSchemaInner, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  []PinsListSuccessSchemaInner
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "PinsApiService.PinsList")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/pins.list"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.token == nil {
		return localVarReturnValue, nil, reportError("token is required and must be specified")
	}
	if r.channel == nil {
		return localVarReturnValue, nil, reportError("channel is required and must be specified")
	}

	localVarQueryParams.Add("token", parameterToString(*r.token, ""))
	localVarQueryParams.Add("channel", parameterToString(*r.channel, ""))
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
			var v PinsListErrorSchema
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
            		newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
            		newErr.model = v
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

type ApiPinsRemoveRequest struct {
	ctx context.Context
	ApiService *PinsApiService
	token *string
	channel *string
	timestamp *string
}

// Authentication token. Requires scope: &#x60;pins:write&#x60;
func (r ApiPinsRemoveRequest) Token(token string) ApiPinsRemoveRequest {
	r.token = &token
	return r
}

// Channel where the item is pinned to.
func (r ApiPinsRemoveRequest) Channel(channel string) ApiPinsRemoveRequest {
	r.channel = &channel
	return r
}

// Timestamp of the message to un-pin.
func (r ApiPinsRemoveRequest) Timestamp(timestamp string) ApiPinsRemoveRequest {
	r.timestamp = &timestamp
	return r
}

func (r ApiPinsRemoveRequest) Execute() (*PinsRemoveSchema, *http.Response, error) {
	return r.ApiService.PinsRemoveExecute(r)
}

/*
PinsRemove Method for PinsRemove

Un-pins an item from a channel.

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiPinsRemoveRequest
*/
func (a *PinsApiService) PinsRemove(ctx context.Context) ApiPinsRemoveRequest {
	return ApiPinsRemoveRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return PinsRemoveSchema
func (a *PinsApiService) PinsRemoveExecute(r ApiPinsRemoveRequest) (*PinsRemoveSchema, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodPost
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *PinsRemoveSchema
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "PinsApiService.PinsRemove")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/pins.remove"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.token == nil {
		return localVarReturnValue, nil, reportError("token is required and must be specified")
	}
	if r.channel == nil {
		return localVarReturnValue, nil, reportError("channel is required and must be specified")
	}

	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{"application/x-www-form-urlencoded"}

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
	localVarHeaderParams["token"] = parameterToString(*r.token, "")
	localVarFormParams.Add("channel", parameterToString(*r.channel, ""))
	if r.timestamp != nil {
		localVarFormParams.Add("timestamp", parameterToString(*r.timestamp, ""))
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
			var v PinsRemoveErrorSchema
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
            		newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
            		newErr.model = v
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
