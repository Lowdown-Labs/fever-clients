package com.lowdownlabs.fever.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import com.lowdownlabs.fever.ApiClient;

@JsonPropertyOrder({
  IngestSource.JSON_PROPERTY_CUSTOMER_ID,
  IngestSource.JSON_PROPERTY_S3_URI,
  IngestSource.JSON_PROPERTY_TARGET_RES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.25.0")
public class IngestSource {
  public static final String JSON_PROPERTY_CUSTOMER_ID = "customer_id";
  private JsonNullable<String> customerId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_S3_URI = "s3_uri";
  @javax.annotation.Nonnull
  private String s3Uri;

  public static final String JSON_PROPERTY_TARGET_RES = "target_res";
  private JsonNullable<Integer> targetRes = JsonNullable.<Integer>undefined();

  public IngestSource() {
  }

  public IngestSource customerId(@javax.annotation.Nullable String customerId) {
    this.customerId = JsonNullable.<String>of(customerId);
    return this;
  }

  @javax.annotation.Nullable
  @JsonIgnore
  public String getCustomerId() {
        return customerId.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCustomerId_JsonNullable() {
    return customerId;
  }

  @JsonProperty(JSON_PROPERTY_CUSTOMER_ID)
  public void setCustomerId_JsonNullable(JsonNullable<String> customerId) {
    this.customerId = customerId;
  }

  public void setCustomerId(@javax.annotation.Nullable String customerId) {
    this.customerId = JsonNullable.<String>of(customerId);
  }

  public IngestSource s3Uri(@javax.annotation.Nonnull String s3Uri) {
    this.s3Uri = s3Uri;
    return this;
  }

  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_S3_URI, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getS3Uri() {
    return s3Uri;
  }

  @JsonProperty(value = JSON_PROPERTY_S3_URI, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setS3Uri(@javax.annotation.Nonnull String s3Uri) {
    this.s3Uri = s3Uri;
  }

  public IngestSource targetRes(@javax.annotation.Nullable Integer targetRes) {
    this.targetRes = JsonNullable.<Integer>of(targetRes);
    return this;
  }

  @javax.annotation.Nullable
  @JsonIgnore
  public Integer getTargetRes() {
        return targetRes.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_TARGET_RES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getTargetRes_JsonNullable() {
    return targetRes;
  }

  @JsonProperty(JSON_PROPERTY_TARGET_RES)
  public void setTargetRes_JsonNullable(JsonNullable<Integer> targetRes) {
    this.targetRes = targetRes;
  }

  public void setTargetRes(@javax.annotation.Nullable Integer targetRes) {
    this.targetRes = JsonNullable.<Integer>of(targetRes);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IngestSource ingestSource = (IngestSource) o;
    return equalsNullable(this.customerId, ingestSource.customerId) &&
        Objects.equals(this.s3Uri, ingestSource.s3Uri) &&
        equalsNullable(this.targetRes, ingestSource.targetRes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(customerId), s3Uri, hashCodeNullable(targetRes));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IngestSource {\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    s3Uri: ").append(toIndentedString(s3Uri)).append("\n");
    sb.append("    targetRes: ").append(toIndentedString(targetRes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }

  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      prefix = "";
    } else {
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    if (getCustomerId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scustomer_id%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCustomerId()))));
    }

    if (getS3Uri() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ss3_uri%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getS3Uri()))));
    }

    if (getTargetRes() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%starget_res%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTargetRes()))));
    }

    return joiner.toString();
  }
}

