package com.lowdownlabs.fever;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.openapitools.jackson.nullable.JsonNullableModule;

import java.io.InputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpConnectTimeoutException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;
import java.util.function.Consumer;
import java.util.Optional;
import java.util.zip.GZIPInputStream;
import java.util.stream.Collectors;

import static java.nio.charset.StandardCharsets.UTF_8;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.25.0")
public class ApiClient {

  protected HttpClient.Builder builder;
  protected ObjectMapper mapper;
  protected String scheme;
  protected String host;
  protected int port;
  protected String basePath;
  protected Consumer<HttpRequest.Builder> interceptor;
  protected Consumer<HttpResponse<InputStream>> responseInterceptor;
  protected Consumer<HttpResponse<InputStream>> asyncResponseInterceptor;
  protected Duration readTimeout;
  protected Duration connectTimeout;

  public static String valueToString(Object value) {
    if (value == null) {
      return "";
    }
    if (value instanceof OffsetDateTime) {
      return ((OffsetDateTime) value).format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    }
    return value.toString();
  }

  public static String urlEncode(String s) {
    return URLEncoder.encode(s, UTF_8).replaceAll("\\+", "%20");
  }

  public static List<Pair> parameterToPairs(String name, Object value) {
    if (name == null || name.isEmpty() || value == null) {
      return Collections.emptyList();
    }
    return Collections.singletonList(new Pair(urlEncode(name), urlEncode(valueToString(value))));
  }

  public static List<Pair> parameterToPairs(
      String collectionFormat, String name, Collection<?> values) {
    if (name == null || name.isEmpty() || values == null || values.isEmpty()) {
      return Collections.emptyList();
    }

    String format = collectionFormat == null || collectionFormat.isEmpty() ? "csv" : collectionFormat;

    if ("multi".equals(format)) {
      return values.stream()
          .map(value -> new Pair(urlEncode(name), urlEncode(valueToString(value))))
          .collect(Collectors.toList());
    }

    String delimiter;
    switch(format) {
      case "csv":
        delimiter = urlEncode(",");
        break;
      case "ssv":
        delimiter = urlEncode(" ");
        break;
      case "tsv":
        delimiter = urlEncode("\t");
        break;
      case "pipes":
        delimiter = urlEncode("|");
        break;
      default:
        throw new IllegalArgumentException("Illegal collection format: " + collectionFormat);
    }

    StringJoiner joiner = new StringJoiner(delimiter);
    for (Object value : values) {
      joiner.add(urlEncode(valueToString(value)));
    }

    return Collections.singletonList(new Pair(urlEncode(name), joiner.toString()));
  }

  public ApiClient() {
    this.builder = createDefaultHttpClientBuilder();
    this.mapper = createDefaultObjectMapper();
    updateBaseUri("http://localhost");
    interceptor = null;
    readTimeout = null;
    connectTimeout = null;
    responseInterceptor = null;
    asyncResponseInterceptor = null;
  }

  public ApiClient(HttpClient.Builder builder, ObjectMapper mapper, String baseUri) {
    this.builder = builder;
    this.mapper = mapper;
    updateBaseUri(baseUri != null ? baseUri : "http://localhost");
    interceptor = null;
    readTimeout = null;
    connectTimeout = null;
    responseInterceptor = null;
    asyncResponseInterceptor = null;
  }

  public static ObjectMapper createDefaultObjectMapper() {
    ObjectMapper mapper = new ObjectMapper();
    mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    mapper.configure(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE, false);
    mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    mapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
    mapper.enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING);
    mapper.disable(DeserializationFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE);
    mapper.registerModule(new JavaTimeModule());
    mapper.registerModule(new JsonNullableModule());
    mapper.registerModule(new RFC3339JavaTimeModule());
    return mapper;
  }

  protected final String getDefaultBaseUri() {
    return basePath;
  }

  public static HttpClient.Builder createDefaultHttpClientBuilder() {
    return HttpClient.newBuilder();
  }

  public final void updateBaseUri(String baseUri) {
    URI uri = URI.create(baseUri);
    scheme = uri.getScheme();
    host = uri.getHost();
    port = uri.getPort();
    basePath = uri.getRawPath();
  }

  public ApiClient setHttpClientBuilder(HttpClient.Builder builder) {
    this.builder = builder;
    return this;
  }

  public HttpClient getHttpClient() {
    return builder.build();
  }

  public ApiClient setObjectMapper(ObjectMapper mapper) {
    this.mapper = mapper;
    return this;
  }

  public ObjectMapper getObjectMapper() {
    return mapper.copy();
  }

  public ApiClient setHost(String host) {
    this.host = host;
    return this;
  }

  public ApiClient setPort(int port) {
    this.port = port;
    return this;
  }

  public ApiClient setBasePath(String basePath) {
    this.basePath = basePath;
    return this;
  }

  public String getBaseUri() {
    return scheme + "://" + host + (port == -1 ? "" : ":" + port) + basePath;
  }

  public ApiClient setScheme(String scheme){
    this.scheme = scheme;
    return this;
  }

  public ApiClient setRequestInterceptor(Consumer<HttpRequest.Builder> interceptor) {
    this.interceptor = interceptor;
    return this;
  }

  public Consumer<HttpRequest.Builder> getRequestInterceptor() {
    return interceptor;
  }

  public ApiClient setResponseInterceptor(Consumer<HttpResponse<InputStream>> interceptor) {
    this.responseInterceptor = interceptor;
    return this;
  }

  public Consumer<HttpResponse<InputStream>> getResponseInterceptor() {
    return responseInterceptor;
  }

  public ApiClient setAsyncResponseInterceptor(Consumer<HttpResponse<InputStream>> interceptor) {
    this.asyncResponseInterceptor = interceptor;
    return this;
  }

  public Consumer<HttpResponse<InputStream>> getAsyncResponseInterceptor() {
    return asyncResponseInterceptor;
  }

  public ApiClient setReadTimeout(Duration readTimeout) {
    this.readTimeout = readTimeout;
    return this;
  }

  public Duration getReadTimeout() {
    return readTimeout;
  }

  public ApiClient setConnectTimeout(Duration connectTimeout) {
    this.connectTimeout = connectTimeout;
    this.builder.connectTimeout(connectTimeout);
    return this;
  }

  public Duration getConnectTimeout() {
    return connectTimeout;
  }

  public static InputStream getResponseBody(HttpResponse<InputStream> response) throws IOException {
    if (response == null) {
      return null;
    }
    InputStream body = response.body();
    if (body == null) {
      return null;
    }
    Optional<String> encoding = response.headers().firstValue("Content-Encoding");
    if (encoding.isPresent()) {
      for (String token : encoding.get().split(",")) {
        if ("gzip".equalsIgnoreCase(token.trim())) {
          return new GZIPInputStream(body, 8192);
        }
      }
    }
    return body;
  }

}
