=begin
#Slack Web API

#One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.

The version of the OpenAPI document: 1.7.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.1

=end

require 'spec_helper'
require 'json'

# Unit tests for slack::ConversationsApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'ConversationsApi' do
  before do
    # run before each test
    @api_instance = slack::ConversationsApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of ConversationsApi' do
    it 'should create an instance of ConversationsApi' do
      expect(@api_instance).to be_instance_of(slack::ConversationsApi)
    end
  end

  # unit tests for conversations_archive
  # Archives a conversation.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :token Authentication token. Requires scope: &#x60;conversations:write&#x60;
  # @option opts [String] :channel ID of conversation to archive
  # @return [ConversationsArchiveSuccessSchema]
  describe 'conversations_archive test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for conversations_close
  # Closes a direct message or multi-person direct message.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :token Authentication token. Requires scope: &#x60;conversations:write&#x60;
  # @option opts [String] :channel Conversation to close.
  # @return [ConversationsCloseSuccessSchema]
  describe 'conversations_close test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for conversations_create
  # Initiates a public or private channel-based conversation
  # @param [Hash] opts the optional parameters
  # @option opts [String] :token Authentication token. Requires scope: &#x60;conversations:write&#x60;
  # @option opts [Boolean] :is_private Create a private channel instead of a public one
  # @option opts [String] :name Name of the public or private channel to create
  # @return [ConversationsCreateSuccessSchema]
  describe 'conversations_create test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for conversations_history
  # Fetches a conversation&#39;s history of messages and events.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :token Authentication token. Requires scope: &#x60;conversations:history&#x60;
  # @option opts [String] :channel Conversation ID to fetch history for.
  # @option opts [Float] :latest End of time range of messages to include in results.
  # @option opts [Float] :oldest Start of time range of messages to include in results.
  # @option opts [Boolean] :inclusive Include messages with latest or oldest timestamp in results only when either timestamp is specified.
  # @option opts [Integer] :limit The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the users list hasn&#39;t been reached.
  # @option opts [String] :cursor Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail.
  # @return [ConversationsHistorySuccessSchema]
  describe 'conversations_history test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for conversations_info
  # Retrieve information about a conversation.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :token Authentication token. Requires scope: &#x60;conversations:read&#x60;
  # @option opts [String] :channel Conversation ID to learn more about
  # @option opts [Boolean] :include_locale Set this to &#x60;true&#x60; to receive the locale for this conversation. Defaults to &#x60;false&#x60;
  # @option opts [Boolean] :include_num_members Set to &#x60;true&#x60; to include the member count for the specified conversation. Defaults to &#x60;false&#x60;
  # @return [ConversationsInfoSuccessSchema]
  describe 'conversations_info test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for conversations_invite
  # Invites users to a channel.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :token Authentication token. Requires scope: &#x60;conversations:write&#x60;
  # @option opts [String] :channel The ID of the public or private channel to invite user(s) to.
  # @option opts [String] :users A comma separated list of user IDs. Up to 1000 users may be listed.
  # @return [ConversationsInviteErrorSchema]
  describe 'conversations_invite test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for conversations_join
  # Joins an existing conversation.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :token Authentication token. Requires scope: &#x60;channels:write&#x60;
  # @option opts [String] :channel ID of conversation to join
  # @return [ConversationsJoinSuccessSchema]
  describe 'conversations_join test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for conversations_kick
  # Removes a user from a conversation.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :token Authentication token. Requires scope: &#x60;conversations:write&#x60;
  # @option opts [String] :channel ID of conversation to remove user from.
  # @option opts [String] :user User ID to be removed.
  # @return [ConversationsKickSuccessSchema]
  describe 'conversations_kick test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for conversations_leave
  # Leaves a conversation.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :token Authentication token. Requires scope: &#x60;conversations:write&#x60;
  # @option opts [String] :channel Conversation to leave
  # @return [ConversationsLeaveSuccessSchema]
  describe 'conversations_leave test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for conversations_list
  # Lists all channels in a Slack team.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :token Authentication token. Requires scope: &#x60;conversations:read&#x60;
  # @option opts [Boolean] :exclude_archived Set to &#x60;true&#x60; to exclude archived channels from the list
  # @option opts [String] :types Mix and match channel types by providing a comma-separated list of any combination of &#x60;public_channel&#x60;, &#x60;private_channel&#x60;, &#x60;mpim&#x60;, &#x60;im&#x60;
  # @option opts [Integer] :limit The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn&#39;t been reached. Must be an integer no larger than 1000.
  # @option opts [String] :cursor Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail.
  # @return [ConversationsListSuccessSchema]
  describe 'conversations_list test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for conversations_mark
  # Sets the read cursor in a channel.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :token Authentication token. Requires scope: &#x60;conversations:write&#x60;
  # @option opts [String] :channel Channel or conversation to set the read cursor for.
  # @option opts [Float] :ts Unique identifier of message you want marked as most recently seen in this conversation.
  # @return [ConversationsMarkSuccessSchema]
  describe 'conversations_mark test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for conversations_members
  # Retrieve members of a conversation.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :token Authentication token. Requires scope: &#x60;conversations:read&#x60;
  # @option opts [String] :channel ID of the conversation to retrieve members for
  # @option opts [Integer] :limit The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the users list hasn&#39;t been reached.
  # @option opts [String] :cursor Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail.
  # @return [ConversationsMembersSuccessSchema]
  describe 'conversations_members test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for conversations_open
  # Opens or resumes a direct message or multi-person direct message.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :token Authentication token. Requires scope: &#x60;conversations:write&#x60;
  # @option opts [String] :channel Resume a conversation by supplying an &#x60;im&#x60; or &#x60;mpim&#x60;&#39;s ID. Or provide the &#x60;users&#x60; field instead.
  # @option opts [Boolean] :return_im Boolean, indicates you want the full IM channel definition in the response.
  # @option opts [String] :users Comma separated lists of users. If only one user is included, this creates a 1:1 DM.  The ordering of the users is preserved whenever a multi-person direct message is returned. Supply a &#x60;channel&#x60; when not supplying &#x60;users&#x60;.
  # @return [ConversationsOpenSuccessSchema]
  describe 'conversations_open test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for conversations_rename
  # Renames a conversation.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :token Authentication token. Requires scope: &#x60;conversations:write&#x60;
  # @option opts [String] :channel ID of conversation to rename
  # @option opts [String] :name New name for conversation.
  # @return [ConversationsRenameSuccessSchema]
  describe 'conversations_rename test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for conversations_replies
  # Retrieve a thread of messages posted to a conversation
  # @param [Hash] opts the optional parameters
  # @option opts [String] :token Authentication token. Requires scope: &#x60;conversations:history&#x60;
  # @option opts [String] :channel Conversation ID to fetch thread from.
  # @option opts [Float] :ts Unique identifier of a thread&#39;s parent message. &#x60;ts&#x60; must be the timestamp of an existing message with 0 or more replies. If there are no replies then just the single message referenced by &#x60;ts&#x60; will return - it is just an ordinary, unthreaded message.
  # @option opts [Float] :latest End of time range of messages to include in results.
  # @option opts [Float] :oldest Start of time range of messages to include in results.
  # @option opts [Boolean] :inclusive Include messages with latest or oldest timestamp in results only when either timestamp is specified.
  # @option opts [Integer] :limit The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the users list hasn&#39;t been reached.
  # @option opts [String] :cursor Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail.
  # @return [ConversationsRepliesSuccessSchema]
  describe 'conversations_replies test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for conversations_set_purpose
  # Sets the purpose for a conversation.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :token Authentication token. Requires scope: &#x60;conversations:write&#x60;
  # @option opts [String] :channel Conversation to set the purpose of
  # @option opts [String] :purpose A new, specialer purpose
  # @return [ConversationsSetPurposeSuccessSchema]
  describe 'conversations_set_purpose test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for conversations_set_topic
  # Sets the topic for a conversation.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :token Authentication token. Requires scope: &#x60;conversations:write&#x60;
  # @option opts [String] :channel Conversation to set the topic of
  # @option opts [String] :topic The new topic string. Does not support formatting or linkification.
  # @return [ConversationsSetTopicSuccessSchema]
  describe 'conversations_set_topic test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for conversations_unarchive
  # Reverses conversation archival.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :token Authentication token. Requires scope: &#x60;conversations:write&#x60;
  # @option opts [String] :channel ID of conversation to unarchive
  # @return [ConversationsUnarchiveSuccessSchema]
  describe 'conversations_unarchive test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
