=begin
#Slack Web API

#One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.

The version of the OpenAPI document: 1.7.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.1

=end

require 'cgi'

module slack
  class ChatScheduledMessagesApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Returns a list of scheduled messages.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :token Authentication token. Requires scope: &#x60;none&#x60;
    # @option opts [String] :channel The channel of the scheduled messages
    # @option opts [Float] :latest A UNIX timestamp of the latest value in the time range
    # @option opts [Float] :oldest A UNIX timestamp of the oldest value in the time range
    # @option opts [Integer] :limit Maximum number of original entries to return.
    # @option opts [String] :cursor For pagination purposes, this is the &#x60;cursor&#x60; value returned from a previous call to &#x60;chat.scheduledmessages.list&#x60; indicating where you want to start this call from.
    # @return [ChatScheduledMessagesListSchema]
    def chat_scheduled_messages_list(opts = {})
      data, _status_code, _headers = chat_scheduled_messages_list_with_http_info(opts)
      data
    end

    # Returns a list of scheduled messages.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :token Authentication token. Requires scope: &#x60;none&#x60;
    # @option opts [String] :channel The channel of the scheduled messages
    # @option opts [Float] :latest A UNIX timestamp of the latest value in the time range
    # @option opts [Float] :oldest A UNIX timestamp of the oldest value in the time range
    # @option opts [Integer] :limit Maximum number of original entries to return.
    # @option opts [String] :cursor For pagination purposes, this is the &#x60;cursor&#x60; value returned from a previous call to &#x60;chat.scheduledmessages.list&#x60; indicating where you want to start this call from.
    # @return [Array<(ChatScheduledMessagesListSchema, Integer, Hash)>] ChatScheduledMessagesListSchema data, response status code and response headers
    def chat_scheduled_messages_list_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: ChatScheduledMessagesApi.chat_scheduled_messages_list ...'
      end
      # resource path
      local_var_path = '/chat.scheduledMessages.list'

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'channel'] = opts[:'channel'] if !opts[:'channel'].nil?
      query_params[:'latest'] = opts[:'latest'] if !opts[:'latest'].nil?
      query_params[:'oldest'] = opts[:'oldest'] if !opts[:'oldest'].nil?
      query_params[:'limit'] = opts[:'limit'] if !opts[:'limit'].nil?
      query_params[:'cursor'] = opts[:'cursor'] if !opts[:'cursor'].nil?

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      header_params[:'token'] = opts[:'token'] if !opts[:'token'].nil?

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'ChatScheduledMessagesListSchema'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['slackAuth']

      new_options = opts.merge(
        :operation => :"ChatScheduledMessagesApi.chat_scheduled_messages_list",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: ChatScheduledMessagesApi#chat_scheduled_messages_list\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
