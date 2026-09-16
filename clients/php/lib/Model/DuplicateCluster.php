<?php

namespace LowdownLabs\Fever\Model;

use \ArrayAccess;
use \LowdownLabs\Fever\ObjectSerializer;

class DuplicateCluster implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    protected static $openAPIModelName = 'DuplicateCluster';

    protected static $openAPITypes = [
        'member_customers' => 'string[]',
        'members' => 'int[]',
        'size' => 'int',
        'tightness' => 'float'
    ];

    protected static $openAPIFormats = [
        'member_customers' => null,
        'members' => null,
        'size' => null,
        'tightness' => null
    ];

    protected static array $openAPINullables = [
        'member_customers' => false,
        'members' => false,
        'size' => false,
        'tightness' => false
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
        'member_customers' => 'member_customers',
        'members' => 'members',
        'size' => 'size',
        'tightness' => 'tightness'
    ];

    protected static $setters = [
        'member_customers' => 'setMemberCustomers',
        'members' => 'setMembers',
        'size' => 'setSize',
        'tightness' => 'setTightness'
    ];

    protected static $getters = [
        'member_customers' => 'getMemberCustomers',
        'members' => 'getMembers',
        'size' => 'getSize',
        'tightness' => 'getTightness'
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
        $this->setIfExists('member_customers', $data ?? [], null);
        $this->setIfExists('members', $data ?? [], null);
        $this->setIfExists('size', $data ?? [], null);
        $this->setIfExists('tightness', $data ?? [], null);
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

        if ($this->container['members'] === null) {
            $invalidProperties[] = "'members' can't be null";
        }
        if ($this->container['size'] === null) {
            $invalidProperties[] = "'size' can't be null";
        }
        if ($this->container['tightness'] === null) {
            $invalidProperties[] = "'tightness' can't be null";
        }
        return $invalidProperties;
    }

    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }

    public function getMemberCustomers()
    {
        return $this->container['member_customers'];
    }

    public function setMemberCustomers($member_customers)
    {
        if (is_null($member_customers)) {
            throw new \InvalidArgumentException('non-nullable member_customers cannot be null');
        }
        $this->container['member_customers'] = $member_customers;

        return $this;
    }

    public function getMembers()
    {
        return $this->container['members'];
    }

    public function setMembers($members)
    {
        if (is_null($members)) {
            throw new \InvalidArgumentException('non-nullable members cannot be null');
        }
        $this->container['members'] = $members;

        return $this;
    }

    public function getSize()
    {
        return $this->container['size'];
    }

    public function setSize($size)
    {
        if (is_null($size)) {
            throw new \InvalidArgumentException('non-nullable size cannot be null');
        }
        $this->container['size'] = $size;

        return $this;
    }

    public function getTightness()
    {
        return $this->container['tightness'];
    }

    public function setTightness($tightness)
    {
        if (is_null($tightness)) {
            throw new \InvalidArgumentException('non-nullable tightness cannot be null');
        }
        $this->container['tightness'] = $tightness;

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

