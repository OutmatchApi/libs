=begin
#Slack Web API

#One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.

The version of the OpenAPI document: 1.7.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.1

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for slack::ConversationsLeaveSuccessSchema
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe slack::ConversationsLeaveSuccessSchema do
  let(:instance) { slack::ConversationsLeaveSuccessSchema.new }

  describe 'test an instance of ConversationsLeaveSuccessSchema' do
    it 'should create an instance of ConversationsLeaveSuccessSchema' do
      expect(instance).to be_instance_of(slack::ConversationsLeaveSuccessSchema)
    end
  end
  describe 'test attribute "not_in_channel"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
      # validator = Petstore::EnumTest::EnumAttributeValidator.new('Boolean', ["true"])
      # validator.allowable_values.each do |value|
      #   expect { instance.not_in_channel = value }.not_to raise_error
      # end
    end
  end

  describe 'test attribute "ok"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end