<?php
/**
 * UsersIdentitySchemaInnerAnyOf3Team
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
 * UsersIdentitySchemaInnerAnyOf3Team Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class UsersIdentitySchemaInnerAnyOf3Team implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'users_identity_schema_inner_anyOf_3_team';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'domain' => 'string',
        'id' => 'string',
        'image_102' => 'string',
        'image_132' => 'string',
        'image_230' => 'string',
        'image_34' => 'string',
        'image_44' => 'string',
        'image_68' => 'string',
        'image_88' => 'string',
        'image_default' => 'bool',
        'name' => 'string'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'domain' => null,
        'id' => null,
        'image_102' => 'url',
        'image_132' => 'url',
        'image_230' => 'url',
        'image_34' => 'url',
        'image_44' => 'url',
        'image_68' => 'url',
        'image_88' => 'url',
        'image_default' => null,
        'name' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'domain' => false,
		'id' => false,
		'image_102' => false,
		'image_132' => false,
		'image_230' => false,
		'image_34' => false,
		'image_44' => false,
		'image_68' => false,
		'image_88' => false,
		'image_default' => false,
		'name' => false
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
        'domain' => 'domain',
        'id' => 'id',
        'image_102' => 'image_102',
        'image_132' => 'image_132',
        'image_230' => 'image_230',
        'image_34' => 'image_34',
        'image_44' => 'image_44',
        'image_68' => 'image_68',
        'image_88' => 'image_88',
        'image_default' => 'image_default',
        'name' => 'name'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'domain' => 'setDomain',
        'id' => 'setId',
        'image_102' => 'setImage102',
        'image_132' => 'setImage132',
        'image_230' => 'setImage230',
        'image_34' => 'setImage34',
        'image_44' => 'setImage44',
        'image_68' => 'setImage68',
        'image_88' => 'setImage88',
        'image_default' => 'setImageDefault',
        'name' => 'setName'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'domain' => 'getDomain',
        'id' => 'getId',
        'image_102' => 'getImage102',
        'image_132' => 'getImage132',
        'image_230' => 'getImage230',
        'image_34' => 'getImage34',
        'image_44' => 'getImage44',
        'image_68' => 'getImage68',
        'image_88' => 'getImage88',
        'image_default' => 'getImageDefault',
        'name' => 'getName'
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
        $this->setIfExists('domain', $data ?? [], null);
        $this->setIfExists('id', $data ?? [], null);
        $this->setIfExists('image_102', $data ?? [], null);
        $this->setIfExists('image_132', $data ?? [], null);
        $this->setIfExists('image_230', $data ?? [], null);
        $this->setIfExists('image_34', $data ?? [], null);
        $this->setIfExists('image_44', $data ?? [], null);
        $this->setIfExists('image_68', $data ?? [], null);
        $this->setIfExists('image_88', $data ?? [], null);
        $this->setIfExists('image_default', $data ?? [], null);
        $this->setIfExists('name', $data ?? [], null);
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

        if ($this->container['domain'] === null) {
            $invalidProperties[] = "'domain' can't be null";
        }
        if ($this->container['id'] === null) {
            $invalidProperties[] = "'id' can't be null";
        }
        if (!preg_match("/^[T][A-Z0-9]{2,}$/", $this->container['id'])) {
            $invalidProperties[] = "invalid value for 'id', must be conform to the pattern /^[T][A-Z0-9]{2,}$/.";
        }

        if ($this->container['image_102'] === null) {
            $invalidProperties[] = "'image_102' can't be null";
        }
        if ($this->container['image_132'] === null) {
            $invalidProperties[] = "'image_132' can't be null";
        }
        if ($this->container['image_230'] === null) {
            $invalidProperties[] = "'image_230' can't be null";
        }
        if ($this->container['image_34'] === null) {
            $invalidProperties[] = "'image_34' can't be null";
        }
        if ($this->container['image_44'] === null) {
            $invalidProperties[] = "'image_44' can't be null";
        }
        if ($this->container['image_68'] === null) {
            $invalidProperties[] = "'image_68' can't be null";
        }
        if ($this->container['image_88'] === null) {
            $invalidProperties[] = "'image_88' can't be null";
        }
        if ($this->container['image_default'] === null) {
            $invalidProperties[] = "'image_default' can't be null";
        }
        if ($this->container['name'] === null) {
            $invalidProperties[] = "'name' can't be null";
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
     * Gets domain
     *
     * @return string
     */
    public function getDomain()
    {
        return $this->container['domain'];
    }

    /**
     * Sets domain
     *
     * @param string $domain domain
     *
     * @return self
     */
    public function setDomain($domain)
    {

        if (is_null($domain)) {
            throw new \InvalidArgumentException('non-nullable domain cannot be null');
        }

        $this->container['domain'] = $domain;

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

        if ((!preg_match("/^[T][A-Z0-9]{2,}$/", $id))) {
            throw new \InvalidArgumentException("invalid value for \$id when calling UsersIdentitySchemaInnerAnyOf3Team., must conform to the pattern /^[T][A-Z0-9]{2,}$/.");
        }


        if (is_null($id)) {
            throw new \InvalidArgumentException('non-nullable id cannot be null');
        }

        $this->container['id'] = $id;

        return $this;
    }

    /**
     * Gets image_102
     *
     * @return string
     */
    public function getImage102()
    {
        return $this->container['image_102'];
    }

    /**
     * Sets image_102
     *
     * @param string $image_102 image_102
     *
     * @return self
     */
    public function setImage102($image_102)
    {

        if (is_null($image_102)) {
            throw new \InvalidArgumentException('non-nullable image_102 cannot be null');
        }

        $this->container['image_102'] = $image_102;

        return $this;
    }

    /**
     * Gets image_132
     *
     * @return string
     */
    public function getImage132()
    {
        return $this->container['image_132'];
    }

    /**
     * Sets image_132
     *
     * @param string $image_132 image_132
     *
     * @return self
     */
    public function setImage132($image_132)
    {

        if (is_null($image_132)) {
            throw new \InvalidArgumentException('non-nullable image_132 cannot be null');
        }

        $this->container['image_132'] = $image_132;

        return $this;
    }

    /**
     * Gets image_230
     *
     * @return string
     */
    public function getImage230()
    {
        return $this->container['image_230'];
    }

    /**
     * Sets image_230
     *
     * @param string $image_230 image_230
     *
     * @return self
     */
    public function setImage230($image_230)
    {

        if (is_null($image_230)) {
            throw new \InvalidArgumentException('non-nullable image_230 cannot be null');
        }

        $this->container['image_230'] = $image_230;

        return $this;
    }

    /**
     * Gets image_34
     *
     * @return string
     */
    public function getImage34()
    {
        return $this->container['image_34'];
    }

    /**
     * Sets image_34
     *
     * @param string $image_34 image_34
     *
     * @return self
     */
    public function setImage34($image_34)
    {

        if (is_null($image_34)) {
            throw new \InvalidArgumentException('non-nullable image_34 cannot be null');
        }

        $this->container['image_34'] = $image_34;

        return $this;
    }

    /**
     * Gets image_44
     *
     * @return string
     */
    public function getImage44()
    {
        return $this->container['image_44'];
    }

    /**
     * Sets image_44
     *
     * @param string $image_44 image_44
     *
     * @return self
     */
    public function setImage44($image_44)
    {

        if (is_null($image_44)) {
            throw new \InvalidArgumentException('non-nullable image_44 cannot be null');
        }

        $this->container['image_44'] = $image_44;

        return $this;
    }

    /**
     * Gets image_68
     *
     * @return string
     */
    public function getImage68()
    {
        return $this->container['image_68'];
    }

    /**
     * Sets image_68
     *
     * @param string $image_68 image_68
     *
     * @return self
     */
    public function setImage68($image_68)
    {

        if (is_null($image_68)) {
            throw new \InvalidArgumentException('non-nullable image_68 cannot be null');
        }

        $this->container['image_68'] = $image_68;

        return $this;
    }

    /**
     * Gets image_88
     *
     * @return string
     */
    public function getImage88()
    {
        return $this->container['image_88'];
    }

    /**
     * Sets image_88
     *
     * @param string $image_88 image_88
     *
     * @return self
     */
    public function setImage88($image_88)
    {

        if (is_null($image_88)) {
            throw new \InvalidArgumentException('non-nullable image_88 cannot be null');
        }

        $this->container['image_88'] = $image_88;

        return $this;
    }

    /**
     * Gets image_default
     *
     * @return bool
     */
    public function getImageDefault()
    {
        return $this->container['image_default'];
    }

    /**
     * Sets image_default
     *
     * @param bool $image_default image_default
     *
     * @return self
     */
    public function setImageDefault($image_default)
    {

        if (is_null($image_default)) {
            throw new \InvalidArgumentException('non-nullable image_default cannot be null');
        }

        $this->container['image_default'] = $image_default;

        return $this;
    }

    /**
     * Gets name
     *
     * @return string
     */
    public function getName()
    {
        return $this->container['name'];
    }

    /**
     * Sets name
     *
     * @param string $name name
     *
     * @return self
     */
    public function setName($name)
    {

        if (is_null($name)) {
            throw new \InvalidArgumentException('non-nullable name cannot be null');
        }

        $this->container['name'] = $name;

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


