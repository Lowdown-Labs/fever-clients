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
import java.math.BigDecimal;
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
  SearchRequest.JSON_PROPERTY_AFTER,
  SearchRequest.JSON_PROPERTY_BEFORE,
  SearchRequest.JSON_PROPERTY_COLLAPSE_DUPLICATES,
  SearchRequest.JSON_PROPERTY_CUSTOMER_ID,
  SearchRequest.JSON_PROPERTY_DEVICE,
  SearchRequest.JSON_PROPERTY_DUPE_THRESHOLD,
  SearchRequest.JSON_PROPERTY_EXCLUDE_TAGS,
  SearchRequest.JSON_PROPERTY_IMAGE,
  SearchRequest.JSON_PROPERTY_IMAGE_BLOB_ID,
  SearchRequest.JSON_PROPERTY_INCLUDE_TAGS,
  SearchRequest.JSON_PROPERTY_INDEXED_RES,
  SearchRequest.JSON_PROPERTY_K,
  SearchRequest.JSON_PROPERTY_KIND,
  SearchRequest.JSON_PROPERTY_MAX_HEIGHT,
  SearchRequest.JSON_PROPERTY_MAX_WIDTH,
  SearchRequest.JSON_PROPERTY_MIN_SCORE,
  SearchRequest.JSON_PROPERTY_NEAR,
  SearchRequest.JSON_PROPERTY_SORT,
  SearchRequest.JSON_PROPERTY_TEXT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.25.0")
public class SearchRequest {
  public static final String JSON_PROPERTY_AFTER = "after";
  private JsonNullable<String> after = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BEFORE = "before";
  private JsonNullable<String> before = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COLLAPSE_DUPLICATES = "collapse_duplicates";
  @javax.annotation.Nullable
  private Boolean collapseDuplicates = true;

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customer_id";
  private JsonNullable<String> customerId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DEVICE = "device";
  private JsonNullable<String> device = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DUPE_THRESHOLD = "dupe_threshold";
  private JsonNullable<BigDecimal> dupeThreshold = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_EXCLUDE_TAGS = "exclude_tags";
  private JsonNullable<List<String>> excludeTags = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_IMAGE = "image";
  private JsonNullable<String> image = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IMAGE_BLOB_ID = "image_blob_id";
  private JsonNullable<Integer> imageBlobId = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_INCLUDE_TAGS = "include_tags";
  private JsonNullable<List<String>> includeTags = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_INDEXED_RES = "indexed_res";
  private JsonNullable<Integer> indexedRes = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_K = "k";
  @javax.annotation.Nullable
  private Integer k = 10;

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

  public static final String JSON_PROPERTY_MAX_HEIGHT = "max_height";
  private JsonNullable<Integer> maxHeight = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_MAX_WIDTH = "max_width";
  private JsonNullable<Integer> maxWidth = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_MIN_SCORE = "min_score";
  @javax.annotation.Nullable
  private BigDecimal minScore = new BigDecimal("0.0");

  public static final String JSON_PROPERTY_NEAR = "near";
  private JsonNullable<List<BigDecimal>> near = JsonNullable.<List<BigDecimal>>undefined();

  public enum SortEnum {
    RELEVANCE(String.valueOf("relevance")),

    DISTANCE(String.valueOf("distance"));

    private String value;

    SortEnum(String value) {
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
    public static SortEnum fromValue(String value) {
      for (SortEnum b : SortEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_SORT = "sort";
  private JsonNullable<SortEnum> sort = JsonNullable.<SortEnum>undefined();

  public static final String JSON_PROPERTY_TEXT = "text";
  private JsonNullable<String> text = JsonNullable.<String>undefined();

  public SearchRequest() {
  }

  public SearchRequest after(@javax.annotation.Nullable String after) {
    this.after = JsonNullable.<String>of(after);
    return this;
  }

  @javax.annotation.Nullable
  @JsonIgnore
  public String getAfter() {
        return after.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_AFTER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAfter_JsonNullable() {
    return after;
  }

  @JsonProperty(JSON_PROPERTY_AFTER)
  public void setAfter_JsonNullable(JsonNullable<String> after) {
    this.after = after;
  }

  public void setAfter(@javax.annotation.Nullable String after) {
    this.after = JsonNullable.<String>of(after);
  }

  public SearchRequest before(@javax.annotation.Nullable String before) {
    this.before = JsonNullable.<String>of(before);
    return this;
  }

  @javax.annotation.Nullable
  @JsonIgnore
  public String getBefore() {
        return before.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_BEFORE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBefore_JsonNullable() {
    return before;
  }

  @JsonProperty(JSON_PROPERTY_BEFORE)
  public void setBefore_JsonNullable(JsonNullable<String> before) {
    this.before = before;
  }

  public void setBefore(@javax.annotation.Nullable String before) {
    this.before = JsonNullable.<String>of(before);
  }

  public SearchRequest collapseDuplicates(@javax.annotation.Nullable Boolean collapseDuplicates) {
    this.collapseDuplicates = collapseDuplicates;
    return this;
  }

  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_COLLAPSE_DUPLICATES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getCollapseDuplicates() {
    return collapseDuplicates;
  }

  @JsonProperty(value = JSON_PROPERTY_COLLAPSE_DUPLICATES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCollapseDuplicates(@javax.annotation.Nullable Boolean collapseDuplicates) {
    this.collapseDuplicates = collapseDuplicates;
  }

  public SearchRequest customerId(@javax.annotation.Nullable String customerId) {
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

  public SearchRequest device(@javax.annotation.Nullable String device) {
    this.device = JsonNullable.<String>of(device);
    return this;
  }

  @javax.annotation.Nullable
  @JsonIgnore
  public String getDevice() {
        return device.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_DEVICE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDevice_JsonNullable() {
    return device;
  }

  @JsonProperty(JSON_PROPERTY_DEVICE)
  public void setDevice_JsonNullable(JsonNullable<String> device) {
    this.device = device;
  }

  public void setDevice(@javax.annotation.Nullable String device) {
    this.device = JsonNullable.<String>of(device);
  }

  public SearchRequest dupeThreshold(@javax.annotation.Nullable BigDecimal dupeThreshold) {
    this.dupeThreshold = JsonNullable.<BigDecimal>of(dupeThreshold);
    return this;
  }

  @javax.annotation.Nullable
  @JsonIgnore
  public BigDecimal getDupeThreshold() {
        return dupeThreshold.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_DUPE_THRESHOLD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getDupeThreshold_JsonNullable() {
    return dupeThreshold;
  }

  @JsonProperty(JSON_PROPERTY_DUPE_THRESHOLD)
  public void setDupeThreshold_JsonNullable(JsonNullable<BigDecimal> dupeThreshold) {
    this.dupeThreshold = dupeThreshold;
  }

  public void setDupeThreshold(@javax.annotation.Nullable BigDecimal dupeThreshold) {
    this.dupeThreshold = JsonNullable.<BigDecimal>of(dupeThreshold);
  }

  public SearchRequest excludeTags(@javax.annotation.Nullable List<String> excludeTags) {
    this.excludeTags = JsonNullable.<List<String>>of(excludeTags);
    return this;
  }

  public SearchRequest addExcludeTagsItem(String excludeTagsItem) {
    if (this.excludeTags == null || !this.excludeTags.isPresent() || this.excludeTags.get() == null) {
      this.excludeTags = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.excludeTags.get().add(excludeTagsItem);
    } catch (java.util.NoSuchElementException e) {
    }
    return this;
  }

  @javax.annotation.Nullable
  @JsonIgnore
  public List<String> getExcludeTags() {
        return excludeTags.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_EXCLUDE_TAGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getExcludeTags_JsonNullable() {
    return excludeTags;
  }

  @JsonProperty(JSON_PROPERTY_EXCLUDE_TAGS)
  public void setExcludeTags_JsonNullable(JsonNullable<List<String>> excludeTags) {
    this.excludeTags = excludeTags;
  }

  public void setExcludeTags(@javax.annotation.Nullable List<String> excludeTags) {
    this.excludeTags = JsonNullable.<List<String>>of(excludeTags);
  }

  public SearchRequest image(@javax.annotation.Nullable String image) {
    this.image = JsonNullable.<String>of(image);
    return this;
  }

  @javax.annotation.Nullable
  @JsonIgnore
  public String getImage() {
        return image.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_IMAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getImage_JsonNullable() {
    return image;
  }

  @JsonProperty(JSON_PROPERTY_IMAGE)
  public void setImage_JsonNullable(JsonNullable<String> image) {
    this.image = image;
  }

  public void setImage(@javax.annotation.Nullable String image) {
    this.image = JsonNullable.<String>of(image);
  }

  public SearchRequest imageBlobId(@javax.annotation.Nullable Integer imageBlobId) {
    this.imageBlobId = JsonNullable.<Integer>of(imageBlobId);
    return this;
  }

  @javax.annotation.Nullable
  @JsonIgnore
  public Integer getImageBlobId() {
        return imageBlobId.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_IMAGE_BLOB_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getImageBlobId_JsonNullable() {
    return imageBlobId;
  }

  @JsonProperty(JSON_PROPERTY_IMAGE_BLOB_ID)
  public void setImageBlobId_JsonNullable(JsonNullable<Integer> imageBlobId) {
    this.imageBlobId = imageBlobId;
  }

  public void setImageBlobId(@javax.annotation.Nullable Integer imageBlobId) {
    this.imageBlobId = JsonNullable.<Integer>of(imageBlobId);
  }

  public SearchRequest includeTags(@javax.annotation.Nullable List<String> includeTags) {
    this.includeTags = JsonNullable.<List<String>>of(includeTags);
    return this;
  }

  public SearchRequest addIncludeTagsItem(String includeTagsItem) {
    if (this.includeTags == null || !this.includeTags.isPresent() || this.includeTags.get() == null) {
      this.includeTags = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.includeTags.get().add(includeTagsItem);
    } catch (java.util.NoSuchElementException e) {
    }
    return this;
  }

  @javax.annotation.Nullable
  @JsonIgnore
  public List<String> getIncludeTags() {
        return includeTags.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_INCLUDE_TAGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getIncludeTags_JsonNullable() {
    return includeTags;
  }

  @JsonProperty(JSON_PROPERTY_INCLUDE_TAGS)
  public void setIncludeTags_JsonNullable(JsonNullable<List<String>> includeTags) {
    this.includeTags = includeTags;
  }

  public void setIncludeTags(@javax.annotation.Nullable List<String> includeTags) {
    this.includeTags = JsonNullable.<List<String>>of(includeTags);
  }

  public SearchRequest indexedRes(@javax.annotation.Nullable Integer indexedRes) {
    this.indexedRes = JsonNullable.<Integer>of(indexedRes);
    return this;
  }

  @javax.annotation.Nullable
  @JsonIgnore
  public Integer getIndexedRes() {
        return indexedRes.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_INDEXED_RES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getIndexedRes_JsonNullable() {
    return indexedRes;
  }

  @JsonProperty(JSON_PROPERTY_INDEXED_RES)
  public void setIndexedRes_JsonNullable(JsonNullable<Integer> indexedRes) {
    this.indexedRes = indexedRes;
  }

  public void setIndexedRes(@javax.annotation.Nullable Integer indexedRes) {
    this.indexedRes = JsonNullable.<Integer>of(indexedRes);
  }

  public SearchRequest k(@javax.annotation.Nullable Integer k) {
    this.k = k;
    return this;
  }

  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_K, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getK() {
    return k;
  }

  @JsonProperty(value = JSON_PROPERTY_K, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setK(@javax.annotation.Nullable Integer k) {
    this.k = k;
  }

  public SearchRequest kind(@javax.annotation.Nullable KindEnum kind) {
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

  public SearchRequest maxHeight(@javax.annotation.Nullable Integer maxHeight) {
    this.maxHeight = JsonNullable.<Integer>of(maxHeight);
    return this;
  }

  @javax.annotation.Nullable
  @JsonIgnore
  public Integer getMaxHeight() {
        return maxHeight.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_MAX_HEIGHT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getMaxHeight_JsonNullable() {
    return maxHeight;
  }

  @JsonProperty(JSON_PROPERTY_MAX_HEIGHT)
  public void setMaxHeight_JsonNullable(JsonNullable<Integer> maxHeight) {
    this.maxHeight = maxHeight;
  }

  public void setMaxHeight(@javax.annotation.Nullable Integer maxHeight) {
    this.maxHeight = JsonNullable.<Integer>of(maxHeight);
  }

  public SearchRequest maxWidth(@javax.annotation.Nullable Integer maxWidth) {
    this.maxWidth = JsonNullable.<Integer>of(maxWidth);
    return this;
  }

  @javax.annotation.Nullable
  @JsonIgnore
  public Integer getMaxWidth() {
        return maxWidth.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_MAX_WIDTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getMaxWidth_JsonNullable() {
    return maxWidth;
  }

  @JsonProperty(JSON_PROPERTY_MAX_WIDTH)
  public void setMaxWidth_JsonNullable(JsonNullable<Integer> maxWidth) {
    this.maxWidth = maxWidth;
  }

  public void setMaxWidth(@javax.annotation.Nullable Integer maxWidth) {
    this.maxWidth = JsonNullable.<Integer>of(maxWidth);
  }

  public SearchRequest minScore(@javax.annotation.Nullable BigDecimal minScore) {
    this.minScore = minScore;
    return this;
  }

  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MIN_SCORE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public BigDecimal getMinScore() {
    return minScore;
  }

  @JsonProperty(value = JSON_PROPERTY_MIN_SCORE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinScore(@javax.annotation.Nullable BigDecimal minScore) {
    this.minScore = minScore;
  }

  public SearchRequest near(@javax.annotation.Nullable List<BigDecimal> near) {
    this.near = JsonNullable.<List<BigDecimal>>of(near);
    return this;
  }

  public SearchRequest addNearItem(BigDecimal nearItem) {
    if (this.near == null || !this.near.isPresent() || this.near.get() == null) {
      this.near = JsonNullable.<List<BigDecimal>>of(new ArrayList<>());
    }
    try {
      this.near.get().add(nearItem);
    } catch (java.util.NoSuchElementException e) {
    }
    return this;
  }

  @javax.annotation.Nullable
  @JsonIgnore
  public List<BigDecimal> getNear() {
        return near.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_NEAR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<BigDecimal>> getNear_JsonNullable() {
    return near;
  }

  @JsonProperty(JSON_PROPERTY_NEAR)
  public void setNear_JsonNullable(JsonNullable<List<BigDecimal>> near) {
    this.near = near;
  }

  public void setNear(@javax.annotation.Nullable List<BigDecimal> near) {
    this.near = JsonNullable.<List<BigDecimal>>of(near);
  }

  public SearchRequest sort(@javax.annotation.Nullable SortEnum sort) {
    this.sort = JsonNullable.<SortEnum>of(sort);
    return this;
  }

  @javax.annotation.Nullable
  @JsonIgnore
  public SortEnum getSort() {
        return sort.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SORT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<SortEnum> getSort_JsonNullable() {
    return sort;
  }

  @JsonProperty(JSON_PROPERTY_SORT)
  public void setSort_JsonNullable(JsonNullable<SortEnum> sort) {
    this.sort = sort;
  }

  public void setSort(@javax.annotation.Nullable SortEnum sort) {
    this.sort = JsonNullable.<SortEnum>of(sort);
  }

  public SearchRequest text(@javax.annotation.Nullable String text) {
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
    SearchRequest searchRequest = (SearchRequest) o;
    return equalsNullable(this.after, searchRequest.after) &&
        equalsNullable(this.before, searchRequest.before) &&
        Objects.equals(this.collapseDuplicates, searchRequest.collapseDuplicates) &&
        equalsNullable(this.customerId, searchRequest.customerId) &&
        equalsNullable(this.device, searchRequest.device) &&
        equalsNullable(this.dupeThreshold, searchRequest.dupeThreshold) &&
        equalsNullable(this.excludeTags, searchRequest.excludeTags) &&
        equalsNullable(this.image, searchRequest.image) &&
        equalsNullable(this.imageBlobId, searchRequest.imageBlobId) &&
        equalsNullable(this.includeTags, searchRequest.includeTags) &&
        equalsNullable(this.indexedRes, searchRequest.indexedRes) &&
        Objects.equals(this.k, searchRequest.k) &&
        equalsNullable(this.kind, searchRequest.kind) &&
        equalsNullable(this.maxHeight, searchRequest.maxHeight) &&
        equalsNullable(this.maxWidth, searchRequest.maxWidth) &&
        Objects.equals(this.minScore, searchRequest.minScore) &&
        equalsNullable(this.near, searchRequest.near) &&
        equalsNullable(this.sort, searchRequest.sort) &&
        equalsNullable(this.text, searchRequest.text);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(after), hashCodeNullable(before), collapseDuplicates, hashCodeNullable(customerId), hashCodeNullable(device), hashCodeNullable(dupeThreshold), hashCodeNullable(excludeTags), hashCodeNullable(image), hashCodeNullable(imageBlobId), hashCodeNullable(includeTags), hashCodeNullable(indexedRes), k, hashCodeNullable(kind), hashCodeNullable(maxHeight), hashCodeNullable(maxWidth), minScore, hashCodeNullable(near), hashCodeNullable(sort), hashCodeNullable(text));
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
    sb.append("class SearchRequest {\n");
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
    sb.append("    before: ").append(toIndentedString(before)).append("\n");
    sb.append("    collapseDuplicates: ").append(toIndentedString(collapseDuplicates)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    dupeThreshold: ").append(toIndentedString(dupeThreshold)).append("\n");
    sb.append("    excludeTags: ").append(toIndentedString(excludeTags)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imageBlobId: ").append(toIndentedString(imageBlobId)).append("\n");
    sb.append("    includeTags: ").append(toIndentedString(includeTags)).append("\n");
    sb.append("    indexedRes: ").append(toIndentedString(indexedRes)).append("\n");
    sb.append("    k: ").append(toIndentedString(k)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    maxHeight: ").append(toIndentedString(maxHeight)).append("\n");
    sb.append("    maxWidth: ").append(toIndentedString(maxWidth)).append("\n");
    sb.append("    minScore: ").append(toIndentedString(minScore)).append("\n");
    sb.append("    near: ").append(toIndentedString(near)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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

    if (getAfter() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%safter%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAfter()))));
    }

    if (getBefore() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbefore%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBefore()))));
    }

    if (getCollapseDuplicates() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scollapse_duplicates%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCollapseDuplicates()))));
    }

    if (getCustomerId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scustomer_id%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCustomerId()))));
    }

    if (getDevice() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdevice%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDevice()))));
    }

    if (getDupeThreshold() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdupe_threshold%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDupeThreshold()))));
    }

    if (getExcludeTags() != null) {
      for (int i = 0; i < getExcludeTags().size(); i++) {
        joiner.add(String.format(java.util.Locale.ROOT, "%sexclude_tags%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(getExcludeTags().get(i)))));
      }
    }

    if (getImage() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%simage%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getImage()))));
    }

    if (getImageBlobId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%simage_blob_id%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getImageBlobId()))));
    }

    if (getIncludeTags() != null) {
      for (int i = 0; i < getIncludeTags().size(); i++) {
        joiner.add(String.format(java.util.Locale.ROOT, "%sinclude_tags%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(getIncludeTags().get(i)))));
      }
    }

    if (getIndexedRes() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sindexed_res%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getIndexedRes()))));
    }

    if (getK() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sk%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getK()))));
    }

    if (getKind() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%skind%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getKind()))));
    }

    if (getMaxHeight() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smax_height%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxHeight()))));
    }

    if (getMaxWidth() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smax_width%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxWidth()))));
    }

    if (getMinScore() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smin_score%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMinScore()))));
    }

    if (getNear() != null) {
      for (int i = 0; i < getNear().size(); i++) {
        if (getNear().get(i) != null) {
          joiner.add(String.format(java.util.Locale.ROOT, "%snear%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
              ApiClient.urlEncode(ApiClient.valueToString(getNear().get(i)))));
        }
      }
    }

    if (getSort() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssort%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSort()))));
    }

    if (getText() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stext%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getText()))));
    }

    return joiner.toString();
  }
}

