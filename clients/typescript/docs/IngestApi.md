# IngestApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ingestMedia**](IngestApi.md#ingestmedia) | **POST** /v1/media | Ingest one or many media items |



## ingestMedia

> IngestResult ingestMedia(ingestRequest, authorization)

Ingest one or many media items

Throw 1..N media items over the wall. Small inline batches are embedded and indexed synchronously and return blob ids; large batches or an s3:// source return a Job you poll at /v1/jobs/{id}. Tenant is taken from the API key.

### Example

```ts
import {
  Configuration,
  IngestApi,
} from 'fever-client';
import type { IngestMediaRequest } from 'fever-client';

async function example() {
  console.log("🚀 Testing fever-client SDK...");
  const api = new IngestApi();

  const body = {
    // IngestRequest
    ingestRequest: ...,
    // string (optional)
    authorization: authorization_example,
  } satisfies IngestMediaRequest;

  try {
    const data = await api.ingestMedia(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ingestRequest** | [IngestRequest](IngestRequest.md) |  | |
| **authorization** | `string` |  | [Optional] [Defaults to `undefined`] |

### Return type

[**IngestResult**](IngestResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

