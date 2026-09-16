<?php

namespace LowdownLabs\Fever;

use ArrayAccess;
use DateTime;
use GuzzleHttp\Psr7\Utils;
use Psr\Http\Message\StreamInterface;
use SplFileObject;
use LowdownLabs\Fever\Model\ModelInterface;

class FormDataProcessor
{

    public bool $has_file = false;

    public function prepare(array $values): array
    {
        $this->has_file = false;
        $result = [];

        foreach ($values as $k => $v) {
            if ($v === null) {
                continue;
            }

            $result[$k] = $this->makeFormSafe($v);
        }

        return $result;
    }

    public static function flatten(array $source, string $start = ''): array
    {
        $opt = [
            'prefix'          => '[',
            'suffix'          => ']',
            'suffix-end'      => true,
            'prefix-list'     => '[',
            'suffix-list'     => ']',
            'suffix-list-end' => true,
        ];

        if ($start === '') {
            $currentPrefix    = '';
            $currentSuffix    = '';
            $currentSuffixEnd = false;
        } elseif (array_is_list($source)) {
            $currentPrefix    = $opt['prefix-list'];
            $currentSuffix    = $opt['suffix-list'];
            $currentSuffixEnd = $opt['suffix-list-end'];
        } else {
            $currentPrefix    = $opt['prefix'];
            $currentSuffix    = $opt['suffix'];
            $currentSuffixEnd = $opt['suffix-end'];
        }

        $currentName = $start;
        $result = [];

        foreach ($source as $key => $val) {
            $currentName .= $currentPrefix.$key;

            if (is_array($val) && !empty($val)) {
                $currentName .= $currentSuffix;
                $result += self::flatten($val, $currentName);
            } else {
                if ($currentSuffixEnd) {
                    $currentName .= $currentSuffix;
                }

                if (is_resource($val)) {
                    $result[$currentName] = $val;
                } else {
                    $result[$currentName] = ObjectSerializer::toString($val);
                }
            }

            $currentName = $start;
        }

        return $result;
    }

    protected function makeFormSafe($value)
    {
        if ($value instanceof SplFileObject) {
            return $this->processFiles([$value])[0];
        }

        if (is_resource($value)) {
            $this->has_file = true;

            return $value;
        }

        if ($value instanceof ModelInterface) {
            return $this->processModel($value);
        }

        if (is_array($value) || (is_object($value) && !$value instanceof \DateTimeInterface)) {
            $data = [];

            foreach ($value as $k => $v) {
                $data[$k] = $this->makeFormSafe($v);
            }

            return $data;
        }

        return ObjectSerializer::toString($value);
    }

    protected function processModel(ModelInterface $model): array
    {
        $result = [];

        foreach ($model::openAPITypes() as $name => $type) {
            $value = $model->offsetGet($name);

            if ($value === null) {
                continue;
            }

            if (strpos($type, '\SplFileObject') !== false) {
                $file = is_array($value) ? $value : [$value];
                $result[$name] = $this->processFiles($file);

                continue;
            }

            if ($value instanceof ModelInterface) {
                $result[$name] = $this->processModel($value);

                continue;
            }

            if (is_array($value) || is_object($value)) {
                $result[$name] = $this->makeFormSafe($value);

                continue;
            }

            $result[$name] = ObjectSerializer::toString($value);
        }

        return $result;
    }

    protected function processFiles(array $files): array
    {
        $this->has_file = true;

        $result = [];

        foreach ($files as $i => $file) {
            if (is_array($file)) {
                $result[$i] = $this->processFiles($file);

                continue;
            }

            if ($file instanceof StreamInterface) {
                $result[$i] = $file;

                continue;
            }

            if ($file instanceof SplFileObject) {
                $result[$i] = $this->tryFopen($file);
            }
        }

        return $result;
    }

    private function tryFopen(SplFileObject $file)
    {
        return Utils::tryFopen($file->getRealPath(), 'rb');
    }
}
