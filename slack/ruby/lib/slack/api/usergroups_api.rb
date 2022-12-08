=begin
#Slack Web API

#One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.

The version of the OpenAPI document: 1.7.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.1

=end

require 'cgi'

module slack
  class UsergroupsApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Create a User Group
    # @param token [String] Authentication token. Requires scope: &#x60;usergroups:write&#x60;
    # @param name [String] A name for the User Group. Must be unique among User Groups.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :channels A comma separated string of encoded channel IDs for which the User Group uses as a default.
    # @option opts [String] :description A short description of the User Group.
    # @option opts [String] :handle A mention handle. Must be unique among channels, users and User Groups.
    # @option opts [Boolean] :include_count Include the number of users in each User Group.
    # @return [UsergroupsCreateSchema]
    def usergroups_create(token, name, opts = {})
      data, _status_code, _headers = usergroups_create_with_http_info(token, name, opts)
      data
    end

    # Create a User Group
    # @param token [String] Authentication token. Requires scope: &#x60;usergroups:write&#x60;
    # @param name [String] A name for the User Group. Must be unique among User Groups.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :channels A comma separated string of encoded channel IDs for which the User Group uses as a default.
    # @option opts [String] :description A short description of the User Group.
    # @option opts [String] :handle A mention handle. Must be unique among channels, users and User Groups.
    # @option opts [Boolean] :include_count Include the number of users in each User Group.
    # @return [Array<(UsergroupsCreateSchema, Integer, Hash)>] UsergroupsCreateSchema data, response status code and response headers
    def usergroups_create_with_http_info(token, name, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: UsergroupsApi.usergroups_create ...'
      end
      # verify the required parameter 'token' is set
      if @api_client.config.client_side_validation && token.nil?
        fail ArgumentError, "Missing the required parameter 'token' when calling UsergroupsApi.usergroups_create"
      end
      # verify the required parameter 'name' is set
      if @api_client.config.client_side_validation && name.nil?
        fail ArgumentError, "Missing the required parameter 'name' when calling UsergroupsApi.usergroups_create"
      end
      # resource path
      local_var_path = '/usergroups.create'

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
      form_params['channels'] = opts[:'channels'] if !opts[:'channels'].nil?
      form_params['description'] = opts[:'description'] if !opts[:'description'].nil?
      form_params['handle'] = opts[:'handle'] if !opts[:'handle'].nil?
      form_params['include_count'] = opts[:'include_count'] if !opts[:'include_count'].nil?

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'UsergroupsCreateSchema'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['slackAuth']

      new_options = opts.merge(
        :operation => :"UsergroupsApi.usergroups_create",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: UsergroupsApi#usergroups_create\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Disable an existing User Group
    # @param token [String] Authentication token. Requires scope: &#x60;usergroups:write&#x60;
    # @param usergroup [String] The encoded ID of the User Group to disable.
    # @param [Hash] opts the optional parameters
    # @option opts [Boolean] :include_count Include the number of users in the User Group.
    # @return [UsergroupsDisableSchema]
    def usergroups_disable(token, usergroup, opts = {})
      data, _status_code, _headers = usergroups_disable_with_http_info(token, usergroup, opts)
      data
    end

    # Disable an existing User Group
    # @param token [String] Authentication token. Requires scope: &#x60;usergroups:write&#x60;
    # @param usergroup [String] The encoded ID of the User Group to disable.
    # @param [Hash] opts the optional parameters
    # @option opts [Boolean] :include_count Include the number of users in the User Group.
    # @return [Array<(UsergroupsDisableSchema, Integer, Hash)>] UsergroupsDisableSchema data, response status code and response headers
    def usergroups_disable_with_http_info(token, usergroup, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: UsergroupsApi.usergroups_disable ...'
      end
      # verify the required parameter 'token' is set
      if @api_client.config.client_side_validation && token.nil?
        fail ArgumentError, "Missing the required parameter 'token' when calling UsergroupsApi.usergroups_disable"
      end
      # verify the required parameter 'usergroup' is set
      if @api_client.config.client_side_validation && usergroup.nil?
        fail ArgumentError, "Missing the required parameter 'usergroup' when calling UsergroupsApi.usergroups_disable"
      end
      # resource path
      local_var_path = '/usergroups.disable'

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
      form_params['usergroup'] = usergroup
      form_params['include_count'] = opts[:'include_count'] if !opts[:'include_count'].nil?

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'UsergroupsDisableSchema'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['slackAuth']

      new_options = opts.merge(
        :operation => :"UsergroupsApi.usergroups_disable",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: UsergroupsApi#usergroups_disable\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Enable a User Group
    # @param token [String] Authentication token. Requires scope: &#x60;usergroups:write&#x60;
    # @param usergroup [String] The encoded ID of the User Group to enable.
    # @param [Hash] opts the optional parameters
    # @option opts [Boolean] :include_count Include the number of users in the User Group.
    # @return [UsergroupsEnableSchema]
    def usergroups_enable(token, usergroup, opts = {})
      data, _status_code, _headers = usergroups_enable_with_http_info(token, usergroup, opts)
      data
    end

    # Enable a User Group
    # @param token [String] Authentication token. Requires scope: &#x60;usergroups:write&#x60;
    # @param usergroup [String] The encoded ID of the User Group to enable.
    # @param [Hash] opts the optional parameters
    # @option opts [Boolean] :include_count Include the number of users in the User Group.
    # @return [Array<(UsergroupsEnableSchema, Integer, Hash)>] UsergroupsEnableSchema data, response status code and response headers
    def usergroups_enable_with_http_info(token, usergroup, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: UsergroupsApi.usergroups_enable ...'
      end
      # verify the required parameter 'token' is set
      if @api_client.config.client_side_validation && token.nil?
        fail ArgumentError, "Missing the required parameter 'token' when calling UsergroupsApi.usergroups_enable"
      end
      # verify the required parameter 'usergroup' is set
      if @api_client.config.client_side_validation && usergroup.nil?
        fail ArgumentError, "Missing the required parameter 'usergroup' when calling UsergroupsApi.usergroups_enable"
      end
      # resource path
      local_var_path = '/usergroups.enable'

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
      form_params['usergroup'] = usergroup
      form_params['include_count'] = opts[:'include_count'] if !opts[:'include_count'].nil?

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'UsergroupsEnableSchema'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['slackAuth']

      new_options = opts.merge(
        :operation => :"UsergroupsApi.usergroups_enable",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: UsergroupsApi#usergroups_enable\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # List all User Groups for a team
    # @param token [String] Authentication token. Requires scope: &#x60;usergroups:read&#x60;
    # @param [Hash] opts the optional parameters
    # @option opts [Boolean] :include_users Include the list of users for each User Group.
    # @option opts [Boolean] :include_count Include the number of users in each User Group.
    # @option opts [Boolean] :include_disabled Include disabled User Groups.
    # @return [UsergroupsListSchema]
    def usergroups_list(token, opts = {})
      data, _status_code, _headers = usergroups_list_with_http_info(token, opts)
      data
    end

    # List all User Groups for a team
    # @param token [String] Authentication token. Requires scope: &#x60;usergroups:read&#x60;
    # @param [Hash] opts the optional parameters
    # @option opts [Boolean] :include_users Include the list of users for each User Group.
    # @option opts [Boolean] :include_count Include the number of users in each User Group.
    # @option opts [Boolean] :include_disabled Include disabled User Groups.
    # @return [Array<(UsergroupsListSchema, Integer, Hash)>] UsergroupsListSchema data, response status code and response headers
    def usergroups_list_with_http_info(token, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: UsergroupsApi.usergroups_list ...'
      end
      # verify the required parameter 'token' is set
      if @api_client.config.client_side_validation && token.nil?
        fail ArgumentError, "Missing the required parameter 'token' when calling UsergroupsApi.usergroups_list"
      end
      # resource path
      local_var_path = '/usergroups.list'

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'token'] = token
      query_params[:'include_users'] = opts[:'include_users'] if !opts[:'include_users'].nil?
      query_params[:'include_count'] = opts[:'include_count'] if !opts[:'include_count'].nil?
      query_params[:'include_disabled'] = opts[:'include_disabled'] if !opts[:'include_disabled'].nil?

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'UsergroupsListSchema'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['slackAuth']

      new_options = opts.merge(
        :operation => :"UsergroupsApi.usergroups_list",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: UsergroupsApi#usergroups_list\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Update an existing User Group
    # @param token [String] Authentication token. Requires scope: &#x60;usergroups:write&#x60;
    # @param usergroup [String] The encoded ID of the User Group to update.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :channels A comma separated string of encoded channel IDs for which the User Group uses as a default.
    # @option opts [String] :description A short description of the User Group.
    # @option opts [String] :handle A mention handle. Must be unique among channels, users and User Groups.
    # @option opts [Boolean] :include_count Include the number of users in the User Group.
    # @option opts [String] :name A name for the User Group. Must be unique among User Groups.
    # @return [UsergroupsUpdateSchema]
    def usergroups_update(token, usergroup, opts = {})
      data, _status_code, _headers = usergroups_update_with_http_info(token, usergroup, opts)
      data
    end

    # Update an existing User Group
    # @param token [String] Authentication token. Requires scope: &#x60;usergroups:write&#x60;
    # @param usergroup [String] The encoded ID of the User Group to update.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :channels A comma separated string of encoded channel IDs for which the User Group uses as a default.
    # @option opts [String] :description A short description of the User Group.
    # @option opts [String] :handle A mention handle. Must be unique among channels, users and User Groups.
    # @option opts [Boolean] :include_count Include the number of users in the User Group.
    # @option opts [String] :name A name for the User Group. Must be unique among User Groups.
    # @return [Array<(UsergroupsUpdateSchema, Integer, Hash)>] UsergroupsUpdateSchema data, response status code and response headers
    def usergroups_update_with_http_info(token, usergroup, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: UsergroupsApi.usergroups_update ...'
      end
      # verify the required parameter 'token' is set
      if @api_client.config.client_side_validation && token.nil?
        fail ArgumentError, "Missing the required parameter 'token' when calling UsergroupsApi.usergroups_update"
      end
      # verify the required parameter 'usergroup' is set
      if @api_client.config.client_side_validation && usergroup.nil?
        fail ArgumentError, "Missing the required parameter 'usergroup' when calling UsergroupsApi.usergroups_update"
      end
      # resource path
      local_var_path = '/usergroups.update'

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
      form_params['usergroup'] = usergroup
      form_params['channels'] = opts[:'channels'] if !opts[:'channels'].nil?
      form_params['description'] = opts[:'description'] if !opts[:'description'].nil?
      form_params['handle'] = opts[:'handle'] if !opts[:'handle'].nil?
      form_params['include_count'] = opts[:'include_count'] if !opts[:'include_count'].nil?
      form_params['name'] = opts[:'name'] if !opts[:'name'].nil?

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'UsergroupsUpdateSchema'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['slackAuth']

      new_options = opts.merge(
        :operation => :"UsergroupsApi.usergroups_update",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: UsergroupsApi#usergroups_update\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # List all users in a User Group
    # @param token [String] Authentication token. Requires scope: &#x60;usergroups:read&#x60;
    # @param usergroup [String] The encoded ID of the User Group to update.
    # @param [Hash] opts the optional parameters
    # @option opts [Boolean] :include_disabled Allow results that involve disabled User Groups.
    # @return [UsergroupsUsersListSchema]
    def usergroups_users_list(token, usergroup, opts = {})
      data, _status_code, _headers = usergroups_users_list_with_http_info(token, usergroup, opts)
      data
    end

    # List all users in a User Group
    # @param token [String] Authentication token. Requires scope: &#x60;usergroups:read&#x60;
    # @param usergroup [String] The encoded ID of the User Group to update.
    # @param [Hash] opts the optional parameters
    # @option opts [Boolean] :include_disabled Allow results that involve disabled User Groups.
    # @return [Array<(UsergroupsUsersListSchema, Integer, Hash)>] UsergroupsUsersListSchema data, response status code and response headers
    def usergroups_users_list_with_http_info(token, usergroup, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: UsergroupsApi.usergroups_users_list ...'
      end
      # verify the required parameter 'token' is set
      if @api_client.config.client_side_validation && token.nil?
        fail ArgumentError, "Missing the required parameter 'token' when calling UsergroupsApi.usergroups_users_list"
      end
      # verify the required parameter 'usergroup' is set
      if @api_client.config.client_side_validation && usergroup.nil?
        fail ArgumentError, "Missing the required parameter 'usergroup' when calling UsergroupsApi.usergroups_users_list"
      end
      # resource path
      local_var_path = '/usergroups.users.list'

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'token'] = token
      query_params[:'usergroup'] = usergroup
      query_params[:'include_disabled'] = opts[:'include_disabled'] if !opts[:'include_disabled'].nil?

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'UsergroupsUsersListSchema'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['slackAuth']

      new_options = opts.merge(
        :operation => :"UsergroupsApi.usergroups_users_list",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: UsergroupsApi#usergroups_users_list\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Update the list of users for a User Group
    # @param token [String] Authentication token. Requires scope: &#x60;usergroups:write&#x60;
    # @param usergroup [String] The encoded ID of the User Group to update.
    # @param users [String] A comma separated string of encoded user IDs that represent the entire list of users for the User Group.
    # @param [Hash] opts the optional parameters
    # @option opts [Boolean] :include_count Include the number of users in the User Group.
    # @return [UsergroupsUsersUpdateSchema]
    def usergroups_users_update(token, usergroup, users, opts = {})
      data, _status_code, _headers = usergroups_users_update_with_http_info(token, usergroup, users, opts)
      data
    end

    # Update the list of users for a User Group
    # @param token [String] Authentication token. Requires scope: &#x60;usergroups:write&#x60;
    # @param usergroup [String] The encoded ID of the User Group to update.
    # @param users [String] A comma separated string of encoded user IDs that represent the entire list of users for the User Group.
    # @param [Hash] opts the optional parameters
    # @option opts [Boolean] :include_count Include the number of users in the User Group.
    # @return [Array<(UsergroupsUsersUpdateSchema, Integer, Hash)>] UsergroupsUsersUpdateSchema data, response status code and response headers
    def usergroups_users_update_with_http_info(token, usergroup, users, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: UsergroupsApi.usergroups_users_update ...'
      end
      # verify the required parameter 'token' is set
      if @api_client.config.client_side_validation && token.nil?
        fail ArgumentError, "Missing the required parameter 'token' when calling UsergroupsApi.usergroups_users_update"
      end
      # verify the required parameter 'usergroup' is set
      if @api_client.config.client_side_validation && usergroup.nil?
        fail ArgumentError, "Missing the required parameter 'usergroup' when calling UsergroupsApi.usergroups_users_update"
      end
      # verify the required parameter 'users' is set
      if @api_client.config.client_side_validation && users.nil?
        fail ArgumentError, "Missing the required parameter 'users' when calling UsergroupsApi.usergroups_users_update"
      end
      # resource path
      local_var_path = '/usergroups.users.update'

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
      form_params['usergroup'] = usergroup
      form_params['users'] = users
      form_params['include_count'] = opts[:'include_count'] if !opts[:'include_count'].nil?

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'UsergroupsUsersUpdateSchema'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['slackAuth']

      new_options = opts.merge(
        :operation => :"UsergroupsApi.usergroups_users_update",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: UsergroupsApi#usergroups_users_update\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
