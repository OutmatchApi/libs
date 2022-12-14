=begin
#Slack Web API

#One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.

The version of the OpenAPI document: 1.7.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.1

=end

require 'spec_helper'
require 'json'

# Unit tests for slack::AuthApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'AuthApi' do
  before do
    # run before each test
    @api_instance = slack::AuthApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of AuthApi' do
    it 'should create an instance of AuthApi' do
      expect(@api_instance).to be_instance_of(slack::AuthApi)
    end
  end

  # unit tests for auth_revoke
  # Revokes a token.
  # @param token Authentication token. Requires scope: &#x60;none&#x60;
  # @param [Hash] opts the optional parameters
  # @option opts [Boolean] :test Setting this parameter to &#x60;1&#x60; triggers a _testing mode_ where the specified token will not actually be revoked.
  # @return [AuthRevokeSchema]
  describe 'auth_revoke test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for auth_test
  # Checks authentication &amp; identity.
  # @param token Authentication token. Requires scope: &#x60;none&#x60;
  # @param [Hash] opts the optional parameters
  # @return [AuthTestSuccessSchema]
  describe 'auth_test test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
