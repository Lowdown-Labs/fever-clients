<?php

namespace LowdownLabs\Fever\Model;

use \ArrayAccess;
use \LowdownLabs\Fever\ObjectSerializer;

class SearchHit implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    protected static $openAPIModelName = 'SearchHit';

    protected static $openAPITypes = [
        'blob_id' => 'int',
        'caption' => 'string',
        'customer_id' => 'string',
        'duplicate_count' => 'int',
        'duplicates' => 'int[]',
        'geo_label' => 'string',
        'headline' => 'string',
        'height' => 'int',
        'kind' => 'string',
        'media_ref' => 'string',
        'metadata' => 'array<string,mixed>',
        'score' => 'float',
        'score_type' => 'string',
        'seek_ms' => 'int',
        'span' => '\LowdownLabs\Fever\Model\MediaSpan',
        'span_headline' => 'string',
        'tags' => 'string[]',
        'width' => 'int'
    ];

    protected static $openAPIFormats = [
        'blob_id' => null,
        'caption' => null,
        'customer_id' => null,
        'duplicate_count' => null,
        'duplicates' => null,
        'geo_label' => null,
        'headline' => null,
        'height' => null,
        'kind' => null,
        'media_ref' => null,
        'metadata' => null,
        'score' => null,
        'score_type' => null,
        'seek_ms' => null,
        'span' => null,
        'span_headline' => null,
        'tags' => null,
        'width' => null
    ];

    protected static array $openAPINullables = [
        'blob_id' => false,
        'caption' => true,
        'customer_id' => true,
        'duplicate_count' => false,
        'duplicates' => false,
        'geo_label' => true,
        'headline' => true,
        'height' => true,
        'kind' => true,
        'media_ref' => true,
        'metadata' => true,
        'score' => false,
        'score_type' => false,
        'seek_ms' => true,
        'span' => true,
        'span_headline' => true,
        'tags' => false,
        'width' => true
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
        'blob_id' => 'blob_id',
        'caption' => 'caption',
        'customer_id' => 'customer_id',
        'duplicate_count' => 'duplicate_count',
        'duplicates' => 'duplicates',
        'geo_label' => 'geo_label',
        'headline' => 'headline',
        'height' => 'height',
        'kind' => 'kind',
        'media_ref' => 'media_ref',
        'metadata' => 'metadata',
        'score' => 'score',
        'score_type' => 'score_type',
        'seek_ms' => 'seek_ms',
        'span' => 'span',
        'span_headline' => 'span_headline',
        'tags' => 'tags',
        'width' => 'width'
    ];

    protected static $setters = [
        'blob_id' => 'setBlobId',
        'caption' => 'setCaption',
        'customer_id' => 'setCustomerId',
        'duplicate_count' => 'setDuplicateCount',
        'duplicates' => 'setDuplicates',
        'geo_label' => 'setGeoLabel',
        'headline' => 'setHeadline',
        'height' => 'setHeight',
        'kind' => 'setKind',
        'media_ref' => 'setMediaRef',
        'metadata' => 'setMetadata',
        'score' => 'setScore',
        'score_type' => 'setScoreType',
        'seek_ms' => 'setSeekMs',
        'span' => 'setSpan',
        'span_headline' => 'setSpanHeadline',
        'tags' => 'setTags',
        'width' => 'setWidth'
    ];

    protected static $getters = [
        'blob_id' => 'getBlobId',
        'caption' => 'getCaption',
        'customer_id' => 'getCustomerId',
        'duplicate_count' => 'getDuplicateCount',
        'duplicates' => 'getDuplicates',
        'geo_label' => 'getGeoLabel',
        'headline' => 'getHeadline',
        'height' => 'getHeight',
        'kind' => 'getKind',
        'media_ref' => 'getMediaRef',
        'metadata' => 'getMetadata',
        'score' => 'getScore',
        'score_type' => 'getScoreType',
        'seek_ms' => 'getSeekMs',
        'span' => 'getSpan',
        'span_headline' => 'getSpanHeadline',
        'tags' => 'getTags',
        'width' => 'getWidth'
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

    public const KIND_IMAGE = 'image';
    public const KIND_VIDEO = 'video';
    public const KIND_AUDIO = 'audio';
    public const KIND_PDF = 'pdf';
    public const KIND_DOC = 'doc';
    public const KIND_NOTE = 'note';
    public const SCORE_TYPE_COSINE = 'cosine';
    public const SCORE_TYPE_COSINELEX = 'cosine+lex';
    public const SCORE_TYPE_RRF = 'rrf';
    public const SCORE_TYPE_RERANK = 'rerank';

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

    public function getScoreTypeAllowableValues()
    {
        return [
            self::SCORE_TYPE_COSINE,
            self::SCORE_TYPE_COSINELEX,
            self::SCORE_TYPE_RRF,
            self::SCORE_TYPE_RERANK,
        ];
    }

    protected $container = [];

    public function __construct(?array $data = null)
    {
        $this->setIfExists('blob_id', $data ?? [], null);
        $this->setIfExists('caption', $data ?? [], null);
        $this->setIfExists('customer_id', $data ?? [], null);
        $this->setIfExists('duplicate_count', $data ?? [], 0);
        $this->setIfExists('duplicates', $data ?? [], null);
        $this->setIfExists('geo_label', $data ?? [], null);
        $this->setIfExists('headline', $data ?? [], null);
        $this->setIfExists('height', $data ?? [], null);
        $this->setIfExists('kind', $data ?? [], null);
        $this->setIfExists('media_ref', $data ?? [], null);
        $this->setIfExists('metadata', $data ?? [], null);
        $this->setIfExists('score', $data ?? [], null);
        $this->setIfExists('score_type', $data ?? [], null);
        $this->setIfExists('seek_ms', $data ?? [], null);
        $this->setIfExists('span', $data ?? [], null);
        $this->setIfExists('span_headline', $data ?? [], null);
        $this->setIfExists('tags', $data ?? [], null);
        $this->setIfExists('width', $data ?? [], null);
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

        if ($this->container['blob_id'] === null) {
            $invalidProperties[] = "'blob_id' can't be null";
        }
        $allowedValues = $this->getKindAllowableValues();
        if (!is_null($this->container['kind']) && !in_array($this->container['kind'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value '%s' for 'kind', must be one of '%s'",
                $this->container['kind'],
                implode("', '", $allowedValues)
            );
        }

        if ($this->container['score'] === null) {
            $invalidProperties[] = "'score' can't be null";
        }
        if ($this->container['score_type'] === null) {
            $invalidProperties[] = "'score_type' can't be null";
        }
        $allowedValues = $this->getScoreTypeAllowableValues();
        if (!is_null($this->container['score_type']) && !in_array($this->container['score_type'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value '%s' for 'score_type', must be one of '%s'",
                $this->container['score_type'],
                implode("', '", $allowedValues)
            );
        }

        return $invalidProperties;
    }

    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }

    public function getBlobId()
    {
        return $this->container['blob_id'];
    }

    public function setBlobId($blob_id)
    {
        if (is_null($blob_id)) {
            throw new \InvalidArgumentException('non-nullable blob_id cannot be null');
        }
        $this->container['blob_id'] = $blob_id;

        return $this;
    }

    public function getCaption()
    {
        return $this->container['caption'];
    }

    public function setCaption($caption)
    {
        if (is_null($caption)) {
            array_push($this->openAPINullablesSetToNull, 'caption');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('caption', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['caption'] = $caption;

        return $this;
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

    public function getDuplicateCount()
    {
        return $this->container['duplicate_count'];
    }

    public function setDuplicateCount($duplicate_count)
    {
        if (is_null($duplicate_count)) {
            throw new \InvalidArgumentException('non-nullable duplicate_count cannot be null');
        }
        $this->container['duplicate_count'] = $duplicate_count;

        return $this;
    }

    public function getDuplicates()
    {
        return $this->container['duplicates'];
    }

    public function setDuplicates($duplicates)
    {
        if (is_null($duplicates)) {
            throw new \InvalidArgumentException('non-nullable duplicates cannot be null');
        }
        $this->container['duplicates'] = $duplicates;

        return $this;
    }

    public function getGeoLabel()
    {
        return $this->container['geo_label'];
    }

    public function setGeoLabel($geo_label)
    {
        if (is_null($geo_label)) {
            array_push($this->openAPINullablesSetToNull, 'geo_label');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('geo_label', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['geo_label'] = $geo_label;

        return $this;
    }

    public function getHeadline()
    {
        return $this->container['headline'];
    }

    public function setHeadline($headline)
    {
        if (is_null($headline)) {
            array_push($this->openAPINullablesSetToNull, 'headline');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('headline', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['headline'] = $headline;

        return $this;
    }

    public function getHeight()
    {
        return $this->container['height'];
    }

    public function setHeight($height)
    {
        if (is_null($height)) {
            array_push($this->openAPINullablesSetToNull, 'height');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('height', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['height'] = $height;

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

    public function getMediaRef()
    {
        return $this->container['media_ref'];
    }

    public function setMediaRef($media_ref)
    {
        if (is_null($media_ref)) {
            array_push($this->openAPINullablesSetToNull, 'media_ref');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('media_ref', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['media_ref'] = $media_ref;

        return $this;
    }

    public function getMetadata()
    {
        return $this->container['metadata'];
    }

    public function setMetadata($metadata)
    {
        if (is_null($metadata)) {
            array_push($this->openAPINullablesSetToNull, 'metadata');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('metadata', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['metadata'] = $metadata;

        return $this;
    }

    public function getScore()
    {
        return $this->container['score'];
    }

    public function setScore($score)
    {
        if (is_null($score)) {
            throw new \InvalidArgumentException('non-nullable score cannot be null');
        }
        $this->container['score'] = $score;

        return $this;
    }

    public function getScoreType()
    {
        return $this->container['score_type'];
    }

    public function setScoreType($score_type)
    {
        if (is_null($score_type)) {
            throw new \InvalidArgumentException('non-nullable score_type cannot be null');
        }
        $allowedValues = $this->getScoreTypeAllowableValues();
        if (!in_array($score_type, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value '%s' for 'score_type', must be one of '%s'",
                    $score_type,
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['score_type'] = $score_type;

        return $this;
    }

    public function getSeekMs()
    {
        return $this->container['seek_ms'];
    }

    public function setSeekMs($seek_ms)
    {
        if (is_null($seek_ms)) {
            array_push($this->openAPINullablesSetToNull, 'seek_ms');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('seek_ms', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['seek_ms'] = $seek_ms;

        return $this;
    }

    public function getSpan()
    {
        return $this->container['span'];
    }

    public function setSpan($span)
    {
        if (is_null($span)) {
            array_push($this->openAPINullablesSetToNull, 'span');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('span', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['span'] = $span;

        return $this;
    }

    public function getSpanHeadline()
    {
        return $this->container['span_headline'];
    }

    public function setSpanHeadline($span_headline)
    {
        if (is_null($span_headline)) {
            array_push($this->openAPINullablesSetToNull, 'span_headline');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('span_headline', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['span_headline'] = $span_headline;

        return $this;
    }

    public function getTags()
    {
        return $this->container['tags'];
    }

    public function setTags($tags)
    {
        if (is_null($tags)) {
            throw new \InvalidArgumentException('non-nullable tags cannot be null');
        }
        $this->container['tags'] = $tags;

        return $this;
    }

    public function getWidth()
    {
        return $this->container['width'];
    }

    public function setWidth($width)
    {
        if (is_null($width)) {
            array_push($this->openAPINullablesSetToNull, 'width');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('width', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['width'] = $width;

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

