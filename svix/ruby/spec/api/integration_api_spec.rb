=begin
#Svix API

#Welcome to the Svix API documentation!  Useful links: [Homepage](https://www.svix.com) | [Support email](mailto:support+docs@svix.com) | [Blog](https://www.svix.com/blog/) | [Slack Community](https://www.svix.com/slack/)  # Introduction  This is the reference documentation and schemas for the [Svix webhook service](https://www.svix.com) API. For tutorials and other documentation please refer to [the documentation](https://docs.svix.com).  ## Main concepts  In Svix you have four important entities you will be interacting with:  - `messages`: these are the webhooks being sent. They can have contents and a few other properties. - `application`: this is where `messages` are sent to. Usually you want to create one application for each user on your platform. - `endpoint`: endpoints are the URLs messages will be sent to. Each application can have multiple `endpoints` and each message sent to that application will be sent to all of them (unless they are not subscribed to the sent event type). - `event-type`: event types are identifiers denoting the type of the message being sent. Event types are primarily used to decide which events are sent to which endpoint.   ## Authentication  Get your authentication token (`AUTH_TOKEN`) from the [Svix dashboard](https://dashboard.svix.com) and use it as part of the `Authorization` header as such: `Authorization: Bearer ${AUTH_TOKEN}`.  <SecurityDefinitions />   ## Code samples  The code samples assume you already have the respective libraries installed and you know how to use them. For the latest information on how to do that, please refer to [the documentation](https://docs.svix.com/).   ## Idempotency  Svix supports [idempotency](https://en.wikipedia.org/wiki/Idempotence) for safely retrying requests without accidentally performing the same operation twice. This is useful when an API call is disrupted in transit and you do not receive a response.  To perform an idempotent request, pass the idempotency key in the `Idempotency-Key` header to the request. The idempotency key should be a unique value generated by the client. You can create the key in however way you like, though we suggest using UUID v4, or any other string with enough entropy to avoid collisions.  Svix's idempotency works by saving the resulting status code and body of the first request made for any given idempotency key for any successful request. Subsequent requests with the same key return the same result.  Please note that idempotency is only supported for `POST` requests.   ## Cross-Origin Resource Sharing  This API features Cross-Origin Resource Sharing (CORS) implemented in compliance with [W3C spec](https://www.w3.org/TR/cors/). And that allows cross-domain communication from the browser. All responses have a wildcard same-origin which makes them completely public and accessible to everyone, including any code on any site. 

The version of the OpenAPI document: 1.4.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.1

=end

require 'spec_helper'
require 'json'

# Unit tests for svix::IntegrationApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'IntegrationApi' do
  before do
    # run before each test
    @api_instance = svix::IntegrationApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of IntegrationApi' do
    it 'should create an instance of IntegrationApi' do
      expect(@api_instance).to be_instance_of(svix::IntegrationApi)
    end
  end

  # unit tests for create_integration_api_v1_app_app_id_integration_post
  # Create Integration
  # Create an integration.
  # @param app_id 
  # @param integration_in 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :idempotency_key The request&#39;s idempotency key
  # @return [IntegrationOut]
  describe 'create_integration_api_v1_app_app_id_integration_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_integration_api_v1_app_app_id_integration_integ_id_delete
  # Delete Integration
  # Delete an integration and revoke it&#39;s key.
  # @param integ_id 
  # @param app_id 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :idempotency_key The request&#39;s idempotency key
  # @return [nil]
  describe 'delete_integration_api_v1_app_app_id_integration_integ_id_delete test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_integration_api_v1_app_app_id_integration_integ_id_get
  # Get Integration
  # Get an integration.
  # @param integ_id 
  # @param app_id 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :idempotency_key The request&#39;s idempotency key
  # @return [IntegrationOut]
  describe 'get_integration_api_v1_app_app_id_integration_integ_id_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_integration_key_api_v1_app_app_id_integration_integ_id_key_get
  # Get Integration Key
  # Get an integration&#39;s key.
  # @param integ_id 
  # @param app_id 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :idempotency_key The request&#39;s idempotency key
  # @return [IntegrationKeyOut]
  describe 'get_integration_key_api_v1_app_app_id_integration_integ_id_key_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for list_integrations_api_v1_app_app_id_integration_get
  # List Integrations
  # List the application&#39;s integrations.
  # @param app_id 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :iterator 
  # @option opts [Integer] :limit 
  # @option opts [String] :idempotency_key The request&#39;s idempotency key
  # @return [ListResponseIntegrationOut]
  describe 'list_integrations_api_v1_app_app_id_integration_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post
  # Rotate Integration Key
  # Rotate the integration&#39;s key. The previous key will be immediately revoked.
  # @param integ_id 
  # @param app_id 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :idempotency_key The request&#39;s idempotency key
  # @return [IntegrationKeyOut]
  describe 'rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_integration_api_v1_app_app_id_integration_integ_id_put
  # Update Integration
  # Update an integration.
  # @param integ_id 
  # @param app_id 
  # @param integration_update 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :idempotency_key The request&#39;s idempotency key
  # @return [IntegrationOut]
  describe 'update_integration_api_v1_app_app_id_integration_integ_id_put test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
