=begin
#Slack Web API

#One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.

The version of the OpenAPI document: 1.7.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.1

=end

require 'spec_helper'
require 'json'

# Unit tests for slack::AdminUsersApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'AdminUsersApi' do
  before do
    # run before each test
    @api_instance = slack::AdminUsersApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of AdminUsersApi' do
    it 'should create an instance of AdminUsersApi' do
      expect(@api_instance).to be_instance_of(slack::AdminUsersApi)
    end
  end

  # unit tests for admin_users_assign
  # Add an Enterprise user to a workspace.
  # @param token Authentication token. Requires scope: &#x60;admin.users:write&#x60;
  # @param team_id The ID (&#x60;T1234&#x60;) of the workspace.
  # @param user_id The ID of the user to add to the workspace.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :channel_ids Comma separated values of channel IDs to add user in the new workspace.
  # @option opts [Boolean] :is_restricted True if user should be added to the workspace as a guest.
  # @option opts [Boolean] :is_ultra_restricted True if user should be added to the workspace as a single-channel guest.
  # @return [DefaultSuccessTemplate]
  describe 'admin_users_assign test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for admin_users_invite
  # Invite a user to a workspace.
  # @param token Authentication token. Requires scope: &#x60;admin.users:write&#x60;
  # @param channel_ids A comma-separated list of &#x60;channel_id&#x60;s for this user to join. At least one channel is required.
  # @param email The email address of the person to invite.
  # @param team_id The ID (&#x60;T1234&#x60;) of the workspace.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :custom_message An optional message to send to the user in the invite email.
  # @option opts [String] :guest_expiration_ts Timestamp when guest account should be disabled. Only include this timestamp if you are inviting a guest user and you want their account to expire on a certain date.
  # @option opts [Boolean] :is_restricted Is this user a multi-channel guest user? (default: false)
  # @option opts [Boolean] :is_ultra_restricted Is this user a single channel guest user? (default: false)
  # @option opts [String] :real_name Full name of the user.
  # @option opts [Boolean] :resend Allow this invite to be resent in the future if a user has not signed up yet. (default: false)
  # @return [DefaultSuccessTemplate]
  describe 'admin_users_invite test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for admin_users_list
  # List users on a workspace
  # @param token Authentication token. Requires scope: &#x60;admin.users:read&#x60;
  # @param team_id The ID (&#x60;T1234&#x60;) of the workspace.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :cursor Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page.
  # @option opts [Integer] :limit Limit for how many users to be retrieved per page
  # @return [DefaultSuccessTemplate]
  describe 'admin_users_list test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for admin_users_remove
  # Remove a user from a workspace.
  # @param token Authentication token. Requires scope: &#x60;admin.users:write&#x60;
  # @param team_id The ID (&#x60;T1234&#x60;) of the workspace.
  # @param user_id The ID of the user to remove.
  # @param [Hash] opts the optional parameters
  # @return [DefaultSuccessTemplate]
  describe 'admin_users_remove test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for admin_users_set_admin
  # Set an existing guest, regular user, or owner to be an admin user.
  # @param token Authentication token. Requires scope: &#x60;admin.users:write&#x60;
  # @param team_id The ID (&#x60;T1234&#x60;) of the workspace.
  # @param user_id The ID of the user to designate as an admin.
  # @param [Hash] opts the optional parameters
  # @return [DefaultSuccessTemplate]
  describe 'admin_users_set_admin test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for admin_users_set_expiration
  # Set an expiration for a guest user
  # @param token Authentication token. Requires scope: &#x60;admin.users:write&#x60;
  # @param expiration_ts Timestamp when guest account should be disabled.
  # @param team_id The ID (&#x60;T1234&#x60;) of the workspace.
  # @param user_id The ID of the user to set an expiration for.
  # @param [Hash] opts the optional parameters
  # @return [DefaultSuccessTemplate]
  describe 'admin_users_set_expiration test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for admin_users_set_owner
  # Set an existing guest, regular user, or admin user to be a workspace owner.
  # @param token Authentication token. Requires scope: &#x60;admin.users:write&#x60;
  # @param team_id The ID (&#x60;T1234&#x60;) of the workspace.
  # @param user_id Id of the user to promote to owner.
  # @param [Hash] opts the optional parameters
  # @return [DefaultSuccessTemplate]
  describe 'admin_users_set_owner test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for admin_users_set_regular
  # Set an existing guest user, admin user, or owner to be a regular user.
  # @param token Authentication token. Requires scope: &#x60;admin.users:write&#x60;
  # @param team_id The ID (&#x60;T1234&#x60;) of the workspace.
  # @param user_id The ID of the user to designate as a regular user.
  # @param [Hash] opts the optional parameters
  # @return [DefaultSuccessTemplate]
  describe 'admin_users_set_regular test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end