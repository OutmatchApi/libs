=begin
#Slack Web API

#One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.

The version of the OpenAPI document: 1.7.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.1

=end

require 'cgi'

module slack
  class AdminTeamsApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Create an Enterprise team.
    # @param token [String] Authentication token. Requires scope: &#x60;admin.teams:write&#x60;
    # @param team_domain [String] Team domain (for example, slacksoftballteam).
    # @param team_name [String] Team name (for example, Slack Softball Team).
    # @param [Hash] opts the optional parameters
    # @option opts [String] :team_description Description for the team.
    # @option opts [String] :team_discoverability Who can join the team. A team&#39;s discoverability can be &#x60;open&#x60;, &#x60;closed&#x60;, &#x60;invite_only&#x60;, or &#x60;unlisted&#x60;.
    # @return [DefaultSuccessTemplate]
    def admin_teams_create(token, team_domain, team_name, opts = {})
      data, _status_code, _headers = admin_teams_create_with_http_info(token, team_domain, team_name, opts)
      data
    end

    # Create an Enterprise team.
    # @param token [String] Authentication token. Requires scope: &#x60;admin.teams:write&#x60;
    # @param team_domain [String] Team domain (for example, slacksoftballteam).
    # @param team_name [String] Team name (for example, Slack Softball Team).
    # @param [Hash] opts the optional parameters
    # @option opts [String] :team_description Description for the team.
    # @option opts [String] :team_discoverability Who can join the team. A team&#39;s discoverability can be &#x60;open&#x60;, &#x60;closed&#x60;, &#x60;invite_only&#x60;, or &#x60;unlisted&#x60;.
    # @return [Array<(DefaultSuccessTemplate, Integer, Hash)>] DefaultSuccessTemplate data, response status code and response headers
    def admin_teams_create_with_http_info(token, team_domain, team_name, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: AdminTeamsApi.admin_teams_create ...'
      end
      # verify the required parameter 'token' is set
      if @api_client.config.client_side_validation && token.nil?
        fail ArgumentError, "Missing the required parameter 'token' when calling AdminTeamsApi.admin_teams_create"
      end
      # verify the required parameter 'team_domain' is set
      if @api_client.config.client_side_validation && team_domain.nil?
        fail ArgumentError, "Missing the required parameter 'team_domain' when calling AdminTeamsApi.admin_teams_create"
      end
      # verify the required parameter 'team_name' is set
      if @api_client.config.client_side_validation && team_name.nil?
        fail ArgumentError, "Missing the required parameter 'team_name' when calling AdminTeamsApi.admin_teams_create"
      end
      # resource path
      local_var_path = '/admin.teams.create'

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
      form_params['team_domain'] = team_domain
      form_params['team_name'] = team_name
      form_params['team_description'] = opts[:'team_description'] if !opts[:'team_description'].nil?
      form_params['team_discoverability'] = opts[:'team_discoverability'] if !opts[:'team_discoverability'].nil?

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'DefaultSuccessTemplate'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['slackAuth']

      new_options = opts.merge(
        :operation => :"AdminTeamsApi.admin_teams_create",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AdminTeamsApi#admin_teams_create\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # List all teams on an Enterprise organization
    # @param token [String] Authentication token. Requires scope: &#x60;admin.teams:read&#x60;
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :limit The maximum number of items to return. Must be between 1 - 100 both inclusive.
    # @option opts [String] :cursor Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page.
    # @return [DefaultSuccessTemplate]
    def admin_teams_list(token, opts = {})
      data, _status_code, _headers = admin_teams_list_with_http_info(token, opts)
      data
    end

    # List all teams on an Enterprise organization
    # @param token [String] Authentication token. Requires scope: &#x60;admin.teams:read&#x60;
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :limit The maximum number of items to return. Must be between 1 - 100 both inclusive.
    # @option opts [String] :cursor Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page.
    # @return [Array<(DefaultSuccessTemplate, Integer, Hash)>] DefaultSuccessTemplate data, response status code and response headers
    def admin_teams_list_with_http_info(token, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: AdminTeamsApi.admin_teams_list ...'
      end
      # verify the required parameter 'token' is set
      if @api_client.config.client_side_validation && token.nil?
        fail ArgumentError, "Missing the required parameter 'token' when calling AdminTeamsApi.admin_teams_list"
      end
      # resource path
      local_var_path = '/admin.teams.list'

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'limit'] = opts[:'limit'] if !opts[:'limit'].nil?
      query_params[:'cursor'] = opts[:'cursor'] if !opts[:'cursor'].nil?

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
        :operation => :"AdminTeamsApi.admin_teams_list",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AdminTeamsApi#admin_teams_list\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
