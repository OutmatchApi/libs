=begin
#Slack Web API

#One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.

The version of the OpenAPI document: 1.7.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.1

=end

require 'spec_helper'
require 'json'

# Unit tests for slack::CallsApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'CallsApi' do
  before do
    # run before each test
    @api_instance = slack::CallsApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of CallsApi' do
    it 'should create an instance of CallsApi' do
      expect(@api_instance).to be_instance_of(slack::CallsApi)
    end
  end

  # unit tests for calls_add
  # Registers a new Call.
  # @param token Authentication token. Requires scope: &#x60;calls:write&#x60;
  # @param external_unique_id An ID supplied by the 3rd-party Call provider. It must be unique across all Calls from that service.
  # @param join_url The URL required for a client to join the Call.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :created_by The valid Slack user ID of the user who created this Call. When this method is called with a user token, the &#x60;created_by&#x60; field is optional and defaults to the authed user of the token. Otherwise, the field is required.
  # @option opts [Integer] :date_start Call start time in UTC UNIX timestamp format
  # @option opts [String] :desktop_app_join_url When supplied, available Slack clients will attempt to directly launch the 3rd-party Call with this URL.
  # @option opts [String] :external_display_id An optional, human-readable ID supplied by the 3rd-party Call provider. If supplied, this ID will be displayed in the Call object.
  # @option opts [String] :title The name of the Call.
  # @option opts [String] :users The list of users to register as participants in the Call. [Read more on how to specify users here](/apis/calls#users).
  # @return [DefaultSuccessTemplate]
  describe 'calls_add test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for calls_end
  # Ends a Call.
  # @param token Authentication token. Requires scope: &#x60;calls:write&#x60;
  # @param id &#x60;id&#x60; returned when registering the call using the [&#x60;calls.add&#x60;](/methods/calls.add) method.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :duration Call duration in seconds
  # @return [DefaultSuccessTemplate]
  describe 'calls_end test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for calls_info
  # Returns information about a Call.
  # @param token Authentication token. Requires scope: &#x60;calls:read&#x60;
  # @param id &#x60;id&#x60; of the Call returned by the [&#x60;calls.add&#x60;](/methods/calls.add) method.
  # @param [Hash] opts the optional parameters
  # @return [DefaultSuccessTemplate]
  describe 'calls_info test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for calls_participants_add
  # Registers new participants added to a Call.
  # @param token Authentication token. Requires scope: &#x60;calls:write&#x60;
  # @param id &#x60;id&#x60; returned by the [&#x60;calls.add&#x60;](/methods/calls.add) method.
  # @param users The list of users to add as participants in the Call. [Read more on how to specify users here](/apis/calls#users).
  # @param [Hash] opts the optional parameters
  # @return [DefaultSuccessTemplate]
  describe 'calls_participants_add test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for calls_participants_remove
  # Registers participants removed from a Call.
  # @param token Authentication token. Requires scope: &#x60;calls:write&#x60;
  # @param id &#x60;id&#x60; returned by the [&#x60;calls.add&#x60;](/methods/calls.add) method.
  # @param users The list of users to remove as participants in the Call. [Read more on how to specify users here](/apis/calls#users).
  # @param [Hash] opts the optional parameters
  # @return [DefaultSuccessTemplate]
  describe 'calls_participants_remove test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for calls_update
  # Updates information about a Call.
  # @param token Authentication token. Requires scope: &#x60;calls:write&#x60;
  # @param id &#x60;id&#x60; returned by the [&#x60;calls.add&#x60;](/methods/calls.add) method.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :desktop_app_join_url When supplied, available Slack clients will attempt to directly launch the 3rd-party Call with this URL.
  # @option opts [String] :join_url The URL required for a client to join the Call.
  # @option opts [String] :title The name of the Call.
  # @return [DefaultSuccessTemplate]
  describe 'calls_update test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end