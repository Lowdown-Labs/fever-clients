<?php

namespace LowdownLabs\Fever\Model;

use \ArrayAccess;
use \LowdownLabs\Fever\ObjectSerializer;

class ImportResult implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    protected static $openAPIModelName = 'ImportResult';

    protected static $openAPITypes = [
        'imported' => 'int',
        's3_uri' => 'string'
    ];

    protected static $openAPIFormats = [
        'imported' => null,
        's3_uri' => null
    ];

    protected static array $openAPINullables = [
        'imported' => false,
        's3_uri' => false
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
        'imported' => 'imported',
        's3_uri' => 's3_uri'
    ];

    protected static $setters = [
        'imported' => 'setImported',
        's3_uri' => 'setS3Uri'
    ];

    protected static $getters = [
        'imported' => 'getImported',
        's3_uri' => 'getS3Uri'
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
        $this->setIfExists('imported', $data ?? [], null);
        $this->setIfExists('s3_uri', $data ?? [], null);
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

        if ($this->container['imported'] === null) {
            $invalidProperties[] = "'imported' can't be null";
        }
        if ($this->container['s3_uri'] === null) {
            $invalidProperties[] = "'s3_uri' can't be null";
        }
        return $invalidProperties;
    }

    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }

    public function getImported()
    {
        return $this->container['imported'];
    }

    public function setImported($imported)
    {
        if (is_null($imported)) {
            throw new \InvalidArgumentException('non-nullable imported cannot be null');
        }
        $this->container['imported'] = $imported;

        return $this;
    }

    public function getS3Uri()
    {
        return $this->container['s3_uri'];
    }

    public function setS3Uri($s3_uri)
    {
        if (is_null($s3_uri)) {
            throw new \InvalidArgumentException('non-nullable s3_uri cannot be null');
        }
        $this->container['s3_uri'] = $s3_uri;

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

