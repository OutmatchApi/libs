=begin
#Slack Web API

#One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.

The version of the OpenAPI document: 1.7.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.1

=end

require 'spec_helper'
require 'json'

# Unit tests for slack::AdminTeamsOwnersApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'AdminTeamsOwnersApi' do
  before do
    # run before each test
    @api_instance = slack::AdminTeamsOwnersApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of AdminTeamsOwnersApi' do
    it 'should create an instance of AdminTeamsOwnersApi' do
      expect(@api_instance).to be_instance_of(slack::AdminTeamsOwnersApi)
    end
  end

  # unit tests for admin_teams_owners_list
  # List all of the owners on a given workspace.
  # @param token Authentication token. Requires scope: &#x60;admin.teams:read&#x60;
  # @param team_id 
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :limit The maximum number of items to return. Must be between 1 - 1000 both inclusive.
  # @option opts [String] :cursor Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page.
  # @return [DefaultSuccessTemplate]
  describe 'admin_teams_owners_list test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
