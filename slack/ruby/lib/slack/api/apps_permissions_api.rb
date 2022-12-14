=begin
#Slack Web API

#One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.

The version of the OpenAPI document: 1.7.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.1

=end

require 'cgi'

module slack
  class AppsPermissionsApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
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
        @api_client.config.logger.debug 'Calling API: AppsPermissionsApi.apps_permissions_info ...'
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
        :operation => :"AppsPermissionsApi.apps_permissions_info",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AppsPermissionsApi#apps_permissions_info\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
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
        @api_client.config.logger.debug 'Calling API: AppsPermissionsApi.apps_permissions_request ...'
      end
      # verify the required parameter 'token' is set
      if @api_client.config.client_side_validation && token.nil?
        fail ArgumentError, "Missing the required parameter 'token' when calling AppsPermissionsApi.apps_permissions_request"
      end
      # verify the required parameter 'scopes' is set
      if @api_client.config.client_side_validation && scopes.nil?
        fail ArgumentError, "Missing the required parameter 'scopes' when calling AppsPermissionsApi.apps_permissions_request"
      end
      # verify the required parameter 'trigger_id' is set
      if @api_client.config.client_side_validation && trigger_id.nil?
        fail ArgumentError, "Missing the required parameter 'trigger_id' when calling AppsPermissionsApi.apps_permissions_request"
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
        :operation => :"AppsPermissionsApi.apps_permissions_request",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AppsPermissionsApi#apps_permissions_request\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
