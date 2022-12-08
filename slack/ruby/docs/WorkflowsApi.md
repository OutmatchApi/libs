# slack::WorkflowsApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**workflows_step_completed**](WorkflowsApi.md#workflows_step_completed) | **GET** /workflows.stepCompleted |  |
| [**workflows_step_failed**](WorkflowsApi.md#workflows_step_failed) | **GET** /workflows.stepFailed |  |
| [**workflows_update_step**](WorkflowsApi.md#workflows_update_step) | **GET** /workflows.updateStep |  |


## workflows_step_completed

> <DefaultSuccessTemplate> workflows_step_completed(token, workflow_step_execute_id, opts)



Indicate that an app's step in a workflow completed execution.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::WorkflowsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `workflow.steps:execute`
workflow_step_execute_id = 'workflow_step_execute_id_example' # String | Context identifier that maps to the correct workflow step execution.
opts = {
  outputs: 'outputs_example' # String | Key-value object of outputs from your step. Keys of this object reflect the configured `key` properties of your [`outputs`](/reference/workflows/workflow_step#output) array from your `workflow_step` object.
}

begin
  
  result = api_instance.workflows_step_completed(token, workflow_step_execute_id, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling WorkflowsApi->workflows_step_completed: #{e}"
end
```

#### Using the workflows_step_completed_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> workflows_step_completed_with_http_info(token, workflow_step_execute_id, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.workflows_step_completed_with_http_info(token, workflow_step_execute_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling WorkflowsApi->workflows_step_completed_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;workflow.steps:execute&#x60; |  |
| **workflow_step_execute_id** | **String** | Context identifier that maps to the correct workflow step execution. |  |
| **outputs** | **String** | Key-value object of outputs from your step. Keys of this object reflect the configured &#x60;key&#x60; properties of your [&#x60;outputs&#x60;](/reference/workflows/workflow_step#output) array from your &#x60;workflow_step&#x60; object. | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## workflows_step_failed

> <DefaultSuccessTemplate> workflows_step_failed(token, workflow_step_execute_id, error)



Indicate that an app's step in a workflow failed to execute.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::WorkflowsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `workflow.steps:execute`
workflow_step_execute_id = 'workflow_step_execute_id_example' # String | Context identifier that maps to the correct workflow step execution.
error = 'error_example' # String | A JSON-based object with a `message` property that should contain a human readable error message.

begin
  
  result = api_instance.workflows_step_failed(token, workflow_step_execute_id, error)
  p result
rescue slack::ApiError => e
  puts "Error when calling WorkflowsApi->workflows_step_failed: #{e}"
end
```

#### Using the workflows_step_failed_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> workflows_step_failed_with_http_info(token, workflow_step_execute_id, error)

```ruby
begin
  
  data, status_code, headers = api_instance.workflows_step_failed_with_http_info(token, workflow_step_execute_id, error)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling WorkflowsApi->workflows_step_failed_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;workflow.steps:execute&#x60; |  |
| **workflow_step_execute_id** | **String** | Context identifier that maps to the correct workflow step execution. |  |
| **error** | **String** | A JSON-based object with a &#x60;message&#x60; property that should contain a human readable error message. |  |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## workflows_update_step

> <DefaultSuccessTemplate> workflows_update_step(token, workflow_step_edit_id, opts)



Update the configuration for a workflow extension step.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::WorkflowsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `workflow.steps:execute`
workflow_step_edit_id = 'workflow_step_edit_id_example' # String | A context identifier provided with `view_submission` payloads used to call back to `workflows.updateStep`.
opts = {
  inputs: 'inputs_example', # String | A JSON key-value map of inputs required from a user during configuration. This is the data your app expects to receive when the workflow step starts. **Please note**: the embedded variable format is set and replaced by the workflow system. You cannot create custom variables that will be replaced at runtime. [Read more about variables in workflow steps here](/workflows/steps#variables).
  outputs: 'outputs_example', # String | An JSON array of output objects used during step execution. This is the data your app agrees to provide when your workflow step was executed.
  step_name: 'step_name_example', # String | An optional field that can be used to override the step name that is shown in the Workflow Builder.
  step_image_url: 'step_image_url_example' # String | An optional field that can be used to override app image that is shown in the Workflow Builder.
}

begin
  
  result = api_instance.workflows_update_step(token, workflow_step_edit_id, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling WorkflowsApi->workflows_update_step: #{e}"
end
```

#### Using the workflows_update_step_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> workflows_update_step_with_http_info(token, workflow_step_edit_id, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.workflows_update_step_with_http_info(token, workflow_step_edit_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling WorkflowsApi->workflows_update_step_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;workflow.steps:execute&#x60; |  |
| **workflow_step_edit_id** | **String** | A context identifier provided with &#x60;view_submission&#x60; payloads used to call back to &#x60;workflows.updateStep&#x60;. |  |
| **inputs** | **String** | A JSON key-value map of inputs required from a user during configuration. This is the data your app expects to receive when the workflow step starts. **Please note**: the embedded variable format is set and replaced by the workflow system. You cannot create custom variables that will be replaced at runtime. [Read more about variables in workflow steps here](/workflows/steps#variables). | [optional] |
| **outputs** | **String** | An JSON array of output objects used during step execution. This is the data your app agrees to provide when your workflow step was executed. | [optional] |
| **step_name** | **String** | An optional field that can be used to override the step name that is shown in the Workflow Builder. | [optional] |
| **step_image_url** | **String** | An optional field that can be used to override app image that is shown in the Workflow Builder. | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

