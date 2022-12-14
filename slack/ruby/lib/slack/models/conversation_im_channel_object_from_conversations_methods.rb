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
  class ConversationIMChannelObjectFromConversationsMethods
    attr_accessor :created

    attr_accessor :has_pins

    attr_accessor :id

    attr_accessor :is_archived

    attr_accessor :is_ext_shared

    attr_accessor :is_frozen

    attr_accessor :is_im

    attr_accessor :is_open

    attr_accessor :is_org_shared

    attr_accessor :is_shared

    attr_accessor :is_starred

    attr_accessor :is_user_deleted

    attr_accessor :last_read

    attr_accessor :latest

    attr_accessor :parent_conversation

    attr_accessor :pin_count

    attr_accessor :priority

    attr_accessor :shares

    attr_accessor :unread_count

    attr_accessor :unread_count_display

    attr_accessor :user

    attr_accessor :version

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'created' => :'created',
        :'has_pins' => :'has_pins',
        :'id' => :'id',
        :'is_archived' => :'is_archived',
        :'is_ext_shared' => :'is_ext_shared',
        :'is_frozen' => :'is_frozen',
        :'is_im' => :'is_im',
        :'is_open' => :'is_open',
        :'is_org_shared' => :'is_org_shared',
        :'is_shared' => :'is_shared',
        :'is_starred' => :'is_starred',
        :'is_user_deleted' => :'is_user_deleted',
        :'last_read' => :'last_read',
        :'latest' => :'latest',
        :'parent_conversation' => :'parent_conversation',
        :'pin_count' => :'pin_count',
        :'priority' => :'priority',
        :'shares' => :'shares',
        :'unread_count' => :'unread_count',
        :'unread_count_display' => :'unread_count_display',
        :'user' => :'user',
        :'version' => :'version'
      }
    end

    # Returns all the JSON keys this model knows about
    def self.acceptable_attributes
      attribute_map.values
    end

    # Attribute type mapping.
    def self.openapi_types
      {
        :'created' => :'Integer',
        :'has_pins' => :'Boolean',
        :'id' => :'String',
        :'is_archived' => :'Boolean',
        :'is_ext_shared' => :'Boolean',
        :'is_frozen' => :'Boolean',
        :'is_im' => :'Boolean',
        :'is_open' => :'Boolean',
        :'is_org_shared' => :'Boolean',
        :'is_shared' => :'Boolean',
        :'is_starred' => :'Boolean',
        :'is_user_deleted' => :'Boolean',
        :'last_read' => :'String',
        :'latest' => :'Array<ObjsChannelLatestInner>',
        :'parent_conversation' => :'Array<ConversationObjectParentConversationInner>',
        :'pin_count' => :'Integer',
        :'priority' => :'Float',
        :'shares' => :'Array<ConversationIMChannelObjectFromConversationsMethodsSharesInner>',
        :'unread_count' => :'Integer',
        :'unread_count_display' => :'Integer',
        :'user' => :'String',
        :'version' => :'Integer'
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
        fail ArgumentError, "The input argument (attributes) must be a hash in `slack::ConversationIMChannelObjectFromConversationsMethods` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `slack::ConversationIMChannelObjectFromConversationsMethods`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'created')
        self.created = attributes[:'created']
      end

      if attributes.key?(:'has_pins')
        self.has_pins = attributes[:'has_pins']
      end

      if attributes.key?(:'id')
        self.id = attributes[:'id']
      end

      if attributes.key?(:'is_archived')
        self.is_archived = attributes[:'is_archived']
      end

      if attributes.key?(:'is_ext_shared')
        self.is_ext_shared = attributes[:'is_ext_shared']
      end

      if attributes.key?(:'is_frozen')
        self.is_frozen = attributes[:'is_frozen']
      end

      if attributes.key?(:'is_im')
        self.is_im = attributes[:'is_im']
      end

      if attributes.key?(:'is_open')
        self.is_open = attributes[:'is_open']
      end

      if attributes.key?(:'is_org_shared')
        self.is_org_shared = attributes[:'is_org_shared']
      end

      if attributes.key?(:'is_shared')
        self.is_shared = attributes[:'is_shared']
      end

      if attributes.key?(:'is_starred')
        self.is_starred = attributes[:'is_starred']
      end

      if attributes.key?(:'is_user_deleted')
        self.is_user_deleted = attributes[:'is_user_deleted']
      end

      if attributes.key?(:'last_read')
        self.last_read = attributes[:'last_read']
      end

      if attributes.key?(:'latest')
        if (value = attributes[:'latest']).is_a?(Array)
          self.latest = value
        end
      end

      if attributes.key?(:'parent_conversation')
        if (value = attributes[:'parent_conversation']).is_a?(Array)
          self.parent_conversation = value
        end
      end

      if attributes.key?(:'pin_count')
        self.pin_count = attributes[:'pin_count']
      end

      if attributes.key?(:'priority')
        self.priority = attributes[:'priority']
      end

      if attributes.key?(:'shares')
        if (value = attributes[:'shares']).is_a?(Array)
          self.shares = value
        end
      end

      if attributes.key?(:'unread_count')
        self.unread_count = attributes[:'unread_count']
      end

      if attributes.key?(:'unread_count_display')
        self.unread_count_display = attributes[:'unread_count_display']
      end

      if attributes.key?(:'user')
        self.user = attributes[:'user']
      end

      if attributes.key?(:'version')
        self.version = attributes[:'version']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @created.nil?
        invalid_properties.push('invalid value for "created", created cannot be nil.')
      end

      if @id.nil?
        invalid_properties.push('invalid value for "id", id cannot be nil.')
      end

      pattern = Regexp.new(/^[D][A-Z0-9]{8,}$/)
      if @id !~ pattern
        invalid_properties.push("invalid value for \"id\", must conform to the pattern #{pattern}.")
      end

      if @is_im.nil?
        invalid_properties.push('invalid value for "is_im", is_im cannot be nil.')
      end

      if @is_org_shared.nil?
        invalid_properties.push('invalid value for "is_org_shared", is_org_shared cannot be nil.')
      end

      pattern = Regexp.new(/^\d{10}\.\d{6}$/)
      if !@last_read.nil? && @last_read !~ pattern
        invalid_properties.push("invalid value for \"last_read\", must conform to the pattern #{pattern}.")
      end

      if @priority.nil?
        invalid_properties.push('invalid value for "priority", priority cannot be nil.')
      end

      if !@shares.nil? && @shares.length < 0
        invalid_properties.push('invalid value for "shares", number of items must be greater than or equal to 0.')
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
      return false if @created.nil?
      return false if @id.nil?
      return false if @id !~ Regexp.new(/^[D][A-Z0-9]{8,}$/)
      return false if @is_im.nil?
      return false if @is_org_shared.nil?
      return false if !@last_read.nil? && @last_read !~ Regexp.new(/^\d{10}\.\d{6}$/)
      return false if @priority.nil?
      return false if !@shares.nil? && @shares.length < 0
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

      pattern = Regexp.new(/^[D][A-Z0-9]{8,}$/)
      if id !~ pattern
        fail ArgumentError, "invalid value for \"id\", must conform to the pattern #{pattern}."
      end

      @id = id
    end

    # Custom attribute writer method with validation
    # @param [Object] last_read Value to be assigned
    def last_read=(last_read)
      pattern = Regexp.new(/^\d{10}\.\d{6}$/)
      if !last_read.nil? && last_read !~ pattern
        fail ArgumentError, "invalid value for \"last_read\", must conform to the pattern #{pattern}."
      end

      @last_read = last_read
    end

    # Custom attribute writer method with validation
    # @param [Object] shares Value to be assigned
    def shares=(shares)
      if !shares.nil? && shares.length < 0
        fail ArgumentError, 'invalid value for "shares", number of items must be greater than or equal to 0.'
      end

      @shares = shares
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
          created == o.created &&
          has_pins == o.has_pins &&
          id == o.id &&
          is_archived == o.is_archived &&
          is_ext_shared == o.is_ext_shared &&
          is_frozen == o.is_frozen &&
          is_im == o.is_im &&
          is_open == o.is_open &&
          is_org_shared == o.is_org_shared &&
          is_shared == o.is_shared &&
          is_starred == o.is_starred &&
          is_user_deleted == o.is_user_deleted &&
          last_read == o.last_read &&
          latest == o.latest &&
          parent_conversation == o.parent_conversation &&
          pin_count == o.pin_count &&
          priority == o.priority &&
          shares == o.shares &&
          unread_count == o.unread_count &&
          unread_count_display == o.unread_count_display &&
          user == o.user &&
          version == o.version
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [created, has_pins, id, is_archived, is_ext_shared, is_frozen, is_im, is_open, is_org_shared, is_shared, is_starred, is_user_deleted, last_read, latest, parent_conversation, pin_count, priority, shares, unread_count, unread_count_display, user, version].hash
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
