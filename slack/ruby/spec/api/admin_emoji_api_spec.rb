=begin
#Slack Web API

#One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.

The version of the OpenAPI document: 1.7.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.1

=end

require 'spec_helper'
require 'json'

# Unit tests for slack::AdminEmojiApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'AdminEmojiApi' do
  before do
    # run before each test
    @api_instance = slack::AdminEmojiApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of AdminEmojiApi' do
    it 'should create an instance of AdminEmojiApi' do
      expect(@api_instance).to be_instance_of(slack::AdminEmojiApi)
    end
  end

  # unit tests for admin_emoji_add
  # Add an emoji.
  # @param name The name of the emoji to be removed. Colons (&#x60;:myemoji:&#x60;) around the value are not required, although they may be included.
  # @param token Authentication token. Requires scope: &#x60;admin.teams:write&#x60;
  # @param url The URL of a file to use as an image for the emoji. Square images under 128KB and with transparent backgrounds work best.
  # @param [Hash] opts the optional parameters
  # @return [DefaultSuccessTemplate]
  describe 'admin_emoji_add test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for admin_emoji_add_alias
  # Add an emoji alias.
  # @param alias_for The alias of the emoji.
  # @param name The name of the emoji to be aliased. Colons (&#x60;:myemoji:&#x60;) around the value are not required, although they may be included.
  # @param token Authentication token. Requires scope: &#x60;admin.teams:write&#x60;
  # @param [Hash] opts the optional parameters
  # @return [DefaultSuccessTemplate]
  describe 'admin_emoji_add_alias test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for admin_emoji_list
  # List emoji for an Enterprise Grid organization.
  # @param token Authentication token. Requires scope: &#x60;admin.teams:read&#x60;
  # @param [Hash] opts the optional parameters
  # @option opts [String] :cursor Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page
  # @option opts [Integer] :limit The maximum number of items to return. Must be between 1 - 1000 both inclusive.
  # @return [DefaultSuccessTemplate]
  describe 'admin_emoji_list test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for admin_emoji_remove
  # Remove an emoji across an Enterprise Grid organization
  # @param name The name of the emoji to be removed. Colons (&#x60;:myemoji:&#x60;) around the value are not required, although they may be included.
  # @param token Authentication token. Requires scope: &#x60;admin.teams:write&#x60;
  # @param [Hash] opts the optional parameters
  # @return [DefaultSuccessTemplate]
  describe 'admin_emoji_remove test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for admin_emoji_rename
  # Rename an emoji.
  # @param name The name of the emoji to be renamed. Colons (&#x60;:myemoji:&#x60;) around the value are not required, although they may be included.
  # @param new_name The new name of the emoji.
  # @param token Authentication token. Requires scope: &#x60;admin.teams:write&#x60;
  # @param [Hash] opts the optional parameters
  # @return [DefaultSuccessTemplate]
  describe 'admin_emoji_rename test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
