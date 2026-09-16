<?php

namespace LowdownLabs\Fever\Model;

use \ArrayAccess;
use \LowdownLabs\Fever\ObjectSerializer;

class IngestResult implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    protected static $openAPIModelName = 'IngestResult';

    protected static $openAPITypes = [
        'existing' => '\LowdownLabs\Fever\Model\IngestedMedia[]',
        'ingested' => '\LowdownLabs\Fever\Model\IngestedMedia[]',
        'job' => '\LowdownLabs\Fever\Model\Job'
    ];

    protected static $openAPIFormats = [
        'existing' => null,
        'ingested' => null,
        'job' => null
    ];

    protected static array $openAPINullables = [
        'existing' => false,
        'ingested' => false,
        'job' => true
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
        'existing' => 'existing',
        'ingested' => 'ingested',
        'job' => 'job'
    ];

    protected static $setters = [
        'existing' => 'setExisting',
        'ingested' => 'setIngested',
        'job' => 'setJob'
    ];

    protected static $getters = [
        'existing' => 'getExisting',
        'ingested' => 'getIngested',
        'job' => 'getJob'
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
        $this->setIfExists('existing', $data ?? [], null);
        $this->setIfExists('ingested', $data ?? [], null);
        $this->setIfExists('job', $data ?? [], null);
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

        return $invalidProperties;
    }

    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }

    public function getExisting()
    {
        return $this->container['existing'];
    }

    public function setExisting($existing)
    {
        if (is_null($existing)) {
            throw new \InvalidArgumentException('non-nullable existing cannot be null');
        }
        $this->container['existing'] = $existing;

        return $this;
    }

    public function getIngested()
    {
        return $this->container['ingested'];
    }

    public function setIngested($ingested)
    {
        if (is_null($ingested)) {
            throw new \InvalidArgumentException('non-nullable ingested cannot be null');
        }
        $this->container['ingested'] = $ingested;

        return $this;
    }

    public function getJob()
    {
        return $this->container['job'];
    }

    public function setJob($job)
    {
        if (is_null($job)) {
            array_push($this->openAPINullablesSetToNull, 'job');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('job', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['job'] = $job;

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

