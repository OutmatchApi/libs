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
  class ObjsComment
    attr_accessor :comment

    attr_accessor :created

    attr_accessor :id

    attr_accessor :is_intro

    attr_accessor :is_starred

    attr_accessor :num_stars

    attr_accessor :pinned_info

    attr_accessor :pinned_to

    attr_accessor :reactions

    attr_accessor :timestamp

    attr_accessor :user

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'comment' => :'comment',
        :'created' => :'created',
        :'id' => :'id',
        :'is_intro' => :'is_intro',
        :'is_starred' => :'is_starred',
        :'num_stars' => :'num_stars',
        :'pinned_info' => :'pinned_info',
        :'pinned_to' => :'pinned_to',
        :'reactions' => :'reactions',
        :'timestamp' => :'timestamp',
        :'user' => :'user'
      }
    end

    # Returns all the JSON keys this model knows about
    def self.acceptable_attributes
      attribute_map.values
    end

    # Attribute type mapping.
    def self.openapi_types
      {
        :'comment' => :'String',
        :'created' => :'Integer',
        :'id' => :'String',
        :'is_intro' => :'Boolean',
        :'is_starred' => :'Boolean',
        :'num_stars' => :'Integer',
        :'pinned_info' => :'Object',
        :'pinned_to' => :'Array<String>',
        :'reactions' => :'Array<ObjsReaction>',
        :'timestamp' => :'Integer',
        :'user' => :'String'
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
        fail ArgumentError, "The input argument (attributes) must be a hash in `slack::ObjsComment` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `slack::ObjsComment`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'comment')
        self.comment = attributes[:'comment']
      end

      if attributes.key?(:'created')
        self.created = attributes[:'created']
      end

      if attributes.key?(:'id')
        self.id = attributes[:'id']
      end

      if attributes.key?(:'is_intro')
        self.is_intro = attributes[:'is_intro']
      end

      if attributes.key?(:'is_starred')
        self.is_starred = attributes[:'is_starred']
      end

      if attributes.key?(:'num_stars')
        self.num_stars = attributes[:'num_stars']
      end

      if attributes.key?(:'pinned_info')
        self.pinned_info = attributes[:'pinned_info']
      end

      if attributes.key?(:'pinned_to')
        if (value = attributes[:'pinned_to']).is_a?(Array)
          self.pinned_to = value
        end
      end

      if attributes.key?(:'reactions')
        if (value = attributes[:'reactions']).is_a?(Array)
          self.reactions = value
        end
      end

      if attributes.key?(:'timestamp')
        self.timestamp = attributes[:'timestamp']
      end

      if attributes.key?(:'user')
        self.user = attributes[:'user']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @comment.nil?
        invalid_properties.push('invalid value for "comment", comment cannot be nil.')
      end

      if @created.nil?
        invalid_properties.push('invalid value for "created", created cannot be nil.')
      end

      if @id.nil?
        invalid_properties.push('invalid value for "id", id cannot be nil.')
      end

      pattern = Regexp.new(/^Fc[A-Z0-9]{8,}$/)
      if @id !~ pattern
        invalid_properties.push("invalid value for \"id\", must conform to the pattern #{pattern}.")
      end

      if @is_intro.nil?
        invalid_properties.push('invalid value for "is_intro", is_intro cannot be nil.')
      end

      if @timestamp.nil?
        invalid_properties.push('invalid value for "timestamp", timestamp cannot be nil.')
      end

      if @user.nil?
        invalid_properties.push('invalid value for "user", user cannot be nil.')
      end

      pattern = Regexp.new(/^[UW][A-Z0-9]{2,}$/)
      if @user !~ pattern
        invalid_properties.push("invalid value for \"user\", must conform to the pattern #{pattern}.")
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @comment.nil?
      return false if @created.nil?
      return false if @id.nil?
      return false if @id !~ Regexp.new(/^Fc[A-Z0-9]{8,}$/)
      return false if @is_intro.nil?
      return false if @timestamp.nil?
      return false if @user.nil?
      return false if @user !~ Regexp.new(/^[UW][A-Z0-9]{2,}$/)
      true
    end

    # Custom attribute writer method with validation
    # @param [Object] id Value to be assigned
    def id=(id)
      if id.nil?
        fail ArgumentError, 'id cannot be nil'
      end

      pattern = Regexp.new(/^Fc[A-Z0-9]{8,}$/)
      if id !~ pattern
        fail ArgumentError, "invalid value for \"id\", must conform to the pattern #{pattern}."
      end

      @id = id
    end

    # Custom attribute writer method with validation
    # @param [Object] user Value to be assigned
    def user=(user)
      if user.nil?
        fail ArgumentError, 'user cannot be nil'
      end

      pattern = Regexp.new(/^[UW][A-Z0-9]{2,}$/)
      if user !~ pattern
        fail ArgumentError, "invalid value for \"user\", must conform to the pattern #{pattern}."
      end

      @user = user
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          comment == o.comment &&
          created == o.created &&
          id == o.id &&
          is_intro == o.is_intro &&
          is_starred == o.is_starred &&
          num_stars == o.num_stars &&
          pinned_info == o.pinned_info &&
          pinned_to == o.pinned_to &&
          reactions == o.reactions &&
          timestamp == o.timestamp &&
          user == o.user
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [comment, created, id, is_intro, is_starred, num_stars, pinned_info, pinned_to, reactions, timestamp, user].hash
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