=begin
#Slack Web API

#One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.

The version of the OpenAPI document: 1.7.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.1

=end

require 'cgi'

module slack
  class DndApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Ends the current user's Do Not Disturb session immediately.
    # @param token [String] Authentication token. Requires scope: &#x60;dnd:write&#x60;
    # @param [Hash] opts the optional parameters
    # @return [DndEndDndSchema]
    def dnd_end_dnd(token, opts = {})
      data, _status_code, _headers = dnd_end_dnd_with_http_info(token, opts)
      data
    end

    # Ends the current user&#39;s Do Not Disturb session immediately.
    # @param token [String] Authentication token. Requires scope: &#x60;dnd:write&#x60;
    # @param [Hash] opts the optional parameters
    # @return [Array<(DndEndDndSchema, Integer, Hash)>] DndEndDndSchema data, response status code and response headers
    def dnd_end_dnd_with_http_info(token, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: DndApi.dnd_end_dnd ...'
      end
      # verify the required parameter 'token' is set
      if @api_client.config.client_side_validation && token.nil?
        fail ArgumentError, "Missing the required parameter 'token' when calling DndApi.dnd_end_dnd"
      end
      # resource path
      local_var_path = '/dnd.endDnd'

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      header_params[:'token'] = token

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'DndEndDndSchema'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['slackAuth']

      new_options = opts.merge(
        :operation => :"DndApi.dnd_end_dnd",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: DndApi#dnd_end_dnd\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Ends the current user's snooze mode immediately.
    # @param token [String] Authentication token. Requires scope: &#x60;dnd:write&#x60;
    # @param [Hash] opts the optional parameters
    # @return [DndEndSnoozeSchema]
    def dnd_end_snooze(token, opts = {})
      data, _status_code, _headers = dnd_end_snooze_with_http_info(token, opts)
      data
    end

    # Ends the current user&#39;s snooze mode immediately.
    # @param token [String] Authentication token. Requires scope: &#x60;dnd:write&#x60;
    # @param [Hash] opts the optional parameters
    # @return [Array<(DndEndSnoozeSchema, Integer, Hash)>] DndEndSnoozeSchema data, response status code and response headers
    def dnd_end_snooze_with_http_info(token, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: DndApi.dnd_end_snooze ...'
      end
      # verify the required parameter 'token' is set
      if @api_client.config.client_side_validation && token.nil?
        fail ArgumentError, "Missing the required parameter 'token' when calling DndApi.dnd_end_snooze"
      end
      # resource path
      local_var_path = '/dnd.endSnooze'

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      header_params[:'token'] = token

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'DndEndSnoozeSchema'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['slackAuth']

      new_options = opts.merge(
        :operation => :"DndApi.dnd_end_snooze",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: DndApi#dnd_end_snooze\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Retrieves a user's current Do Not Disturb status.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :token Authentication token. Requires scope: &#x60;dnd:read&#x60;
    # @option opts [String] :user User to fetch status for (defaults to current user)
    # @return [DndInfoSchema]
    def dnd_info(opts = {})
      data, _status_code, _headers = dnd_info_with_http_info(opts)
      data
    end

    # Retrieves a user&#39;s current Do Not Disturb status.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :token Authentication token. Requires scope: &#x60;dnd:read&#x60;
    # @option opts [String] :user User to fetch status for (defaults to current user)
    # @return [Array<(DndInfoSchema, Integer, Hash)>] DndInfoSchema data, response status code and response headers
    def dnd_info_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: DndApi.dnd_info ...'
      end
      # resource path
      local_var_path = '/dnd.info'

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'token'] = opts[:'token'] if !opts[:'token'].nil?
      query_params[:'user'] = opts[:'user'] if !opts[:'user'].nil?

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'DndInfoSchema'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['slackAuth']

      new_options = opts.merge(
        :operation => :"DndApi.dnd_info",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: DndApi#dnd_info\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Turns on Do Not Disturb mode for the current user, or changes its duration.
    # @param num_minutes [String] Number of minutes, from now, to snooze until.
    # @param token [String] Authentication token. Requires scope: &#x60;dnd:write&#x60;
    # @param [Hash] opts the optional parameters
    # @return [DndSetSnoozeSchema]
    def dnd_set_snooze(num_minutes, token, opts = {})
      data, _status_code, _headers = dnd_set_snooze_with_http_info(num_minutes, token, opts)
      data
    end

    # Turns on Do Not Disturb mode for the current user, or changes its duration.
    # @param num_minutes [String] Number of minutes, from now, to snooze until.
    # @param token [String] Authentication token. Requires scope: &#x60;dnd:write&#x60;
    # @param [Hash] opts the optional parameters
    # @return [Array<(DndSetSnoozeSchema, Integer, Hash)>] DndSetSnoozeSchema data, response status code and response headers
    def dnd_set_snooze_with_http_info(num_minutes, token, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: DndApi.dnd_set_snooze ...'
      end
      # verify the required parameter 'num_minutes' is set
      if @api_client.config.client_side_validation && num_minutes.nil?
        fail ArgumentError, "Missing the required parameter 'num_minutes' when calling DndApi.dnd_set_snooze"
      end
      # verify the required parameter 'token' is set
      if @api_client.config.client_side_validation && token.nil?
        fail ArgumentError, "Missing the required parameter 'token' when calling DndApi.dnd_set_snooze"
      end
      # resource path
      local_var_path = '/dnd.setSnooze'

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      content_type = @api_client.select_header_content_type(['application/x-www-form-urlencoded'])
      if !content_type.nil?
          header_params['Content-Type'] = content_type
      end

      # form parameters
      form_params = opts[:form_params] || {}
      form_params['num_minutes'] = num_minutes
      form_params['token'] = token

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'DndSetSnoozeSchema'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['slackAuth']

      new_options = opts.merge(
        :operation => :"DndApi.dnd_set_snooze",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: DndApi#dnd_set_snooze\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Retrieves the Do Not Disturb status for up to 50 users on a team.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :token Authentication token. Requires scope: &#x60;dnd:read&#x60;
    # @option opts [String] :users Comma-separated list of users to fetch Do Not Disturb status for
    # @return [DefaultSuccessTemplate]
    def dnd_team_info(opts = {})
      data, _status_code, _headers = dnd_team_info_with_http_info(opts)
      data
    end

    # Retrieves the Do Not Disturb status for up to 50 users on a team.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :token Authentication token. Requires scope: &#x60;dnd:read&#x60;
    # @option opts [String] :users Comma-separated list of users to fetch Do Not Disturb status for
    # @return [Array<(DefaultSuccessTemplate, Integer, Hash)>] DefaultSuccessTemplate data, response status code and response headers
    def dnd_team_info_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: DndApi.dnd_team_info ...'
      end
      # resource path
      local_var_path = '/dnd.teamInfo'

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'token'] = opts[:'token'] if !opts[:'token'].nil?
      query_params[:'users'] = opts[:'users'] if !opts[:'users'].nil?

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'DefaultSuccessTemplate'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['slackAuth']

      new_options = opts.merge(
        :operation => :"DndApi.dnd_team_info",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: DndApi#dnd_team_info\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
