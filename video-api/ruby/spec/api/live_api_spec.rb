=begin
#api.video

#api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.

The version of the OpenAPI document: 1.0.1

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.1

=end

require 'spec_helper'
require 'json'

# Unit tests for video-api::LiveApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'LiveApi' do
  before do
    # run before each test
    @api_instance = video-api::LiveApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of LiveApi' do
    it 'should create an instance of LiveApi' do
      expect(@api_instance).to be_instance_of(video-api::LiveApi)
    end
  end

  # unit tests for d_elete_live_streams_live_stream_id
  # Delete a live stream
  # @param live_stream_id The unique ID for the live stream that you want to remove.
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'd_elete_live_streams_live_stream_id test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for d_elete_live_streams_live_stream_id_thumbnail
  # Delete a thumbnail
  # Send the unique identifier for a live stream to delete it from the system.
  # @param live_stream_id The unique identifier for the live stream you want to delete. 
  # @param [Hash] opts the optional parameters
  # @return [LiveStream]
  describe 'd_elete_live_streams_live_stream_id_thumbnail test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for g_et_live_streams
  # List all live streams
  # With no parameters added to the url, this will return all livestreams. Query by name or key to limit the list.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :stream_key The unique stream key that allows you to stream videos.
  # @option opts [String] :name You can filter live streams by their name or a part of their name.
  # @option opts [String] :sort_by Allowed: createdAt, publishedAt, name. createdAt - the time a livestream was created using the specified streamKey. publishedAt - the time a livestream was published using the specified streamKey. name - the name of the livestream. If you choose one of the time based options, the time is presented in ISO-8601 format.
  # @option opts [String] :sort_order Allowed: asc, desc. Ascending for date and time means that earlier values precede later ones. Descending means that later values preced earlier ones. For title, it is 0-9 and A-Z ascending and Z-A, 9-0 descending.
  # @option opts [Integer] :current_page Choose the number of search results to return per page. Minimum value: 1
  # @option opts [Integer] :page_size Results per page. Allowed values 1-100, default is 25.
  # @return [LiveStreamListResponse]
  describe 'g_et_live_streams test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for g_et_live_streams_live_stream_id
  # Show live stream
  # Supply a LivestreamId, and you&#39;ll get all the details for streaming into, and watching the livestream. Tutorials that use the [show livestream endpoint](https://api.video/blog/endpoints/live-stream-status).
  # @param live_stream_id The unique ID for the live stream you want to watch.
  # @param [Hash] opts the optional parameters
  # @return [LiveStream]
  describe 'g_et_live_streams_live_stream_id test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for p_atch_live_streams_live_stream_id
  # Update a live stream
  # Use this endpoint to update the player, or to turn recording on/off (saving a copy of the livestream). NOTE: If the livestream is actively streaming, changing the recording status will only affect the NEXT stream.    The public&#x3D;false &#39;private livestream&#39; is available as a BETA feature, and should be limited to livestreams of 3,000 viewers or fewer.
  # @param live_stream_id The unique ID for the live stream that you want to update information for such as player details, or whether you want the recording on or off.
  # @param [Hash] opts the optional parameters
  # @option opts [LiveStreamUpdatePayload] :live_stream_update_payload 
  # @return [LiveStream]
  describe 'p_atch_live_streams_live_stream_id test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for p_ost_live_streams
  # Create live stream
  # A live stream will give you the &#39;connection point&#39; to RTMP your video stream to api.video. It will also give you the details for viewers to watch the same livestream.  The public&#x3D;false &#39;private livestream&#39; is available as a BETA feature, and should be limited to livestreams of 3,000 viewers or fewer. See our [Live Stream Tutorial](https://api.video/blog/tutorials/live-stream-tutorial) for a walkthrough of this API with OBS. Your RTMP endpoint for the livestream is rtmp://broadcast.api.video/s/{streamKey} Tutorials that [create live streams](https://api.video/blog/endpoints/live-create).
  # @param [Hash] opts the optional parameters
  # @option opts [LiveStreamCreatePayload] :live_stream_create_payload 
  # @return [LiveStream]
  describe 'p_ost_live_streams test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for p_ost_live_streams_live_stream_id_thumbnail
  # Upload a thumbnail
  # Upload an image to use as a backdrop for your livestream. Tutorials that [update live stream thumbnails](https://api.video/blog/endpoints/live-upload-a-thumbnail).
  # @param live_stream_id The unique ID for the live stream you want to upload.
  # @param file The image to be added as a thumbnail.
  # @param [Hash] opts the optional parameters
  # @return [LiveStream]
  describe 'p_ost_live_streams_live_stream_id_thumbnail test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
