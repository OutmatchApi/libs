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


// StarsApiService StarsApi service
type StarsApiService service

type ApiStarsAddRequest struct {
	ctx context.Context
	ApiService *StarsApiService
	token *string
	channel *string
	file *string
	fileComment *string
	timestamp *string
}

// Authentication token. Requires scope: &#x60;stars:write&#x60;
func (r ApiStarsAddRequest) Token(token string) ApiStarsAddRequest {
	r.token = &token
	return r
}

// Channel to add star to, or channel where the message to add star to was posted (used with &#x60;timestamp&#x60;).
func (r ApiStarsAddRequest) Channel(channel string) ApiStarsAddRequest {
	r.channel = &channel
	return r
}

// File to add star to.
func (r ApiStarsAddRequest) File(file string) ApiStarsAddRequest {
	r.file = &file
	return r
}

// File comment to add star to.
func (r ApiStarsAddRequest) FileComment(fileComment string) ApiStarsAddRequest {
	r.fileComment = &fileComment
	return r
}

// Timestamp of the message to add star to.
func (r ApiStarsAddRequest) Timestamp(timestamp string) ApiStarsAddRequest {
	r.timestamp = &timestamp
	return r
}

func (r ApiStarsAddRequest) Execute() (*StarsAddSchema, *http.Response, error) {
	return r.ApiService.StarsAddExecute(r)
}

/*
StarsAdd Method for StarsAdd

Adds a star to an item.

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiStarsAddRequest
*/
func (a *StarsApiService) StarsAdd(ctx context.Context) ApiStarsAddRequest {
	return ApiStarsAddRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return StarsAddSchema
func (a *StarsApiService) StarsAddExecute(r ApiStarsAddRequest) (*StarsAddSchema, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodPost
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *StarsAddSchema
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "StarsApiService.StarsAdd")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/stars.add"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.token == nil {
		return localVarReturnValue, nil, reportError("token is required and must be specified")
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
	if r.channel != nil {
		localVarFormParams.Add("channel", parameterToString(*r.channel, ""))
	}
	if r.file != nil {
		localVarFormParams.Add("file", parameterToString(*r.file, ""))
	}
	if r.fileComment != nil {
		localVarFormParams.Add("file_comment", parameterToString(*r.fileComment, ""))
	}
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
			var v StarsAddErrorSchema
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

type ApiStarsListRequest struct {
	ctx context.Context
	ApiService *StarsApiService
	token *string
	count *string
	page *string
	cursor *string
	limit *int32
}

// Authentication token. Requires scope: &#x60;stars:read&#x60;
func (r ApiStarsListRequest) Token(token string) ApiStarsListRequest {
	r.token = &token
	return r
}

func (r ApiStarsListRequest) Count(count string) ApiStarsListRequest {
	r.count = &count
	return r
}

func (r ApiStarsListRequest) Page(page string) ApiStarsListRequest {
	r.page = &page
	return r
}

// Parameter for pagination. Set &#x60;cursor&#x60; equal to the &#x60;next_cursor&#x60; attribute returned by the previous request&#39;s &#x60;response_metadata&#x60;. This parameter is optional, but pagination is mandatory: the default value simply fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more details.
func (r ApiStarsListRequest) Cursor(cursor string) ApiStarsListRequest {
	r.cursor = &cursor
	return r
}

// The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn&#39;t been reached.
func (r ApiStarsListRequest) Limit(limit int32) ApiStarsListRequest {
	r.limit = &limit
	return r
}

func (r ApiStarsListRequest) Execute() (*StarsListSchema, *http.Response, error) {
	return r.ApiService.StarsListExecute(r)
}

/*
StarsList Method for StarsList

Lists stars for a user.

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiStarsListRequest
*/
func (a *StarsApiService) StarsList(ctx context.Context) ApiStarsListRequest {
	return ApiStarsListRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return StarsListSchema
func (a *StarsApiService) StarsListExecute(r ApiStarsListRequest) (*StarsListSchema, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *StarsListSchema
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "StarsApiService.StarsList")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/stars.list"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if r.token != nil {
		localVarQueryParams.Add("token", parameterToString(*r.token, ""))
	}
	if r.count != nil {
		localVarQueryParams.Add("count", parameterToString(*r.count, ""))
	}
	if r.page != nil {
		localVarQueryParams.Add("page", parameterToString(*r.page, ""))
	}
	if r.cursor != nil {
		localVarQueryParams.Add("cursor", parameterToString(*r.cursor, ""))
	}
	if r.limit != nil {
		localVarQueryParams.Add("limit", parameterToString(*r.limit, ""))
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
			var v StarsListErrorSchema
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

type ApiStarsRemoveRequest struct {
	ctx context.Context
	ApiService *StarsApiService
	token *string
	channel *string
	file *string
	fileComment *string
	timestamp *string
}

// Authentication token. Requires scope: &#x60;stars:write&#x60;
func (r ApiStarsRemoveRequest) Token(token string) ApiStarsRemoveRequest {
	r.token = &token
	return r
}

// Channel to remove star from, or channel where the message to remove star from was posted (used with &#x60;timestamp&#x60;).
func (r ApiStarsRemoveRequest) Channel(channel string) ApiStarsRemoveRequest {
	r.channel = &channel
	return r
}

// File to remove star from.
func (r ApiStarsRemoveRequest) File(file string) ApiStarsRemoveRequest {
	r.file = &file
	return r
}

// File comment to remove star from.
func (r ApiStarsRemoveRequest) FileComment(fileComment string) ApiStarsRemoveRequest {
	r.fileComment = &fileComment
	return r
}

// Timestamp of the message to remove star from.
func (r ApiStarsRemoveRequest) Timestamp(timestamp string) ApiStarsRemoveRequest {
	r.timestamp = &timestamp
	return r
}

func (r ApiStarsRemoveRequest) Execute() (*StarsRemoveSchema, *http.Response, error) {
	return r.ApiService.StarsRemoveExecute(r)
}

/*
StarsRemove Method for StarsRemove

Removes a star from an item.

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiStarsRemoveRequest
*/
func (a *StarsApiService) StarsRemove(ctx context.Context) ApiStarsRemoveRequest {
	return ApiStarsRemoveRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return StarsRemoveSchema
func (a *StarsApiService) StarsRemoveExecute(r ApiStarsRemoveRequest) (*StarsRemoveSchema, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodPost
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *StarsRemoveSchema
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "StarsApiService.StarsRemove")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/stars.remove"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.token == nil {
		return localVarReturnValue, nil, reportError("token is required and must be specified")
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
	if r.channel != nil {
		localVarFormParams.Add("channel", parameterToString(*r.channel, ""))
	}
	if r.file != nil {
		localVarFormParams.Add("file", parameterToString(*r.file, ""))
	}
	if r.fileComment != nil {
		localVarFormParams.Add("file_comment", parameterToString(*r.fileComment, ""))
	}
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
			var v StarsRemoveErrorSchema
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