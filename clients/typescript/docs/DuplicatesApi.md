# DuplicatesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**findDuplicates**](DuplicatesApi.md#findduplicates) | **POST** /v1/duplicates | Find near-duplicate media clusters for a customer |
| [**suggestedDedupThreshold**](DuplicatesApi.md#suggesteddedupthreshold) | **GET** /v1/duplicates/suggested-threshold | Suggest a duplicate-detection threshold from this customer\&#39;s edge cosine distribution |



## findDuplicates

> DuplicatesResponse findDuplicates(duplicatesRequest, authorization)

Find near-duplicate media clusters for a customer

Find near-duplicate clusters. Scoped to one customer, this reads the edge set maintained at ingest (millisecond answers; edges exist down to cosine 0.80). An admin key with no customer_id scans live across all customers; passing customer_ids narrows that live scan to a handful of accounts. Both admin shapes see cross-customer duplicates. No delete or keep recommendation is made: the clusters are yours to act on.

### Example

```ts
import {
  Configuration,
  DuplicatesApi,
} from 'fever-client';
import type { FindDuplicatesRequest } from 'fever-client';

async function example() {
  console.log("🚀 Testing fever-client SDK...");
  const api = new DuplicatesApi();

  const body = {
    // DuplicatesRequest
    duplicatesRequest: ...,
    // string (optional)
    authorization: authorization_example,
  } satisfies FindDuplicatesRequest;

  try {
    const data = await api.findDuplicates(body);
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
| **duplicatesRequest** | [DuplicatesRequest](DuplicatesRequest.md) |  | |
| **authorization** | `string` |  | [Optional] [Defaults to `undefined`] |

### Return type

[**DuplicatesResponse**](DuplicatesResponse.md)

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


## suggestedDedupThreshold

> any suggestedDedupThreshold(customerId, authorization)

Suggest a duplicate-detection threshold from this customer\&#39;s edge cosine distribution

### Example

```ts
import {
  Configuration,
  DuplicatesApi,
} from 'fever-client';
import type { SuggestedDedupThresholdRequest } from 'fever-client';

async function example() {
  console.log("🚀 Testing fever-client SDK...");
  const api = new DuplicatesApi();

  const body = {
    // string (optional)
    customerId: customerId_example,
    // string (optional)
    authorization: authorization_example,
  } satisfies SuggestedDedupThresholdRequest;

  try {
    const data = await api.suggestedDedupThreshold(body);
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

**any**

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

