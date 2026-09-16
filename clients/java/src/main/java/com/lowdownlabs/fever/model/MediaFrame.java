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
  MediaFrame.JSON_PROPERTY_FRAME_NO,
  MediaFrame.JSON_PROPERTY_TS_MS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.25.0")
public class MediaFrame {
  public static final String JSON_PROPERTY_FRAME_NO = "frame_no";
  @javax.annotation.Nonnull
  private Integer frameNo;

  public static final String JSON_PROPERTY_TS_MS = "ts_ms";
  @javax.annotation.Nonnull
  private Integer tsMs;

  public MediaFrame() {
  }

  public MediaFrame frameNo(@javax.annotation.Nonnull Integer frameNo) {
    this.frameNo = frameNo;
    return this;
  }

  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_FRAME_NO, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getFrameNo() {
    return frameNo;
  }

  @JsonProperty(value = JSON_PROPERTY_FRAME_NO, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFrameNo(@javax.annotation.Nonnull Integer frameNo) {
    this.frameNo = frameNo;
  }

  public MediaFrame tsMs(@javax.annotation.Nonnull Integer tsMs) {
    this.tsMs = tsMs;
    return this;
  }

  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_TS_MS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getTsMs() {
    return tsMs;
  }

  @JsonProperty(value = JSON_PROPERTY_TS_MS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTsMs(@javax.annotation.Nonnull Integer tsMs) {
    this.tsMs = tsMs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaFrame mediaFrame = (MediaFrame) o;
    return Objects.equals(this.frameNo, mediaFrame.frameNo) &&
        Objects.equals(this.tsMs, mediaFrame.tsMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frameNo, tsMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaFrame {\n");
    sb.append("    frameNo: ").append(toIndentedString(frameNo)).append("\n");
    sb.append("    tsMs: ").append(toIndentedString(tsMs)).append("\n");
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

    if (getFrameNo() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sframe_no%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFrameNo()))));
    }

    if (getTsMs() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sts_ms%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTsMs()))));
    }

    return joiner.toString();
  }
}

