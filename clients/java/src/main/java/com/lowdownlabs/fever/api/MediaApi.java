package com.lowdownlabs.fever.api;

import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.ApiResponse;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.Pair;

import com.lowdownlabs.fever.model.HTTPValidationError;
import com.lowdownlabs.fever.model.MediaFormats;
import com.lowdownlabs.fever.model.MediaFrame;
import com.lowdownlabs.fever.model.MediaInfo;
import com.lowdownlabs.fever.model.TranscriptSegment;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;

import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.http.HttpRequest;
import java.nio.channels.Channels;
import java.nio.channels.Pipe;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.25.0")
public class MediaApi {

  private static class HttpRequestBuilderExtensions {

    static HttpRequest.Builder withAdditionalHeaders(HttpRequest.Builder builder, Map<String, String> headers) {
        if (headers != null) {
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                builder.header(entry.getKey(), entry.getValue());
            }
        }
        return builder;
    }
  }
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<InputStream>> memberVarAsyncResponseInterceptor;

  public MediaApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MediaApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
    memberVarAsyncResponseInterceptor = apiClient.getAsyncResponseInterceptor();
  }

  protected ApiException getApiException(String operationId, HttpResponse<InputStream> response) throws IOException {
    InputStream responseBody = ApiClient.getResponseBody(response);
    String body = null;
    try {
      body = responseBody == null ? null : new String(responseBody.readAllBytes());
    } finally {
      if (responseBody != null) {
        responseBody.close();
      }
    }
    String message = formatExceptionMessage(operationId, response.statusCode(), body);
    return new ApiException(response.statusCode(), message, response.headers(), body);
  }

  private String formatExceptionMessage(String operationId, int statusCode, String body) {
    if (body == null || body.isEmpty()) {
      body = "[no body]";
    }
    return operationId + " call failed with: " + statusCode + " - " + body;
  }

  public File downloadFileFromResponse(HttpResponse<InputStream> response, InputStream responseBody) throws ApiException {
    if (responseBody == null) {
      throw new ApiException(new IOException("Response body is empty"));
    }
    try {
      File file = prepareDownloadFile(response);
      java.nio.file.Files.copy(responseBody, file.toPath(), java.nio.file.StandardCopyOption.REPLACE_EXISTING);
      return file;
    } catch (IOException e) {
      throw new ApiException(e);
    }
  }

  private File prepareDownloadFile(HttpResponse<InputStream> response) throws IOException {
    String filename = null;
    java.util.Optional<String> contentDisposition = response.headers().firstValue("Content-Disposition");
    if (contentDisposition.isPresent() && !"".equals(contentDisposition.get())) {
      java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("filename=['\"]?([^'\"\\s]+)['\"]?");
      java.util.regex.Matcher matcher = pattern.matcher(contentDisposition.get());
      if (matcher.find())
        filename = matcher.group(1);
    }
    File file = null;
    if (filename != null) {
      java.nio.file.Path tempDir = java.nio.file.Files.createTempDirectory("swagger-gen-native");
      java.nio.file.Path filePath = java.nio.file.Files.createFile(tempDir.resolve(filename));
      file = filePath.toFile();
      tempDir.toFile().deleteOnExit();
      file.deleteOnExit();
    } else {
      file = java.nio.file.Files.createTempFile("download-", "").toFile();
      file.deleteOnExit();
    }
    return file;
  }

  public Object getMediaBytes(@javax.annotation.Nonnull Integer blobId, @javax.annotation.Nullable Integer maxDim, @javax.annotation.Nullable Integer waveform) throws ApiException {
    return getMediaBytes(blobId, maxDim, waveform, null);
  }

  public Object getMediaBytes(@javax.annotation.Nonnull Integer blobId, @javax.annotation.Nullable Integer maxDim, @javax.annotation.Nullable Integer waveform, Map<String, String> headers) throws ApiException {
    ApiResponse<Object> localVarResponse = getMediaBytesWithHttpInfo(blobId, maxDim, waveform, headers);
    return localVarResponse.getData();
  }

  public ApiResponse<Object> getMediaBytesWithHttpInfo(@javax.annotation.Nonnull Integer blobId, @javax.annotation.Nullable Integer maxDim, @javax.annotation.Nullable Integer waveform) throws ApiException {
    return getMediaBytesWithHttpInfo(blobId, maxDim, waveform, null);
  }

  public ApiResponse<Object> getMediaBytesWithHttpInfo(@javax.annotation.Nonnull Integer blobId, @javax.annotation.Nullable Integer maxDim, @javax.annotation.Nullable Integer waveform, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getMediaBytesRequestBuilder(blobId, maxDim, waveform, headers);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      InputStream localVarResponseBody = null;
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getMediaBytes", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<Object>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        String responseBody = new String(localVarResponseBody.readAllBytes());
        Object responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<Object>() {});

        return new ApiResponse<Object>(
            localVarResponse.statusCode(),
            localVarResponse.headers().map(),
            responseValue
        );
      } finally {
        if (localVarResponseBody != null) {
          localVarResponseBody.close();
        }
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder getMediaBytesRequestBuilder(@javax.annotation.Nonnull Integer blobId, @javax.annotation.Nullable Integer maxDim, @javax.annotation.Nullable Integer waveform, Map<String, String> headers) throws ApiException {
    if (blobId == null) {
      throw new ApiException(400, "Missing the required parameter 'blobId' when calling getMediaBytes");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/media/{blob_id}/bytes"
        .replace("{blob_id}", ApiClient.urlEncode(blobId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "max_dim";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("max_dim", maxDim));
    localVarQueryParameterBaseName = "waveform";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("waveform", waveform));

    if (!localVarQueryParams.isEmpty() || localVarQueryStringJoiner.length() != 0) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      if (localVarQueryStringJoiner.length() != 0) {
        queryJoiner.add(localVarQueryStringJoiner.toString());
      }
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json, image/jpeg, image/png");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    localVarRequestBuilder = HttpRequestBuilderExtensions.withAdditionalHeaders(localVarRequestBuilder, headers);
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  public MediaInfo getMediaInfo(@javax.annotation.Nonnull Integer blobId, @javax.annotation.Nullable String customerId) throws ApiException {
    return getMediaInfo(blobId, customerId, null);
  }

  public MediaInfo getMediaInfo(@javax.annotation.Nonnull Integer blobId, @javax.annotation.Nullable String customerId, Map<String, String> headers) throws ApiException {
    ApiResponse<MediaInfo> localVarResponse = getMediaInfoWithHttpInfo(blobId, customerId, headers);
    return localVarResponse.getData();
  }

  public ApiResponse<MediaInfo> getMediaInfoWithHttpInfo(@javax.annotation.Nonnull Integer blobId, @javax.annotation.Nullable String customerId) throws ApiException {
    return getMediaInfoWithHttpInfo(blobId, customerId, null);
  }

  public ApiResponse<MediaInfo> getMediaInfoWithHttpInfo(@javax.annotation.Nonnull Integer blobId, @javax.annotation.Nullable String customerId, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getMediaInfoRequestBuilder(blobId, customerId, headers);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      InputStream localVarResponseBody = null;
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getMediaInfo", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<MediaInfo>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        String responseBody = new String(localVarResponseBody.readAllBytes());
        MediaInfo responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<MediaInfo>() {});

        return new ApiResponse<MediaInfo>(
            localVarResponse.statusCode(),
            localVarResponse.headers().map(),
            responseValue
        );
      } finally {
        if (localVarResponseBody != null) {
          localVarResponseBody.close();
        }
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder getMediaInfoRequestBuilder(@javax.annotation.Nonnull Integer blobId, @javax.annotation.Nullable String customerId, Map<String, String> headers) throws ApiException {
    if (blobId == null) {
      throw new ApiException(400, "Missing the required parameter 'blobId' when calling getMediaInfo");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/media/{blob_id}"
        .replace("{blob_id}", ApiClient.urlEncode(blobId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "customer_id";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("customer_id", customerId));

    if (!localVarQueryParams.isEmpty() || localVarQueryStringJoiner.length() != 0) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      if (localVarQueryStringJoiner.length() != 0) {
        queryJoiner.add(localVarQueryStringJoiner.toString());
      }
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    localVarRequestBuilder = HttpRequestBuilderExtensions.withAdditionalHeaders(localVarRequestBuilder, headers);
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  public MediaFormats listMediaFormats() throws ApiException {
    return listMediaFormats(null);
  }

  public MediaFormats listMediaFormats(Map<String, String> headers) throws ApiException {
    ApiResponse<MediaFormats> localVarResponse = listMediaFormatsWithHttpInfo(headers);
    return localVarResponse.getData();
  }

  public ApiResponse<MediaFormats> listMediaFormatsWithHttpInfo() throws ApiException {
    return listMediaFormatsWithHttpInfo(null);
  }

  public ApiResponse<MediaFormats> listMediaFormatsWithHttpInfo(Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = listMediaFormatsRequestBuilder(headers);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      InputStream localVarResponseBody = null;
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("listMediaFormats", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<MediaFormats>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        String responseBody = new String(localVarResponseBody.readAllBytes());
        MediaFormats responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<MediaFormats>() {});

        return new ApiResponse<MediaFormats>(
            localVarResponse.statusCode(),
            localVarResponse.headers().map(),
            responseValue
        );
      } finally {
        if (localVarResponseBody != null) {
          localVarResponseBody.close();
        }
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder listMediaFormatsRequestBuilder(Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/media/formats";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    localVarRequestBuilder = HttpRequestBuilderExtensions.withAdditionalHeaders(localVarRequestBuilder, headers);
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  public List<MediaFrame> listMediaFrames(@javax.annotation.Nonnull Integer blobId, @javax.annotation.Nullable String customerId) throws ApiException {
    return listMediaFrames(blobId, customerId, null);
  }

  public List<MediaFrame> listMediaFrames(@javax.annotation.Nonnull Integer blobId, @javax.annotation.Nullable String customerId, Map<String, String> headers) throws ApiException {
    ApiResponse<List<MediaFrame>> localVarResponse = listMediaFramesWithHttpInfo(blobId, customerId, headers);
    return localVarResponse.getData();
  }

  public ApiResponse<List<MediaFrame>> listMediaFramesWithHttpInfo(@javax.annotation.Nonnull Integer blobId, @javax.annotation.Nullable String customerId) throws ApiException {
    return listMediaFramesWithHttpInfo(blobId, customerId, null);
  }

  public ApiResponse<List<MediaFrame>> listMediaFramesWithHttpInfo(@javax.annotation.Nonnull Integer blobId, @javax.annotation.Nullable String customerId, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = listMediaFramesRequestBuilder(blobId, customerId, headers);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      InputStream localVarResponseBody = null;
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("listMediaFrames", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<List<MediaFrame>>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        String responseBody = new String(localVarResponseBody.readAllBytes());
        List<MediaFrame> responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<List<MediaFrame>>() {});

        return new ApiResponse<List<MediaFrame>>(
            localVarResponse.statusCode(),
            localVarResponse.headers().map(),
            responseValue
        );
      } finally {
        if (localVarResponseBody != null) {
          localVarResponseBody.close();
        }
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder listMediaFramesRequestBuilder(@javax.annotation.Nonnull Integer blobId, @javax.annotation.Nullable String customerId, Map<String, String> headers) throws ApiException {
    if (blobId == null) {
      throw new ApiException(400, "Missing the required parameter 'blobId' when calling listMediaFrames");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/media/{blob_id}/frames"
        .replace("{blob_id}", ApiClient.urlEncode(blobId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "customer_id";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("customer_id", customerId));

    if (!localVarQueryParams.isEmpty() || localVarQueryStringJoiner.length() != 0) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      if (localVarQueryStringJoiner.length() != 0) {
        queryJoiner.add(localVarQueryStringJoiner.toString());
      }
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    localVarRequestBuilder = HttpRequestBuilderExtensions.withAdditionalHeaders(localVarRequestBuilder, headers);
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  public List<TranscriptSegment> listMediaTranscript(@javax.annotation.Nonnull Integer blobId, @javax.annotation.Nullable String customerId) throws ApiException {
    return listMediaTranscript(blobId, customerId, null);
  }

  public List<TranscriptSegment> listMediaTranscript(@javax.annotation.Nonnull Integer blobId, @javax.annotation.Nullable String customerId, Map<String, String> headers) throws ApiException {
    ApiResponse<List<TranscriptSegment>> localVarResponse = listMediaTranscriptWithHttpInfo(blobId, customerId, headers);
    return localVarResponse.getData();
  }

  public ApiResponse<List<TranscriptSegment>> listMediaTranscriptWithHttpInfo(@javax.annotation.Nonnull Integer blobId, @javax.annotation.Nullable String customerId) throws ApiException {
    return listMediaTranscriptWithHttpInfo(blobId, customerId, null);
  }

  public ApiResponse<List<TranscriptSegment>> listMediaTranscriptWithHttpInfo(@javax.annotation.Nonnull Integer blobId, @javax.annotation.Nullable String customerId, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = listMediaTranscriptRequestBuilder(blobId, customerId, headers);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      InputStream localVarResponseBody = null;
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("listMediaTranscript", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<List<TranscriptSegment>>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        String responseBody = new String(localVarResponseBody.readAllBytes());
        List<TranscriptSegment> responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<List<TranscriptSegment>>() {});

        return new ApiResponse<List<TranscriptSegment>>(
            localVarResponse.statusCode(),
            localVarResponse.headers().map(),
            responseValue
        );
      } finally {
        if (localVarResponseBody != null) {
          localVarResponseBody.close();
        }
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder listMediaTranscriptRequestBuilder(@javax.annotation.Nonnull Integer blobId, @javax.annotation.Nullable String customerId, Map<String, String> headers) throws ApiException {
    if (blobId == null) {
      throw new ApiException(400, "Missing the required parameter 'blobId' when calling listMediaTranscript");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/media/{blob_id}/transcript"
        .replace("{blob_id}", ApiClient.urlEncode(blobId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "customer_id";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("customer_id", customerId));

    if (!localVarQueryParams.isEmpty() || localVarQueryStringJoiner.length() != 0) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      if (localVarQueryStringJoiner.length() != 0) {
        queryJoiner.add(localVarQueryStringJoiner.toString());
      }
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    localVarRequestBuilder = HttpRequestBuilderExtensions.withAdditionalHeaders(localVarRequestBuilder, headers);
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

}
