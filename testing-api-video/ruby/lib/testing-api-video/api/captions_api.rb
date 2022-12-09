=begin
#api.video

#api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.

The version of the OpenAPI document: 1.0.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.1

=end

require 'cgi'

module testing-api-video
  class CaptionsApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Delete a caption
    # Delete a caption in a specific language by providing the video ID for the video you want to delete the caption from and the language the caption is in.
    # @param video_id [String] The unique identifier for the video you want to delete a caption from.
    # @param language [String] A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def d_elete_videos_video_id_captions_language(video_id, language, opts = {})
      d_elete_videos_video_id_captions_language_with_http_info(video_id, language, opts)
      nil
    end

    # Delete a caption
    # Delete a caption in a specific language by providing the video ID for the video you want to delete the caption from and the language the caption is in.
    # @param video_id [String] The unique identifier for the video you want to delete a caption from.
    # @param language [String] A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Integer, Hash)>] nil, response status code and response headers
    def d_elete_videos_video_id_captions_language_with_http_info(video_id, language, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: CaptionsApi.d_elete_videos_video_id_captions_language ...'
      end
      # verify the required parameter 'video_id' is set
      if @api_client.config.client_side_validation && video_id.nil?
        fail ArgumentError, "Missing the required parameter 'video_id' when calling CaptionsApi.d_elete_videos_video_id_captions_language"
      end
      # verify the required parameter 'language' is set
      if @api_client.config.client_side_validation && language.nil?
        fail ArgumentError, "Missing the required parameter 'language' when calling CaptionsApi.d_elete_videos_video_id_captions_language"
      end
      # resource path
      local_var_path = '/videos/{videoId}/captions/{language}'.sub('{' + 'videoId' + '}', CGI.escape(video_id.to_s)).sub('{' + 'language' + '}', CGI.escape(language.to_s))

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type]

      # auth_names
      auth_names = opts[:debug_auth_names] || ['bearerAuth']

      new_options = opts.merge(
        :operation => :"CaptionsApi.d_elete_videos_video_id_captions_language",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:DELETE, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: CaptionsApi#d_elete_videos_video_id_captions_language\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # List video captions
    # Retrieve a list of available captions for the videoId you provide.
    # @param [Hash] opts the parameters
    # @option opts [String] :video_id The unique identifier for the video you want to retrieve a list of captions for. (required)
    # @option opts [Integer] :current_page Choose the number of search results to return per page. Minimum value: 1 (default to 1)
    # @option opts [Integer] :page_size Results per page. Allowed values 1-100, default is 25. (default to 25)
    # @return [CaptionsListResponse]
    def g_et_videos_video_id_captions(opts = {})
      data, _status_code, _headers = g_et_videos_video_id_captions_with_http_info(opts)
      data
    end

    # List video captions
    # Retrieve a list of available captions for the videoId you provide.
    # @param [Hash] opts the parameters
    # @option opts [String] :video_id The unique identifier for the video you want to retrieve a list of captions for. (required)
    # @option opts [Integer] :current_page Choose the number of search results to return per page. Minimum value: 1 (default to 1)
    # @option opts [Integer] :page_size Results per page. Allowed values 1-100, default is 25. (default to 25)
    # @return [Array<(CaptionsListResponse, Integer, Hash)>] CaptionsListResponse data, response status code and response headers
    def g_et_videos_video_id_captions_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: CaptionsApi.g_et_videos_video_id_captions ...'
      end
      # unbox the parameters from the hash
      video_id = opts[:'video_id']
      # verify the required parameter 'video_id' is set
      if @api_client.config.client_side_validation && video_id.nil?
        fail ArgumentError, "Missing the required parameter 'video_id' when calling CaptionsApi.g_et_videos_video_id_captions"
      end
      # resource path
      local_var_path = '/videos/{videoId}/captions'.sub('{' + 'videoId' + '}', CGI.escape(video_id.to_s))

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'currentPage'] = opts[:'current_page'] if !opts[:'current_page'].nil?
      query_params[:'pageSize'] = opts[:'page_size'] if !opts[:'page_size'].nil?

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'CaptionsListResponse'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['bearerAuth']

      new_options = opts.merge(
        :operation => :"CaptionsApi.g_et_videos_video_id_captions",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: CaptionsApi#g_et_videos_video_id_captions\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Show a caption
    # Display a caption for a video in a specific language. If the language is available, the caption is returned. Otherwise, you will get a response indicating the caption was not found. Tutorials that use the [captions endpoint](https://api.video/blog/endpoints/captions).
    # @param video_id [String] The unique identifier for the video you want captions for.
    # @param language [String] A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation
    # @param [Hash] opts the optional parameters
    # @return [Subtitle]
    def g_et_videos_video_id_captions_language(video_id, language, opts = {})
      data, _status_code, _headers = g_et_videos_video_id_captions_language_with_http_info(video_id, language, opts)
      data
    end

    # Show a caption
    # Display a caption for a video in a specific language. If the language is available, the caption is returned. Otherwise, you will get a response indicating the caption was not found. Tutorials that use the [captions endpoint](https://api.video/blog/endpoints/captions).
    # @param video_id [String] The unique identifier for the video you want captions for.
    # @param language [String] A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation
    # @param [Hash] opts the optional parameters
    # @return [Array<(Subtitle, Integer, Hash)>] Subtitle data, response status code and response headers
    def g_et_videos_video_id_captions_language_with_http_info(video_id, language, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: CaptionsApi.g_et_videos_video_id_captions_language ...'
      end
      # verify the required parameter 'video_id' is set
      if @api_client.config.client_side_validation && video_id.nil?
        fail ArgumentError, "Missing the required parameter 'video_id' when calling CaptionsApi.g_et_videos_video_id_captions_language"
      end
      # verify the required parameter 'language' is set
      if @api_client.config.client_side_validation && language.nil?
        fail ArgumentError, "Missing the required parameter 'language' when calling CaptionsApi.g_et_videos_video_id_captions_language"
      end
      # resource path
      local_var_path = '/videos/{videoId}/captions/{language}'.sub('{' + 'videoId' + '}', CGI.escape(video_id.to_s)).sub('{' + 'language' + '}', CGI.escape(language.to_s))

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'Subtitle'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['bearerAuth']

      new_options = opts.merge(
        :operation => :"CaptionsApi.g_et_videos_video_id_captions_language",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: CaptionsApi#g_et_videos_video_id_captions_language\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Update caption
    # To have the captions on automatically, use this PATCH to set default: true.
    # @param video_id [String] The unique identifier for the video you want to have automatic captions for. 
    # @param language [String] A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.
    # @param [Hash] opts the optional parameters
    # @option opts [CaptionsUpdatePayload] :captions_update_payload 
    # @return [Subtitle]
    def p_atch_videos_video_id_captions_language(video_id, language, opts = {})
      data, _status_code, _headers = p_atch_videos_video_id_captions_language_with_http_info(video_id, language, opts)
      data
    end

    # Update caption
    # To have the captions on automatically, use this PATCH to set default: true.
    # @param video_id [String] The unique identifier for the video you want to have automatic captions for. 
    # @param language [String] A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.
    # @param [Hash] opts the optional parameters
    # @option opts [CaptionsUpdatePayload] :captions_update_payload 
    # @return [Array<(Subtitle, Integer, Hash)>] Subtitle data, response status code and response headers
    def p_atch_videos_video_id_captions_language_with_http_info(video_id, language, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: CaptionsApi.p_atch_videos_video_id_captions_language ...'
      end
      # verify the required parameter 'video_id' is set
      if @api_client.config.client_side_validation && video_id.nil?
        fail ArgumentError, "Missing the required parameter 'video_id' when calling CaptionsApi.p_atch_videos_video_id_captions_language"
      end
      # verify the required parameter 'language' is set
      if @api_client.config.client_side_validation && language.nil?
        fail ArgumentError, "Missing the required parameter 'language' when calling CaptionsApi.p_atch_videos_video_id_captions_language"
      end
      # resource path
      local_var_path = '/videos/{videoId}/captions/{language}'.sub('{' + 'videoId' + '}', CGI.escape(video_id.to_s)).sub('{' + 'language' + '}', CGI.escape(language.to_s))

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      content_type = @api_client.select_header_content_type(['application/json'])
      if !content_type.nil?
          header_params['Content-Type'] = content_type
      end

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body] || @api_client.object_to_http_body(opts[:'captions_update_payload'])

      # return_type
      return_type = opts[:debug_return_type] || 'Subtitle'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['bearerAuth']

      new_options = opts.merge(
        :operation => :"CaptionsApi.p_atch_videos_video_id_captions_language",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:PATCH, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: CaptionsApi#p_atch_videos_video_id_captions_language\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Upload a caption
    # Upload a VTT file to add captions to your video.  Read our [captioning tutorial](https://api.video/blog/tutorials/adding-captions) for more details.
    # @param video_id [String] The unique identifier for the video you want to add a caption to.
    # @param language [String] A valid BCP 47 language representation.
    # @param file [File] The video text track (VTT) you want to upload.
    # @param [Hash] opts the optional parameters
    # @return [Subtitle]
    def p_ost_videos_video_id_captions_language(video_id, language, file, opts = {})
      data, _status_code, _headers = p_ost_videos_video_id_captions_language_with_http_info(video_id, language, file, opts)
      data
    end

    # Upload a caption
    # Upload a VTT file to add captions to your video.  Read our [captioning tutorial](https://api.video/blog/tutorials/adding-captions) for more details.
    # @param video_id [String] The unique identifier for the video you want to add a caption to.
    # @param language [String] A valid BCP 47 language representation.
    # @param file [File] The video text track (VTT) you want to upload.
    # @param [Hash] opts the optional parameters
    # @return [Array<(Subtitle, Integer, Hash)>] Subtitle data, response status code and response headers
    def p_ost_videos_video_id_captions_language_with_http_info(video_id, language, file, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: CaptionsApi.p_ost_videos_video_id_captions_language ...'
      end
      # verify the required parameter 'video_id' is set
      if @api_client.config.client_side_validation && video_id.nil?
        fail ArgumentError, "Missing the required parameter 'video_id' when calling CaptionsApi.p_ost_videos_video_id_captions_language"
      end
      # verify the required parameter 'language' is set
      if @api_client.config.client_side_validation && language.nil?
        fail ArgumentError, "Missing the required parameter 'language' when calling CaptionsApi.p_ost_videos_video_id_captions_language"
      end
      # verify the required parameter 'file' is set
      if @api_client.config.client_side_validation && file.nil?
        fail ArgumentError, "Missing the required parameter 'file' when calling CaptionsApi.p_ost_videos_video_id_captions_language"
      end
      # resource path
      local_var_path = '/videos/{videoId}/captions/{language}'.sub('{' + 'videoId' + '}', CGI.escape(video_id.to_s)).sub('{' + 'language' + '}', CGI.escape(language.to_s))

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      content_type = @api_client.select_header_content_type(['multipart/form-data'])
      if !content_type.nil?
          header_params['Content-Type'] = content_type
      end

      # form parameters
      form_params = opts[:form_params] || {}
      form_params['file'] = file

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'Subtitle'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['bearerAuth']

      new_options = opts.merge(
        :operation => :"CaptionsApi.p_ost_videos_video_id_captions_language",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: CaptionsApi#p_ost_videos_video_id_captions_language\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end