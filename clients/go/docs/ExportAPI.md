# \ExportAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ExportTenant**](ExportAPI.md#ExportTenant) | **Post** /v1/export | Export the tenant&#39;s vectors and metadata to S3
[**ImportTenant**](ExportAPI.md#ImportTenant) | **Post** /v1/import | Import vectors and metadata from a previous FEVER export in S3



## ExportTenant

> ExportResult ExportTenant(ctx).ExportRequest(exportRequest).Authorization(authorization).Execute()

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
	authorization := "authorization_example" // string |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExportAPI.ExportTenant(context.Background()).ExportRequest(exportRequest).Authorization(authorization).Execute()
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
 **authorization** | **string** |  | 

### Return type

[**ExportResult**](ExportResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ImportTenant

> ImportResult ImportTenant(ctx).ImportRequest(importRequest).Authorization(authorization).Execute()

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
	authorization := "authorization_example" // string |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExportAPI.ImportTenant(context.Background()).ImportRequest(importRequest).Authorization(authorization).Execute()
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
 **authorization** | **string** |  | 

### Return type

[**ImportResult**](ImportResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

