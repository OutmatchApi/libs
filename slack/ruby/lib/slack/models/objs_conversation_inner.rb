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
  class ObjsConversationInner
    attr_accessor :accepted_user

    attr_accessor :connected_team_ids

    attr_accessor :conversation_host_id

    attr_accessor :created

    attr_accessor :creator

    attr_accessor :display_counts

    attr_accessor :enterprise_id

    attr_accessor :has_pins

    attr_accessor :id

    attr_accessor :internal_team_ids

    attr_accessor :is_archived

    attr_accessor :is_channel

    attr_accessor :is_ext_shared

    attr_accessor :is_frozen

    attr_accessor :is_general

    attr_accessor :is_global_shared

    attr_accessor :is_group

    attr_accessor :is_im

    attr_accessor :is_member

    attr_accessor :is_moved

    attr_accessor :is_mpim

    attr_accessor :is_non_threadable

    attr_accessor :is_open

    attr_accessor :is_org_default

    attr_accessor :is_org_mandatory

    attr_accessor :is_org_shared

    attr_accessor :is_pending_ext_shared

    attr_accessor :is_private

    attr_accessor :is_read_only

    attr_accessor :is_shared

    attr_accessor :is_starred

    attr_accessor :is_thread_only

    attr_accessor :last_read

    attr_accessor :latest

    attr_accessor :members

    attr_accessor :name

    attr_accessor :name_normalized

    attr_accessor :num_members

    attr_accessor :parent_conversation

    attr_accessor :pending_connected_team_ids

    attr_accessor :pending_shared

    attr_accessor :pin_count

    attr_accessor :previous_names

    attr_accessor :priority

    attr_accessor :purpose

    attr_accessor :shared_team_ids

    attr_accessor :shares

    attr_accessor :timezone_count

    attr_accessor :topic

    attr_accessor :unlinked

    attr_accessor :unread_count

    attr_accessor :unread_count_display

    attr_accessor :use_case

    attr_accessor :user

    attr_accessor :version

    attr_accessor :is_user_deleted

    class EnumAttributeValidator
      attr_reader :datatype
      attr_reader :allowable_values

      def initialize(datatype, allowable_values)
        @allowable_values = allowable_values.map do |value|
          case datatype.to_s
          when /Integer/i
            value.to_i
          when /Float/i
            value.to_f
          else
            value
          end
        end
      end

      def valid?(value)
        !value || allowable_values.include?(value)
      end
    end

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'accepted_user' => :'accepted_user',
        :'connected_team_ids' => :'connected_team_ids',
        :'conversation_host_id' => :'conversation_host_id',
        :'created' => :'created',
        :'creator' => :'creator',
        :'display_counts' => :'display_counts',
        :'enterprise_id' => :'enterprise_id',
        :'has_pins' => :'has_pins',
        :'id' => :'id',
        :'internal_team_ids' => :'internal_team_ids',
        :'is_archived' => :'is_archived',
        :'is_channel' => :'is_channel',
        :'is_ext_shared' => :'is_ext_shared',
        :'is_frozen' => :'is_frozen',
        :'is_general' => :'is_general',
        :'is_global_shared' => :'is_global_shared',
        :'is_group' => :'is_group',
        :'is_im' => :'is_im',
        :'is_member' => :'is_member',
        :'is_moved' => :'is_moved',
        :'is_mpim' => :'is_mpim',
        :'is_non_threadable' => :'is_non_threadable',
        :'is_open' => :'is_open',
        :'is_org_default' => :'is_org_default',
        :'is_org_mandatory' => :'is_org_mandatory',
        :'is_org_shared' => :'is_org_shared',
        :'is_pending_ext_shared' => :'is_pending_ext_shared',
        :'is_private' => :'is_private',
        :'is_read_only' => :'is_read_only',
        :'is_shared' => :'is_shared',
        :'is_starred' => :'is_starred',
        :'is_thread_only' => :'is_thread_only',
        :'last_read' => :'last_read',
        :'latest' => :'latest',
        :'members' => :'members',
        :'name' => :'name',
        :'name_normalized' => :'name_normalized',
        :'num_members' => :'num_members',
        :'parent_conversation' => :'parent_conversation',
        :'pending_connected_team_ids' => :'pending_connected_team_ids',
        :'pending_shared' => :'pending_shared',
        :'pin_count' => :'pin_count',
        :'previous_names' => :'previous_names',
        :'priority' => :'priority',
        :'purpose' => :'purpose',
        :'shared_team_ids' => :'shared_team_ids',
        :'shares' => :'shares',
        :'timezone_count' => :'timezone_count',
        :'topic' => :'topic',
        :'unlinked' => :'unlinked',
        :'unread_count' => :'unread_count',
        :'unread_count_display' => :'unread_count_display',
        :'use_case' => :'use_case',
        :'user' => :'user',
        :'version' => :'version',
        :'is_user_deleted' => :'is_user_deleted'
      }
    end

    # Returns all the JSON keys this model knows about
    def self.acceptable_attributes
      attribute_map.values
    end

    # Attribute type mapping.
    def self.openapi_types
      {
        :'accepted_user' => :'String',
        :'connected_team_ids' => :'Array<String>',
        :'conversation_host_id' => :'String',
        :'created' => :'Integer',
        :'creator' => :'String',
        :'display_counts' => :'ConversationObjectDisplayCounts',
        :'enterprise_id' => :'String',
        :'has_pins' => :'Boolean',
        :'id' => :'String',
        :'internal_team_ids' => :'Array<String>',
        :'is_archived' => :'Boolean',
        :'is_channel' => :'Boolean',
        :'is_ext_shared' => :'Boolean',
        :'is_frozen' => :'Boolean',
        :'is_general' => :'Boolean',
        :'is_global_shared' => :'Boolean',
        :'is_group' => :'Boolean',
        :'is_im' => :'Boolean',
        :'is_member' => :'Boolean',
        :'is_moved' => :'Integer',
        :'is_mpim' => :'Boolean',
        :'is_non_threadable' => :'Boolean',
        :'is_open' => :'Boolean',
        :'is_org_default' => :'Boolean',
        :'is_org_mandatory' => :'Boolean',
        :'is_org_shared' => :'Boolean',
        :'is_pending_ext_shared' => :'Boolean',
        :'is_private' => :'Boolean',
        :'is_read_only' => :'Boolean',
        :'is_shared' => :'Boolean',
        :'is_starred' => :'Boolean',
        :'is_thread_only' => :'Boolean',
        :'last_read' => :'String',
        :'latest' => :'Array<ObjsChannelLatestInner>',
        :'members' => :'Array<String>',
        :'name' => :'String',
        :'name_normalized' => :'String',
        :'num_members' => :'Integer',
        :'parent_conversation' => :'Array<ConversationObjectParentConversationInner>',
        :'pending_connected_team_ids' => :'Array<String>',
        :'pending_shared' => :'Array<String>',
        :'pin_count' => :'Integer',
        :'previous_names' => :'Array<String>',
        :'priority' => :'Float',
        :'purpose' => :'ObjsChannelPurpose',
        :'shared_team_ids' => :'Array<String>',
        :'shares' => :'Array<ConversationIMChannelObjectFromConversationsMethodsSharesInner>',
        :'timezone_count' => :'Integer',
        :'topic' => :'ObjsChannelPurpose',
        :'unlinked' => :'Integer',
        :'unread_count' => :'Integer',
        :'unread_count_display' => :'Integer',
        :'use_case' => :'String',
        :'user' => :'String',
        :'version' => :'Integer',
        :'is_user_deleted' => :'Boolean'
      }
    end

    # List of attributes with nullable: true
    def self.openapi_nullable
      Set.new([
      ])
    end

    # List of class defined in anyOf (OpenAPI v3)
    def self.openapi_any_of
      [
      :'ConversationIMChannelObjectFromConversationsMethods',
      :'ConversationMPIMObject',
      :'ConversationObject'
      ]
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `slack::ObjsConversationInner` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `slack::ObjsConversationInner`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'accepted_user')
        self.accepted_user = attributes[:'accepted_user']
      end

      if attributes.key?(:'connected_team_ids')
        if (value = attributes[:'connected_team_ids']).is_a?(Array)
          self.connected_team_ids = value
        end
      end

      if attributes.key?(:'conversation_host_id')
        self.conversation_host_id = attributes[:'conversation_host_id']
      end

      if attributes.key?(:'created')
        self.created = attributes[:'created']
      end

      if attributes.key?(:'creator')
        self.creator = attributes[:'creator']
      end

      if attributes.key?(:'display_counts')
        self.display_counts = attributes[:'display_counts']
      end

      if attributes.key?(:'enterprise_id')
        self.enterprise_id = attributes[:'enterprise_id']
      end

      if attributes.key?(:'has_pins')
        self.has_pins = attributes[:'has_pins']
      end

      if attributes.key?(:'id')
        self.id = attributes[:'id']
      end

      if attributes.key?(:'internal_team_ids')
        if (value = attributes[:'internal_team_ids']).is_a?(Array)
          self.internal_team_ids = value
        end
      end

      if attributes.key?(:'is_archived')
        self.is_archived = attributes[:'is_archived']
      end

      if attributes.key?(:'is_channel')
        self.is_channel = attributes[:'is_channel']
      end

      if attributes.key?(:'is_ext_shared')
        self.is_ext_shared = attributes[:'is_ext_shared']
      end

      if attributes.key?(:'is_frozen')
        self.is_frozen = attributes[:'is_frozen']
      end

      if attributes.key?(:'is_general')
        self.is_general = attributes[:'is_general']
      end

      if attributes.key?(:'is_global_shared')
        self.is_global_shared = attributes[:'is_global_shared']
      end

      if attributes.key?(:'is_group')
        self.is_group = attributes[:'is_group']
      end

      if attributes.key?(:'is_im')
        self.is_im = attributes[:'is_im']
      end

      if attributes.key?(:'is_member')
        self.is_member = attributes[:'is_member']
      end

      if attributes.key?(:'is_moved')
        self.is_moved = attributes[:'is_moved']
      end

      if attributes.key?(:'is_mpim')
        self.is_mpim = attributes[:'is_mpim']
      end

      if attributes.key?(:'is_non_threadable')
        self.is_non_threadable = attributes[:'is_non_threadable']
      end

      if attributes.key?(:'is_open')
        self.is_open = attributes[:'is_open']
      end

      if attributes.key?(:'is_org_default')
        self.is_org_default = attributes[:'is_org_default']
      end

      if attributes.key?(:'is_org_mandatory')
        self.is_org_mandatory = attributes[:'is_org_mandatory']
      end

      if attributes.key?(:'is_org_shared')
        self.is_org_shared = attributes[:'is_org_shared']
      end

      if attributes.key?(:'is_pending_ext_shared')
        self.is_pending_ext_shared = attributes[:'is_pending_ext_shared']
      end

      if attributes.key?(:'is_private')
        self.is_private = attributes[:'is_private']
      end

      if attributes.key?(:'is_read_only')
        self.is_read_only = attributes[:'is_read_only']
      end

      if attributes.key?(:'is_shared')
        self.is_shared = attributes[:'is_shared']
      end

      if attributes.key?(:'is_starred')
        self.is_starred = attributes[:'is_starred']
      end

      if attributes.key?(:'is_thread_only')
        self.is_thread_only = attributes[:'is_thread_only']
      end

      if attributes.key?(:'last_read')
        self.last_read = attributes[:'last_read']
      end

      if attributes.key?(:'latest')
        if (value = attributes[:'latest']).is_a?(Array)
          self.latest = value
        end
      end

      if attributes.key?(:'members')
        if (value = attributes[:'members']).is_a?(Array)
          self.members = value
        end
      end

      if attributes.key?(:'name')
        self.name = attributes[:'name']
      end

      if attributes.key?(:'name_normalized')
        self.name_normalized = attributes[:'name_normalized']
      end

      if attributes.key?(:'num_members')
        self.num_members = attributes[:'num_members']
      end

      if attributes.key?(:'parent_conversation')
        if (value = attributes[:'parent_conversation']).is_a?(Array)
          self.parent_conversation = value
        end
      end

      if attributes.key?(:'pending_connected_team_ids')
        if (value = attributes[:'pending_connected_team_ids']).is_a?(Array)
          self.pending_connected_team_ids = value
        end
      end

      if attributes.key?(:'pending_shared')
        if (value = attributes[:'pending_shared']).is_a?(Array)
          self.pending_shared = value
        end
      end

      if attributes.key?(:'pin_count')
        self.pin_count = attributes[:'pin_count']
      end

      if attributes.key?(:'previous_names')
        if (value = attributes[:'previous_names']).is_a?(Array)
          self.previous_names = value
        end
      end

      if attributes.key?(:'priority')
        self.priority = attributes[:'priority']
      end

      if attributes.key?(:'purpose')
        self.purpose = attributes[:'purpose']
      end

      if attributes.key?(:'shared_team_ids')
        if (value = attributes[:'shared_team_ids']).is_a?(Array)
          self.shared_team_ids = value
        end
      end

      if attributes.key?(:'shares')
        if (value = attributes[:'shares']).is_a?(Array)
          self.shares = value
        end
      end

      if attributes.key?(:'timezone_count')
        self.timezone_count = attributes[:'timezone_count']
      end

      if attributes.key?(:'topic')
        self.topic = attributes[:'topic']
      end

      if attributes.key?(:'unlinked')
        self.unlinked = attributes[:'unlinked']
      end

      if attributes.key?(:'unread_count')
        self.unread_count = attributes[:'unread_count']
      end

      if attributes.key?(:'unread_count_display')
        self.unread_count_display = attributes[:'unread_count_display']
      end

      if attributes.key?(:'use_case')
        self.use_case = attributes[:'use_case']
      end

      if attributes.key?(:'user')
        self.user = attributes[:'user']
      end

      if attributes.key?(:'version')
        self.version = attributes[:'version']
      end

      if attributes.key?(:'is_user_deleted')
        self.is_user_deleted = attributes[:'is_user_deleted']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      pattern = Regexp.new(/^[UW][A-Z0-9]{2,}$/)
      if !@accepted_user.nil? && @accepted_user !~ pattern
        invalid_properties.push("invalid value for \"accepted_user\", must conform to the pattern #{pattern}.")
      end

      if !@connected_team_ids.nil? && @connected_team_ids.length < 0
        invalid_properties.push('invalid value for "connected_team_ids", number of items must be greater than or equal to 0.')
      end

      pattern = Regexp.new(/^[TE][A-Z0-9]{8,}$/)
      if !@conversation_host_id.nil? && @conversation_host_id !~ pattern
        invalid_properties.push("invalid value for \"conversation_host_id\", must conform to the pattern #{pattern}.")
      end

      if @created.nil?
        invalid_properties.push('invalid value for "created", created cannot be nil.')
      end

      if @creator.nil?
        invalid_properties.push('invalid value for "creator", creator cannot be nil.')
      end

      pattern = Regexp.new(/^[UW][A-Z0-9]{2,}$/)
      if @creator !~ pattern
        invalid_properties.push("invalid value for \"creator\", must conform to the pattern #{pattern}.")
      end

      pattern = Regexp.new(/^[E][A-Z0-9]{8,}$/)
      if !@enterprise_id.nil? && @enterprise_id !~ pattern
        invalid_properties.push("invalid value for \"enterprise_id\", must conform to the pattern #{pattern}.")
      end

      if @id.nil?
        invalid_properties.push('invalid value for "id", id cannot be nil.')
      end

      pattern = Regexp.new(/^[D][A-Z0-9]{8,}$/)
      if @id !~ pattern
        invalid_properties.push("invalid value for \"id\", must conform to the pattern #{pattern}.")
      end

      if !@internal_team_ids.nil? && @internal_team_ids.length < 0
        invalid_properties.push('invalid value for "internal_team_ids", number of items must be greater than or equal to 0.')
      end

      if @is_archived.nil?
        invalid_properties.push('invalid value for "is_archived", is_archived cannot be nil.')
      end

      if @is_channel.nil?
        invalid_properties.push('invalid value for "is_channel", is_channel cannot be nil.')
      end

      if @is_general.nil?
        invalid_properties.push('invalid value for "is_general", is_general cannot be nil.')
      end

      if @is_group.nil?
        invalid_properties.push('invalid value for "is_group", is_group cannot be nil.')
      end

      if @is_im.nil?
        invalid_properties.push('invalid value for "is_im", is_im cannot be nil.')
      end

      if @is_mpim.nil?
        invalid_properties.push('invalid value for "is_mpim", is_mpim cannot be nil.')
      end

      if @is_org_shared.nil?
        invalid_properties.push('invalid value for "is_org_shared", is_org_shared cannot be nil.')
      end

      if @is_private.nil?
        invalid_properties.push('invalid value for "is_private", is_private cannot be nil.')
      end

      if @is_shared.nil?
        invalid_properties.push('invalid value for "is_shared", is_shared cannot be nil.')
      end

      pattern = Regexp.new(/^\d{10}\.\d{6}$/)
      if !@last_read.nil? && @last_read !~ pattern
        invalid_properties.push("invalid value for \"last_read\", must conform to the pattern #{pattern}.")
      end

      if !@members.nil? && @members.length < 0
        invalid_properties.push('invalid value for "members", number of items must be greater than or equal to 0.')
      end

      if @name.nil?
        invalid_properties.push('invalid value for "name", name cannot be nil.')
      end

      if @name_normalized.nil?
        invalid_properties.push('invalid value for "name_normalized", name_normalized cannot be nil.')
      end

      if !@pending_connected_team_ids.nil? && @pending_connected_team_ids.length < 0
        invalid_properties.push('invalid value for "pending_connected_team_ids", number of items must be greater than or equal to 0.')
      end

      if !@pending_shared.nil? && @pending_shared.length < 0
        invalid_properties.push('invalid value for "pending_shared", number of items must be greater than or equal to 0.')
      end

      if !@previous_names.nil? && @previous_names.length < 0
        invalid_properties.push('invalid value for "previous_names", number of items must be greater than or equal to 0.')
      end

      if @priority.nil?
        invalid_properties.push('invalid value for "priority", priority cannot be nil.')
      end

      if @purpose.nil?
        invalid_properties.push('invalid value for "purpose", purpose cannot be nil.')
      end

      if !@shared_team_ids.nil? && @shared_team_ids.length < 0
        invalid_properties.push('invalid value for "shared_team_ids", number of items must be greater than or equal to 0.')
      end

      if !@shares.nil? && @shares.length < 0
        invalid_properties.push('invalid value for "shares", number of items must be greater than or equal to 0.')
      end

      if @topic.nil?
        invalid_properties.push('invalid value for "topic", topic cannot be nil.')
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
      return false if !@accepted_user.nil? && @accepted_user !~ Regexp.new(/^[UW][A-Z0-9]{2,}$/)
      return false if !@connected_team_ids.nil? && @connected_team_ids.length < 0
      return false if !@conversation_host_id.nil? && @conversation_host_id !~ Regexp.new(/^[TE][A-Z0-9]{8,}$/)
      return false if @created.nil?
      return false if @creator.nil?
      return false if @creator !~ Regexp.new(/^[UW][A-Z0-9]{2,}$/)
      return false if !@enterprise_id.nil? && @enterprise_id !~ Regexp.new(/^[E][A-Z0-9]{8,}$/)
      return false if @id.nil?
      return false if @id !~ Regexp.new(/^[D][A-Z0-9]{8,}$/)
      return false if !@internal_team_ids.nil? && @internal_team_ids.length < 0
      return false if @is_archived.nil?
      return false if @is_channel.nil?
      return false if @is_general.nil?
      return false if @is_group.nil?
      return false if @is_im.nil?
      return false if @is_mpim.nil?
      is_mpim_validator = EnumAttributeValidator.new('Boolean', ["true"])
      return false unless is_mpim_validator.valid?(@is_mpim)
      return false if @is_org_shared.nil?
      return false if @is_private.nil?
      return false if @is_shared.nil?
      return false if !@last_read.nil? && @last_read !~ Regexp.new(/^\d{10}\.\d{6}$/)
      return false if !@members.nil? && @members.length < 0
      return false if @name.nil?
      return false if @name_normalized.nil?
      return false if !@pending_connected_team_ids.nil? && @pending_connected_team_ids.length < 0
      return false if !@pending_shared.nil? && @pending_shared.length < 0
      return false if !@previous_names.nil? && @previous_names.length < 0
      return false if @priority.nil?
      return false if @purpose.nil?
      return false if !@shared_team_ids.nil? && @shared_team_ids.length < 0
      return false if !@shares.nil? && @shares.length < 0
      return false if @topic.nil?
      return false if @user.nil?
      return false if @user !~ Regexp.new(/^[UW][A-Z0-9]{2,}$/)
      _any_of_found = false
      self.class.openapi_any_of.each do |_class|
        _any_of = slack.const_get(_class).build_from_hash(self.to_hash)
        if _any_of.valid?
          _any_of_found = true
        end
      end

      if !_any_of_found
        return false
      end

      true
    end

    # Custom attribute writer method with validation
    # @param [Object] accepted_user Value to be assigned
    def accepted_user=(accepted_user)
      pattern = Regexp.new(/^[UW][A-Z0-9]{2,}$/)
      if !accepted_user.nil? && accepted_user !~ pattern
        fail ArgumentError, "invalid value for \"accepted_user\", must conform to the pattern #{pattern}."
      end

      @accepted_user = accepted_user
    end

    # Custom attribute writer method with validation
    # @param [Object] connected_team_ids Value to be assigned
    def connected_team_ids=(connected_team_ids)
      if !connected_team_ids.nil? && connected_team_ids.length < 0
        fail ArgumentError, 'invalid value for "connected_team_ids", number of items must be greater than or equal to 0.'
      end

      @connected_team_ids = connected_team_ids
    end

    # Custom attribute writer method with validation
    # @param [Object] conversation_host_id Value to be assigned
    def conversation_host_id=(conversation_host_id)
      pattern = Regexp.new(/^[TE][A-Z0-9]{8,}$/)
      if !conversation_host_id.nil? && conversation_host_id !~ pattern
        fail ArgumentError, "invalid value for \"conversation_host_id\", must conform to the pattern #{pattern}."
      end

      @conversation_host_id = conversation_host_id
    end

    # Custom attribute writer method with validation
    # @param [Object] creator Value to be assigned
    def creator=(creator)
      if creator.nil?
        fail ArgumentError, 'creator cannot be nil'
      end

      pattern = Regexp.new(/^[UW][A-Z0-9]{2,}$/)
      if creator !~ pattern
        fail ArgumentError, "invalid value for \"creator\", must conform to the pattern #{pattern}."
      end

      @creator = creator
    end

    # Custom attribute writer method with validation
    # @param [Object] enterprise_id Value to be assigned
    def enterprise_id=(enterprise_id)
      pattern = Regexp.new(/^[E][A-Z0-9]{8,}$/)
      if !enterprise_id.nil? && enterprise_id !~ pattern
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

      pattern = Regexp.new(/^[D][A-Z0-9]{8,}$/)
      if id !~ pattern
        fail ArgumentError, "invalid value for \"id\", must conform to the pattern #{pattern}."
      end

      @id = id
    end

    # Custom attribute writer method with validation
    # @param [Object] internal_team_ids Value to be assigned
    def internal_team_ids=(internal_team_ids)
      if !internal_team_ids.nil? && internal_team_ids.length < 0
        fail ArgumentError, 'invalid value for "internal_team_ids", number of items must be greater than or equal to 0.'
      end

      @internal_team_ids = internal_team_ids
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] is_mpim Object to be assigned
    def is_mpim=(is_mpim)
      validator = EnumAttributeValidator.new('Boolean', ["true"])
      unless validator.valid?(is_mpim)
        fail ArgumentError, "invalid value for \"is_mpim\", must be one of #{validator.allowable_values}."
      end
      @is_mpim = is_mpim
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
    # @param [Object] members Value to be assigned
    def members=(members)
      if !members.nil? && members.length < 0
        fail ArgumentError, 'invalid value for "members", number of items must be greater than or equal to 0.'
      end

      @members = members
    end

    # Custom attribute writer method with validation
    # @param [Object] pending_connected_team_ids Value to be assigned
    def pending_connected_team_ids=(pending_connected_team_ids)
      if !pending_connected_team_ids.nil? && pending_connected_team_ids.length < 0
        fail ArgumentError, 'invalid value for "pending_connected_team_ids", number of items must be greater than or equal to 0.'
      end

      @pending_connected_team_ids = pending_connected_team_ids
    end

    # Custom attribute writer method with validation
    # @param [Object] pending_shared Value to be assigned
    def pending_shared=(pending_shared)
      if !pending_shared.nil? && pending_shared.length < 0
        fail ArgumentError, 'invalid value for "pending_shared", number of items must be greater than or equal to 0.'
      end

      @pending_shared = pending_shared
    end

    # Custom attribute writer method with validation
    # @param [Object] previous_names Value to be assigned
    def previous_names=(previous_names)
      if !previous_names.nil? && previous_names.length < 0
        fail ArgumentError, 'invalid value for "previous_names", number of items must be greater than or equal to 0.'
      end

      @previous_names = previous_names
    end

    # Custom attribute writer method with validation
    # @param [Object] shared_team_ids Value to be assigned
    def shared_team_ids=(shared_team_ids)
      if !shared_team_ids.nil? && shared_team_ids.length < 0
        fail ArgumentError, 'invalid value for "shared_team_ids", number of items must be greater than or equal to 0.'
      end

      @shared_team_ids = shared_team_ids
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
          accepted_user == o.accepted_user &&
          connected_team_ids == o.connected_team_ids &&
          conversation_host_id == o.conversation_host_id &&
          created == o.created &&
          creator == o.creator &&
          display_counts == o.display_counts &&
          enterprise_id == o.enterprise_id &&
          has_pins == o.has_pins &&
          id == o.id &&
          internal_team_ids == o.internal_team_ids &&
          is_archived == o.is_archived &&
          is_channel == o.is_channel &&
          is_ext_shared == o.is_ext_shared &&
          is_frozen == o.is_frozen &&
          is_general == o.is_general &&
          is_global_shared == o.is_global_shared &&
          is_group == o.is_group &&
          is_im == o.is_im &&
          is_member == o.is_member &&
          is_moved == o.is_moved &&
          is_mpim == o.is_mpim &&
          is_non_threadable == o.is_non_threadable &&
          is_open == o.is_open &&
          is_org_default == o.is_org_default &&
          is_org_mandatory == o.is_org_mandatory &&
          is_org_shared == o.is_org_shared &&
          is_pending_ext_shared == o.is_pending_ext_shared &&
          is_private == o.is_private &&
          is_read_only == o.is_read_only &&
          is_shared == o.is_shared &&
          is_starred == o.is_starred &&
          is_thread_only == o.is_thread_only &&
          last_read == o.last_read &&
          latest == o.latest &&
          members == o.members &&
          name == o.name &&
          name_normalized == o.name_normalized &&
          num_members == o.num_members &&
          parent_conversation == o.parent_conversation &&
          pending_connected_team_ids == o.pending_connected_team_ids &&
          pending_shared == o.pending_shared &&
          pin_count == o.pin_count &&
          previous_names == o.previous_names &&
          priority == o.priority &&
          purpose == o.purpose &&
          shared_team_ids == o.shared_team_ids &&
          shares == o.shares &&
          timezone_count == o.timezone_count &&
          topic == o.topic &&
          unlinked == o.unlinked &&
          unread_count == o.unread_count &&
          unread_count_display == o.unread_count_display &&
          use_case == o.use_case &&
          user == o.user &&
          version == o.version &&
          is_user_deleted == o.is_user_deleted
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [accepted_user, connected_team_ids, conversation_host_id, created, creator, display_counts, enterprise_id, has_pins, id, internal_team_ids, is_archived, is_channel, is_ext_shared, is_frozen, is_general, is_global_shared, is_group, is_im, is_member, is_moved, is_mpim, is_non_threadable, is_open, is_org_default, is_org_mandatory, is_org_shared, is_pending_ext_shared, is_private, is_read_only, is_shared, is_starred, is_thread_only, last_read, latest, members, name, name_normalized, num_members, parent_conversation, pending_connected_team_ids, pending_shared, pin_count, previous_names, priority, purpose, shared_team_ids, shares, timezone_count, topic, unlinked, unread_count, unread_count_display, use_case, user, version, is_user_deleted].hash
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
