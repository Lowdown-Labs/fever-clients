<?php

namespace LowdownLabs\Fever\Model;

use \ArrayAccess;
use \LowdownLabs\Fever\ObjectSerializer;

class IngestSource implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    protected static $openAPIModelName = 'IngestSource';

    protected static $openAPITypes = [
        'customer_id' => 'string',
        's3_uri' => 'string',
        'target_res' => 'int'
    ];

    protected static $openAPIFormats = [
        'customer_id' => null,
        's3_uri' => null,
        'target_res' => null
    ];

    protected static array $openAPINullables = [
        'customer_id' => true,
        's3_uri' => false,
        'target_res' => true
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
        's3_uri' => 's3_uri',
        'target_res' => 'target_res'
    ];

    protected static $setters = [
        'customer_id' => 'setCustomerId',
        's3_uri' => 'setS3Uri',
        'target_res' => 'setTargetRes'
    ];

    protected static $getters = [
        'customer_id' => 'getCustomerId',
        's3_uri' => 'getS3Uri',
        'target_res' => 'getTargetRes'
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
        $this->setIfExists('s3_uri', $data ?? [], null);
        $this->setIfExists('target_res', $data ?? [], null);
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

        if ($this->container['s3_uri'] === null) {
            $invalidProperties[] = "'s3_uri' can't be null";
        }
        if (!is_null($this->container['target_res']) && ($this->container['target_res'] > 4096)) {
            $invalidProperties[] = "invalid value for 'target_res', must be smaller than or equal to 4096.";
        }

        if (!is_null($this->container['target_res']) && ($this->container['target_res'] < 64)) {
            $invalidProperties[] = "invalid value for 'target_res', must be bigger than or equal to 64.";
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

    public function getTargetRes()
    {
        return $this->container['target_res'];
    }

    public function setTargetRes($target_res)
    {
        if (is_null($target_res)) {
            array_push($this->openAPINullablesSetToNull, 'target_res');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('target_res', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        if (!is_null($target_res) && ($target_res > 4096)) {
            throw new \InvalidArgumentException('invalid value for $target_res when calling IngestSource., must be smaller than or equal to 4096.');
        }
        if (!is_null($target_res) && ($target_res < 64)) {
            throw new \InvalidArgumentException('invalid value for $target_res when calling IngestSource., must be bigger than or equal to 64.');
        }

        $this->container['target_res'] = $target_res;

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

