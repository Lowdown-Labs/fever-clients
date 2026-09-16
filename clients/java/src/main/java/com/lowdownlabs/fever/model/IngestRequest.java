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
import com.lowdownlabs.fever.model.IngestMedia;
import com.lowdownlabs.fever.model.IngestSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import com.lowdownlabs.fever.ApiClient;

@JsonPropertyOrder({
  IngestRequest.JSON_PROPERTY_MEDIA,
  IngestRequest.JSON_PROPERTY_OVERWRITE,
  IngestRequest.JSON_PROPERTY_SOURCE,
  IngestRequest.JSON_PROPERTY_TARGET_RES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.25.0")
public class IngestRequest {
  public static final String JSON_PROPERTY_MEDIA = "media";
  private JsonNullable<List<IngestMedia>> media = JsonNullable.<List<IngestMedia>>undefined();

  public static final String JSON_PROPERTY_OVERWRITE = "overwrite";
  @javax.annotation.Nullable
  private Boolean overwrite = false;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private JsonNullable<IngestSource> source = JsonNullable.<IngestSource>undefined();

  public static final String JSON_PROPERTY_TARGET_RES = "target_res";
  private JsonNullable<Integer> targetRes = JsonNullable.<Integer>undefined();

  public IngestRequest() {
  }

  public IngestRequest media(@javax.annotation.Nullable List<IngestMedia> media) {
    this.media = JsonNullable.<List<IngestMedia>>of(media);
    return this;
  }

  public IngestRequest addMediaItem(IngestMedia mediaItem) {
    if (this.media == null || !this.media.isPresent() || this.media.get() == null) {
      this.media = JsonNullable.<List<IngestMedia>>of(new ArrayList<>());
    }
    try {
      this.media.get().add(mediaItem);
    } catch (java.util.NoSuchElementException e) {
    }
    return this;
  }

  @javax.annotation.Nullable
  @JsonIgnore
  public List<IngestMedia> getMedia() {
        return media.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_MEDIA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<IngestMedia>> getMedia_JsonNullable() {
    return media;
  }

  @JsonProperty(JSON_PROPERTY_MEDIA)
  public void setMedia_JsonNullable(JsonNullable<List<IngestMedia>> media) {
    this.media = media;
  }

  public void setMedia(@javax.annotation.Nullable List<IngestMedia> media) {
    this.media = JsonNullable.<List<IngestMedia>>of(media);
  }

  public IngestRequest overwrite(@javax.annotation.Nullable Boolean overwrite) {
    this.overwrite = overwrite;
    return this;
  }

  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OVERWRITE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getOverwrite() {
    return overwrite;
  }

  @JsonProperty(value = JSON_PROPERTY_OVERWRITE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOverwrite(@javax.annotation.Nullable Boolean overwrite) {
    this.overwrite = overwrite;
  }

  public IngestRequest source(@javax.annotation.Nullable IngestSource source) {
    this.source = JsonNullable.<IngestSource>of(source);
    return this;
  }

  @javax.annotation.Nullable
  @JsonIgnore
  public IngestSource getSource() {
        return source.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SOURCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<IngestSource> getSource_JsonNullable() {
    return source;
  }

  @JsonProperty(JSON_PROPERTY_SOURCE)
  public void setSource_JsonNullable(JsonNullable<IngestSource> source) {
    this.source = source;
  }

  public void setSource(@javax.annotation.Nullable IngestSource source) {
    this.source = JsonNullable.<IngestSource>of(source);
  }

  public IngestRequest targetRes(@javax.annotation.Nullable Integer targetRes) {
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
    IngestRequest ingestRequest = (IngestRequest) o;
    return equalsNullable(this.media, ingestRequest.media) &&
        Objects.equals(this.overwrite, ingestRequest.overwrite) &&
        equalsNullable(this.source, ingestRequest.source) &&
        equalsNullable(this.targetRes, ingestRequest.targetRes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(media), overwrite, hashCodeNullable(source), hashCodeNullable(targetRes));
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
    sb.append("class IngestRequest {\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    overwrite: ").append(toIndentedString(overwrite)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

    if (getMedia() != null) {
      for (int i = 0; i < getMedia().size(); i++) {
        if (getMedia().get(i) != null) {
          joiner.add(getMedia().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%smedia%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    if (getOverwrite() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%soverwrite%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOverwrite()))));
    }

    if (getSource() != null) {
      joiner.add(getSource().toUrlQueryString(prefix + "source" + suffix));
    }

    if (getTargetRes() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%starget_res%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTargetRes()))));
    }

    return joiner.toString();
  }
}

