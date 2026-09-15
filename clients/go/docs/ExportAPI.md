# \ExportAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ExportTenant**](ExportAPI.md#ExportTenant) | **Post** /v1/export | Export the tenant&#39;s vectors and metadata to S3
[**ImportTenant**](ExportAPI.md#ImportTenant) | **Post** /v1/import | Import vectors and metadata from a previous FEVER export in S3



## ExportTenant

> ExportResult ExportTenant(ctx).ExportRequest(exportRequest).Execute()

Export the tenant's vectors and metadata to S3

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
	exportRequest := *openapiclient.NewExportRequest("S3Uri_example") // ExportRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExportAPI.ExportTenant(context.Background()).ExportRequest(exportRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExportAPI.ExportTenant``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ExportTenant`: ExportResult
	fmt.Fprintf(os.Stdout, "Response from `ExportAPI.ExportTenant`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiExportTenantRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exportRequest** | [**ExportRequest**](ExportRequest.md) |  | 

### Return type

[**ExportResult**](ExportResult.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ImportTenant

> ImportResult ImportTenant(ctx).ImportRequest(importRequest).Execute()

Import vectors and metadata from a previous FEVER export in S3

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
	importRequest := *openapiclient.NewImportRequest("S3Uri_example") // ImportRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExportAPI.ImportTenant(context.Background()).ImportRequest(importRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExportAPI.ImportTenant``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ImportTenant`: ImportResult
	fmt.Fprintf(os.Stdout, "Response from `ExportAPI.ImportTenant`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiImportTenantRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **importRequest** | [**ImportRequest**](ImportRequest.md) |  | 

### Return type

[**ImportResult**](ImportResult.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

