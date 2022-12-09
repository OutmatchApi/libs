=begin
#api.video

#api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.

The version of the OpenAPI document: 1.0.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.1

=end

require 'cgi'

module testing-api-video
  class ChaptersApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Delete a chapter
    # @param video_id [String] The unique identifier for the video you want to delete a chapter from. 
    # @param language [String] A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def d_elete_videos_video_id_chapters_language(video_id, language, opts = {})
      d_elete_videos_video_id_chapters_language_with_http_info(video_id, language, opts)
      nil
    end

    # Delete a chapter
    # @param video_id [String] The unique identifier for the video you want to delete a chapter from. 
    # @param language [String] A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Integer, Hash)>] nil, response status code and response headers
    def d_elete_videos_video_id_chapters_language_with_http_info(video_id, language, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: ChaptersApi.d_elete_videos_video_id_chapters_language ...'
      end
      # verify the required parameter 'video_id' is set
      if @api_client.config.client_side_validation && video_id.nil?
        fail ArgumentError, "Missing the required parameter 'video_id' when calling ChaptersApi.d_elete_videos_video_id_chapters_language"
      end
      # verify the required parameter 'language' is set
      if @api_client.config.client_side_validation && language.nil?
        fail ArgumentError, "Missing the required parameter 'language' when calling ChaptersApi.d_elete_videos_video_id_chapters_language"
      end
      # resource path
      local_var_path = '/videos/{videoId}/chapters/{language}'.sub('{' + 'videoId' + '}', CGI.escape(video_id.to_s)).sub('{' + 'language' + '}', CGI.escape(language.to_s))

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
        :operation => :"ChaptersApi.d_elete_videos_video_id_chapters_language",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:DELETE, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: ChaptersApi#d_elete_videos_video_id_chapters_language\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # List video chapters
    # Retrieve a list of all chapters for a specified video.
    # @param [Hash] opts the parameters
    # @option opts [String] :video_id The unique identifier for the video you want to retrieve a list of chapters for. (required)
    # @option opts [Integer] :current_page Choose the number of search results to return per page. Minimum value: 1 (default to 1)
    # @option opts [Integer] :page_size Results per page. Allowed values 1-100, default is 25. (default to 25)
    # @return [ChaptersListResponse]
    def g_et_videos_video_id_chapters(opts = {})
      data, _status_code, _headers = g_et_videos_video_id_chapters_with_http_info(opts)
      data
    end

    # List video chapters
    # Retrieve a list of all chapters for a specified video.
    # @param [Hash] opts the parameters
    # @option opts [String] :video_id The unique identifier for the video you want to retrieve a list of chapters for. (required)
    # @option opts [Integer] :current_page Choose the number of search results to return per page. Minimum value: 1 (default to 1)
    # @option opts [Integer] :page_size Results per page. Allowed values 1-100, default is 25. (default to 25)
    # @return [Array<(ChaptersListResponse, Integer, Hash)>] ChaptersListResponse data, response status code and response headers
    def g_et_videos_video_id_chapters_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: ChaptersApi.g_et_videos_video_id_chapters ...'
      end
      # unbox the parameters from the hash
      video_id = opts[:'video_id']
      # verify the required parameter 'video_id' is set
      if @api_client.config.client_side_validation && video_id.nil?
        fail ArgumentError, "Missing the required parameter 'video_id' when calling ChaptersApi.g_et_videos_video_id_chapters"
      end
      # resource path
      local_var_path = '/videos/{videoId}/chapters'.sub('{' + 'videoId' + '}', CGI.escape(video_id.to_s))

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
      return_type = opts[:debug_return_type] || 'ChaptersListResponse'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['bearerAuth']

      new_options = opts.merge(
        :operation => :"ChaptersApi.g_et_videos_video_id_chapters",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: ChaptersApi#g_et_videos_video_id_chapters\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Show a chapter
    # Chapters help your viewers find the sections of the video they are most interested in viewing. Tutorials that use the [chapters endpoint](https://api.video/blog/endpoints/chapters).
    # @param video_id [String] The unique identifier for the video you want to show a chapter for.
    # @param language [String] A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.
    # @param [Hash] opts the optional parameters
    # @return [Chapter]
    def g_et_videos_video_id_chapters_language(video_id, language, opts = {})
      data, _status_code, _headers = g_et_videos_video_id_chapters_language_with_http_info(video_id, language, opts)
      data
    end

    # Show a chapter
    # Chapters help your viewers find the sections of the video they are most interested in viewing. Tutorials that use the [chapters endpoint](https://api.video/blog/endpoints/chapters).
    # @param video_id [String] The unique identifier for the video you want to show a chapter for.
    # @param language [String] A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.
    # @param [Hash] opts the optional parameters
    # @return [Array<(Chapter, Integer, Hash)>] Chapter data, response status code and response headers
    def g_et_videos_video_id_chapters_language_with_http_info(video_id, language, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: ChaptersApi.g_et_videos_video_id_chapters_language ...'
      end
      # verify the required parameter 'video_id' is set
      if @api_client.config.client_side_validation && video_id.nil?
        fail ArgumentError, "Missing the required parameter 'video_id' when calling ChaptersApi.g_et_videos_video_id_chapters_language"
      end
      # verify the required parameter 'language' is set
      if @api_client.config.client_side_validation && language.nil?
        fail ArgumentError, "Missing the required parameter 'language' when calling ChaptersApi.g_et_videos_video_id_chapters_language"
      end
      # resource path
      local_var_path = '/videos/{videoId}/chapters/{language}'.sub('{' + 'videoId' + '}', CGI.escape(video_id.to_s)).sub('{' + 'language' + '}', CGI.escape(language.to_s))

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
      return_type = opts[:debug_return_type] || 'Chapter'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['bearerAuth']

      new_options = opts.merge(
        :operation => :"ChaptersApi.g_et_videos_video_id_chapters_language",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: ChaptersApi#g_et_videos_video_id_chapters_language\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Upload a chapter
    # Chapters help break the video into sections. Read our [tutorial](https://api.video/blog/tutorials/adding-chapters-to-your-videos) for more details.
    # @param video_id [String] The unique identifier for the video you want to upload a chapter for.
    # @param language [String] A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.
    # @param file [File] The VTT file describing the chapters you want to upload.
    # @param [Hash] opts the optional parameters
    # @return [Chapter]
    def p_ost_videos_video_id_chapters_language(video_id, language, file, opts = {})
      data, _status_code, _headers = p_ost_videos_video_id_chapters_language_with_http_info(video_id, language, file, opts)
      data
    end

    # Upload a chapter
    # Chapters help break the video into sections. Read our [tutorial](https://api.video/blog/tutorials/adding-chapters-to-your-videos) for more details.
    # @param video_id [String] The unique identifier for the video you want to upload a chapter for.
    # @param language [String] A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.
    # @param file [File] The VTT file describing the chapters you want to upload.
    # @param [Hash] opts the optional parameters
    # @return [Array<(Chapter, Integer, Hash)>] Chapter data, response status code and response headers
    def p_ost_videos_video_id_chapters_language_with_http_info(video_id, language, file, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: ChaptersApi.p_ost_videos_video_id_chapters_language ...'
      end
      # verify the required parameter 'video_id' is set
      if @api_client.config.client_side_validation && video_id.nil?
        fail ArgumentError, "Missing the required parameter 'video_id' when calling ChaptersApi.p_ost_videos_video_id_chapters_language"
      end
      # verify the required parameter 'language' is set
      if @api_client.config.client_side_validation && language.nil?
        fail ArgumentError, "Missing the required parameter 'language' when calling ChaptersApi.p_ost_videos_video_id_chapters_language"
      end
      # verify the required parameter 'file' is set
      if @api_client.config.client_side_validation && file.nil?
        fail ArgumentError, "Missing the required parameter 'file' when calling ChaptersApi.p_ost_videos_video_id_chapters_language"
      end
      # resource path
      local_var_path = '/videos/{videoId}/chapters/{language}'.sub('{' + 'videoId' + '}', CGI.escape(video_id.to_s)).sub('{' + 'language' + '}', CGI.escape(language.to_s))

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
      return_type = opts[:debug_return_type] || 'Chapter'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['bearerAuth']

      new_options = opts.merge(
        :operation => :"ChaptersApi.p_ost_videos_video_id_chapters_language",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: ChaptersApi#p_ost_videos_video_id_chapters_language\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end