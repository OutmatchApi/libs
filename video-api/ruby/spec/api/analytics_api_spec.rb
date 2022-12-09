=begin
#api.video

#api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.

The version of the OpenAPI document: 1.0.1

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.1

=end

require 'spec_helper'
require 'json'

# Unit tests for video-api::AnalyticsApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'AnalyticsApi' do
  before do
    # run before each test
    @api_instance = video-api::AnalyticsApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of AnalyticsApi' do
    it 'should create an instance of AnalyticsApi' do
      expect(@api_instance).to be_instance_of(video-api::AnalyticsApi)
    end
  end

  # unit tests for g_et_analytics_live_streams_live_stream_id
  # List live stream player sessions
  # @param live_stream_id The unique identifier for the live stream you want to retrieve analytics for.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :period Period must have one of the following formats:  - For a day : \&quot;2018-01-01\&quot;, - For a week: \&quot;2018-W01\&quot;,  - For a month: \&quot;2018-01\&quot; - For a year: \&quot;2018\&quot; For a range period:  -  Date range: \&quot;2018-01-01/2018-01-15\&quot; 
  # @option opts [Integer] :current_page Choose the number of search results to return per page. Minimum value: 1
  # @option opts [Integer] :page_size Results per page. Allowed values 1-100, default is 25.
  # @return [RawStatisticsListLiveStreamAnalyticsResponse]
  describe 'g_et_analytics_live_streams_live_stream_id test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for g_et_analytics_sessions_session_id_events
  # List player session events
  # Useful to track and measure video&#39;s engagement.
  # @param session_id A unique identifier you can use to reference and track a session with.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :current_page Choose the number of search results to return per page. Minimum value: 1
  # @option opts [Integer] :page_size Results per page. Allowed values 1-100, default is 25.
  # @return [RawStatisticsListPlayerSessionEventsResponse]
  describe 'g_et_analytics_sessions_session_id_events test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for g_et_analytics_videos_video_id
  # List video player sessions
  # Retrieve all available user sessions for a specific video. Tutorials that use the [analytics endpoint](https://api.video/blog/endpoints/analytics).
  # @param video_id The unique identifier for the video you want to retrieve session information for.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :period Period must have one of the following formats:  - For a day : 2018-01-01, - For a week: 2018-W01,  - For a month: 2018-01 - For a year: 2018 For a range period:  -  Date range: 2018-01-01/2018-01-15 
  # @option opts [Array<String>] :metadata Metadata and [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) filter. Send an array of key value pairs you want to filter sessios with.
  # @option opts [Integer] :current_page Choose the number of search results to return per page. Minimum value: 1
  # @option opts [Integer] :page_size Results per page. Allowed values 1-100, default is 25.
  # @return [RawStatisticsListSessionsResponse]
  describe 'g_et_analytics_videos_video_id test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
