=begin
#Slack Web API

#One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.

The version of the OpenAPI document: 1.7.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.1

=end

require 'spec_helper'
require 'json'

# Unit tests for slack::UsersApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'UsersApi' do
  before do
    # run before each test
    @api_instance = slack::UsersApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of UsersApi' do
    it 'should create an instance of UsersApi' do
      expect(@api_instance).to be_instance_of(slack::UsersApi)
    end
  end

  # unit tests for users_conversations
  # List conversations the calling user may access.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :token Authentication token. Requires scope: &#x60;conversations:read&#x60;
  # @option opts [String] :user Browse conversations by a specific user ID&#39;s membership. Non-public channels are restricted to those where the calling user shares membership.
  # @option opts [String] :types Mix and match channel types by providing a comma-separated list of any combination of &#x60;public_channel&#x60;, &#x60;private_channel&#x60;, &#x60;mpim&#x60;, &#x60;im&#x60;
  # @option opts [Boolean] :exclude_archived Set to &#x60;true&#x60; to exclude archived channels from the list
  # @option opts [Integer] :limit The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn&#39;t been reached. Must be an integer no larger than 1000.
  # @option opts [String] :cursor Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail.
  # @return [UsersConversationsSuccessSchema]
  describe 'users_conversations test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for users_delete_photo
  # Delete the user profile photo
  # @param token Authentication token. Requires scope: &#x60;users.profile:write&#x60;
  # @param [Hash] opts the optional parameters
  # @return [UsersDeletePhotoSchema]
  describe 'users_delete_photo test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for users_get_presence
  # Gets user presence information.
  # @param token Authentication token. Requires scope: &#x60;users:read&#x60;
  # @param [Hash] opts the optional parameters
  # @option opts [String] :user User to get presence info on. Defaults to the authed user.
  # @return [APIMethodUsersGetPresence]
  describe 'users_get_presence test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for users_identity
  # Get a user&#39;s identity.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :token Authentication token. Requires scope: &#x60;identity.basic&#x60;
  # @return [Array<UsersIdentitySchemaInner>]
  describe 'users_identity test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for users_info
  # Gets information about a user.
  # @param token Authentication token. Requires scope: &#x60;users:read&#x60;
  # @param [Hash] opts the optional parameters
  # @option opts [Boolean] :include_locale Set this to &#x60;true&#x60; to receive the locale for this user. Defaults to &#x60;false&#x60;
  # @option opts [String] :user User to get info on
  # @return [UsersInfoSuccessSchema]
  describe 'users_info test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for users_list
  # Lists all users in a Slack team.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :token Authentication token. Requires scope: &#x60;users:read&#x60;
  # @option opts [Integer] :limit The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the users list hasn&#39;t been reached. Providing no &#x60;limit&#x60; value will result in Slack attempting to deliver you the entire result set. If the collection is too large you may experience &#x60;limit_required&#x60; or HTTP 500 errors.
  # @option opts [String] :cursor Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail.
  # @option opts [Boolean] :include_locale Set this to &#x60;true&#x60; to receive the locale for users. Defaults to &#x60;false&#x60;
  # @return [UsersListSchema]
  describe 'users_list test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for users_lookup_by_email
  # Find a user with an email address.
  # @param token Authentication token. Requires scope: &#x60;users:read.email&#x60;
  # @param email An email address belonging to a user in the workspace
  # @param [Hash] opts the optional parameters
  # @return [UsersLookupByEmailSuccessSchema]
  describe 'users_lookup_by_email test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for users_profile_get
  # Retrieves a user&#39;s profile information.
  # @param token Authentication token. Requires scope: &#x60;users.profile:read&#x60;
  # @param [Hash] opts the optional parameters
  # @option opts [Boolean] :include_labels Include labels for each ID in custom profile fields
  # @option opts [String] :user User to retrieve profile info for
  # @return [UsersProfileGetSchema]
  describe 'users_profile_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for users_profile_set
  # Set the profile information for a user.
  # @param token Authentication token. Requires scope: &#x60;users.profile:write&#x60;
  # @param [Hash] opts the optional parameters
  # @option opts [String] :name Name of a single key to set. Usable only if &#x60;profile&#x60; is not passed.
  # @option opts [String] :profile Collection of key:value pairs presented as a URL-encoded JSON hash. At most 50 fields may be set. Each field name is limited to 255 characters.
  # @option opts [String] :user ID of user to change. This argument may only be specified by team admins on paid teams.
  # @option opts [String] :value Value to set a single key to. Usable only if &#x60;profile&#x60; is not passed.
  # @return [UsersProfileSetSchema]
  describe 'users_profile_set test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for users_set_active
  # Marked a user as active. Deprecated and non-functional.
  # @param token Authentication token. Requires scope: &#x60;users:write&#x60;
  # @param [Hash] opts the optional parameters
  # @return [UsersSetActiveSchema]
  describe 'users_set_active test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for users_set_photo
  # Set the user profile photo
  # @param token Authentication token. Requires scope: &#x60;users.profile:write&#x60;
  # @param [Hash] opts the optional parameters
  # @option opts [String] :crop_w Width/height of crop box (always square)
  # @option opts [String] :crop_x X coordinate of top-left corner of crop box
  # @option opts [String] :crop_y Y coordinate of top-left corner of crop box
  # @option opts [String] :image File contents via &#x60;multipart/form-data&#x60;.
  # @return [UsersSetPhotoSchema]
  describe 'users_set_photo test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for users_set_presence
  # Manually sets user presence.
  # @param token Authentication token. Requires scope: &#x60;users:write&#x60;
  # @param presence Either &#x60;auto&#x60; or &#x60;away&#x60;
  # @param [Hash] opts the optional parameters
  # @return [UsersSetPresenceSchema]
  describe 'users_set_presence test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
