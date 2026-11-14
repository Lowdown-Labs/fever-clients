# \DatasetsAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AddDatasetItems**](DatasetsAPI.md#AddDatasetItems) | **Post** /v1/datasets/{dataset_id}/items | Add blobs to a dataset
[**CreateDataset**](DatasetsAPI.md#CreateDataset) | **Post** /v1/datasets | Create a dataset, optionally with initial items
[**DeleteDataset**](DatasetsAPI.md#DeleteDataset) | **Delete** /v1/datasets/{dataset_id} | Delete a dataset (the blobs themselves stay indexed)
[**GetDataset**](DatasetsAPI.md#GetDataset) | **Get** /v1/datasets/{dataset_id} | Get a dataset with its blob ids
[**ListDatasets**](DatasetsAPI.md#ListDatasets) | **Get** /v1/datasets | List datasets visible to this key
[**RemoveDatasetItems**](DatasetsAPI.md#RemoveDatasetItems) | **Delete** /v1/datasets/{dataset_id}/items | Remove items from a dataset; no body clears every item



## AddDatasetItems

> DatasetDetail AddDatasetItems(ctx, datasetId).DatasetItemsRequest(datasetItemsRequest).Execute()

Add blobs to a dataset

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/Lowdown-Labs/fever-clients/clients/go"
)

func main() {
	datasetId := int32(56) // int32 | 
	datasetItemsRequest := *openapiclient.NewDatasetItemsRequest([]int32{int32(123)}) // DatasetItemsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DatasetsAPI.AddDatasetItems(context.Background(), datasetId).DatasetItemsRequest(datasetItemsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DatasetsAPI.AddDatasetItems``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AddDatasetItems`: DatasetDetail
	fmt.Fprintf(os.Stdout, "Response from `DatasetsAPI.AddDatasetItems`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**datasetId** | **int32** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiAddDatasetItemsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **datasetItemsRequest** | [**DatasetItemsRequest**](DatasetItemsRequest.md) |  | 

### Return type

[**DatasetDetail**](DatasetDetail.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CreateDataset

> DatasetDetail CreateDataset(ctx).DatasetCreate(datasetCreate).Execute()

Create a dataset, optionally with initial items

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/Lowdown-Labs/fever-clients/clients/go"
)

func main() {
	datasetCreate := *openapiclient.NewDatasetCreate("Name_example") // DatasetCreate | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DatasetsAPI.CreateDataset(context.Background()).DatasetCreate(datasetCreate).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DatasetsAPI.CreateDataset``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CreateDataset`: DatasetDetail
	fmt.Fprintf(os.Stdout, "Response from `DatasetsAPI.CreateDataset`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCreateDatasetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetCreate** | [**DatasetCreate**](DatasetCreate.md) |  | 

### Return type

[**DatasetDetail**](DatasetDetail.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DeleteDataset

> map[string]*interface{} DeleteDataset(ctx, datasetId).Execute()

Delete a dataset (the blobs themselves stay indexed)

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/Lowdown-Labs/fever-clients/clients/go"
)

func main() {
	datasetId := int32(56) // int32 | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DatasetsAPI.DeleteDataset(context.Background(), datasetId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DatasetsAPI.DeleteDataset``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DeleteDataset`: map[string]*interface{}
	fmt.Fprintf(os.Stdout, "Response from `DatasetsAPI.DeleteDataset`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**datasetId** | **int32** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiDeleteDatasetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

**map[string]*interface{}**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetDataset

> DatasetDetail GetDataset(ctx, datasetId).Execute()

Get a dataset with its blob ids

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/Lowdown-Labs/fever-clients/clients/go"
)

func main() {
	datasetId := int32(56) // int32 | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DatasetsAPI.GetDataset(context.Background(), datasetId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DatasetsAPI.GetDataset``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetDataset`: DatasetDetail
	fmt.Fprintf(os.Stdout, "Response from `DatasetsAPI.GetDataset`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**datasetId** | **int32** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetDatasetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**DatasetDetail**](DatasetDetail.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListDatasets

> []Dataset ListDatasets(ctx).CustomerId(customerId).Execute()

List datasets visible to this key

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/Lowdown-Labs/fever-clients/clients/go"
)

func main() {
	customerId := "customerId_example" // string |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DatasetsAPI.ListDatasets(context.Background()).CustomerId(customerId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DatasetsAPI.ListDatasets``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ListDatasets`: []Dataset
	fmt.Fprintf(os.Stdout, "Response from `DatasetsAPI.ListDatasets`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiListDatasetsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **string** |  | 

### Return type

[**[]Dataset**](Dataset.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## RemoveDatasetItems

> DatasetDetail RemoveDatasetItems(ctx, datasetId).DatasetItemsRemove(datasetItemsRemove).Execute()

Remove items from a dataset; no body clears every item

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/Lowdown-Labs/fever-clients/clients/go"
)

func main() {
	datasetId := int32(56) // int32 | 
	datasetItemsRemove := *openapiclient.NewDatasetItemsRemove() // DatasetItemsRemove |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DatasetsAPI.RemoveDatasetItems(context.Background(), datasetId).DatasetItemsRemove(datasetItemsRemove).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DatasetsAPI.RemoveDatasetItems``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `RemoveDatasetItems`: DatasetDetail
	fmt.Fprintf(os.Stdout, "Response from `DatasetsAPI.RemoveDatasetItems`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**datasetId** | **int32** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiRemoveDatasetItemsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **datasetItemsRemove** | [**DatasetItemsRemove**](DatasetItemsRemove.md) |  | 

### Return type

[**DatasetDetail**](DatasetDetail.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

