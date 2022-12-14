<?php
/**
 * ConversationsOpenSuccessSchemaChannelInner
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
 * ConversationsOpenSuccessSchemaChannelInner Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class ConversationsOpenSuccessSchemaChannelInner implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'conversations_open_success_schema_channel_inner';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'created' => 'string',
        'id' => 'string',
        'is_im' => 'bool',
        'is_open' => 'bool',
        'last_read' => 'string',
        'latest' => '\OpenAPI\Client\Model\ObjsMessage',
        'unread_count' => 'float',
        'unread_count_display' => 'float',
        'user' => 'string'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'created' => null,
        'id' => null,
        'is_im' => null,
        'is_open' => null,
        'last_read' => null,
        'latest' => null,
        'unread_count' => null,
        'unread_count_display' => null,
        'user' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'created' => false,
		'id' => false,
		'is_im' => false,
		'is_open' => false,
		'last_read' => false,
		'latest' => false,
		'unread_count' => false,
		'unread_count_display' => false,
		'user' => false
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
        'created' => 'created',
        'id' => 'id',
        'is_im' => 'is_im',
        'is_open' => 'is_open',
        'last_read' => 'last_read',
        'latest' => 'latest',
        'unread_count' => 'unread_count',
        'unread_count_display' => 'unread_count_display',
        'user' => 'user'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'created' => 'setCreated',
        'id' => 'setId',
        'is_im' => 'setIsIm',
        'is_open' => 'setIsOpen',
        'last_read' => 'setLastRead',
        'latest' => 'setLatest',
        'unread_count' => 'setUnreadCount',
        'unread_count_display' => 'setUnreadCountDisplay',
        'user' => 'setUser'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'created' => 'getCreated',
        'id' => 'getId',
        'is_im' => 'getIsIm',
        'is_open' => 'getIsOpen',
        'last_read' => 'getLastRead',
        'latest' => 'getLatest',
        'unread_count' => 'getUnreadCount',
        'unread_count_display' => 'getUnreadCountDisplay',
        'user' => 'getUser'
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
        $this->setIfExists('created', $data ?? [], null);
        $this->setIfExists('id', $data ?? [], null);
        $this->setIfExists('is_im', $data ?? [], null);
        $this->setIfExists('is_open', $data ?? [], null);
        $this->setIfExists('last_read', $data ?? [], null);
        $this->setIfExists('latest', $data ?? [], null);
        $this->setIfExists('unread_count', $data ?? [], null);
        $this->setIfExists('unread_count_display', $data ?? [], null);
        $this->setIfExists('user', $data ?? [], null);
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

        if ($this->container['id'] === null) {
            $invalidProperties[] = "'id' can't be null";
        }
        if (!preg_match("/^[D][A-Z0-9]{8,}$/", $this->container['id'])) {
            $invalidProperties[] = "invalid value for 'id', must be conform to the pattern /^[D][A-Z0-9]{8,}$/.";
        }

        if (!is_null($this->container['last_read']) && !preg_match("/^\\d{10}\\.\\d{6}$/", $this->container['last_read'])) {
            $invalidProperties[] = "invalid value for 'last_read', must be conform to the pattern /^\\d{10}\\.\\d{6}$/.";
        }

        if (!is_null($this->container['user']) && !preg_match("/^[UW][A-Z0-9]{2,}$/", $this->container['user'])) {
            $invalidProperties[] = "invalid value for 'user', must be conform to the pattern /^[UW][A-Z0-9]{2,}$/.";
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
     * Gets created
     *
     * @return string|null
     */
    public function getCreated()
    {
        return $this->container['created'];
    }

    /**
     * Sets created
     *
     * @param string|null $created created
     *
     * @return self
     */
    public function setCreated($created)
    {

        if (is_null($created)) {
            throw new \InvalidArgumentException('non-nullable created cannot be null');
        }

        $this->container['created'] = $created;

        return $this;
    }

    /**
     * Gets id
     *
     * @return string
     */
    public function getId()
    {
        return $this->container['id'];
    }

    /**
     * Sets id
     *
     * @param string $id id
     *
     * @return self
     */
    public function setId($id)
    {

        if ((!preg_match("/^[D][A-Z0-9]{8,}$/", $id))) {
            throw new \InvalidArgumentException("invalid value for \$id when calling ConversationsOpenSuccessSchemaChannelInner., must conform to the pattern /^[D][A-Z0-9]{8,}$/.");
        }


        if (is_null($id)) {
            throw new \InvalidArgumentException('non-nullable id cannot be null');
        }

        $this->container['id'] = $id;

        return $this;
    }

    /**
     * Gets is_im
     *
     * @return bool|null
     */
    public function getIsIm()
    {
        return $this->container['is_im'];
    }

    /**
     * Sets is_im
     *
     * @param bool|null $is_im is_im
     *
     * @return self
     */
    public function setIsIm($is_im)
    {

        if (is_null($is_im)) {
            throw new \InvalidArgumentException('non-nullable is_im cannot be null');
        }

        $this->container['is_im'] = $is_im;

        return $this;
    }

    /**
     * Gets is_open
     *
     * @return bool|null
     */
    public function getIsOpen()
    {
        return $this->container['is_open'];
    }

    /**
     * Sets is_open
     *
     * @param bool|null $is_open is_open
     *
     * @return self
     */
    public function setIsOpen($is_open)
    {

        if (is_null($is_open)) {
            throw new \InvalidArgumentException('non-nullable is_open cannot be null');
        }

        $this->container['is_open'] = $is_open;

        return $this;
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
            throw new \InvalidArgumentException("invalid value for \$last_read when calling ConversationsOpenSuccessSchemaChannelInner., must conform to the pattern /^\\d{10}\\.\\d{6}$/.");
        }


        if (is_null($last_read)) {
            throw new \InvalidArgumentException('non-nullable last_read cannot be null');
        }

        $this->container['last_read'] = $last_read;

        return $this;
    }

    /**
     * Gets latest
     *
     * @return \OpenAPI\Client\Model\ObjsMessage|null
     */
    public function getLatest()
    {
        return $this->container['latest'];
    }

    /**
     * Sets latest
     *
     * @param \OpenAPI\Client\Model\ObjsMessage|null $latest latest
     *
     * @return self
     */
    public function setLatest($latest)
    {

        if (is_null($latest)) {
            throw new \InvalidArgumentException('non-nullable latest cannot be null');
        }

        $this->container['latest'] = $latest;

        return $this;
    }

    /**
     * Gets unread_count
     *
     * @return float|null
     */
    public function getUnreadCount()
    {
        return $this->container['unread_count'];
    }

    /**
     * Sets unread_count
     *
     * @param float|null $unread_count unread_count
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
     * Gets unread_count_display
     *
     * @return float|null
     */
    public function getUnreadCountDisplay()
    {
        return $this->container['unread_count_display'];
    }

    /**
     * Sets unread_count_display
     *
     * @param float|null $unread_count_display unread_count_display
     *
     * @return self
     */
    public function setUnreadCountDisplay($unread_count_display)
    {

        if (is_null($unread_count_display)) {
            throw new \InvalidArgumentException('non-nullable unread_count_display cannot be null');
        }

        $this->container['unread_count_display'] = $unread_count_display;

        return $this;
    }

    /**
     * Gets user
     *
     * @return string|null
     */
    public function getUser()
    {
        return $this->container['user'];
    }

    /**
     * Sets user
     *
     * @param string|null $user user
     *
     * @return self
     */
    public function setUser($user)
    {

        if (!is_null($user) && (!preg_match("/^[UW][A-Z0-9]{2,}$/", $user))) {
            throw new \InvalidArgumentException("invalid value for \$user when calling ConversationsOpenSuccessSchemaChannelInner., must conform to the pattern /^[UW][A-Z0-9]{2,}$/.");
        }


        if (is_null($user)) {
            throw new \InvalidArgumentException('non-nullable user cannot be null');
        }

        $this->container['user'] = $user;

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


