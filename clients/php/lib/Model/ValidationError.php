<?php

namespace LowdownLabs\Fever\Model;

use \ArrayAccess;
use \LowdownLabs\Fever\ObjectSerializer;

class ValidationError implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    protected static $openAPIModelName = 'ValidationError';

    protected static $openAPITypes = [
        'ctx' => 'object',
        'input' => 'mixed',
        'loc' => '\LowdownLabs\Fever\Model\LocationInner[]',
        'msg' => 'string',
        'type' => 'string'
    ];

    protected static $openAPIFormats = [
        'ctx' => null,
        'input' => null,
        'loc' => null,
        'msg' => null,
        'type' => null
    ];

    protected static array $openAPINullables = [
        'ctx' => false,
        'input' => true,
        'loc' => false,
        'msg' => false,
        'type' => false
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
        'ctx' => 'ctx',
        'input' => 'input',
        'loc' => 'loc',
        'msg' => 'msg',
        'type' => 'type'
    ];

    protected static $setters = [
        'ctx' => 'setCtx',
        'input' => 'setInput',
        'loc' => 'setLoc',
        'msg' => 'setMsg',
        'type' => 'setType'
    ];

    protected static $getters = [
        'ctx' => 'getCtx',
        'input' => 'getInput',
        'loc' => 'getLoc',
        'msg' => 'getMsg',
        'type' => 'getType'
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
        $this->setIfExists('ctx', $data ?? [], null);
        $this->setIfExists('input', $data ?? [], null);
        $this->setIfExists('loc', $data ?? [], null);
        $this->setIfExists('msg', $data ?? [], null);
        $this->setIfExists('type', $data ?? [], null);
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

        if ($this->container['loc'] === null) {
            $invalidProperties[] = "'loc' can't be null";
        }
        if ($this->container['msg'] === null) {
            $invalidProperties[] = "'msg' can't be null";
        }
        if ($this->container['type'] === null) {
            $invalidProperties[] = "'type' can't be null";
        }
        return $invalidProperties;
    }

    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }

    public function getCtx()
    {
        return $this->container['ctx'];
    }

    public function setCtx($ctx)
    {
        if (is_null($ctx)) {
            throw new \InvalidArgumentException('non-nullable ctx cannot be null');
        }
        $this->container['ctx'] = $ctx;

        return $this;
    }

    public function getInput()
    {
        return $this->container['input'];
    }

    public function setInput($input)
    {
        if (is_null($input)) {
            array_push($this->openAPINullablesSetToNull, 'input');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('input', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['input'] = $input;

        return $this;
    }

    public function getLoc()
    {
        return $this->container['loc'];
    }

    public function setLoc($loc)
    {
        if (is_null($loc)) {
            throw new \InvalidArgumentException('non-nullable loc cannot be null');
        }
        $this->container['loc'] = $loc;

        return $this;
    }

    public function getMsg()
    {
        return $this->container['msg'];
    }

    public function setMsg($msg)
    {
        if (is_null($msg)) {
            throw new \InvalidArgumentException('non-nullable msg cannot be null');
        }
        $this->container['msg'] = $msg;

        return $this;
    }

    public function getType()
    {
        return $this->container['type'];
    }

    public function setType($type)
    {
        if (is_null($type)) {
            throw new \InvalidArgumentException('non-nullable type cannot be null');
        }
        $this->container['type'] = $type;

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

