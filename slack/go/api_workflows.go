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


// WorkflowsApiService WorkflowsApi service
type WorkflowsApiService service

type ApiWorkflowsStepCompletedRequest struct {
	ctx context.Context
	ApiService *WorkflowsApiService
	token *string
	workflowStepExecuteId *string
	outputs *string
}

// Authentication token. Requires scope: &#x60;workflow.steps:execute&#x60;
func (r ApiWorkflowsStepCompletedRequest) Token(token string) ApiWorkflowsStepCompletedRequest {
	r.token = &token
	return r
}

// Context identifier that maps to the correct workflow step execution.
func (r ApiWorkflowsStepCompletedRequest) WorkflowStepExecuteId(workflowStepExecuteId string) ApiWorkflowsStepCompletedRequest {
	r.workflowStepExecuteId = &workflowStepExecuteId
	return r
}

// Key-value object of outputs from your step. Keys of this object reflect the configured &#x60;key&#x60; properties of your [&#x60;outputs&#x60;](/reference/workflows/workflow_step#output) array from your &#x60;workflow_step&#x60; object.
func (r ApiWorkflowsStepCompletedRequest) Outputs(outputs string) ApiWorkflowsStepCompletedRequest {
	r.outputs = &outputs
	return r
}

func (r ApiWorkflowsStepCompletedRequest) Execute() (*DefaultSuccessTemplate, *http.Response, error) {
	return r.ApiService.WorkflowsStepCompletedExecute(r)
}

/*
WorkflowsStepCompleted Method for WorkflowsStepCompleted

Indicate that an app's step in a workflow completed execution.

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiWorkflowsStepCompletedRequest
*/
func (a *WorkflowsApiService) WorkflowsStepCompleted(ctx context.Context) ApiWorkflowsStepCompletedRequest {
	return ApiWorkflowsStepCompletedRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return DefaultSuccessTemplate
func (a *WorkflowsApiService) WorkflowsStepCompletedExecute(r ApiWorkflowsStepCompletedRequest) (*DefaultSuccessTemplate, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *DefaultSuccessTemplate
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "WorkflowsApiService.WorkflowsStepCompleted")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/workflows.stepCompleted"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.token == nil {
		return localVarReturnValue, nil, reportError("token is required and must be specified")
	}
	if r.workflowStepExecuteId == nil {
		return localVarReturnValue, nil, reportError("workflowStepExecuteId is required and must be specified")
	}

	localVarQueryParams.Add("workflow_step_execute_id", parameterToString(*r.workflowStepExecuteId, ""))
	if r.outputs != nil {
		localVarQueryParams.Add("outputs", parameterToString(*r.outputs, ""))
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

type ApiWorkflowsStepFailedRequest struct {
	ctx context.Context
	ApiService *WorkflowsApiService
	token *string
	workflowStepExecuteId *string
	error_ *string
}

// Authentication token. Requires scope: &#x60;workflow.steps:execute&#x60;
func (r ApiWorkflowsStepFailedRequest) Token(token string) ApiWorkflowsStepFailedRequest {
	r.token = &token
	return r
}

// Context identifier that maps to the correct workflow step execution.
func (r ApiWorkflowsStepFailedRequest) WorkflowStepExecuteId(workflowStepExecuteId string) ApiWorkflowsStepFailedRequest {
	r.workflowStepExecuteId = &workflowStepExecuteId
	return r
}

// A JSON-based object with a &#x60;message&#x60; property that should contain a human readable error message.
func (r ApiWorkflowsStepFailedRequest) Error_(error_ string) ApiWorkflowsStepFailedRequest {
	r.error_ = &error_
	return r
}

func (r ApiWorkflowsStepFailedRequest) Execute() (*DefaultSuccessTemplate, *http.Response, error) {
	return r.ApiService.WorkflowsStepFailedExecute(r)
}

/*
WorkflowsStepFailed Method for WorkflowsStepFailed

Indicate that an app's step in a workflow failed to execute.

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiWorkflowsStepFailedRequest
*/
func (a *WorkflowsApiService) WorkflowsStepFailed(ctx context.Context) ApiWorkflowsStepFailedRequest {
	return ApiWorkflowsStepFailedRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return DefaultSuccessTemplate
func (a *WorkflowsApiService) WorkflowsStepFailedExecute(r ApiWorkflowsStepFailedRequest) (*DefaultSuccessTemplate, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *DefaultSuccessTemplate
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "WorkflowsApiService.WorkflowsStepFailed")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/workflows.stepFailed"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.token == nil {
		return localVarReturnValue, nil, reportError("token is required and must be specified")
	}
	if r.workflowStepExecuteId == nil {
		return localVarReturnValue, nil, reportError("workflowStepExecuteId is required and must be specified")
	}
	if r.error_ == nil {
		return localVarReturnValue, nil, reportError("error_ is required and must be specified")
	}

	localVarQueryParams.Add("workflow_step_execute_id", parameterToString(*r.workflowStepExecuteId, ""))
	localVarQueryParams.Add("error", parameterToString(*r.error_, ""))
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

type ApiWorkflowsUpdateStepRequest struct {
	ctx context.Context
	ApiService *WorkflowsApiService
	token *string
	workflowStepEditId *string
	inputs *string
	outputs *string
	stepName *string
	stepImageUrl *string
}

// Authentication token. Requires scope: &#x60;workflow.steps:execute&#x60;
func (r ApiWorkflowsUpdateStepRequest) Token(token string) ApiWorkflowsUpdateStepRequest {
	r.token = &token
	return r
}

// A context identifier provided with &#x60;view_submission&#x60; payloads used to call back to &#x60;workflows.updateStep&#x60;.
func (r ApiWorkflowsUpdateStepRequest) WorkflowStepEditId(workflowStepEditId string) ApiWorkflowsUpdateStepRequest {
	r.workflowStepEditId = &workflowStepEditId
	return r
}

// A JSON key-value map of inputs required from a user during configuration. This is the data your app expects to receive when the workflow step starts. **Please note**: the embedded variable format is set and replaced by the workflow system. You cannot create custom variables that will be replaced at runtime. [Read more about variables in workflow steps here](/workflows/steps#variables).
func (r ApiWorkflowsUpdateStepRequest) Inputs(inputs string) ApiWorkflowsUpdateStepRequest {
	r.inputs = &inputs
	return r
}

// An JSON array of output objects used during step execution. This is the data your app agrees to provide when your workflow step was executed.
func (r ApiWorkflowsUpdateStepRequest) Outputs(outputs string) ApiWorkflowsUpdateStepRequest {
	r.outputs = &outputs
	return r
}

// An optional field that can be used to override the step name that is shown in the Workflow Builder.
func (r ApiWorkflowsUpdateStepRequest) StepName(stepName string) ApiWorkflowsUpdateStepRequest {
	r.stepName = &stepName
	return r
}

// An optional field that can be used to override app image that is shown in the Workflow Builder.
func (r ApiWorkflowsUpdateStepRequest) StepImageUrl(stepImageUrl string) ApiWorkflowsUpdateStepRequest {
	r.stepImageUrl = &stepImageUrl
	return r
}

func (r ApiWorkflowsUpdateStepRequest) Execute() (*DefaultSuccessTemplate, *http.Response, error) {
	return r.ApiService.WorkflowsUpdateStepExecute(r)
}

/*
WorkflowsUpdateStep Method for WorkflowsUpdateStep

Update the configuration for a workflow extension step.

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiWorkflowsUpdateStepRequest
*/
func (a *WorkflowsApiService) WorkflowsUpdateStep(ctx context.Context) ApiWorkflowsUpdateStepRequest {
	return ApiWorkflowsUpdateStepRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return DefaultSuccessTemplate
func (a *WorkflowsApiService) WorkflowsUpdateStepExecute(r ApiWorkflowsUpdateStepRequest) (*DefaultSuccessTemplate, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *DefaultSuccessTemplate
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "WorkflowsApiService.WorkflowsUpdateStep")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/workflows.updateStep"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.token == nil {
		return localVarReturnValue, nil, reportError("token is required and must be specified")
	}
	if r.workflowStepEditId == nil {
		return localVarReturnValue, nil, reportError("workflowStepEditId is required and must be specified")
	}

	localVarQueryParams.Add("workflow_step_edit_id", parameterToString(*r.workflowStepEditId, ""))
	if r.inputs != nil {
		localVarQueryParams.Add("inputs", parameterToString(*r.inputs, ""))
	}
	if r.outputs != nil {
		localVarQueryParams.Add("outputs", parameterToString(*r.outputs, ""))
	}
	if r.stepName != nil {
		localVarQueryParams.Add("step_name", parameterToString(*r.stepName, ""))
	}
	if r.stepImageUrl != nil {
		localVarQueryParams.Add("step_image_url", parameterToString(*r.stepImageUrl, ""))
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
