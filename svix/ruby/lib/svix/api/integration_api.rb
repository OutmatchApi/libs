=begin
#Svix API

#Welcome to the Svix API documentation!  Useful links: [Homepage](https://www.svix.com) | [Support email](mailto:support+docs@svix.com) | [Blog](https://www.svix.com/blog/) | [Slack Community](https://www.svix.com/slack/)  # Introduction  This is the reference documentation and schemas for the [Svix webhook service](https://www.svix.com) API. For tutorials and other documentation please refer to [the documentation](https://docs.svix.com).  ## Main concepts  In Svix you have four important entities you will be interacting with:  - `messages`: these are the webhooks being sent. They can have contents and a few other properties. - `application`: this is where `messages` are sent to. Usually you want to create one application for each user on your platform. - `endpoint`: endpoints are the URLs messages will be sent to. Each application can have multiple `endpoints` and each message sent to that application will be sent to all of them (unless they are not subscribed to the sent event type). - `event-type`: event types are identifiers denoting the type of the message being sent. Event types are primarily used to decide which events are sent to which endpoint.   ## Authentication  Get your authentication token (`AUTH_TOKEN`) from the [Svix dashboard](https://dashboard.svix.com) and use it as part of the `Authorization` header as such: `Authorization: Bearer ${AUTH_TOKEN}`.  <SecurityDefinitions />   ## Code samples  The code samples assume you already have the respective libraries installed and you know how to use them. For the latest information on how to do that, please refer to [the documentation](https://docs.svix.com/).   ## Idempotency  Svix supports [idempotency](https://en.wikipedia.org/wiki/Idempotence) for safely retrying requests without accidentally performing the same operation twice. This is useful when an API call is disrupted in transit and you do not receive a response.  To perform an idempotent request, pass the idempotency key in the `Idempotency-Key` header to the request. The idempotency key should be a unique value generated by the client. You can create the key in however way you like, though we suggest using UUID v4, or any other string with enough entropy to avoid collisions.  Svix's idempotency works by saving the resulting status code and body of the first request made for any given idempotency key for any successful request. Subsequent requests with the same key return the same result.  Please note that idempotency is only supported for `POST` requests.   ## Cross-Origin Resource Sharing  This API features Cross-Origin Resource Sharing (CORS) implemented in compliance with [W3C spec](https://www.w3.org/TR/cors/). And that allows cross-domain communication from the browser. All responses have a wildcard same-origin which makes them completely public and accessible to everyone, including any code on any site. 

The version of the OpenAPI document: 1.4.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.1

=end

require 'cgi'

module svix
  class IntegrationApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Create Integration
    # Create an integration.
    # @param app_id [String] 
    # @param integration_in [IntegrationIn] 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :idempotency_key The request&#39;s idempotency key
    # @return [IntegrationOut]
    def create_integration_api_v1_app_app_id_integration_post(app_id, integration_in, opts = {})
      data, _status_code, _headers = create_integration_api_v1_app_app_id_integration_post_with_http_info(app_id, integration_in, opts)
      data
    end

    # Create Integration
    # Create an integration.
    # @param app_id [String] 
    # @param integration_in [IntegrationIn] 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :idempotency_key The request&#39;s idempotency key
    # @return [Array<(IntegrationOut, Integer, Hash)>] IntegrationOut data, response status code and response headers
    def create_integration_api_v1_app_app_id_integration_post_with_http_info(app_id, integration_in, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: IntegrationApi.create_integration_api_v1_app_app_id_integration_post ...'
      end
      # verify the required parameter 'app_id' is set
      if @api_client.config.client_side_validation && app_id.nil?
        fail ArgumentError, "Missing the required parameter 'app_id' when calling IntegrationApi.create_integration_api_v1_app_app_id_integration_post"
      end
      if @api_client.config.client_side_validation && app_id.to_s.length > 256
        fail ArgumentError, 'invalid value for "app_id" when calling IntegrationApi.create_integration_api_v1_app_app_id_integration_post, the character length must be smaller than or equal to 256.'
      end

      if @api_client.config.client_side_validation && app_id.to_s.length < 1
        fail ArgumentError, 'invalid value for "app_id" when calling IntegrationApi.create_integration_api_v1_app_app_id_integration_post, the character length must be great than or equal to 1.'
      end

      pattern = Regexp.new(/^[a-zA-Z0-9\-_.]+$/)
      if @api_client.config.client_side_validation && app_id !~ pattern
        fail ArgumentError, "invalid value for 'app_id' when calling IntegrationApi.create_integration_api_v1_app_app_id_integration_post, must conform to the pattern #{pattern}."
      end

      # verify the required parameter 'integration_in' is set
      if @api_client.config.client_side_validation && integration_in.nil?
        fail ArgumentError, "Missing the required parameter 'integration_in' when calling IntegrationApi.create_integration_api_v1_app_app_id_integration_post"
      end
      # resource path
      local_var_path = '/api/v1/app/{app_id}/integration/'.sub('{' + 'app_id' + '}', CGI.escape(app_id.to_s))

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      content_type = @api_client.select_header_content_type(['application/json'])
      if !content_type.nil?
          header_params['Content-Type'] = content_type
      end
      header_params[:'idempotency-key'] = opts[:'idempotency_key'] if !opts[:'idempotency_key'].nil?

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body] || @api_client.object_to_http_body(integration_in)

      # return_type
      return_type = opts[:debug_return_type] || 'IntegrationOut'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['HTTPBearer']

      new_options = opts.merge(
        :operation => :"IntegrationApi.create_integration_api_v1_app_app_id_integration_post",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: IntegrationApi#create_integration_api_v1_app_app_id_integration_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Delete Integration
    # Delete an integration and revoke it's key.
    # @param integ_id [String] 
    # @param app_id [String] 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :idempotency_key The request&#39;s idempotency key
    # @return [nil]
    def delete_integration_api_v1_app_app_id_integration_integ_id_delete(integ_id, app_id, opts = {})
      delete_integration_api_v1_app_app_id_integration_integ_id_delete_with_http_info(integ_id, app_id, opts)
      nil
    end

    # Delete Integration
    # Delete an integration and revoke it&#39;s key.
    # @param integ_id [String] 
    # @param app_id [String] 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :idempotency_key The request&#39;s idempotency key
    # @return [Array<(nil, Integer, Hash)>] nil, response status code and response headers
    def delete_integration_api_v1_app_app_id_integration_integ_id_delete_with_http_info(integ_id, app_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: IntegrationApi.delete_integration_api_v1_app_app_id_integration_integ_id_delete ...'
      end
      # verify the required parameter 'integ_id' is set
      if @api_client.config.client_side_validation && integ_id.nil?
        fail ArgumentError, "Missing the required parameter 'integ_id' when calling IntegrationApi.delete_integration_api_v1_app_app_id_integration_integ_id_delete"
      end
      # verify the required parameter 'app_id' is set
      if @api_client.config.client_side_validation && app_id.nil?
        fail ArgumentError, "Missing the required parameter 'app_id' when calling IntegrationApi.delete_integration_api_v1_app_app_id_integration_integ_id_delete"
      end
      if @api_client.config.client_side_validation && app_id.to_s.length > 256
        fail ArgumentError, 'invalid value for "app_id" when calling IntegrationApi.delete_integration_api_v1_app_app_id_integration_integ_id_delete, the character length must be smaller than or equal to 256.'
      end

      if @api_client.config.client_side_validation && app_id.to_s.length < 1
        fail ArgumentError, 'invalid value for "app_id" when calling IntegrationApi.delete_integration_api_v1_app_app_id_integration_integ_id_delete, the character length must be great than or equal to 1.'
      end

      pattern = Regexp.new(/^[a-zA-Z0-9\-_.]+$/)
      if @api_client.config.client_side_validation && app_id !~ pattern
        fail ArgumentError, "invalid value for 'app_id' when calling IntegrationApi.delete_integration_api_v1_app_app_id_integration_integ_id_delete, must conform to the pattern #{pattern}."
      end

      # resource path
      local_var_path = '/api/v1/app/{app_id}/integration/{integ_id}/'.sub('{' + 'integ_id' + '}', CGI.escape(integ_id.to_s)).sub('{' + 'app_id' + '}', CGI.escape(app_id.to_s))

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      header_params[:'idempotency-key'] = opts[:'idempotency_key'] if !opts[:'idempotency_key'].nil?

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type]

      # auth_names
      auth_names = opts[:debug_auth_names] || ['HTTPBearer']

      new_options = opts.merge(
        :operation => :"IntegrationApi.delete_integration_api_v1_app_app_id_integration_integ_id_delete",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:DELETE, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: IntegrationApi#delete_integration_api_v1_app_app_id_integration_integ_id_delete\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Get Integration
    # Get an integration.
    # @param integ_id [String] 
    # @param app_id [String] 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :idempotency_key The request&#39;s idempotency key
    # @return [IntegrationOut]
    def get_integration_api_v1_app_app_id_integration_integ_id_get(integ_id, app_id, opts = {})
      data, _status_code, _headers = get_integration_api_v1_app_app_id_integration_integ_id_get_with_http_info(integ_id, app_id, opts)
      data
    end

    # Get Integration
    # Get an integration.
    # @param integ_id [String] 
    # @param app_id [String] 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :idempotency_key The request&#39;s idempotency key
    # @return [Array<(IntegrationOut, Integer, Hash)>] IntegrationOut data, response status code and response headers
    def get_integration_api_v1_app_app_id_integration_integ_id_get_with_http_info(integ_id, app_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: IntegrationApi.get_integration_api_v1_app_app_id_integration_integ_id_get ...'
      end
      # verify the required parameter 'integ_id' is set
      if @api_client.config.client_side_validation && integ_id.nil?
        fail ArgumentError, "Missing the required parameter 'integ_id' when calling IntegrationApi.get_integration_api_v1_app_app_id_integration_integ_id_get"
      end
      # verify the required parameter 'app_id' is set
      if @api_client.config.client_side_validation && app_id.nil?
        fail ArgumentError, "Missing the required parameter 'app_id' when calling IntegrationApi.get_integration_api_v1_app_app_id_integration_integ_id_get"
      end
      if @api_client.config.client_side_validation && app_id.to_s.length > 256
        fail ArgumentError, 'invalid value for "app_id" when calling IntegrationApi.get_integration_api_v1_app_app_id_integration_integ_id_get, the character length must be smaller than or equal to 256.'
      end

      if @api_client.config.client_side_validation && app_id.to_s.length < 1
        fail ArgumentError, 'invalid value for "app_id" when calling IntegrationApi.get_integration_api_v1_app_app_id_integration_integ_id_get, the character length must be great than or equal to 1.'
      end

      pattern = Regexp.new(/^[a-zA-Z0-9\-_.]+$/)
      if @api_client.config.client_side_validation && app_id !~ pattern
        fail ArgumentError, "invalid value for 'app_id' when calling IntegrationApi.get_integration_api_v1_app_app_id_integration_integ_id_get, must conform to the pattern #{pattern}."
      end

      # resource path
      local_var_path = '/api/v1/app/{app_id}/integration/{integ_id}/'.sub('{' + 'integ_id' + '}', CGI.escape(integ_id.to_s)).sub('{' + 'app_id' + '}', CGI.escape(app_id.to_s))

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      header_params[:'idempotency-key'] = opts[:'idempotency_key'] if !opts[:'idempotency_key'].nil?

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'IntegrationOut'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['HTTPBearer']

      new_options = opts.merge(
        :operation => :"IntegrationApi.get_integration_api_v1_app_app_id_integration_integ_id_get",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: IntegrationApi#get_integration_api_v1_app_app_id_integration_integ_id_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Get Integration Key
    # Get an integration's key.
    # @param integ_id [String] 
    # @param app_id [String] 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :idempotency_key The request&#39;s idempotency key
    # @return [IntegrationKeyOut]
    def get_integration_key_api_v1_app_app_id_integration_integ_id_key_get(integ_id, app_id, opts = {})
      data, _status_code, _headers = get_integration_key_api_v1_app_app_id_integration_integ_id_key_get_with_http_info(integ_id, app_id, opts)
      data
    end

    # Get Integration Key
    # Get an integration&#39;s key.
    # @param integ_id [String] 
    # @param app_id [String] 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :idempotency_key The request&#39;s idempotency key
    # @return [Array<(IntegrationKeyOut, Integer, Hash)>] IntegrationKeyOut data, response status code and response headers
    def get_integration_key_api_v1_app_app_id_integration_integ_id_key_get_with_http_info(integ_id, app_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: IntegrationApi.get_integration_key_api_v1_app_app_id_integration_integ_id_key_get ...'
      end
      # verify the required parameter 'integ_id' is set
      if @api_client.config.client_side_validation && integ_id.nil?
        fail ArgumentError, "Missing the required parameter 'integ_id' when calling IntegrationApi.get_integration_key_api_v1_app_app_id_integration_integ_id_key_get"
      end
      # verify the required parameter 'app_id' is set
      if @api_client.config.client_side_validation && app_id.nil?
        fail ArgumentError, "Missing the required parameter 'app_id' when calling IntegrationApi.get_integration_key_api_v1_app_app_id_integration_integ_id_key_get"
      end
      if @api_client.config.client_side_validation && app_id.to_s.length > 256
        fail ArgumentError, 'invalid value for "app_id" when calling IntegrationApi.get_integration_key_api_v1_app_app_id_integration_integ_id_key_get, the character length must be smaller than or equal to 256.'
      end

      if @api_client.config.client_side_validation && app_id.to_s.length < 1
        fail ArgumentError, 'invalid value for "app_id" when calling IntegrationApi.get_integration_key_api_v1_app_app_id_integration_integ_id_key_get, the character length must be great than or equal to 1.'
      end

      pattern = Regexp.new(/^[a-zA-Z0-9\-_.]+$/)
      if @api_client.config.client_side_validation && app_id !~ pattern
        fail ArgumentError, "invalid value for 'app_id' when calling IntegrationApi.get_integration_key_api_v1_app_app_id_integration_integ_id_key_get, must conform to the pattern #{pattern}."
      end

      # resource path
      local_var_path = '/api/v1/app/{app_id}/integration/{integ_id}/key/'.sub('{' + 'integ_id' + '}', CGI.escape(integ_id.to_s)).sub('{' + 'app_id' + '}', CGI.escape(app_id.to_s))

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      header_params[:'idempotency-key'] = opts[:'idempotency_key'] if !opts[:'idempotency_key'].nil?

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'IntegrationKeyOut'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['HTTPBearer']

      new_options = opts.merge(
        :operation => :"IntegrationApi.get_integration_key_api_v1_app_app_id_integration_integ_id_key_get",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: IntegrationApi#get_integration_key_api_v1_app_app_id_integration_integ_id_key_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # List Integrations
    # List the application's integrations.
    # @param app_id [String] 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :iterator 
    # @option opts [Integer] :limit  (default to 50)
    # @option opts [String] :idempotency_key The request&#39;s idempotency key
    # @return [ListResponseIntegrationOut]
    def list_integrations_api_v1_app_app_id_integration_get(app_id, opts = {})
      data, _status_code, _headers = list_integrations_api_v1_app_app_id_integration_get_with_http_info(app_id, opts)
      data
    end

    # List Integrations
    # List the application&#39;s integrations.
    # @param app_id [String] 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :iterator 
    # @option opts [Integer] :limit  (default to 50)
    # @option opts [String] :idempotency_key The request&#39;s idempotency key
    # @return [Array<(ListResponseIntegrationOut, Integer, Hash)>] ListResponseIntegrationOut data, response status code and response headers
    def list_integrations_api_v1_app_app_id_integration_get_with_http_info(app_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: IntegrationApi.list_integrations_api_v1_app_app_id_integration_get ...'
      end
      # verify the required parameter 'app_id' is set
      if @api_client.config.client_side_validation && app_id.nil?
        fail ArgumentError, "Missing the required parameter 'app_id' when calling IntegrationApi.list_integrations_api_v1_app_app_id_integration_get"
      end
      if @api_client.config.client_side_validation && app_id.to_s.length > 256
        fail ArgumentError, 'invalid value for "app_id" when calling IntegrationApi.list_integrations_api_v1_app_app_id_integration_get, the character length must be smaller than or equal to 256.'
      end

      if @api_client.config.client_side_validation && app_id.to_s.length < 1
        fail ArgumentError, 'invalid value for "app_id" when calling IntegrationApi.list_integrations_api_v1_app_app_id_integration_get, the character length must be great than or equal to 1.'
      end

      pattern = Regexp.new(/^[a-zA-Z0-9\-_.]+$/)
      if @api_client.config.client_side_validation && app_id !~ pattern
        fail ArgumentError, "invalid value for 'app_id' when calling IntegrationApi.list_integrations_api_v1_app_app_id_integration_get, must conform to the pattern #{pattern}."
      end

      # resource path
      local_var_path = '/api/v1/app/{app_id}/integration/'.sub('{' + 'app_id' + '}', CGI.escape(app_id.to_s))

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'iterator'] = opts[:'iterator'] if !opts[:'iterator'].nil?
      query_params[:'limit'] = opts[:'limit'] if !opts[:'limit'].nil?

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      header_params[:'idempotency-key'] = opts[:'idempotency_key'] if !opts[:'idempotency_key'].nil?

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'ListResponseIntegrationOut'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['HTTPBearer']

      new_options = opts.merge(
        :operation => :"IntegrationApi.list_integrations_api_v1_app_app_id_integration_get",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: IntegrationApi#list_integrations_api_v1_app_app_id_integration_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Rotate Integration Key
    # Rotate the integration's key. The previous key will be immediately revoked.
    # @param integ_id [String] 
    # @param app_id [String] 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :idempotency_key The request&#39;s idempotency key
    # @return [IntegrationKeyOut]
    def rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post(integ_id, app_id, opts = {})
      data, _status_code, _headers = rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post_with_http_info(integ_id, app_id, opts)
      data
    end

    # Rotate Integration Key
    # Rotate the integration&#39;s key. The previous key will be immediately revoked.
    # @param integ_id [String] 
    # @param app_id [String] 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :idempotency_key The request&#39;s idempotency key
    # @return [Array<(IntegrationKeyOut, Integer, Hash)>] IntegrationKeyOut data, response status code and response headers
    def rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post_with_http_info(integ_id, app_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: IntegrationApi.rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post ...'
      end
      # verify the required parameter 'integ_id' is set
      if @api_client.config.client_side_validation && integ_id.nil?
        fail ArgumentError, "Missing the required parameter 'integ_id' when calling IntegrationApi.rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post"
      end
      # verify the required parameter 'app_id' is set
      if @api_client.config.client_side_validation && app_id.nil?
        fail ArgumentError, "Missing the required parameter 'app_id' when calling IntegrationApi.rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post"
      end
      if @api_client.config.client_side_validation && app_id.to_s.length > 256
        fail ArgumentError, 'invalid value for "app_id" when calling IntegrationApi.rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post, the character length must be smaller than or equal to 256.'
      end

      if @api_client.config.client_side_validation && app_id.to_s.length < 1
        fail ArgumentError, 'invalid value for "app_id" when calling IntegrationApi.rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post, the character length must be great than or equal to 1.'
      end

      pattern = Regexp.new(/^[a-zA-Z0-9\-_.]+$/)
      if @api_client.config.client_side_validation && app_id !~ pattern
        fail ArgumentError, "invalid value for 'app_id' when calling IntegrationApi.rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post, must conform to the pattern #{pattern}."
      end

      # resource path
      local_var_path = '/api/v1/app/{app_id}/integration/{integ_id}/key/rotate/'.sub('{' + 'integ_id' + '}', CGI.escape(integ_id.to_s)).sub('{' + 'app_id' + '}', CGI.escape(app_id.to_s))

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      header_params[:'idempotency-key'] = opts[:'idempotency_key'] if !opts[:'idempotency_key'].nil?

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'IntegrationKeyOut'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['HTTPBearer']

      new_options = opts.merge(
        :operation => :"IntegrationApi.rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: IntegrationApi#rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Update Integration
    # Update an integration.
    # @param integ_id [String] 
    # @param app_id [String] 
    # @param integration_update [IntegrationUpdate] 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :idempotency_key The request&#39;s idempotency key
    # @return [IntegrationOut]
    def update_integration_api_v1_app_app_id_integration_integ_id_put(integ_id, app_id, integration_update, opts = {})
      data, _status_code, _headers = update_integration_api_v1_app_app_id_integration_integ_id_put_with_http_info(integ_id, app_id, integration_update, opts)
      data
    end

    # Update Integration
    # Update an integration.
    # @param integ_id [String] 
    # @param app_id [String] 
    # @param integration_update [IntegrationUpdate] 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :idempotency_key The request&#39;s idempotency key
    # @return [Array<(IntegrationOut, Integer, Hash)>] IntegrationOut data, response status code and response headers
    def update_integration_api_v1_app_app_id_integration_integ_id_put_with_http_info(integ_id, app_id, integration_update, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: IntegrationApi.update_integration_api_v1_app_app_id_integration_integ_id_put ...'
      end
      # verify the required parameter 'integ_id' is set
      if @api_client.config.client_side_validation && integ_id.nil?
        fail ArgumentError, "Missing the required parameter 'integ_id' when calling IntegrationApi.update_integration_api_v1_app_app_id_integration_integ_id_put"
      end
      # verify the required parameter 'app_id' is set
      if @api_client.config.client_side_validation && app_id.nil?
        fail ArgumentError, "Missing the required parameter 'app_id' when calling IntegrationApi.update_integration_api_v1_app_app_id_integration_integ_id_put"
      end
      if @api_client.config.client_side_validation && app_id.to_s.length > 256
        fail ArgumentError, 'invalid value for "app_id" when calling IntegrationApi.update_integration_api_v1_app_app_id_integration_integ_id_put, the character length must be smaller than or equal to 256.'
      end

      if @api_client.config.client_side_validation && app_id.to_s.length < 1
        fail ArgumentError, 'invalid value for "app_id" when calling IntegrationApi.update_integration_api_v1_app_app_id_integration_integ_id_put, the character length must be great than or equal to 1.'
      end

      pattern = Regexp.new(/^[a-zA-Z0-9\-_.]+$/)
      if @api_client.config.client_side_validation && app_id !~ pattern
        fail ArgumentError, "invalid value for 'app_id' when calling IntegrationApi.update_integration_api_v1_app_app_id_integration_integ_id_put, must conform to the pattern #{pattern}."
      end

      # verify the required parameter 'integration_update' is set
      if @api_client.config.client_side_validation && integration_update.nil?
        fail ArgumentError, "Missing the required parameter 'integration_update' when calling IntegrationApi.update_integration_api_v1_app_app_id_integration_integ_id_put"
      end
      # resource path
      local_var_path = '/api/v1/app/{app_id}/integration/{integ_id}/'.sub('{' + 'integ_id' + '}', CGI.escape(integ_id.to_s)).sub('{' + 'app_id' + '}', CGI.escape(app_id.to_s))

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      content_type = @api_client.select_header_content_type(['application/json'])
      if !content_type.nil?
          header_params['Content-Type'] = content_type
      end
      header_params[:'idempotency-key'] = opts[:'idempotency_key'] if !opts[:'idempotency_key'].nil?

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body] || @api_client.object_to_http_body(integration_update)

      # return_type
      return_type = opts[:debug_return_type] || 'IntegrationOut'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['HTTPBearer']

      new_options = opts.merge(
        :operation => :"IntegrationApi.update_integration_api_v1_app_app_id_integration_integ_id_put",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:PUT, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: IntegrationApi#update_integration_api_v1_app_app_id_integration_integ_id_put\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
