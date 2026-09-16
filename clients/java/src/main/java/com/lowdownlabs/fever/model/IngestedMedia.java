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
  IngestedMedia.JSON_PROPERTY_BLOB_ID,
  IngestedMedia.JSON_PROPERTY_EXTERNAL_REF
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.25.0")
public class IngestedMedia {
  public static final String JSON_PROPERTY_BLOB_ID = "blob_id";
  @javax.annotation.Nonnull
  private Integer blobId;

  public static final String JSON_PROPERTY_EXTERNAL_REF = "external_ref";
  private JsonNullable<String> externalRef = JsonNullable.<String>undefined();

  public IngestedMedia() {
  }

  public IngestedMedia blobId(@javax.annotation.Nonnull Integer blobId) {
    this.blobId = blobId;
    return this;
  }

  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_BLOB_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getBlobId() {
    return blobId;
  }

  @JsonProperty(value = JSON_PROPERTY_BLOB_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBlobId(@javax.annotation.Nonnull Integer blobId) {
    this.blobId = blobId;
  }

  public IngestedMedia externalRef(@javax.annotation.Nullable String externalRef) {
    this.externalRef = JsonNullable.<String>of(externalRef);
    return this;
  }

  @javax.annotation.Nullable
  @JsonIgnore
  public String getExternalRef() {
        return externalRef.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_EXTERNAL_REF, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getExternalRef_JsonNullable() {
    return externalRef;
  }

  @JsonProperty(JSON_PROPERTY_EXTERNAL_REF)
  public void setExternalRef_JsonNullable(JsonNullable<String> externalRef) {
    this.externalRef = externalRef;
  }

  public void setExternalRef(@javax.annotation.Nullable String externalRef) {
    this.externalRef = JsonNullable.<String>of(externalRef);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IngestedMedia ingestedMedia = (IngestedMedia) o;
    return Objects.equals(this.blobId, ingestedMedia.blobId) &&
        equalsNullable(this.externalRef, ingestedMedia.externalRef);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(blobId, hashCodeNullable(externalRef));
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
    sb.append("class IngestedMedia {\n");
    sb.append("    blobId: ").append(toIndentedString(blobId)).append("\n");
    sb.append("    externalRef: ").append(toIndentedString(externalRef)).append("\n");
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

    if (getBlobId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sblob_id%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBlobId()))));
    }

    if (getExternalRef() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sexternal_ref%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getExternalRef()))));
    }

    return joiner.toString();
  }
}

