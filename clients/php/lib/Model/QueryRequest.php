<?php

namespace LowdownLabs\Fever\Model;

use \ArrayAccess;
use \LowdownLabs\Fever\ObjectSerializer;

class QueryRequest implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    protected static $openAPIModelName = 'QueryRequest';

    protected static $openAPITypes = [
        'row_limit' => 'int',
        'sql' => 'string'
    ];

    protected static $openAPIFormats = [
        'row_limit' => null,
        'sql' => null
    ];

    protected static array $openAPINullables = [
        'row_limit' => false,
        'sql' => false
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
        'row_limit' => 'row_limit',
        'sql' => 'sql'
    ];

    protected static $setters = [
        'row_limit' => 'setRowLimit',
        'sql' => 'setSql'
    ];

    protected static $getters = [
        'row_limit' => 'getRowLimit',
        'sql' => 'getSql'
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
        $this->setIfExists('row_limit', $data ?? [], 200);
        $this->setIfExists('sql', $data ?? [], null);
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

        if (!is_null($this->container['row_limit']) && ($this->container['row_limit'] > 1000)) {
            $invalidProperties[] = "invalid value for 'row_limit', must be smaller than or equal to 1000.";
        }

        if (!is_null($this->container['row_limit']) && ($this->container['row_limit'] < 1)) {
            $invalidProperties[] = "invalid value for 'row_limit', must be bigger than or equal to 1.";
        }

        if ($this->container['sql'] === null) {
            $invalidProperties[] = "'sql' can't be null";
        }
        return $invalidProperties;
    }

    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }

    public function getRowLimit()
    {
        return $this->container['row_limit'];
    }

    public function setRowLimit($row_limit)
    {
        if (is_null($row_limit)) {
            throw new \InvalidArgumentException('non-nullable row_limit cannot be null');
        }
        if (($row_limit > 1000)) {
            throw new \InvalidArgumentException('invalid value for $row_limit when calling QueryRequest., must be smaller than or equal to 1000.');
        }
        if (($row_limit < 1)) {
            throw new \InvalidArgumentException('invalid value for $row_limit when calling QueryRequest., must be bigger than or equal to 1.');
        }

        $this->container['row_limit'] = $row_limit;

        return $this;
    }

    public function getSql()
    {
        return $this->container['sql'];
    }

    public function setSql($sql)
    {
        if (is_null($sql)) {
            throw new \InvalidArgumentException('non-nullable sql cannot be null');
        }
        $this->container['sql'] = $sql;

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

