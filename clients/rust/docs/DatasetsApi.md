# \DatasetsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_dataset_items**](DatasetsApi.md#add_dataset_items) | **POST** /v1/datasets/{dataset_id}/items | Add blobs to a dataset
[**create_dataset**](DatasetsApi.md#create_dataset) | **POST** /v1/datasets | Create a dataset, optionally with initial items
[**delete_dataset**](DatasetsApi.md#delete_dataset) | **DELETE** /v1/datasets/{dataset_id} | Delete a dataset (the blobs themselves stay indexed)
[**get_dataset**](DatasetsApi.md#get_dataset) | **GET** /v1/datasets/{dataset_id} | Get a dataset with its blob ids
[**list_datasets**](DatasetsApi.md#list_datasets) | **GET** /v1/datasets | List datasets visible to this key
[**remove_dataset_items**](DatasetsApi.md#remove_dataset_items) | **DELETE** /v1/datasets/{dataset_id}/items | Remove items from a dataset; no body clears every item



## add_dataset_items

> models::DatasetDetail add_dataset_items(dataset_id, dataset_items_request)
Add blobs to a dataset

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**dataset_id** | **i32** |  | [required] |
**dataset_items_request** | [**DatasetItemsRequest**](DatasetItemsRequest.md) |  | [required] |

### Return type

[**models::DatasetDetail**](DatasetDetail.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## create_dataset

> models::DatasetDetail create_dataset(dataset_create)
Create a dataset, optionally with initial items

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**dataset_create** | [**DatasetCreate**](DatasetCreate.md) |  | [required] |

### Return type

[**models::DatasetDetail**](DatasetDetail.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## delete_dataset

> std::collections::HashMap<String, serde_json::Value> delete_dataset(dataset_id)
Delete a dataset (the blobs themselves stay indexed)

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**dataset_id** | **i32** |  | [required] |

### Return type

[**std::collections::HashMap<String, serde_json::Value>**](serde_json::Value.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_dataset

> models::DatasetDetail get_dataset(dataset_id)
Get a dataset with its blob ids

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**dataset_id** | **i32** |  | [required] |

### Return type

[**models::DatasetDetail**](DatasetDetail.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## list_datasets

> Vec<models::Dataset> list_datasets(customer_id)
List datasets visible to this key

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**customer_id** | Option<**String**> |  |  |

### Return type

[**Vec<models::Dataset>**](Dataset.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## remove_dataset_items

> models::DatasetDetail remove_dataset_items(dataset_id, dataset_items_remove)
Remove items from a dataset; no body clears every item

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**dataset_id** | **i32** |  | [required] |
**dataset_items_remove** | Option<[**DatasetItemsRemove**](DatasetItemsRemove.md)> |  |  |

### Return type

[**models::DatasetDetail**](DatasetDetail.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

