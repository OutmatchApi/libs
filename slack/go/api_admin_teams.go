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


// AdminTeamsApiService AdminTeamsApi service
type AdminTeamsApiService service

type ApiAdminTeamsCreateRequest struct {
	ctx context.Context
	ApiService *AdminTeamsApiService
	token *string
	teamDomain *string
	teamName *string
	teamDescription *string
	teamDiscoverability *string
}

// Authentication token. Requires scope: &#x60;admin.teams:write&#x60;
func (r ApiAdminTeamsCreateRequest) Token(token string) ApiAdminTeamsCreateRequest {
	r.token = &token
	return r
}

// Team domain (for example, slacksoftballteam).
func (r ApiAdminTeamsCreateRequest) TeamDomain(teamDomain string) ApiAdminTeamsCreateRequest {
	r.teamDomain = &teamDomain
	return r
}

// Team name (for example, Slack Softball Team).
func (r ApiAdminTeamsCreateRequest) TeamName(teamName string) ApiAdminTeamsCreateRequest {
	r.teamName = &teamName
	return r
}

// Description for the team.
func (r ApiAdminTeamsCreateRequest) TeamDescription(teamDescription string) ApiAdminTeamsCreateRequest {
	r.teamDescription = &teamDescription
	return r
}

// Who can join the team. A team&#39;s discoverability can be &#x60;open&#x60;, &#x60;closed&#x60;, &#x60;invite_only&#x60;, or &#x60;unlisted&#x60;.
func (r ApiAdminTeamsCreateRequest) TeamDiscoverability(teamDiscoverability string) ApiAdminTeamsCreateRequest {
	r.teamDiscoverability = &teamDiscoverability
	return r
}

func (r ApiAdminTeamsCreateRequest) Execute() (*DefaultSuccessTemplate, *http.Response, error) {
	return r.ApiService.AdminTeamsCreateExecute(r)
}

/*
AdminTeamsCreate Method for AdminTeamsCreate

Create an Enterprise team.

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiAdminTeamsCreateRequest
*/
func (a *AdminTeamsApiService) AdminTeamsCreate(ctx context.Context) ApiAdminTeamsCreateRequest {
	return ApiAdminTeamsCreateRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return DefaultSuccessTemplate
func (a *AdminTeamsApiService) AdminTeamsCreateExecute(r ApiAdminTeamsCreateRequest) (*DefaultSuccessTemplate, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodPost
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *DefaultSuccessTemplate
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "AdminTeamsApiService.AdminTeamsCreate")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/admin.teams.create"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.token == nil {
		return localVarReturnValue, nil, reportError("token is required and must be specified")
	}
	if r.teamDomain == nil {
		return localVarReturnValue, nil, reportError("teamDomain is required and must be specified")
	}
	if r.teamName == nil {
		return localVarReturnValue, nil, reportError("teamName is required and must be specified")
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
	if r.teamDescription != nil {
		localVarFormParams.Add("team_description", parameterToString(*r.teamDescription, ""))
	}
	if r.teamDiscoverability != nil {
		localVarFormParams.Add("team_discoverability", parameterToString(*r.teamDiscoverability, ""))
	}
	localVarFormParams.Add("team_domain", parameterToString(*r.teamDomain, ""))
	localVarFormParams.Add("team_name", parameterToString(*r.teamName, ""))
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

type ApiAdminTeamsListRequest struct {
	ctx context.Context
	ApiService *AdminTeamsApiService
	token *string
	limit *int32
	cursor *string
}

// Authentication token. Requires scope: &#x60;admin.teams:read&#x60;
func (r ApiAdminTeamsListRequest) Token(token string) ApiAdminTeamsListRequest {
	r.token = &token
	return r
}

// The maximum number of items to return. Must be between 1 - 100 both inclusive.
func (r ApiAdminTeamsListRequest) Limit(limit int32) ApiAdminTeamsListRequest {
	r.limit = &limit
	return r
}

// Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page.
func (r ApiAdminTeamsListRequest) Cursor(cursor string) ApiAdminTeamsListRequest {
	r.cursor = &cursor
	return r
}

func (r ApiAdminTeamsListRequest) Execute() (*DefaultSuccessTemplate, *http.Response, error) {
	return r.ApiService.AdminTeamsListExecute(r)
}

/*
AdminTeamsList Method for AdminTeamsList

List all teams on an Enterprise organization

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiAdminTeamsListRequest
*/
func (a *AdminTeamsApiService) AdminTeamsList(ctx context.Context) ApiAdminTeamsListRequest {
	return ApiAdminTeamsListRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return DefaultSuccessTemplate
func (a *AdminTeamsApiService) AdminTeamsListExecute(r ApiAdminTeamsListRequest) (*DefaultSuccessTemplate, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *DefaultSuccessTemplate
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "AdminTeamsApiService.AdminTeamsList")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/admin.teams.list"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.token == nil {
		return localVarReturnValue, nil, reportError("token is required and must be specified")
	}

	if r.limit != nil {
		localVarQueryParams.Add("limit", parameterToString(*r.limit, ""))
	}
	if r.cursor != nil {
		localVarQueryParams.Add("cursor", parameterToString(*r.cursor, ""))
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
