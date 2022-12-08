=begin
#Slack Web API

#One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.

The version of the OpenAPI document: 1.7.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.1

=end

require 'spec_helper'
require 'json'

# Unit tests for slack::AdminTeamsSettingsApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'AdminTeamsSettingsApi' do
  before do
    # run before each test
    @api_instance = slack::AdminTeamsSettingsApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of AdminTeamsSettingsApi' do
    it 'should create an instance of AdminTeamsSettingsApi' do
      expect(@api_instance).to be_instance_of(slack::AdminTeamsSettingsApi)
    end
  end

  # unit tests for admin_teams_settings_info
  # Fetch information about settings in a workspace
  # @param token Authentication token. Requires scope: &#x60;admin.teams:read&#x60;
  # @param team_id 
  # @param [Hash] opts the optional parameters
  # @return [DefaultSuccessTemplate]
  describe 'admin_teams_settings_info test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for admin_teams_settings_set_default_channels
  # Set the default channels of a workspace.
  # @param channel_ids An array of channel IDs.
  # @param team_id ID for the workspace to set the default channel for.
  # @param token Authentication token. Requires scope: &#x60;admin.teams:write&#x60;
  # @param [Hash] opts the optional parameters
  # @return [DefaultSuccessTemplate]
  describe 'admin_teams_settings_set_default_channels test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for admin_teams_settings_set_description
  # Set the description of a given workspace.
  # @param token Authentication token. Requires scope: &#x60;admin.teams:write&#x60;
  # @param description The new description for the workspace.
  # @param team_id ID for the workspace to set the description for.
  # @param [Hash] opts the optional parameters
  # @return [DefaultSuccessTemplate]
  describe 'admin_teams_settings_set_description test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for admin_teams_settings_set_discoverability
  # An API method that allows admins to set the discoverability of a given workspace
  # @param token Authentication token. Requires scope: &#x60;admin.teams:write&#x60;
  # @param discoverability This workspace&#39;s discovery setting. It must be set to one of &#x60;open&#x60;, &#x60;invite_only&#x60;, &#x60;closed&#x60;, or &#x60;unlisted&#x60;.
  # @param team_id The ID of the workspace to set discoverability on.
  # @param [Hash] opts the optional parameters
  # @return [DefaultSuccessTemplate]
  describe 'admin_teams_settings_set_discoverability test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for admin_teams_settings_set_icon
  # Sets the icon of a workspace.
  # @param image_url Image URL for the icon
  # @param team_id ID for the workspace to set the icon for.
  # @param token Authentication token. Requires scope: &#x60;admin.teams:write&#x60;
  # @param [Hash] opts the optional parameters
  # @return [DefaultSuccessTemplate]
  describe 'admin_teams_settings_set_icon test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for admin_teams_settings_set_name
  # Set the name of a given workspace.
  # @param token Authentication token. Requires scope: &#x60;admin.teams:write&#x60;
  # @param name The new name of the workspace.
  # @param team_id ID for the workspace to set the name for.
  # @param [Hash] opts the optional parameters
  # @return [DefaultSuccessTemplate]
  describe 'admin_teams_settings_set_name test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
