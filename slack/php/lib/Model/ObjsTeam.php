<?php
/**
 * ObjsTeam
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
 * ObjsTeam Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class ObjsTeam implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'objs_team';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'archived' => 'bool',
        'avatar_base_url' => 'string',
        'created' => 'int',
        'date_create' => 'int',
        'deleted' => 'bool',
        'description' => 'string',
        'discoverable' => '\OpenAPI\Client\Model\ObjsTeamDiscoverableInner[]',
        'domain' => 'string',
        'email_domain' => 'string',
        'enterprise_id' => 'string',
        'enterprise_name' => 'string',
        'external_org_migrations' => '\OpenAPI\Client\Model\ObjsExternalOrgMigrations',
        'has_compliance_export' => 'bool',
        'icon' => '\OpenAPI\Client\Model\ObjsIcon',
        'id' => 'string',
        'is_assigned' => 'bool',
        'is_enterprise' => 'int',
        'is_over_storage_limit' => 'bool',
        'limit_ts' => 'int',
        'locale' => 'string',
        'messages_count' => 'int',
        'msg_edit_window_mins' => 'int',
        'name' => 'string',
        'over_integrations_limit' => 'bool',
        'over_storage_limit' => 'bool',
        'pay_prod_cur' => 'string',
        'plan' => 'string',
        'primary_owner' => '\OpenAPI\Client\Model\ObjsPrimaryOwner',
        'sso_provider' => '\OpenAPI\Client\Model\ObjsTeamSsoProvider'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'archived' => null,
        'avatar_base_url' => 'uri',
        'created' => null,
        'date_create' => null,
        'deleted' => null,
        'description' => null,
        'discoverable' => null,
        'domain' => null,
        'email_domain' => null,
        'enterprise_id' => null,
        'enterprise_name' => null,
        'external_org_migrations' => null,
        'has_compliance_export' => null,
        'icon' => null,
        'id' => null,
        'is_assigned' => null,
        'is_enterprise' => null,
        'is_over_storage_limit' => null,
        'limit_ts' => null,
        'locale' => null,
        'messages_count' => null,
        'msg_edit_window_mins' => null,
        'name' => null,
        'over_integrations_limit' => null,
        'over_storage_limit' => null,
        'pay_prod_cur' => null,
        'plan' => null,
        'primary_owner' => null,
        'sso_provider' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'archived' => false,
		'avatar_base_url' => false,
		'created' => false,
		'date_create' => false,
		'deleted' => false,
		'description' => true,
		'discoverable' => false,
		'domain' => false,
		'email_domain' => false,
		'enterprise_id' => false,
		'enterprise_name' => false,
		'external_org_migrations' => false,
		'has_compliance_export' => false,
		'icon' => false,
		'id' => false,
		'is_assigned' => false,
		'is_enterprise' => false,
		'is_over_storage_limit' => false,
		'limit_ts' => false,
		'locale' => false,
		'messages_count' => false,
		'msg_edit_window_mins' => false,
		'name' => false,
		'over_integrations_limit' => false,
		'over_storage_limit' => false,
		'pay_prod_cur' => false,
		'plan' => false,
		'primary_owner' => false,
		'sso_provider' => false
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
        'archived' => 'archived',
        'avatar_base_url' => 'avatar_base_url',
        'created' => 'created',
        'date_create' => 'date_create',
        'deleted' => 'deleted',
        'description' => 'description',
        'discoverable' => 'discoverable',
        'domain' => 'domain',
        'email_domain' => 'email_domain',
        'enterprise_id' => 'enterprise_id',
        'enterprise_name' => 'enterprise_name',
        'external_org_migrations' => 'external_org_migrations',
        'has_compliance_export' => 'has_compliance_export',
        'icon' => 'icon',
        'id' => 'id',
        'is_assigned' => 'is_assigned',
        'is_enterprise' => 'is_enterprise',
        'is_over_storage_limit' => 'is_over_storage_limit',
        'limit_ts' => 'limit_ts',
        'locale' => 'locale',
        'messages_count' => 'messages_count',
        'msg_edit_window_mins' => 'msg_edit_window_mins',
        'name' => 'name',
        'over_integrations_limit' => 'over_integrations_limit',
        'over_storage_limit' => 'over_storage_limit',
        'pay_prod_cur' => 'pay_prod_cur',
        'plan' => 'plan',
        'primary_owner' => 'primary_owner',
        'sso_provider' => 'sso_provider'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'archived' => 'setArchived',
        'avatar_base_url' => 'setAvatarBaseUrl',
        'created' => 'setCreated',
        'date_create' => 'setDateCreate',
        'deleted' => 'setDeleted',
        'description' => 'setDescription',
        'discoverable' => 'setDiscoverable',
        'domain' => 'setDomain',
        'email_domain' => 'setEmailDomain',
        'enterprise_id' => 'setEnterpriseId',
        'enterprise_name' => 'setEnterpriseName',
        'external_org_migrations' => 'setExternalOrgMigrations',
        'has_compliance_export' => 'setHasComplianceExport',
        'icon' => 'setIcon',
        'id' => 'setId',
        'is_assigned' => 'setIsAssigned',
        'is_enterprise' => 'setIsEnterprise',
        'is_over_storage_limit' => 'setIsOverStorageLimit',
        'limit_ts' => 'setLimitTs',
        'locale' => 'setLocale',
        'messages_count' => 'setMessagesCount',
        'msg_edit_window_mins' => 'setMsgEditWindowMins',
        'name' => 'setName',
        'over_integrations_limit' => 'setOverIntegrationsLimit',
        'over_storage_limit' => 'setOverStorageLimit',
        'pay_prod_cur' => 'setPayProdCur',
        'plan' => 'setPlan',
        'primary_owner' => 'setPrimaryOwner',
        'sso_provider' => 'setSsoProvider'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'archived' => 'getArchived',
        'avatar_base_url' => 'getAvatarBaseUrl',
        'created' => 'getCreated',
        'date_create' => 'getDateCreate',
        'deleted' => 'getDeleted',
        'description' => 'getDescription',
        'discoverable' => 'getDiscoverable',
        'domain' => 'getDomain',
        'email_domain' => 'getEmailDomain',
        'enterprise_id' => 'getEnterpriseId',
        'enterprise_name' => 'getEnterpriseName',
        'external_org_migrations' => 'getExternalOrgMigrations',
        'has_compliance_export' => 'getHasComplianceExport',
        'icon' => 'getIcon',
        'id' => 'getId',
        'is_assigned' => 'getIsAssigned',
        'is_enterprise' => 'getIsEnterprise',
        'is_over_storage_limit' => 'getIsOverStorageLimit',
        'limit_ts' => 'getLimitTs',
        'locale' => 'getLocale',
        'messages_count' => 'getMessagesCount',
        'msg_edit_window_mins' => 'getMsgEditWindowMins',
        'name' => 'getName',
        'over_integrations_limit' => 'getOverIntegrationsLimit',
        'over_storage_limit' => 'getOverStorageLimit',
        'pay_prod_cur' => 'getPayProdCur',
        'plan' => 'getPlan',
        'primary_owner' => 'getPrimaryOwner',
        'sso_provider' => 'getSsoProvider'
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

    public const PLAN_EMPTY = '';
    public const PLAN_STD = 'std';
    public const PLAN_PLUS = 'plus';
    public const PLAN_COMPLIANCE = 'compliance';
    public const PLAN_ENTERPRISE = 'enterprise';

    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getPlanAllowableValues()
    {
        return [
            self::PLAN_EMPTY,
            self::PLAN_STD,
            self::PLAN_PLUS,
            self::PLAN_COMPLIANCE,
            self::PLAN_ENTERPRISE,
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
        $this->setIfExists('archived', $data ?? [], null);
        $this->setIfExists('avatar_base_url', $data ?? [], null);
        $this->setIfExists('created', $data ?? [], null);
        $this->setIfExists('date_create', $data ?? [], null);
        $this->setIfExists('deleted', $data ?? [], null);
        $this->setIfExists('description', $data ?? [], null);
        $this->setIfExists('discoverable', $data ?? [], null);
        $this->setIfExists('domain', $data ?? [], null);
        $this->setIfExists('email_domain', $data ?? [], null);
        $this->setIfExists('enterprise_id', $data ?? [], null);
        $this->setIfExists('enterprise_name', $data ?? [], null);
        $this->setIfExists('external_org_migrations', $data ?? [], null);
        $this->setIfExists('has_compliance_export', $data ?? [], null);
        $this->setIfExists('icon', $data ?? [], null);
        $this->setIfExists('id', $data ?? [], null);
        $this->setIfExists('is_assigned', $data ?? [], null);
        $this->setIfExists('is_enterprise', $data ?? [], null);
        $this->setIfExists('is_over_storage_limit', $data ?? [], null);
        $this->setIfExists('limit_ts', $data ?? [], null);
        $this->setIfExists('locale', $data ?? [], null);
        $this->setIfExists('messages_count', $data ?? [], null);
        $this->setIfExists('msg_edit_window_mins', $data ?? [], null);
        $this->setIfExists('name', $data ?? [], null);
        $this->setIfExists('over_integrations_limit', $data ?? [], null);
        $this->setIfExists('over_storage_limit', $data ?? [], null);
        $this->setIfExists('pay_prod_cur', $data ?? [], null);
        $this->setIfExists('plan', $data ?? [], null);
        $this->setIfExists('primary_owner', $data ?? [], null);
        $this->setIfExists('sso_provider', $data ?? [], null);
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
        if ($this->container['email_domain'] === null) {
            $invalidProperties[] = "'email_domain' can't be null";
        }
        if (!is_null($this->container['enterprise_id']) && !preg_match("/^[E][A-Z0-9]{8,}$/", $this->container['enterprise_id'])) {
            $invalidProperties[] = "invalid value for 'enterprise_id', must be conform to the pattern /^[E][A-Z0-9]{8,}$/.";
        }

        if ($this->container['icon'] === null) {
            $invalidProperties[] = "'icon' can't be null";
        }
        if ($this->container['id'] === null) {
            $invalidProperties[] = "'id' can't be null";
        }
        if (!preg_match("/^[TE][A-Z0-9]{8,}$/", $this->container['id'])) {
            $invalidProperties[] = "invalid value for 'id', must be conform to the pattern /^[TE][A-Z0-9]{8,}$/.";
        }

        if ($this->container['name'] === null) {
            $invalidProperties[] = "'name' can't be null";
        }
        $allowedValues = $this->getPlanAllowableValues();
        if (!is_null($this->container['plan']) && !in_array($this->container['plan'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value '%s' for 'plan', must be one of '%s'",
                $this->container['plan'],
                implode("', '", $allowedValues)
            );
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
     * Gets archived
     *
     * @return bool|null
     */
    public function getArchived()
    {
        return $this->container['archived'];
    }

    /**
     * Sets archived
     *
     * @param bool|null $archived archived
     *
     * @return self
     */
    public function setArchived($archived)
    {

        if (is_null($archived)) {
            throw new \InvalidArgumentException('non-nullable archived cannot be null');
        }

        $this->container['archived'] = $archived;

        return $this;
    }

    /**
     * Gets avatar_base_url
     *
     * @return string|null
     */
    public function getAvatarBaseUrl()
    {
        return $this->container['avatar_base_url'];
    }

    /**
     * Sets avatar_base_url
     *
     * @param string|null $avatar_base_url avatar_base_url
     *
     * @return self
     */
    public function setAvatarBaseUrl($avatar_base_url)
    {

        if (is_null($avatar_base_url)) {
            throw new \InvalidArgumentException('non-nullable avatar_base_url cannot be null');
        }

        $this->container['avatar_base_url'] = $avatar_base_url;

        return $this;
    }

    /**
     * Gets created
     *
     * @return int|null
     */
    public function getCreated()
    {
        return $this->container['created'];
    }

    /**
     * Sets created
     *
     * @param int|null $created created
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
     * Gets date_create
     *
     * @return int|null
     */
    public function getDateCreate()
    {
        return $this->container['date_create'];
    }

    /**
     * Sets date_create
     *
     * @param int|null $date_create date_create
     *
     * @return self
     */
    public function setDateCreate($date_create)
    {

        if (is_null($date_create)) {
            throw new \InvalidArgumentException('non-nullable date_create cannot be null');
        }

        $this->container['date_create'] = $date_create;

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
     * Gets description
     *
     * @return string|null
     */
    public function getDescription()
    {
        return $this->container['description'];
    }

    /**
     * Sets description
     *
     * @param string|null $description description
     *
     * @return self
     */
    public function setDescription($description)
    {

        if (is_null($description)) {
            array_push($this->openAPINullablesSetToNull, 'description');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('description', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['description'] = $description;

        return $this;
    }

    /**
     * Gets discoverable
     *
     * @return \OpenAPI\Client\Model\ObjsTeamDiscoverableInner[]|null
     */
    public function getDiscoverable()
    {
        return $this->container['discoverable'];
    }

    /**
     * Sets discoverable
     *
     * @param \OpenAPI\Client\Model\ObjsTeamDiscoverableInner[]|null $discoverable discoverable
     *
     * @return self
     */
    public function setDiscoverable($discoverable)
    {

        if (is_null($discoverable)) {
            throw new \InvalidArgumentException('non-nullable discoverable cannot be null');
        }

        $this->container['discoverable'] = $discoverable;

        return $this;
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
     * Gets email_domain
     *
     * @return string
     */
    public function getEmailDomain()
    {
        return $this->container['email_domain'];
    }

    /**
     * Sets email_domain
     *
     * @param string $email_domain email_domain
     *
     * @return self
     */
    public function setEmailDomain($email_domain)
    {

        if (is_null($email_domain)) {
            throw new \InvalidArgumentException('non-nullable email_domain cannot be null');
        }

        $this->container['email_domain'] = $email_domain;

        return $this;
    }

    /**
     * Gets enterprise_id
     *
     * @return string|null
     */
    public function getEnterpriseId()
    {
        return $this->container['enterprise_id'];
    }

    /**
     * Sets enterprise_id
     *
     * @param string|null $enterprise_id enterprise_id
     *
     * @return self
     */
    public function setEnterpriseId($enterprise_id)
    {

        if (!is_null($enterprise_id) && (!preg_match("/^[E][A-Z0-9]{8,}$/", $enterprise_id))) {
            throw new \InvalidArgumentException("invalid value for \$enterprise_id when calling ObjsTeam., must conform to the pattern /^[E][A-Z0-9]{8,}$/.");
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
     * @return string|null
     */
    public function getEnterpriseName()
    {
        return $this->container['enterprise_name'];
    }

    /**
     * Sets enterprise_name
     *
     * @param string|null $enterprise_name enterprise_name
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
     * Gets external_org_migrations
     *
     * @return \OpenAPI\Client\Model\ObjsExternalOrgMigrations|null
     */
    public function getExternalOrgMigrations()
    {
        return $this->container['external_org_migrations'];
    }

    /**
     * Sets external_org_migrations
     *
     * @param \OpenAPI\Client\Model\ObjsExternalOrgMigrations|null $external_org_migrations external_org_migrations
     *
     * @return self
     */
    public function setExternalOrgMigrations($external_org_migrations)
    {

        if (is_null($external_org_migrations)) {
            throw new \InvalidArgumentException('non-nullable external_org_migrations cannot be null');
        }

        $this->container['external_org_migrations'] = $external_org_migrations;

        return $this;
    }

    /**
     * Gets has_compliance_export
     *
     * @return bool|null
     */
    public function getHasComplianceExport()
    {
        return $this->container['has_compliance_export'];
    }

    /**
     * Sets has_compliance_export
     *
     * @param bool|null $has_compliance_export has_compliance_export
     *
     * @return self
     */
    public function setHasComplianceExport($has_compliance_export)
    {

        if (is_null($has_compliance_export)) {
            throw new \InvalidArgumentException('non-nullable has_compliance_export cannot be null');
        }

        $this->container['has_compliance_export'] = $has_compliance_export;

        return $this;
    }

    /**
     * Gets icon
     *
     * @return \OpenAPI\Client\Model\ObjsIcon
     */
    public function getIcon()
    {
        return $this->container['icon'];
    }

    /**
     * Sets icon
     *
     * @param \OpenAPI\Client\Model\ObjsIcon $icon icon
     *
     * @return self
     */
    public function setIcon($icon)
    {

        if (is_null($icon)) {
            throw new \InvalidArgumentException('non-nullable icon cannot be null');
        }

        $this->container['icon'] = $icon;

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

        if ((!preg_match("/^[TE][A-Z0-9]{8,}$/", $id))) {
            throw new \InvalidArgumentException("invalid value for \$id when calling ObjsTeam., must conform to the pattern /^[TE][A-Z0-9]{8,}$/.");
        }


        if (is_null($id)) {
            throw new \InvalidArgumentException('non-nullable id cannot be null');
        }

        $this->container['id'] = $id;

        return $this;
    }

    /**
     * Gets is_assigned
     *
     * @return bool|null
     */
    public function getIsAssigned()
    {
        return $this->container['is_assigned'];
    }

    /**
     * Sets is_assigned
     *
     * @param bool|null $is_assigned is_assigned
     *
     * @return self
     */
    public function setIsAssigned($is_assigned)
    {

        if (is_null($is_assigned)) {
            throw new \InvalidArgumentException('non-nullable is_assigned cannot be null');
        }

        $this->container['is_assigned'] = $is_assigned;

        return $this;
    }

    /**
     * Gets is_enterprise
     *
     * @return int|null
     */
    public function getIsEnterprise()
    {
        return $this->container['is_enterprise'];
    }

    /**
     * Sets is_enterprise
     *
     * @param int|null $is_enterprise is_enterprise
     *
     * @return self
     */
    public function setIsEnterprise($is_enterprise)
    {

        if (is_null($is_enterprise)) {
            throw new \InvalidArgumentException('non-nullable is_enterprise cannot be null');
        }

        $this->container['is_enterprise'] = $is_enterprise;

        return $this;
    }

    /**
     * Gets is_over_storage_limit
     *
     * @return bool|null
     */
    public function getIsOverStorageLimit()
    {
        return $this->container['is_over_storage_limit'];
    }

    /**
     * Sets is_over_storage_limit
     *
     * @param bool|null $is_over_storage_limit is_over_storage_limit
     *
     * @return self
     */
    public function setIsOverStorageLimit($is_over_storage_limit)
    {

        if (is_null($is_over_storage_limit)) {
            throw new \InvalidArgumentException('non-nullable is_over_storage_limit cannot be null');
        }

        $this->container['is_over_storage_limit'] = $is_over_storage_limit;

        return $this;
    }

    /**
     * Gets limit_ts
     *
     * @return int|null
     */
    public function getLimitTs()
    {
        return $this->container['limit_ts'];
    }

    /**
     * Sets limit_ts
     *
     * @param int|null $limit_ts limit_ts
     *
     * @return self
     */
    public function setLimitTs($limit_ts)
    {

        if (is_null($limit_ts)) {
            throw new \InvalidArgumentException('non-nullable limit_ts cannot be null');
        }

        $this->container['limit_ts'] = $limit_ts;

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
     * Gets messages_count
     *
     * @return int|null
     */
    public function getMessagesCount()
    {
        return $this->container['messages_count'];
    }

    /**
     * Sets messages_count
     *
     * @param int|null $messages_count messages_count
     *
     * @return self
     */
    public function setMessagesCount($messages_count)
    {

        if (is_null($messages_count)) {
            throw new \InvalidArgumentException('non-nullable messages_count cannot be null');
        }

        $this->container['messages_count'] = $messages_count;

        return $this;
    }

    /**
     * Gets msg_edit_window_mins
     *
     * @return int|null
     */
    public function getMsgEditWindowMins()
    {
        return $this->container['msg_edit_window_mins'];
    }

    /**
     * Sets msg_edit_window_mins
     *
     * @param int|null $msg_edit_window_mins msg_edit_window_mins
     *
     * @return self
     */
    public function setMsgEditWindowMins($msg_edit_window_mins)
    {

        if (is_null($msg_edit_window_mins)) {
            throw new \InvalidArgumentException('non-nullable msg_edit_window_mins cannot be null');
        }

        $this->container['msg_edit_window_mins'] = $msg_edit_window_mins;

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
     * Gets over_integrations_limit
     *
     * @return bool|null
     */
    public function getOverIntegrationsLimit()
    {
        return $this->container['over_integrations_limit'];
    }

    /**
     * Sets over_integrations_limit
     *
     * @param bool|null $over_integrations_limit over_integrations_limit
     *
     * @return self
     */
    public function setOverIntegrationsLimit($over_integrations_limit)
    {

        if (is_null($over_integrations_limit)) {
            throw new \InvalidArgumentException('non-nullable over_integrations_limit cannot be null');
        }

        $this->container['over_integrations_limit'] = $over_integrations_limit;

        return $this;
    }

    /**
     * Gets over_storage_limit
     *
     * @return bool|null
     */
    public function getOverStorageLimit()
    {
        return $this->container['over_storage_limit'];
    }

    /**
     * Sets over_storage_limit
     *
     * @param bool|null $over_storage_limit over_storage_limit
     *
     * @return self
     */
    public function setOverStorageLimit($over_storage_limit)
    {

        if (is_null($over_storage_limit)) {
            throw new \InvalidArgumentException('non-nullable over_storage_limit cannot be null');
        }

        $this->container['over_storage_limit'] = $over_storage_limit;

        return $this;
    }

    /**
     * Gets pay_prod_cur
     *
     * @return string|null
     */
    public function getPayProdCur()
    {
        return $this->container['pay_prod_cur'];
    }

    /**
     * Sets pay_prod_cur
     *
     * @param string|null $pay_prod_cur pay_prod_cur
     *
     * @return self
     */
    public function setPayProdCur($pay_prod_cur)
    {

        if (is_null($pay_prod_cur)) {
            throw new \InvalidArgumentException('non-nullable pay_prod_cur cannot be null');
        }

        $this->container['pay_prod_cur'] = $pay_prod_cur;

        return $this;
    }

    /**
     * Gets plan
     *
     * @return string|null
     */
    public function getPlan()
    {
        return $this->container['plan'];
    }

    /**
     * Sets plan
     *
     * @param string|null $plan plan
     *
     * @return self
     */
    public function setPlan($plan)
    {
        $allowedValues = $this->getPlanAllowableValues();
        if (!is_null($plan) && !in_array($plan, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value '%s' for 'plan', must be one of '%s'",
                    $plan,
                    implode("', '", $allowedValues)
                )
            );
        }

        if (is_null($plan)) {
            throw new \InvalidArgumentException('non-nullable plan cannot be null');
        }

        $this->container['plan'] = $plan;

        return $this;
    }

    /**
     * Gets primary_owner
     *
     * @return \OpenAPI\Client\Model\ObjsPrimaryOwner|null
     */
    public function getPrimaryOwner()
    {
        return $this->container['primary_owner'];
    }

    /**
     * Sets primary_owner
     *
     * @param \OpenAPI\Client\Model\ObjsPrimaryOwner|null $primary_owner primary_owner
     *
     * @return self
     */
    public function setPrimaryOwner($primary_owner)
    {

        if (is_null($primary_owner)) {
            throw new \InvalidArgumentException('non-nullable primary_owner cannot be null');
        }

        $this->container['primary_owner'] = $primary_owner;

        return $this;
    }

    /**
     * Gets sso_provider
     *
     * @return \OpenAPI\Client\Model\ObjsTeamSsoProvider|null
     */
    public function getSsoProvider()
    {
        return $this->container['sso_provider'];
    }

    /**
     * Sets sso_provider
     *
     * @param \OpenAPI\Client\Model\ObjsTeamSsoProvider|null $sso_provider sso_provider
     *
     * @return self
     */
    public function setSsoProvider($sso_provider)
    {

        if (is_null($sso_provider)) {
            throw new \InvalidArgumentException('non-nullable sso_provider cannot be null');
        }

        $this->container['sso_provider'] = $sso_provider;

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

