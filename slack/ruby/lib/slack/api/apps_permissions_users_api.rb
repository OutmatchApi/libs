=begin
#Slack Web API

#One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.

The version of the OpenAPI document: 1.7.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.1

=end

require 'cgi'

module slack
  class AppsPermissionsUsersApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Returns list of user grants and corresponding scopes this app has on a team.
    # @param token [String] Authentication token. Requires scope: &#x60;none&#x60;
    # @param [Hash] opts the optional parameters
    # @option opts [String] :cursor Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail.
    # @option opts [Integer] :limit The maximum number of items to return.
    # @return [DefaultSuccessTemplate]
    def apps_permissions_users_list(token, opts = {})
      data, _status_code, _headers = apps_permissions_users_list_with_http_info(token, opts)
      data
    end

    # Returns list of user grants and corresponding scopes this app has on a team.
    # @param token [String] Authentication token. Requires scope: &#x60;none&#x60;
    # @param [Hash] opts the optional parameters
    # @option opts [String] :cursor Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail.
    # @option opts [Integer] :limit The maximum number of items to return.
    # @return [Array<(DefaultSuccessTemplate, Integer, Hash)>] DefaultSuccessTemplate data, response status code and response headers
    def apps_permissions_users_list_with_http_info(token, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: AppsPermissionsUsersApi.apps_permissions_users_list ...'
      end
      # verify the required parameter 'token' is set
      if @api_client.config.client_side_validation && token.nil?
        fail ArgumentError, "Missing the required parameter 'token' when calling AppsPermissionsUsersApi.apps_permissions_users_list"
      end
      # resource path
      local_var_path = '/apps.permissions.users.list'

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'token'] = token
      query_params[:'cursor'] = opts[:'cursor'] if !opts[:'cursor'].nil?
      query_params[:'limit'] = opts[:'limit'] if !opts[:'limit'].nil?

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
        :operation => :"AppsPermissionsUsersApi.apps_permissions_users_list",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AppsPermissionsUsersApi#apps_permissions_users_list\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Enables an app to trigger a permissions modal to grant an app access to a user access scope.
    # @param token [String] Authentication token. Requires scope: &#x60;none&#x60;
    # @param scopes [String] A comma separated list of user scopes to request for
    # @param trigger_id [String] Token used to trigger the request
    # @param user [String] The user this scope is being requested for
    # @param [Hash] opts the optional parameters
    # @return [DefaultSuccessTemplate]
    def apps_permissions_users_request(token, scopes, trigger_id, user, opts = {})
      data, _status_code, _headers = apps_permissions_users_request_with_http_info(token, scopes, trigger_id, user, opts)
      data
    end

    # Enables an app to trigger a permissions modal to grant an app access to a user access scope.
    # @param token [String] Authentication token. Requires scope: &#x60;none&#x60;
    # @param scopes [String] A comma separated list of user scopes to request for
    # @param trigger_id [String] Token used to trigger the request
    # @param user [String] The user this scope is being requested for
    # @param [Hash] opts the optional parameters
    # @return [Array<(DefaultSuccessTemplate, Integer, Hash)>] DefaultSuccessTemplate data, response status code and response headers
    def apps_permissions_users_request_with_http_info(token, scopes, trigger_id, user, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: AppsPermissionsUsersApi.apps_permissions_users_request ...'
      end
      # verify the required parameter 'token' is set
      if @api_client.config.client_side_validation && token.nil?
        fail ArgumentError, "Missing the required parameter 'token' when calling AppsPermissionsUsersApi.apps_permissions_users_request"
      end
      # verify the required parameter 'scopes' is set
      if @api_client.config.client_side_validation && scopes.nil?
        fail ArgumentError, "Missing the required parameter 'scopes' when calling AppsPermissionsUsersApi.apps_permissions_users_request"
      end
      # verify the required parameter 'trigger_id' is set
      if @api_client.config.client_side_validation && trigger_id.nil?
        fail ArgumentError, "Missing the required parameter 'trigger_id' when calling AppsPermissionsUsersApi.apps_permissions_users_request"
      end
      # verify the required parameter 'user' is set
      if @api_client.config.client_side_validation && user.nil?
        fail ArgumentError, "Missing the required parameter 'user' when calling AppsPermissionsUsersApi.apps_permissions_users_request"
      end
      # resource path
      local_var_path = '/apps.permissions.users.request'

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'token'] = token
      query_params[:'scopes'] = scopes
      query_params[:'trigger_id'] = trigger_id
      query_params[:'user'] = user

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
        :operation => :"AppsPermissionsUsersApi.apps_permissions_users_request",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AppsPermissionsUsersApi#apps_permissions_users_request\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
