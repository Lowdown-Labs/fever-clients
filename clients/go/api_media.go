package fever

import (
	"bytes"
	"context"
	"io"
	"net/http"
	"net/url"
	"strings"
)

type MediaAPI interface {

	GetMediaBytes(ctx context.Context, blobId int32) ApiGetMediaBytesRequest

	GetMediaBytesExecute(r ApiGetMediaBytesRequest) (interface{}, *http.Response, error)

	GetMediaInfo(ctx context.Context, blobId int32) ApiGetMediaInfoRequest

	GetMediaInfoExecute(r ApiGetMediaInfoRequest) (*MediaInfo, *http.Response, error)

	ListMediaFormats(ctx context.Context) ApiListMediaFormatsRequest

	ListMediaFormatsExecute(r ApiListMediaFormatsRequest) (*MediaFormats, *http.Response, error)

	ListMediaFrames(ctx context.Context, blobId int32) ApiListMediaFramesRequest

	ListMediaFramesExecute(r ApiListMediaFramesRequest) ([]MediaFrame, *http.Response, error)

	ListMediaTranscript(ctx context.Context, blobId int32) ApiListMediaTranscriptRequest

	ListMediaTranscriptExecute(r ApiListMediaTranscriptRequest) ([]TranscriptSegment, *http.Response, error)
}

type MediaAPIService service

type ApiGetMediaBytesRequest struct {
	ctx context.Context
	ApiService MediaAPI
	blobId int32
	maxDim *int32
	waveform *int32
}

func (r ApiGetMediaBytesRequest) MaxDim(maxDim int32) ApiGetMediaBytesRequest {
	r.maxDim = &maxDim
	return r
}

func (r ApiGetMediaBytesRequest) Waveform(waveform int32) ApiGetMediaBytesRequest {
	r.waveform = &waveform
	return r
}

func (r ApiGetMediaBytesRequest) Execute() (interface{}, *http.Response, error) {
	return r.ApiService.GetMediaBytesExecute(r)
}

func (a *MediaAPIService) GetMediaBytes(ctx context.Context, blobId int32) ApiGetMediaBytesRequest {
	return ApiGetMediaBytesRequest{
		ApiService: a,
		ctx: ctx,
		blobId: blobId,
	}
}

func (a *MediaAPIService) GetMediaBytesExecute(r ApiGetMediaBytesRequest) (interface{}, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  interface{}
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "MediaAPIService.GetMediaBytes")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/v1/media/{blob_id}/bytes"
	localVarPath = strings.Replace(localVarPath, "{"+"blob_id"+"}", url.PathEscape(parameterValueToString(r.blobId, "blobId")), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if r.maxDim != nil {
		parameterAddToHeaderOrQuery(localVarQueryParams, "max_dim", r.maxDim, "form", "")
	} else {
		var defaultValue int32 = 1280
		parameterAddToHeaderOrQuery(localVarQueryParams, "max_dim", defaultValue, "form", "")
		r.maxDim = &defaultValue
	}
	if r.waveform != nil {
		parameterAddToHeaderOrQuery(localVarQueryParams, "waveform", r.waveform, "form", "")
	} else {
		var defaultValue int32 = 0
		parameterAddToHeaderOrQuery(localVarQueryParams, "waveform", defaultValue, "form", "")
		r.waveform = &defaultValue
	}
	localVarHTTPContentTypes := []string{}

	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	localVarHTTPHeaderAccepts := []string{"application/json", "image/jpeg", "image/png"}

	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := io.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = io.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		if localVarHTTPResponse.StatusCode == 422 {
			var v HTTPValidationError
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
					newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
					newErr.model = v
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}

type ApiGetMediaInfoRequest struct {
	ctx context.Context
	ApiService MediaAPI
	blobId int32
	customerId *string
}

func (r ApiGetMediaInfoRequest) CustomerId(customerId string) ApiGetMediaInfoRequest {
	r.customerId = &customerId
	return r
}

func (r ApiGetMediaInfoRequest) Execute() (*MediaInfo, *http.Response, error) {
	return r.ApiService.GetMediaInfoExecute(r)
}

func (a *MediaAPIService) GetMediaInfo(ctx context.Context, blobId int32) ApiGetMediaInfoRequest {
	return ApiGetMediaInfoRequest{
		ApiService: a,
		ctx: ctx,
		blobId: blobId,
	}
}

func (a *MediaAPIService) GetMediaInfoExecute(r ApiGetMediaInfoRequest) (*MediaInfo, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *MediaInfo
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "MediaAPIService.GetMediaInfo")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/v1/media/{blob_id}"
	localVarPath = strings.Replace(localVarPath, "{"+"blob_id"+"}", url.PathEscape(parameterValueToString(r.blobId, "blobId")), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if r.customerId != nil {
		parameterAddToHeaderOrQuery(localVarQueryParams, "customer_id", r.customerId, "form", "")
	}
	localVarHTTPContentTypes := []string{}

	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	localVarHTTPHeaderAccepts := []string{"application/json"}

	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := io.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = io.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		if localVarHTTPResponse.StatusCode == 422 {
			var v HTTPValidationError
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
					newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
					newErr.model = v
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}

type ApiListMediaFormatsRequest struct {
	ctx context.Context
	ApiService MediaAPI
}

func (r ApiListMediaFormatsRequest) Execute() (*MediaFormats, *http.Response, error) {
	return r.ApiService.ListMediaFormatsExecute(r)
}

func (a *MediaAPIService) ListMediaFormats(ctx context.Context) ApiListMediaFormatsRequest {
	return ApiListMediaFormatsRequest{
		ApiService: a,
		ctx: ctx,
	}
}

func (a *MediaAPIService) ListMediaFormatsExecute(r ApiListMediaFormatsRequest) (*MediaFormats, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *MediaFormats
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "MediaAPIService.ListMediaFormats")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/v1/media/formats"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	localVarHTTPContentTypes := []string{}

	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	localVarHTTPHeaderAccepts := []string{"application/json"}

	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := io.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = io.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}

type ApiListMediaFramesRequest struct {
	ctx context.Context
	ApiService MediaAPI
	blobId int32
	customerId *string
}

func (r ApiListMediaFramesRequest) CustomerId(customerId string) ApiListMediaFramesRequest {
	r.customerId = &customerId
	return r
}

func (r ApiListMediaFramesRequest) Execute() ([]MediaFrame, *http.Response, error) {
	return r.ApiService.ListMediaFramesExecute(r)
}

func (a *MediaAPIService) ListMediaFrames(ctx context.Context, blobId int32) ApiListMediaFramesRequest {
	return ApiListMediaFramesRequest{
		ApiService: a,
		ctx: ctx,
		blobId: blobId,
	}
}

func (a *MediaAPIService) ListMediaFramesExecute(r ApiListMediaFramesRequest) ([]MediaFrame, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  []MediaFrame
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "MediaAPIService.ListMediaFrames")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/v1/media/{blob_id}/frames"
	localVarPath = strings.Replace(localVarPath, "{"+"blob_id"+"}", url.PathEscape(parameterValueToString(r.blobId, "blobId")), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if r.customerId != nil {
		parameterAddToHeaderOrQuery(localVarQueryParams, "customer_id", r.customerId, "form", "")
	}
	localVarHTTPContentTypes := []string{}

	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	localVarHTTPHeaderAccepts := []string{"application/json"}

	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := io.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = io.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		if localVarHTTPResponse.StatusCode == 422 {
			var v HTTPValidationError
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
					newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
					newErr.model = v
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}

type ApiListMediaTranscriptRequest struct {
	ctx context.Context
	ApiService MediaAPI
	blobId int32
	customerId *string
}

func (r ApiListMediaTranscriptRequest) CustomerId(customerId string) ApiListMediaTranscriptRequest {
	r.customerId = &customerId
	return r
}

func (r ApiListMediaTranscriptRequest) Execute() ([]TranscriptSegment, *http.Response, error) {
	return r.ApiService.ListMediaTranscriptExecute(r)
}

func (a *MediaAPIService) ListMediaTranscript(ctx context.Context, blobId int32) ApiListMediaTranscriptRequest {
	return ApiListMediaTranscriptRequest{
		ApiService: a,
		ctx: ctx,
		blobId: blobId,
	}
}

func (a *MediaAPIService) ListMediaTranscriptExecute(r ApiListMediaTranscriptRequest) ([]TranscriptSegment, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  []TranscriptSegment
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "MediaAPIService.ListMediaTranscript")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/v1/media/{blob_id}/transcript"
	localVarPath = strings.Replace(localVarPath, "{"+"blob_id"+"}", url.PathEscape(parameterValueToString(r.blobId, "blobId")), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if r.customerId != nil {
		parameterAddToHeaderOrQuery(localVarQueryParams, "customer_id", r.customerId, "form", "")
	}
	localVarHTTPContentTypes := []string{}

	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	localVarHTTPHeaderAccepts := []string{"application/json"}

	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := io.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = io.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		if localVarHTTPResponse.StatusCode == 422 {
			var v HTTPValidationError
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
					newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
					newErr.model = v
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}
