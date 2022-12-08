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


// ReactionsApiService ReactionsApi service
type ReactionsApiService service

type ApiReactionsAddRequest struct {
	ctx context.Context
	ApiService *ReactionsApiService
	token *string
	channel *string
	name *string
	timestamp *string
}

// Authentication token. Requires scope: &#x60;reactions:write&#x60;
func (r ApiReactionsAddRequest) Token(token string) ApiReactionsAddRequest {
	r.token = &token
	return r
}

// Channel where the message to add reaction to was posted.
func (r ApiReactionsAddRequest) Channel(channel string) ApiReactionsAddRequest {
	r.channel = &channel
	return r
}

// Reaction (emoji) name.
func (r ApiReactionsAddRequest) Name(name string) ApiReactionsAddRequest {
	r.name = &name
	return r
}

// Timestamp of the message to add reaction to.
func (r ApiReactionsAddRequest) Timestamp(timestamp string) ApiReactionsAddRequest {
	r.timestamp = &timestamp
	return r
}

func (r ApiReactionsAddRequest) Execute() (*ReactionsAddSchema, *http.Response, error) {
	return r.ApiService.ReactionsAddExecute(r)
}

/*
ReactionsAdd Method for ReactionsAdd

Adds a reaction to an item.

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiReactionsAddRequest
*/
func (a *ReactionsApiService) ReactionsAdd(ctx context.Context) ApiReactionsAddRequest {
	return ApiReactionsAddRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return ReactionsAddSchema
func (a *ReactionsApiService) ReactionsAddExecute(r ApiReactionsAddRequest) (*ReactionsAddSchema, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodPost
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *ReactionsAddSchema
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "ReactionsApiService.ReactionsAdd")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/reactions.add"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.token == nil {
		return localVarReturnValue, nil, reportError("token is required and must be specified")
	}
	if r.channel == nil {
		return localVarReturnValue, nil, reportError("channel is required and must be specified")
	}
	if r.name == nil {
		return localVarReturnValue, nil, reportError("name is required and must be specified")
	}
	if r.timestamp == nil {
		return localVarReturnValue, nil, reportError("timestamp is required and must be specified")
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
	localVarFormParams.Add("name", parameterToString(*r.name, ""))
	localVarFormParams.Add("timestamp", parameterToString(*r.timestamp, ""))
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
			var v ReactionsAddErrorSchema
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

type ApiReactionsGetRequest struct {
	ctx context.Context
	ApiService *ReactionsApiService
	token *string
	channel *string
	file *string
	fileComment *string
	full *bool
	timestamp *string
}

// Authentication token. Requires scope: &#x60;reactions:read&#x60;
func (r ApiReactionsGetRequest) Token(token string) ApiReactionsGetRequest {
	r.token = &token
	return r
}

// Channel where the message to get reactions for was posted.
func (r ApiReactionsGetRequest) Channel(channel string) ApiReactionsGetRequest {
	r.channel = &channel
	return r
}

// File to get reactions for.
func (r ApiReactionsGetRequest) File(file string) ApiReactionsGetRequest {
	r.file = &file
	return r
}

// File comment to get reactions for.
func (r ApiReactionsGetRequest) FileComment(fileComment string) ApiReactionsGetRequest {
	r.fileComment = &fileComment
	return r
}

// If true always return the complete reaction list.
func (r ApiReactionsGetRequest) Full(full bool) ApiReactionsGetRequest {
	r.full = &full
	return r
}

// Timestamp of the message to get reactions for.
func (r ApiReactionsGetRequest) Timestamp(timestamp string) ApiReactionsGetRequest {
	r.timestamp = &timestamp
	return r
}

func (r ApiReactionsGetRequest) Execute() ([]ReactionsGetSuccessSchemaInner, *http.Response, error) {
	return r.ApiService.ReactionsGetExecute(r)
}

/*
ReactionsGet Method for ReactionsGet

Gets reactions for an item.

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiReactionsGetRequest
*/
func (a *ReactionsApiService) ReactionsGet(ctx context.Context) ApiReactionsGetRequest {
	return ApiReactionsGetRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return []ReactionsGetSuccessSchemaInner
func (a *ReactionsApiService) ReactionsGetExecute(r ApiReactionsGetRequest) ([]ReactionsGetSuccessSchemaInner, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  []ReactionsGetSuccessSchemaInner
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "ReactionsApiService.ReactionsGet")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/reactions.get"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.token == nil {
		return localVarReturnValue, nil, reportError("token is required and must be specified")
	}

	localVarQueryParams.Add("token", parameterToString(*r.token, ""))
	if r.channel != nil {
		localVarQueryParams.Add("channel", parameterToString(*r.channel, ""))
	}
	if r.file != nil {
		localVarQueryParams.Add("file", parameterToString(*r.file, ""))
	}
	if r.fileComment != nil {
		localVarQueryParams.Add("file_comment", parameterToString(*r.fileComment, ""))
	}
	if r.full != nil {
		localVarQueryParams.Add("full", parameterToString(*r.full, ""))
	}
	if r.timestamp != nil {
		localVarQueryParams.Add("timestamp", parameterToString(*r.timestamp, ""))
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
			var v ReactionsGetErrorSchema
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

type ApiReactionsListRequest struct {
	ctx context.Context
	ApiService *ReactionsApiService
	token *string
	user *string
	full *bool
	count *int32
	page *int32
	cursor *string
	limit *int32
}

// Authentication token. Requires scope: &#x60;reactions:read&#x60;
func (r ApiReactionsListRequest) Token(token string) ApiReactionsListRequest {
	r.token = &token
	return r
}

// Show reactions made by this user. Defaults to the authed user.
func (r ApiReactionsListRequest) User(user string) ApiReactionsListRequest {
	r.user = &user
	return r
}

// If true always return the complete reaction list.
func (r ApiReactionsListRequest) Full(full bool) ApiReactionsListRequest {
	r.full = &full
	return r
}

func (r ApiReactionsListRequest) Count(count int32) ApiReactionsListRequest {
	r.count = &count
	return r
}

func (r ApiReactionsListRequest) Page(page int32) ApiReactionsListRequest {
	r.page = &page
	return r
}

// Parameter for pagination. Set &#x60;cursor&#x60; equal to the &#x60;next_cursor&#x60; attribute returned by the previous request&#39;s &#x60;response_metadata&#x60;. This parameter is optional, but pagination is mandatory: the default value simply fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more details.
func (r ApiReactionsListRequest) Cursor(cursor string) ApiReactionsListRequest {
	r.cursor = &cursor
	return r
}

// The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn&#39;t been reached.
func (r ApiReactionsListRequest) Limit(limit int32) ApiReactionsListRequest {
	r.limit = &limit
	return r
}

func (r ApiReactionsListRequest) Execute() (*ReactionsListSchema, *http.Response, error) {
	return r.ApiService.ReactionsListExecute(r)
}

/*
ReactionsList Method for ReactionsList

Lists reactions made by a user.

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiReactionsListRequest
*/
func (a *ReactionsApiService) ReactionsList(ctx context.Context) ApiReactionsListRequest {
	return ApiReactionsListRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return ReactionsListSchema
func (a *ReactionsApiService) ReactionsListExecute(r ApiReactionsListRequest) (*ReactionsListSchema, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *ReactionsListSchema
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "ReactionsApiService.ReactionsList")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/reactions.list"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.token == nil {
		return localVarReturnValue, nil, reportError("token is required and must be specified")
	}

	localVarQueryParams.Add("token", parameterToString(*r.token, ""))
	if r.user != nil {
		localVarQueryParams.Add("user", parameterToString(*r.user, ""))
	}
	if r.full != nil {
		localVarQueryParams.Add("full", parameterToString(*r.full, ""))
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
			var v ReactionsListErrorSchema
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

type ApiReactionsRemoveRequest struct {
	ctx context.Context
	ApiService *ReactionsApiService
	token *string
	name *string
	channel *string
	file *string
	fileComment *string
	timestamp *string
}

// Authentication token. Requires scope: &#x60;reactions:write&#x60;
func (r ApiReactionsRemoveRequest) Token(token string) ApiReactionsRemoveRequest {
	r.token = &token
	return r
}

// Reaction (emoji) name.
func (r ApiReactionsRemoveRequest) Name(name string) ApiReactionsRemoveRequest {
	r.name = &name
	return r
}

// Channel where the message to remove reaction from was posted.
func (r ApiReactionsRemoveRequest) Channel(channel string) ApiReactionsRemoveRequest {
	r.channel = &channel
	return r
}

// File to remove reaction from.
func (r ApiReactionsRemoveRequest) File(file string) ApiReactionsRemoveRequest {
	r.file = &file
	return r
}

// File comment to remove reaction from.
func (r ApiReactionsRemoveRequest) FileComment(fileComment string) ApiReactionsRemoveRequest {
	r.fileComment = &fileComment
	return r
}

// Timestamp of the message to remove reaction from.
func (r ApiReactionsRemoveRequest) Timestamp(timestamp string) ApiReactionsRemoveRequest {
	r.timestamp = &timestamp
	return r
}

func (r ApiReactionsRemoveRequest) Execute() (*ReactionsRemoveSchema, *http.Response, error) {
	return r.ApiService.ReactionsRemoveExecute(r)
}

/*
ReactionsRemove Method for ReactionsRemove

Removes a reaction from an item.

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiReactionsRemoveRequest
*/
func (a *ReactionsApiService) ReactionsRemove(ctx context.Context) ApiReactionsRemoveRequest {
	return ApiReactionsRemoveRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return ReactionsRemoveSchema
func (a *ReactionsApiService) ReactionsRemoveExecute(r ApiReactionsRemoveRequest) (*ReactionsRemoveSchema, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodPost
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *ReactionsRemoveSchema
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "ReactionsApiService.ReactionsRemove")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/reactions.remove"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.token == nil {
		return localVarReturnValue, nil, reportError("token is required and must be specified")
	}
	if r.name == nil {
		return localVarReturnValue, nil, reportError("name is required and must be specified")
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
	localVarFormParams.Add("name", parameterToString(*r.name, ""))
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
			var v ReactionsRemoveErrorSchema
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