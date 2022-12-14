=begin
#Slack Web API

#One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.

The version of the OpenAPI document: 1.7.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.1

=end

require 'spec_helper'
require 'json'

# Unit tests for slack::WorkflowsApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'WorkflowsApi' do
  before do
    # run before each test
    @api_instance = slack::WorkflowsApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of WorkflowsApi' do
    it 'should create an instance of WorkflowsApi' do
      expect(@api_instance).to be_instance_of(slack::WorkflowsApi)
    end
  end

  # unit tests for workflows_step_completed
  # Indicate that an app&#39;s step in a workflow completed execution.
  # @param token Authentication token. Requires scope: &#x60;workflow.steps:execute&#x60;
  # @param workflow_step_execute_id Context identifier that maps to the correct workflow step execution.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :outputs Key-value object of outputs from your step. Keys of this object reflect the configured &#x60;key&#x60; properties of your [&#x60;outputs&#x60;](/reference/workflows/workflow_step#output) array from your &#x60;workflow_step&#x60; object.
  # @return [DefaultSuccessTemplate]
  describe 'workflows_step_completed test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for workflows_step_failed
  # Indicate that an app&#39;s step in a workflow failed to execute.
  # @param token Authentication token. Requires scope: &#x60;workflow.steps:execute&#x60;
  # @param workflow_step_execute_id Context identifier that maps to the correct workflow step execution.
  # @param error A JSON-based object with a &#x60;message&#x60; property that should contain a human readable error message.
  # @param [Hash] opts the optional parameters
  # @return [DefaultSuccessTemplate]
  describe 'workflows_step_failed test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for workflows_update_step
  # Update the configuration for a workflow extension step.
  # @param token Authentication token. Requires scope: &#x60;workflow.steps:execute&#x60;
  # @param workflow_step_edit_id A context identifier provided with &#x60;view_submission&#x60; payloads used to call back to &#x60;workflows.updateStep&#x60;.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :inputs A JSON key-value map of inputs required from a user during configuration. This is the data your app expects to receive when the workflow step starts. **Please note**: the embedded variable format is set and replaced by the workflow system. You cannot create custom variables that will be replaced at runtime. [Read more about variables in workflow steps here](/workflows/steps#variables).
  # @option opts [String] :outputs An JSON array of output objects used during step execution. This is the data your app agrees to provide when your workflow step was executed.
  # @option opts [String] :step_name An optional field that can be used to override the step name that is shown in the Workflow Builder.
  # @option opts [String] :step_image_url An optional field that can be used to override app image that is shown in the Workflow Builder.
  # @return [DefaultSuccessTemplate]
  describe 'workflows_update_step test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
