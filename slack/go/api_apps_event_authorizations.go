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


// AppsEventAuthorizationsApiService AppsEventAuthorizationsApi service
type AppsEventAuthorizationsApiService service

type ApiAppsEventAuthorizationsListRequest struct {
	ctx context.Context
	ApiService *AppsEventAuthorizationsApiService
	token *string
	eventContext *string
	cursor *string
	limit *int32
}

// Authentication token. Requires scope: &#x60;authorizations:read&#x60;
func (r ApiAppsEventAuthorizationsListRequest) Token(token string) ApiAppsEventAuthorizationsListRequest {
	r.token = &token
	return r
}

func (r ApiAppsEventAuthorizationsListRequest) EventContext(eventContext string) ApiAppsEventAuthorizationsListRequest {
	r.eventContext = &eventContext
	return r
}

func (r ApiAppsEventAuthorizationsListRequest) Cursor(cursor string) ApiAppsEventAuthorizationsListRequest {
	r.cursor = &cursor
	return r
}

func (r ApiAppsEventAuthorizationsListRequest) Limit(limit int32) ApiAppsEventAuthorizationsListRequest {
	r.limit = &limit
	return r
}

func (r ApiAppsEventAuthorizationsListRequest) Execute() (*DefaultSuccessTemplate, *http.Response, error) {
	return r.ApiService.AppsEventAuthorizationsListExecute(r)
}

/*
AppsEventAuthorizationsList Method for AppsEventAuthorizationsList

Get a list of authorizations for the given event context. Each authorization represents an app installation that the event is visible to.

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiAppsEventAuthorizationsListRequest
*/
func (a *AppsEventAuthorizationsApiService) AppsEventAuthorizationsList(ctx context.Context) ApiAppsEventAuthorizationsListRequest {
	return ApiAppsEventAuthorizationsListRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return DefaultSuccessTemplate
func (a *AppsEventAuthorizationsApiService) AppsEventAuthorizationsListExecute(r ApiAppsEventAuthorizationsListRequest) (*DefaultSuccessTemplate, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *DefaultSuccessTemplate
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "AppsEventAuthorizationsApiService.AppsEventAuthorizationsList")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/apps.event.authorizations.list"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.token == nil {
		return localVarReturnValue, nil, reportError("token is required and must be specified")
	}
	if r.eventContext == nil {
		return localVarReturnValue, nil, reportError("eventContext is required and must be specified")
	}

	localVarQueryParams.Add("event_context", parameterToString(*r.eventContext, ""))
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