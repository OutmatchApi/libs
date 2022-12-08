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

# Unit tests for slack::ConversationObjectParentConversationInner
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe slack::ConversationObjectParentConversationInner do
  let(:instance) { slack::ConversationObjectParentConversationInner.new }

  describe 'test an instance of ConversationObjectParentConversationInner' do
    it 'should create an instance of ConversationObjectParentConversationInner' do
      expect(instance).to be_instance_of(slack::ConversationObjectParentConversationInner)
    end
  end
end
