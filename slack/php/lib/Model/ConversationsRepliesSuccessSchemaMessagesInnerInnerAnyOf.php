<?php
/**
 * ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf
 *
 * PHP version 7.4
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * Slack Web API
 *
 * One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.
 *
 * The version of the OpenAPI document: 1.7.0
 * Generated by: https://openapi-generator.tech
 * OpenAPI Generator version: 6.2.1
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace OpenAPI\Client\Model;

use \ArrayAccess;
use \OpenAPI\Client\ObjectSerializer;

/**
 * ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'conversations_replies_success_schema_messages_inner_inner_anyOf';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'last_read' => 'string',
        'latest_reply' => 'string',
        'reply_count' => 'int',
        'reply_users' => 'string[]',
        'reply_users_count' => 'int',
        'source_team' => 'string',
        'subscribed' => 'bool',
        'team' => 'string',
        'text' => 'string',
        'thread_ts' => 'string',
        'ts' => 'string',
        'type' => 'string',
        'unread_count' => 'int',
        'user' => 'string',
        'user_profile' => '\OpenAPI\Client\Model\ObjsUserProfileShort',
        'user_team' => 'string'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'last_read' => null,
        'latest_reply' => null,
        'reply_count' => null,
        'reply_users' => null,
        'reply_users_count' => null,
        'source_team' => null,
        'subscribed' => null,
        'team' => null,
        'text' => null,
        'thread_ts' => null,
        'ts' => null,
        'type' => null,
        'unread_count' => null,
        'user' => null,
        'user_profile' => null,
        'user_team' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'last_read' => false,
		'latest_reply' => false,
		'reply_count' => false,
		'reply_users' => false,
		'reply_users_count' => false,
		'source_team' => false,
		'subscribed' => false,
		'team' => false,
		'text' => false,
		'thread_ts' => false,
		'ts' => false,
		'type' => false,
		'unread_count' => false,
		'user' => false,
		'user_profile' => false,
		'user_team' => false
    ];

    /**
      * If a nullable field gets set to null, insert it here
      *
      * @var boolean[]
      */
    protected array $openAPINullablesSetToNull = [];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPITypes()
    {
        return self::$openAPITypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPIFormats()
    {
        return self::$openAPIFormats;
    }

    /**
     * Array of nullable properties
     *
     * @return array
     */
    protected static function openAPINullables(): array
    {
        return self::$openAPINullables;
    }

    /**
     * Array of nullable field names deliberately set to null
     *
     * @return boolean[]
     */
    private function getOpenAPINullablesSetToNull(): array
    {
        return $this->openAPINullablesSetToNull;
    }

    /**
     * Setter - Array of nullable field names deliberately set to null
     *
     * @param boolean[] $openAPINullablesSetToNull
     */
    private function setOpenAPINullablesSetToNull(array $openAPINullablesSetToNull): void
    {
        $this->openAPINullablesSetToNull = $openAPINullablesSetToNull;
    }

    /**
     * Checks if a property is nullable
     *
     * @param string $property
     * @return bool
     */
    public static function isNullable(string $property): bool
    {
        return self::openAPINullables()[$property] ?? false;
    }

    /**
     * Checks if a nullable property is set to null.
     *
     * @param string $property
     * @return bool
     */
    public function isNullableSetToNull(string $property): bool
    {
        return in_array($property, $this->getOpenAPINullablesSetToNull(), true);
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'last_read' => 'last_read',
        'latest_reply' => 'latest_reply',
        'reply_count' => 'reply_count',
        'reply_users' => 'reply_users',
        'reply_users_count' => 'reply_users_count',
        'source_team' => 'source_team',
        'subscribed' => 'subscribed',
        'team' => 'team',
        'text' => 'text',
        'thread_ts' => 'thread_ts',
        'ts' => 'ts',
        'type' => 'type',
        'unread_count' => 'unread_count',
        'user' => 'user',
        'user_profile' => 'user_profile',
        'user_team' => 'user_team'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'last_read' => 'setLastRead',
        'latest_reply' => 'setLatestReply',
        'reply_count' => 'setReplyCount',
        'reply_users' => 'setReplyUsers',
        'reply_users_count' => 'setReplyUsersCount',
        'source_team' => 'setSourceTeam',
        'subscribed' => 'setSubscribed',
        'team' => 'setTeam',
        'text' => 'setText',
        'thread_ts' => 'setThreadTs',
        'ts' => 'setTs',
        'type' => 'setType',
        'unread_count' => 'setUnreadCount',
        'user' => 'setUser',
        'user_profile' => 'setUserProfile',
        'user_team' => 'setUserTeam'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'last_read' => 'getLastRead',
        'latest_reply' => 'getLatestReply',
        'reply_count' => 'getReplyCount',
        'reply_users' => 'getReplyUsers',
        'reply_users_count' => 'getReplyUsersCount',
        'source_team' => 'getSourceTeam',
        'subscribed' => 'getSubscribed',
        'team' => 'getTeam',
        'text' => 'getText',
        'thread_ts' => 'getThreadTs',
        'ts' => 'getTs',
        'type' => 'getType',
        'unread_count' => 'getUnreadCount',
        'user' => 'getUser',
        'user_profile' => 'getUserProfile',
        'user_team' => 'getUserTeam'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$openAPIModelName;
    }


    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->setIfExists('last_read', $data ?? [], null);
        $this->setIfExists('latest_reply', $data ?? [], null);
        $this->setIfExists('reply_count', $data ?? [], null);
        $this->setIfExists('reply_users', $data ?? [], null);
        $this->setIfExists('reply_users_count', $data ?? [], null);
        $this->setIfExists('source_team', $data ?? [], null);
        $this->setIfExists('subscribed', $data ?? [], null);
        $this->setIfExists('team', $data ?? [], null);
        $this->setIfExists('text', $data ?? [], null);
        $this->setIfExists('thread_ts', $data ?? [], null);
        $this->setIfExists('ts', $data ?? [], null);
        $this->setIfExists('type', $data ?? [], null);
        $this->setIfExists('unread_count', $data ?? [], null);
        $this->setIfExists('user', $data ?? [], null);
        $this->setIfExists('user_profile', $data ?? [], null);
        $this->setIfExists('user_team', $data ?? [], null);
    }

    /**
    * Sets $this->container[$variableName] to the given data or to the given default Value; if $variableName
    * is nullable and its value is set to null in the $fields array, then mark it as "set to null" in the
    * $this->openAPINullablesSetToNull array
    *
    * @param string $variableName
    * @param array  $fields
    * @param mixed  $defaultValue
    */
    private function setIfExists(string $variableName, array $fields, $defaultValue): void
    {
        if (self::isNullable($variableName) && array_key_exists($variableName, $fields) && is_null($fields[$variableName])) {
            $this->openAPINullablesSetToNull[] = $variableName;
        }

        $this->container[$variableName] = $fields[$variableName] ?? $defaultValue;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if (!is_null($this->container['last_read']) && !preg_match("/^\\d{10}\\.\\d{6}$/", $this->container['last_read'])) {
            $invalidProperties[] = "invalid value for 'last_read', must be conform to the pattern /^\\d{10}\\.\\d{6}$/.";
        }

        if (!is_null($this->container['latest_reply']) && !preg_match("/^\\d{10}\\.\\d{6}$/", $this->container['latest_reply'])) {
            $invalidProperties[] = "invalid value for 'latest_reply', must be conform to the pattern /^\\d{10}\\.\\d{6}$/.";
        }

        if ($this->container['reply_count'] === null) {
            $invalidProperties[] = "'reply_count' can't be null";
        }
        if (!is_null($this->container['source_team']) && !preg_match("/^[T][A-Z0-9]{2,}$/", $this->container['source_team'])) {
            $invalidProperties[] = "invalid value for 'source_team', must be conform to the pattern /^[T][A-Z0-9]{2,}$/.";
        }

        if ($this->container['subscribed'] === null) {
            $invalidProperties[] = "'subscribed' can't be null";
        }
        if (!is_null($this->container['team']) && !preg_match("/^[T][A-Z0-9]{2,}$/", $this->container['team'])) {
            $invalidProperties[] = "invalid value for 'team', must be conform to the pattern /^[T][A-Z0-9]{2,}$/.";
        }

        if ($this->container['text'] === null) {
            $invalidProperties[] = "'text' can't be null";
        }
        if ($this->container['thread_ts'] === null) {
            $invalidProperties[] = "'thread_ts' can't be null";
        }
        if (!preg_match("/^\\d{10}\\.\\d{6}$/", $this->container['thread_ts'])) {
            $invalidProperties[] = "invalid value for 'thread_ts', must be conform to the pattern /^\\d{10}\\.\\d{6}$/.";
        }

        if ($this->container['ts'] === null) {
            $invalidProperties[] = "'ts' can't be null";
        }
        if (!preg_match("/^\\d{10}\\.\\d{6}$/", $this->container['ts'])) {
            $invalidProperties[] = "invalid value for 'ts', must be conform to the pattern /^\\d{10}\\.\\d{6}$/.";
        }

        if ($this->container['type'] === null) {
            $invalidProperties[] = "'type' can't be null";
        }
        if ($this->container['user'] === null) {
            $invalidProperties[] = "'user' can't be null";
        }
        if (!preg_match("/^[UW][A-Z0-9]{2,}$/", $this->container['user'])) {
            $invalidProperties[] = "invalid value for 'user', must be conform to the pattern /^[UW][A-Z0-9]{2,}$/.";
        }

        if (!is_null($this->container['user_team']) && !preg_match("/^[T][A-Z0-9]{2,}$/", $this->container['user_team'])) {
            $invalidProperties[] = "invalid value for 'user_team', must be conform to the pattern /^[T][A-Z0-9]{2,}$/.";
        }

        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets last_read
     *
     * @return string|null
     */
    public function getLastRead()
    {
        return $this->container['last_read'];
    }

    /**
     * Sets last_read
     *
     * @param string|null $last_read last_read
     *
     * @return self
     */
    public function setLastRead($last_read)
    {

        if (!is_null($last_read) && (!preg_match("/^\\d{10}\\.\\d{6}$/", $last_read))) {
            throw new \InvalidArgumentException("invalid value for \$last_read when calling ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf., must conform to the pattern /^\\d{10}\\.\\d{6}$/.");
        }


        if (is_null($last_read)) {
            throw new \InvalidArgumentException('non-nullable last_read cannot be null');
        }

        $this->container['last_read'] = $last_read;

        return $this;
    }

    /**
     * Gets latest_reply
     *
     * @return string|null
     */
    public function getLatestReply()
    {
        return $this->container['latest_reply'];
    }

    /**
     * Sets latest_reply
     *
     * @param string|null $latest_reply latest_reply
     *
     * @return self
     */
    public function setLatestReply($latest_reply)
    {

        if (!is_null($latest_reply) && (!preg_match("/^\\d{10}\\.\\d{6}$/", $latest_reply))) {
            throw new \InvalidArgumentException("invalid value for \$latest_reply when calling ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf., must conform to the pattern /^\\d{10}\\.\\d{6}$/.");
        }


        if (is_null($latest_reply)) {
            throw new \InvalidArgumentException('non-nullable latest_reply cannot be null');
        }

        $this->container['latest_reply'] = $latest_reply;

        return $this;
    }

    /**
     * Gets reply_count
     *
     * @return int
     */
    public function getReplyCount()
    {
        return $this->container['reply_count'];
    }

    /**
     * Sets reply_count
     *
     * @param int $reply_count reply_count
     *
     * @return self
     */
    public function setReplyCount($reply_count)
    {

        if (is_null($reply_count)) {
            throw new \InvalidArgumentException('non-nullable reply_count cannot be null');
        }

        $this->container['reply_count'] = $reply_count;

        return $this;
    }

    /**
     * Gets reply_users
     *
     * @return string[]|null
     */
    public function getReplyUsers()
    {
        return $this->container['reply_users'];
    }

    /**
     * Sets reply_users
     *
     * @param string[]|null $reply_users reply_users
     *
     * @return self
     */
    public function setReplyUsers($reply_users)
    {



        if (is_null($reply_users)) {
            throw new \InvalidArgumentException('non-nullable reply_users cannot be null');
        }

        $this->container['reply_users'] = $reply_users;

        return $this;
    }

    /**
     * Gets reply_users_count
     *
     * @return int|null
     */
    public function getReplyUsersCount()
    {
        return $this->container['reply_users_count'];
    }

    /**
     * Sets reply_users_count
     *
     * @param int|null $reply_users_count reply_users_count
     *
     * @return self
     */
    public function setReplyUsersCount($reply_users_count)
    {

        if (is_null($reply_users_count)) {
            throw new \InvalidArgumentException('non-nullable reply_users_count cannot be null');
        }

        $this->container['reply_users_count'] = $reply_users_count;

        return $this;
    }

    /**
     * Gets source_team
     *
     * @return string|null
     */
    public function getSourceTeam()
    {
        return $this->container['source_team'];
    }

    /**
     * Sets source_team
     *
     * @param string|null $source_team source_team
     *
     * @return self
     */
    public function setSourceTeam($source_team)
    {

        if (!is_null($source_team) && (!preg_match("/^[T][A-Z0-9]{2,}$/", $source_team))) {
            throw new \InvalidArgumentException("invalid value for \$source_team when calling ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf., must conform to the pattern /^[T][A-Z0-9]{2,}$/.");
        }


        if (is_null($source_team)) {
            throw new \InvalidArgumentException('non-nullable source_team cannot be null');
        }

        $this->container['source_team'] = $source_team;

        return $this;
    }

    /**
     * Gets subscribed
     *
     * @return bool
     */
    public function getSubscribed()
    {
        return $this->container['subscribed'];
    }

    /**
     * Sets subscribed
     *
     * @param bool $subscribed subscribed
     *
     * @return self
     */
    public function setSubscribed($subscribed)
    {

        if (is_null($subscribed)) {
            throw new \InvalidArgumentException('non-nullable subscribed cannot be null');
        }

        $this->container['subscribed'] = $subscribed;

        return $this;
    }

    /**
     * Gets team
     *
     * @return string|null
     */
    public function getTeam()
    {
        return $this->container['team'];
    }

    /**
     * Sets team
     *
     * @param string|null $team team
     *
     * @return self
     */
    public function setTeam($team)
    {

        if (!is_null($team) && (!preg_match("/^[T][A-Z0-9]{2,}$/", $team))) {
            throw new \InvalidArgumentException("invalid value for \$team when calling ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf., must conform to the pattern /^[T][A-Z0-9]{2,}$/.");
        }


        if (is_null($team)) {
            throw new \InvalidArgumentException('non-nullable team cannot be null');
        }

        $this->container['team'] = $team;

        return $this;
    }

    /**
     * Gets text
     *
     * @return string
     */
    public function getText()
    {
        return $this->container['text'];
    }

    /**
     * Sets text
     *
     * @param string $text text
     *
     * @return self
     */
    public function setText($text)
    {

        if (is_null($text)) {
            throw new \InvalidArgumentException('non-nullable text cannot be null');
        }

        $this->container['text'] = $text;

        return $this;
    }

    /**
     * Gets thread_ts
     *
     * @return string
     */
    public function getThreadTs()
    {
        return $this->container['thread_ts'];
    }

    /**
     * Sets thread_ts
     *
     * @param string $thread_ts thread_ts
     *
     * @return self
     */
    public function setThreadTs($thread_ts)
    {

        if ((!preg_match("/^\\d{10}\\.\\d{6}$/", $thread_ts))) {
            throw new \InvalidArgumentException("invalid value for \$thread_ts when calling ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf., must conform to the pattern /^\\d{10}\\.\\d{6}$/.");
        }


        if (is_null($thread_ts)) {
            throw new \InvalidArgumentException('non-nullable thread_ts cannot be null');
        }

        $this->container['thread_ts'] = $thread_ts;

        return $this;
    }

    /**
     * Gets ts
     *
     * @return string
     */
    public function getTs()
    {
        return $this->container['ts'];
    }

    /**
     * Sets ts
     *
     * @param string $ts ts
     *
     * @return self
     */
    public function setTs($ts)
    {

        if ((!preg_match("/^\\d{10}\\.\\d{6}$/", $ts))) {
            throw new \InvalidArgumentException("invalid value for \$ts when calling ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf., must conform to the pattern /^\\d{10}\\.\\d{6}$/.");
        }


        if (is_null($ts)) {
            throw new \InvalidArgumentException('non-nullable ts cannot be null');
        }

        $this->container['ts'] = $ts;

        return $this;
    }

    /**
     * Gets type
     *
     * @return string
     */
    public function getType()
    {
        return $this->container['type'];
    }

    /**
     * Sets type
     *
     * @param string $type type
     *
     * @return self
     */
    public function setType($type)
    {

        if (is_null($type)) {
            throw new \InvalidArgumentException('non-nullable type cannot be null');
        }

        $this->container['type'] = $type;

        return $this;
    }

    /**
     * Gets unread_count
     *
     * @return int|null
     */
    public function getUnreadCount()
    {
        return $this->container['unread_count'];
    }

    /**
     * Sets unread_count
     *
     * @param int|null $unread_count unread_count
     *
     * @return self
     */
    public function setUnreadCount($unread_count)
    {

        if (is_null($unread_count)) {
            throw new \InvalidArgumentException('non-nullable unread_count cannot be null');
        }

        $this->container['unread_count'] = $unread_count;

        return $this;
    }

    /**
     * Gets user
     *
     * @return string
     */
    public function getUser()
    {
        return $this->container['user'];
    }

    /**
     * Sets user
     *
     * @param string $user user
     *
     * @return self
     */
    public function setUser($user)
    {

        if ((!preg_match("/^[UW][A-Z0-9]{2,}$/", $user))) {
            throw new \InvalidArgumentException("invalid value for \$user when calling ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf., must conform to the pattern /^[UW][A-Z0-9]{2,}$/.");
        }


        if (is_null($user)) {
            throw new \InvalidArgumentException('non-nullable user cannot be null');
        }

        $this->container['user'] = $user;

        return $this;
    }

    /**
     * Gets user_profile
     *
     * @return \OpenAPI\Client\Model\ObjsUserProfileShort|null
     */
    public function getUserProfile()
    {
        return $this->container['user_profile'];
    }

    /**
     * Sets user_profile
     *
     * @param \OpenAPI\Client\Model\ObjsUserProfileShort|null $user_profile user_profile
     *
     * @return self
     */
    public function setUserProfile($user_profile)
    {

        if (is_null($user_profile)) {
            throw new \InvalidArgumentException('non-nullable user_profile cannot be null');
        }

        $this->container['user_profile'] = $user_profile;

        return $this;
    }

    /**
     * Gets user_team
     *
     * @return string|null
     */
    public function getUserTeam()
    {
        return $this->container['user_team'];
    }

    /**
     * Sets user_team
     *
     * @param string|null $user_team user_team
     *
     * @return self
     */
    public function setUserTeam($user_team)
    {

        if (!is_null($user_team) && (!preg_match("/^[T][A-Z0-9]{2,}$/", $user_team))) {
            throw new \InvalidArgumentException("invalid value for \$user_team when calling ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf., must conform to the pattern /^[T][A-Z0-9]{2,}$/.");
        }


        if (is_null($user_team)) {
            throw new \InvalidArgumentException('non-nullable user_team cannot be null');
        }

        $this->container['user_team'] = $user_team;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset): bool
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed|null
     */
    #[\ReturnTypeWillChange]
    public function offsetGet($offset)
    {
        return $this->container[$offset] ?? null;
    }

    /**
     * Sets value based on offset.
     *
     * @param int|null $offset Offset
     * @param mixed    $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value): void
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset): void
    {
        unset($this->container[$offset]);
    }

    /**
     * Serializes the object to a value that can be serialized natively by json_encode().
     * @link https://www.php.net/manual/en/jsonserializable.jsonserialize.php
     *
     * @return mixed Returns data which can be serialized by json_encode(), which is a value
     * of any type other than a resource.
     */
    #[\ReturnTypeWillChange]
    public function jsonSerialize()
    {
       return ObjectSerializer::sanitizeForSerialization($this);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        return json_encode(
            ObjectSerializer::sanitizeForSerialization($this),
            JSON_PRETTY_PRINT
        );
    }

    /**
     * Gets a header-safe presentation of the object
     *
     * @return string
     */
    public function toHeaderValue()
    {
        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}


