=begin
#Svix API

#Welcome to the Svix API documentation!  Useful links: [Homepage](https://www.svix.com) | [Support email](mailto:support+docs@svix.com) | [Blog](https://www.svix.com/blog/) | [Slack Community](https://www.svix.com/slack/)  # Introduction  This is the reference documentation and schemas for the [Svix webhook service](https://www.svix.com) API. For tutorials and other documentation please refer to [the documentation](https://docs.svix.com).  ## Main concepts  In Svix you have four important entities you will be interacting with:  - `messages`: these are the webhooks being sent. They can have contents and a few other properties. - `application`: this is where `messages` are sent to. Usually you want to create one application for each user on your platform. - `endpoint`: endpoints are the URLs messages will be sent to. Each application can have multiple `endpoints` and each message sent to that application will be sent to all of them (unless they are not subscribed to the sent event type). - `event-type`: event types are identifiers denoting the type of the message being sent. Event types are primarily used to decide which events are sent to which endpoint.   ## Authentication  Get your authentication token (`AUTH_TOKEN`) from the [Svix dashboard](https://dashboard.svix.com) and use it as part of the `Authorization` header as such: `Authorization: Bearer ${AUTH_TOKEN}`.  <SecurityDefinitions />   ## Code samples  The code samples assume you already have the respective libraries installed and you know how to use them. For the latest information on how to do that, please refer to [the documentation](https://docs.svix.com/).   ## Idempotency  Svix supports [idempotency](https://en.wikipedia.org/wiki/Idempotence) for safely retrying requests without accidentally performing the same operation twice. This is useful when an API call is disrupted in transit and you do not receive a response.  To perform an idempotent request, pass the idempotency key in the `Idempotency-Key` header to the request. The idempotency key should be a unique value generated by the client. You can create the key in however way you like, though we suggest using UUID v4, or any other string with enough entropy to avoid collisions.  Svix's idempotency works by saving the resulting status code and body of the first request made for any given idempotency key for any successful request. Subsequent requests with the same key return the same result.  Please note that idempotency is only supported for `POST` requests.   ## Cross-Origin Resource Sharing  This API features Cross-Origin Resource Sharing (CORS) implemented in compliance with [W3C spec](https://www.w3.org/TR/cors/). And that allows cross-domain communication from the browser. All responses have a wildcard same-origin which makes them completely public and accessible to everyone, including any code on any site. 

The version of the OpenAPI document: 1.4.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.1

=end

require 'date'
require 'time'

module svix
  class MessageAttemptExhaustedEventData
    attr_accessor :app_id

    # Optional unique identifier for the application
    attr_accessor :app_uid

    attr_accessor :msg_id

    # Optional unique identifier for the message
    attr_accessor :msg_event_id

    attr_accessor :endpoint_id

    attr_accessor :last_attempt

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'app_id' => :'appId',
        :'app_uid' => :'appUid',
        :'msg_id' => :'msgId',
        :'msg_event_id' => :'msgEventId',
        :'endpoint_id' => :'endpointId',
        :'last_attempt' => :'lastAttempt'
      }
    end

    # Returns all the JSON keys this model knows about
    def self.acceptable_attributes
      attribute_map.values
    end

    # Attribute type mapping.
    def self.openapi_types
      {
        :'app_id' => :'String',
        :'app_uid' => :'String',
        :'msg_id' => :'String',
        :'msg_event_id' => :'String',
        :'endpoint_id' => :'String',
        :'last_attempt' => :'MessageAttemptFailedData'
      }
    end

    # List of attributes with nullable: true
    def self.openapi_nullable
      Set.new([
        :'app_uid',
        :'msg_event_id',
      ])
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `svix::MessageAttemptExhaustedEventData` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `svix::MessageAttemptExhaustedEventData`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'app_id')
        self.app_id = attributes[:'app_id']
      end

      if attributes.key?(:'app_uid')
        self.app_uid = attributes[:'app_uid']
      end

      if attributes.key?(:'msg_id')
        self.msg_id = attributes[:'msg_id']
      end

      if attributes.key?(:'msg_event_id')
        self.msg_event_id = attributes[:'msg_event_id']
      end

      if attributes.key?(:'endpoint_id')
        self.endpoint_id = attributes[:'endpoint_id']
      end

      if attributes.key?(:'last_attempt')
        self.last_attempt = attributes[:'last_attempt']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @app_id.nil?
        invalid_properties.push('invalid value for "app_id", app_id cannot be nil.')
      end

      if !@app_uid.nil? && @app_uid.to_s.length > 256
        invalid_properties.push('invalid value for "app_uid", the character length must be smaller than or equal to 256.')
      end

      if !@app_uid.nil? && @app_uid.to_s.length < 1
        invalid_properties.push('invalid value for "app_uid", the character length must be great than or equal to 1.')
      end

      pattern = Regexp.new(/^[a-zA-Z0-9\-_.]+$/)
      if !@app_uid.nil? && @app_uid !~ pattern
        invalid_properties.push("invalid value for \"app_uid\", must conform to the pattern #{pattern}.")
      end

      if @msg_id.nil?
        invalid_properties.push('invalid value for "msg_id", msg_id cannot be nil.')
      end

      if !@msg_event_id.nil? && @msg_event_id.to_s.length > 256
        invalid_properties.push('invalid value for "msg_event_id", the character length must be smaller than or equal to 256.')
      end

      if !@msg_event_id.nil? && @msg_event_id.to_s.length < 1
        invalid_properties.push('invalid value for "msg_event_id", the character length must be great than or equal to 1.')
      end

      pattern = Regexp.new(/^[a-zA-Z0-9\-_.]+$/)
      if !@msg_event_id.nil? && @msg_event_id !~ pattern
        invalid_properties.push("invalid value for \"msg_event_id\", must conform to the pattern #{pattern}.")
      end

      if @endpoint_id.nil?
        invalid_properties.push('invalid value for "endpoint_id", endpoint_id cannot be nil.')
      end

      if @last_attempt.nil?
        invalid_properties.push('invalid value for "last_attempt", last_attempt cannot be nil.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @app_id.nil?
      return false if !@app_uid.nil? && @app_uid.to_s.length > 256
      return false if !@app_uid.nil? && @app_uid.to_s.length < 1
      return false if !@app_uid.nil? && @app_uid !~ Regexp.new(/^[a-zA-Z0-9\-_.]+$/)
      return false if @msg_id.nil?
      return false if !@msg_event_id.nil? && @msg_event_id.to_s.length > 256
      return false if !@msg_event_id.nil? && @msg_event_id.to_s.length < 1
      return false if !@msg_event_id.nil? && @msg_event_id !~ Regexp.new(/^[a-zA-Z0-9\-_.]+$/)
      return false if @endpoint_id.nil?
      return false if @last_attempt.nil?
      true
    end

    # Custom attribute writer method with validation
    # @param [Object] app_uid Value to be assigned
    def app_uid=(app_uid)
      if !app_uid.nil? && app_uid.to_s.length > 256
        fail ArgumentError, 'invalid value for "app_uid", the character length must be smaller than or equal to 256.'
      end

      if !app_uid.nil? && app_uid.to_s.length < 1
        fail ArgumentError, 'invalid value for "app_uid", the character length must be great than or equal to 1.'
      end

      pattern = Regexp.new(/^[a-zA-Z0-9\-_.]+$/)
      if !app_uid.nil? && app_uid !~ pattern
        fail ArgumentError, "invalid value for \"app_uid\", must conform to the pattern #{pattern}."
      end

      @app_uid = app_uid
    end

    # Custom attribute writer method with validation
    # @param [Object] msg_event_id Value to be assigned
    def msg_event_id=(msg_event_id)
      if !msg_event_id.nil? && msg_event_id.to_s.length > 256
        fail ArgumentError, 'invalid value for "msg_event_id", the character length must be smaller than or equal to 256.'
      end

      if !msg_event_id.nil? && msg_event_id.to_s.length < 1
        fail ArgumentError, 'invalid value for "msg_event_id", the character length must be great than or equal to 1.'
      end

      pattern = Regexp.new(/^[a-zA-Z0-9\-_.]+$/)
      if !msg_event_id.nil? && msg_event_id !~ pattern
        fail ArgumentError, "invalid value for \"msg_event_id\", must conform to the pattern #{pattern}."
      end

      @msg_event_id = msg_event_id
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          app_id == o.app_id &&
          app_uid == o.app_uid &&
          msg_id == o.msg_id &&
          msg_event_id == o.msg_event_id &&
          endpoint_id == o.endpoint_id &&
          last_attempt == o.last_attempt
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [app_id, app_uid, msg_id, msg_event_id, endpoint_id, last_attempt].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def self.build_from_hash(attributes)
      new.build_from_hash(attributes)
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      attributes = attributes.transform_keys(&:to_sym)
      self.class.openapi_types.each_pair do |key, type|
        if attributes[self.class.attribute_map[key]].nil? && self.class.openapi_nullable.include?(key)
          self.send("#{key}=", nil)
        elsif type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the attribute
          # is documented as an array but the input is not
          if attributes[self.class.attribute_map[key]].is_a?(Array)
            self.send("#{key}=", attributes[self.class.attribute_map[key]].map { |v| _deserialize($1, v) })
          end
        elsif !attributes[self.class.attribute_map[key]].nil?
          self.send("#{key}=", _deserialize(type, attributes[self.class.attribute_map[key]]))
        end
      end

      self
    end

    # Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def _deserialize(type, value)
      case type.to_sym
      when :Time
        Time.parse(value)
      when :Date
        Date.parse(value)
      when :String
        value.to_s
      when :Integer
        value.to_i
      when :Float
        value.to_f
      when :Boolean
        if value.to_s =~ /\A(true|t|yes|y|1)\z/i
          true
        else
          false
        end
      when :Object
        # generic object (usually a Hash), return directly
        value
      when /\AArray<(?<inner_type>.+)>\z/
        inner_type = Regexp.last_match[:inner_type]
        value.map { |v| _deserialize(inner_type, v) }
      when /\AHash<(?<k_type>.+?), (?<v_type>.+)>\z/
        k_type = Regexp.last_match[:k_type]
        v_type = Regexp.last_match[:v_type]
        {}.tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        # models (e.g. Pet) or oneOf
        klass = svix.const_get(type)
        klass.respond_to?(:openapi_one_of) ? klass.build(value) : klass.build_from_hash(value)
      end
    end

    # Returns the string representation of the object
    # @return [String] String presentation of the object
    def to_s
      to_hash.to_s
    end

    # to_body is an alias to to_hash (backward compatibility)
    # @return [Hash] Returns the object in the form of hash
    def to_body
      to_hash
    end

    # Returns the object in the form of hash
    # @return [Hash] Returns the object in the form of hash
    def to_hash
      hash = {}
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        if value.nil?
          is_nullable = self.class.openapi_nullable.include?(attr)
          next if !is_nullable || (is_nullable && !instance_variable_defined?(:"@#{attr}"))
        end

        hash[param] = _to_hash(value)
      end
      hash
    end

    # Outputs non-array value in the form of hash
    # For object, use to_hash. Otherwise, just return the value
    # @param [Object] value Any valid value
    # @return [Hash] Returns the value in the form of hash
    def _to_hash(value)
      if value.is_a?(Array)
        value.compact.map { |v| _to_hash(v) }
      elsif value.is_a?(Hash)
        {}.tap do |hash|
          value.each { |k, v| hash[k] = _to_hash(v) }
        end
      elsif value.respond_to? :to_hash
        value.to_hash
      else
        value
      end
    end

  end

end
