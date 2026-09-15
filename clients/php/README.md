# OpenAPIClient-php

The multimodal media database. Images, video, and audio in one table: hybrid vector + full-text search, dedupe, seek-to-moment video hits, whisper transcript spans. Tenancy, scale, and isolation are automatic; the tenant is taken from the API key.


## Installation & Usage

### Requirements

PHP 8.1 and later.

### Composer

To install the bindings via [Composer](https://getcomposer.org/), add the following to `composer.json`:

```json
{
  "repositories": [
    {
      "type": "vcs",
      "url": "https://github.com/GIT_USER_ID/GIT_REPO_ID.git"
    }
  ],
  "require": {
    "GIT_USER_ID/GIT_REPO_ID": "*@dev"
  }
}
```

Then run `composer install`

### Manual Installation

Download the files and include `autoload.php`:

```php
<?php
require_once('/path/to/OpenAPIClient-php/vendor/autoload.php');
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



// Configure Bearer authorization: bearerAuth
$config = LowdownLabs\Fever\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new LowdownLabs\Fever\Api\AuthApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);

try {
    $result = $apiInstance->whoami();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AuthApi->whoami: ', $e->getMessage(), PHP_EOL;
}

```

## API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthApi* | [**whoami**](docs/Api/AuthApi.md#whoami) | **GET** /v1/whoami | Report the calling key&#39;s role and customer scope
*CorpusApi* | [**corpusStats**](docs/Api/CorpusApi.md#corpusstats) | **GET** /v1/corpus | Corpus composition: per-kind counts and top autotags
*CustomersApi* | [**reassignCustomersBulk**](docs/Api/CustomersApi.md#reassigncustomersbulk) | **POST** /v1/customers/reassign-bulk | Reassign customer_id in bulk from a JSONL / CSV / Parquet mapping
*DefaultApi* | [**health**](docs/Api/DefaultApi.md#health) | **GET** /v1/health | Health check
*DefaultApi* | [**healthzHealthzGet**](docs/Api/DefaultApi.md#healthzhealthzget) | **GET** /healthz | Healthz
*DuplicatesApi* | [**findDuplicates**](docs/Api/DuplicatesApi.md#findduplicates) | **POST** /v1/duplicates | Find near-duplicate media clusters for a customer
*DuplicatesApi* | [**suggestedDedupThreshold**](docs/Api/DuplicatesApi.md#suggesteddedupthreshold) | **GET** /v1/duplicates/suggested-threshold | Suggest a duplicate-detection threshold from this customer&#39;s edge cosine distribution
*ExportApi* | [**exportTenant**](docs/Api/ExportApi.md#exporttenant) | **POST** /v1/export | Export the tenant&#39;s vectors and metadata to S3
*ExportApi* | [**importTenant**](docs/Api/ExportApi.md#importtenant) | **POST** /v1/import | Import vectors and metadata from a previous FEVER export in S3
*IngestApi* | [**ingestMedia**](docs/Api/IngestApi.md#ingestmedia) | **POST** /v1/media | Ingest one or many media items
*JobsApi* | [**cancelJob**](docs/Api/JobsApi.md#canceljob) | **POST** /v1/jobs/{job_id}/cancel | Cancel a pending or running ingest job
*JobsApi* | [**getJob**](docs/Api/JobsApi.md#getjob) | **GET** /v1/jobs/{job_id} | Get ingest job progress
*KeysApi* | [**createKey**](docs/Api/KeysApi.md#createkey) | **POST** /v1/keys | Mint an API key for this appliance
*KeysApi* | [**listKeys**](docs/Api/KeysApi.md#listkeys) | **GET** /v1/keys | List this appliance&#39;s API keys
*KeysApi* | [**revokeKey**](docs/Api/KeysApi.md#revokekey) | **POST** /v1/keys/{key_id}/revoke | Revoke an API key
*MediaApi* | [**getMediaBytes**](docs/Api/MediaApi.md#getmediabytes) | **GET** /v1/media/{blob_id}/bytes | Fetch an indexed media item&#39;s bytes (images normalized to JPEG)
*MediaApi* | [**getMediaInfo**](docs/Api/MediaApi.md#getmediainfo) | **GET** /v1/media/{blob_id} | Everything known about a blob: annotations, EXIF summary, media kind, derived artifact counts
*MediaApi* | [**listMediaFormats**](docs/Api/MediaApi.md#listmediaformats) | **GET** /v1/media/formats | Ingest capability: supported extensions per media family
*MediaApi* | [**listMediaFrames**](docs/Api/MediaApi.md#listmediaframes) | **GET** /v1/media/{blob_id}/frames | Sampled video frames for a parent blob
*MediaApi* | [**listMediaTranscript**](docs/Api/MediaApi.md#listmediatranscript) | **GET** /v1/media/{blob_id}/transcript | Whisper transcript segments for a parent blob (audio or video)
*QueryApi* | [**query**](docs/Api/QueryApi.md#query) | **POST** /v1/query | Run a read-only SQL SELECT over the corpus tables
*SearchApi* | [**search**](docs/Api/SearchApi.md#search) | **POST** /v1/search | Search by text or image

## Models

- [ApiKey](docs/Model/ApiKey.md)
- [CorpusStats](docs/Model/CorpusStats.md)
- [CorpusTag](docs/Model/CorpusTag.md)
- [CreateKeyRequest](docs/Model/CreateKeyRequest.md)
- [DuplicateCluster](docs/Model/DuplicateCluster.md)
- [DuplicatesRequest](docs/Model/DuplicatesRequest.md)
- [DuplicatesResponse](docs/Model/DuplicatesResponse.md)
- [ExportRequest](docs/Model/ExportRequest.md)
- [ExportResult](docs/Model/ExportResult.md)
- [HTTPValidationError](docs/Model/HTTPValidationError.md)
- [Health](docs/Model/Health.md)
- [ImportRequest](docs/Model/ImportRequest.md)
- [ImportResult](docs/Model/ImportResult.md)
- [IngestMedia](docs/Model/IngestMedia.md)
- [IngestRequest](docs/Model/IngestRequest.md)
- [IngestResult](docs/Model/IngestResult.md)
- [IngestSource](docs/Model/IngestSource.md)
- [IngestedMedia](docs/Model/IngestedMedia.md)
- [Job](docs/Model/Job.md)
- [KeyReveal](docs/Model/KeyReveal.md)
- [LocationInner](docs/Model/LocationInner.md)
- [MediaFormats](docs/Model/MediaFormats.md)
- [MediaFrame](docs/Model/MediaFrame.md)
- [MediaInfo](docs/Model/MediaInfo.md)
- [MediaSpan](docs/Model/MediaSpan.md)
- [QueryRequest](docs/Model/QueryRequest.md)
- [QueryResult](docs/Model/QueryResult.md)
- [SearchHit](docs/Model/SearchHit.md)
- [SearchRequest](docs/Model/SearchRequest.md)
- [TranscriptSegment](docs/Model/TranscriptSegment.md)
- [ValidationError](docs/Model/ValidationError.md)

## Authorization

Authentication schemes defined for the API:
### adminToken

- **Type**: Bearer authentication

### bearerAuth

- **Type**: Bearer authentication

## Tests

To run the tests, use:

```bash
composer install
vendor/bin/phpunit
```

## Author



## About this package

This PHP package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: `0.3.0`
    - Generator version: `7.25.0`
- Build package: `org.openapitools.codegen.languages.PhpClientCodegen`
