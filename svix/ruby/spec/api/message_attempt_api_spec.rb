=begin
#Svix API

#Welcome to the Svix API documentation!  Useful links: [Homepage](https://www.svix.com) | [Support email](mailto:support+docs@svix.com) | [Blog](https://www.svix.com/blog/) | [Slack Community](https://www.svix.com/slack/)  # Introduction  This is the reference documentation and schemas for the [Svix webhook service](https://www.svix.com) API. For tutorials and other documentation please refer to [the documentation](https://docs.svix.com).  ## Main concepts  In Svix you have four important entities you will be interacting with:  - `messages`: these are the webhooks being sent. They can have contents and a few other properties. - `application`: this is where `messages` are sent to. Usually you want to create one application for each user on your platform. - `endpoint`: endpoints are the URLs messages will be sent to. Each application can have multiple `endpoints` and each message sent to that application will be sent to all of them (unless they are not subscribed to the sent event type). - `event-type`: event types are identifiers denoting the type of the message being sent. Event types are primarily used to decide which events are sent to which endpoint.   ## Authentication  Get your authentication token (`AUTH_TOKEN`) from the [Svix dashboard](https://dashboard.svix.com) and use it as part of the `Authorization` header as such: `Authorization: Bearer ${AUTH_TOKEN}`.  <SecurityDefinitions />   ## Code samples  The code samples assume you already have the respective libraries installed and you know how to use them. For the latest information on how to do that, please refer to [the documentation](https://docs.svix.com/).   ## Idempotency  Svix supports [idempotency](https://en.wikipedia.org/wiki/Idempotence) for safely retrying requests without accidentally performing the same operation twice. This is useful when an API call is disrupted in transit and you do not receive a response.  To perform an idempotent request, pass the idempotency key in the `Idempotency-Key` header to the request. The idempotency key should be a unique value generated by the client. You can create the key in however way you like, though we suggest using UUID v4, or any other string with enough entropy to avoid collisions.  Svix's idempotency works by saving the resulting status code and body of the first request made for any given idempotency key for any successful request. Subsequent requests with the same key return the same result.  Please note that idempotency is only supported for `POST` requests.   ## Cross-Origin Resource Sharing  This API features Cross-Origin Resource Sharing (CORS) implemented in compliance with [W3C spec](https://www.w3.org/TR/cors/). And that allows cross-domain communication from the browser. All responses have a wildcard same-origin which makes them completely public and accessible to everyone, including any code on any site. 

The version of the OpenAPI document: 1.4.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.1

=end

require 'spec_helper'
require 'json'

# Unit tests for svix::MessageAttemptApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'MessageAttemptApi' do
  before do
    # run before each test
    @api_instance = svix::MessageAttemptApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of MessageAttemptApi' do
    it 'should create an instance of MessageAttemptApi' do
      expect(@api_instance).to be_instance_of(svix::MessageAttemptApi)
    end
  end

  # unit tests for get_attempt_api_v1_app_app_id_msg_msg_id_attempt_attempt_id_get
  # Get Attempt
  # &#x60;msg_id&#x60;: Use a message id or a message &#x60;eventId&#x60;
  # @param attempt_id 
  # @param msg_id 
  # @param app_id 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :idempotency_key The request&#39;s idempotency key
  # @return [MessageAttemptOut]
  describe 'get_attempt_api_v1_app_app_id_msg_msg_id_attempt_attempt_id_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for list_attempted_destinations_api_v1_app_app_id_msg_msg_id_endpoint_get
  # List Attempted Destinations
  # &#x60;msg_id&#x60;: Use a message id or a message &#x60;eventId&#x60;
  # @param msg_id 
  # @param app_id 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :iterator 
  # @option opts [Integer] :limit 
  # @option opts [String] :idempotency_key The request&#39;s idempotency key
  # @return [ListResponseMessageEndpointOut]
  describe 'list_attempted_destinations_api_v1_app_app_id_msg_msg_id_endpoint_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for list_attempted_messages_api_v1_app_app_id_endpoint_endpoint_id_msg_get
  # List Attempted Messages
  # List messages for a particular endpoint. Additionally includes metadata about the latest message attempt.  The &#x60;before&#x60; parameter lets you filter all items created before a certain date and is ignored if an iterator is passed.
  # @param endpoint_id 
  # @param app_id 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :iterator 
  # @option opts [Integer] :limit 
  # @option opts [String] :channel 
  # @option opts [MessageStatus] :status 
  # @option opts [Time] :before 
  # @option opts [Time] :after 
  # @option opts [String] :idempotency_key The request&#39;s idempotency key
  # @return [ListResponseEndpointMessageOut]
  describe 'list_attempted_messages_api_v1_app_app_id_endpoint_endpoint_id_msg_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for list_attempts_api_v1_app_app_id_msg_msg_id_attempt_get
  # List Attempts
  # Deprecated: Please use \&quot;List Attempts by Endpoint\&quot; and \&quot;List Attempts by Msg\&quot; instead.  &#x60;msg_id&#x60;: Use a message id or a message &#x60;eventId&#x60;
  # @param app_id 
  # @param msg_id 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :iterator 
  # @option opts [Integer] :limit 
  # @option opts [String] :endpoint_id 
  # @option opts [Array<String>] :event_types 
  # @option opts [String] :channel 
  # @option opts [MessageStatus] :status 
  # @option opts [Time] :before 
  # @option opts [Time] :after 
  # @option opts [String] :idempotency_key The request&#39;s idempotency key
  # @return [ListResponseMessageAttemptOut]
  describe 'list_attempts_api_v1_app_app_id_msg_msg_id_attempt_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for list_attempts_by_endpoint_api_v1_app_app_id_attempt_endpoint_endpoint_id_get
  # List Attempts By Endpoint
  # List attempts by endpoint id
  # @param app_id 
  # @param endpoint_id 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :iterator 
  # @option opts [Integer] :limit 
  # @option opts [MessageStatus] :status 
  # @option opts [StatusCodeClass] :status_code_class 
  # @option opts [Array<String>] :event_types 
  # @option opts [String] :channel 
  # @option opts [Time] :before 
  # @option opts [Time] :after 
  # @option opts [String] :idempotency_key The request&#39;s idempotency key
  # @return [ListResponseMessageAttemptOut]
  describe 'list_attempts_by_endpoint_api_v1_app_app_id_attempt_endpoint_endpoint_id_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for list_attempts_by_msg_api_v1_app_app_id_attempt_msg_msg_id_get
  # List Attempts By Msg
  # List attempts by message id
  # @param app_id 
  # @param msg_id 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :endpoint_id 
  # @option opts [String] :iterator 
  # @option opts [Integer] :limit 
  # @option opts [MessageStatus] :status 
  # @option opts [StatusCodeClass] :status_code_class 
  # @option opts [Array<String>] :event_types 
  # @option opts [String] :channel 
  # @option opts [Time] :before 
  # @option opts [Time] :after 
  # @option opts [String] :idempotency_key The request&#39;s idempotency key
  # @return [ListResponseMessageAttemptOut]
  describe 'list_attempts_by_msg_api_v1_app_app_id_attempt_msg_msg_id_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for list_attempts_for_endpoint_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_attempt_get
  # List Attempts For Endpoint
  # DEPRECATED: please use list_attempts with endpoint_id as a query parameter instead.  List the message attempts for a particular endpoint.  Returning the endpoint.  The &#x60;before&#x60; parameter lets you filter all items created before a certain date and is ignored if an iterator is passed.
  # @param msg_id 
  # @param app_id 
  # @param endpoint_id 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :iterator 
  # @option opts [Integer] :limit 
  # @option opts [Array<String>] :event_types 
  # @option opts [String] :channel 
  # @option opts [MessageStatus] :status 
  # @option opts [Time] :before 
  # @option opts [Time] :after 
  # @option opts [String] :idempotency_key The request&#39;s idempotency key
  # @return [ListResponseMessageAttemptEndpointOut]
  describe 'list_attempts_for_endpoint_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_attempt_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for resend_webhook_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_resend_post
  # Resend Webhook
  # Resend a message to the specified endpoint.
  # @param endpoint_id 
  # @param msg_id 
  # @param app_id 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :idempotency_key The request&#39;s idempotency key
  # @return [nil]
  describe 'resend_webhook_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_resend_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
