=begin
#Slack Web API

#One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.

The version of the OpenAPI document: 1.7.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.1

=end

require 'date'
require 'time'

module slack
  class ObjsEnterpriseUser
    attr_accessor :enterprise_id

    attr_accessor :enterprise_name

    attr_accessor :id

    attr_accessor :is_admin

    attr_accessor :is_owner

    attr_accessor :teams

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'enterprise_id' => :'enterprise_id',
        :'enterprise_name' => :'enterprise_name',
        :'id' => :'id',
        :'is_admin' => :'is_admin',
        :'is_owner' => :'is_owner',
        :'teams' => :'teams'
      }
    end

    # Returns all the JSON keys this model knows about
    def self.acceptable_attributes
      attribute_map.values
    end

    # Attribute type mapping.
    def self.openapi_types
      {
        :'enterprise_id' => :'String',
        :'enterprise_name' => :'String',
        :'id' => :'String',
        :'is_admin' => :'Boolean',
        :'is_owner' => :'Boolean',
        :'teams' => :'Array<String>'
      }
    end

    # List of attributes with nullable: true
    def self.openapi_nullable
      Set.new([
      ])
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `slack::ObjsEnterpriseUser` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `slack::ObjsEnterpriseUser`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'enterprise_id')
        self.enterprise_id = attributes[:'enterprise_id']
      end

      if attributes.key?(:'enterprise_name')
        self.enterprise_name = attributes[:'enterprise_name']
      end

      if attributes.key?(:'id')
        self.id = attributes[:'id']
      end

      if attributes.key?(:'is_admin')
        self.is_admin = attributes[:'is_admin']
      end

      if attributes.key?(:'is_owner')
        self.is_owner = attributes[:'is_owner']
      end

      if attributes.key?(:'teams')
        if (value = attributes[:'teams']).is_a?(Array)
          self.teams = value
        end
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @enterprise_id.nil?
        invalid_properties.push('invalid value for "enterprise_id", enterprise_id cannot be nil.')
      end

      pattern = Regexp.new(/^[E][A-Z0-9]{8,}$/)
      if @enterprise_id !~ pattern
        invalid_properties.push("invalid value for \"enterprise_id\", must conform to the pattern #{pattern}.")
      end

      if @enterprise_name.nil?
        invalid_properties.push('invalid value for "enterprise_name", enterprise_name cannot be nil.')
      end

      if @id.nil?
        invalid_properties.push('invalid value for "id", id cannot be nil.')
      end

      pattern = Regexp.new(/^[WU][A-Z0-9]{8,}$/)
      if @id !~ pattern
        invalid_properties.push("invalid value for \"id\", must conform to the pattern #{pattern}.")
      end

      if @is_admin.nil?
        invalid_properties.push('invalid value for "is_admin", is_admin cannot be nil.')
      end

      if @is_owner.nil?
        invalid_properties.push('invalid value for "is_owner", is_owner cannot be nil.')
      end

      if @teams.nil?
        invalid_properties.push('invalid value for "teams", teams cannot be nil.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @enterprise_id.nil?
      return false if @enterprise_id !~ Regexp.new(/^[E][A-Z0-9]{8,}$/)
      return false if @enterprise_name.nil?
      return false if @id.nil?
      return false if @id !~ Regexp.new(/^[WU][A-Z0-9]{8,}$/)
      return false if @is_admin.nil?
      return false if @is_owner.nil?
      return false if @teams.nil?
      true
    end

    # Custom attribute writer method with validation
    # @param [Object] enterprise_id Value to be assigned
    def enterprise_id=(enterprise_id)
      if enterprise_id.nil?
        fail ArgumentError, 'enterprise_id cannot be nil'
      end

      pattern = Regexp.new(/^[E][A-Z0-9]{8,}$/)
      if enterprise_id !~ pattern
        fail ArgumentError, "invalid value for \"enterprise_id\", must conform to the pattern #{pattern}."
      end

      @enterprise_id = enterprise_id
    end

    # Custom attribute writer method with validation
    # @param [Object] id Value to be assigned
    def id=(id)
      if id.nil?
        fail ArgumentError, 'id cannot be nil'
      end

      pattern = Regexp.new(/^[WU][A-Z0-9]{8,}$/)
      if id !~ pattern
        fail ArgumentError, "invalid value for \"id\", must conform to the pattern #{pattern}."
      end

      @id = id
    end

    # Custom attribute writer method with validation
    # @param [Object] teams Value to be assigned
    def teams=(teams)
      if teams.nil?
        fail ArgumentError, 'teams cannot be nil'
      end

      @teams = teams
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          enterprise_id == o.enterprise_id &&
          enterprise_name == o.enterprise_name &&
          id == o.id &&
          is_admin == o.is_admin &&
          is_owner == o.is_owner &&
          teams == o.teams
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [enterprise_id, enterprise_name, id, is_admin, is_owner, teams].hash
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
        klass = slack.const_get(type)
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
