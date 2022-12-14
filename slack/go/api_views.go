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


// ViewsApiService ViewsApi service
type ViewsApiService service

type ApiViewsOpenRequest struct {
	ctx context.Context
	ApiService *ViewsApiService
	token *string
	triggerId *string
	view *string
}

// Authentication token. Requires scope: &#x60;none&#x60;
func (r ApiViewsOpenRequest) Token(token string) ApiViewsOpenRequest {
	r.token = &token
	return r
}

// Exchange a trigger to post to the user.
func (r ApiViewsOpenRequest) TriggerId(triggerId string) ApiViewsOpenRequest {
	r.triggerId = &triggerId
	return r
}

// A [view payload](/reference/surfaces/views). This must be a JSON-encoded string.
func (r ApiViewsOpenRequest) View(view string) ApiViewsOpenRequest {
	r.view = &view
	return r
}

func (r ApiViewsOpenRequest) Execute() (*DefaultSuccessTemplate, *http.Response, error) {
	return r.ApiService.ViewsOpenExecute(r)
}

/*
ViewsOpen Method for ViewsOpen

Open a view for a user.

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiViewsOpenRequest
*/
func (a *ViewsApiService) ViewsOpen(ctx context.Context) ApiViewsOpenRequest {
	return ApiViewsOpenRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return DefaultSuccessTemplate
func (a *ViewsApiService) ViewsOpenExecute(r ApiViewsOpenRequest) (*DefaultSuccessTemplate, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *DefaultSuccessTemplate
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "ViewsApiService.ViewsOpen")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/views.open"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.token == nil {
		return localVarReturnValue, nil, reportError("token is required and must be specified")
	}
	if r.triggerId == nil {
		return localVarReturnValue, nil, reportError("triggerId is required and must be specified")
	}
	if r.view == nil {
		return localVarReturnValue, nil, reportError("view is required and must be specified")
	}

	localVarQueryParams.Add("trigger_id", parameterToString(*r.triggerId, ""))
	localVarQueryParams.Add("view", parameterToString(*r.view, ""))
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
	localVarHeaderParams["token"] = parameterToString(*r.token, "")
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
			var v DefaultErrorTemplate
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

type ApiViewsPublishRequest struct {
	ctx context.Context
	ApiService *ViewsApiService
	token *string
	userId *string
	view *string
	hash *string
}

// Authentication token. Requires scope: &#x60;none&#x60;
func (r ApiViewsPublishRequest) Token(token string) ApiViewsPublishRequest {
	r.token = &token
	return r
}

// &#x60;id&#x60; of the user you want publish a view to.
func (r ApiViewsPublishRequest) UserId(userId string) ApiViewsPublishRequest {
	r.userId = &userId
	return r
}

// A [view payload](/reference/surfaces/views). This must be a JSON-encoded string.
func (r ApiViewsPublishRequest) View(view string) ApiViewsPublishRequest {
	r.view = &view
	return r
}

// A string that represents view state to protect against possible race conditions.
func (r ApiViewsPublishRequest) Hash(hash string) ApiViewsPublishRequest {
	r.hash = &hash
	return r
}

func (r ApiViewsPublishRequest) Execute() (*DefaultSuccessTemplate, *http.Response, error) {
	return r.ApiService.ViewsPublishExecute(r)
}

/*
ViewsPublish Method for ViewsPublish

Publish a static view for a User.

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiViewsPublishRequest
*/
func (a *ViewsApiService) ViewsPublish(ctx context.Context) ApiViewsPublishRequest {
	return ApiViewsPublishRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return DefaultSuccessTemplate
func (a *ViewsApiService) ViewsPublishExecute(r ApiViewsPublishRequest) (*DefaultSuccessTemplate, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *DefaultSuccessTemplate
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "ViewsApiService.ViewsPublish")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/views.publish"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.token == nil {
		return localVarReturnValue, nil, reportError("token is required and must be specified")
	}
	if r.userId == nil {
		return localVarReturnValue, nil, reportError("userId is required and must be specified")
	}
	if r.view == nil {
		return localVarReturnValue, nil, reportError("view is required and must be specified")
	}

	localVarQueryParams.Add("user_id", parameterToString(*r.userId, ""))
	localVarQueryParams.Add("view", parameterToString(*r.view, ""))
	if r.hash != nil {
		localVarQueryParams.Add("hash", parameterToString(*r.hash, ""))
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
	localVarHeaderParams["token"] = parameterToString(*r.token, "")
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
			var v DefaultErrorTemplate
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

type ApiViewsPushRequest struct {
	ctx context.Context
	ApiService *ViewsApiService
	token *string
	triggerId *string
	view *string
}

// Authentication token. Requires scope: &#x60;none&#x60;
func (r ApiViewsPushRequest) Token(token string) ApiViewsPushRequest {
	r.token = &token
	return r
}

// Exchange a trigger to post to the user.
func (r ApiViewsPushRequest) TriggerId(triggerId string) ApiViewsPushRequest {
	r.triggerId = &triggerId
	return r
}

// A [view payload](/reference/surfaces/views). This must be a JSON-encoded string.
func (r ApiViewsPushRequest) View(view string) ApiViewsPushRequest {
	r.view = &view
	return r
}

func (r ApiViewsPushRequest) Execute() (*DefaultSuccessTemplate, *http.Response, error) {
	return r.ApiService.ViewsPushExecute(r)
}

/*
ViewsPush Method for ViewsPush

Push a view onto the stack of a root view.

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiViewsPushRequest
*/
func (a *ViewsApiService) ViewsPush(ctx context.Context) ApiViewsPushRequest {
	return ApiViewsPushRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return DefaultSuccessTemplate
func (a *ViewsApiService) ViewsPushExecute(r ApiViewsPushRequest) (*DefaultSuccessTemplate, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *DefaultSuccessTemplate
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "ViewsApiService.ViewsPush")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/views.push"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.token == nil {
		return localVarReturnValue, nil, reportError("token is required and must be specified")
	}
	if r.triggerId == nil {
		return localVarReturnValue, nil, reportError("triggerId is required and must be specified")
	}
	if r.view == nil {
		return localVarReturnValue, nil, reportError("view is required and must be specified")
	}

	localVarQueryParams.Add("trigger_id", parameterToString(*r.triggerId, ""))
	localVarQueryParams.Add("view", parameterToString(*r.view, ""))
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
	localVarHeaderParams["token"] = parameterToString(*r.token, "")
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
			var v DefaultErrorTemplate
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

type ApiViewsUpdateRequest struct {
	ctx context.Context
	ApiService *ViewsApiService
	token *string
	viewId *string
	externalId *string
	view *string
	hash *string
}

// Authentication token. Requires scope: &#x60;none&#x60;
func (r ApiViewsUpdateRequest) Token(token string) ApiViewsUpdateRequest {
	r.token = &token
	return r
}

// A unique identifier of the view to be updated. Either &#x60;view_id&#x60; or &#x60;external_id&#x60; is required.
func (r ApiViewsUpdateRequest) ViewId(viewId string) ApiViewsUpdateRequest {
	r.viewId = &viewId
	return r
}

// A unique identifier of the view set by the developer. Must be unique for all views on a team. Max length of 255 characters. Either &#x60;view_id&#x60; or &#x60;external_id&#x60; is required.
func (r ApiViewsUpdateRequest) ExternalId(externalId string) ApiViewsUpdateRequest {
	r.externalId = &externalId
	return r
}

// A [view object](/reference/surfaces/views). This must be a JSON-encoded string.
func (r ApiViewsUpdateRequest) View(view string) ApiViewsUpdateRequest {
	r.view = &view
	return r
}

// A string that represents view state to protect against possible race conditions.
func (r ApiViewsUpdateRequest) Hash(hash string) ApiViewsUpdateRequest {
	r.hash = &hash
	return r
}

func (r ApiViewsUpdateRequest) Execute() (*DefaultSuccessTemplate, *http.Response, error) {
	return r.ApiService.ViewsUpdateExecute(r)
}

/*
ViewsUpdate Method for ViewsUpdate

Update an existing view.

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiViewsUpdateRequest
*/
func (a *ViewsApiService) ViewsUpdate(ctx context.Context) ApiViewsUpdateRequest {
	return ApiViewsUpdateRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return DefaultSuccessTemplate
func (a *ViewsApiService) ViewsUpdateExecute(r ApiViewsUpdateRequest) (*DefaultSuccessTemplate, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *DefaultSuccessTemplate
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "ViewsApiService.ViewsUpdate")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/views.update"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.token == nil {
		return localVarReturnValue, nil, reportError("token is required and must be specified")
	}

	if r.viewId != nil {
		localVarQueryParams.Add("view_id", parameterToString(*r.viewId, ""))
	}
	if r.externalId != nil {
		localVarQueryParams.Add("external_id", parameterToString(*r.externalId, ""))
	}
	if r.view != nil {
		localVarQueryParams.Add("view", parameterToString(*r.view, ""))
	}
	if r.hash != nil {
		localVarQueryParams.Add("hash", parameterToString(*r.hash, ""))
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
	localVarHeaderParams["token"] = parameterToString(*r.token, "")
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
			var v DefaultErrorTemplate
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
