<?php

namespace LowdownLabs\Fever\Model;

use \ArrayAccess;
use \LowdownLabs\Fever\ObjectSerializer;

class QueryResult implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    protected static $openAPIModelName = 'QueryResult';

    protected static $openAPITypes = [
        'columns' => 'string[]',
        'rows' => 'mixed[][]',
        'truncated' => 'bool'
    ];

    protected static $openAPIFormats = [
        'columns' => null,
        'rows' => null,
        'truncated' => null
    ];

    protected static array $openAPINullables = [
        'columns' => false,
        'rows' => false,
        'truncated' => false
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
        'columns' => 'columns',
        'rows' => 'rows',
        'truncated' => 'truncated'
    ];

    protected static $setters = [
        'columns' => 'setColumns',
        'rows' => 'setRows',
        'truncated' => 'setTruncated'
    ];

    protected static $getters = [
        'columns' => 'getColumns',
        'rows' => 'getRows',
        'truncated' => 'getTruncated'
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
        $this->setIfExists('columns', $data ?? [], null);
        $this->setIfExists('rows', $data ?? [], null);
        $this->setIfExists('truncated', $data ?? [], null);
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

        if ($this->container['columns'] === null) {
            $invalidProperties[] = "'columns' can't be null";
        }
        if ($this->container['rows'] === null) {
            $invalidProperties[] = "'rows' can't be null";
        }
        if ($this->container['truncated'] === null) {
            $invalidProperties[] = "'truncated' can't be null";
        }
        return $invalidProperties;
    }

    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }

    public function getColumns()
    {
        return $this->container['columns'];
    }

    public function setColumns($columns)
    {
        if (is_null($columns)) {
            throw new \InvalidArgumentException('non-nullable columns cannot be null');
        }
        $this->container['columns'] = $columns;

        return $this;
    }

    public function getRows()
    {
        return $this->container['rows'];
    }

    public function setRows($rows)
    {
        if (is_null($rows)) {
            throw new \InvalidArgumentException('non-nullable rows cannot be null');
        }
        $this->container['rows'] = $rows;

        return $this;
    }

    public function getTruncated()
    {
        return $this->container['truncated'];
    }

    public function setTruncated($truncated)
    {
        if (is_null($truncated)) {
            throw new \InvalidArgumentException('non-nullable truncated cannot be null');
        }
        $this->container['truncated'] = $truncated;

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

