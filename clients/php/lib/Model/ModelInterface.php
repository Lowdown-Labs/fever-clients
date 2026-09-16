<?php

namespace LowdownLabs\Fever\Model;

interface ModelInterface
{

    public function getModelName();

    public static function openAPITypes();

    public static function openAPIFormats();

    public static function attributeMap();

    public static function setters();

    public static function getters();

    public function listInvalidProperties();

    public function valid();

    public static function isNullable(string $property): bool;

    public function isNullableSetToNull(string $property): bool;
}
