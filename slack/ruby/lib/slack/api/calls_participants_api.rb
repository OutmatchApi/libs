=begin
#Slack Web API

#One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.

The version of the OpenAPI document: 1.7.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.1

=end

require 'cgi'

module slack
  class CallsParticipantsApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Registers new participants added to a Call.
    # @param token [String] Authentication token. Requires scope: &#x60;calls:write&#x60;
    # @param id [String] &#x60;id&#x60; returned by the [&#x60;calls.add&#x60;](/methods/calls.add) method.
    # @param users [String] The list of users to add as participants in the Call. [Read more on how to specify users here](/apis/calls#users).
    # @param [Hash] opts the optional parameters
    # @return [DefaultSuccessTemplate]
    def calls_participants_add(token, id, users, opts = {})
      data, _status_code, _headers = calls_participants_add_with_http_info(token, id, users, opts)
      data
    end

    # Registers new participants added to a Call.
    # @param token [String] Authentication token. Requires scope: &#x60;calls:write&#x60;
    # @param id [String] &#x60;id&#x60; returned by the [&#x60;calls.add&#x60;](/methods/calls.add) method.
    # @param users [String] The list of users to add as participants in the Call. [Read more on how to specify users here](/apis/calls#users).
    # @param [Hash] opts the optional parameters
    # @return [Array<(DefaultSuccessTemplate, Integer, Hash)>] DefaultSuccessTemplate data, response status code and response headers
    def calls_participants_add_with_http_info(token, id, users, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: CallsParticipantsApi.calls_participants_add ...'
      end
      # verify the required parameter 'token' is set
      if @api_client.config.client_side_validation && token.nil?
        fail ArgumentError, "Missing the required parameter 'token' when calling CallsParticipantsApi.calls_participants_add"
      end
      # verify the required parameter 'id' is set
      if @api_client.config.client_side_validation && id.nil?
        fail ArgumentError, "Missing the required parameter 'id' when calling CallsParticipantsApi.calls_participants_add"
      end
      # verify the required parameter 'users' is set
      if @api_client.config.client_side_validation && users.nil?
        fail ArgumentError, "Missing the required parameter 'users' when calling CallsParticipantsApi.calls_participants_add"
      end
      # resource path
      local_var_path = '/calls.participants.add'

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
      form_params['id'] = id
      form_params['users'] = users

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'DefaultSuccessTemplate'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['slackAuth']

      new_options = opts.merge(
        :operation => :"CallsParticipantsApi.calls_participants_add",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: CallsParticipantsApi#calls_participants_add\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Registers participants removed from a Call.
    # @param token [String] Authentication token. Requires scope: &#x60;calls:write&#x60;
    # @param id [String] &#x60;id&#x60; returned by the [&#x60;calls.add&#x60;](/methods/calls.add) method.
    # @param users [String] The list of users to remove as participants in the Call. [Read more on how to specify users here](/apis/calls#users).
    # @param [Hash] opts the optional parameters
    # @return [DefaultSuccessTemplate]
    def calls_participants_remove(token, id, users, opts = {})
      data, _status_code, _headers = calls_participants_remove_with_http_info(token, id, users, opts)
      data
    end

    # Registers participants removed from a Call.
    # @param token [String] Authentication token. Requires scope: &#x60;calls:write&#x60;
    # @param id [String] &#x60;id&#x60; returned by the [&#x60;calls.add&#x60;](/methods/calls.add) method.
    # @param users [String] The list of users to remove as participants in the Call. [Read more on how to specify users here](/apis/calls#users).
    # @param [Hash] opts the optional parameters
    # @return [Array<(DefaultSuccessTemplate, Integer, Hash)>] DefaultSuccessTemplate data, response status code and response headers
    def calls_participants_remove_with_http_info(token, id, users, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: CallsParticipantsApi.calls_participants_remove ...'
      end
      # verify the required parameter 'token' is set
      if @api_client.config.client_side_validation && token.nil?
        fail ArgumentError, "Missing the required parameter 'token' when calling CallsParticipantsApi.calls_participants_remove"
      end
      # verify the required parameter 'id' is set
      if @api_client.config.client_side_validation && id.nil?
        fail ArgumentError, "Missing the required parameter 'id' when calling CallsParticipantsApi.calls_participants_remove"
      end
      # verify the required parameter 'users' is set
      if @api_client.config.client_side_validation && users.nil?
        fail ArgumentError, "Missing the required parameter 'users' when calling CallsParticipantsApi.calls_participants_remove"
      end
      # resource path
      local_var_path = '/calls.participants.remove'

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
      form_params['id'] = id
      form_params['users'] = users

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'DefaultSuccessTemplate'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['slackAuth']

      new_options = opts.merge(
        :operation => :"CallsParticipantsApi.calls_participants_remove",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: CallsParticipantsApi#calls_participants_remove\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end