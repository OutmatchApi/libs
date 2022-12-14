=begin
#Slack Web API

#One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.

The version of the OpenAPI document: 1.7.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.1

=end

require 'cgi'

module slack
  class AdminUsersSessionApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Invalidate a single session for a user by session_id
    # @param token [String] Authentication token. Requires scope: &#x60;admin.users:write&#x60;
    # @param session_id [Integer] 
    # @param team_id [String] ID of the team that the session belongs to
    # @param [Hash] opts the optional parameters
    # @return [DefaultSuccessTemplate]
    def admin_users_session_invalidate(token, session_id, team_id, opts = {})
      data, _status_code, _headers = admin_users_session_invalidate_with_http_info(token, session_id, team_id, opts)
      data
    end

    # Invalidate a single session for a user by session_id
    # @param token [String] Authentication token. Requires scope: &#x60;admin.users:write&#x60;
    # @param session_id [Integer] 
    # @param team_id [String] ID of the team that the session belongs to
    # @param [Hash] opts the optional parameters
    # @return [Array<(DefaultSuccessTemplate, Integer, Hash)>] DefaultSuccessTemplate data, response status code and response headers
    def admin_users_session_invalidate_with_http_info(token, session_id, team_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: AdminUsersSessionApi.admin_users_session_invalidate ...'
      end
      # verify the required parameter 'token' is set
      if @api_client.config.client_side_validation && token.nil?
        fail ArgumentError, "Missing the required parameter 'token' when calling AdminUsersSessionApi.admin_users_session_invalidate"
      end
      # verify the required parameter 'session_id' is set
      if @api_client.config.client_side_validation && session_id.nil?
        fail ArgumentError, "Missing the required parameter 'session_id' when calling AdminUsersSessionApi.admin_users_session_invalidate"
      end
      # verify the required parameter 'team_id' is set
      if @api_client.config.client_side_validation && team_id.nil?
        fail ArgumentError, "Missing the required parameter 'team_id' when calling AdminUsersSessionApi.admin_users_session_invalidate"
      end
      # resource path
      local_var_path = '/admin.users.session.invalidate'

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
      header_params[:'token'] = token

      # form parameters
      form_params = opts[:form_params] || {}
      form_params['session_id'] = session_id
      form_params['team_id'] = team_id

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'DefaultSuccessTemplate'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['slackAuth']

      new_options = opts.merge(
        :operation => :"AdminUsersSessionApi.admin_users_session_invalidate",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AdminUsersSessionApi#admin_users_session_invalidate\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Wipes all valid sessions on all devices for a given user
    # @param token [String] Authentication token. Requires scope: &#x60;admin.users:write&#x60;
    # @param user_id [String] The ID of the user to wipe sessions for
    # @param [Hash] opts the optional parameters
    # @option opts [Boolean] :mobile_only Only expire mobile sessions (default: false)
    # @option opts [Boolean] :web_only Only expire web sessions (default: false)
    # @return [DefaultSuccessTemplate]
    def admin_users_session_reset(token, user_id, opts = {})
      data, _status_code, _headers = admin_users_session_reset_with_http_info(token, user_id, opts)
      data
    end

    # Wipes all valid sessions on all devices for a given user
    # @param token [String] Authentication token. Requires scope: &#x60;admin.users:write&#x60;
    # @param user_id [String] The ID of the user to wipe sessions for
    # @param [Hash] opts the optional parameters
    # @option opts [Boolean] :mobile_only Only expire mobile sessions (default: false)
    # @option opts [Boolean] :web_only Only expire web sessions (default: false)
    # @return [Array<(DefaultSuccessTemplate, Integer, Hash)>] DefaultSuccessTemplate data, response status code and response headers
    def admin_users_session_reset_with_http_info(token, user_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: AdminUsersSessionApi.admin_users_session_reset ...'
      end
      # verify the required parameter 'token' is set
      if @api_client.config.client_side_validation && token.nil?
        fail ArgumentError, "Missing the required parameter 'token' when calling AdminUsersSessionApi.admin_users_session_reset"
      end
      # verify the required parameter 'user_id' is set
      if @api_client.config.client_side_validation && user_id.nil?
        fail ArgumentError, "Missing the required parameter 'user_id' when calling AdminUsersSessionApi.admin_users_session_reset"
      end
      # resource path
      local_var_path = '/admin.users.session.reset'

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
      header_params[:'token'] = token

      # form parameters
      form_params = opts[:form_params] || {}
      form_params['user_id'] = user_id
      form_params['mobile_only'] = opts[:'mobile_only'] if !opts[:'mobile_only'].nil?
      form_params['web_only'] = opts[:'web_only'] if !opts[:'web_only'].nil?

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'DefaultSuccessTemplate'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['slackAuth']

      new_options = opts.merge(
        :operation => :"AdminUsersSessionApi.admin_users_session_reset",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AdminUsersSessionApi#admin_users_session_reset\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
