<?php

namespace LowdownLabs\Fever\Model;

use \ArrayAccess;
use \LowdownLabs\Fever\ObjectSerializer;

class MediaFormats implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    protected static $openAPIModelName = 'MediaFormats';

    protected static $openAPITypes = [
        'audio' => 'string[]',
        'document' => 'string[]',
        'image' => 'string[]',
        'video' => 'string[]'
    ];

    protected static $openAPIFormats = [
        'audio' => null,
        'document' => null,
        'image' => null,
        'video' => null
    ];

    protected static array $openAPINullables = [
        'audio' => false,
        'document' => false,
        'image' => false,
        'video' => false
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
        'audio' => 'audio',
        'document' => 'document',
        'image' => 'image',
        'video' => 'video'
    ];

    protected static $setters = [
        'audio' => 'setAudio',
        'document' => 'setDocument',
        'image' => 'setImage',
        'video' => 'setVideo'
    ];

    protected static $getters = [
        'audio' => 'getAudio',
        'document' => 'getDocument',
        'image' => 'getImage',
        'video' => 'getVideo'
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
        $this->setIfExists('audio', $data ?? [], null);
        $this->setIfExists('document', $data ?? [], null);
        $this->setIfExists('image', $data ?? [], null);
        $this->setIfExists('video', $data ?? [], null);
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

        if ($this->container['audio'] === null) {
            $invalidProperties[] = "'audio' can't be null";
        }
        if ($this->container['document'] === null) {
            $invalidProperties[] = "'document' can't be null";
        }
        if ($this->container['image'] === null) {
            $invalidProperties[] = "'image' can't be null";
        }
        if ($this->container['video'] === null) {
            $invalidProperties[] = "'video' can't be null";
        }
        return $invalidProperties;
    }

    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }

    public function getAudio()
    {
        return $this->container['audio'];
    }

    public function setAudio($audio)
    {
        if (is_null($audio)) {
            throw new \InvalidArgumentException('non-nullable audio cannot be null');
        }
        $this->container['audio'] = $audio;

        return $this;
    }

    public function getDocument()
    {
        return $this->container['document'];
    }

    public function setDocument($document)
    {
        if (is_null($document)) {
            throw new \InvalidArgumentException('non-nullable document cannot be null');
        }
        $this->container['document'] = $document;

        return $this;
    }

    public function getImage()
    {
        return $this->container['image'];
    }

    public function setImage($image)
    {
        if (is_null($image)) {
            throw new \InvalidArgumentException('non-nullable image cannot be null');
        }
        $this->container['image'] = $image;

        return $this;
    }

    public function getVideo()
    {
        return $this->container['video'];
    }

    public function setVideo($video)
    {
        if (is_null($video)) {
            throw new \InvalidArgumentException('non-nullable video cannot be null');
        }
        $this->container['video'] = $video;

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

