<?php
/**
 * PlayerCreationPayload
 *
 * PHP version 7.4
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * api.video
 *
 * api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.
 *
 * The version of the OpenAPI document: 1.0.1
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
 * PlayerCreationPayload Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class PlayerCreationPayload implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'playerCreationPayload';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'background_bottom' => 'string',
        'background_text' => 'string',
        'background_top' => 'string',
        'enable_api' => 'bool',
        'enable_controls' => 'bool',
        'force_autoplay' => 'bool',
        'force_loop' => 'bool',
        'hide_title' => 'bool',
        'link' => 'string',
        'link_hover' => 'string',
        'text' => 'string',
        'track_background' => 'string',
        'track_played' => 'string',
        'track_unplayed' => 'string'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'background_bottom' => null,
        'background_text' => null,
        'background_top' => null,
        'enable_api' => null,
        'enable_controls' => null,
        'force_autoplay' => null,
        'force_loop' => null,
        'hide_title' => null,
        'link' => null,
        'link_hover' => null,
        'text' => null,
        'track_background' => null,
        'track_played' => null,
        'track_unplayed' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'background_bottom' => false,
		'background_text' => false,
		'background_top' => false,
		'enable_api' => false,
		'enable_controls' => false,
		'force_autoplay' => false,
		'force_loop' => false,
		'hide_title' => false,
		'link' => false,
		'link_hover' => false,
		'text' => false,
		'track_background' => false,
		'track_played' => false,
		'track_unplayed' => false
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
        'background_bottom' => 'backgroundBottom',
        'background_text' => 'backgroundText',
        'background_top' => 'backgroundTop',
        'enable_api' => 'enableApi',
        'enable_controls' => 'enableControls',
        'force_autoplay' => 'forceAutoplay',
        'force_loop' => 'forceLoop',
        'hide_title' => 'hideTitle',
        'link' => 'link',
        'link_hover' => 'linkHover',
        'text' => 'text',
        'track_background' => 'trackBackground',
        'track_played' => 'trackPlayed',
        'track_unplayed' => 'trackUnplayed'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'background_bottom' => 'setBackgroundBottom',
        'background_text' => 'setBackgroundText',
        'background_top' => 'setBackgroundTop',
        'enable_api' => 'setEnableApi',
        'enable_controls' => 'setEnableControls',
        'force_autoplay' => 'setForceAutoplay',
        'force_loop' => 'setForceLoop',
        'hide_title' => 'setHideTitle',
        'link' => 'setLink',
        'link_hover' => 'setLinkHover',
        'text' => 'setText',
        'track_background' => 'setTrackBackground',
        'track_played' => 'setTrackPlayed',
        'track_unplayed' => 'setTrackUnplayed'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'background_bottom' => 'getBackgroundBottom',
        'background_text' => 'getBackgroundText',
        'background_top' => 'getBackgroundTop',
        'enable_api' => 'getEnableApi',
        'enable_controls' => 'getEnableControls',
        'force_autoplay' => 'getForceAutoplay',
        'force_loop' => 'getForceLoop',
        'hide_title' => 'getHideTitle',
        'link' => 'getLink',
        'link_hover' => 'getLinkHover',
        'text' => 'getText',
        'track_background' => 'getTrackBackground',
        'track_played' => 'getTrackPlayed',
        'track_unplayed' => 'getTrackUnplayed'
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
        $this->setIfExists('background_bottom', $data ?? [], null);
        $this->setIfExists('background_text', $data ?? [], null);
        $this->setIfExists('background_top', $data ?? [], null);
        $this->setIfExists('enable_api', $data ?? [], true);
        $this->setIfExists('enable_controls', $data ?? [], true);
        $this->setIfExists('force_autoplay', $data ?? [], false);
        $this->setIfExists('force_loop', $data ?? [], false);
        $this->setIfExists('hide_title', $data ?? [], false);
        $this->setIfExists('link', $data ?? [], null);
        $this->setIfExists('link_hover', $data ?? [], null);
        $this->setIfExists('text', $data ?? [], null);
        $this->setIfExists('track_background', $data ?? [], null);
        $this->setIfExists('track_played', $data ?? [], null);
        $this->setIfExists('track_unplayed', $data ?? [], null);
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
     * Gets background_bottom
     *
     * @return string|null
     */
    public function getBackgroundBottom()
    {
        return $this->container['background_bottom'];
    }

    /**
     * Sets background_bottom
     *
     * @param string|null $background_bottom RGBA color: bottom 50% of background. Default: rgba(0, 0, 0, .7)
     *
     * @return self
     */
    public function setBackgroundBottom($background_bottom)
    {

        if (is_null($background_bottom)) {
            throw new \InvalidArgumentException('non-nullable background_bottom cannot be null');
        }

        $this->container['background_bottom'] = $background_bottom;

        return $this;
    }

    /**
     * Gets background_text
     *
     * @return string|null
     */
    public function getBackgroundText()
    {
        return $this->container['background_text'];
    }

    /**
     * Sets background_text
     *
     * @param string|null $background_text RGBA color for title text. Default: rgba(255, 255, 255, 1)
     *
     * @return self
     */
    public function setBackgroundText($background_text)
    {

        if (is_null($background_text)) {
            throw new \InvalidArgumentException('non-nullable background_text cannot be null');
        }

        $this->container['background_text'] = $background_text;

        return $this;
    }

    /**
     * Gets background_top
     *
     * @return string|null
     */
    public function getBackgroundTop()
    {
        return $this->container['background_top'];
    }

    /**
     * Sets background_top
     *
     * @param string|null $background_top RGBA color: top 50% of background. Default: rgba(0, 0, 0, .7)
     *
     * @return self
     */
    public function setBackgroundTop($background_top)
    {

        if (is_null($background_top)) {
            throw new \InvalidArgumentException('non-nullable background_top cannot be null');
        }

        $this->container['background_top'] = $background_top;

        return $this;
    }

    /**
     * Gets enable_api
     *
     * @return bool|null
     */
    public function getEnableApi()
    {
        return $this->container['enable_api'];
    }

    /**
     * Sets enable_api
     *
     * @param bool|null $enable_api enable/disable player SDK access. Default: true
     *
     * @return self
     */
    public function setEnableApi($enable_api)
    {

        if (is_null($enable_api)) {
            throw new \InvalidArgumentException('non-nullable enable_api cannot be null');
        }

        $this->container['enable_api'] = $enable_api;

        return $this;
    }

    /**
     * Gets enable_controls
     *
     * @return bool|null
     */
    public function getEnableControls()
    {
        return $this->container['enable_controls'];
    }

    /**
     * Sets enable_controls
     *
     * @param bool|null $enable_controls enable/disable player controls. Default: true
     *
     * @return self
     */
    public function setEnableControls($enable_controls)
    {

        if (is_null($enable_controls)) {
            throw new \InvalidArgumentException('non-nullable enable_controls cannot be null');
        }

        $this->container['enable_controls'] = $enable_controls;

        return $this;
    }

    /**
     * Gets force_autoplay
     *
     * @return bool|null
     */
    public function getForceAutoplay()
    {
        return $this->container['force_autoplay'];
    }

    /**
     * Sets force_autoplay
     *
     * @param bool|null $force_autoplay enable/disable player autoplay. Default: false
     *
     * @return self
     */
    public function setForceAutoplay($force_autoplay)
    {

        if (is_null($force_autoplay)) {
            throw new \InvalidArgumentException('non-nullable force_autoplay cannot be null');
        }

        $this->container['force_autoplay'] = $force_autoplay;

        return $this;
    }

    /**
     * Gets force_loop
     *
     * @return bool|null
     */
    public function getForceLoop()
    {
        return $this->container['force_loop'];
    }

    /**
     * Sets force_loop
     *
     * @param bool|null $force_loop enable/disable looping. Default: false
     *
     * @return self
     */
    public function setForceLoop($force_loop)
    {

        if (is_null($force_loop)) {
            throw new \InvalidArgumentException('non-nullable force_loop cannot be null');
        }

        $this->container['force_loop'] = $force_loop;

        return $this;
    }

    /**
     * Gets hide_title
     *
     * @return bool|null
     */
    public function getHideTitle()
    {
        return $this->container['hide_title'];
    }

    /**
     * Sets hide_title
     *
     * @param bool|null $hide_title enable/disable title. Default: false
     *
     * @return self
     */
    public function setHideTitle($hide_title)
    {

        if (is_null($hide_title)) {
            throw new \InvalidArgumentException('non-nullable hide_title cannot be null');
        }

        $this->container['hide_title'] = $hide_title;

        return $this;
    }

    /**
     * Gets link
     *
     * @return string|null
     */
    public function getLink()
    {
        return $this->container['link'];
    }

    /**
     * Sets link
     *
     * @param string|null $link RGBA color for all controls. Default: rgba(255, 255, 255, 1)
     *
     * @return self
     */
    public function setLink($link)
    {

        if (is_null($link)) {
            throw new \InvalidArgumentException('non-nullable link cannot be null');
        }

        $this->container['link'] = $link;

        return $this;
    }

    /**
     * Gets link_hover
     *
     * @return string|null
     */
    public function getLinkHover()
    {
        return $this->container['link_hover'];
    }

    /**
     * Sets link_hover
     *
     * @param string|null $link_hover RGBA color for all controls when hovered. Default: rgba(255, 255, 255, 1)
     *
     * @return self
     */
    public function setLinkHover($link_hover)
    {

        if (is_null($link_hover)) {
            throw new \InvalidArgumentException('non-nullable link_hover cannot be null');
        }

        $this->container['link_hover'] = $link_hover;

        return $this;
    }

    /**
     * Gets text
     *
     * @return string|null
     */
    public function getText()
    {
        return $this->container['text'];
    }

    /**
     * Sets text
     *
     * @param string|null $text RGBA color for timer text. Default: rgba(255, 255, 255, 1)
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
     * Gets track_background
     *
     * @return string|null
     */
    public function getTrackBackground()
    {
        return $this->container['track_background'];
    }

    /**
     * Sets track_background
     *
     * @param string|null $track_background RGBA color playback bar: background. Default: rgba(255, 255, 255, .2)
     *
     * @return self
     */
    public function setTrackBackground($track_background)
    {

        if (is_null($track_background)) {
            throw new \InvalidArgumentException('non-nullable track_background cannot be null');
        }

        $this->container['track_background'] = $track_background;

        return $this;
    }

    /**
     * Gets track_played
     *
     * @return string|null
     */
    public function getTrackPlayed()
    {
        return $this->container['track_played'];
    }

    /**
     * Sets track_played
     *
     * @param string|null $track_played RGBA color playback bar: played content. Default: rgba(88, 131, 255, .95)
     *
     * @return self
     */
    public function setTrackPlayed($track_played)
    {

        if (is_null($track_played)) {
            throw new \InvalidArgumentException('non-nullable track_played cannot be null');
        }

        $this->container['track_played'] = $track_played;

        return $this;
    }

    /**
     * Gets track_unplayed
     *
     * @return string|null
     */
    public function getTrackUnplayed()
    {
        return $this->container['track_unplayed'];
    }

    /**
     * Sets track_unplayed
     *
     * @param string|null $track_unplayed RGBA color playback bar: downloaded but unplayed (buffered) content. Default: rgba(255, 255, 255, .35)
     *
     * @return self
     */
    public function setTrackUnplayed($track_unplayed)
    {

        if (is_null($track_unplayed)) {
            throw new \InvalidArgumentException('non-nullable track_unplayed cannot be null');
        }

        $this->container['track_unplayed'] = $track_unplayed;

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


