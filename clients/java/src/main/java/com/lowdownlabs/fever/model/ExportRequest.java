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
  ExportRequest.JSON_PROPERTY_CUSTOMER_ID,
  ExportRequest.JSON_PROPERTY_FORMAT,
  ExportRequest.JSON_PROPERTY_KIND,
  ExportRequest.JSON_PROPERTY_S3_URI,
  ExportRequest.JSON_PROPERTY_TAG
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.25.0")
public class ExportRequest {
  public static final String JSON_PROPERTY_CUSTOMER_ID = "customer_id";
  private JsonNullable<String> customerId = JsonNullable.<String>undefined();

  public enum FormatEnum {
    NDJSON(String.valueOf("ndjson")),

    PARQUET(String.valueOf("parquet"));

    private String value;

    FormatEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FormatEnum fromValue(String value) {
      for (FormatEnum b : FormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_FORMAT = "format";
  @javax.annotation.Nullable
  private FormatEnum format = FormatEnum.NDJSON;

  public enum KindEnum {
    IMAGE(String.valueOf("image")),

    VIDEO(String.valueOf("video")),

    AUDIO(String.valueOf("audio")),

    PDF(String.valueOf("pdf")),

    DOC(String.valueOf("doc")),

    NOTE(String.valueOf("note"));

    private String value;

    KindEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static KindEnum fromValue(String value) {
      for (KindEnum b : KindEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_KIND = "kind";
  private JsonNullable<KindEnum> kind = JsonNullable.<KindEnum>undefined();

  public static final String JSON_PROPERTY_S3_URI = "s3_uri";
  @javax.annotation.Nonnull
  private String s3Uri;

  public static final String JSON_PROPERTY_TAG = "tag";
  private JsonNullable<String> tag = JsonNullable.<String>undefined();

  public ExportRequest() {
  }

  public ExportRequest customerId(@javax.annotation.Nullable String customerId) {
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

  public ExportRequest format(@javax.annotation.Nullable FormatEnum format) {
    this.format = format;
    return this;
  }

  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FORMAT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FormatEnum getFormat() {
    return format;
  }

  @JsonProperty(value = JSON_PROPERTY_FORMAT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFormat(@javax.annotation.Nullable FormatEnum format) {
    this.format = format;
  }

  public ExportRequest kind(@javax.annotation.Nullable KindEnum kind) {
    this.kind = JsonNullable.<KindEnum>of(kind);
    return this;
  }

  @javax.annotation.Nullable
  @JsonIgnore
  public KindEnum getKind() {
        return kind.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_KIND, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<KindEnum> getKind_JsonNullable() {
    return kind;
  }

  @JsonProperty(JSON_PROPERTY_KIND)
  public void setKind_JsonNullable(JsonNullable<KindEnum> kind) {
    this.kind = kind;
  }

  public void setKind(@javax.annotation.Nullable KindEnum kind) {
    this.kind = JsonNullable.<KindEnum>of(kind);
  }

  public ExportRequest s3Uri(@javax.annotation.Nonnull String s3Uri) {
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

  public ExportRequest tag(@javax.annotation.Nullable String tag) {
    this.tag = JsonNullable.<String>of(tag);
    return this;
  }

  @javax.annotation.Nullable
  @JsonIgnore
  public String getTag() {
        return tag.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_TAG, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTag_JsonNullable() {
    return tag;
  }

  @JsonProperty(JSON_PROPERTY_TAG)
  public void setTag_JsonNullable(JsonNullable<String> tag) {
    this.tag = tag;
  }

  public void setTag(@javax.annotation.Nullable String tag) {
    this.tag = JsonNullable.<String>of(tag);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportRequest exportRequest = (ExportRequest) o;
    return equalsNullable(this.customerId, exportRequest.customerId) &&
        Objects.equals(this.format, exportRequest.format) &&
        equalsNullable(this.kind, exportRequest.kind) &&
        Objects.equals(this.s3Uri, exportRequest.s3Uri) &&
        equalsNullable(this.tag, exportRequest.tag);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(customerId), format, hashCodeNullable(kind), s3Uri, hashCodeNullable(tag));
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
    sb.append("class ExportRequest {\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    s3Uri: ").append(toIndentedString(s3Uri)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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

    if (getFormat() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sformat%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFormat()))));
    }

    if (getKind() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%skind%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getKind()))));
    }

    if (getS3Uri() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ss3_uri%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getS3Uri()))));
    }

    if (getTag() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stag%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTag()))));
    }

    return joiner.toString();
  }
}

