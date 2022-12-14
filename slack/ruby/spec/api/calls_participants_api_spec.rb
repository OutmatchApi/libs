=begin
#Slack Web API

#One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.

The version of the OpenAPI document: 1.7.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.1

=end

require 'spec_helper'
require 'json'

# Unit tests for slack::CallsParticipantsApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'CallsParticipantsApi' do
  before do
    # run before each test
    @api_instance = slack::CallsParticipantsApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of CallsParticipantsApi' do
    it 'should create an instance of CallsParticipantsApi' do
      expect(@api_instance).to be_instance_of(slack::CallsParticipantsApi)
    end
  end

  # unit tests for calls_participants_add
  # Registers new participants added to a Call.
  # @param token Authentication token. Requires scope: &#x60;calls:write&#x60;
  # @param id &#x60;id&#x60; returned by the [&#x60;calls.add&#x60;](/methods/calls.add) method.
  # @param users The list of users to add as participants in the Call. [Read more on how to specify users here](/apis/calls#users).
  # @param [Hash] opts the optional parameters
  # @return [DefaultSuccessTemplate]
  describe 'calls_participants_add test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for calls_participants_remove
  # Registers participants removed from a Call.
  # @param token Authentication token. Requires scope: &#x60;calls:write&#x60;
  # @param id &#x60;id&#x60; returned by the [&#x60;calls.add&#x60;](/methods/calls.add) method.
  # @param users The list of users to remove as participants in the Call. [Read more on how to specify users here](/apis/calls#users).
  # @param [Hash] opts the optional parameters
  # @return [DefaultSuccessTemplate]
  describe 'calls_participants_remove test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
