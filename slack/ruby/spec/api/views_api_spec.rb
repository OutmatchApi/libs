=begin
#Slack Web API

#One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.

The version of the OpenAPI document: 1.7.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.1

=end

require 'spec_helper'
require 'json'

# Unit tests for slack::ViewsApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'ViewsApi' do
  before do
    # run before each test
    @api_instance = slack::ViewsApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of ViewsApi' do
    it 'should create an instance of ViewsApi' do
      expect(@api_instance).to be_instance_of(slack::ViewsApi)
    end
  end

  # unit tests for views_open
  # Open a view for a user.
  # @param token Authentication token. Requires scope: &#x60;none&#x60;
  # @param trigger_id Exchange a trigger to post to the user.
  # @param view A [view payload](/reference/surfaces/views). This must be a JSON-encoded string.
  # @param [Hash] opts the optional parameters
  # @return [DefaultSuccessTemplate]
  describe 'views_open test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for views_publish
  # Publish a static view for a User.
  # @param token Authentication token. Requires scope: &#x60;none&#x60;
  # @param user_id &#x60;id&#x60; of the user you want publish a view to.
  # @param view A [view payload](/reference/surfaces/views). This must be a JSON-encoded string.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :hash A string that represents view state to protect against possible race conditions.
  # @return [DefaultSuccessTemplate]
  describe 'views_publish test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for views_push
  # Push a view onto the stack of a root view.
  # @param token Authentication token. Requires scope: &#x60;none&#x60;
  # @param trigger_id Exchange a trigger to post to the user.
  # @param view A [view payload](/reference/surfaces/views). This must be a JSON-encoded string.
  # @param [Hash] opts the optional parameters
  # @return [DefaultSuccessTemplate]
  describe 'views_push test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for views_update
  # Update an existing view.
  # @param token Authentication token. Requires scope: &#x60;none&#x60;
  # @param [Hash] opts the optional parameters
  # @option opts [String] :view_id A unique identifier of the view to be updated. Either &#x60;view_id&#x60; or &#x60;external_id&#x60; is required.
  # @option opts [String] :external_id A unique identifier of the view set by the developer. Must be unique for all views on a team. Max length of 255 characters. Either &#x60;view_id&#x60; or &#x60;external_id&#x60; is required.
  # @option opts [String] :view A [view object](/reference/surfaces/views). This must be a JSON-encoded string.
  # @option opts [String] :hash A string that represents view state to protect against possible race conditions.
  # @return [DefaultSuccessTemplate]
  describe 'views_update test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
