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
  class UsersSetPhotoSchemaProfile
    attr_accessor :avatar_hash

    attr_accessor :image_1024

    attr_accessor :image_192

    attr_accessor :image_24

    attr_accessor :image_32

    attr_accessor :image_48

    attr_accessor :image_512

    attr_accessor :image_72

    attr_accessor :image_original

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'avatar_hash' => :'avatar_hash',
        :'image_1024' => :'image_1024',
        :'image_192' => :'image_192',
        :'image_24' => :'image_24',
        :'image_32' => :'image_32',
        :'image_48' => :'image_48',
        :'image_512' => :'image_512',
        :'image_72' => :'image_72',
        :'image_original' => :'image_original'
      }
    end

    # Returns all the JSON keys this model knows about
    def self.acceptable_attributes
      attribute_map.values
    end

    # Attribute type mapping.
    def self.openapi_types
      {
        :'avatar_hash' => :'String',
        :'image_1024' => :'String',
        :'image_192' => :'String',
        :'image_24' => :'String',
        :'image_32' => :'String',
        :'image_48' => :'String',
        :'image_512' => :'String',
        :'image_72' => :'String',
        :'image_original' => :'String'
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
        fail ArgumentError, "The input argument (attributes) must be a hash in `slack::UsersSetPhotoSchemaProfile` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `slack::UsersSetPhotoSchemaProfile`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'avatar_hash')
        self.avatar_hash = attributes[:'avatar_hash']
      end

      if attributes.key?(:'image_1024')
        self.image_1024 = attributes[:'image_1024']
      end

      if attributes.key?(:'image_192')
        self.image_192 = attributes[:'image_192']
      end

      if attributes.key?(:'image_24')
        self.image_24 = attributes[:'image_24']
      end

      if attributes.key?(:'image_32')
        self.image_32 = attributes[:'image_32']
      end

      if attributes.key?(:'image_48')
        self.image_48 = attributes[:'image_48']
      end

      if attributes.key?(:'image_512')
        self.image_512 = attributes[:'image_512']
      end

      if attributes.key?(:'image_72')
        self.image_72 = attributes[:'image_72']
      end

      if attributes.key?(:'image_original')
        self.image_original = attributes[:'image_original']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @avatar_hash.nil?
        invalid_properties.push('invalid value for "avatar_hash", avatar_hash cannot be nil.')
      end

      pattern = Regexp.new(/^[0-9a-f]{12}$/)
      if @avatar_hash !~ pattern
        invalid_properties.push("invalid value for \"avatar_hash\", must conform to the pattern #{pattern}.")
      end

      if @image_1024.nil?
        invalid_properties.push('invalid value for "image_1024", image_1024 cannot be nil.')
      end

      if @image_192.nil?
        invalid_properties.push('invalid value for "image_192", image_192 cannot be nil.')
      end

      if @image_24.nil?
        invalid_properties.push('invalid value for "image_24", image_24 cannot be nil.')
      end

      if @image_32.nil?
        invalid_properties.push('invalid value for "image_32", image_32 cannot be nil.')
      end

      if @image_48.nil?
        invalid_properties.push('invalid value for "image_48", image_48 cannot be nil.')
      end

      if @image_512.nil?
        invalid_properties.push('invalid value for "image_512", image_512 cannot be nil.')
      end

      if @image_72.nil?
        invalid_properties.push('invalid value for "image_72", image_72 cannot be nil.')
      end

      if @image_original.nil?
        invalid_properties.push('invalid value for "image_original", image_original cannot be nil.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @avatar_hash.nil?
      return false if @avatar_hash !~ Regexp.new(/^[0-9a-f]{12}$/)
      return false if @image_1024.nil?
      return false if @image_192.nil?
      return false if @image_24.nil?
      return false if @image_32.nil?
      return false if @image_48.nil?
      return false if @image_512.nil?
      return false if @image_72.nil?
      return false if @image_original.nil?
      true
    end

    # Custom attribute writer method with validation
    # @param [Object] avatar_hash Value to be assigned
    def avatar_hash=(avatar_hash)
      if avatar_hash.nil?
        fail ArgumentError, 'avatar_hash cannot be nil'
      end

      pattern = Regexp.new(/^[0-9a-f]{12}$/)
      if avatar_hash !~ pattern
        fail ArgumentError, "invalid value for \"avatar_hash\", must conform to the pattern #{pattern}."
      end

      @avatar_hash = avatar_hash
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          avatar_hash == o.avatar_hash &&
          image_1024 == o.image_1024 &&
          image_192 == o.image_192 &&
          image_24 == o.image_24 &&
          image_32 == o.image_32 &&
          image_48 == o.image_48 &&
          image_512 == o.image_512 &&
          image_72 == o.image_72 &&
          image_original == o.image_original
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [avatar_hash, image_1024, image_192, image_24, image_32, image_48, image_512, image_72, image_original].hash
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
