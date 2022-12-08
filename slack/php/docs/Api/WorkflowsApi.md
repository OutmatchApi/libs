# OpenAPI\Client\WorkflowsApi

All URIs are relative to https://slack.com/api, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**workflowsStepCompleted()**](WorkflowsApi.md#workflowsStepCompleted) | **GET** /workflows.stepCompleted |  |
| [**workflowsStepFailed()**](WorkflowsApi.md#workflowsStepFailed) | **GET** /workflows.stepFailed |  |
| [**workflowsUpdateStep()**](WorkflowsApi.md#workflowsUpdateStep) | **GET** /workflows.updateStep |  |


## `workflowsStepCompleted()`

```php
workflowsStepCompleted($token, $workflow_step_execute_id, $outputs): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Indicate that an app's step in a workflow completed execution.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\WorkflowsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `workflow.steps:execute`
$workflow_step_execute_id = 'workflow_step_execute_id_example'; // string | Context identifier that maps to the correct workflow step execution.
$outputs = 'outputs_example'; // string | Key-value object of outputs from your step. Keys of this object reflect the configured `key` properties of your [`outputs`](/reference/workflows/workflow_step#output) array from your `workflow_step` object.

try {
    $result = $apiInstance->workflowsStepCompleted($token, $workflow_step_execute_id, $outputs);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling WorkflowsApi->workflowsStepCompleted: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;workflow.steps:execute&#x60; | |
| **workflow_step_execute_id** | **string**| Context identifier that maps to the correct workflow step execution. | |
| **outputs** | **string**| Key-value object of outputs from your step. Keys of this object reflect the configured &#x60;key&#x60; properties of your [&#x60;outputs&#x60;](/reference/workflows/workflow_step#output) array from your &#x60;workflow_step&#x60; object. | [optional] |

### Return type

[**\OpenAPI\Client\Model\DefaultSuccessTemplate**](../Model/DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `workflowsStepFailed()`

```php
workflowsStepFailed($token, $workflow_step_execute_id, $error): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Indicate that an app's step in a workflow failed to execute.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\WorkflowsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `workflow.steps:execute`
$workflow_step_execute_id = 'workflow_step_execute_id_example'; // string | Context identifier that maps to the correct workflow step execution.
$error = 'error_example'; // string | A JSON-based object with a `message` property that should contain a human readable error message.

try {
    $result = $apiInstance->workflowsStepFailed($token, $workflow_step_execute_id, $error);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling WorkflowsApi->workflowsStepFailed: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;workflow.steps:execute&#x60; | |
| **workflow_step_execute_id** | **string**| Context identifier that maps to the correct workflow step execution. | |
| **error** | **string**| A JSON-based object with a &#x60;message&#x60; property that should contain a human readable error message. | |

### Return type

[**\OpenAPI\Client\Model\DefaultSuccessTemplate**](../Model/DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `workflowsUpdateStep()`

```php
workflowsUpdateStep($token, $workflow_step_edit_id, $inputs, $outputs, $step_name, $step_image_url): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Update the configuration for a workflow extension step.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\WorkflowsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `workflow.steps:execute`
$workflow_step_edit_id = 'workflow_step_edit_id_example'; // string | A context identifier provided with `view_submission` payloads used to call back to `workflows.updateStep`.
$inputs = 'inputs_example'; // string | A JSON key-value map of inputs required from a user during configuration. This is the data your app expects to receive when the workflow step starts. **Please note**: the embedded variable format is set and replaced by the workflow system. You cannot create custom variables that will be replaced at runtime. [Read more about variables in workflow steps here](/workflows/steps#variables).
$outputs = 'outputs_example'; // string | An JSON array of output objects used during step execution. This is the data your app agrees to provide when your workflow step was executed.
$step_name = 'step_name_example'; // string | An optional field that can be used to override the step name that is shown in the Workflow Builder.
$step_image_url = 'step_image_url_example'; // string | An optional field that can be used to override app image that is shown in the Workflow Builder.

try {
    $result = $apiInstance->workflowsUpdateStep($token, $workflow_step_edit_id, $inputs, $outputs, $step_name, $step_image_url);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling WorkflowsApi->workflowsUpdateStep: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;workflow.steps:execute&#x60; | |
| **workflow_step_edit_id** | **string**| A context identifier provided with &#x60;view_submission&#x60; payloads used to call back to &#x60;workflows.updateStep&#x60;. | |
| **inputs** | **string**| A JSON key-value map of inputs required from a user during configuration. This is the data your app expects to receive when the workflow step starts. **Please note**: the embedded variable format is set and replaced by the workflow system. You cannot create custom variables that will be replaced at runtime. [Read more about variables in workflow steps here](/workflows/steps#variables). | [optional] |
| **outputs** | **string**| An JSON array of output objects used during step execution. This is the data your app agrees to provide when your workflow step was executed. | [optional] |
| **step_name** | **string**| An optional field that can be used to override the step name that is shown in the Workflow Builder. | [optional] |
| **step_image_url** | **string**| An optional field that can be used to override app image that is shown in the Workflow Builder. | [optional] |

### Return type

[**\OpenAPI\Client\Model\DefaultSuccessTemplate**](../Model/DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
