=begin
#api.video

#api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.

The version of the OpenAPI document: 1.0.1

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.1

=end

require 'date'
require 'time'

module video-api
  class Playerinput
    # RGBA color: bottom 50% of background. Default: rgba(0, 0, 0, .7)
    attr_accessor :background_bottom

    # RGBA color for title text. Default: rgba(255, 255, 255, 1)
    attr_accessor :background_text

    # RGBA color: top 50% of background. Default: rgba(0, 0, 0, .7)
    attr_accessor :background_top

    # enable/disable player SDK access. Default: true
    attr_accessor :enable_api

    # enable/disable player controls. Default: true
    attr_accessor :enable_controls

    # enable/disable player autoplay. Default: false
    attr_accessor :force_autoplay

    # enable/disable looping. Default: false
    attr_accessor :force_loop

    # enable/disable title. Default: false
    attr_accessor :hide_title

    # RGBA color for all controls. Default: rgba(255, 255, 255, 1)
    attr_accessor :link

    # RGBA color for all controls when hovered. Default: rgba(255, 255, 255, 1)
    attr_accessor :link_hover

    # RGBA color for timer text. Default: rgba(255, 255, 255, 1)
    attr_accessor :text

    # RGBA color playback bar: background. Default: rgba(255, 255, 255, .2)
    attr_accessor :track_background

    # RGBA color playback bar: played content. Default: rgba(88, 131, 255, .95)
    attr_accessor :track_played

    # RGBA color playback bar: downloaded but unplayed (buffered) content. Default: rgba(255, 255, 255, .35)
    attr_accessor :track_unplayed

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'background_bottom' => :'backgroundBottom',
        :'background_text' => :'backgroundText',
        :'background_top' => :'backgroundTop',
        :'enable_api' => :'enableApi',
        :'enable_controls' => :'enableControls',
        :'force_autoplay' => :'forceAutoplay',
        :'force_loop' => :'forceLoop',
        :'hide_title' => :'hideTitle',
        :'link' => :'link',
        :'link_hover' => :'linkHover',
        :'text' => :'text',
        :'track_background' => :'trackBackground',
        :'track_played' => :'trackPlayed',
        :'track_unplayed' => :'trackUnplayed'
      }
    end

    # Returns all the JSON keys this model knows about
    def self.acceptable_attributes
      attribute_map.values
    end

    # Attribute type mapping.
    def self.openapi_types
      {
        :'background_bottom' => :'String',
        :'background_text' => :'String',
        :'background_top' => :'String',
        :'enable_api' => :'Boolean',
        :'enable_controls' => :'Boolean',
        :'force_autoplay' => :'Boolean',
        :'force_loop' => :'Boolean',
        :'hide_title' => :'Boolean',
        :'link' => :'String',
        :'link_hover' => :'String',
        :'text' => :'String',
        :'track_background' => :'String',
        :'track_played' => :'String',
        :'track_unplayed' => :'String'
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
        fail ArgumentError, "The input argument (attributes) must be a hash in `video-api::Playerinput` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `video-api::Playerinput`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'background_bottom')
        self.background_bottom = attributes[:'background_bottom']
      end

      if attributes.key?(:'background_text')
        self.background_text = attributes[:'background_text']
      end

      if attributes.key?(:'background_top')
        self.background_top = attributes[:'background_top']
      end

      if attributes.key?(:'enable_api')
        self.enable_api = attributes[:'enable_api']
      else
        self.enable_api = true
      end

      if attributes.key?(:'enable_controls')
        self.enable_controls = attributes[:'enable_controls']
      else
        self.enable_controls = true
      end

      if attributes.key?(:'force_autoplay')
        self.force_autoplay = attributes[:'force_autoplay']
      else
        self.force_autoplay = false
      end

      if attributes.key?(:'force_loop')
        self.force_loop = attributes[:'force_loop']
      else
        self.force_loop = false
      end

      if attributes.key?(:'hide_title')
        self.hide_title = attributes[:'hide_title']
      else
        self.hide_title = false
      end

      if attributes.key?(:'link')
        self.link = attributes[:'link']
      end

      if attributes.key?(:'link_hover')
        self.link_hover = attributes[:'link_hover']
      end

      if attributes.key?(:'text')
        self.text = attributes[:'text']
      end

      if attributes.key?(:'track_background')
        self.track_background = attributes[:'track_background']
      end

      if attributes.key?(:'track_played')
        self.track_played = attributes[:'track_played']
      end

      if attributes.key?(:'track_unplayed')
        self.track_unplayed = attributes[:'track_unplayed']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          background_bottom == o.background_bottom &&
          background_text == o.background_text &&
          background_top == o.background_top &&
          enable_api == o.enable_api &&
          enable_controls == o.enable_controls &&
          force_autoplay == o.force_autoplay &&
          force_loop == o.force_loop &&
          hide_title == o.hide_title &&
          link == o.link &&
          link_hover == o.link_hover &&
          text == o.text &&
          track_background == o.track_background &&
          track_played == o.track_played &&
          track_unplayed == o.track_unplayed
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [background_bottom, background_text, background_top, enable_api, enable_controls, force_autoplay, force_loop, hide_title, link, link_hover, text, track_background, track_played, track_unplayed].hash
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
        klass = video-api.const_get(type)
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
