# DuplicatesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**findDuplicates**](DuplicatesApi.md#findduplicates) | **POST** /v1/duplicates | Find near-duplicate media clusters for a customer |
| [**suggestedDedupThreshold**](DuplicatesApi.md#suggesteddedupthreshold) | **GET** /v1/duplicates/suggested-threshold | Suggest a duplicate-detection threshold from this customer\&#39;s edge cosine distribution |



## findDuplicates

> DuplicatesResponse findDuplicates(duplicatesRequest)

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
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: bearerAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new DuplicatesApi(config);

  const body = {
    // DuplicatesRequest
    duplicatesRequest: ...,
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

### Return type

[**DuplicatesResponse**](DuplicatesResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

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

> any suggestedDedupThreshold(customerId)

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
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: bearerAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new DuplicatesApi(config);

  const body = {
    // string (optional)
    customerId: customerId_example,
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

### Return type

**any**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

