=begin
#Svix API

#Welcome to the Svix API documentation!  Useful links: [Homepage](https://www.svix.com) | [Support email](mailto:support+docs@svix.com) | [Blog](https://www.svix.com/blog/) | [Slack Community](https://www.svix.com/slack/)  # Introduction  This is the reference documentation and schemas for the [Svix webhook service](https://www.svix.com) API. For tutorials and other documentation please refer to [the documentation](https://docs.svix.com).  ## Main concepts  In Svix you have four important entities you will be interacting with:  - `messages`: these are the webhooks being sent. They can have contents and a few other properties. - `application`: this is where `messages` are sent to. Usually you want to create one application for each user on your platform. - `endpoint`: endpoints are the URLs messages will be sent to. Each application can have multiple `endpoints` and each message sent to that application will be sent to all of them (unless they are not subscribed to the sent event type). - `event-type`: event types are identifiers denoting the type of the message being sent. Event types are primarily used to decide which events are sent to which endpoint.   ## Authentication  Get your authentication token (`AUTH_TOKEN`) from the [Svix dashboard](https://dashboard.svix.com) and use it as part of the `Authorization` header as such: `Authorization: Bearer ${AUTH_TOKEN}`.  <SecurityDefinitions />   ## Code samples  The code samples assume you already have the respective libraries installed and you know how to use them. For the latest information on how to do that, please refer to [the documentation](https://docs.svix.com/).   ## Idempotency  Svix supports [idempotency](https://en.wikipedia.org/wiki/Idempotence) for safely retrying requests without accidentally performing the same operation twice. This is useful when an API call is disrupted in transit and you do not receive a response.  To perform an idempotent request, pass the idempotency key in the `Idempotency-Key` header to the request. The idempotency key should be a unique value generated by the client. You can create the key in however way you like, though we suggest using UUID v4, or any other string with enough entropy to avoid collisions.  Svix's idempotency works by saving the resulting status code and body of the first request made for any given idempotency key for any successful request. Subsequent requests with the same key return the same result.  Please note that idempotency is only supported for `POST` requests.   ## Cross-Origin Resource Sharing  This API features Cross-Origin Resource Sharing (CORS) implemented in compliance with [W3C spec](https://www.w3.org/TR/cors/). And that allows cross-domain communication from the browser. All responses have a wildcard same-origin which makes them completely public and accessible to everyone, including any code on any site. 

The version of the OpenAPI document: 1.4.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.1

=end

require 'spec_helper'
require 'json'

# Unit tests for svix::EndpointApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'EndpointApi' do
  before do
    # run before each test
    @api_instance = svix::EndpointApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of EndpointApi' do
    it 'should create an instance of EndpointApi' do
      expect(@api_instance).to be_instance_of(svix::EndpointApi)
    end
  end

  # unit tests for create_endpoint_api_v1_app_app_id_endpoint_post
  # Create Endpoint
  # Create a new endpoint for the application.  When &#x60;secret&#x60; is &#x60;null&#x60; the secret is automatically generated (recommended)
  # @param app_id 
  # @param endpoint_in 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :idempotency_key The request&#39;s idempotency key
  # @return [EndpointOut]
  describe 'create_endpoint_api_v1_app_app_id_endpoint_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_endpoint_api_v1_app_app_id_endpoint_endpoint_id_delete
  # Delete Endpoint
  # Delete an endpoint.
  # @param endpoint_id 
  # @param app_id 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :idempotency_key The request&#39;s idempotency key
  # @return [nil]
  describe 'delete_endpoint_api_v1_app_app_id_endpoint_endpoint_id_delete test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_endpoint_api_v1_app_app_id_endpoint_endpoint_id_get
  # Get Endpoint
  # Get an application.
  # @param endpoint_id 
  # @param app_id 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :idempotency_key The request&#39;s idempotency key
  # @return [EndpointOut]
  describe 'get_endpoint_api_v1_app_app_id_endpoint_endpoint_id_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_get
  # Get Endpoint Headers
  # Get the additional headers to be sent with the webhook
  # @param endpoint_id 
  # @param app_id 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :idempotency_key The request&#39;s idempotency key
  # @return [EndpointHeadersOut]
  describe 'get_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_get
  # Get Endpoint Secret
  # Get the endpoint&#39;s signing secret.  This is used to verify the authenticity of the webhook. For more information please refer to [the consuming webhooks docs](https://docs.svix.com/consuming-webhooks/).
  # @param endpoint_id 
  # @param app_id 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :idempotency_key The request&#39;s idempotency key
  # @return [EndpointSecretOut]
  describe 'get_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_endpoint_stats_api_v1_app_app_id_endpoint_endpoint_id_stats_get
  # Get Endpoint Stats
  # Get basic statistics for the endpoint.
  # @param endpoint_id 
  # @param app_id 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :idempotency_key The request&#39;s idempotency key
  # @return [EndpointStats]
  describe 'get_endpoint_stats_api_v1_app_app_id_endpoint_endpoint_id_stats_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for list_endpoints_api_v1_app_app_id_endpoint_get
  # List Endpoints
  # List the application&#39;s endpoints.
  # @param app_id 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :iterator 
  # @option opts [Integer] :limit 
  # @option opts [String] :idempotency_key The request&#39;s idempotency key
  # @return [ListResponseEndpointOut]
  describe 'list_endpoints_api_v1_app_app_id_endpoint_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for patch_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_patch
  # Patch Endpoint Headers
  # Partially set the additional headers to be sent with the webhook
  # @param app_id 
  # @param endpoint_id 
  # @param endpoint_headers_patch_in 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :idempotency_key The request&#39;s idempotency key
  # @return [nil]
  describe 'patch_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_patch test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for recover_failed_webhooks_api_v1_app_app_id_endpoint_endpoint_id_recover_post
  # Recover Failed Webhooks
  # Resend all failed messages since a given time.
  # @param app_id 
  # @param endpoint_id 
  # @param recover_in 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :idempotency_key The request&#39;s idempotency key
  # @return [Object]
  describe 'recover_failed_webhooks_api_v1_app_app_id_endpoint_endpoint_id_recover_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for replay_missing_webhooks_api_v1_app_app_id_endpoint_endpoint_id_replay_missing_post
  # Replay Missing Webhooks
  # Replays messages to the endpoint. Only messages that were created after &#x60;since&#x60; will be sent. Messages that were previously sent to the endpoint are not resent.
  # @param app_id 
  # @param endpoint_id 
  # @param replay_in 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :idempotency_key The request&#39;s idempotency key
  # @return [Object]
  describe 'replay_missing_webhooks_api_v1_app_app_id_endpoint_endpoint_id_replay_missing_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for rotate_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_rotate_post
  # Rotate Endpoint Secret
  # Rotates the endpoint&#39;s signing secret.  The previous secret will be valid for the next 24 hours.
  # @param endpoint_id 
  # @param app_id 
  # @param endpoint_secret_rotate_in 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :idempotency_key The request&#39;s idempotency key
  # @return [nil]
  describe 'rotate_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_rotate_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_endpoint_api_v1_app_app_id_endpoint_endpoint_id_put
  # Update Endpoint
  # Update an endpoint.
  # @param endpoint_id 
  # @param app_id 
  # @param endpoint_update 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :idempotency_key The request&#39;s idempotency key
  # @return [EndpointOut]
  describe 'update_endpoint_api_v1_app_app_id_endpoint_endpoint_id_put test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_put
  # Update Endpoint Headers
  # Set the additional headers to be sent with the webhook
  # @param app_id 
  # @param endpoint_id 
  # @param endpoint_headers_in 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :idempotency_key The request&#39;s idempotency key
  # @return [nil]
  describe 'update_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_put test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
