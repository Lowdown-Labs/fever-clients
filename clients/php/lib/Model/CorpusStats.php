<?php

namespace LowdownLabs\Fever\Model;

use \ArrayAccess;
use \LowdownLabs\Fever\ObjectSerializer;

class CorpusStats implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    protected static $openAPIModelName = 'CorpusStats';

    protected static $openAPITypes = [
        'kinds' => 'array<string,int>',
        'top_tags' => '\LowdownLabs\Fever\Model\CorpusTag[]'
    ];

    protected static $openAPIFormats = [
        'kinds' => null,
        'top_tags' => null
    ];

    protected static array $openAPINullables = [
        'kinds' => false,
        'top_tags' => false
    ];

    protected array $openAPINullablesSetToNull = [];

    public static function openAPITypes()
    {
        return self::$openAPITypes;
    }

    public static function openAPIFormats()
    {
        return self::$openAPIFormats;
    }

    protected static function openAPINullables(): array
    {
        return self::$openAPINullables;
    }

    private function getOpenAPINullablesSetToNull(): array
    {
        return $this->openAPINullablesSetToNull;
    }

    private function setOpenAPINullablesSetToNull(array $openAPINullablesSetToNull): void
    {
        $this->openAPINullablesSetToNull = $openAPINullablesSetToNull;
    }

    public static function isNullable(string $property): bool
    {
        return self::openAPINullables()[$property] ?? false;
    }

    public function isNullableSetToNull(string $property): bool
    {
        return in_array($property, $this->getOpenAPINullablesSetToNull(), true);
    }

    protected static $attributeMap = [
        'kinds' => 'kinds',
        'top_tags' => 'top_tags'
    ];

    protected static $setters = [
        'kinds' => 'setKinds',
        'top_tags' => 'setTopTags'
    ];

    protected static $getters = [
        'kinds' => 'getKinds',
        'top_tags' => 'getTopTags'
    ];

    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    public static function setters()
    {
        return self::$setters;
    }

    public static function getters()
    {
        return self::$getters;
    }

    public function getModelName()
    {
        return self::$openAPIModelName;
    }

    protected $container = [];

    public function __construct(?array $data = null)
    {
        $this->setIfExists('kinds', $data ?? [], null);
        $this->setIfExists('top_tags', $data ?? [], null);
    }

    private function setIfExists(string $variableName, array $fields, $defaultValue): void
    {
        if (self::isNullable($variableName) && array_key_exists($variableName, $fields) && is_null($fields[$variableName])) {
            $this->openAPINullablesSetToNull[] = $variableName;
        }

        $this->container[$variableName] = $fields[$variableName] ?? $defaultValue;
    }

    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if ($this->container['kinds'] === null) {
            $invalidProperties[] = "'kinds' can't be null";
        }
        if ($this->container['top_tags'] === null) {
            $invalidProperties[] = "'top_tags' can't be null";
        }
        return $invalidProperties;
    }

    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }

    public function getKinds()
    {
        return $this->container['kinds'];
    }

    public function setKinds($kinds)
    {
        if (is_null($kinds)) {
            throw new \InvalidArgumentException('non-nullable kinds cannot be null');
        }
        $this->container['kinds'] = $kinds;

        return $this;
    }

    public function getTopTags()
    {
        return $this->container['top_tags'];
    }

    public function setTopTags($top_tags)
    {
        if (is_null($top_tags)) {
            throw new \InvalidArgumentException('non-nullable top_tags cannot be null');
        }
        $this->container['top_tags'] = $top_tags;

        return $this;
    }

    public function offsetExists(mixed $offset): bool
    {
        return isset($this->container[$offset]);
    }

    #[\ReturnTypeWillChange]
    public function offsetGet(mixed $offset)
    {
        return $this->container[$offset] ?? null;
    }

    public function offsetSet($offset, $value): void
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    public function offsetUnset(mixed $offset): void
    {
        unset($this->container[$offset]);
    }

    #[\ReturnTypeWillChange]
    public function jsonSerialize()
    {
       return ObjectSerializer::sanitizeForSerialization($this);
    }

    public function __toString()
    {
        return json_encode(
            ObjectSerializer::sanitizeForSerialization($this),
            JSON_PRETTY_PRINT
        );
    }

    public function toHeaderValue()
    {
        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}

