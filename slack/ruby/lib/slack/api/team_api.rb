=begin
#Slack Web API

#One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.

The version of the OpenAPI document: 1.7.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.1

=end

require 'cgi'

module slack
  class TeamApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Gets the access logs for the current team.
    # @param token [String] Authentication token. Requires scope: &#x60;admin&#x60;
    # @param [Hash] opts the optional parameters
    # @option opts [String] :before End of time range of logs to include in results (inclusive).
    # @option opts [String] :count 
    # @option opts [String] :page 
    # @return [TeamAccessLogsSchema]
    def team_access_logs(token, opts = {})
      data, _status_code, _headers = team_access_logs_with_http_info(token, opts)
      data
    end

    # Gets the access logs for the current team.
    # @param token [String] Authentication token. Requires scope: &#x60;admin&#x60;
    # @param [Hash] opts the optional parameters
    # @option opts [String] :before End of time range of logs to include in results (inclusive).
    # @option opts [String] :count 
    # @option opts [String] :page 
    # @return [Array<(TeamAccessLogsSchema, Integer, Hash)>] TeamAccessLogsSchema data, response status code and response headers
    def team_access_logs_with_http_info(token, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: TeamApi.team_access_logs ...'
      end
      # verify the required parameter 'token' is set
      if @api_client.config.client_side_validation && token.nil?
        fail ArgumentError, "Missing the required parameter 'token' when calling TeamApi.team_access_logs"
      end
      # resource path
      local_var_path = '/team.accessLogs'

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'token'] = token
      query_params[:'before'] = opts[:'before'] if !opts[:'before'].nil?
      query_params[:'count'] = opts[:'count'] if !opts[:'count'].nil?
      query_params[:'page'] = opts[:'page'] if !opts[:'page'].nil?

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'TeamAccessLogsSchema'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['slackAuth']

      new_options = opts.merge(
        :operation => :"TeamApi.team_access_logs",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: TeamApi#team_access_logs\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Gets billable users information for the current team.
    # @param token [String] Authentication token. Requires scope: &#x60;admin&#x60;
    # @param [Hash] opts the optional parameters
    # @option opts [String] :user A user to retrieve the billable information for. Defaults to all users.
    # @return [DefaultSuccessTemplate]
    def team_billable_info(token, opts = {})
      data, _status_code, _headers = team_billable_info_with_http_info(token, opts)
      data
    end

    # Gets billable users information for the current team.
    # @param token [String] Authentication token. Requires scope: &#x60;admin&#x60;
    # @param [Hash] opts the optional parameters
    # @option opts [String] :user A user to retrieve the billable information for. Defaults to all users.
    # @return [Array<(DefaultSuccessTemplate, Integer, Hash)>] DefaultSuccessTemplate data, response status code and response headers
    def team_billable_info_with_http_info(token, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: TeamApi.team_billable_info ...'
      end
      # verify the required parameter 'token' is set
      if @api_client.config.client_side_validation && token.nil?
        fail ArgumentError, "Missing the required parameter 'token' when calling TeamApi.team_billable_info"
      end
      # resource path
      local_var_path = '/team.billableInfo'

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'token'] = token
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
      return_type = opts[:debug_return_type] || 'DefaultSuccessTemplate'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['slackAuth']

      new_options = opts.merge(
        :operation => :"TeamApi.team_billable_info",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: TeamApi#team_billable_info\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Gets information about the current team.
    # @param token [String] Authentication token. Requires scope: &#x60;team:read&#x60;
    # @param [Hash] opts the optional parameters
    # @option opts [String] :team Team to get info on, if omitted, will return information about the current team. Will only return team that the authenticated token is allowed to see through external shared channels
    # @return [TeamInfoSchema]
    def team_info(token, opts = {})
      data, _status_code, _headers = team_info_with_http_info(token, opts)
      data
    end

    # Gets information about the current team.
    # @param token [String] Authentication token. Requires scope: &#x60;team:read&#x60;
    # @param [Hash] opts the optional parameters
    # @option opts [String] :team Team to get info on, if omitted, will return information about the current team. Will only return team that the authenticated token is allowed to see through external shared channels
    # @return [Array<(TeamInfoSchema, Integer, Hash)>] TeamInfoSchema data, response status code and response headers
    def team_info_with_http_info(token, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: TeamApi.team_info ...'
      end
      # verify the required parameter 'token' is set
      if @api_client.config.client_side_validation && token.nil?
        fail ArgumentError, "Missing the required parameter 'token' when calling TeamApi.team_info"
      end
      # resource path
      local_var_path = '/team.info'

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'token'] = token
      query_params[:'team'] = opts[:'team'] if !opts[:'team'].nil?

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'TeamInfoSchema'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['slackAuth']

      new_options = opts.merge(
        :operation => :"TeamApi.team_info",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: TeamApi#team_info\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Gets the integration logs for the current team.
    # @param token [String] Authentication token. Requires scope: &#x60;admin&#x60;
    # @param [Hash] opts the optional parameters
    # @option opts [String] :app_id Filter logs to this Slack app. Defaults to all logs.
    # @option opts [String] :change_type Filter logs with this change type. Defaults to all logs.
    # @option opts [String] :count 
    # @option opts [String] :page 
    # @option opts [String] :service_id Filter logs to this service. Defaults to all logs.
    # @option opts [String] :user Filter logs generated by this userâ€™s actions. Defaults to all logs.
    # @return [TeamIntegrationLogsSchema]
    def team_integration_logs(token, opts = {})
      data, _status_code, _headers = team_integration_logs_with_http_info(token, opts)
      data
    end

    # Gets the integration logs for the current team.
    # @param token [String] Authentication token. Requires scope: &#x60;admin&#x60;
    # @param [Hash] opts the optional parameters
    # @option opts [String] :app_id Filter logs to this Slack app. Defaults to all logs.
    # @option opts [String] :change_type Filter logs with this change type. Defaults to all logs.
    # @option opts [String] :count 
    # @option opts [String] :page 
    # @option opts [String] :service_id Filter logs to this service. Defaults to all logs.
    # @option opts [String] :user Filter logs generated by this userâ€™s actions. Defaults to all logs.
    # @return [Array<(TeamIntegrationLogsSchema, Integer, Hash)>] TeamIntegrationLogsSchema data, response status code and response headers
    def team_integration_logs_with_http_info(token, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: TeamApi.team_integration_logs ...'
      end
      # verify the required parameter 'token' is set
      if @api_client.config.client_side_validation && token.nil?
        fail ArgumentError, "Missing the required parameter 'token' when calling TeamApi.team_integration_logs"
      end
      # resource path
      local_var_path = '/team.integrationLogs'

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'token'] = token
      query_params[:'app_id'] = opts[:'app_id'] if !opts[:'app_id'].nil?
      query_params[:'change_type'] = opts[:'change_type'] if !opts[:'change_type'].nil?
      query_params[:'count'] = opts[:'count'] if !opts[:'count'].nil?
      query_params[:'page'] = opts[:'page'] if !opts[:'page'].nil?
      query_params[:'service_id'] = opts[:'service_id'] if !opts[:'service_id'].nil?
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
      return_type = opts[:debug_return_type] || 'TeamIntegrationLogsSchema'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['slackAuth']

      new_options = opts.merge(
        :operation => :"TeamApi.team_integration_logs",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: TeamApi#team_integration_logs\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Retrieve a team's profile.
    # @param token [String] Authentication token. Requires scope: &#x60;users.profile:read&#x60;
    # @param [Hash] opts the optional parameters
    # @option opts [String] :visibility Filter by visibility.
    # @return [TeamProfileGetSuccessSchema]
    def team_profile_get(token, opts = {})
      data, _status_code, _headers = team_profile_get_with_http_info(token, opts)
      data
    end

    # Retrieve a team&#39;s profile.
    # @param token [String] Authentication token. Requires scope: &#x60;users.profile:read&#x60;
    # @param [Hash] opts the optional parameters
    # @option opts [String] :visibility Filter by visibility.
    # @return [Array<(TeamProfileGetSuccessSchema, Integer, Hash)>] TeamProfileGetSuccessSchema data, response status code and response headers
    def team_profile_get_with_http_info(token, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: TeamApi.team_profile_get ...'
      end
      # verify the required parameter 'token' is set
      if @api_client.config.client_side_validation && token.nil?
        fail ArgumentError, "Missing the required parameter 'token' when calling TeamApi.team_profile_get"
      end
      # resource path
      local_var_path = '/team.profile.get'

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'token'] = token
      query_params[:'visibility'] = opts[:'visibility'] if !opts[:'visibility'].nil?

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'TeamProfileGetSuccessSchema'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['slackAuth']

      new_options = opts.merge(
        :operation => :"TeamApi.team_profile_get",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: TeamApi#team_profile_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end