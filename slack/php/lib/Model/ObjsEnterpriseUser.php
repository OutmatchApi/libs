<?php
/**
 * ObjsEnterpriseUser
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
 * ObjsEnterpriseUser Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class ObjsEnterpriseUser implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'objs_enterprise_user';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'enterprise_id' => 'string',
        'enterprise_name' => 'string',
        'id' => 'string',
        'is_admin' => 'bool',
        'is_owner' => 'bool',
        'teams' => 'string[]'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'enterprise_id' => null,
        'enterprise_name' => null,
        'id' => null,
        'is_admin' => null,
        'is_owner' => null,
        'teams' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'enterprise_id' => false,
		'enterprise_name' => false,
		'id' => false,
		'is_admin' => false,
		'is_owner' => false,
		'teams' => false
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
        'enterprise_id' => 'enterprise_id',
        'enterprise_name' => 'enterprise_name',
        'id' => 'id',
        'is_admin' => 'is_admin',
        'is_owner' => 'is_owner',
        'teams' => 'teams'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'enterprise_id' => 'setEnterpriseId',
        'enterprise_name' => 'setEnterpriseName',
        'id' => 'setId',
        'is_admin' => 'setIsAdmin',
        'is_owner' => 'setIsOwner',
        'teams' => 'setTeams'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'enterprise_id' => 'getEnterpriseId',
        'enterprise_name' => 'getEnterpriseName',
        'id' => 'getId',
        'is_admin' => 'getIsAdmin',
        'is_owner' => 'getIsOwner',
        'teams' => 'getTeams'
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
        $this->setIfExists('enterprise_id', $data ?? [], null);
        $this->setIfExists('enterprise_name', $data ?? [], null);
        $this->setIfExists('id', $data ?? [], null);
        $this->setIfExists('is_admin', $data ?? [], null);
        $this->setIfExists('is_owner', $data ?? [], null);
        $this->setIfExists('teams', $data ?? [], null);
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

        if ($this->container['enterprise_id'] === null) {
            $invalidProperties[] = "'enterprise_id' can't be null";
        }
        if (!preg_match("/^[E][A-Z0-9]{8,}$/", $this->container['enterprise_id'])) {
            $invalidProperties[] = "invalid value for 'enterprise_id', must be conform to the pattern /^[E][A-Z0-9]{8,}$/.";
        }

        if ($this->container['enterprise_name'] === null) {
            $invalidProperties[] = "'enterprise_name' can't be null";
        }
        if ($this->container['id'] === null) {
            $invalidProperties[] = "'id' can't be null";
        }
        if (!preg_match("/^[WU][A-Z0-9]{8,}$/", $this->container['id'])) {
            $invalidProperties[] = "invalid value for 'id', must be conform to the pattern /^[WU][A-Z0-9]{8,}$/.";
        }

        if ($this->container['is_admin'] === null) {
            $invalidProperties[] = "'is_admin' can't be null";
        }
        if ($this->container['is_owner'] === null) {
            $invalidProperties[] = "'is_owner' can't be null";
        }
        if ($this->container['teams'] === null) {
            $invalidProperties[] = "'teams' can't be null";
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
     * Gets enterprise_id
     *
     * @return string
     */
    public function getEnterpriseId()
    {
        return $this->container['enterprise_id'];
    }

    /**
     * Sets enterprise_id
     *
     * @param string $enterprise_id enterprise_id
     *
     * @return self
     */
    public function setEnterpriseId($enterprise_id)
    {

        if ((!preg_match("/^[E][A-Z0-9]{8,}$/", $enterprise_id))) {
            throw new \InvalidArgumentException("invalid value for \$enterprise_id when calling ObjsEnterpriseUser., must conform to the pattern /^[E][A-Z0-9]{8,}$/.");
        }


        if (is_null($enterprise_id)) {
            throw new \InvalidArgumentException('non-nullable enterprise_id cannot be null');
        }

        $this->container['enterprise_id'] = $enterprise_id;

        return $this;
    }

    /**
     * Gets enterprise_name
     *
     * @return string
     */
    public function getEnterpriseName()
    {
        return $this->container['enterprise_name'];
    }

    /**
     * Sets enterprise_name
     *
     * @param string $enterprise_name enterprise_name
     *
     * @return self
     */
    public function setEnterpriseName($enterprise_name)
    {

        if (is_null($enterprise_name)) {
            throw new \InvalidArgumentException('non-nullable enterprise_name cannot be null');
        }

        $this->container['enterprise_name'] = $enterprise_name;

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

        if ((!preg_match("/^[WU][A-Z0-9]{8,}$/", $id))) {
            throw new \InvalidArgumentException("invalid value for \$id when calling ObjsEnterpriseUser., must conform to the pattern /^[WU][A-Z0-9]{8,}$/.");
        }


        if (is_null($id)) {
            throw new \InvalidArgumentException('non-nullable id cannot be null');
        }

        $this->container['id'] = $id;

        return $this;
    }

    /**
     * Gets is_admin
     *
     * @return bool
     */
    public function getIsAdmin()
    {
        return $this->container['is_admin'];
    }

    /**
     * Sets is_admin
     *
     * @param bool $is_admin is_admin
     *
     * @return self
     */
    public function setIsAdmin($is_admin)
    {

        if (is_null($is_admin)) {
            throw new \InvalidArgumentException('non-nullable is_admin cannot be null');
        }

        $this->container['is_admin'] = $is_admin;

        return $this;
    }

    /**
     * Gets is_owner
     *
     * @return bool
     */
    public function getIsOwner()
    {
        return $this->container['is_owner'];
    }

    /**
     * Sets is_owner
     *
     * @param bool $is_owner is_owner
     *
     * @return self
     */
    public function setIsOwner($is_owner)
    {

        if (is_null($is_owner)) {
            throw new \InvalidArgumentException('non-nullable is_owner cannot be null');
        }

        $this->container['is_owner'] = $is_owner;

        return $this;
    }

    /**
     * Gets teams
     *
     * @return string[]
     */
    public function getTeams()
    {
        return $this->container['teams'];
    }

    /**
     * Sets teams
     *
     * @param string[] $teams teams
     *
     * @return self
     */
    public function setTeams($teams)
    {



        if (is_null($teams)) {
            throw new \InvalidArgumentException('non-nullable teams cannot be null');
        }

        $this->container['teams'] = $teams;

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


