<?php
/**
 * TeamAccessLogsSchemaLoginsInner
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
 * TeamAccessLogsSchemaLoginsInner Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class TeamAccessLogsSchemaLoginsInner implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'team_accessLogs_schema_logins_inner';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'count' => 'int',
        'country' => 'string',
        'date_first' => 'int',
        'date_last' => 'int',
        'ip' => 'string',
        'isp' => 'string',
        'region' => 'string',
        'user_agent' => 'string',
        'user_id' => 'string',
        'username' => 'string'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'count' => null,
        'country' => null,
        'date_first' => null,
        'date_last' => null,
        'ip' => null,
        'isp' => null,
        'region' => null,
        'user_agent' => null,
        'user_id' => null,
        'username' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'count' => false,
		'country' => true,
		'date_first' => false,
		'date_last' => false,
		'ip' => true,
		'isp' => true,
		'region' => true,
		'user_agent' => false,
		'user_id' => false,
		'username' => false
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
        'count' => 'count',
        'country' => 'country',
        'date_first' => 'date_first',
        'date_last' => 'date_last',
        'ip' => 'ip',
        'isp' => 'isp',
        'region' => 'region',
        'user_agent' => 'user_agent',
        'user_id' => 'user_id',
        'username' => 'username'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'count' => 'setCount',
        'country' => 'setCountry',
        'date_first' => 'setDateFirst',
        'date_last' => 'setDateLast',
        'ip' => 'setIp',
        'isp' => 'setIsp',
        'region' => 'setRegion',
        'user_agent' => 'setUserAgent',
        'user_id' => 'setUserId',
        'username' => 'setUsername'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'count' => 'getCount',
        'country' => 'getCountry',
        'date_first' => 'getDateFirst',
        'date_last' => 'getDateLast',
        'ip' => 'getIp',
        'isp' => 'getIsp',
        'region' => 'getRegion',
        'user_agent' => 'getUserAgent',
        'user_id' => 'getUserId',
        'username' => 'getUsername'
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
        $this->setIfExists('count', $data ?? [], null);
        $this->setIfExists('country', $data ?? [], null);
        $this->setIfExists('date_first', $data ?? [], null);
        $this->setIfExists('date_last', $data ?? [], null);
        $this->setIfExists('ip', $data ?? [], null);
        $this->setIfExists('isp', $data ?? [], null);
        $this->setIfExists('region', $data ?? [], null);
        $this->setIfExists('user_agent', $data ?? [], null);
        $this->setIfExists('user_id', $data ?? [], null);
        $this->setIfExists('username', $data ?? [], null);
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

        if ($this->container['count'] === null) {
            $invalidProperties[] = "'count' can't be null";
        }
        if ($this->container['country'] === null) {
            $invalidProperties[] = "'country' can't be null";
        }
        if ($this->container['date_first'] === null) {
            $invalidProperties[] = "'date_first' can't be null";
        }
        if ($this->container['date_last'] === null) {
            $invalidProperties[] = "'date_last' can't be null";
        }
        if ($this->container['ip'] === null) {
            $invalidProperties[] = "'ip' can't be null";
        }
        if ($this->container['isp'] === null) {
            $invalidProperties[] = "'isp' can't be null";
        }
        if ($this->container['region'] === null) {
            $invalidProperties[] = "'region' can't be null";
        }
        if ($this->container['user_agent'] === null) {
            $invalidProperties[] = "'user_agent' can't be null";
        }
        if ($this->container['user_id'] === null) {
            $invalidProperties[] = "'user_id' can't be null";
        }
        if (!preg_match("/^[UW][A-Z0-9]{2,}$/", $this->container['user_id'])) {
            $invalidProperties[] = "invalid value for 'user_id', must be conform to the pattern /^[UW][A-Z0-9]{2,}$/.";
        }

        if ($this->container['username'] === null) {
            $invalidProperties[] = "'username' can't be null";
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
     * Gets count
     *
     * @return int
     */
    public function getCount()
    {
        return $this->container['count'];
    }

    /**
     * Sets count
     *
     * @param int $count count
     *
     * @return self
     */
    public function setCount($count)
    {

        if (is_null($count)) {
            throw new \InvalidArgumentException('non-nullable count cannot be null');
        }

        $this->container['count'] = $count;

        return $this;
    }

    /**
     * Gets country
     *
     * @return string
     */
    public function getCountry()
    {
        return $this->container['country'];
    }

    /**
     * Sets country
     *
     * @param string $country country
     *
     * @return self
     */
    public function setCountry($country)
    {

        if (is_null($country)) {
            array_push($this->openAPINullablesSetToNull, 'country');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('country', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['country'] = $country;

        return $this;
    }

    /**
     * Gets date_first
     *
     * @return int
     */
    public function getDateFirst()
    {
        return $this->container['date_first'];
    }

    /**
     * Sets date_first
     *
     * @param int $date_first date_first
     *
     * @return self
     */
    public function setDateFirst($date_first)
    {

        if (is_null($date_first)) {
            throw new \InvalidArgumentException('non-nullable date_first cannot be null');
        }

        $this->container['date_first'] = $date_first;

        return $this;
    }

    /**
     * Gets date_last
     *
     * @return int
     */
    public function getDateLast()
    {
        return $this->container['date_last'];
    }

    /**
     * Sets date_last
     *
     * @param int $date_last date_last
     *
     * @return self
     */
    public function setDateLast($date_last)
    {

        if (is_null($date_last)) {
            throw new \InvalidArgumentException('non-nullable date_last cannot be null');
        }

        $this->container['date_last'] = $date_last;

        return $this;
    }

    /**
     * Gets ip
     *
     * @return string
     */
    public function getIp()
    {
        return $this->container['ip'];
    }

    /**
     * Sets ip
     *
     * @param string $ip ip
     *
     * @return self
     */
    public function setIp($ip)
    {

        if (is_null($ip)) {
            array_push($this->openAPINullablesSetToNull, 'ip');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('ip', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['ip'] = $ip;

        return $this;
    }

    /**
     * Gets isp
     *
     * @return string
     */
    public function getIsp()
    {
        return $this->container['isp'];
    }

    /**
     * Sets isp
     *
     * @param string $isp isp
     *
     * @return self
     */
    public function setIsp($isp)
    {

        if (is_null($isp)) {
            array_push($this->openAPINullablesSetToNull, 'isp');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('isp', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['isp'] = $isp;

        return $this;
    }

    /**
     * Gets region
     *
     * @return string
     */
    public function getRegion()
    {
        return $this->container['region'];
    }

    /**
     * Sets region
     *
     * @param string $region region
     *
     * @return self
     */
    public function setRegion($region)
    {

        if (is_null($region)) {
            array_push($this->openAPINullablesSetToNull, 'region');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('region', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['region'] = $region;

        return $this;
    }

    /**
     * Gets user_agent
     *
     * @return string
     */
    public function getUserAgent()
    {
        return $this->container['user_agent'];
    }

    /**
     * Sets user_agent
     *
     * @param string $user_agent user_agent
     *
     * @return self
     */
    public function setUserAgent($user_agent)
    {

        if (is_null($user_agent)) {
            throw new \InvalidArgumentException('non-nullable user_agent cannot be null');
        }

        $this->container['user_agent'] = $user_agent;

        return $this;
    }

    /**
     * Gets user_id
     *
     * @return string
     */
    public function getUserId()
    {
        return $this->container['user_id'];
    }

    /**
     * Sets user_id
     *
     * @param string $user_id user_id
     *
     * @return self
     */
    public function setUserId($user_id)
    {

        if ((!preg_match("/^[UW][A-Z0-9]{2,}$/", $user_id))) {
            throw new \InvalidArgumentException("invalid value for \$user_id when calling TeamAccessLogsSchemaLoginsInner., must conform to the pattern /^[UW][A-Z0-9]{2,}$/.");
        }


        if (is_null($user_id)) {
            throw new \InvalidArgumentException('non-nullable user_id cannot be null');
        }

        $this->container['user_id'] = $user_id;

        return $this;
    }

    /**
     * Gets username
     *
     * @return string
     */
    public function getUsername()
    {
        return $this->container['username'];
    }

    /**
     * Sets username
     *
     * @param string $username username
     *
     * @return self
     */
    public function setUsername($username)
    {

        if (is_null($username)) {
            throw new \InvalidArgumentException('non-nullable username cannot be null');
        }

        $this->container['username'] = $username;

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

