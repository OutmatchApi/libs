# WorkflowsApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**workflowsStepCompleted**](WorkflowsApi.md#workflowsStepCompleted) | **GET** /workflows.stepCompleted | 
[**workflowsStepFailed**](WorkflowsApi.md#workflowsStepFailed) | **GET** /workflows.stepFailed | 
[**workflowsUpdateStep**](WorkflowsApi.md#workflowsUpdateStep) | **GET** /workflows.updateStep | 


<a name="workflowsStepCompleted"></a>
# **workflowsStepCompleted**
> DefaultSuccessTemplate workflowsStepCompleted(token, workflowStepExecuteId, outputs)



Indicate that an app&#39;s step in a workflow completed execution.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = WorkflowsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `workflow.steps:execute`
val workflowStepExecuteId : kotlin.String = workflowStepExecuteId_example // kotlin.String | Context identifier that maps to the correct workflow step execution.
val outputs : kotlin.String = outputs_example // kotlin.String | Key-value object of outputs from your step. Keys of this object reflect the configured `key` properties of your [`outputs`](/reference/workflows/workflow_step#output) array from your `workflow_step` object.
try {
    val result : DefaultSuccessTemplate = apiInstance.workflowsStepCompleted(token, workflowStepExecuteId, outputs)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#workflowsStepCompleted")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#workflowsStepCompleted")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;workflow.steps:execute&#x60; |
 **workflowStepExecuteId** | **kotlin.String**| Context identifier that maps to the correct workflow step execution. |
 **outputs** | **kotlin.String**| Key-value object of outputs from your step. Keys of this object reflect the configured &#x60;key&#x60; properties of your [&#x60;outputs&#x60;](/reference/workflows/workflow_step#output) array from your &#x60;workflow_step&#x60; object. | [optional]

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="workflowsStepFailed"></a>
# **workflowsStepFailed**
> DefaultSuccessTemplate workflowsStepFailed(token, workflowStepExecuteId, error)



Indicate that an app&#39;s step in a workflow failed to execute.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = WorkflowsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `workflow.steps:execute`
val workflowStepExecuteId : kotlin.String = workflowStepExecuteId_example // kotlin.String | Context identifier that maps to the correct workflow step execution.
val error : kotlin.String = error_example // kotlin.String | A JSON-based object with a `message` property that should contain a human readable error message.
try {
    val result : DefaultSuccessTemplate = apiInstance.workflowsStepFailed(token, workflowStepExecuteId, error)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#workflowsStepFailed")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#workflowsStepFailed")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;workflow.steps:execute&#x60; |
 **workflowStepExecuteId** | **kotlin.String**| Context identifier that maps to the correct workflow step execution. |
 **error** | **kotlin.String**| A JSON-based object with a &#x60;message&#x60; property that should contain a human readable error message. |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="workflowsUpdateStep"></a>
# **workflowsUpdateStep**
> DefaultSuccessTemplate workflowsUpdateStep(token, workflowStepEditId, inputs, outputs, stepName, stepImageUrl)



Update the configuration for a workflow extension step.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = WorkflowsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `workflow.steps:execute`
val workflowStepEditId : kotlin.String = workflowStepEditId_example // kotlin.String | A context identifier provided with `view_submission` payloads used to call back to `workflows.updateStep`.
val inputs : kotlin.String = inputs_example // kotlin.String | A JSON key-value map of inputs required from a user during configuration. This is the data your app expects to receive when the workflow step starts. **Please note**: the embedded variable format is set and replaced by the workflow system. You cannot create custom variables that will be replaced at runtime. [Read more about variables in workflow steps here](/workflows/steps#variables).
val outputs : kotlin.String = outputs_example // kotlin.String | An JSON array of output objects used during step execution. This is the data your app agrees to provide when your workflow step was executed.
val stepName : kotlin.String = stepName_example // kotlin.String | An optional field that can be used to override the step name that is shown in the Workflow Builder.
val stepImageUrl : kotlin.String = stepImageUrl_example // kotlin.String | An optional field that can be used to override app image that is shown in the Workflow Builder.
try {
    val result : DefaultSuccessTemplate = apiInstance.workflowsUpdateStep(token, workflowStepEditId, inputs, outputs, stepName, stepImageUrl)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#workflowsUpdateStep")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#workflowsUpdateStep")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;workflow.steps:execute&#x60; |
 **workflowStepEditId** | **kotlin.String**| A context identifier provided with &#x60;view_submission&#x60; payloads used to call back to &#x60;workflows.updateStep&#x60;. |
 **inputs** | **kotlin.String**| A JSON key-value map of inputs required from a user during configuration. This is the data your app expects to receive when the workflow step starts. **Please note**: the embedded variable format is set and replaced by the workflow system. You cannot create custom variables that will be replaced at runtime. [Read more about variables in workflow steps here](/workflows/steps#variables). | [optional]
 **outputs** | **kotlin.String**| An JSON array of output objects used during step execution. This is the data your app agrees to provide when your workflow step was executed. | [optional]
 **stepName** | **kotlin.String**| An optional field that can be used to override the step name that is shown in the Workflow Builder. | [optional]
 **stepImageUrl** | **kotlin.String**| An optional field that can be used to override app image that is shown in the Workflow Builder. | [optional]

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

