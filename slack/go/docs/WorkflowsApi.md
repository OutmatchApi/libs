# \WorkflowsApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**WorkflowsStepCompleted**](WorkflowsApi.md#WorkflowsStepCompleted) | **Get** /workflows.stepCompleted | 
[**WorkflowsStepFailed**](WorkflowsApi.md#WorkflowsStepFailed) | **Get** /workflows.stepFailed | 
[**WorkflowsUpdateStep**](WorkflowsApi.md#WorkflowsUpdateStep) | **Get** /workflows.updateStep | 



## WorkflowsStepCompleted

> DefaultSuccessTemplate WorkflowsStepCompleted(ctx).Token(token).WorkflowStepExecuteId(workflowStepExecuteId).Outputs(outputs).Execute()





### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    token := "token_example" // string | Authentication token. Requires scope: `workflow.steps:execute`
    workflowStepExecuteId := "workflowStepExecuteId_example" // string | Context identifier that maps to the correct workflow step execution.
    outputs := "outputs_example" // string | Key-value object of outputs from your step. Keys of this object reflect the configured `key` properties of your [`outputs`](/reference/workflows/workflow_step#output) array from your `workflow_step` object. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.WorkflowsApi.WorkflowsStepCompleted(context.Background()).Token(token).WorkflowStepExecuteId(workflowStepExecuteId).Outputs(outputs).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `WorkflowsApi.WorkflowsStepCompleted``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `WorkflowsStepCompleted`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `WorkflowsApi.WorkflowsStepCompleted`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiWorkflowsStepCompletedRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;workflow.steps:execute&#x60; | 
 **workflowStepExecuteId** | **string** | Context identifier that maps to the correct workflow step execution. | 
 **outputs** | **string** | Key-value object of outputs from your step. Keys of this object reflect the configured &#x60;key&#x60; properties of your [&#x60;outputs&#x60;](/reference/workflows/workflow_step#output) array from your &#x60;workflow_step&#x60; object. | 

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## WorkflowsStepFailed

> DefaultSuccessTemplate WorkflowsStepFailed(ctx).Token(token).WorkflowStepExecuteId(workflowStepExecuteId).Error_(error_).Execute()





### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    token := "token_example" // string | Authentication token. Requires scope: `workflow.steps:execute`
    workflowStepExecuteId := "workflowStepExecuteId_example" // string | Context identifier that maps to the correct workflow step execution.
    error_ := "error__example" // string | A JSON-based object with a `message` property that should contain a human readable error message.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.WorkflowsApi.WorkflowsStepFailed(context.Background()).Token(token).WorkflowStepExecuteId(workflowStepExecuteId).Error_(error_).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `WorkflowsApi.WorkflowsStepFailed``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `WorkflowsStepFailed`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `WorkflowsApi.WorkflowsStepFailed`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiWorkflowsStepFailedRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;workflow.steps:execute&#x60; | 
 **workflowStepExecuteId** | **string** | Context identifier that maps to the correct workflow step execution. | 
 **error_** | **string** | A JSON-based object with a &#x60;message&#x60; property that should contain a human readable error message. | 

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## WorkflowsUpdateStep

> DefaultSuccessTemplate WorkflowsUpdateStep(ctx).Token(token).WorkflowStepEditId(workflowStepEditId).Inputs(inputs).Outputs(outputs).StepName(stepName).StepImageUrl(stepImageUrl).Execute()





### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    token := "token_example" // string | Authentication token. Requires scope: `workflow.steps:execute`
    workflowStepEditId := "workflowStepEditId_example" // string | A context identifier provided with `view_submission` payloads used to call back to `workflows.updateStep`.
    inputs := "inputs_example" // string | A JSON key-value map of inputs required from a user during configuration. This is the data your app expects to receive when the workflow step starts. **Please note**: the embedded variable format is set and replaced by the workflow system. You cannot create custom variables that will be replaced at runtime. [Read more about variables in workflow steps here](/workflows/steps#variables). (optional)
    outputs := "outputs_example" // string | An JSON array of output objects used during step execution. This is the data your app agrees to provide when your workflow step was executed. (optional)
    stepName := "stepName_example" // string | An optional field that can be used to override the step name that is shown in the Workflow Builder. (optional)
    stepImageUrl := "stepImageUrl_example" // string | An optional field that can be used to override app image that is shown in the Workflow Builder. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.WorkflowsApi.WorkflowsUpdateStep(context.Background()).Token(token).WorkflowStepEditId(workflowStepEditId).Inputs(inputs).Outputs(outputs).StepName(stepName).StepImageUrl(stepImageUrl).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `WorkflowsApi.WorkflowsUpdateStep``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `WorkflowsUpdateStep`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `WorkflowsApi.WorkflowsUpdateStep`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiWorkflowsUpdateStepRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;workflow.steps:execute&#x60; | 
 **workflowStepEditId** | **string** | A context identifier provided with &#x60;view_submission&#x60; payloads used to call back to &#x60;workflows.updateStep&#x60;. | 
 **inputs** | **string** | A JSON key-value map of inputs required from a user during configuration. This is the data your app expects to receive when the workflow step starts. **Please note**: the embedded variable format is set and replaced by the workflow system. You cannot create custom variables that will be replaced at runtime. [Read more about variables in workflow steps here](/workflows/steps#variables). | 
 **outputs** | **string** | An JSON array of output objects used during step execution. This is the data your app agrees to provide when your workflow step was executed. | 
 **stepName** | **string** | An optional field that can be used to override the step name that is shown in the Workflow Builder. | 
 **stepImageUrl** | **string** | An optional field that can be used to override app image that is shown in the Workflow Builder. | 

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

