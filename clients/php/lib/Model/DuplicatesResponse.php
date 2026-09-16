<?php

namespace LowdownLabs\Fever\Model;

use \ArrayAccess;
use \LowdownLabs\Fever\ObjectSerializer;

class DuplicatesResponse implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    protected static $openAPIModelName = 'DuplicatesResponse';

    protected static $openAPITypes = [
        'clusters' => 'int',
        'duplicate_clusters' => '\LowdownLabs\Fever\Model\DuplicateCluster[]',
        'total_duplicates' => 'int'
    ];

    protected static $openAPIFormats = [
        'clusters' => null,
        'duplicate_clusters' => null,
        'total_duplicates' => null
    ];

    protected static array $openAPINullables = [
        'clusters' => false,
        'duplicate_clusters' => false,
        'total_duplicates' => false
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
        'clusters' => 'clusters',
        'duplicate_clusters' => 'duplicate_clusters',
        'total_duplicates' => 'total_duplicates'
    ];

    protected static $setters = [
        'clusters' => 'setClusters',
        'duplicate_clusters' => 'setDuplicateClusters',
        'total_duplicates' => 'setTotalDuplicates'
    ];

    protected static $getters = [
        'clusters' => 'getClusters',
        'duplicate_clusters' => 'getDuplicateClusters',
        'total_duplicates' => 'getTotalDuplicates'
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
        $this->setIfExists('clusters', $data ?? [], null);
        $this->setIfExists('duplicate_clusters', $data ?? [], null);
        $this->setIfExists('total_duplicates', $data ?? [], null);
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

        if ($this->container['clusters'] === null) {
            $invalidProperties[] = "'clusters' can't be null";
        }
        if ($this->container['total_duplicates'] === null) {
            $invalidProperties[] = "'total_duplicates' can't be null";
        }
        return $invalidProperties;
    }

    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }

    public function getClusters()
    {
        return $this->container['clusters'];
    }

    public function setClusters($clusters)
    {
        if (is_null($clusters)) {
            throw new \InvalidArgumentException('non-nullable clusters cannot be null');
        }
        $this->container['clusters'] = $clusters;

        return $this;
    }

    public function getDuplicateClusters()
    {
        return $this->container['duplicate_clusters'];
    }

    public function setDuplicateClusters($duplicate_clusters)
    {
        if (is_null($duplicate_clusters)) {
            throw new \InvalidArgumentException('non-nullable duplicate_clusters cannot be null');
        }
        $this->container['duplicate_clusters'] = $duplicate_clusters;

        return $this;
    }

    public function getTotalDuplicates()
    {
        return $this->container['total_duplicates'];
    }

    public function setTotalDuplicates($total_duplicates)
    {
        if (is_null($total_duplicates)) {
            throw new \InvalidArgumentException('non-nullable total_duplicates cannot be null');
        }
        $this->container['total_duplicates'] = $total_duplicates;

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

