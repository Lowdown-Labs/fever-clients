<?php

namespace LowdownLabs\Fever\Model;

use \ArrayAccess;
use \LowdownLabs\Fever\ObjectSerializer;

class MediaInfo implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    protected static $openAPIModelName = 'MediaInfo';

    protected static $openAPITypes = [
        'blob_id' => 'int',
        'caption' => 'string',
        'captured_at' => '\DateTime',
        'customer_id' => 'string',
        'device' => 'string',
        'external_ref' => 'string',
        'frame_count' => 'int',
        'gps_lat' => 'float',
        'gps_lon' => 'float',
        'kind' => 'string',
        'metadata' => 'array<string,mixed>',
        'ocr_text' => 'string',
        'synthetic' => 'float',
        'tags' => 'string[]',
        'transcript_segments' => 'int'
    ];

    protected static $openAPIFormats = [
        'blob_id' => null,
        'caption' => null,
        'captured_at' => 'date-time',
        'customer_id' => null,
        'device' => null,
        'external_ref' => null,
        'frame_count' => null,
        'gps_lat' => null,
        'gps_lon' => null,
        'kind' => null,
        'metadata' => null,
        'ocr_text' => null,
        'synthetic' => null,
        'tags' => null,
        'transcript_segments' => null
    ];

    protected static array $openAPINullables = [
        'blob_id' => false,
        'caption' => true,
        'captured_at' => true,
        'customer_id' => true,
        'device' => true,
        'external_ref' => true,
        'frame_count' => false,
        'gps_lat' => true,
        'gps_lon' => true,
        'kind' => true,
        'metadata' => true,
        'ocr_text' => true,
        'synthetic' => true,
        'tags' => false,
        'transcript_segments' => false
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
        'captured_at' => 'captured_at',
        'customer_id' => 'customer_id',
        'device' => 'device',
        'external_ref' => 'external_ref',
        'frame_count' => 'frame_count',
        'gps_lat' => 'gps_lat',
        'gps_lon' => 'gps_lon',
        'kind' => 'kind',
        'metadata' => 'metadata',
        'ocr_text' => 'ocr_text',
        'synthetic' => 'synthetic',
        'tags' => 'tags',
        'transcript_segments' => 'transcript_segments'
    ];

    protected static $setters = [
        'blob_id' => 'setBlobId',
        'caption' => 'setCaption',
        'captured_at' => 'setCapturedAt',
        'customer_id' => 'setCustomerId',
        'device' => 'setDevice',
        'external_ref' => 'setExternalRef',
        'frame_count' => 'setFrameCount',
        'gps_lat' => 'setGpsLat',
        'gps_lon' => 'setGpsLon',
        'kind' => 'setKind',
        'metadata' => 'setMetadata',
        'ocr_text' => 'setOcrText',
        'synthetic' => 'setSynthetic',
        'tags' => 'setTags',
        'transcript_segments' => 'setTranscriptSegments'
    ];

    protected static $getters = [
        'blob_id' => 'getBlobId',
        'caption' => 'getCaption',
        'captured_at' => 'getCapturedAt',
        'customer_id' => 'getCustomerId',
        'device' => 'getDevice',
        'external_ref' => 'getExternalRef',
        'frame_count' => 'getFrameCount',
        'gps_lat' => 'getGpsLat',
        'gps_lon' => 'getGpsLon',
        'kind' => 'getKind',
        'metadata' => 'getMetadata',
        'ocr_text' => 'getOcrText',
        'synthetic' => 'getSynthetic',
        'tags' => 'getTags',
        'transcript_segments' => 'getTranscriptSegments'
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
        $this->setIfExists('blob_id', $data ?? [], null);
        $this->setIfExists('caption', $data ?? [], null);
        $this->setIfExists('captured_at', $data ?? [], null);
        $this->setIfExists('customer_id', $data ?? [], null);
        $this->setIfExists('device', $data ?? [], null);
        $this->setIfExists('external_ref', $data ?? [], null);
        $this->setIfExists('frame_count', $data ?? [], 0);
        $this->setIfExists('gps_lat', $data ?? [], null);
        $this->setIfExists('gps_lon', $data ?? [], null);
        $this->setIfExists('kind', $data ?? [], null);
        $this->setIfExists('metadata', $data ?? [], null);
        $this->setIfExists('ocr_text', $data ?? [], null);
        $this->setIfExists('synthetic', $data ?? [], null);
        $this->setIfExists('tags', $data ?? [], null);
        $this->setIfExists('transcript_segments', $data ?? [], 0);
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

    public function getCapturedAt()
    {
        return $this->container['captured_at'];
    }

    public function setCapturedAt($captured_at)
    {
        if (is_null($captured_at)) {
            array_push($this->openAPINullablesSetToNull, 'captured_at');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('captured_at', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['captured_at'] = $captured_at;

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

    public function getExternalRef()
    {
        return $this->container['external_ref'];
    }

    public function setExternalRef($external_ref)
    {
        if (is_null($external_ref)) {
            array_push($this->openAPINullablesSetToNull, 'external_ref');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('external_ref', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['external_ref'] = $external_ref;

        return $this;
    }

    public function getFrameCount()
    {
        return $this->container['frame_count'];
    }

    public function setFrameCount($frame_count)
    {
        if (is_null($frame_count)) {
            throw new \InvalidArgumentException('non-nullable frame_count cannot be null');
        }
        $this->container['frame_count'] = $frame_count;

        return $this;
    }

    public function getGpsLat()
    {
        return $this->container['gps_lat'];
    }

    public function setGpsLat($gps_lat)
    {
        if (is_null($gps_lat)) {
            array_push($this->openAPINullablesSetToNull, 'gps_lat');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('gps_lat', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['gps_lat'] = $gps_lat;

        return $this;
    }

    public function getGpsLon()
    {
        return $this->container['gps_lon'];
    }

    public function setGpsLon($gps_lon)
    {
        if (is_null($gps_lon)) {
            array_push($this->openAPINullablesSetToNull, 'gps_lon');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('gps_lon', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['gps_lon'] = $gps_lon;

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

    public function getOcrText()
    {
        return $this->container['ocr_text'];
    }

    public function setOcrText($ocr_text)
    {
        if (is_null($ocr_text)) {
            array_push($this->openAPINullablesSetToNull, 'ocr_text');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('ocr_text', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['ocr_text'] = $ocr_text;

        return $this;
    }

    public function getSynthetic()
    {
        return $this->container['synthetic'];
    }

    public function setSynthetic($synthetic)
    {
        if (is_null($synthetic)) {
            array_push($this->openAPINullablesSetToNull, 'synthetic');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('synthetic', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['synthetic'] = $synthetic;

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

    public function getTranscriptSegments()
    {
        return $this->container['transcript_segments'];
    }

    public function setTranscriptSegments($transcript_segments)
    {
        if (is_null($transcript_segments)) {
            throw new \InvalidArgumentException('non-nullable transcript_segments cannot be null');
        }
        $this->container['transcript_segments'] = $transcript_segments;

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

