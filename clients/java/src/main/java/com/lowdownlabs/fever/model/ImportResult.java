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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import com.lowdownlabs.fever.ApiClient;

@JsonPropertyOrder({
  ImportResult.JSON_PROPERTY_IMPORTED,
  ImportResult.JSON_PROPERTY_S3_URI
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.25.0")
public class ImportResult {
  public static final String JSON_PROPERTY_IMPORTED = "imported";
  @javax.annotation.Nonnull
  private Integer imported;

  public static final String JSON_PROPERTY_S3_URI = "s3_uri";
  @javax.annotation.Nonnull
  private String s3Uri;

  public ImportResult() {
  }

  public ImportResult imported(@javax.annotation.Nonnull Integer imported) {
    this.imported = imported;
    return this;
  }

  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_IMPORTED, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getImported() {
    return imported;
  }

  @JsonProperty(value = JSON_PROPERTY_IMPORTED, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setImported(@javax.annotation.Nonnull Integer imported) {
    this.imported = imported;
  }

  public ImportResult s3Uri(@javax.annotation.Nonnull String s3Uri) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportResult importResult = (ImportResult) o;
    return Objects.equals(this.imported, importResult.imported) &&
        Objects.equals(this.s3Uri, importResult.s3Uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imported, s3Uri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportResult {\n");
    sb.append("    imported: ").append(toIndentedString(imported)).append("\n");
    sb.append("    s3Uri: ").append(toIndentedString(s3Uri)).append("\n");
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

    if (getImported() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%simported%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getImported()))));
    }

    if (getS3Uri() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ss3_uri%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getS3Uri()))));
    }

    return joiner.toString();
  }
}

