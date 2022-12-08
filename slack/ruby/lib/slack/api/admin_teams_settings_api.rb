=begin
#Slack Web API

#One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.

The version of the OpenAPI document: 1.7.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.1

=end

require 'cgi'

module slack
  class AdminTeamsSettingsApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Fetch information about settings in a workspace
    # @param token [String] Authentication token. Requires scope: &#x60;admin.teams:read&#x60;
    # @param team_id [String] 
    # @param [Hash] opts the optional parameters
    # @return [DefaultSuccessTemplate]
    def admin_teams_settings_info(token, team_id, opts = {})
      data, _status_code, _headers = admin_teams_settings_info_with_http_info(token, team_id, opts)
      data
    end

    # Fetch information about settings in a workspace
    # @param token [String] Authentication token. Requires scope: &#x60;admin.teams:read&#x60;
    # @param team_id [String] 
    # @param [Hash] opts the optional parameters
    # @return [Array<(DefaultSuccessTemplate, Integer, Hash)>] DefaultSuccessTemplate data, response status code and response headers
    def admin_teams_settings_info_with_http_info(token, team_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: AdminTeamsSettingsApi.admin_teams_settings_info ...'
      end
      # verify the required parameter 'token' is set
      if @api_client.config.client_side_validation && token.nil?
        fail ArgumentError, "Missing the required parameter 'token' when calling AdminTeamsSettingsApi.admin_teams_settings_info"
      end
      # verify the required parameter 'team_id' is set
      if @api_client.config.client_side_validation && team_id.nil?
        fail ArgumentError, "Missing the required parameter 'team_id' when calling AdminTeamsSettingsApi.admin_teams_settings_info"
      end
      # resource path
      local_var_path = '/admin.teams.settings.info'

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'team_id'] = team_id

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
        :operation => :"AdminTeamsSettingsApi.admin_teams_settings_info",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AdminTeamsSettingsApi#admin_teams_settings_info\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Set the default channels of a workspace.
    # @param channel_ids [String] An array of channel IDs.
    # @param team_id [String] ID for the workspace to set the default channel for.
    # @param token [String] Authentication token. Requires scope: &#x60;admin.teams:write&#x60;
    # @param [Hash] opts the optional parameters
    # @return [DefaultSuccessTemplate]
    def admin_teams_settings_set_default_channels(channel_ids, team_id, token, opts = {})
      data, _status_code, _headers = admin_teams_settings_set_default_channels_with_http_info(channel_ids, team_id, token, opts)
      data
    end

    # Set the default channels of a workspace.
    # @param channel_ids [String] An array of channel IDs.
    # @param team_id [String] ID for the workspace to set the default channel for.
    # @param token [String] Authentication token. Requires scope: &#x60;admin.teams:write&#x60;
    # @param [Hash] opts the optional parameters
    # @return [Array<(DefaultSuccessTemplate, Integer, Hash)>] DefaultSuccessTemplate data, response status code and response headers
    def admin_teams_settings_set_default_channels_with_http_info(channel_ids, team_id, token, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: AdminTeamsSettingsApi.admin_teams_settings_set_default_channels ...'
      end
      # verify the required parameter 'channel_ids' is set
      if @api_client.config.client_side_validation && channel_ids.nil?
        fail ArgumentError, "Missing the required parameter 'channel_ids' when calling AdminTeamsSettingsApi.admin_teams_settings_set_default_channels"
      end
      # verify the required parameter 'team_id' is set
      if @api_client.config.client_side_validation && team_id.nil?
        fail ArgumentError, "Missing the required parameter 'team_id' when calling AdminTeamsSettingsApi.admin_teams_settings_set_default_channels"
      end
      # verify the required parameter 'token' is set
      if @api_client.config.client_side_validation && token.nil?
        fail ArgumentError, "Missing the required parameter 'token' when calling AdminTeamsSettingsApi.admin_teams_settings_set_default_channels"
      end
      # resource path
      local_var_path = '/admin.teams.settings.setDefaultChannels'

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
      form_params['channel_ids'] = channel_ids
      form_params['team_id'] = team_id
      form_params['token'] = token

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'DefaultSuccessTemplate'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['slackAuth']

      new_options = opts.merge(
        :operation => :"AdminTeamsSettingsApi.admin_teams_settings_set_default_channels",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AdminTeamsSettingsApi#admin_teams_settings_set_default_channels\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Set the description of a given workspace.
    # @param token [String] Authentication token. Requires scope: &#x60;admin.teams:write&#x60;
    # @param description [String] The new description for the workspace.
    # @param team_id [String] ID for the workspace to set the description for.
    # @param [Hash] opts the optional parameters
    # @return [DefaultSuccessTemplate]
    def admin_teams_settings_set_description(token, description, team_id, opts = {})
      data, _status_code, _headers = admin_teams_settings_set_description_with_http_info(token, description, team_id, opts)
      data
    end

    # Set the description of a given workspace.
    # @param token [String] Authentication token. Requires scope: &#x60;admin.teams:write&#x60;
    # @param description [String] The new description for the workspace.
    # @param team_id [String] ID for the workspace to set the description for.
    # @param [Hash] opts the optional parameters
    # @return [Array<(DefaultSuccessTemplate, Integer, Hash)>] DefaultSuccessTemplate data, response status code and response headers
    def admin_teams_settings_set_description_with_http_info(token, description, team_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: AdminTeamsSettingsApi.admin_teams_settings_set_description ...'
      end
      # verify the required parameter 'token' is set
      if @api_client.config.client_side_validation && token.nil?
        fail ArgumentError, "Missing the required parameter 'token' when calling AdminTeamsSettingsApi.admin_teams_settings_set_description"
      end
      # verify the required parameter 'description' is set
      if @api_client.config.client_side_validation && description.nil?
        fail ArgumentError, "Missing the required parameter 'description' when calling AdminTeamsSettingsApi.admin_teams_settings_set_description"
      end
      # verify the required parameter 'team_id' is set
      if @api_client.config.client_side_validation && team_id.nil?
        fail ArgumentError, "Missing the required parameter 'team_id' when calling AdminTeamsSettingsApi.admin_teams_settings_set_description"
      end
      # resource path
      local_var_path = '/admin.teams.settings.setDescription'

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
      form_params['description'] = description
      form_params['team_id'] = team_id

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'DefaultSuccessTemplate'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['slackAuth']

      new_options = opts.merge(
        :operation => :"AdminTeamsSettingsApi.admin_teams_settings_set_description",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AdminTeamsSettingsApi#admin_teams_settings_set_description\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # An API method that allows admins to set the discoverability of a given workspace
    # @param token [String] Authentication token. Requires scope: &#x60;admin.teams:write&#x60;
    # @param discoverability [String] This workspace&#39;s discovery setting. It must be set to one of &#x60;open&#x60;, &#x60;invite_only&#x60;, &#x60;closed&#x60;, or &#x60;unlisted&#x60;.
    # @param team_id [String] The ID of the workspace to set discoverability on.
    # @param [Hash] opts the optional parameters
    # @return [DefaultSuccessTemplate]
    def admin_teams_settings_set_discoverability(token, discoverability, team_id, opts = {})
      data, _status_code, _headers = admin_teams_settings_set_discoverability_with_http_info(token, discoverability, team_id, opts)
      data
    end

    # An API method that allows admins to set the discoverability of a given workspace
    # @param token [String] Authentication token. Requires scope: &#x60;admin.teams:write&#x60;
    # @param discoverability [String] This workspace&#39;s discovery setting. It must be set to one of &#x60;open&#x60;, &#x60;invite_only&#x60;, &#x60;closed&#x60;, or &#x60;unlisted&#x60;.
    # @param team_id [String] The ID of the workspace to set discoverability on.
    # @param [Hash] opts the optional parameters
    # @return [Array<(DefaultSuccessTemplate, Integer, Hash)>] DefaultSuccessTemplate data, response status code and response headers
    def admin_teams_settings_set_discoverability_with_http_info(token, discoverability, team_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: AdminTeamsSettingsApi.admin_teams_settings_set_discoverability ...'
      end
      # verify the required parameter 'token' is set
      if @api_client.config.client_side_validation && token.nil?
        fail ArgumentError, "Missing the required parameter 'token' when calling AdminTeamsSettingsApi.admin_teams_settings_set_discoverability"
      end
      # verify the required parameter 'discoverability' is set
      if @api_client.config.client_side_validation && discoverability.nil?
        fail ArgumentError, "Missing the required parameter 'discoverability' when calling AdminTeamsSettingsApi.admin_teams_settings_set_discoverability"
      end
      # verify the required parameter 'team_id' is set
      if @api_client.config.client_side_validation && team_id.nil?
        fail ArgumentError, "Missing the required parameter 'team_id' when calling AdminTeamsSettingsApi.admin_teams_settings_set_discoverability"
      end
      # resource path
      local_var_path = '/admin.teams.settings.setDiscoverability'

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
      form_params['discoverability'] = discoverability
      form_params['team_id'] = team_id

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'DefaultSuccessTemplate'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['slackAuth']

      new_options = opts.merge(
        :operation => :"AdminTeamsSettingsApi.admin_teams_settings_set_discoverability",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AdminTeamsSettingsApi#admin_teams_settings_set_discoverability\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Sets the icon of a workspace.
    # @param image_url [String] Image URL for the icon
    # @param team_id [String] ID for the workspace to set the icon for.
    # @param token [String] Authentication token. Requires scope: &#x60;admin.teams:write&#x60;
    # @param [Hash] opts the optional parameters
    # @return [DefaultSuccessTemplate]
    def admin_teams_settings_set_icon(image_url, team_id, token, opts = {})
      data, _status_code, _headers = admin_teams_settings_set_icon_with_http_info(image_url, team_id, token, opts)
      data
    end

    # Sets the icon of a workspace.
    # @param image_url [String] Image URL for the icon
    # @param team_id [String] ID for the workspace to set the icon for.
    # @param token [String] Authentication token. Requires scope: &#x60;admin.teams:write&#x60;
    # @param [Hash] opts the optional parameters
    # @return [Array<(DefaultSuccessTemplate, Integer, Hash)>] DefaultSuccessTemplate data, response status code and response headers
    def admin_teams_settings_set_icon_with_http_info(image_url, team_id, token, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: AdminTeamsSettingsApi.admin_teams_settings_set_icon ...'
      end
      # verify the required parameter 'image_url' is set
      if @api_client.config.client_side_validation && image_url.nil?
        fail ArgumentError, "Missing the required parameter 'image_url' when calling AdminTeamsSettingsApi.admin_teams_settings_set_icon"
      end
      # verify the required parameter 'team_id' is set
      if @api_client.config.client_side_validation && team_id.nil?
        fail ArgumentError, "Missing the required parameter 'team_id' when calling AdminTeamsSettingsApi.admin_teams_settings_set_icon"
      end
      # verify the required parameter 'token' is set
      if @api_client.config.client_side_validation && token.nil?
        fail ArgumentError, "Missing the required parameter 'token' when calling AdminTeamsSettingsApi.admin_teams_settings_set_icon"
      end
      # resource path
      local_var_path = '/admin.teams.settings.setIcon'

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
      form_params['image_url'] = image_url
      form_params['team_id'] = team_id
      form_params['token'] = token

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'DefaultSuccessTemplate'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['slackAuth']

      new_options = opts.merge(
        :operation => :"AdminTeamsSettingsApi.admin_teams_settings_set_icon",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AdminTeamsSettingsApi#admin_teams_settings_set_icon\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Set the name of a given workspace.
    # @param token [String] Authentication token. Requires scope: &#x60;admin.teams:write&#x60;
    # @param name [String] The new name of the workspace.
    # @param team_id [String] ID for the workspace to set the name for.
    # @param [Hash] opts the optional parameters
    # @return [DefaultSuccessTemplate]
    def admin_teams_settings_set_name(token, name, team_id, opts = {})
      data, _status_code, _headers = admin_teams_settings_set_name_with_http_info(token, name, team_id, opts)
      data
    end

    # Set the name of a given workspace.
    # @param token [String] Authentication token. Requires scope: &#x60;admin.teams:write&#x60;
    # @param name [String] The new name of the workspace.
    # @param team_id [String] ID for the workspace to set the name for.
    # @param [Hash] opts the optional parameters
    # @return [Array<(DefaultSuccessTemplate, Integer, Hash)>] DefaultSuccessTemplate data, response status code and response headers
    def admin_teams_settings_set_name_with_http_info(token, name, team_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: AdminTeamsSettingsApi.admin_teams_settings_set_name ...'
      end
      # verify the required parameter 'token' is set
      if @api_client.config.client_side_validation && token.nil?
        fail ArgumentError, "Missing the required parameter 'token' when calling AdminTeamsSettingsApi.admin_teams_settings_set_name"
      end
      # verify the required parameter 'name' is set
      if @api_client.config.client_side_validation && name.nil?
        fail ArgumentError, "Missing the required parameter 'name' when calling AdminTeamsSettingsApi.admin_teams_settings_set_name"
      end
      # verify the required parameter 'team_id' is set
      if @api_client.config.client_side_validation && team_id.nil?
        fail ArgumentError, "Missing the required parameter 'team_id' when calling AdminTeamsSettingsApi.admin_teams_settings_set_name"
      end
      # resource path
      local_var_path = '/admin.teams.settings.setName'

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
      form_params['name'] = name
      form_params['team_id'] = team_id

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'DefaultSuccessTemplate'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['slackAuth']

      new_options = opts.merge(
        :operation => :"AdminTeamsSettingsApi.admin_teams_settings_set_name",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AdminTeamsSettingsApi#admin_teams_settings_set_name\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end