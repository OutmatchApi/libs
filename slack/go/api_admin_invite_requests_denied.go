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


// AdminInviteRequestsDeniedApiService AdminInviteRequestsDeniedApi service
type AdminInviteRequestsDeniedApiService service

type ApiAdminInviteRequestsDeniedListRequest struct {
	ctx context.Context
	ApiService *AdminInviteRequestsDeniedApiService
	token *string
	teamId *string
	cursor *string
	limit *int32
}

// Authentication token. Requires scope: &#x60;admin.invites:read&#x60;
func (r ApiAdminInviteRequestsDeniedListRequest) Token(token string) ApiAdminInviteRequestsDeniedListRequest {
	r.token = &token
	return r
}

// ID for the workspace where the invite requests were made.
func (r ApiAdminInviteRequestsDeniedListRequest) TeamId(teamId string) ApiAdminInviteRequestsDeniedListRequest {
	r.teamId = &teamId
	return r
}

// Value of the &#x60;next_cursor&#x60; field sent as part of the previous api response
func (r ApiAdminInviteRequestsDeniedListRequest) Cursor(cursor string) ApiAdminInviteRequestsDeniedListRequest {
	r.cursor = &cursor
	return r
}

// The number of results that will be returned by the API on each invocation. Must be between 1 - 1000 both inclusive
func (r ApiAdminInviteRequestsDeniedListRequest) Limit(limit int32) ApiAdminInviteRequestsDeniedListRequest {
	r.limit = &limit
	return r
}

func (r ApiAdminInviteRequestsDeniedListRequest) Execute() (*DefaultSuccessTemplate, *http.Response, error) {
	return r.ApiService.AdminInviteRequestsDeniedListExecute(r)
}

/*
AdminInviteRequestsDeniedList Method for AdminInviteRequestsDeniedList

List all denied workspace invite requests.

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiAdminInviteRequestsDeniedListRequest
*/
func (a *AdminInviteRequestsDeniedApiService) AdminInviteRequestsDeniedList(ctx context.Context) ApiAdminInviteRequestsDeniedListRequest {
	return ApiAdminInviteRequestsDeniedListRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return DefaultSuccessTemplate
func (a *AdminInviteRequestsDeniedApiService) AdminInviteRequestsDeniedListExecute(r ApiAdminInviteRequestsDeniedListRequest) (*DefaultSuccessTemplate, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *DefaultSuccessTemplate
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "AdminInviteRequestsDeniedApiService.AdminInviteRequestsDeniedList")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/admin.inviteRequests.denied.list"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.token == nil {
		return localVarReturnValue, nil, reportError("token is required and must be specified")
	}

	if r.teamId != nil {
		localVarQueryParams.Add("team_id", parameterToString(*r.teamId, ""))
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
