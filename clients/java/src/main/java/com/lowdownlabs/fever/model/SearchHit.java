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
import com.lowdownlabs.fever.model.MediaSpan;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import com.lowdownlabs.fever.ApiClient;

@JsonPropertyOrder({
  SearchHit.JSON_PROPERTY_BLOB_ID,
  SearchHit.JSON_PROPERTY_CAPTION,
  SearchHit.JSON_PROPERTY_CUSTOMER_ID,
  SearchHit.JSON_PROPERTY_DUPLICATE_COUNT,
  SearchHit.JSON_PROPERTY_DUPLICATES,
  SearchHit.JSON_PROPERTY_GEO_LABEL,
  SearchHit.JSON_PROPERTY_HEADLINE,
  SearchHit.JSON_PROPERTY_HEIGHT,
  SearchHit.JSON_PROPERTY_KIND,
  SearchHit.JSON_PROPERTY_MEDIA_REF,
  SearchHit.JSON_PROPERTY_METADATA,
  SearchHit.JSON_PROPERTY_SCORE,
  SearchHit.JSON_PROPERTY_SCORE_TYPE,
  SearchHit.JSON_PROPERTY_SEEK_MS,
  SearchHit.JSON_PROPERTY_SPAN,
  SearchHit.JSON_PROPERTY_SPAN_HEADLINE,
  SearchHit.JSON_PROPERTY_TAGS,
  SearchHit.JSON_PROPERTY_WIDTH
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.25.0")
public class SearchHit {
  public static final String JSON_PROPERTY_BLOB_ID = "blob_id";
  @javax.annotation.Nonnull
  private Integer blobId;

  public static final String JSON_PROPERTY_CAPTION = "caption";
  private JsonNullable<String> caption = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customer_id";
  private JsonNullable<String> customerId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DUPLICATE_COUNT = "duplicate_count";
  @javax.annotation.Nullable
  private Integer duplicateCount = 0;

  public static final String JSON_PROPERTY_DUPLICATES = "duplicates";
  @javax.annotation.Nullable
  private List<Integer> duplicates = new ArrayList<>();

  public static final String JSON_PROPERTY_GEO_LABEL = "geo_label";
  private JsonNullable<String> geoLabel = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_HEADLINE = "headline";
  private JsonNullable<String> headline = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_HEIGHT = "height";
  private JsonNullable<Integer> height = JsonNullable.<Integer>undefined();

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

  public static final String JSON_PROPERTY_MEDIA_REF = "media_ref";
  private JsonNullable<String> mediaRef = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private JsonNullable<Map<String, Object>> metadata = JsonNullable.<Map<String, Object>>undefined();

  public static final String JSON_PROPERTY_SCORE = "score";
  @javax.annotation.Nonnull
  private BigDecimal score;

  public enum ScoreTypeEnum {
    COSINE(String.valueOf("cosine")),

    COSINE_LEX(String.valueOf("cosine+lex")),

    RRF(String.valueOf("rrf")),

    RERANK(String.valueOf("rerank"));

    private String value;

    ScoreTypeEnum(String value) {
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
    public static ScoreTypeEnum fromValue(String value) {
      for (ScoreTypeEnum b : ScoreTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SCORE_TYPE = "score_type";
  @javax.annotation.Nonnull
  private ScoreTypeEnum scoreType;

  public static final String JSON_PROPERTY_SEEK_MS = "seek_ms";
  private JsonNullable<Integer> seekMs = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_SPAN = "span";
  private JsonNullable<MediaSpan> span = JsonNullable.<MediaSpan>undefined();

  public static final String JSON_PROPERTY_SPAN_HEADLINE = "span_headline";
  private JsonNullable<String> spanHeadline = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TAGS = "tags";
  @javax.annotation.Nullable
  private List<String> tags = new ArrayList<>();

  public static final String JSON_PROPERTY_WIDTH = "width";
  private JsonNullable<Integer> width = JsonNullable.<Integer>undefined();

  public SearchHit() {
  }

  public SearchHit blobId(@javax.annotation.Nonnull Integer blobId) {
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

  public SearchHit caption(@javax.annotation.Nullable String caption) {
    this.caption = JsonNullable.<String>of(caption);
    return this;
  }

  @javax.annotation.Nullable
  @JsonIgnore
  public String getCaption() {
        return caption.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_CAPTION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCaption_JsonNullable() {
    return caption;
  }

  @JsonProperty(JSON_PROPERTY_CAPTION)
  public void setCaption_JsonNullable(JsonNullable<String> caption) {
    this.caption = caption;
  }

  public void setCaption(@javax.annotation.Nullable String caption) {
    this.caption = JsonNullable.<String>of(caption);
  }

  public SearchHit customerId(@javax.annotation.Nullable String customerId) {
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

  public SearchHit duplicateCount(@javax.annotation.Nullable Integer duplicateCount) {
    this.duplicateCount = duplicateCount;
    return this;
  }

  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DUPLICATE_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getDuplicateCount() {
    return duplicateCount;
  }

  @JsonProperty(value = JSON_PROPERTY_DUPLICATE_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDuplicateCount(@javax.annotation.Nullable Integer duplicateCount) {
    this.duplicateCount = duplicateCount;
  }

  public SearchHit duplicates(@javax.annotation.Nullable List<Integer> duplicates) {
    this.duplicates = duplicates;
    return this;
  }

  public SearchHit addDuplicatesItem(Integer duplicatesItem) {
    if (this.duplicates == null) {
      this.duplicates = new ArrayList<>();
    }
    this.duplicates.add(duplicatesItem);
    return this;
  }

  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DUPLICATES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Integer> getDuplicates() {
    return duplicates;
  }

  @JsonProperty(value = JSON_PROPERTY_DUPLICATES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDuplicates(@javax.annotation.Nullable List<Integer> duplicates) {
    this.duplicates = duplicates;
  }

  public SearchHit geoLabel(@javax.annotation.Nullable String geoLabel) {
    this.geoLabel = JsonNullable.<String>of(geoLabel);
    return this;
  }

  @javax.annotation.Nullable
  @JsonIgnore
  public String getGeoLabel() {
        return geoLabel.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_GEO_LABEL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getGeoLabel_JsonNullable() {
    return geoLabel;
  }

  @JsonProperty(JSON_PROPERTY_GEO_LABEL)
  public void setGeoLabel_JsonNullable(JsonNullable<String> geoLabel) {
    this.geoLabel = geoLabel;
  }

  public void setGeoLabel(@javax.annotation.Nullable String geoLabel) {
    this.geoLabel = JsonNullable.<String>of(geoLabel);
  }

  public SearchHit headline(@javax.annotation.Nullable String headline) {
    this.headline = JsonNullable.<String>of(headline);
    return this;
  }

  @javax.annotation.Nullable
  @JsonIgnore
  public String getHeadline() {
        return headline.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_HEADLINE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getHeadline_JsonNullable() {
    return headline;
  }

  @JsonProperty(JSON_PROPERTY_HEADLINE)
  public void setHeadline_JsonNullable(JsonNullable<String> headline) {
    this.headline = headline;
  }

  public void setHeadline(@javax.annotation.Nullable String headline) {
    this.headline = JsonNullable.<String>of(headline);
  }

  public SearchHit height(@javax.annotation.Nullable Integer height) {
    this.height = JsonNullable.<Integer>of(height);
    return this;
  }

  @javax.annotation.Nullable
  @JsonIgnore
  public Integer getHeight() {
        return height.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_HEIGHT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getHeight_JsonNullable() {
    return height;
  }

  @JsonProperty(JSON_PROPERTY_HEIGHT)
  public void setHeight_JsonNullable(JsonNullable<Integer> height) {
    this.height = height;
  }

  public void setHeight(@javax.annotation.Nullable Integer height) {
    this.height = JsonNullable.<Integer>of(height);
  }

  public SearchHit kind(@javax.annotation.Nullable KindEnum kind) {
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

  public SearchHit mediaRef(@javax.annotation.Nullable String mediaRef) {
    this.mediaRef = JsonNullable.<String>of(mediaRef);
    return this;
  }

  @javax.annotation.Nullable
  @JsonIgnore
  public String getMediaRef() {
        return mediaRef.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_MEDIA_REF, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMediaRef_JsonNullable() {
    return mediaRef;
  }

  @JsonProperty(JSON_PROPERTY_MEDIA_REF)
  public void setMediaRef_JsonNullable(JsonNullable<String> mediaRef) {
    this.mediaRef = mediaRef;
  }

  public void setMediaRef(@javax.annotation.Nullable String mediaRef) {
    this.mediaRef = JsonNullable.<String>of(mediaRef);
  }

  public SearchHit metadata(@javax.annotation.Nullable Map<String, Object> metadata) {
    this.metadata = JsonNullable.<Map<String, Object>>of(metadata);
    return this;
  }

  public SearchHit putMetadataItem(String key, Object metadataItem) {
    if (this.metadata == null || !this.metadata.isPresent() || this.metadata.get() == null) {
      this.metadata = JsonNullable.<Map<String, Object>>of(new HashMap<>());
    }
    try {
      this.metadata.get().put(key, metadataItem);
    } catch (java.util.NoSuchElementException e) {
    }
    return this;
  }

  @javax.annotation.Nullable
  @JsonIgnore
  public Map<String, Object> getMetadata() {
        return metadata.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_METADATA, required = false)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Map<String, Object>> getMetadata_JsonNullable() {
    return metadata;
  }

  @JsonProperty(JSON_PROPERTY_METADATA)
  public void setMetadata_JsonNullable(JsonNullable<Map<String, Object>> metadata) {
    this.metadata = metadata;
  }

  public void setMetadata(@javax.annotation.Nullable Map<String, Object> metadata) {
    this.metadata = JsonNullable.<Map<String, Object>>of(metadata);
  }

  public SearchHit score(@javax.annotation.Nonnull BigDecimal score) {
    this.score = score;
    return this;
  }

  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_SCORE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public BigDecimal getScore() {
    return score;
  }

  @JsonProperty(value = JSON_PROPERTY_SCORE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setScore(@javax.annotation.Nonnull BigDecimal score) {
    this.score = score;
  }

  public SearchHit scoreType(@javax.annotation.Nonnull ScoreTypeEnum scoreType) {
    this.scoreType = scoreType;
    return this;
  }

  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_SCORE_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ScoreTypeEnum getScoreType() {
    return scoreType;
  }

  @JsonProperty(value = JSON_PROPERTY_SCORE_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setScoreType(@javax.annotation.Nonnull ScoreTypeEnum scoreType) {
    this.scoreType = scoreType;
  }

  public SearchHit seekMs(@javax.annotation.Nullable Integer seekMs) {
    this.seekMs = JsonNullable.<Integer>of(seekMs);
    return this;
  }

  @javax.annotation.Nullable
  @JsonIgnore
  public Integer getSeekMs() {
        return seekMs.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SEEK_MS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getSeekMs_JsonNullable() {
    return seekMs;
  }

  @JsonProperty(JSON_PROPERTY_SEEK_MS)
  public void setSeekMs_JsonNullable(JsonNullable<Integer> seekMs) {
    this.seekMs = seekMs;
  }

  public void setSeekMs(@javax.annotation.Nullable Integer seekMs) {
    this.seekMs = JsonNullable.<Integer>of(seekMs);
  }

  public SearchHit span(@javax.annotation.Nullable MediaSpan span) {
    this.span = JsonNullable.<MediaSpan>of(span);
    return this;
  }

  @javax.annotation.Nullable
  @JsonIgnore
  public MediaSpan getSpan() {
        return span.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SPAN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<MediaSpan> getSpan_JsonNullable() {
    return span;
  }

  @JsonProperty(JSON_PROPERTY_SPAN)
  public void setSpan_JsonNullable(JsonNullable<MediaSpan> span) {
    this.span = span;
  }

  public void setSpan(@javax.annotation.Nullable MediaSpan span) {
    this.span = JsonNullable.<MediaSpan>of(span);
  }

  public SearchHit spanHeadline(@javax.annotation.Nullable String spanHeadline) {
    this.spanHeadline = JsonNullable.<String>of(spanHeadline);
    return this;
  }

  @javax.annotation.Nullable
  @JsonIgnore
  public String getSpanHeadline() {
        return spanHeadline.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SPAN_HEADLINE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSpanHeadline_JsonNullable() {
    return spanHeadline;
  }

  @JsonProperty(JSON_PROPERTY_SPAN_HEADLINE)
  public void setSpanHeadline_JsonNullable(JsonNullable<String> spanHeadline) {
    this.spanHeadline = spanHeadline;
  }

  public void setSpanHeadline(@javax.annotation.Nullable String spanHeadline) {
    this.spanHeadline = JsonNullable.<String>of(spanHeadline);
  }

  public SearchHit tags(@javax.annotation.Nullable List<String> tags) {
    this.tags = tags;
    return this;
  }

  public SearchHit addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TAGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  @JsonProperty(value = JSON_PROPERTY_TAGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(@javax.annotation.Nullable List<String> tags) {
    this.tags = tags;
  }

  public SearchHit width(@javax.annotation.Nullable Integer width) {
    this.width = JsonNullable.<Integer>of(width);
    return this;
  }

  @javax.annotation.Nullable
  @JsonIgnore
  public Integer getWidth() {
        return width.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_WIDTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getWidth_JsonNullable() {
    return width;
  }

  @JsonProperty(JSON_PROPERTY_WIDTH)
  public void setWidth_JsonNullable(JsonNullable<Integer> width) {
    this.width = width;
  }

  public void setWidth(@javax.annotation.Nullable Integer width) {
    this.width = JsonNullable.<Integer>of(width);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchHit searchHit = (SearchHit) o;
    return Objects.equals(this.blobId, searchHit.blobId) &&
        equalsNullable(this.caption, searchHit.caption) &&
        equalsNullable(this.customerId, searchHit.customerId) &&
        Objects.equals(this.duplicateCount, searchHit.duplicateCount) &&
        Objects.equals(this.duplicates, searchHit.duplicates) &&
        equalsNullable(this.geoLabel, searchHit.geoLabel) &&
        equalsNullable(this.headline, searchHit.headline) &&
        equalsNullable(this.height, searchHit.height) &&
        equalsNullable(this.kind, searchHit.kind) &&
        equalsNullable(this.mediaRef, searchHit.mediaRef) &&
        equalsNullable(this.metadata, searchHit.metadata) &&
        Objects.equals(this.score, searchHit.score) &&
        Objects.equals(this.scoreType, searchHit.scoreType) &&
        equalsNullable(this.seekMs, searchHit.seekMs) &&
        equalsNullable(this.span, searchHit.span) &&
        equalsNullable(this.spanHeadline, searchHit.spanHeadline) &&
        Objects.equals(this.tags, searchHit.tags) &&
        equalsNullable(this.width, searchHit.width);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(blobId, hashCodeNullable(caption), hashCodeNullable(customerId), duplicateCount, duplicates, hashCodeNullable(geoLabel), hashCodeNullable(headline), hashCodeNullable(height), hashCodeNullable(kind), hashCodeNullable(mediaRef), hashCodeNullable(metadata), score, scoreType, hashCodeNullable(seekMs), hashCodeNullable(span), hashCodeNullable(spanHeadline), tags, hashCodeNullable(width));
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
    sb.append("class SearchHit {\n");
    sb.append("    blobId: ").append(toIndentedString(blobId)).append("\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    duplicateCount: ").append(toIndentedString(duplicateCount)).append("\n");
    sb.append("    duplicates: ").append(toIndentedString(duplicates)).append("\n");
    sb.append("    geoLabel: ").append(toIndentedString(geoLabel)).append("\n");
    sb.append("    headline: ").append(toIndentedString(headline)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    mediaRef: ").append(toIndentedString(mediaRef)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    scoreType: ").append(toIndentedString(scoreType)).append("\n");
    sb.append("    seekMs: ").append(toIndentedString(seekMs)).append("\n");
    sb.append("    span: ").append(toIndentedString(span)).append("\n");
    sb.append("    spanHeadline: ").append(toIndentedString(spanHeadline)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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

    if (getCaption() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scaption%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCaption()))));
    }

    if (getCustomerId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scustomer_id%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCustomerId()))));
    }

    if (getDuplicateCount() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sduplicate_count%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDuplicateCount()))));
    }

    if (getDuplicates() != null) {
      for (int i = 0; i < getDuplicates().size(); i++) {
        joiner.add(String.format(java.util.Locale.ROOT, "%sduplicates%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(getDuplicates().get(i)))));
      }
    }

    if (getGeoLabel() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sgeo_label%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getGeoLabel()))));
    }

    if (getHeadline() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sheadline%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getHeadline()))));
    }

    if (getHeight() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sheight%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getHeight()))));
    }

    if (getKind() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%skind%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getKind()))));
    }

    if (getMediaRef() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smedia_ref%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMediaRef()))));
    }

    if (getMetadata() != null) {
      for (String _key : getMetadata().keySet()) {
        joiner.add(String.format(java.util.Locale.ROOT, "%smetadata%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, _key, containerSuffix),
            getMetadata().get(_key), ApiClient.urlEncode(ApiClient.valueToString(getMetadata().get(_key)))));
      }
    }

    if (getScore() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sscore%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getScore()))));
    }

    if (getScoreType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sscore_type%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getScoreType()))));
    }

    if (getSeekMs() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sseek_ms%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSeekMs()))));
    }

    if (getSpan() != null) {
      joiner.add(getSpan().toUrlQueryString(prefix + "span" + suffix));
    }

    if (getSpanHeadline() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sspan_headline%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSpanHeadline()))));
    }

    if (getTags() != null) {
      for (int i = 0; i < getTags().size(); i++) {
        joiner.add(String.format(java.util.Locale.ROOT, "%stags%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(getTags().get(i)))));
      }
    }

    if (getWidth() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%swidth%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getWidth()))));
    }

    return joiner.toString();
  }
}

