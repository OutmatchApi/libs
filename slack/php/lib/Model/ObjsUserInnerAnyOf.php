<?php
/**
 * ObjsUserInnerAnyOf
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
 * ObjsUserInnerAnyOf Class Doc Comment
 *
 * @category Class
 * @description user object for non enterprise type
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class ObjsUserInnerAnyOf implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'objs_user_inner_anyOf';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'color' => 'string',
        'deleted' => 'bool',
        'enterprise_user' => '\OpenAPI\Client\Model\ObjsEnterpriseUser',
        'has_2fa' => 'bool',
        'id' => 'string',
        'is_admin' => 'bool',
        'is_app_user' => 'bool',
        'is_bot' => 'bool',
        'is_external' => 'bool',
        'is_forgotten' => 'bool',
        'is_invited_user' => 'bool',
        'is_owner' => 'bool',
        'is_primary_owner' => 'bool',
        'is_restricted' => 'bool',
        'is_stranger' => 'bool',
        'is_ultra_restricted' => 'bool',
        'locale' => 'string',
        'name' => 'string',
        'presence' => 'string',
        'profile' => '\OpenAPI\Client\Model\ObjsUserProfile',
        'real_name' => 'string',
        'team' => 'string',
        'team_id' => 'string',
        'team_profile' => '\OpenAPI\Client\Model\ObjsUserInnerAnyOfTeamProfile',
        'two_factor_type' => 'string',
        'tz' => '\OpenAPI\Client\Model\ObjsTeamDiscoverableInner[]',
        'tz_label' => 'string',
        'tz_offset' => 'float',
        'updated' => 'float'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'color' => null,
        'deleted' => null,
        'enterprise_user' => null,
        'has_2fa' => null,
        'id' => null,
        'is_admin' => null,
        'is_app_user' => null,
        'is_bot' => null,
        'is_external' => null,
        'is_forgotten' => null,
        'is_invited_user' => null,
        'is_owner' => null,
        'is_primary_owner' => null,
        'is_restricted' => null,
        'is_stranger' => null,
        'is_ultra_restricted' => null,
        'locale' => null,
        'name' => null,
        'presence' => null,
        'profile' => null,
        'real_name' => null,
        'team' => null,
        'team_id' => null,
        'team_profile' => null,
        'two_factor_type' => null,
        'tz' => null,
        'tz_label' => null,
        'tz_offset' => null,
        'updated' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'color' => false,
		'deleted' => false,
		'enterprise_user' => false,
		'has_2fa' => false,
		'id' => false,
		'is_admin' => false,
		'is_app_user' => false,
		'is_bot' => false,
		'is_external' => false,
		'is_forgotten' => false,
		'is_invited_user' => false,
		'is_owner' => false,
		'is_primary_owner' => false,
		'is_restricted' => false,
		'is_stranger' => false,
		'is_ultra_restricted' => false,
		'locale' => false,
		'name' => false,
		'presence' => false,
		'profile' => false,
		'real_name' => false,
		'team' => false,
		'team_id' => false,
		'team_profile' => false,
		'two_factor_type' => false,
		'tz' => false,
		'tz_label' => false,
		'tz_offset' => false,
		'updated' => false
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
        'color' => 'color',
        'deleted' => 'deleted',
        'enterprise_user' => 'enterprise_user',
        'has_2fa' => 'has_2fa',
        'id' => 'id',
        'is_admin' => 'is_admin',
        'is_app_user' => 'is_app_user',
        'is_bot' => 'is_bot',
        'is_external' => 'is_external',
        'is_forgotten' => 'is_forgotten',
        'is_invited_user' => 'is_invited_user',
        'is_owner' => 'is_owner',
        'is_primary_owner' => 'is_primary_owner',
        'is_restricted' => 'is_restricted',
        'is_stranger' => 'is_stranger',
        'is_ultra_restricted' => 'is_ultra_restricted',
        'locale' => 'locale',
        'name' => 'name',
        'presence' => 'presence',
        'profile' => 'profile',
        'real_name' => 'real_name',
        'team' => 'team',
        'team_id' => 'team_id',
        'team_profile' => 'team_profile',
        'two_factor_type' => 'two_factor_type',
        'tz' => 'tz',
        'tz_label' => 'tz_label',
        'tz_offset' => 'tz_offset',
        'updated' => 'updated'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'color' => 'setColor',
        'deleted' => 'setDeleted',
        'enterprise_user' => 'setEnterpriseUser',
        'has_2fa' => 'setHas2fa',
        'id' => 'setId',
        'is_admin' => 'setIsAdmin',
        'is_app_user' => 'setIsAppUser',
        'is_bot' => 'setIsBot',
        'is_external' => 'setIsExternal',
        'is_forgotten' => 'setIsForgotten',
        'is_invited_user' => 'setIsInvitedUser',
        'is_owner' => 'setIsOwner',
        'is_primary_owner' => 'setIsPrimaryOwner',
        'is_restricted' => 'setIsRestricted',
        'is_stranger' => 'setIsStranger',
        'is_ultra_restricted' => 'setIsUltraRestricted',
        'locale' => 'setLocale',
        'name' => 'setName',
        'presence' => 'setPresence',
        'profile' => 'setProfile',
        'real_name' => 'setRealName',
        'team' => 'setTeam',
        'team_id' => 'setTeamId',
        'team_profile' => 'setTeamProfile',
        'two_factor_type' => 'setTwoFactorType',
        'tz' => 'setTz',
        'tz_label' => 'setTzLabel',
        'tz_offset' => 'setTzOffset',
        'updated' => 'setUpdated'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'color' => 'getColor',
        'deleted' => 'getDeleted',
        'enterprise_user' => 'getEnterpriseUser',
        'has_2fa' => 'getHas2fa',
        'id' => 'getId',
        'is_admin' => 'getIsAdmin',
        'is_app_user' => 'getIsAppUser',
        'is_bot' => 'getIsBot',
        'is_external' => 'getIsExternal',
        'is_forgotten' => 'getIsForgotten',
        'is_invited_user' => 'getIsInvitedUser',
        'is_owner' => 'getIsOwner',
        'is_primary_owner' => 'getIsPrimaryOwner',
        'is_restricted' => 'getIsRestricted',
        'is_stranger' => 'getIsStranger',
        'is_ultra_restricted' => 'getIsUltraRestricted',
        'locale' => 'getLocale',
        'name' => 'getName',
        'presence' => 'getPresence',
        'profile' => 'getProfile',
        'real_name' => 'getRealName',
        'team' => 'getTeam',
        'team_id' => 'getTeamId',
        'team_profile' => 'getTeamProfile',
        'two_factor_type' => 'getTwoFactorType',
        'tz' => 'getTz',
        'tz_label' => 'getTzLabel',
        'tz_offset' => 'getTzOffset',
        'updated' => 'getUpdated'
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
        $this->setIfExists('color', $data ?? [], null);
        $this->setIfExists('deleted', $data ?? [], null);
        $this->setIfExists('enterprise_user', $data ?? [], null);
        $this->setIfExists('has_2fa', $data ?? [], null);
        $this->setIfExists('id', $data ?? [], null);
        $this->setIfExists('is_admin', $data ?? [], null);
        $this->setIfExists('is_app_user', $data ?? [], null);
        $this->setIfExists('is_bot', $data ?? [], null);
        $this->setIfExists('is_external', $data ?? [], null);
        $this->setIfExists('is_forgotten', $data ?? [], null);
        $this->setIfExists('is_invited_user', $data ?? [], null);
        $this->setIfExists('is_owner', $data ?? [], null);
        $this->setIfExists('is_primary_owner', $data ?? [], null);
        $this->setIfExists('is_restricted', $data ?? [], null);
        $this->setIfExists('is_stranger', $data ?? [], null);
        $this->setIfExists('is_ultra_restricted', $data ?? [], null);
        $this->setIfExists('locale', $data ?? [], null);
        $this->setIfExists('name', $data ?? [], null);
        $this->setIfExists('presence', $data ?? [], null);
        $this->setIfExists('profile', $data ?? [], null);
        $this->setIfExists('real_name', $data ?? [], null);
        $this->setIfExists('team', $data ?? [], null);
        $this->setIfExists('team_id', $data ?? [], null);
        $this->setIfExists('team_profile', $data ?? [], null);
        $this->setIfExists('two_factor_type', $data ?? [], null);
        $this->setIfExists('tz', $data ?? [], null);
        $this->setIfExists('tz_label', $data ?? [], null);
        $this->setIfExists('tz_offset', $data ?? [], null);
        $this->setIfExists('updated', $data ?? [], null);
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

        if (!is_null($this->container['color']) && !preg_match("/^[a-fA-F0-9]{6}$/", $this->container['color'])) {
            $invalidProperties[] = "invalid value for 'color', must be conform to the pattern /^[a-fA-F0-9]{6}$/.";
        }

        if ($this->container['id'] === null) {
            $invalidProperties[] = "'id' can't be null";
        }
        if (!preg_match("/^[UW][A-Z0-9]{2,}$/", $this->container['id'])) {
            $invalidProperties[] = "invalid value for 'id', must be conform to the pattern /^[UW][A-Z0-9]{2,}$/.";
        }

        if ($this->container['is_app_user'] === null) {
            $invalidProperties[] = "'is_app_user' can't be null";
        }
        if ($this->container['is_bot'] === null) {
            $invalidProperties[] = "'is_bot' can't be null";
        }
        if ($this->container['name'] === null) {
            $invalidProperties[] = "'name' can't be null";
        }
        if ($this->container['profile'] === null) {
            $invalidProperties[] = "'profile' can't be null";
        }
        if (!is_null($this->container['team']) && !preg_match("/^[TE][A-Z0-9]{8,}$/", $this->container['team'])) {
            $invalidProperties[] = "invalid value for 'team', must be conform to the pattern /^[TE][A-Z0-9]{8,}$/.";
        }

        if (!is_null($this->container['team_id']) && !preg_match("/^[TE][A-Z0-9]{8,}$/", $this->container['team_id'])) {
            $invalidProperties[] = "invalid value for 'team_id', must be conform to the pattern /^[TE][A-Z0-9]{8,}$/.";
        }

        if ($this->container['updated'] === null) {
            $invalidProperties[] = "'updated' can't be null";
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
     * Gets color
     *
     * @return string|null
     */
    public function getColor()
    {
        return $this->container['color'];
    }

    /**
     * Sets color
     *
     * @param string|null $color color
     *
     * @return self
     */
    public function setColor($color)
    {

        if (!is_null($color) && (!preg_match("/^[a-fA-F0-9]{6}$/", $color))) {
            throw new \InvalidArgumentException("invalid value for \$color when calling ObjsUserInnerAnyOf., must conform to the pattern /^[a-fA-F0-9]{6}$/.");
        }


        if (is_null($color)) {
            throw new \InvalidArgumentException('non-nullable color cannot be null');
        }

        $this->container['color'] = $color;

        return $this;
    }

    /**
     * Gets deleted
     *
     * @return bool|null
     */
    public function getDeleted()
    {
        return $this->container['deleted'];
    }

    /**
     * Sets deleted
     *
     * @param bool|null $deleted deleted
     *
     * @return self
     */
    public function setDeleted($deleted)
    {

        if (is_null($deleted)) {
            throw new \InvalidArgumentException('non-nullable deleted cannot be null');
        }

        $this->container['deleted'] = $deleted;

        return $this;
    }

    /**
     * Gets enterprise_user
     *
     * @return \OpenAPI\Client\Model\ObjsEnterpriseUser|null
     */
    public function getEnterpriseUser()
    {
        return $this->container['enterprise_user'];
    }

    /**
     * Sets enterprise_user
     *
     * @param \OpenAPI\Client\Model\ObjsEnterpriseUser|null $enterprise_user enterprise_user
     *
     * @return self
     */
    public function setEnterpriseUser($enterprise_user)
    {

        if (is_null($enterprise_user)) {
            throw new \InvalidArgumentException('non-nullable enterprise_user cannot be null');
        }

        $this->container['enterprise_user'] = $enterprise_user;

        return $this;
    }

    /**
     * Gets has_2fa
     *
     * @return bool|null
     */
    public function getHas2fa()
    {
        return $this->container['has_2fa'];
    }

    /**
     * Sets has_2fa
     *
     * @param bool|null $has_2fa has_2fa
     *
     * @return self
     */
    public function setHas2fa($has_2fa)
    {

        if (is_null($has_2fa)) {
            throw new \InvalidArgumentException('non-nullable has_2fa cannot be null');
        }

        $this->container['has_2fa'] = $has_2fa;

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

        if ((!preg_match("/^[UW][A-Z0-9]{2,}$/", $id))) {
            throw new \InvalidArgumentException("invalid value for \$id when calling ObjsUserInnerAnyOf., must conform to the pattern /^[UW][A-Z0-9]{2,}$/.");
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
     * @return bool|null
     */
    public function getIsAdmin()
    {
        return $this->container['is_admin'];
    }

    /**
     * Sets is_admin
     *
     * @param bool|null $is_admin is_admin
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
     * Gets is_app_user
     *
     * @return bool
     */
    public function getIsAppUser()
    {
        return $this->container['is_app_user'];
    }

    /**
     * Sets is_app_user
     *
     * @param bool $is_app_user is_app_user
     *
     * @return self
     */
    public function setIsAppUser($is_app_user)
    {

        if (is_null($is_app_user)) {
            throw new \InvalidArgumentException('non-nullable is_app_user cannot be null');
        }

        $this->container['is_app_user'] = $is_app_user;

        return $this;
    }

    /**
     * Gets is_bot
     *
     * @return bool
     */
    public function getIsBot()
    {
        return $this->container['is_bot'];
    }

    /**
     * Sets is_bot
     *
     * @param bool $is_bot is_bot
     *
     * @return self
     */
    public function setIsBot($is_bot)
    {

        if (is_null($is_bot)) {
            throw new \InvalidArgumentException('non-nullable is_bot cannot be null');
        }

        $this->container['is_bot'] = $is_bot;

        return $this;
    }

    /**
     * Gets is_external
     *
     * @return bool|null
     */
    public function getIsExternal()
    {
        return $this->container['is_external'];
    }

    /**
     * Sets is_external
     *
     * @param bool|null $is_external is_external
     *
     * @return self
     */
    public function setIsExternal($is_external)
    {

        if (is_null($is_external)) {
            throw new \InvalidArgumentException('non-nullable is_external cannot be null');
        }

        $this->container['is_external'] = $is_external;

        return $this;
    }

    /**
     * Gets is_forgotten
     *
     * @return bool|null
     */
    public function getIsForgotten()
    {
        return $this->container['is_forgotten'];
    }

    /**
     * Sets is_forgotten
     *
     * @param bool|null $is_forgotten is_forgotten
     *
     * @return self
     */
    public function setIsForgotten($is_forgotten)
    {

        if (is_null($is_forgotten)) {
            throw new \InvalidArgumentException('non-nullable is_forgotten cannot be null');
        }

        $this->container['is_forgotten'] = $is_forgotten;

        return $this;
    }

    /**
     * Gets is_invited_user
     *
     * @return bool|null
     */
    public function getIsInvitedUser()
    {
        return $this->container['is_invited_user'];
    }

    /**
     * Sets is_invited_user
     *
     * @param bool|null $is_invited_user is_invited_user
     *
     * @return self
     */
    public function setIsInvitedUser($is_invited_user)
    {

        if (is_null($is_invited_user)) {
            throw new \InvalidArgumentException('non-nullable is_invited_user cannot be null');
        }

        $this->container['is_invited_user'] = $is_invited_user;

        return $this;
    }

    /**
     * Gets is_owner
     *
     * @return bool|null
     */
    public function getIsOwner()
    {
        return $this->container['is_owner'];
    }

    /**
     * Sets is_owner
     *
     * @param bool|null $is_owner is_owner
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
     * Gets is_primary_owner
     *
     * @return bool|null
     */
    public function getIsPrimaryOwner()
    {
        return $this->container['is_primary_owner'];
    }

    /**
     * Sets is_primary_owner
     *
     * @param bool|null $is_primary_owner is_primary_owner
     *
     * @return self
     */
    public function setIsPrimaryOwner($is_primary_owner)
    {

        if (is_null($is_primary_owner)) {
            throw new \InvalidArgumentException('non-nullable is_primary_owner cannot be null');
        }

        $this->container['is_primary_owner'] = $is_primary_owner;

        return $this;
    }

    /**
     * Gets is_restricted
     *
     * @return bool|null
     */
    public function getIsRestricted()
    {
        return $this->container['is_restricted'];
    }

    /**
     * Sets is_restricted
     *
     * @param bool|null $is_restricted is_restricted
     *
     * @return self
     */
    public function setIsRestricted($is_restricted)
    {

        if (is_null($is_restricted)) {
            throw new \InvalidArgumentException('non-nullable is_restricted cannot be null');
        }

        $this->container['is_restricted'] = $is_restricted;

        return $this;
    }

    /**
     * Gets is_stranger
     *
     * @return bool|null
     */
    public function getIsStranger()
    {
        return $this->container['is_stranger'];
    }

    /**
     * Sets is_stranger
     *
     * @param bool|null $is_stranger is_stranger
     *
     * @return self
     */
    public function setIsStranger($is_stranger)
    {

        if (is_null($is_stranger)) {
            throw new \InvalidArgumentException('non-nullable is_stranger cannot be null');
        }

        $this->container['is_stranger'] = $is_stranger;

        return $this;
    }

    /**
     * Gets is_ultra_restricted
     *
     * @return bool|null
     */
    public function getIsUltraRestricted()
    {
        return $this->container['is_ultra_restricted'];
    }

    /**
     * Sets is_ultra_restricted
     *
     * @param bool|null $is_ultra_restricted is_ultra_restricted
     *
     * @return self
     */
    public function setIsUltraRestricted($is_ultra_restricted)
    {

        if (is_null($is_ultra_restricted)) {
            throw new \InvalidArgumentException('non-nullable is_ultra_restricted cannot be null');
        }

        $this->container['is_ultra_restricted'] = $is_ultra_restricted;

        return $this;
    }

    /**
     * Gets locale
     *
     * @return string|null
     */
    public function getLocale()
    {
        return $this->container['locale'];
    }

    /**
     * Sets locale
     *
     * @param string|null $locale locale
     *
     * @return self
     */
    public function setLocale($locale)
    {

        if (is_null($locale)) {
            throw new \InvalidArgumentException('non-nullable locale cannot be null');
        }

        $this->container['locale'] = $locale;

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
     * Gets presence
     *
     * @return string|null
     */
    public function getPresence()
    {
        return $this->container['presence'];
    }

    /**
     * Sets presence
     *
     * @param string|null $presence presence
     *
     * @return self
     */
    public function setPresence($presence)
    {

        if (is_null($presence)) {
            throw new \InvalidArgumentException('non-nullable presence cannot be null');
        }

        $this->container['presence'] = $presence;

        return $this;
    }

    /**
     * Gets profile
     *
     * @return \OpenAPI\Client\Model\ObjsUserProfile
     */
    public function getProfile()
    {
        return $this->container['profile'];
    }

    /**
     * Sets profile
     *
     * @param \OpenAPI\Client\Model\ObjsUserProfile $profile profile
     *
     * @return self
     */
    public function setProfile($profile)
    {

        if (is_null($profile)) {
            throw new \InvalidArgumentException('non-nullable profile cannot be null');
        }

        $this->container['profile'] = $profile;

        return $this;
    }

    /**
     * Gets real_name
     *
     * @return string|null
     */
    public function getRealName()
    {
        return $this->container['real_name'];
    }

    /**
     * Sets real_name
     *
     * @param string|null $real_name real_name
     *
     * @return self
     */
    public function setRealName($real_name)
    {

        if (is_null($real_name)) {
            throw new \InvalidArgumentException('non-nullable real_name cannot be null');
        }

        $this->container['real_name'] = $real_name;

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

        if (!is_null($team) && (!preg_match("/^[TE][A-Z0-9]{8,}$/", $team))) {
            throw new \InvalidArgumentException("invalid value for \$team when calling ObjsUserInnerAnyOf., must conform to the pattern /^[TE][A-Z0-9]{8,}$/.");
        }


        if (is_null($team)) {
            throw new \InvalidArgumentException('non-nullable team cannot be null');
        }

        $this->container['team'] = $team;

        return $this;
    }

    /**
     * Gets team_id
     *
     * @return string|null
     */
    public function getTeamId()
    {
        return $this->container['team_id'];
    }

    /**
     * Sets team_id
     *
     * @param string|null $team_id team_id
     *
     * @return self
     */
    public function setTeamId($team_id)
    {

        if (!is_null($team_id) && (!preg_match("/^[TE][A-Z0-9]{8,}$/", $team_id))) {
            throw new \InvalidArgumentException("invalid value for \$team_id when calling ObjsUserInnerAnyOf., must conform to the pattern /^[TE][A-Z0-9]{8,}$/.");
        }


        if (is_null($team_id)) {
            throw new \InvalidArgumentException('non-nullable team_id cannot be null');
        }

        $this->container['team_id'] = $team_id;

        return $this;
    }

    /**
     * Gets team_profile
     *
     * @return \OpenAPI\Client\Model\ObjsUserInnerAnyOfTeamProfile|null
     */
    public function getTeamProfile()
    {
        return $this->container['team_profile'];
    }

    /**
     * Sets team_profile
     *
     * @param \OpenAPI\Client\Model\ObjsUserInnerAnyOfTeamProfile|null $team_profile team_profile
     *
     * @return self
     */
    public function setTeamProfile($team_profile)
    {

        if (is_null($team_profile)) {
            throw new \InvalidArgumentException('non-nullable team_profile cannot be null');
        }

        $this->container['team_profile'] = $team_profile;

        return $this;
    }

    /**
     * Gets two_factor_type
     *
     * @return string|null
     */
    public function getTwoFactorType()
    {
        return $this->container['two_factor_type'];
    }

    /**
     * Sets two_factor_type
     *
     * @param string|null $two_factor_type two_factor_type
     *
     * @return self
     */
    public function setTwoFactorType($two_factor_type)
    {

        if (is_null($two_factor_type)) {
            throw new \InvalidArgumentException('non-nullable two_factor_type cannot be null');
        }

        $this->container['two_factor_type'] = $two_factor_type;

        return $this;
    }

    /**
     * Gets tz
     *
     * @return \OpenAPI\Client\Model\ObjsTeamDiscoverableInner[]|null
     */
    public function getTz()
    {
        return $this->container['tz'];
    }

    /**
     * Sets tz
     *
     * @param \OpenAPI\Client\Model\ObjsTeamDiscoverableInner[]|null $tz tz
     *
     * @return self
     */
    public function setTz($tz)
    {

        if (is_null($tz)) {
            throw new \InvalidArgumentException('non-nullable tz cannot be null');
        }

        $this->container['tz'] = $tz;

        return $this;
    }

    /**
     * Gets tz_label
     *
     * @return string|null
     */
    public function getTzLabel()
    {
        return $this->container['tz_label'];
    }

    /**
     * Sets tz_label
     *
     * @param string|null $tz_label tz_label
     *
     * @return self
     */
    public function setTzLabel($tz_label)
    {

        if (is_null($tz_label)) {
            throw new \InvalidArgumentException('non-nullable tz_label cannot be null');
        }

        $this->container['tz_label'] = $tz_label;

        return $this;
    }

    /**
     * Gets tz_offset
     *
     * @return float|null
     */
    public function getTzOffset()
    {
        return $this->container['tz_offset'];
    }

    /**
     * Sets tz_offset
     *
     * @param float|null $tz_offset tz_offset
     *
     * @return self
     */
    public function setTzOffset($tz_offset)
    {

        if (is_null($tz_offset)) {
            throw new \InvalidArgumentException('non-nullable tz_offset cannot be null');
        }

        $this->container['tz_offset'] = $tz_offset;

        return $this;
    }

    /**
     * Gets updated
     *
     * @return float
     */
    public function getUpdated()
    {
        return $this->container['updated'];
    }

    /**
     * Sets updated
     *
     * @param float $updated updated
     *
     * @return self
     */
    public function setUpdated($updated)
    {

        if (is_null($updated)) {
            throw new \InvalidArgumentException('non-nullable updated cannot be null');
        }

        $this->container['updated'] = $updated;

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


