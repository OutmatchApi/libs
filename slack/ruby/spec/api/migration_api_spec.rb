=begin
#Slack Web API

#One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.

The version of the OpenAPI document: 1.7.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.1

=end

require 'spec_helper'
require 'json'

# Unit tests for slack::MigrationApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'MigrationApi' do
  before do
    # run before each test
    @api_instance = slack::MigrationApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of MigrationApi' do
    it 'should create an instance of MigrationApi' do
      expect(@api_instance).to be_instance_of(slack::MigrationApi)
    end
  end

  # unit tests for migration_exchange
  # For Enterprise Grid workspaces, map local user IDs to global user IDs
  # @param token Authentication token. Requires scope: &#x60;tokens.basic&#x60;
  # @param users A comma-separated list of user ids, up to 400 per request
  # @param [Hash] opts the optional parameters
  # @option opts [String] :team_id Specify team_id starts with &#x60;T&#x60; in case of Org Token
  # @option opts [Boolean] :to_old Specify &#x60;true&#x60; to convert &#x60;W&#x60; global user IDs to workspace-specific &#x60;U&#x60; IDs. Defaults to &#x60;false&#x60;.
  # @return [MigrationExchangeSuccessSchema]
  describe 'migration_exchange test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
