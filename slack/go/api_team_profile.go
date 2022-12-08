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


// TeamProfileApiService TeamProfileApi service
type TeamProfileApiService service

type ApiTeamProfileGetRequest struct {
	ctx context.Context
	ApiService *TeamProfileApiService
	token *string
	visibility *string
}

// Authentication token. Requires scope: &#x60;users.profile:read&#x60;
func (r ApiTeamProfileGetRequest) Token(token string) ApiTeamProfileGetRequest {
	r.token = &token
	return r
}

// Filter by visibility.
func (r ApiTeamProfileGetRequest) Visibility(visibility string) ApiTeamProfileGetRequest {
	r.visibility = &visibility
	return r
}

func (r ApiTeamProfileGetRequest) Execute() (*TeamProfileGetSuccessSchema, *http.Response, error) {
	return r.ApiService.TeamProfileGetExecute(r)
}

/*
TeamProfileGet Method for TeamProfileGet

Retrieve a team's profile.

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiTeamProfileGetRequest
*/
func (a *TeamProfileApiService) TeamProfileGet(ctx context.Context) ApiTeamProfileGetRequest {
	return ApiTeamProfileGetRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return TeamProfileGetSuccessSchema
func (a *TeamProfileApiService) TeamProfileGetExecute(r ApiTeamProfileGetRequest) (*TeamProfileGetSuccessSchema, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *TeamProfileGetSuccessSchema
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "TeamProfileApiService.TeamProfileGet")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/team.profile.get"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.token == nil {
		return localVarReturnValue, nil, reportError("token is required and must be specified")
	}

	localVarQueryParams.Add("token", parameterToString(*r.token, ""))
	if r.visibility != nil {
		localVarQueryParams.Add("visibility", parameterToString(*r.visibility, ""))
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
			var v TeamProfileGetErrorSchema
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