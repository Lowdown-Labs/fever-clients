# DatasetsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addDatasetItems**](DatasetsApi.md#addDatasetItems) | **POST** /v1/datasets/{dataset_id}/items | Add blobs to a dataset |
| [**addDatasetItemsWithHttpInfo**](DatasetsApi.md#addDatasetItemsWithHttpInfo) | **POST** /v1/datasets/{dataset_id}/items | Add blobs to a dataset |
| [**createDataset**](DatasetsApi.md#createDataset) | **POST** /v1/datasets | Create a dataset, optionally with initial items |
| [**createDatasetWithHttpInfo**](DatasetsApi.md#createDatasetWithHttpInfo) | **POST** /v1/datasets | Create a dataset, optionally with initial items |
| [**deleteDataset**](DatasetsApi.md#deleteDataset) | **DELETE** /v1/datasets/{dataset_id} | Delete a dataset (the blobs themselves stay indexed) |
| [**deleteDatasetWithHttpInfo**](DatasetsApi.md#deleteDatasetWithHttpInfo) | **DELETE** /v1/datasets/{dataset_id} | Delete a dataset (the blobs themselves stay indexed) |
| [**getDataset**](DatasetsApi.md#getDataset) | **GET** /v1/datasets/{dataset_id} | Get a dataset with its blob ids |
| [**getDatasetWithHttpInfo**](DatasetsApi.md#getDatasetWithHttpInfo) | **GET** /v1/datasets/{dataset_id} | Get a dataset with its blob ids |
| [**listDatasets**](DatasetsApi.md#listDatasets) | **GET** /v1/datasets | List datasets visible to this key |
| [**listDatasetsWithHttpInfo**](DatasetsApi.md#listDatasetsWithHttpInfo) | **GET** /v1/datasets | List datasets visible to this key |
| [**removeDatasetItems**](DatasetsApi.md#removeDatasetItems) | **DELETE** /v1/datasets/{dataset_id}/items | Remove items from a dataset; no body clears every item |
| [**removeDatasetItemsWithHttpInfo**](DatasetsApi.md#removeDatasetItemsWithHttpInfo) | **DELETE** /v1/datasets/{dataset_id}/items | Remove items from a dataset; no body clears every item |



## addDatasetItems

> DatasetDetail addDatasetItems(datasetId, datasetItemsRequest)

Add blobs to a dataset

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.auth.*;
import com.lowdownlabs.fever.models.*;
import com.lowdownlabs.fever.api.DatasetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DatasetsApi apiInstance = new DatasetsApi(defaultClient);
        Integer datasetId = 56; // Integer | 
        DatasetItemsRequest datasetItemsRequest = new DatasetItemsRequest(); // DatasetItemsRequest | 
        try {
            DatasetDetail result = apiInstance.addDatasetItems(datasetId, datasetItemsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DatasetsApi#addDatasetItems");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **datasetId** | **Integer**|  | |
| **datasetItemsRequest** | [**DatasetItemsRequest**](DatasetItemsRequest.md)|  | |

### Return type

[**DatasetDetail**](DatasetDetail.md)


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

## addDatasetItemsWithHttpInfo

> ApiResponse<DatasetDetail> addDatasetItemsWithHttpInfo(datasetId, datasetItemsRequest)

Add blobs to a dataset

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.ApiResponse;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.auth.*;
import com.lowdownlabs.fever.models.*;
import com.lowdownlabs.fever.api.DatasetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DatasetsApi apiInstance = new DatasetsApi(defaultClient);
        Integer datasetId = 56; // Integer | 
        DatasetItemsRequest datasetItemsRequest = new DatasetItemsRequest(); // DatasetItemsRequest | 
        try {
            ApiResponse<DatasetDetail> response = apiInstance.addDatasetItemsWithHttpInfo(datasetId, datasetItemsRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DatasetsApi#addDatasetItems");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **datasetId** | **Integer**|  | |
| **datasetItemsRequest** | [**DatasetItemsRequest**](DatasetItemsRequest.md)|  | |

### Return type

ApiResponse<[**DatasetDetail**](DatasetDetail.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## createDataset

> DatasetDetail createDataset(datasetCreate)

Create a dataset, optionally with initial items

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.auth.*;
import com.lowdownlabs.fever.models.*;
import com.lowdownlabs.fever.api.DatasetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DatasetsApi apiInstance = new DatasetsApi(defaultClient);
        DatasetCreate datasetCreate = new DatasetCreate(); // DatasetCreate | 
        try {
            DatasetDetail result = apiInstance.createDataset(datasetCreate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DatasetsApi#createDataset");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **datasetCreate** | [**DatasetCreate**](DatasetCreate.md)|  | |

### Return type

[**DatasetDetail**](DatasetDetail.md)


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful Response |  -  |
| **422** | Validation Error |  -  |

## createDatasetWithHttpInfo

> ApiResponse<DatasetDetail> createDatasetWithHttpInfo(datasetCreate)

Create a dataset, optionally with initial items

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.ApiResponse;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.auth.*;
import com.lowdownlabs.fever.models.*;
import com.lowdownlabs.fever.api.DatasetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DatasetsApi apiInstance = new DatasetsApi(defaultClient);
        DatasetCreate datasetCreate = new DatasetCreate(); // DatasetCreate | 
        try {
            ApiResponse<DatasetDetail> response = apiInstance.createDatasetWithHttpInfo(datasetCreate);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DatasetsApi#createDataset");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **datasetCreate** | [**DatasetCreate**](DatasetCreate.md)|  | |

### Return type

ApiResponse<[**DatasetDetail**](DatasetDetail.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## deleteDataset

> Map<String, Object> deleteDataset(datasetId)

Delete a dataset (the blobs themselves stay indexed)

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.auth.*;
import com.lowdownlabs.fever.models.*;
import com.lowdownlabs.fever.api.DatasetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DatasetsApi apiInstance = new DatasetsApi(defaultClient);
        Integer datasetId = 56; // Integer | 
        try {
            Map<String, Object> result = apiInstance.deleteDataset(datasetId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DatasetsApi#deleteDataset");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **datasetId** | **Integer**|  | |

### Return type

**Map&lt;String, Object&gt;**


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

## deleteDatasetWithHttpInfo

> ApiResponse<Map<String, Object>> deleteDatasetWithHttpInfo(datasetId)

Delete a dataset (the blobs themselves stay indexed)

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.ApiResponse;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.auth.*;
import com.lowdownlabs.fever.models.*;
import com.lowdownlabs.fever.api.DatasetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DatasetsApi apiInstance = new DatasetsApi(defaultClient);
        Integer datasetId = 56; // Integer | 
        try {
            ApiResponse<Map<String, Object>> response = apiInstance.deleteDatasetWithHttpInfo(datasetId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DatasetsApi#deleteDataset");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **datasetId** | **Integer**|  | |

### Return type

ApiResponse<**Map&lt;String, Object&gt;**>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## getDataset

> DatasetDetail getDataset(datasetId)

Get a dataset with its blob ids

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.auth.*;
import com.lowdownlabs.fever.models.*;
import com.lowdownlabs.fever.api.DatasetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DatasetsApi apiInstance = new DatasetsApi(defaultClient);
        Integer datasetId = 56; // Integer | 
        try {
            DatasetDetail result = apiInstance.getDataset(datasetId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DatasetsApi#getDataset");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **datasetId** | **Integer**|  | |

### Return type

[**DatasetDetail**](DatasetDetail.md)


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

## getDatasetWithHttpInfo

> ApiResponse<DatasetDetail> getDatasetWithHttpInfo(datasetId)

Get a dataset with its blob ids

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.ApiResponse;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.auth.*;
import com.lowdownlabs.fever.models.*;
import com.lowdownlabs.fever.api.DatasetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DatasetsApi apiInstance = new DatasetsApi(defaultClient);
        Integer datasetId = 56; // Integer | 
        try {
            ApiResponse<DatasetDetail> response = apiInstance.getDatasetWithHttpInfo(datasetId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DatasetsApi#getDataset");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **datasetId** | **Integer**|  | |

### Return type

ApiResponse<[**DatasetDetail**](DatasetDetail.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## listDatasets

> List<Dataset> listDatasets(customerId)

List datasets visible to this key

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.auth.*;
import com.lowdownlabs.fever.models.*;
import com.lowdownlabs.fever.api.DatasetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DatasetsApi apiInstance = new DatasetsApi(defaultClient);
        String customerId = "customerId_example"; // String | 
        try {
            List<Dataset> result = apiInstance.listDatasets(customerId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DatasetsApi#listDatasets");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String**|  | [optional] |

### Return type

[**List&lt;Dataset&gt;**](Dataset.md)


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

## listDatasetsWithHttpInfo

> ApiResponse<List<Dataset>> listDatasetsWithHttpInfo(customerId)

List datasets visible to this key

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.ApiResponse;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.auth.*;
import com.lowdownlabs.fever.models.*;
import com.lowdownlabs.fever.api.DatasetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DatasetsApi apiInstance = new DatasetsApi(defaultClient);
        String customerId = "customerId_example"; // String | 
        try {
            ApiResponse<List<Dataset>> response = apiInstance.listDatasetsWithHttpInfo(customerId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DatasetsApi#listDatasets");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String**|  | [optional] |

### Return type

ApiResponse<[**List&lt;Dataset&gt;**](Dataset.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## removeDatasetItems

> DatasetDetail removeDatasetItems(datasetId, datasetItemsRemove)

Remove items from a dataset; no body clears every item

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.auth.*;
import com.lowdownlabs.fever.models.*;
import com.lowdownlabs.fever.api.DatasetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DatasetsApi apiInstance = new DatasetsApi(defaultClient);
        Integer datasetId = 56; // Integer | 
        DatasetItemsRemove datasetItemsRemove = new DatasetItemsRemove(); // DatasetItemsRemove | 
        try {
            DatasetDetail result = apiInstance.removeDatasetItems(datasetId, datasetItemsRemove);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DatasetsApi#removeDatasetItems");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **datasetId** | **Integer**|  | |
| **datasetItemsRemove** | [**DatasetItemsRemove**](DatasetItemsRemove.md)|  | [optional] |

### Return type

[**DatasetDetail**](DatasetDetail.md)


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

## removeDatasetItemsWithHttpInfo

> ApiResponse<DatasetDetail> removeDatasetItemsWithHttpInfo(datasetId, datasetItemsRemove)

Remove items from a dataset; no body clears every item

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.ApiResponse;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.auth.*;
import com.lowdownlabs.fever.models.*;
import com.lowdownlabs.fever.api.DatasetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DatasetsApi apiInstance = new DatasetsApi(defaultClient);
        Integer datasetId = 56; // Integer | 
        DatasetItemsRemove datasetItemsRemove = new DatasetItemsRemove(); // DatasetItemsRemove | 
        try {
            ApiResponse<DatasetDetail> response = apiInstance.removeDatasetItemsWithHttpInfo(datasetId, datasetItemsRemove);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DatasetsApi#removeDatasetItems");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **datasetId** | **Integer**|  | |
| **datasetItemsRemove** | [**DatasetItemsRemove**](DatasetItemsRemove.md)|  | [optional] |

### Return type

ApiResponse<[**DatasetDetail**](DatasetDetail.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

