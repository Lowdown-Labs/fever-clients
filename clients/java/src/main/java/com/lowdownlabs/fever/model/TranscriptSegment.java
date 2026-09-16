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
  TranscriptSegment.JSON_PROPERTY_END_MS,
  TranscriptSegment.JSON_PROPERTY_SEQ,
  TranscriptSegment.JSON_PROPERTY_START_MS,
  TranscriptSegment.JSON_PROPERTY_TEXT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.25.0")
public class TranscriptSegment {
  public static final String JSON_PROPERTY_END_MS = "end_ms";
  @javax.annotation.Nullable
  private Integer endMs;

  public static final String JSON_PROPERTY_SEQ = "seq";
  @javax.annotation.Nonnull
  private Integer seq;

  public static final String JSON_PROPERTY_START_MS = "start_ms";
  @javax.annotation.Nullable
  private Integer startMs;

  public static final String JSON_PROPERTY_TEXT = "text";
  @javax.annotation.Nullable
  private String text;

  public TranscriptSegment() {
  }

  public TranscriptSegment endMs(@javax.annotation.Nullable Integer endMs) {
    this.endMs = endMs;
    return this;
  }

  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_END_MS, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getEndMs() {
    return endMs;
  }

  @JsonProperty(value = JSON_PROPERTY_END_MS, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEndMs(@javax.annotation.Nullable Integer endMs) {
    this.endMs = endMs;
  }

  public TranscriptSegment seq(@javax.annotation.Nonnull Integer seq) {
    this.seq = seq;
    return this;
  }

  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_SEQ, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getSeq() {
    return seq;
  }

  @JsonProperty(value = JSON_PROPERTY_SEQ, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSeq(@javax.annotation.Nonnull Integer seq) {
    this.seq = seq;
  }

  public TranscriptSegment startMs(@javax.annotation.Nullable Integer startMs) {
    this.startMs = startMs;
    return this;
  }

  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_START_MS, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getStartMs() {
    return startMs;
  }

  @JsonProperty(value = JSON_PROPERTY_START_MS, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStartMs(@javax.annotation.Nullable Integer startMs) {
    this.startMs = startMs;
  }

  public TranscriptSegment text(@javax.annotation.Nullable String text) {
    this.text = text;
    return this;
  }

  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TEXT, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getText() {
    return text;
  }

  @JsonProperty(value = JSON_PROPERTY_TEXT, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setText(@javax.annotation.Nullable String text) {
    this.text = text;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscriptSegment transcriptSegment = (TranscriptSegment) o;
    return Objects.equals(this.endMs, transcriptSegment.endMs) &&
        Objects.equals(this.seq, transcriptSegment.seq) &&
        Objects.equals(this.startMs, transcriptSegment.startMs) &&
        Objects.equals(this.text, transcriptSegment.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endMs, seq, startMs, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscriptSegment {\n");
    sb.append("    endMs: ").append(toIndentedString(endMs)).append("\n");
    sb.append("    seq: ").append(toIndentedString(seq)).append("\n");
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

    if (getSeq() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sseq%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSeq()))));
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

