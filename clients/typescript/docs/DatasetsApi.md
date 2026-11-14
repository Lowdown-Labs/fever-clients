# DatasetsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addDatasetItems**](DatasetsApi.md#adddatasetitems) | **POST** /v1/datasets/{dataset_id}/items | Add blobs to a dataset |
| [**createDataset**](DatasetsApi.md#createdataset) | **POST** /v1/datasets | Create a dataset, optionally with initial items |
| [**deleteDataset**](DatasetsApi.md#deletedataset) | **DELETE** /v1/datasets/{dataset_id} | Delete a dataset (the blobs themselves stay indexed) |
| [**getDataset**](DatasetsApi.md#getdataset) | **GET** /v1/datasets/{dataset_id} | Get a dataset with its blob ids |
| [**listDatasets**](DatasetsApi.md#listdatasets) | **GET** /v1/datasets | List datasets visible to this key |
| [**removeDatasetItems**](DatasetsApi.md#removedatasetitems) | **DELETE** /v1/datasets/{dataset_id}/items | Remove items from a dataset; no body clears every item |



## addDatasetItems

> DatasetDetail addDatasetItems(datasetId, datasetItemsRequest)

Add blobs to a dataset

### Example

```ts
import {
  Configuration,
  DatasetsApi,
} from 'fever-client';
import type { AddDatasetItemsRequest } from 'fever-client';

async function example() {
  console.log("🚀 Testing fever-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: bearerAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new DatasetsApi(config);

  const body = {
    // number
    datasetId: 56,
    // DatasetItemsRequest
    datasetItemsRequest: ...,
  } satisfies AddDatasetItemsRequest;

  try {
    const data = await api.addDatasetItems(body);
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
| **datasetId** | `number` |  | [Defaults to `undefined`] |
| **datasetItemsRequest** | [DatasetItemsRequest](DatasetItemsRequest.md) |  | |

### Return type

[**DatasetDetail**](DatasetDetail.md)

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


## createDataset

> DatasetDetail createDataset(datasetCreate)

Create a dataset, optionally with initial items

### Example

```ts
import {
  Configuration,
  DatasetsApi,
} from 'fever-client';
import type { CreateDatasetRequest } from 'fever-client';

async function example() {
  console.log("🚀 Testing fever-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: bearerAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new DatasetsApi(config);

  const body = {
    // DatasetCreate
    datasetCreate: ...,
  } satisfies CreateDatasetRequest;

  try {
    const data = await api.createDataset(body);
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
| **datasetCreate** | [DatasetCreate](DatasetCreate.md) |  | |

### Return type

[**DatasetDetail**](DatasetDetail.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful Response |  -  |
| **422** | Validation Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## deleteDataset

> { [key: string]: any | null; } deleteDataset(datasetId)

Delete a dataset (the blobs themselves stay indexed)

### Example

```ts
import {
  Configuration,
  DatasetsApi,
} from 'fever-client';
import type { DeleteDatasetRequest } from 'fever-client';

async function example() {
  console.log("🚀 Testing fever-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: bearerAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new DatasetsApi(config);

  const body = {
    // number
    datasetId: 56,
  } satisfies DeleteDatasetRequest;

  try {
    const data = await api.deleteDataset(body);
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
| **datasetId** | `number` |  | [Defaults to `undefined`] |

### Return type

**{ [key: string]: any | null; }**

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


## getDataset

> DatasetDetail getDataset(datasetId)

Get a dataset with its blob ids

### Example

```ts
import {
  Configuration,
  DatasetsApi,
} from 'fever-client';
import type { GetDatasetRequest } from 'fever-client';

async function example() {
  console.log("🚀 Testing fever-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: bearerAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new DatasetsApi(config);

  const body = {
    // number
    datasetId: 56,
  } satisfies GetDatasetRequest;

  try {
    const data = await api.getDataset(body);
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
| **datasetId** | `number` |  | [Defaults to `undefined`] |

### Return type

[**DatasetDetail**](DatasetDetail.md)

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


## listDatasets

> Array&lt;Dataset&gt; listDatasets(customerId)

List datasets visible to this key

### Example

```ts
import {
  Configuration,
  DatasetsApi,
} from 'fever-client';
import type { ListDatasetsRequest } from 'fever-client';

async function example() {
  console.log("🚀 Testing fever-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: bearerAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new DatasetsApi(config);

  const body = {
    // string (optional)
    customerId: customerId_example,
  } satisfies ListDatasetsRequest;

  try {
    const data = await api.listDatasets(body);
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

[**Array&lt;Dataset&gt;**](Dataset.md)

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


## removeDatasetItems

> DatasetDetail removeDatasetItems(datasetId, datasetItemsRemove)

Remove items from a dataset; no body clears every item

### Example

```ts
import {
  Configuration,
  DatasetsApi,
} from 'fever-client';
import type { RemoveDatasetItemsRequest } from 'fever-client';

async function example() {
  console.log("🚀 Testing fever-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: bearerAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new DatasetsApi(config);

  const body = {
    // number
    datasetId: 56,
    // DatasetItemsRemove (optional)
    datasetItemsRemove: ...,
  } satisfies RemoveDatasetItemsRequest;

  try {
    const data = await api.removeDatasetItems(body);
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
| **datasetId** | `number` |  | [Defaults to `undefined`] |
| **datasetItemsRemove** | [DatasetItemsRemove](DatasetItemsRemove.md) |  | [Optional] |

### Return type

[**DatasetDetail**](DatasetDetail.md)

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

