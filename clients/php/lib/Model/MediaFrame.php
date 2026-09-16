<?php

namespace LowdownLabs\Fever\Model;

use \ArrayAccess;
use \LowdownLabs\Fever\ObjectSerializer;

class MediaFrame implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    protected static $openAPIModelName = 'MediaFrame';

    protected static $openAPITypes = [
        'frame_no' => 'int',
        'ts_ms' => 'int'
    ];

    protected static $openAPIFormats = [
        'frame_no' => null,
        'ts_ms' => null
    ];

    protected static array $openAPINullables = [
        'frame_no' => false,
        'ts_ms' => false
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
        'frame_no' => 'frame_no',
        'ts_ms' => 'ts_ms'
    ];

    protected static $setters = [
        'frame_no' => 'setFrameNo',
        'ts_ms' => 'setTsMs'
    ];

    protected static $getters = [
        'frame_no' => 'getFrameNo',
        'ts_ms' => 'getTsMs'
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
        $this->setIfExists('frame_no', $data ?? [], null);
        $this->setIfExists('ts_ms', $data ?? [], null);
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

        if ($this->container['frame_no'] === null) {
            $invalidProperties[] = "'frame_no' can't be null";
        }
        if ($this->container['ts_ms'] === null) {
            $invalidProperties[] = "'ts_ms' can't be null";
        }
        return $invalidProperties;
    }

    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }

    public function getFrameNo()
    {
        return $this->container['frame_no'];
    }

    public function setFrameNo($frame_no)
    {
        if (is_null($frame_no)) {
            throw new \InvalidArgumentException('non-nullable frame_no cannot be null');
        }
        $this->container['frame_no'] = $frame_no;

        return $this;
    }

    public function getTsMs()
    {
        return $this->container['ts_ms'];
    }

    public function setTsMs($ts_ms)
    {
        if (is_null($ts_ms)) {
            throw new \InvalidArgumentException('non-nullable ts_ms cannot be null');
        }
        $this->container['ts_ms'] = $ts_ms;

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

