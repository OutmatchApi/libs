<?php
/**
 * UsersIdentityErrorSchema
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
 * UsersIdentityErrorSchema Class Doc Comment
 *
 * @category Class
 * @description Schema for error response from users.identity method
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class UsersIdentityErrorSchema implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'users_identity_error_schema';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'callstack' => 'string',
        'error' => 'string',
        'ok' => '\OpenAPI\Client\Model\DefsOkFalse'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'callstack' => null,
        'error' => null,
        'ok' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'callstack' => false,
		'error' => false,
		'ok' => false
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
        'callstack' => 'callstack',
        'error' => 'error',
        'ok' => 'ok'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'callstack' => 'setCallstack',
        'error' => 'setError',
        'ok' => 'setOk'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'callstack' => 'getCallstack',
        'error' => 'getError',
        'ok' => 'getOk'
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

    public const ERROR_NOT_AUTHED = 'not_authed';
    public const ERROR_INVALID_AUTH = 'invalid_auth';
    public const ERROR_ACCOUNT_INACTIVE = 'account_inactive';
    public const ERROR_TOKEN_REVOKED = 'token_revoked';
    public const ERROR_NO_PERMISSION = 'no_permission';
    public const ERROR_ORG_LOGIN_REQUIRED = 'org_login_required';
    public const ERROR_USER_IS_BOT = 'user_is_bot';
    public const ERROR_INVALID_ARG_NAME = 'invalid_arg_name';
    public const ERROR_INVALID_ARRAY_ARG = 'invalid_array_arg';
    public const ERROR_INVALID_CHARSET = 'invalid_charset';
    public const ERROR_INVALID_FORM_DATA = 'invalid_form_data';
    public const ERROR_INVALID_POST_TYPE = 'invalid_post_type';
    public const ERROR_MISSING_POST_TYPE = 'missing_post_type';
    public const ERROR_TEAM_ADDED_TO_ORG = 'team_added_to_org';
    public const ERROR_INVALID_JSON = 'invalid_json';
    public const ERROR_JSON_NOT_OBJECT = 'json_not_object';
    public const ERROR_REQUEST_TIMEOUT = 'request_timeout';
    public const ERROR_UPGRADE_REQUIRED = 'upgrade_required';
    public const ERROR_FATAL_ERROR = 'fatal_error';

    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getErrorAllowableValues()
    {
        return [
            self::ERROR_NOT_AUTHED,
            self::ERROR_INVALID_AUTH,
            self::ERROR_ACCOUNT_INACTIVE,
            self::ERROR_TOKEN_REVOKED,
            self::ERROR_NO_PERMISSION,
            self::ERROR_ORG_LOGIN_REQUIRED,
            self::ERROR_USER_IS_BOT,
            self::ERROR_INVALID_ARG_NAME,
            self::ERROR_INVALID_ARRAY_ARG,
            self::ERROR_INVALID_CHARSET,
            self::ERROR_INVALID_FORM_DATA,
            self::ERROR_INVALID_POST_TYPE,
            self::ERROR_MISSING_POST_TYPE,
            self::ERROR_TEAM_ADDED_TO_ORG,
            self::ERROR_INVALID_JSON,
            self::ERROR_JSON_NOT_OBJECT,
            self::ERROR_REQUEST_TIMEOUT,
            self::ERROR_UPGRADE_REQUIRED,
            self::ERROR_FATAL_ERROR,
        ];
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
        $this->setIfExists('callstack', $data ?? [], null);
        $this->setIfExists('error', $data ?? [], null);
        $this->setIfExists('ok', $data ?? [], null);
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

        if ($this->container['error'] === null) {
            $invalidProperties[] = "'error' can't be null";
        }
        $allowedValues = $this->getErrorAllowableValues();
        if (!is_null($this->container['error']) && !in_array($this->container['error'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value '%s' for 'error', must be one of '%s'",
                $this->container['error'],
                implode("', '", $allowedValues)
            );
        }

        if ($this->container['ok'] === null) {
            $invalidProperties[] = "'ok' can't be null";
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
     * Gets callstack
     *
     * @return string|null
     */
    public function getCallstack()
    {
        return $this->container['callstack'];
    }

    /**
     * Sets callstack
     *
     * @param string|null $callstack Note: PHP callstack is only visible in dev/qa
     *
     * @return self
     */
    public function setCallstack($callstack)
    {

        if (is_null($callstack)) {
            throw new \InvalidArgumentException('non-nullable callstack cannot be null');
        }

        $this->container['callstack'] = $callstack;

        return $this;
    }

    /**
     * Gets error
     *
     * @return string
     */
    public function getError()
    {
        return $this->container['error'];
    }

    /**
     * Sets error
     *
     * @param string $error error
     *
     * @return self
     */
    public function setError($error)
    {
        $allowedValues = $this->getErrorAllowableValues();
        if (!in_array($error, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value '%s' for 'error', must be one of '%s'",
                    $error,
                    implode("', '", $allowedValues)
                )
            );
        }

        if (is_null($error)) {
            throw new \InvalidArgumentException('non-nullable error cannot be null');
        }

        $this->container['error'] = $error;

        return $this;
    }

    /**
     * Gets ok
     *
     * @return \OpenAPI\Client\Model\DefsOkFalse
     */
    public function getOk()
    {
        return $this->container['ok'];
    }

    /**
     * Sets ok
     *
     * @param \OpenAPI\Client\Model\DefsOkFalse $ok ok
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


