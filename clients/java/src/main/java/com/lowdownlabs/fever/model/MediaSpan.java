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
  MediaSpan.JSON_PROPERTY_END_MS,
  MediaSpan.JSON_PROPERTY_START_MS,
  MediaSpan.JSON_PROPERTY_TEXT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.25.0")
public class MediaSpan {
  public static final String JSON_PROPERTY_END_MS = "end_ms";
  @javax.annotation.Nonnull
  private Integer endMs;

  public static final String JSON_PROPERTY_START_MS = "start_ms";
  @javax.annotation.Nonnull
  private Integer startMs;

  public static final String JSON_PROPERTY_TEXT = "text";
  private JsonNullable<String> text = JsonNullable.<String>undefined();

  public MediaSpan() {
  }

  public MediaSpan endMs(@javax.annotation.Nonnull Integer endMs) {
    this.endMs = endMs;
    return this;
  }

  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_END_MS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getEndMs() {
    return endMs;
  }

  @JsonProperty(value = JSON_PROPERTY_END_MS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEndMs(@javax.annotation.Nonnull Integer endMs) {
    this.endMs = endMs;
  }

  public MediaSpan startMs(@javax.annotation.Nonnull Integer startMs) {
    this.startMs = startMs;
    return this;
  }

  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_START_MS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getStartMs() {
    return startMs;
  }

  @JsonProperty(value = JSON_PROPERTY_START_MS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStartMs(@javax.annotation.Nonnull Integer startMs) {
    this.startMs = startMs;
  }

  public MediaSpan text(@javax.annotation.Nullable String text) {
    this.text = JsonNullable.<String>of(text);
    return this;
  }

  @javax.annotation.Nullable
  @JsonIgnore
  public String getText() {
        return text.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_TEXT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getText_JsonNullable() {
    return text;
  }

  @JsonProperty(JSON_PROPERTY_TEXT)
  public void setText_JsonNullable(JsonNullable<String> text) {
    this.text = text;
  }

  public void setText(@javax.annotation.Nullable String text) {
    this.text = JsonNullable.<String>of(text);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaSpan mediaSpan = (MediaSpan) o;
    return Objects.equals(this.endMs, mediaSpan.endMs) &&
        Objects.equals(this.startMs, mediaSpan.startMs) &&
        equalsNullable(this.text, mediaSpan.text);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(endMs, startMs, hashCodeNullable(text));
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
    sb.append("class MediaSpan {\n");
    sb.append("    endMs: ").append(toIndentedString(endMs)).append("\n");
    sb.append("    startMs: ").append(toIndentedString(startMs)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

    if (getEndMs() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%send_ms%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEndMs()))));
    }

    if (getStartMs() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstart_ms%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStartMs()))));
    }

    if (getText() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stext%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getText()))));
    }

    return joiner.toString();
  }
}

