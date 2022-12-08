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

# Unit tests for slack::TeamProfileGetErrorSchema
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe slack::TeamProfileGetErrorSchema do
  let(:instance) { slack::TeamProfileGetErrorSchema.new }

  describe 'test an instance of TeamProfileGetErrorSchema' do
    it 'should create an instance of TeamProfileGetErrorSchema' do
      expect(instance).to be_instance_of(slack::TeamProfileGetErrorSchema)
    end
  end
  describe 'test attribute "callstack"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "error"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
      # validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["not_authed", "invalid_auth", "account_inactive", "no_permission", "user_is_bot", "invalid_arg_name", "invalid_array_arg", "invalid_charset", "invalid_form_data", "invalid_post_typ", "missing_post_type", "team_added_to_org", "invalid_json", "json_not_object", "request_timeou", "upgrade_required"])
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
