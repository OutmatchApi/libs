=begin
#api.video

#api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.

The version of the OpenAPI document: 1.0.1

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.1

=end

# Common files
require 'video-api/api_client'
require 'video-api/api_error'
require 'video-api/version'
require 'video-api/configuration'

# Models
require 'video-api/models/access_token'
require 'video-api/models/account'
require 'video-api/models/account_quota'
require 'video-api/models/authenticate_payload'
require 'video-api/models/bad_request'
require 'video-api/models/bytes_range'
require 'video-api/models/captions_list_response'
require 'video-api/models/captions_update_payload'
require 'video-api/models/chapter'
require 'video-api/models/chapters_list_response'
require 'video-api/models/link'
require 'video-api/models/live_stream'
require 'video-api/models/live_stream_assets'
require 'video-api/models/live_stream_create_payload'
require 'video-api/models/live_stream_list_response'
require 'video-api/models/live_stream_session'
require 'video-api/models/live_stream_session_client'
require 'video-api/models/live_stream_session_device'
require 'video-api/models/live_stream_session_location'
require 'video-api/models/live_stream_session_referrer'
require 'video-api/models/live_stream_session_session'
require 'video-api/models/live_stream_update_payload'
require 'video-api/models/metadata'
require 'video-api/models/not_found'
require 'video-api/models/pagination'
require 'video-api/models/pagination_link'
require 'video-api/models/player'
require 'video-api/models/player_all_of'
require 'video-api/models/player_all_of_assets'
require 'video-api/models/player_creation_payload'
require 'video-api/models/player_session_event'
require 'video-api/models/player_update_payload'
require 'video-api/models/playerinput'
require 'video-api/models/players_list_response'
require 'video-api/models/quality'
require 'video-api/models/raw_statistics_list_live_stream_analytics_response'
require 'video-api/models/raw_statistics_list_player_session_events_response'
require 'video-api/models/raw_statistics_list_sessions_response'
require 'video-api/models/refresh_token_payload'
require 'video-api/models/subtitle'
require 'video-api/models/token_create_payload'
require 'video-api/models/token_list_response'
require 'video-api/models/upload_token'
require 'video-api/models/video'
require 'video-api/models/video_assets'
require 'video-api/models/video_create_payload'
require 'video-api/models/video_session'
require 'video-api/models/video_session_client'
require 'video-api/models/video_session_device'
require 'video-api/models/video_session_location'
require 'video-api/models/video_session_os'
require 'video-api/models/video_session_referrer'
require 'video-api/models/video_session_session'
require 'video-api/models/video_source'
require 'video-api/models/video_source_live_stream'
require 'video-api/models/video_source_live_stream_link'
require 'video-api/models/video_thumbnail_pick_payload'
require 'video-api/models/video_update_payload'
require 'video-api/models/videos_list_response'
require 'video-api/models/videostatus'
require 'video-api/models/videostatus_encoding'
require 'video-api/models/videostatus_encoding_metadata'
require 'video-api/models/videostatus_ingest'
require 'video-api/models/webhook'
require 'video-api/models/webhooks_create_payload'
require 'video-api/models/webhooks_list_response'

# APIs
require 'video-api/api/account_api'
require 'video-api/api/analytics_api'
require 'video-api/api/authentication_api'
require 'video-api/api/captions_api'
require 'video-api/api/chapters_api'
require 'video-api/api/live_api'
require 'video-api/api/players_api'
require 'video-api/api/videos_api'
require 'video-api/api/videos_delegated_upload_api'
require 'video-api/api/webhooks_api'

module video-api
  class << self
    # Customize default settings for the SDK using block.
    #   video-api.configure do |config|
    #     config.username = "xxx"
    #     config.password = "xxx"
    #   end
    # If no block given, return the default Configuration object.
    def configure
      if block_given?
        yield(Configuration.default)
      else
        Configuration.default
      end
    end
  end
end
