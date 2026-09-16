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
  CorpusTag.JSON_PROPERTY_COUNT,
  CorpusTag.JSON_PROPERTY_TAG
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.25.0")
public class CorpusTag {
  public static final String JSON_PROPERTY_COUNT = "count";
  @javax.annotation.Nonnull
  private Integer count;

  public static final String JSON_PROPERTY_TAG = "tag";
  @javax.annotation.Nonnull
  private String tag;

  public CorpusTag() {
  }

  public CorpusTag count(@javax.annotation.Nonnull Integer count) {
    this.count = count;
    return this;
  }

  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_COUNT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getCount() {
    return count;
  }

  @JsonProperty(value = JSON_PROPERTY_COUNT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCount(@javax.annotation.Nonnull Integer count) {
    this.count = count;
  }

  public CorpusTag tag(@javax.annotation.Nonnull String tag) {
    this.tag = tag;
    return this;
  }

  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_TAG, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTag() {
    return tag;
  }

  @JsonProperty(value = JSON_PROPERTY_TAG, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTag(@javax.annotation.Nonnull String tag) {
    this.tag = tag;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CorpusTag corpusTag = (CorpusTag) o;
    return Objects.equals(this.count, corpusTag.count) &&
        Objects.equals(this.tag, corpusTag.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, tag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorpusTag {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

    if (getCount() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scount%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCount()))));
    }

    if (getTag() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stag%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTag()))));
    }

    return joiner.toString();
  }
}

