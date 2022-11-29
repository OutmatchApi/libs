=begin
#Svix API

#Welcome to the Svix API documentation!  Useful links: [Homepage](https://www.svix.com) | [Support email](mailto:support+docs@svix.com) | [Blog](https://www.svix.com/blog/) | [Slack Community](https://www.svix.com/slack/)  # Introduction  This is the reference documentation and schemas for the [Svix webhook service](https://www.svix.com) API. For tutorials and other documentation please refer to [the documentation](https://docs.svix.com).  ## Main concepts  In Svix you have four important entities you will be interacting with:  - `messages`: these are the webhooks being sent. They can have contents and a few other properties. - `application`: this is where `messages` are sent to. Usually you want to create one application for each user on your platform. - `endpoint`: endpoints are the URLs messages will be sent to. Each application can have multiple `endpoints` and each message sent to that application will be sent to all of them (unless they are not subscribed to the sent event type). - `event-type`: event types are identifiers denoting the type of the message being sent. Event types are primarily used to decide which events are sent to which endpoint.   ## Authentication  Get your authentication token (`AUTH_TOKEN`) from the [Svix dashboard](https://dashboard.svix.com) and use it as part of the `Authorization` header as such: `Authorization: Bearer ${AUTH_TOKEN}`.  <SecurityDefinitions />   ## Code samples  The code samples assume you already have the respective libraries installed and you know how to use them. For the latest information on how to do that, please refer to [the documentation](https://docs.svix.com/).   ## Idempotency  Svix supports [idempotency](https://en.wikipedia.org/wiki/Idempotence) for safely retrying requests without accidentally performing the same operation twice. This is useful when an API call is disrupted in transit and you do not receive a response.  To perform an idempotent request, pass the idempotency key in the `Idempotency-Key` header to the request. The idempotency key should be a unique value generated by the client. You can create the key in however way you like, though we suggest using UUID v4, or any other string with enough entropy to avoid collisions.  Svix's idempotency works by saving the resulting status code and body of the first request made for any given idempotency key for any successful request. Subsequent requests with the same key return the same result.  Please note that idempotency is only supported for `POST` requests.   ## Cross-Origin Resource Sharing  This API features Cross-Origin Resource Sharing (CORS) implemented in compliance with [W3C spec](https://www.w3.org/TR/cors/). And that allows cross-domain communication from the browser. All responses have a wildcard same-origin which makes them completely public and accessible to everyone, including any code on any site. 

The version of the OpenAPI document: 1.4.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.1

=end

require 'cgi'

module apitest
  class EventTypeApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Create Event Type
    # Create new or unarchive existing event type.  Unarchiving an event type will allow endpoints to filter on it and messages to be sent with it. Endpoints filtering on the event type before archival will continue to filter on it. This operation does not preserve the description and schemas.
    # @param event_type_in [EventTypeIn] 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :idempotency_key The request&#39;s idempotency key
    # @return [EventTypeOut]
    def create_event_type_api_v1_event_type_post(event_type_in, opts = {})
      data, _status_code, _headers = create_event_type_api_v1_event_type_post_with_http_info(event_type_in, opts)
      data
    end

    # Create Event Type
    # Create new or unarchive existing event type.  Unarchiving an event type will allow endpoints to filter on it and messages to be sent with it. Endpoints filtering on the event type before archival will continue to filter on it. This operation does not preserve the description and schemas.
    # @param event_type_in [EventTypeIn] 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :idempotency_key The request&#39;s idempotency key
    # @return [Array<(EventTypeOut, Integer, Hash)>] EventTypeOut data, response status code and response headers
    def create_event_type_api_v1_event_type_post_with_http_info(event_type_in, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: EventTypeApi.create_event_type_api_v1_event_type_post ...'
      end
      # verify the required parameter 'event_type_in' is set
      if @api_client.config.client_side_validation && event_type_in.nil?
        fail ArgumentError, "Missing the required parameter 'event_type_in' when calling EventTypeApi.create_event_type_api_v1_event_type_post"
      end
      # resource path
      local_var_path = '/api/v1/event-type/'

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
      post_body = opts[:debug_body] || @api_client.object_to_http_body(event_type_in)

      # return_type
      return_type = opts[:debug_return_type] || 'EventTypeOut'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['HTTPBearer']

      new_options = opts.merge(
        :operation => :"EventTypeApi.create_event_type_api_v1_event_type_post",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: EventTypeApi#create_event_type_api_v1_event_type_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Archive Event Type
    # Archive an event type.  Endpoints already configured to filter on an event type will continue to do so after archival. However, new messages can not be sent with it and endpoints can not filter on it. An event type can be unarchived with the [create operation](#operation/create_event_type_api_v1_event_type__post).
    # @param event_type_name [String] 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :idempotency_key The request&#39;s idempotency key
    # @return [nil]
    def delete_event_type_api_v1_event_type_event_type_name_delete(event_type_name, opts = {})
      delete_event_type_api_v1_event_type_event_type_name_delete_with_http_info(event_type_name, opts)
      nil
    end

    # Archive Event Type
    # Archive an event type.  Endpoints already configured to filter on an event type will continue to do so after archival. However, new messages can not be sent with it and endpoints can not filter on it. An event type can be unarchived with the [create operation](#operation/create_event_type_api_v1_event_type__post).
    # @param event_type_name [String] 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :idempotency_key The request&#39;s idempotency key
    # @return [Array<(nil, Integer, Hash)>] nil, response status code and response headers
    def delete_event_type_api_v1_event_type_event_type_name_delete_with_http_info(event_type_name, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: EventTypeApi.delete_event_type_api_v1_event_type_event_type_name_delete ...'
      end
      # verify the required parameter 'event_type_name' is set
      if @api_client.config.client_side_validation && event_type_name.nil?
        fail ArgumentError, "Missing the required parameter 'event_type_name' when calling EventTypeApi.delete_event_type_api_v1_event_type_event_type_name_delete"
      end
      if @api_client.config.client_side_validation && event_type_name.to_s.length > 256
        fail ArgumentError, 'invalid value for "event_type_name" when calling EventTypeApi.delete_event_type_api_v1_event_type_event_type_name_delete, the character length must be smaller than or equal to 256.'
      end

      pattern = Regexp.new(/^[a-zA-Z0-9\-_.]+$/)
      if @api_client.config.client_side_validation && event_type_name !~ pattern
        fail ArgumentError, "invalid value for 'event_type_name' when calling EventTypeApi.delete_event_type_api_v1_event_type_event_type_name_delete, must conform to the pattern #{pattern}."
      end

      # resource path
      local_var_path = '/api/v1/event-type/{event_type_name}/'.sub('{' + 'event_type_name' + '}', CGI.escape(event_type_name.to_s))

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
        :operation => :"EventTypeApi.delete_event_type_api_v1_event_type_event_type_name_delete",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:DELETE, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: EventTypeApi#delete_event_type_api_v1_event_type_event_type_name_delete\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Get Event Type
    # Get an event type.
    # @param event_type_name [String] 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :idempotency_key The request&#39;s idempotency key
    # @return [EventTypeOut]
    def get_event_type_api_v1_event_type_event_type_name_get(event_type_name, opts = {})
      data, _status_code, _headers = get_event_type_api_v1_event_type_event_type_name_get_with_http_info(event_type_name, opts)
      data
    end

    # Get Event Type
    # Get an event type.
    # @param event_type_name [String] 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :idempotency_key The request&#39;s idempotency key
    # @return [Array<(EventTypeOut, Integer, Hash)>] EventTypeOut data, response status code and response headers
    def get_event_type_api_v1_event_type_event_type_name_get_with_http_info(event_type_name, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: EventTypeApi.get_event_type_api_v1_event_type_event_type_name_get ...'
      end
      # verify the required parameter 'event_type_name' is set
      if @api_client.config.client_side_validation && event_type_name.nil?
        fail ArgumentError, "Missing the required parameter 'event_type_name' when calling EventTypeApi.get_event_type_api_v1_event_type_event_type_name_get"
      end
      if @api_client.config.client_side_validation && event_type_name.to_s.length > 256
        fail ArgumentError, 'invalid value for "event_type_name" when calling EventTypeApi.get_event_type_api_v1_event_type_event_type_name_get, the character length must be smaller than or equal to 256.'
      end

      pattern = Regexp.new(/^[a-zA-Z0-9\-_.]+$/)
      if @api_client.config.client_side_validation && event_type_name !~ pattern
        fail ArgumentError, "invalid value for 'event_type_name' when calling EventTypeApi.get_event_type_api_v1_event_type_event_type_name_get, must conform to the pattern #{pattern}."
      end

      # resource path
      local_var_path = '/api/v1/event-type/{event_type_name}/'.sub('{' + 'event_type_name' + '}', CGI.escape(event_type_name.to_s))

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
      return_type = opts[:debug_return_type] || 'EventTypeOut'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['HTTPBearer']

      new_options = opts.merge(
        :operation => :"EventTypeApi.get_event_type_api_v1_event_type_event_type_name_get",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: EventTypeApi#get_event_type_api_v1_event_type_event_type_name_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # List Event Types
    # Return the list of event types.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :iterator 
    # @option opts [Integer] :limit  (default to 50)
    # @option opts [Boolean] :with_content  (default to false)
    # @option opts [Boolean] :include_archived  (default to false)
    # @option opts [String] :idempotency_key The request&#39;s idempotency key
    # @return [ListResponseEventTypeOut]
    def list_event_types_api_v1_event_type_get(opts = {})
      data, _status_code, _headers = list_event_types_api_v1_event_type_get_with_http_info(opts)
      data
    end

    # List Event Types
    # Return the list of event types.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :iterator 
    # @option opts [Integer] :limit  (default to 50)
    # @option opts [Boolean] :with_content  (default to false)
    # @option opts [Boolean] :include_archived  (default to false)
    # @option opts [String] :idempotency_key The request&#39;s idempotency key
    # @return [Array<(ListResponseEventTypeOut, Integer, Hash)>] ListResponseEventTypeOut data, response status code and response headers
    def list_event_types_api_v1_event_type_get_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: EventTypeApi.list_event_types_api_v1_event_type_get ...'
      end
      if @api_client.config.client_side_validation && !opts[:'iterator'].nil? && opts[:'iterator'].to_s.length > 256
        fail ArgumentError, 'invalid value for "opts[:"iterator"]" when calling EventTypeApi.list_event_types_api_v1_event_type_get, the character length must be smaller than or equal to 256.'
      end

      pattern = Regexp.new(/^[a-zA-Z0-9\-_.]+$/)
      if @api_client.config.client_side_validation && !opts[:'iterator'].nil? && opts[:'iterator'] !~ pattern
        fail ArgumentError, "invalid value for 'opts[:\"iterator\"]' when calling EventTypeApi.list_event_types_api_v1_event_type_get, must conform to the pattern #{pattern}."
      end

      if @api_client.config.client_side_validation && !opts[:'limit'].nil? && opts[:'limit'] > 250
        fail ArgumentError, 'invalid value for "opts[:"limit"]" when calling EventTypeApi.list_event_types_api_v1_event_type_get, must be smaller than or equal to 250.'
      end

      # resource path
      local_var_path = '/api/v1/event-type/'

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'iterator'] = opts[:'iterator'] if !opts[:'iterator'].nil?
      query_params[:'limit'] = opts[:'limit'] if !opts[:'limit'].nil?
      query_params[:'with_content'] = opts[:'with_content'] if !opts[:'with_content'].nil?
      query_params[:'include_archived'] = opts[:'include_archived'] if !opts[:'include_archived'].nil?

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
      return_type = opts[:debug_return_type] || 'ListResponseEventTypeOut'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['HTTPBearer']

      new_options = opts.merge(
        :operation => :"EventTypeApi.list_event_types_api_v1_event_type_get",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: EventTypeApi#list_event_types_api_v1_event_type_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Update Event Type
    # Update an event type.
    # @param event_type_name [String] 
    # @param event_type_update [EventTypeUpdate] 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :idempotency_key The request&#39;s idempotency key
    # @return [EventTypeOut]
    def update_event_type_api_v1_event_type_event_type_name_put(event_type_name, event_type_update, opts = {})
      data, _status_code, _headers = update_event_type_api_v1_event_type_event_type_name_put_with_http_info(event_type_name, event_type_update, opts)
      data
    end

    # Update Event Type
    # Update an event type.
    # @param event_type_name [String] 
    # @param event_type_update [EventTypeUpdate] 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :idempotency_key The request&#39;s idempotency key
    # @return [Array<(EventTypeOut, Integer, Hash)>] EventTypeOut data, response status code and response headers
    def update_event_type_api_v1_event_type_event_type_name_put_with_http_info(event_type_name, event_type_update, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: EventTypeApi.update_event_type_api_v1_event_type_event_type_name_put ...'
      end
      # verify the required parameter 'event_type_name' is set
      if @api_client.config.client_side_validation && event_type_name.nil?
        fail ArgumentError, "Missing the required parameter 'event_type_name' when calling EventTypeApi.update_event_type_api_v1_event_type_event_type_name_put"
      end
      if @api_client.config.client_side_validation && event_type_name.to_s.length > 256
        fail ArgumentError, 'invalid value for "event_type_name" when calling EventTypeApi.update_event_type_api_v1_event_type_event_type_name_put, the character length must be smaller than or equal to 256.'
      end

      pattern = Regexp.new(/^[a-zA-Z0-9\-_.]+$/)
      if @api_client.config.client_side_validation && event_type_name !~ pattern
        fail ArgumentError, "invalid value for 'event_type_name' when calling EventTypeApi.update_event_type_api_v1_event_type_event_type_name_put, must conform to the pattern #{pattern}."
      end

      # verify the required parameter 'event_type_update' is set
      if @api_client.config.client_side_validation && event_type_update.nil?
        fail ArgumentError, "Missing the required parameter 'event_type_update' when calling EventTypeApi.update_event_type_api_v1_event_type_event_type_name_put"
      end
      # resource path
      local_var_path = '/api/v1/event-type/{event_type_name}/'.sub('{' + 'event_type_name' + '}', CGI.escape(event_type_name.to_s))

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
      post_body = opts[:debug_body] || @api_client.object_to_http_body(event_type_update)

      # return_type
      return_type = opts[:debug_return_type] || 'EventTypeOut'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['HTTPBearer']

      new_options = opts.merge(
        :operation => :"EventTypeApi.update_event_type_api_v1_event_type_event_type_name_put",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:PUT, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: EventTypeApi#update_event_type_api_v1_event_type_event_type_name_put\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
