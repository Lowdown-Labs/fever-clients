# CorpusApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**corpusStats**](CorpusApi.md#corpusstats) | **GET** /v1/corpus | Corpus composition: per-kind counts and top autotags |



## corpusStats

> CorpusStats corpusStats(customerId, authorization)

Corpus composition: per-kind counts and top autotags

### Example

```ts
import {
  Configuration,
  CorpusApi,
} from 'fever-client';
import type { CorpusStatsRequest } from 'fever-client';

async function example() {
  console.log("🚀 Testing fever-client SDK...");
  const api = new CorpusApi();

  const body = {
    // string (optional)
    customerId: customerId_example,
    // string (optional)
    authorization: authorization_example,
  } satisfies CorpusStatsRequest;

  try {
    const data = await api.corpusStats(body);
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
| **customerId** | `string` |  | [Optional] [Defaults to `undefined`] |
| **authorization** | `string` |  | [Optional] [Defaults to `undefined`] |

### Return type

[**CorpusStats**](CorpusStats.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

