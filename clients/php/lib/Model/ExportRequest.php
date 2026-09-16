<?php

namespace LowdownLabs\Fever\Model;

use \ArrayAccess;
use \LowdownLabs\Fever\ObjectSerializer;

class ExportRequest implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    protected static $openAPIModelName = 'ExportRequest';

    protected static $openAPITypes = [
        'customer_id' => 'string',
        'format' => 'string',
        'kind' => 'string',
        's3_uri' => 'string',
        'tag' => 'string'
    ];

    protected static $openAPIFormats = [
        'customer_id' => null,
        'format' => null,
        'kind' => null,
        's3_uri' => null,
        'tag' => null
    ];

    protected static array $openAPINullables = [
        'customer_id' => true,
        'format' => false,
        'kind' => true,
        's3_uri' => false,
        'tag' => true
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
        'format' => 'format',
        'kind' => 'kind',
        's3_uri' => 's3_uri',
        'tag' => 'tag'
    ];

    protected static $setters = [
        'customer_id' => 'setCustomerId',
        'format' => 'setFormat',
        'kind' => 'setKind',
        's3_uri' => 'setS3Uri',
        'tag' => 'setTag'
    ];

    protected static $getters = [
        'customer_id' => 'getCustomerId',
        'format' => 'getFormat',
        'kind' => 'getKind',
        's3_uri' => 'getS3Uri',
        'tag' => 'getTag'
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

    public const FORMAT_NDJSON = 'ndjson';
    public const FORMAT_PARQUET = 'parquet';
    public const KIND_IMAGE = 'image';
    public const KIND_VIDEO = 'video';
    public const KIND_AUDIO = 'audio';
    public const KIND_PDF = 'pdf';
    public const KIND_DOC = 'doc';
    public const KIND_NOTE = 'note';

    public function getFormatAllowableValues()
    {
        return [
            self::FORMAT_NDJSON,
            self::FORMAT_PARQUET,
        ];
    }

    public function getKindAllowableValues()
    {
        return [
            self::KIND_IMAGE,
            self::KIND_VIDEO,
            self::KIND_AUDIO,
            self::KIND_PDF,
            self::KIND_DOC,
            self::KIND_NOTE,
        ];
    }

    protected $container = [];

    public function __construct(?array $data = null)
    {
        $this->setIfExists('customer_id', $data ?? [], null);
        $this->setIfExists('format', $data ?? [], 'ndjson');
        $this->setIfExists('kind', $data ?? [], null);
        $this->setIfExists('s3_uri', $data ?? [], null);
        $this->setIfExists('tag', $data ?? [], null);
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

        $allowedValues = $this->getFormatAllowableValues();
        if (!is_null($this->container['format']) && !in_array($this->container['format'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value '%s' for 'format', must be one of '%s'",
                $this->container['format'],
                implode("', '", $allowedValues)
            );
        }

        $allowedValues = $this->getKindAllowableValues();
        if (!is_null($this->container['kind']) && !in_array($this->container['kind'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value '%s' for 'kind', must be one of '%s'",
                $this->container['kind'],
                implode("', '", $allowedValues)
            );
        }

        if ($this->container['s3_uri'] === null) {
            $invalidProperties[] = "'s3_uri' can't be null";
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

    public function getFormat()
    {
        return $this->container['format'];
    }

    public function setFormat($format)
    {
        if (is_null($format)) {
            throw new \InvalidArgumentException('non-nullable format cannot be null');
        }
        $allowedValues = $this->getFormatAllowableValues();
        if (!in_array($format, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value '%s' for 'format', must be one of '%s'",
                    $format,
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['format'] = $format;

        return $this;
    }

    public function getKind()
    {
        return $this->container['kind'];
    }

    public function setKind($kind)
    {
        if (is_null($kind)) {
            array_push($this->openAPINullablesSetToNull, 'kind');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('kind', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $allowedValues = $this->getKindAllowableValues();
        if (!is_null($kind) && !in_array($kind, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value '%s' for 'kind', must be one of '%s'",
                    $kind,
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['kind'] = $kind;

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

    public function getTag()
    {
        return $this->container['tag'];
    }

    public function setTag($tag)
    {
        if (is_null($tag)) {
            array_push($this->openAPINullablesSetToNull, 'tag');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('tag', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['tag'] = $tag;

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

