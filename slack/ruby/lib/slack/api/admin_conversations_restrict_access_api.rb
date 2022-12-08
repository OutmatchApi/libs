=begin
#Slack Web API

#One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.

The version of the OpenAPI document: 1.7.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.1

=end

require 'cgi'

module slack
  class AdminConversationsRestrictAccessApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Add an allowlist of IDP groups for accessing a channel
    # @param channel_id [String] The channel to link this group to.
    # @param group_id [String] The [IDP Group](https://slack.com/help/articles/115001435788-Connect-identity-provider-groups-to-your-Enterprise-Grid-org) ID to be an allowlist for the private channel.
    # @param token [String] Authentication token. Requires scope: &#x60;admin.conversations:write&#x60;
    # @param [Hash] opts the optional parameters
    # @option opts [String] :team_id The workspace where the channel exists. This argument is required for channels only tied to one workspace, and optional for channels that are shared across an organization.
    # @return [DefaultSuccessTemplate]
    def admin_conversations_restrict_access_add_group(channel_id, group_id, token, opts = {})
      data, _status_code, _headers = admin_conversations_restrict_access_add_group_with_http_info(channel_id, group_id, token, opts)
      data
    end

    # Add an allowlist of IDP groups for accessing a channel
    # @param channel_id [String] The channel to link this group to.
    # @param group_id [String] The [IDP Group](https://slack.com/help/articles/115001435788-Connect-identity-provider-groups-to-your-Enterprise-Grid-org) ID to be an allowlist for the private channel.
    # @param token [String] Authentication token. Requires scope: &#x60;admin.conversations:write&#x60;
    # @param [Hash] opts the optional parameters
    # @option opts [String] :team_id The workspace where the channel exists. This argument is required for channels only tied to one workspace, and optional for channels that are shared across an organization.
    # @return [Array<(DefaultSuccessTemplate, Integer, Hash)>] DefaultSuccessTemplate data, response status code and response headers
    def admin_conversations_restrict_access_add_group_with_http_info(channel_id, group_id, token, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: AdminConversationsRestrictAccessApi.admin_conversations_restrict_access_add_group ...'
      end
      # verify the required parameter 'channel_id' is set
      if @api_client.config.client_side_validation && channel_id.nil?
        fail ArgumentError, "Missing the required parameter 'channel_id' when calling AdminConversationsRestrictAccessApi.admin_conversations_restrict_access_add_group"
      end
      # verify the required parameter 'group_id' is set
      if @api_client.config.client_side_validation && group_id.nil?
        fail ArgumentError, "Missing the required parameter 'group_id' when calling AdminConversationsRestrictAccessApi.admin_conversations_restrict_access_add_group"
      end
      # verify the required parameter 'token' is set
      if @api_client.config.client_side_validation && token.nil?
        fail ArgumentError, "Missing the required parameter 'token' when calling AdminConversationsRestrictAccessApi.admin_conversations_restrict_access_add_group"
      end
      # resource path
      local_var_path = '/admin.conversations.restrictAccess.addGroup'

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
      form_params['channel_id'] = channel_id
      form_params['group_id'] = group_id
      form_params['token'] = token
      form_params['team_id'] = opts[:'team_id'] if !opts[:'team_id'].nil?

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'DefaultSuccessTemplate'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['slackAuth']

      new_options = opts.merge(
        :operation => :"AdminConversationsRestrictAccessApi.admin_conversations_restrict_access_add_group",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AdminConversationsRestrictAccessApi#admin_conversations_restrict_access_add_group\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # List all IDP Groups linked to a channel
    # @param token [String] Authentication token. Requires scope: &#x60;admin.conversations:read&#x60;
    # @param channel_id [String] 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :team_id The workspace where the channel exists. This argument is required for channels only tied to one workspace, and optional for channels that are shared across an organization.
    # @return [DefaultSuccessTemplate]
    def admin_conversations_restrict_access_list_groups(token, channel_id, opts = {})
      data, _status_code, _headers = admin_conversations_restrict_access_list_groups_with_http_info(token, channel_id, opts)
      data
    end

    # List all IDP Groups linked to a channel
    # @param token [String] Authentication token. Requires scope: &#x60;admin.conversations:read&#x60;
    # @param channel_id [String] 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :team_id The workspace where the channel exists. This argument is required for channels only tied to one workspace, and optional for channels that are shared across an organization.
    # @return [Array<(DefaultSuccessTemplate, Integer, Hash)>] DefaultSuccessTemplate data, response status code and response headers
    def admin_conversations_restrict_access_list_groups_with_http_info(token, channel_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: AdminConversationsRestrictAccessApi.admin_conversations_restrict_access_list_groups ...'
      end
      # verify the required parameter 'token' is set
      if @api_client.config.client_side_validation && token.nil?
        fail ArgumentError, "Missing the required parameter 'token' when calling AdminConversationsRestrictAccessApi.admin_conversations_restrict_access_list_groups"
      end
      # verify the required parameter 'channel_id' is set
      if @api_client.config.client_side_validation && channel_id.nil?
        fail ArgumentError, "Missing the required parameter 'channel_id' when calling AdminConversationsRestrictAccessApi.admin_conversations_restrict_access_list_groups"
      end
      # resource path
      local_var_path = '/admin.conversations.restrictAccess.listGroups'

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'token'] = token
      query_params[:'channel_id'] = channel_id
      query_params[:'team_id'] = opts[:'team_id'] if !opts[:'team_id'].nil?

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
        :operation => :"AdminConversationsRestrictAccessApi.admin_conversations_restrict_access_list_groups",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AdminConversationsRestrictAccessApi#admin_conversations_restrict_access_list_groups\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Remove a linked IDP group linked from a private channel
    # @param channel_id [String] The channel to remove the linked group from.
    # @param group_id [String] The [IDP Group](https://slack.com/help/articles/115001435788-Connect-identity-provider-groups-to-your-Enterprise-Grid-org) ID to remove from the private channel.
    # @param team_id [String] The workspace where the channel exists. This argument is required for channels only tied to one workspace, and optional for channels that are shared across an organization.
    # @param token [String] Authentication token. Requires scope: &#x60;admin.conversations:write&#x60;
    # @param [Hash] opts the optional parameters
    # @return [DefaultSuccessTemplate]
    def admin_conversations_restrict_access_remove_group(channel_id, group_id, team_id, token, opts = {})
      data, _status_code, _headers = admin_conversations_restrict_access_remove_group_with_http_info(channel_id, group_id, team_id, token, opts)
      data
    end

    # Remove a linked IDP group linked from a private channel
    # @param channel_id [String] The channel to remove the linked group from.
    # @param group_id [String] The [IDP Group](https://slack.com/help/articles/115001435788-Connect-identity-provider-groups-to-your-Enterprise-Grid-org) ID to remove from the private channel.
    # @param team_id [String] The workspace where the channel exists. This argument is required for channels only tied to one workspace, and optional for channels that are shared across an organization.
    # @param token [String] Authentication token. Requires scope: &#x60;admin.conversations:write&#x60;
    # @param [Hash] opts the optional parameters
    # @return [Array<(DefaultSuccessTemplate, Integer, Hash)>] DefaultSuccessTemplate data, response status code and response headers
    def admin_conversations_restrict_access_remove_group_with_http_info(channel_id, group_id, team_id, token, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: AdminConversationsRestrictAccessApi.admin_conversations_restrict_access_remove_group ...'
      end
      # verify the required parameter 'channel_id' is set
      if @api_client.config.client_side_validation && channel_id.nil?
        fail ArgumentError, "Missing the required parameter 'channel_id' when calling AdminConversationsRestrictAccessApi.admin_conversations_restrict_access_remove_group"
      end
      # verify the required parameter 'group_id' is set
      if @api_client.config.client_side_validation && group_id.nil?
        fail ArgumentError, "Missing the required parameter 'group_id' when calling AdminConversationsRestrictAccessApi.admin_conversations_restrict_access_remove_group"
      end
      # verify the required parameter 'team_id' is set
      if @api_client.config.client_side_validation && team_id.nil?
        fail ArgumentError, "Missing the required parameter 'team_id' when calling AdminConversationsRestrictAccessApi.admin_conversations_restrict_access_remove_group"
      end
      # verify the required parameter 'token' is set
      if @api_client.config.client_side_validation && token.nil?
        fail ArgumentError, "Missing the required parameter 'token' when calling AdminConversationsRestrictAccessApi.admin_conversations_restrict_access_remove_group"
      end
      # resource path
      local_var_path = '/admin.conversations.restrictAccess.removeGroup'

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
      form_params['channel_id'] = channel_id
      form_params['group_id'] = group_id
      form_params['team_id'] = team_id
      form_params['token'] = token

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'DefaultSuccessTemplate'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['slackAuth']

      new_options = opts.merge(
        :operation => :"AdminConversationsRestrictAccessApi.admin_conversations_restrict_access_remove_group",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AdminConversationsRestrictAccessApi#admin_conversations_restrict_access_remove_group\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
