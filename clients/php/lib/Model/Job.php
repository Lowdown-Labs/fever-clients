<?php

namespace LowdownLabs\Fever\Model;

use \ArrayAccess;
use \LowdownLabs\Fever\ObjectSerializer;

class Job implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    protected static $openAPIModelName = 'Job';

    protected static $openAPITypes = [
        'done' => 'int',
        'error' => 'string',
        'id' => 'int',
        'skipped' => 'int',
        'status' => 'string',
        'total' => 'int'
    ];

    protected static $openAPIFormats = [
        'done' => null,
        'error' => null,
        'id' => null,
        'skipped' => null,
        'status' => null,
        'total' => null
    ];

    protected static array $openAPINullables = [
        'done' => false,
        'error' => true,
        'id' => false,
        'skipped' => false,
        'status' => false,
        'total' => false
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
        'done' => 'done',
        'error' => 'error',
        'id' => 'id',
        'skipped' => 'skipped',
        'status' => 'status',
        'total' => 'total'
    ];

    protected static $setters = [
        'done' => 'setDone',
        'error' => 'setError',
        'id' => 'setId',
        'skipped' => 'setSkipped',
        'status' => 'setStatus',
        'total' => 'setTotal'
    ];

    protected static $getters = [
        'done' => 'getDone',
        'error' => 'getError',
        'id' => 'getId',
        'skipped' => 'getSkipped',
        'status' => 'getStatus',
        'total' => 'getTotal'
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
        $this->setIfExists('done', $data ?? [], 0);
        $this->setIfExists('error', $data ?? [], null);
        $this->setIfExists('id', $data ?? [], null);
        $this->setIfExists('skipped', $data ?? [], 0);
        $this->setIfExists('status', $data ?? [], null);
        $this->setIfExists('total', $data ?? [], 0);
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

        if ($this->container['id'] === null) {
            $invalidProperties[] = "'id' can't be null";
        }
        if ($this->container['status'] === null) {
            $invalidProperties[] = "'status' can't be null";
        }
        return $invalidProperties;
    }

    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }

    public function getDone()
    {
        return $this->container['done'];
    }

    public function setDone($done)
    {
        if (is_null($done)) {
            throw new \InvalidArgumentException('non-nullable done cannot be null');
        }
        $this->container['done'] = $done;

        return $this;
    }

    public function getError()
    {
        return $this->container['error'];
    }

    public function setError($error)
    {
        if (is_null($error)) {
            array_push($this->openAPINullablesSetToNull, 'error');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('error', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['error'] = $error;

        return $this;
    }

    public function getId()
    {
        return $this->container['id'];
    }

    public function setId($id)
    {
        if (is_null($id)) {
            throw new \InvalidArgumentException('non-nullable id cannot be null');
        }
        $this->container['id'] = $id;

        return $this;
    }

    public function getSkipped()
    {
        return $this->container['skipped'];
    }

    public function setSkipped($skipped)
    {
        if (is_null($skipped)) {
            throw new \InvalidArgumentException('non-nullable skipped cannot be null');
        }
        $this->container['skipped'] = $skipped;

        return $this;
    }

    public function getStatus()
    {
        return $this->container['status'];
    }

    public function setStatus($status)
    {
        if (is_null($status)) {
            throw new \InvalidArgumentException('non-nullable status cannot be null');
        }
        $this->container['status'] = $status;

        return $this;
    }

    public function getTotal()
    {
        return $this->container['total'];
    }

    public function setTotal($total)
    {
        if (is_null($total)) {
            throw new \InvalidArgumentException('non-nullable total cannot be null');
        }
        $this->container['total'] = $total;

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

