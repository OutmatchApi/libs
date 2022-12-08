=begin
#Slack Web API

#One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.

The version of the OpenAPI document: 1.7.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.1

=end

require 'cgi'

module slack
  class AppsApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Get a list of authorizations for the given event context. Each authorization represents an app installation that the event is visible to.
    # @param token [String] Authentication token. Requires scope: &#x60;authorizations:read&#x60;
    # @param event_context [String] 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :cursor 
    # @option opts [Integer] :limit 
    # @return [DefaultSuccessTemplate]
    def apps_event_authorizations_list(token, event_context, opts = {})
      data, _status_code, _headers = apps_event_authorizations_list_with_http_info(token, event_context, opts)
      data
    end

    # Get a list of authorizations for the given event context. Each authorization represents an app installation that the event is visible to.
    # @param token [String] Authentication token. Requires scope: &#x60;authorizations:read&#x60;
    # @param event_context [String] 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :cursor 
    # @option opts [Integer] :limit 
    # @return [Array<(DefaultSuccessTemplate, Integer, Hash)>] DefaultSuccessTemplate data, response status code and response headers
    def apps_event_authorizations_list_with_http_info(token, event_context, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: AppsApi.apps_event_authorizations_list ...'
      end
      # verify the required parameter 'token' is set
      if @api_client.config.client_side_validation && token.nil?
        fail ArgumentError, "Missing the required parameter 'token' when calling AppsApi.apps_event_authorizations_list"
      end
      # verify the required parameter 'event_context' is set
      if @api_client.config.client_side_validation && event_context.nil?
        fail ArgumentError, "Missing the required parameter 'event_context' when calling AppsApi.apps_event_authorizations_list"
      end
      # resource path
      local_var_path = '/apps.event.authorizations.list'

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'event_context'] = event_context
      query_params[:'cursor'] = opts[:'cursor'] if !opts[:'cursor'].nil?
      query_params[:'limit'] = opts[:'limit'] if !opts[:'limit'].nil?

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
      return_type = opts[:debug_return_type] || 'DefaultSuccessTemplate'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['slackAuth']

      new_options = opts.merge(
        :operation => :"AppsApi.apps_event_authorizations_list",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AppsApi#apps_event_authorizations_list\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Returns list of permissions this app has on a team.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :token Authentication token. Requires scope: &#x60;none&#x60;
    # @return [AppsPermissionsInfoSchema]
    def apps_permissions_info(opts = {})
      data, _status_code, _headers = apps_permissions_info_with_http_info(opts)
      data
    end

    # Returns list of permissions this app has on a team.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :token Authentication token. Requires scope: &#x60;none&#x60;
    # @return [Array<(AppsPermissionsInfoSchema, Integer, Hash)>] AppsPermissionsInfoSchema data, response status code and response headers
    def apps_permissions_info_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: AppsApi.apps_permissions_info ...'
      end
      # resource path
      local_var_path = '/apps.permissions.info'

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'token'] = opts[:'token'] if !opts[:'token'].nil?

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'AppsPermissionsInfoSchema'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['slackAuth']

      new_options = opts.merge(
        :operation => :"AppsApi.apps_permissions_info",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AppsApi#apps_permissions_info\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Allows an app to request additional scopes
    # @param token [String] Authentication token. Requires scope: &#x60;none&#x60;
    # @param scopes [String] A comma separated list of scopes to request for
    # @param trigger_id [String] Token used to trigger the permissions API
    # @param [Hash] opts the optional parameters
    # @return [AppsPermissionsRequestSchema]
    def apps_permissions_request(token, scopes, trigger_id, opts = {})
      data, _status_code, _headers = apps_permissions_request_with_http_info(token, scopes, trigger_id, opts)
      data
    end

    # Allows an app to request additional scopes
    # @param token [String] Authentication token. Requires scope: &#x60;none&#x60;
    # @param scopes [String] A comma separated list of scopes to request for
    # @param trigger_id [String] Token used to trigger the permissions API
    # @param [Hash] opts the optional parameters
    # @return [Array<(AppsPermissionsRequestSchema, Integer, Hash)>] AppsPermissionsRequestSchema data, response status code and response headers
    def apps_permissions_request_with_http_info(token, scopes, trigger_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: AppsApi.apps_permissions_request ...'
      end
      # verify the required parameter 'token' is set
      if @api_client.config.client_side_validation && token.nil?
        fail ArgumentError, "Missing the required parameter 'token' when calling AppsApi.apps_permissions_request"
      end
      # verify the required parameter 'scopes' is set
      if @api_client.config.client_side_validation && scopes.nil?
        fail ArgumentError, "Missing the required parameter 'scopes' when calling AppsApi.apps_permissions_request"
      end
      # verify the required parameter 'trigger_id' is set
      if @api_client.config.client_side_validation && trigger_id.nil?
        fail ArgumentError, "Missing the required parameter 'trigger_id' when calling AppsApi.apps_permissions_request"
      end
      # resource path
      local_var_path = '/apps.permissions.request'

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'token'] = token
      query_params[:'scopes'] = scopes
      query_params[:'trigger_id'] = trigger_id

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'AppsPermissionsRequestSchema'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['slackAuth']

      new_options = opts.merge(
        :operation => :"AppsApi.apps_permissions_request",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AppsApi#apps_permissions_request\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Returns list of resource grants this app has on a team.
    # @param token [String] Authentication token. Requires scope: &#x60;none&#x60;
    # @param [Hash] opts the optional parameters
    # @option opts [String] :cursor Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail.
    # @option opts [Integer] :limit The maximum number of items to return.
    # @return [AppsPermissionsResourcesListSuccessSchema]
    def apps_permissions_resources_list(token, opts = {})
      data, _status_code, _headers = apps_permissions_resources_list_with_http_info(token, opts)
      data
    end

    # Returns list of resource grants this app has on a team.
    # @param token [String] Authentication token. Requires scope: &#x60;none&#x60;
    # @param [Hash] opts the optional parameters
    # @option opts [String] :cursor Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail.
    # @option opts [Integer] :limit The maximum number of items to return.
    # @return [Array<(AppsPermissionsResourcesListSuccessSchema, Integer, Hash)>] AppsPermissionsResourcesListSuccessSchema data, response status code and response headers
    def apps_permissions_resources_list_with_http_info(token, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: AppsApi.apps_permissions_resources_list ...'
      end
      # verify the required parameter 'token' is set
      if @api_client.config.client_side_validation && token.nil?
        fail ArgumentError, "Missing the required parameter 'token' when calling AppsApi.apps_permissions_resources_list"
      end
      # resource path
      local_var_path = '/apps.permissions.resources.list'

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
      return_type = opts[:debug_return_type] || 'AppsPermissionsResourcesListSuccessSchema'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['slackAuth']

      new_options = opts.merge(
        :operation => :"AppsApi.apps_permissions_resources_list",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AppsApi#apps_permissions_resources_list\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Returns list of scopes this app has on a team.
    # @param token [String] Authentication token. Requires scope: &#x60;none&#x60;
    # @param [Hash] opts the optional parameters
    # @return [ApiPermissionsScopesListSuccessSchema]
    def apps_permissions_scopes_list(token, opts = {})
      data, _status_code, _headers = apps_permissions_scopes_list_with_http_info(token, opts)
      data
    end

    # Returns list of scopes this app has on a team.
    # @param token [String] Authentication token. Requires scope: &#x60;none&#x60;
    # @param [Hash] opts the optional parameters
    # @return [Array<(ApiPermissionsScopesListSuccessSchema, Integer, Hash)>] ApiPermissionsScopesListSuccessSchema data, response status code and response headers
    def apps_permissions_scopes_list_with_http_info(token, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: AppsApi.apps_permissions_scopes_list ...'
      end
      # verify the required parameter 'token' is set
      if @api_client.config.client_side_validation && token.nil?
        fail ArgumentError, "Missing the required parameter 'token' when calling AppsApi.apps_permissions_scopes_list"
      end
      # resource path
      local_var_path = '/apps.permissions.scopes.list'

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'token'] = token

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'ApiPermissionsScopesListSuccessSchema'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['slackAuth']

      new_options = opts.merge(
        :operation => :"AppsApi.apps_permissions_scopes_list",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AppsApi#apps_permissions_scopes_list\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
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
        @api_client.config.logger.debug 'Calling API: AppsApi.apps_permissions_users_list ...'
      end
      # verify the required parameter 'token' is set
      if @api_client.config.client_side_validation && token.nil?
        fail ArgumentError, "Missing the required parameter 'token' when calling AppsApi.apps_permissions_users_list"
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
        :operation => :"AppsApi.apps_permissions_users_list",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AppsApi#apps_permissions_users_list\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
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
        @api_client.config.logger.debug 'Calling API: AppsApi.apps_permissions_users_request ...'
      end
      # verify the required parameter 'token' is set
      if @api_client.config.client_side_validation && token.nil?
        fail ArgumentError, "Missing the required parameter 'token' when calling AppsApi.apps_permissions_users_request"
      end
      # verify the required parameter 'scopes' is set
      if @api_client.config.client_side_validation && scopes.nil?
        fail ArgumentError, "Missing the required parameter 'scopes' when calling AppsApi.apps_permissions_users_request"
      end
      # verify the required parameter 'trigger_id' is set
      if @api_client.config.client_side_validation && trigger_id.nil?
        fail ArgumentError, "Missing the required parameter 'trigger_id' when calling AppsApi.apps_permissions_users_request"
      end
      # verify the required parameter 'user' is set
      if @api_client.config.client_side_validation && user.nil?
        fail ArgumentError, "Missing the required parameter 'user' when calling AppsApi.apps_permissions_users_request"
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
        :operation => :"AppsApi.apps_permissions_users_request",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AppsApi#apps_permissions_users_request\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Uninstalls your app from a workspace.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :token Authentication token. Requires scope: &#x60;none&#x60;
    # @option opts [String] :client_id Issued when you created your application.
    # @option opts [String] :client_secret Issued when you created your application.
    # @return [AppsUninstallSchema]
    def apps_uninstall(opts = {})
      data, _status_code, _headers = apps_uninstall_with_http_info(opts)
      data
    end

    # Uninstalls your app from a workspace.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :token Authentication token. Requires scope: &#x60;none&#x60;
    # @option opts [String] :client_id Issued when you created your application.
    # @option opts [String] :client_secret Issued when you created your application.
    # @return [Array<(AppsUninstallSchema, Integer, Hash)>] AppsUninstallSchema data, response status code and response headers
    def apps_uninstall_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: AppsApi.apps_uninstall ...'
      end
      # resource path
      local_var_path = '/apps.uninstall'

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'token'] = opts[:'token'] if !opts[:'token'].nil?
      query_params[:'client_id'] = opts[:'client_id'] if !opts[:'client_id'].nil?
      query_params[:'client_secret'] = opts[:'client_secret'] if !opts[:'client_secret'].nil?

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'AppsUninstallSchema'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['slackAuth']

      new_options = opts.merge(
        :operation => :"AppsApi.apps_uninstall",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AppsApi#apps_uninstall\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
