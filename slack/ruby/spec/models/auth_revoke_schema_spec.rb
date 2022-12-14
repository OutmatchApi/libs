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

# Unit tests for slack::AuthRevokeSchema
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe slack::AuthRevokeSchema do
  let(:instance) { slack::AuthRevokeSchema.new }

  describe 'test an instance of AuthRevokeSchema' do
    it 'should create an instance of AuthRevokeSchema' do
      expect(instance).to be_instance_of(slack::AuthRevokeSchema)
    end
  end
  describe 'test attribute "ok"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "revoked"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
