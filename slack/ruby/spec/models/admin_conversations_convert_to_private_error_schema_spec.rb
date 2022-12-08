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

# Unit tests for slack::AdminConversationsConvertToPrivateErrorSchema
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe slack::AdminConversationsConvertToPrivateErrorSchema do
  let(:instance) { slack::AdminConversationsConvertToPrivateErrorSchema.new }

  describe 'test an instance of AdminConversationsConvertToPrivateErrorSchema' do
    it 'should create an instance of AdminConversationsConvertToPrivateErrorSchema' do
      expect(instance).to be_instance_of(slack::AdminConversationsConvertToPrivateErrorSchema)
    end
  end
  describe 'test attribute "error"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
      # validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["feature_not_enabled", "restricted_action", "name_taken", "channel_not_found", "channel_type_not_supported", "default_org_wide_channel", "method_not_supported_for_channel_type", "could_not_convert_channel", "external_channel_migrating"])
      # validator.allowable_values.each do |value|
      #   expect { instance.error = value }.not_to raise_error
      # end
    end
  end

  describe 'test attribute "ok"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end