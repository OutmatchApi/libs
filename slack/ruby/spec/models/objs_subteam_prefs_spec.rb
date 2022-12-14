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

# Unit tests for slack::ObjsSubteamPrefs
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe slack::ObjsSubteamPrefs do
  let(:instance) { slack::ObjsSubteamPrefs.new }

  describe 'test an instance of ObjsSubteamPrefs' do
    it 'should create an instance of ObjsSubteamPrefs' do
      expect(instance).to be_instance_of(slack::ObjsSubteamPrefs)
    end
  end
  describe 'test attribute "channels"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "groups"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
