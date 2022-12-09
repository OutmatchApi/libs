=begin
#api.video

#api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.

The version of the OpenAPI document: 1.0.1

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.1

=end

require 'spec_helper'
require 'json'

# Unit tests for apivideo::WebhooksApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'WebhooksApi' do
  before do
    # run before each test
    @api_instance = apivideo::WebhooksApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of WebhooksApi' do
    it 'should create an instance of WebhooksApi' do
      expect(@api_instance).to be_instance_of(apivideo::WebhooksApi)
    end
  end

  # unit tests for d_elete_webhook
  # Delete a Webhook
  # This endpoint will delete the indicated webhook.
  # @param webhook_id The webhook you wish to delete.
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'd_elete_webhook test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for g_et_webhook
  # Show Webhook details
  # This call provides the same JSON information provided on Webjhook creation.
  # @param webhook_id The unique webhook you wish to retreive details on.
  # @param [Hash] opts the optional parameters
  # @return [Webhook]
  describe 'g_et_webhook test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for l_ist_webhooks
  # List all webhooks
  # Requests to this endpoint return a list of your webhooks (with all their details). You can filter what the webhook list that the API returns using the parameters described below.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :events The webhook event that you wish to filter on.
  # @option opts [Integer] :current_page Choose the number of search results to return per page. Minimum value: 1
  # @option opts [Integer] :page_size Results per page. Allowed values 1-100, default is 25.
  # @return [WebhooksListResponse]
  describe 'l_ist_webhooks test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for p_ost_webhooks
  # Create Webhook
  # Webhooks can push notifications to your server, rather than polling api.video for changes. We currently offer four events:  * &#x60;&#x60;&#x60;video.encoding.quality.completed&#x60;&#x60;&#x60;  When a new video is uploaded into your account, it will be encoded into several different HLS sizes/bitrates.  When each version is encoded, your webhook will get a notification.  It will look like &#x60;&#x60;&#x60;{ \\\&quot;type\\\&quot;: \\\&quot;video.encoding.quality.completed\\\&quot;, \\\&quot;emittedAt\\\&quot;: \\\&quot;2021-01-29T16:46:25.217+01:00\\\&quot;, \\\&quot;videoId\\\&quot;: \\\&quot;viXXXXXXXX\\\&quot;, \\\&quot;encoding\\\&quot;: \\\&quot;hls\\\&quot;, \\\&quot;quality\\\&quot;: \\\&quot;720p\\\&quot;} &#x60;&#x60;&#x60;. This request says that the 720p HLS encoding was completed. * &#x60;&#x60;&#x60;live-stream.broadcast.started&#x60;&#x60;&#x60;  When a livestream begins broadcasting, the broadcasting parameter changes from false to true, and this webhook fires. * &#x60;&#x60;&#x60;live-stream.broadcast.ended&#x60;&#x60;&#x60;  This event fores when the livestream has finished broadcasting, and the broadcasting parameter flips from false to true. * &#x60;&#x60;&#x60;video.source.recorded&#x60;&#x60;&#x60;  This event is similar to &#x60;&#x60;&#x60;video.encoding.quality.completed&#x60;&#x60;&#x60;, but tells you if a livestream has been recorded as a VOD.
  # @param [Hash] opts the optional parameters
  # @option opts [WebhooksCreatePayload] :webhooks_create_payload 
  # @return [Webhook]
  describe 'p_ost_webhooks test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
