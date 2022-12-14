=begin
#Slack Web API

#One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.

The version of the OpenAPI document: 1.7.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.1

=end

require 'spec_helper'
require 'json'

# Unit tests for slack::AppsEventAuthorizationsApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'AppsEventAuthorizationsApi' do
  before do
    # run before each test
    @api_instance = slack::AppsEventAuthorizationsApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of AppsEventAuthorizationsApi' do
    it 'should create an instance of AppsEventAuthorizationsApi' do
      expect(@api_instance).to be_instance_of(slack::AppsEventAuthorizationsApi)
    end
  end

  # unit tests for apps_event_authorizations_list
  # Get a list of authorizations for the given event context. Each authorization represents an app installation that the event is visible to.
  # @param token Authentication token. Requires scope: &#x60;authorizations:read&#x60;
  # @param event_context 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :cursor 
  # @option opts [Integer] :limit 
  # @return [DefaultSuccessTemplate]
  describe 'apps_event_authorizations_list test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
