<?php

namespace LowdownLabs\Fever\Model;

use \ArrayAccess;
use \LowdownLabs\Fever\ObjectSerializer;

class SearchRequest implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    protected static $openAPIModelName = 'SearchRequest';

    protected static $openAPITypes = [
        'after' => 'string',
        'before' => 'string',
        'collapse_duplicates' => 'bool',
        'customer_id' => 'string',
        'device' => 'string',
        'dupe_threshold' => 'float',
        'exclude_tags' => 'string[]',
        'image' => 'string',
        'image_blob_id' => 'int',
        'include_tags' => 'string[]',
        'indexed_res' => 'int',
        'k' => 'int',
        'kind' => 'string',
        'max_height' => 'int',
        'max_width' => 'int',
        'min_score' => 'float',
        'near' => 'float[]',
        'sort' => 'string',
        'text' => 'string'
    ];

    protected static $openAPIFormats = [
        'after' => null,
        'before' => null,
        'collapse_duplicates' => null,
        'customer_id' => null,
        'device' => null,
        'dupe_threshold' => null,
        'exclude_tags' => null,
        'image' => null,
        'image_blob_id' => null,
        'include_tags' => null,
        'indexed_res' => null,
        'k' => null,
        'kind' => null,
        'max_height' => null,
        'max_width' => null,
        'min_score' => null,
        'near' => null,
        'sort' => null,
        'text' => null
    ];

    protected static array $openAPINullables = [
        'after' => true,
        'before' => true,
        'collapse_duplicates' => false,
        'customer_id' => true,
        'device' => true,
        'dupe_threshold' => true,
        'exclude_tags' => true,
        'image' => true,
        'image_blob_id' => true,
        'include_tags' => true,
        'indexed_res' => true,
        'k' => false,
        'kind' => true,
        'max_height' => true,
        'max_width' => true,
        'min_score' => false,
        'near' => true,
        'sort' => true,
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
        'after' => 'after',
        'before' => 'before',
        'collapse_duplicates' => 'collapse_duplicates',
        'customer_id' => 'customer_id',
        'device' => 'device',
        'dupe_threshold' => 'dupe_threshold',
        'exclude_tags' => 'exclude_tags',
        'image' => 'image',
        'image_blob_id' => 'image_blob_id',
        'include_tags' => 'include_tags',
        'indexed_res' => 'indexed_res',
        'k' => 'k',
        'kind' => 'kind',
        'max_height' => 'max_height',
        'max_width' => 'max_width',
        'min_score' => 'min_score',
        'near' => 'near',
        'sort' => 'sort',
        'text' => 'text'
    ];

    protected static $setters = [
        'after' => 'setAfter',
        'before' => 'setBefore',
        'collapse_duplicates' => 'setCollapseDuplicates',
        'customer_id' => 'setCustomerId',
        'device' => 'setDevice',
        'dupe_threshold' => 'setDupeThreshold',
        'exclude_tags' => 'setExcludeTags',
        'image' => 'setImage',
        'image_blob_id' => 'setImageBlobId',
        'include_tags' => 'setIncludeTags',
        'indexed_res' => 'setIndexedRes',
        'k' => 'setK',
        'kind' => 'setKind',
        'max_height' => 'setMaxHeight',
        'max_width' => 'setMaxWidth',
        'min_score' => 'setMinScore',
        'near' => 'setNear',
        'sort' => 'setSort',
        'text' => 'setText'
    ];

    protected static $getters = [
        'after' => 'getAfter',
        'before' => 'getBefore',
        'collapse_duplicates' => 'getCollapseDuplicates',
        'customer_id' => 'getCustomerId',
        'device' => 'getDevice',
        'dupe_threshold' => 'getDupeThreshold',
        'exclude_tags' => 'getExcludeTags',
        'image' => 'getImage',
        'image_blob_id' => 'getImageBlobId',
        'include_tags' => 'getIncludeTags',
        'indexed_res' => 'getIndexedRes',
        'k' => 'getK',
        'kind' => 'getKind',
        'max_height' => 'getMaxHeight',
        'max_width' => 'getMaxWidth',
        'min_score' => 'getMinScore',
        'near' => 'getNear',
        'sort' => 'getSort',
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

    public const KIND_IMAGE = 'image';
    public const KIND_VIDEO = 'video';
    public const KIND_AUDIO = 'audio';
    public const KIND_PDF = 'pdf';
    public const KIND_DOC = 'doc';
    public const KIND_NOTE = 'note';
    public const SORT_RELEVANCE = 'relevance';
    public const SORT_DISTANCE = 'distance';

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

    public function getSortAllowableValues()
    {
        return [
            self::SORT_RELEVANCE,
            self::SORT_DISTANCE,
        ];
    }

    protected $container = [];

    public function __construct(?array $data = null)
    {
        $this->setIfExists('after', $data ?? [], null);
        $this->setIfExists('before', $data ?? [], null);
        $this->setIfExists('collapse_duplicates', $data ?? [], true);
        $this->setIfExists('customer_id', $data ?? [], null);
        $this->setIfExists('device', $data ?? [], null);
        $this->setIfExists('dupe_threshold', $data ?? [], null);
        $this->setIfExists('exclude_tags', $data ?? [], null);
        $this->setIfExists('image', $data ?? [], null);
        $this->setIfExists('image_blob_id', $data ?? [], null);
        $this->setIfExists('include_tags', $data ?? [], null);
        $this->setIfExists('indexed_res', $data ?? [], null);
        $this->setIfExists('k', $data ?? [], 10);
        $this->setIfExists('kind', $data ?? [], null);
        $this->setIfExists('max_height', $data ?? [], null);
        $this->setIfExists('max_width', $data ?? [], null);
        $this->setIfExists('min_score', $data ?? [], 0.0);
        $this->setIfExists('near', $data ?? [], null);
        $this->setIfExists('sort', $data ?? [], null);
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

        $allowedValues = $this->getKindAllowableValues();
        if (!is_null($this->container['kind']) && !in_array($this->container['kind'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value '%s' for 'kind', must be one of '%s'",
                $this->container['kind'],
                implode("', '", $allowedValues)
            );
        }

        $allowedValues = $this->getSortAllowableValues();
        if (!is_null($this->container['sort']) && !in_array($this->container['sort'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value '%s' for 'sort', must be one of '%s'",
                $this->container['sort'],
                implode("', '", $allowedValues)
            );
        }

        return $invalidProperties;
    }

    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }

    public function getAfter()
    {
        return $this->container['after'];
    }

    public function setAfter($after)
    {
        if (is_null($after)) {
            array_push($this->openAPINullablesSetToNull, 'after');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('after', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['after'] = $after;

        return $this;
    }

    public function getBefore()
    {
        return $this->container['before'];
    }

    public function setBefore($before)
    {
        if (is_null($before)) {
            array_push($this->openAPINullablesSetToNull, 'before');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('before', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['before'] = $before;

        return $this;
    }

    public function getCollapseDuplicates()
    {
        return $this->container['collapse_duplicates'];
    }

    public function setCollapseDuplicates($collapse_duplicates)
    {
        if (is_null($collapse_duplicates)) {
            throw new \InvalidArgumentException('non-nullable collapse_duplicates cannot be null');
        }
        $this->container['collapse_duplicates'] = $collapse_duplicates;

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

    public function getDevice()
    {
        return $this->container['device'];
    }

    public function setDevice($device)
    {
        if (is_null($device)) {
            array_push($this->openAPINullablesSetToNull, 'device');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('device', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['device'] = $device;

        return $this;
    }

    public function getDupeThreshold()
    {
        return $this->container['dupe_threshold'];
    }

    public function setDupeThreshold($dupe_threshold)
    {
        if (is_null($dupe_threshold)) {
            array_push($this->openAPINullablesSetToNull, 'dupe_threshold');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('dupe_threshold', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['dupe_threshold'] = $dupe_threshold;

        return $this;
    }

    public function getExcludeTags()
    {
        return $this->container['exclude_tags'];
    }

    public function setExcludeTags($exclude_tags)
    {
        if (is_null($exclude_tags)) {
            array_push($this->openAPINullablesSetToNull, 'exclude_tags');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('exclude_tags', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['exclude_tags'] = $exclude_tags;

        return $this;
    }

    public function getImage()
    {
        return $this->container['image'];
    }

    public function setImage($image)
    {
        if (is_null($image)) {
            array_push($this->openAPINullablesSetToNull, 'image');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('image', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['image'] = $image;

        return $this;
    }

    public function getImageBlobId()
    {
        return $this->container['image_blob_id'];
    }

    public function setImageBlobId($image_blob_id)
    {
        if (is_null($image_blob_id)) {
            array_push($this->openAPINullablesSetToNull, 'image_blob_id');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('image_blob_id', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['image_blob_id'] = $image_blob_id;

        return $this;
    }

    public function getIncludeTags()
    {
        return $this->container['include_tags'];
    }

    public function setIncludeTags($include_tags)
    {
        if (is_null($include_tags)) {
            array_push($this->openAPINullablesSetToNull, 'include_tags');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('include_tags', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['include_tags'] = $include_tags;

        return $this;
    }

    public function getIndexedRes()
    {
        return $this->container['indexed_res'];
    }

    public function setIndexedRes($indexed_res)
    {
        if (is_null($indexed_res)) {
            array_push($this->openAPINullablesSetToNull, 'indexed_res');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('indexed_res', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['indexed_res'] = $indexed_res;

        return $this;
    }

    public function getK()
    {
        return $this->container['k'];
    }

    public function setK($k)
    {
        if (is_null($k)) {
            throw new \InvalidArgumentException('non-nullable k cannot be null');
        }
        $this->container['k'] = $k;

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

    public function getMaxHeight()
    {
        return $this->container['max_height'];
    }

    public function setMaxHeight($max_height)
    {
        if (is_null($max_height)) {
            array_push($this->openAPINullablesSetToNull, 'max_height');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('max_height', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['max_height'] = $max_height;

        return $this;
    }

    public function getMaxWidth()
    {
        return $this->container['max_width'];
    }

    public function setMaxWidth($max_width)
    {
        if (is_null($max_width)) {
            array_push($this->openAPINullablesSetToNull, 'max_width');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('max_width', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['max_width'] = $max_width;

        return $this;
    }

    public function getMinScore()
    {
        return $this->container['min_score'];
    }

    public function setMinScore($min_score)
    {
        if (is_null($min_score)) {
            throw new \InvalidArgumentException('non-nullable min_score cannot be null');
        }
        $this->container['min_score'] = $min_score;

        return $this;
    }

    public function getNear()
    {
        return $this->container['near'];
    }

    public function setNear($near)
    {
        if (is_null($near)) {
            array_push($this->openAPINullablesSetToNull, 'near');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('near', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['near'] = $near;

        return $this;
    }

    public function getSort()
    {
        return $this->container['sort'];
    }

    public function setSort($sort)
    {
        if (is_null($sort)) {
            array_push($this->openAPINullablesSetToNull, 'sort');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('sort', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $allowedValues = $this->getSortAllowableValues();
        if (!is_null($sort) && !in_array($sort, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value '%s' for 'sort', must be one of '%s'",
                    $sort,
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['sort'] = $sort;

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

