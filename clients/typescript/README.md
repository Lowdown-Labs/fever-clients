# fever-client@0.3.0

A TypeScript SDK client for the localhost API.

## Usage

First, install the SDK from npm.

```bash
npm install fever-client --save
```

Next, try it out.


```ts
import {
  Configuration,
  AuthApi,
} from 'fever-client';
import type { WhoamiRequest } from 'fever-client';

async function example() {
  console.log("🚀 Testing fever-client SDK...");
  const api = new AuthApi();

  const body = {
    // string (optional)
    authorization: authorization_example,
  } satisfies WhoamiRequest;

  try {
    const data = await api.whoami(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```


## Documentation

### API Endpoints

All URIs are relative to *http://localhost*

| Class | Method | HTTP request | Description
| ----- | ------ | ------------ | -------------
*AuthApi* | [**whoami**](docs/AuthApi.md#whoami) | **GET** /v1/whoami | Report the calling key\&#39;s role and customer scope
*CorpusApi* | [**corpusStats**](docs/CorpusApi.md#corpusstats) | **GET** /v1/corpus | Corpus composition: per-kind counts and top autotags
*CustomersApi* | [**reassignCustomersBulk**](docs/CustomersApi.md#reassigncustomersbulk) | **POST** /v1/customers/reassign-bulk | Reassign customer_id in bulk from a JSONL / CSV / Parquet mapping
*DefaultApi* | [**health**](docs/DefaultApi.md#health) | **GET** /v1/health | Health check
*DefaultApi* | [**healthzHealthzGet**](docs/DefaultApi.md#healthzhealthzget) | **GET** /healthz | Healthz
*DuplicatesApi* | [**findDuplicates**](docs/DuplicatesApi.md#findduplicates) | **POST** /v1/duplicates | Find near-duplicate media clusters for a customer
*DuplicatesApi* | [**suggestedDedupThreshold**](docs/DuplicatesApi.md#suggesteddedupthreshold) | **GET** /v1/duplicates/suggested-threshold | Suggest a duplicate-detection threshold from this customer\&#39;s edge cosine distribution
*ExportApi* | [**exportTenant**](docs/ExportApi.md#exporttenant) | **POST** /v1/export | Export the tenant\&#39;s vectors and metadata to S3
*ExportApi* | [**importTenant**](docs/ExportApi.md#importtenant) | **POST** /v1/import | Import vectors and metadata from a previous FEVER export in S3
*IngestApi* | [**ingestMedia**](docs/IngestApi.md#ingestmedia) | **POST** /v1/media | Ingest one or many media items
*JobsApi* | [**cancelJob**](docs/JobsApi.md#canceljob) | **POST** /v1/jobs/{job_id}/cancel | Cancel a pending or running ingest job
*JobsApi* | [**getJob**](docs/JobsApi.md#getjob) | **GET** /v1/jobs/{job_id} | Get ingest job progress
*KeysApi* | [**createKey**](docs/KeysApi.md#createkeyoperation) | **POST** /v1/keys | Mint an API key for this appliance
*KeysApi* | [**listKeys**](docs/KeysApi.md#listkeys) | **GET** /v1/keys | List this appliance\&#39;s API keys
*KeysApi* | [**revokeKey**](docs/KeysApi.md#revokekey) | **POST** /v1/keys/{key_id}/revoke | Revoke an API key
*MediaApi* | [**getMediaBytes**](docs/MediaApi.md#getmediabytes) | **GET** /v1/media/{blob_id}/bytes | Fetch an indexed media item\&#39;s bytes (images normalized to JPEG)
*MediaApi* | [**getMediaInfo**](docs/MediaApi.md#getmediainfo) | **GET** /v1/media/{blob_id} | Everything known about a blob: annotations, EXIF summary, media kind, derived artifact counts
*MediaApi* | [**listMediaFormats**](docs/MediaApi.md#listmediaformats) | **GET** /v1/media/formats | Ingest capability: supported extensions per media family
*MediaApi* | [**listMediaFrames**](docs/MediaApi.md#listmediaframes) | **GET** /v1/media/{blob_id}/frames | Sampled video frames for a parent blob
*MediaApi* | [**listMediaTranscript**](docs/MediaApi.md#listmediatranscript) | **GET** /v1/media/{blob_id}/transcript | Whisper transcript segments for a parent blob (audio or video)
*QueryApi* | [**query**](docs/QueryApi.md#queryoperation) | **POST** /v1/query | Run a read-only SQL SELECT over the corpus tables
*SearchApi* | [**search**](docs/SearchApi.md#searchoperation) | **POST** /v1/search | Search by text or image


### Models

- [ApiKey](docs/ApiKey.md)
- [CorpusStats](docs/CorpusStats.md)
- [CorpusTag](docs/CorpusTag.md)
- [CreateKeyRequest](docs/CreateKeyRequest.md)
- [DuplicateCluster](docs/DuplicateCluster.md)
- [DuplicatesRequest](docs/DuplicatesRequest.md)
- [DuplicatesResponse](docs/DuplicatesResponse.md)
- [ExportRequest](docs/ExportRequest.md)
- [ExportResult](docs/ExportResult.md)
- [HTTPValidationError](docs/HTTPValidationError.md)
- [Health](docs/Health.md)
- [ImportRequest](docs/ImportRequest.md)
- [ImportResult](docs/ImportResult.md)
- [IngestMedia](docs/IngestMedia.md)
- [IngestRequest](docs/IngestRequest.md)
- [IngestResult](docs/IngestResult.md)
- [IngestSource](docs/IngestSource.md)
- [IngestedMedia](docs/IngestedMedia.md)
- [Job](docs/Job.md)
- [KeyReveal](docs/KeyReveal.md)
- [LocationInner](docs/LocationInner.md)
- [MediaFormats](docs/MediaFormats.md)
- [MediaFrame](docs/MediaFrame.md)
- [MediaInfo](docs/MediaInfo.md)
- [MediaSpan](docs/MediaSpan.md)
- [QueryRequest](docs/QueryRequest.md)
- [QueryResult](docs/QueryResult.md)
- [SearchHit](docs/SearchHit.md)
- [SearchRequest](docs/SearchRequest.md)
- [TranscriptSegment](docs/TranscriptSegment.md)
- [ValidationError](docs/ValidationError.md)

### Authorization

Endpoints do not require authorization.


## About

This TypeScript SDK client supports the [Fetch API](https://fetch.spec.whatwg.org/)
and is automatically generated by the
[OpenAPI Generator](https://openapi-generator.tech) project:

- API version: `0.3.0`
- Package version: `0.3.0`
- Generator version: `7.25.0`
- Build package: `org.openapitools.codegen.languages.TypeScriptFetchClientCodegen`

The generated npm module supports the following:

- Environments
  * Node.js
  * Webpack
  * Browserify
- Language levels
  * ES5 - you must have a Promises/A+ library installed
  * ES6
- Module systems
  * CommonJS
  * ES6 module system


## Development

### Building

To build the TypeScript source code, you need to have Node.js and npm installed.
After cloning the repository, navigate to the project directory and run:

```bash
npm install
npm run build
```

### Publishing

Once you've built the package, you can publish it to npm:

```bash
npm publish
```

## License

[]()
