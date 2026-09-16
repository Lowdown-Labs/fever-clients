<?php

namespace LowdownLabs\Fever\Model;

use \ArrayAccess;
use \LowdownLabs\Fever\ObjectSerializer;

class TranscriptSegment implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    protected static $openAPIModelName = 'TranscriptSegment';

    protected static $openAPITypes = [
        'end_ms' => 'int',
        'seq' => 'int',
        'start_ms' => 'int',
        'text' => 'string'
    ];

    protected static $openAPIFormats = [
        'end_ms' => null,
        'seq' => null,
        'start_ms' => null,
        'text' => null
    ];

    protected static array $openAPINullables = [
        'end_ms' => true,
        'seq' => false,
        'start_ms' => true,
        'text' => true
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
        'end_ms' => 'end_ms',
        'seq' => 'seq',
        'start_ms' => 'start_ms',
        'text' => 'text'
    ];

    protected static $setters = [
        'end_ms' => 'setEndMs',
        'seq' => 'setSeq',
        'start_ms' => 'setStartMs',
        'text' => 'setText'
    ];

    protected static $getters = [
        'end_ms' => 'getEndMs',
        'seq' => 'getSeq',
        'start_ms' => 'getStartMs',
        'text' => 'getText'
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
        $this->setIfExists('end_ms', $data ?? [], null);
        $this->setIfExists('seq', $data ?? [], null);
        $this->setIfExists('start_ms', $data ?? [], null);
        $this->setIfExists('text', $data ?? [], null);
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

        if ($this->container['end_ms'] === null && !$this->isNullableSetToNull('end_ms')) {
            $invalidProperties[] = "'end_ms' is required";
        }
        if ($this->container['seq'] === null) {
            $invalidProperties[] = "'seq' can't be null";
        }
        if ($this->container['start_ms'] === null && !$this->isNullableSetToNull('start_ms')) {
            $invalidProperties[] = "'start_ms' is required";
        }
        if ($this->container['text'] === null && !$this->isNullableSetToNull('text')) {
            $invalidProperties[] = "'text' is required";
        }
        return $invalidProperties;
    }

    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }

    public function getEndMs()
    {
        return $this->container['end_ms'];
    }

    public function setEndMs($end_ms)
    {
        if (is_null($end_ms)) {
            array_push($this->openAPINullablesSetToNull, 'end_ms');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('end_ms', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['end_ms'] = $end_ms;

        return $this;
    }

    public function getSeq()
    {
        return $this->container['seq'];
    }

    public function setSeq($seq)
    {
        if (is_null($seq)) {
            throw new \InvalidArgumentException('non-nullable seq cannot be null');
        }
        $this->container['seq'] = $seq;

        return $this;
    }

    public function getStartMs()
    {
        return $this->container['start_ms'];
    }

    public function setStartMs($start_ms)
    {
        if (is_null($start_ms)) {
            array_push($this->openAPINullablesSetToNull, 'start_ms');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('start_ms', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['start_ms'] = $start_ms;

        return $this;
    }

    public function getText()
    {
        return $this->container['text'];
    }

    public function setText($text)
    {
        if (is_null($text)) {
            array_push($this->openAPINullablesSetToNull, 'text');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('text', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['text'] = $text;

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

