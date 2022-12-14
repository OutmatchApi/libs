=begin
#Slack Web API

#One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.

The version of the OpenAPI document: 1.7.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.1

=end

require 'spec_helper'
require 'json'

# Unit tests for slack::AppsPermissionsScopesApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'AppsPermissionsScopesApi' do
  before do
    # run before each test
    @api_instance = slack::AppsPermissionsScopesApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of AppsPermissionsScopesApi' do
    it 'should create an instance of AppsPermissionsScopesApi' do
      expect(@api_instance).to be_instance_of(slack::AppsPermissionsScopesApi)
    end
  end

  # unit tests for apps_permissions_scopes_list
  # Returns list of scopes this app has on a team.
  # @param token Authentication token. Requires scope: &#x60;none&#x60;
  # @param [Hash] opts the optional parameters
  # @return [ApiPermissionsScopesListSuccessSchema]
  describe 'apps_permissions_scopes_list test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
