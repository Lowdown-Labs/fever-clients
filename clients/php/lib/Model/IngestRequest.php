<?php

namespace LowdownLabs\Fever\Model;

use \ArrayAccess;
use \LowdownLabs\Fever\ObjectSerializer;

class IngestRequest implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    protected static $openAPIModelName = 'IngestRequest';

    protected static $openAPITypes = [
        'media' => '\LowdownLabs\Fever\Model\IngestMedia[]',
        'overwrite' => 'bool',
        'source' => '\LowdownLabs\Fever\Model\IngestSource',
        'target_res' => 'int'
    ];

    protected static $openAPIFormats = [
        'media' => null,
        'overwrite' => null,
        'source' => null,
        'target_res' => null
    ];

    protected static array $openAPINullables = [
        'media' => true,
        'overwrite' => false,
        'source' => true,
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
        'media' => 'media',
        'overwrite' => 'overwrite',
        'source' => 'source',
        'target_res' => 'target_res'
    ];

    protected static $setters = [
        'media' => 'setMedia',
        'overwrite' => 'setOverwrite',
        'source' => 'setSource',
        'target_res' => 'setTargetRes'
    ];

    protected static $getters = [
        'media' => 'getMedia',
        'overwrite' => 'getOverwrite',
        'source' => 'getSource',
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
        $this->setIfExists('media', $data ?? [], null);
        $this->setIfExists('overwrite', $data ?? [], false);
        $this->setIfExists('source', $data ?? [], null);
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

    public function getMedia()
    {
        return $this->container['media'];
    }

    public function setMedia($media)
    {
        if (is_null($media)) {
            array_push($this->openAPINullablesSetToNull, 'media');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('media', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['media'] = $media;

        return $this;
    }

    public function getOverwrite()
    {
        return $this->container['overwrite'];
    }

    public function setOverwrite($overwrite)
    {
        if (is_null($overwrite)) {
            throw new \InvalidArgumentException('non-nullable overwrite cannot be null');
        }
        $this->container['overwrite'] = $overwrite;

        return $this;
    }

    public function getSource()
    {
        return $this->container['source'];
    }

    public function setSource($source)
    {
        if (is_null($source)) {
            array_push($this->openAPINullablesSetToNull, 'source');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('source', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['source'] = $source;

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
            throw new \InvalidArgumentException('invalid value for $target_res when calling IngestRequest., must be smaller than or equal to 4096.');
        }
        if (!is_null($target_res) && ($target_res < 64)) {
            throw new \InvalidArgumentException('invalid value for $target_res when calling IngestRequest., must be bigger than or equal to 64.');
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

