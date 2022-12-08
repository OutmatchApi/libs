=begin
#Slack Web API

#One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.

The version of the OpenAPI document: 1.7.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.1

=end

require 'cgi'

module slack
  class EmojiApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Lists custom emoji for a team.
    # @param token [String] Authentication token. Requires scope: &#x60;emoji:read&#x60;
    # @param [Hash] opts the optional parameters
    # @return [DefaultSuccessTemplate]
    def emoji_list(token, opts = {})
      data, _status_code, _headers = emoji_list_with_http_info(token, opts)
      data
    end

    # Lists custom emoji for a team.
    # @param token [String] Authentication token. Requires scope: &#x60;emoji:read&#x60;
    # @param [Hash] opts the optional parameters
    # @return [Array<(DefaultSuccessTemplate, Integer, Hash)>] DefaultSuccessTemplate data, response status code and response headers
    def emoji_list_with_http_info(token, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: EmojiApi.emoji_list ...'
      end
      # verify the required parameter 'token' is set
      if @api_client.config.client_side_validation && token.nil?
        fail ArgumentError, "Missing the required parameter 'token' when calling EmojiApi.emoji_list"
      end
      # resource path
      local_var_path = '/emoji.list'

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
      return_type = opts[:debug_return_type] || 'DefaultSuccessTemplate'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['slackAuth']

      new_options = opts.merge(
        :operation => :"EmojiApi.emoji_list",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: EmojiApi#emoji_list\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
