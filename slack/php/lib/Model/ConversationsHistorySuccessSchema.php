<?php
/**
 * ConversationsHistorySuccessSchema
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
 * ConversationsHistorySuccessSchema Class Doc Comment
 *
 * @category Class
 * @description Schema for successful response from conversations.history method
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class ConversationsHistorySuccessSchema implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'conversations_history_success_schema';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'channel_actions_count' => 'int',
        'channel_actions_ts' => '\OpenAPI\Client\Model\ConversationsHistorySuccessSchemaChannelActionsTsInner[]',
        'has_more' => 'bool',
        'messages' => '\OpenAPI\Client\Model\ObjsMessage[]',
        'ok' => '\OpenAPI\Client\Model\DefsOkTrue',
        'pin_count' => 'int'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'channel_actions_count' => null,
        'channel_actions_ts' => null,
        'has_more' => null,
        'messages' => null,
        'ok' => null,
        'pin_count' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'channel_actions_count' => false,
		'channel_actions_ts' => false,
		'has_more' => false,
		'messages' => false,
		'ok' => false,
		'pin_count' => false
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
        'channel_actions_count' => 'channel_actions_count',
        'channel_actions_ts' => 'channel_actions_ts',
        'has_more' => 'has_more',
        'messages' => 'messages',
        'ok' => 'ok',
        'pin_count' => 'pin_count'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'channel_actions_count' => 'setChannelActionsCount',
        'channel_actions_ts' => 'setChannelActionsTs',
        'has_more' => 'setHasMore',
        'messages' => 'setMessages',
        'ok' => 'setOk',
        'pin_count' => 'setPinCount'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'channel_actions_count' => 'getChannelActionsCount',
        'channel_actions_ts' => 'getChannelActionsTs',
        'has_more' => 'getHasMore',
        'messages' => 'getMessages',
        'ok' => 'getOk',
        'pin_count' => 'getPinCount'
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
        $this->setIfExists('channel_actions_count', $data ?? [], null);
        $this->setIfExists('channel_actions_ts', $data ?? [], null);
        $this->setIfExists('has_more', $data ?? [], null);
        $this->setIfExists('messages', $data ?? [], null);
        $this->setIfExists('ok', $data ?? [], null);
        $this->setIfExists('pin_count', $data ?? [], null);
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

        if ($this->container['channel_actions_count'] === null) {
            $invalidProperties[] = "'channel_actions_count' can't be null";
        }
        if ($this->container['channel_actions_ts'] === null) {
            $invalidProperties[] = "'channel_actions_ts' can't be null";
        }
        if ($this->container['has_more'] === null) {
            $invalidProperties[] = "'has_more' can't be null";
        }
        if ($this->container['messages'] === null) {
            $invalidProperties[] = "'messages' can't be null";
        }
        if ((count($this->container['messages']) < 1)) {
            $invalidProperties[] = "invalid value for 'messages', number of items must be greater than or equal to 1.";
        }

        if ($this->container['ok'] === null) {
            $invalidProperties[] = "'ok' can't be null";
        }
        if ($this->container['pin_count'] === null) {
            $invalidProperties[] = "'pin_count' can't be null";
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
     * Gets channel_actions_count
     *
     * @return int
     */
    public function getChannelActionsCount()
    {
        return $this->container['channel_actions_count'];
    }

    /**
     * Sets channel_actions_count
     *
     * @param int $channel_actions_count channel_actions_count
     *
     * @return self
     */
    public function setChannelActionsCount($channel_actions_count)
    {

        if (is_null($channel_actions_count)) {
            throw new \InvalidArgumentException('non-nullable channel_actions_count cannot be null');
        }

        $this->container['channel_actions_count'] = $channel_actions_count;

        return $this;
    }

    /**
     * Gets channel_actions_ts
     *
     * @return \OpenAPI\Client\Model\ConversationsHistorySuccessSchemaChannelActionsTsInner[]
     */
    public function getChannelActionsTs()
    {
        return $this->container['channel_actions_ts'];
    }

    /**
     * Sets channel_actions_ts
     *
     * @param \OpenAPI\Client\Model\ConversationsHistorySuccessSchemaChannelActionsTsInner[] $channel_actions_ts channel_actions_ts
     *
     * @return self
     */
    public function setChannelActionsTs($channel_actions_ts)
    {

        if (is_null($channel_actions_ts)) {
            throw new \InvalidArgumentException('non-nullable channel_actions_ts cannot be null');
        }

        $this->container['channel_actions_ts'] = $channel_actions_ts;

        return $this;
    }

    /**
     * Gets has_more
     *
     * @return bool
     */
    public function getHasMore()
    {
        return $this->container['has_more'];
    }

    /**
     * Sets has_more
     *
     * @param bool $has_more has_more
     *
     * @return self
     */
    public function setHasMore($has_more)
    {

        if (is_null($has_more)) {
            throw new \InvalidArgumentException('non-nullable has_more cannot be null');
        }

        $this->container['has_more'] = $has_more;

        return $this;
    }

    /**
     * Gets messages
     *
     * @return \OpenAPI\Client\Model\ObjsMessage[]
     */
    public function getMessages()
    {
        return $this->container['messages'];
    }

    /**
     * Sets messages
     *
     * @param \OpenAPI\Client\Model\ObjsMessage[] $messages messages
     *
     * @return self
     */
    public function setMessages($messages)
    {


        if ((count($messages) < 1)) {
            throw new \InvalidArgumentException('invalid length for $messages when calling ConversationsHistorySuccessSchema., number of items must be greater than or equal to 1.');
        }

        if (is_null($messages)) {
            throw new \InvalidArgumentException('non-nullable messages cannot be null');
        }

        $this->container['messages'] = $messages;

        return $this;
    }

    /**
     * Gets ok
     *
     * @return \OpenAPI\Client\Model\DefsOkTrue
     */
    public function getOk()
    {
        return $this->container['ok'];
    }

    /**
     * Sets ok
     *
     * @param \OpenAPI\Client\Model\DefsOkTrue $ok ok
     *
     * @return self
     */
    public function setOk($ok)
    {

        if (is_null($ok)) {
            throw new \InvalidArgumentException('non-nullable ok cannot be null');
        }

        $this->container['ok'] = $ok;

        return $this;
    }

    /**
     * Gets pin_count
     *
     * @return int
     */
    public function getPinCount()
    {
        return $this->container['pin_count'];
    }

    /**
     * Sets pin_count
     *
     * @param int $pin_count pin_count
     *
     * @return self
     */
    public function setPinCount($pin_count)
    {

        if (is_null($pin_count)) {
            throw new \InvalidArgumentException('non-nullable pin_count cannot be null');
        }

        $this->container['pin_count'] = $pin_count;

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


