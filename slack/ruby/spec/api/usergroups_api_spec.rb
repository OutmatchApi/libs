=begin
#Slack Web API

#One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.

The version of the OpenAPI document: 1.7.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.1

=end

require 'spec_helper'
require 'json'

# Unit tests for slack::UsergroupsApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'UsergroupsApi' do
  before do
    # run before each test
    @api_instance = slack::UsergroupsApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of UsergroupsApi' do
    it 'should create an instance of UsergroupsApi' do
      expect(@api_instance).to be_instance_of(slack::UsergroupsApi)
    end
  end

  # unit tests for usergroups_create
  # Create a User Group
  # @param token Authentication token. Requires scope: &#x60;usergroups:write&#x60;
  # @param name A name for the User Group. Must be unique among User Groups.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :channels A comma separated string of encoded channel IDs for which the User Group uses as a default.
  # @option opts [String] :description A short description of the User Group.
  # @option opts [String] :handle A mention handle. Must be unique among channels, users and User Groups.
  # @option opts [Boolean] :include_count Include the number of users in each User Group.
  # @return [UsergroupsCreateSchema]
  describe 'usergroups_create test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for usergroups_disable
  # Disable an existing User Group
  # @param token Authentication token. Requires scope: &#x60;usergroups:write&#x60;
  # @param usergroup The encoded ID of the User Group to disable.
  # @param [Hash] opts the optional parameters
  # @option opts [Boolean] :include_count Include the number of users in the User Group.
  # @return [UsergroupsDisableSchema]
  describe 'usergroups_disable test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for usergroups_enable
  # Enable a User Group
  # @param token Authentication token. Requires scope: &#x60;usergroups:write&#x60;
  # @param usergroup The encoded ID of the User Group to enable.
  # @param [Hash] opts the optional parameters
  # @option opts [Boolean] :include_count Include the number of users in the User Group.
  # @return [UsergroupsEnableSchema]
  describe 'usergroups_enable test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for usergroups_list
  # List all User Groups for a team
  # @param token Authentication token. Requires scope: &#x60;usergroups:read&#x60;
  # @param [Hash] opts the optional parameters
  # @option opts [Boolean] :include_users Include the list of users for each User Group.
  # @option opts [Boolean] :include_count Include the number of users in each User Group.
  # @option opts [Boolean] :include_disabled Include disabled User Groups.
  # @return [UsergroupsListSchema]
  describe 'usergroups_list test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for usergroups_update
  # Update an existing User Group
  # @param token Authentication token. Requires scope: &#x60;usergroups:write&#x60;
  # @param usergroup The encoded ID of the User Group to update.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :channels A comma separated string of encoded channel IDs for which the User Group uses as a default.
  # @option opts [String] :description A short description of the User Group.
  # @option opts [String] :handle A mention handle. Must be unique among channels, users and User Groups.
  # @option opts [Boolean] :include_count Include the number of users in the User Group.
  # @option opts [String] :name A name for the User Group. Must be unique among User Groups.
  # @return [UsergroupsUpdateSchema]
  describe 'usergroups_update test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for usergroups_users_list
  # List all users in a User Group
  # @param token Authentication token. Requires scope: &#x60;usergroups:read&#x60;
  # @param usergroup The encoded ID of the User Group to update.
  # @param [Hash] opts the optional parameters
  # @option opts [Boolean] :include_disabled Allow results that involve disabled User Groups.
  # @return [UsergroupsUsersListSchema]
  describe 'usergroups_users_list test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for usergroups_users_update
  # Update the list of users for a User Group
  # @param token Authentication token. Requires scope: &#x60;usergroups:write&#x60;
  # @param usergroup The encoded ID of the User Group to update.
  # @param users A comma separated string of encoded user IDs that represent the entire list of users for the User Group.
  # @param [Hash] opts the optional parameters
  # @option opts [Boolean] :include_count Include the number of users in the User Group.
  # @return [UsergroupsUsersUpdateSchema]
  describe 'usergroups_users_update test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
