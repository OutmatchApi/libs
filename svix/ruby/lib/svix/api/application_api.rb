=begin
#Svix API

#Welcome to the Svix API documentation!  Useful links: [Homepage](https://www.svix.com) | [Support email](mailto:support+docs@svix.com) | [Blog](https://www.svix.com/blog/) | [Slack Community](https://www.svix.com/slack/)  # Introduction  This is the reference documentation and schemas for the [Svix webhook service](https://www.svix.com) API. For tutorials and other documentation please refer to [the documentation](https://docs.svix.com).  ## Main concepts  In Svix you have four important entities you will be interacting with:  - `messages`: these are the webhooks being sent. They can have contents and a few other properties. - `application`: this is where `messages` are sent to. Usually you want to create one application for each user on your platform. - `endpoint`: endpoints are the URLs messages will be sent to. Each application can have multiple `endpoints` and each message sent to that application will be sent to all of them (unless they are not subscribed to the sent event type). - `event-type`: event types are identifiers denoting the type of the message being sent. Event types are primarily used to decide which events are sent to which endpoint.   ## Authentication  Get your authentication token (`AUTH_TOKEN`) from the [Svix dashboard](https://dashboard.svix.com) and use it as part of the `Authorization` header as such: `Authorization: Bearer ${AUTH_TOKEN}`.  <SecurityDefinitions />   ## Code samples  The code samples assume you already have the respective libraries installed and you know how to use them. For the latest information on how to do that, please refer to [the documentation](https://docs.svix.com/).   ## Idempotency  Svix supports [idempotency](https://en.wikipedia.org/wiki/Idempotence) for safely retrying requests without accidentally performing the same operation twice. This is useful when an API call is disrupted in transit and you do not receive a response.  To perform an idempotent request, pass the idempotency key in the `Idempotency-Key` header to the request. The idempotency key should be a unique value generated by the client. You can create the key in however way you like, though we suggest using UUID v4, or any other string with enough entropy to avoid collisions.  Svix's idempotency works by saving the resulting status code and body of the first request made for any given idempotency key for any successful request. Subsequent requests with the same key return the same result.  Please note that idempotency is only supported for `POST` requests.   ## Cross-Origin Resource Sharing  This API features Cross-Origin Resource Sharing (CORS) implemented in compliance with [W3C spec](https://www.w3.org/TR/cors/). And that allows cross-domain communication from the browser. All responses have a wildcard same-origin which makes them completely public and accessible to everyone, including any code on any site. 

The version of the OpenAPI document: 1.4.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.1

=end

require 'cgi'

module svix
  class ApplicationApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Create Application
    # Create a new application.
    # @param application_in [ApplicationIn] 
    # @param [Hash] opts the optional parameters
    # @option opts [Boolean] :get_if_exists Get an existing application, or create a new one if doesn&#39;t exist. It&#39;s two separate functions in the libs. (default to false)
    # @option opts [String] :idempotency_key The request&#39;s idempotency key
    # @return [ApplicationOut]
    def create_application_api_v1_app_post(application_in, opts = {})
      data, _status_code, _headers = create_application_api_v1_app_post_with_http_info(application_in, opts)
      data
    end

    # Create Application
    # Create a new application.
    # @param application_in [ApplicationIn] 
    # @param [Hash] opts the optional parameters
    # @option opts [Boolean] :get_if_exists Get an existing application, or create a new one if doesn&#39;t exist. It&#39;s two separate functions in the libs. (default to false)
    # @option opts [String] :idempotency_key The request&#39;s idempotency key
    # @return [Array<(ApplicationOut, Integer, Hash)>] ApplicationOut data, response status code and response headers
    def create_application_api_v1_app_post_with_http_info(application_in, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: ApplicationApi.create_application_api_v1_app_post ...'
      end
      # verify the required parameter 'application_in' is set
      if @api_client.config.client_side_validation && application_in.nil?
        fail ArgumentError, "Missing the required parameter 'application_in' when calling ApplicationApi.create_application_api_v1_app_post"
      end
      # resource path
      local_var_path = '/api/v1/app/'

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'get_if_exists'] = opts[:'get_if_exists'] if !opts[:'get_if_exists'].nil?

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
      post_body = opts[:debug_body] || @api_client.object_to_http_body(application_in)

      # return_type
      return_type = opts[:debug_return_type] || 'ApplicationOut'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['HTTPBearer']

      new_options = opts.merge(
        :operation => :"ApplicationApi.create_application_api_v1_app_post",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: ApplicationApi#create_application_api_v1_app_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Delete Application
    # Delete an application.
    # @param app_id [String] 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :idempotency_key The request&#39;s idempotency key
    # @return [nil]
    def delete_application_api_v1_app_app_id_delete(app_id, opts = {})
      delete_application_api_v1_app_app_id_delete_with_http_info(app_id, opts)
      nil
    end

    # Delete Application
    # Delete an application.
    # @param app_id [String] 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :idempotency_key The request&#39;s idempotency key
    # @return [Array<(nil, Integer, Hash)>] nil, response status code and response headers
    def delete_application_api_v1_app_app_id_delete_with_http_info(app_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: ApplicationApi.delete_application_api_v1_app_app_id_delete ...'
      end
      # verify the required parameter 'app_id' is set
      if @api_client.config.client_side_validation && app_id.nil?
        fail ArgumentError, "Missing the required parameter 'app_id' when calling ApplicationApi.delete_application_api_v1_app_app_id_delete"
      end
      if @api_client.config.client_side_validation && app_id.to_s.length > 256
        fail ArgumentError, 'invalid value for "app_id" when calling ApplicationApi.delete_application_api_v1_app_app_id_delete, the character length must be smaller than or equal to 256.'
      end

      if @api_client.config.client_side_validation && app_id.to_s.length < 1
        fail ArgumentError, 'invalid value for "app_id" when calling ApplicationApi.delete_application_api_v1_app_app_id_delete, the character length must be great than or equal to 1.'
      end

      pattern = Regexp.new(/^[a-zA-Z0-9\-_.]+$/)
      if @api_client.config.client_side_validation && app_id !~ pattern
        fail ArgumentError, "invalid value for 'app_id' when calling ApplicationApi.delete_application_api_v1_app_app_id_delete, must conform to the pattern #{pattern}."
      end

      # resource path
      local_var_path = '/api/v1/app/{app_id}/'.sub('{' + 'app_id' + '}', CGI.escape(app_id.to_s))

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
        :operation => :"ApplicationApi.delete_application_api_v1_app_app_id_delete",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:DELETE, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: ApplicationApi#delete_application_api_v1_app_app_id_delete\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Get Application
    # Get an application.
    # @param app_id [String] 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :idempotency_key The request&#39;s idempotency key
    # @return [ApplicationOut]
    def get_application_api_v1_app_app_id_get(app_id, opts = {})
      data, _status_code, _headers = get_application_api_v1_app_app_id_get_with_http_info(app_id, opts)
      data
    end

    # Get Application
    # Get an application.
    # @param app_id [String] 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :idempotency_key The request&#39;s idempotency key
    # @return [Array<(ApplicationOut, Integer, Hash)>] ApplicationOut data, response status code and response headers
    def get_application_api_v1_app_app_id_get_with_http_info(app_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: ApplicationApi.get_application_api_v1_app_app_id_get ...'
      end
      # verify the required parameter 'app_id' is set
      if @api_client.config.client_side_validation && app_id.nil?
        fail ArgumentError, "Missing the required parameter 'app_id' when calling ApplicationApi.get_application_api_v1_app_app_id_get"
      end
      if @api_client.config.client_side_validation && app_id.to_s.length > 256
        fail ArgumentError, 'invalid value for "app_id" when calling ApplicationApi.get_application_api_v1_app_app_id_get, the character length must be smaller than or equal to 256.'
      end

      if @api_client.config.client_side_validation && app_id.to_s.length < 1
        fail ArgumentError, 'invalid value for "app_id" when calling ApplicationApi.get_application_api_v1_app_app_id_get, the character length must be great than or equal to 1.'
      end

      pattern = Regexp.new(/^[a-zA-Z0-9\-_.]+$/)
      if @api_client.config.client_side_validation && app_id !~ pattern
        fail ArgumentError, "invalid value for 'app_id' when calling ApplicationApi.get_application_api_v1_app_app_id_get, must conform to the pattern #{pattern}."
      end

      # resource path
      local_var_path = '/api/v1/app/{app_id}/'.sub('{' + 'app_id' + '}', CGI.escape(app_id.to_s))

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
      return_type = opts[:debug_return_type] || 'ApplicationOut'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['HTTPBearer']

      new_options = opts.merge(
        :operation => :"ApplicationApi.get_application_api_v1_app_app_id_get",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: ApplicationApi#get_application_api_v1_app_app_id_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # List Applications
    # List of all the organization's applications.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :iterator 
    # @option opts [Integer] :limit  (default to 50)
    # @option opts [String] :idempotency_key The request&#39;s idempotency key
    # @return [ListResponseApplicationOut]
    def list_applications_api_v1_app_get(opts = {})
      data, _status_code, _headers = list_applications_api_v1_app_get_with_http_info(opts)
      data
    end

    # List Applications
    # List of all the organization&#39;s applications.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :iterator 
    # @option opts [Integer] :limit  (default to 50)
    # @option opts [String] :idempotency_key The request&#39;s idempotency key
    # @return [Array<(ListResponseApplicationOut, Integer, Hash)>] ListResponseApplicationOut data, response status code and response headers
    def list_applications_api_v1_app_get_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: ApplicationApi.list_applications_api_v1_app_get ...'
      end
      if @api_client.config.client_side_validation && !opts[:'limit'].nil? && opts[:'limit'] > 250
        fail ArgumentError, 'invalid value for "opts[:"limit"]" when calling ApplicationApi.list_applications_api_v1_app_get, must be smaller than or equal to 250.'
      end

      # resource path
      local_var_path = '/api/v1/app/'

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
      return_type = opts[:debug_return_type] || 'ListResponseApplicationOut'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['HTTPBearer']

      new_options = opts.merge(
        :operation => :"ApplicationApi.list_applications_api_v1_app_get",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: ApplicationApi#list_applications_api_v1_app_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Update Application
    # Update an application.
    # @param app_id [String] 
    # @param application_in [ApplicationIn] 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :idempotency_key The request&#39;s idempotency key
    # @return [ApplicationOut]
    def update_application_api_v1_app_app_id_put(app_id, application_in, opts = {})
      data, _status_code, _headers = update_application_api_v1_app_app_id_put_with_http_info(app_id, application_in, opts)
      data
    end

    # Update Application
    # Update an application.
    # @param app_id [String] 
    # @param application_in [ApplicationIn] 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :idempotency_key The request&#39;s idempotency key
    # @return [Array<(ApplicationOut, Integer, Hash)>] ApplicationOut data, response status code and response headers
    def update_application_api_v1_app_app_id_put_with_http_info(app_id, application_in, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: ApplicationApi.update_application_api_v1_app_app_id_put ...'
      end
      # verify the required parameter 'app_id' is set
      if @api_client.config.client_side_validation && app_id.nil?
        fail ArgumentError, "Missing the required parameter 'app_id' when calling ApplicationApi.update_application_api_v1_app_app_id_put"
      end
      if @api_client.config.client_side_validation && app_id.to_s.length > 256
        fail ArgumentError, 'invalid value for "app_id" when calling ApplicationApi.update_application_api_v1_app_app_id_put, the character length must be smaller than or equal to 256.'
      end

      if @api_client.config.client_side_validation && app_id.to_s.length < 1
        fail ArgumentError, 'invalid value for "app_id" when calling ApplicationApi.update_application_api_v1_app_app_id_put, the character length must be great than or equal to 1.'
      end

      pattern = Regexp.new(/^[a-zA-Z0-9\-_.]+$/)
      if @api_client.config.client_side_validation && app_id !~ pattern
        fail ArgumentError, "invalid value for 'app_id' when calling ApplicationApi.update_application_api_v1_app_app_id_put, must conform to the pattern #{pattern}."
      end

      # verify the required parameter 'application_in' is set
      if @api_client.config.client_side_validation && application_in.nil?
        fail ArgumentError, "Missing the required parameter 'application_in' when calling ApplicationApi.update_application_api_v1_app_app_id_put"
      end
      # resource path
      local_var_path = '/api/v1/app/{app_id}/'.sub('{' + 'app_id' + '}', CGI.escape(app_id.to_s))

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
      post_body = opts[:debug_body] || @api_client.object_to_http_body(application_in)

      # return_type
      return_type = opts[:debug_return_type] || 'ApplicationOut'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['HTTPBearer']

      new_options = opts.merge(
        :operation => :"ApplicationApi.update_application_api_v1_app_app_id_put",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:PUT, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: ApplicationApi#update_application_api_v1_app_app_id_put\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
