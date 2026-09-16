<?php

namespace LowdownLabs\Fever\Model;

use \ArrayAccess;
use \LowdownLabs\Fever\ObjectSerializer;

class DuplicatesRequest implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    protected static $openAPIModelName = 'DuplicatesRequest';

    protected static $openAPITypes = [
        'customer_id' => 'string',
        'customer_ids' => 'string[]',
        'limit' => 'int',
        'threshold' => 'float'
    ];

    protected static $openAPIFormats = [
        'customer_id' => null,
        'customer_ids' => null,
        'limit' => null,
        'threshold' => null
    ];

    protected static array $openAPINullables = [
        'customer_id' => true,
        'customer_ids' => true,
        'limit' => false,
        'threshold' => false
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
        'customer_id' => 'customer_id',
        'customer_ids' => 'customer_ids',
        'limit' => 'limit',
        'threshold' => 'threshold'
    ];

    protected static $setters = [
        'customer_id' => 'setCustomerId',
        'customer_ids' => 'setCustomerIds',
        'limit' => 'setLimit',
        'threshold' => 'setThreshold'
    ];

    protected static $getters = [
        'customer_id' => 'getCustomerId',
        'customer_ids' => 'getCustomerIds',
        'limit' => 'getLimit',
        'threshold' => 'getThreshold'
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
        $this->setIfExists('customer_id', $data ?? [], null);
        $this->setIfExists('customer_ids', $data ?? [], null);
        $this->setIfExists('limit', $data ?? [], 500);
        $this->setIfExists('threshold', $data ?? [], 0.92);
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

        if (!is_null($this->container['limit']) && ($this->container['limit'] > 5000)) {
            $invalidProperties[] = "invalid value for 'limit', must be smaller than or equal to 5000.";
        }

        if (!is_null($this->container['limit']) && ($this->container['limit'] < 1)) {
            $invalidProperties[] = "invalid value for 'limit', must be bigger than or equal to 1.";
        }

        if (!is_null($this->container['threshold']) && ($this->container['threshold'] > 1.0)) {
            $invalidProperties[] = "invalid value for 'threshold', must be smaller than or equal to 1.0.";
        }

        if (!is_null($this->container['threshold']) && ($this->container['threshold'] < 0.0)) {
            $invalidProperties[] = "invalid value for 'threshold', must be bigger than or equal to 0.0.";
        }

        return $invalidProperties;
    }

    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }

    public function getCustomerId()
    {
        return $this->container['customer_id'];
    }

    public function setCustomerId($customer_id)
    {
        if (is_null($customer_id)) {
            array_push($this->openAPINullablesSetToNull, 'customer_id');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('customer_id', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['customer_id'] = $customer_id;

        return $this;
    }

    public function getCustomerIds()
    {
        return $this->container['customer_ids'];
    }

    public function setCustomerIds($customer_ids)
    {
        if (is_null($customer_ids)) {
            array_push($this->openAPINullablesSetToNull, 'customer_ids');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('customer_ids', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['customer_ids'] = $customer_ids;

        return $this;
    }

    public function getLimit()
    {
        return $this->container['limit'];
    }

    public function setLimit($limit)
    {
        if (is_null($limit)) {
            throw new \InvalidArgumentException('non-nullable limit cannot be null');
        }
        if (($limit > 5000)) {
            throw new \InvalidArgumentException('invalid value for $limit when calling DuplicatesRequest., must be smaller than or equal to 5000.');
        }
        if (($limit < 1)) {
            throw new \InvalidArgumentException('invalid value for $limit when calling DuplicatesRequest., must be bigger than or equal to 1.');
        }

        $this->container['limit'] = $limit;

        return $this;
    }

    public function getThreshold()
    {
        return $this->container['threshold'];
    }

    public function setThreshold($threshold)
    {
        if (is_null($threshold)) {
            throw new \InvalidArgumentException('non-nullable threshold cannot be null');
        }
        if (($threshold > 1.0)) {
            throw new \InvalidArgumentException('invalid value for $threshold when calling DuplicatesRequest., must be smaller than or equal to 1.0.');
        }
        if (($threshold < 0.0)) {
            throw new \InvalidArgumentException('invalid value for $threshold when calling DuplicatesRequest., must be bigger than or equal to 0.0.');
        }

        $this->container['threshold'] = $threshold;

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

