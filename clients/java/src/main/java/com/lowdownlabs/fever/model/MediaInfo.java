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
import java.time.OffsetDateTime;
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
  MediaInfo.JSON_PROPERTY_BLOB_ID,
  MediaInfo.JSON_PROPERTY_CAPTION,
  MediaInfo.JSON_PROPERTY_CAPTURED_AT,
  MediaInfo.JSON_PROPERTY_CUSTOMER_ID,
  MediaInfo.JSON_PROPERTY_DEVICE,
  MediaInfo.JSON_PROPERTY_EXTERNAL_REF,
  MediaInfo.JSON_PROPERTY_FRAME_COUNT,
  MediaInfo.JSON_PROPERTY_GPS_LAT,
  MediaInfo.JSON_PROPERTY_GPS_LON,
  MediaInfo.JSON_PROPERTY_KIND,
  MediaInfo.JSON_PROPERTY_METADATA,
  MediaInfo.JSON_PROPERTY_OCR_TEXT,
  MediaInfo.JSON_PROPERTY_SYNTHETIC,
  MediaInfo.JSON_PROPERTY_TAGS,
  MediaInfo.JSON_PROPERTY_TRANSCRIPT_SEGMENTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.25.0")
public class MediaInfo {
  public static final String JSON_PROPERTY_BLOB_ID = "blob_id";
  @javax.annotation.Nonnull
  private Integer blobId;

  public static final String JSON_PROPERTY_CAPTION = "caption";
  private JsonNullable<String> caption = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CAPTURED_AT = "captured_at";
  private JsonNullable<OffsetDateTime> capturedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customer_id";
  private JsonNullable<String> customerId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DEVICE = "device";
  private JsonNullable<String> device = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EXTERNAL_REF = "external_ref";
  private JsonNullable<String> externalRef = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FRAME_COUNT = "frame_count";
  @javax.annotation.Nullable
  private Integer frameCount = 0;

  public static final String JSON_PROPERTY_GPS_LAT = "gps_lat";
  private JsonNullable<BigDecimal> gpsLat = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_GPS_LON = "gps_lon";
  private JsonNullable<BigDecimal> gpsLon = JsonNullable.<BigDecimal>undefined();

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

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private JsonNullable<Map<String, Object>> metadata = JsonNullable.<Map<String, Object>>undefined();

  public static final String JSON_PROPERTY_OCR_TEXT = "ocr_text";
  private JsonNullable<String> ocrText = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SYNTHETIC = "synthetic";
  private JsonNullable<BigDecimal> synthetic = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_TAGS = "tags";
  @javax.annotation.Nullable
  private List<String> tags = new ArrayList<>();

  public static final String JSON_PROPERTY_TRANSCRIPT_SEGMENTS = "transcript_segments";
  @javax.annotation.Nullable
  private Integer transcriptSegments = 0;

  public MediaInfo() {
  }

  public MediaInfo blobId(@javax.annotation.Nonnull Integer blobId) {
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

  public MediaInfo caption(@javax.annotation.Nullable String caption) {
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

  public MediaInfo capturedAt(@javax.annotation.Nullable OffsetDateTime capturedAt) {
    this.capturedAt = JsonNullable.<OffsetDateTime>of(capturedAt);
    return this;
  }

  @javax.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getCapturedAt() {
        return capturedAt.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_CAPTURED_AT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getCapturedAt_JsonNullable() {
    return capturedAt;
  }

  @JsonProperty(JSON_PROPERTY_CAPTURED_AT)
  public void setCapturedAt_JsonNullable(JsonNullable<OffsetDateTime> capturedAt) {
    this.capturedAt = capturedAt;
  }

  public void setCapturedAt(@javax.annotation.Nullable OffsetDateTime capturedAt) {
    this.capturedAt = JsonNullable.<OffsetDateTime>of(capturedAt);
  }

  public MediaInfo customerId(@javax.annotation.Nullable String customerId) {
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

  public MediaInfo device(@javax.annotation.Nullable String device) {
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

  public MediaInfo externalRef(@javax.annotation.Nullable String externalRef) {
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

  public MediaInfo frameCount(@javax.annotation.Nullable Integer frameCount) {
    this.frameCount = frameCount;
    return this;
  }

  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FRAME_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getFrameCount() {
    return frameCount;
  }

  @JsonProperty(value = JSON_PROPERTY_FRAME_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFrameCount(@javax.annotation.Nullable Integer frameCount) {
    this.frameCount = frameCount;
  }

  public MediaInfo gpsLat(@javax.annotation.Nullable BigDecimal gpsLat) {
    this.gpsLat = JsonNullable.<BigDecimal>of(gpsLat);
    return this;
  }

  @javax.annotation.Nullable
  @JsonIgnore
  public BigDecimal getGpsLat() {
        return gpsLat.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_GPS_LAT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getGpsLat_JsonNullable() {
    return gpsLat;
  }

  @JsonProperty(JSON_PROPERTY_GPS_LAT)
  public void setGpsLat_JsonNullable(JsonNullable<BigDecimal> gpsLat) {
    this.gpsLat = gpsLat;
  }

  public void setGpsLat(@javax.annotation.Nullable BigDecimal gpsLat) {
    this.gpsLat = JsonNullable.<BigDecimal>of(gpsLat);
  }

  public MediaInfo gpsLon(@javax.annotation.Nullable BigDecimal gpsLon) {
    this.gpsLon = JsonNullable.<BigDecimal>of(gpsLon);
    return this;
  }

  @javax.annotation.Nullable
  @JsonIgnore
  public BigDecimal getGpsLon() {
        return gpsLon.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_GPS_LON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getGpsLon_JsonNullable() {
    return gpsLon;
  }

  @JsonProperty(JSON_PROPERTY_GPS_LON)
  public void setGpsLon_JsonNullable(JsonNullable<BigDecimal> gpsLon) {
    this.gpsLon = gpsLon;
  }

  public void setGpsLon(@javax.annotation.Nullable BigDecimal gpsLon) {
    this.gpsLon = JsonNullable.<BigDecimal>of(gpsLon);
  }

  public MediaInfo kind(@javax.annotation.Nullable KindEnum kind) {
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

  public MediaInfo metadata(@javax.annotation.Nullable Map<String, Object> metadata) {
    this.metadata = JsonNullable.<Map<String, Object>>of(metadata);
    return this;
  }

  public MediaInfo putMetadataItem(String key, Object metadataItem) {
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

  public MediaInfo ocrText(@javax.annotation.Nullable String ocrText) {
    this.ocrText = JsonNullable.<String>of(ocrText);
    return this;
  }

  @javax.annotation.Nullable
  @JsonIgnore
  public String getOcrText() {
        return ocrText.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_OCR_TEXT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getOcrText_JsonNullable() {
    return ocrText;
  }

  @JsonProperty(JSON_PROPERTY_OCR_TEXT)
  public void setOcrText_JsonNullable(JsonNullable<String> ocrText) {
    this.ocrText = ocrText;
  }

  public void setOcrText(@javax.annotation.Nullable String ocrText) {
    this.ocrText = JsonNullable.<String>of(ocrText);
  }

  public MediaInfo synthetic(@javax.annotation.Nullable BigDecimal synthetic) {
    this.synthetic = JsonNullable.<BigDecimal>of(synthetic);
    return this;
  }

  @javax.annotation.Nullable
  @JsonIgnore
  public BigDecimal getSynthetic() {
        return synthetic.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SYNTHETIC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getSynthetic_JsonNullable() {
    return synthetic;
  }

  @JsonProperty(JSON_PROPERTY_SYNTHETIC)
  public void setSynthetic_JsonNullable(JsonNullable<BigDecimal> synthetic) {
    this.synthetic = synthetic;
  }

  public void setSynthetic(@javax.annotation.Nullable BigDecimal synthetic) {
    this.synthetic = JsonNullable.<BigDecimal>of(synthetic);
  }

  public MediaInfo tags(@javax.annotation.Nullable List<String> tags) {
    this.tags = tags;
    return this;
  }

  public MediaInfo addTagsItem(String tagsItem) {
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

  public MediaInfo transcriptSegments(@javax.annotation.Nullable Integer transcriptSegments) {
    this.transcriptSegments = transcriptSegments;
    return this;
  }

  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TRANSCRIPT_SEGMENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getTranscriptSegments() {
    return transcriptSegments;
  }

  @JsonProperty(value = JSON_PROPERTY_TRANSCRIPT_SEGMENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTranscriptSegments(@javax.annotation.Nullable Integer transcriptSegments) {
    this.transcriptSegments = transcriptSegments;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaInfo mediaInfo = (MediaInfo) o;
    return Objects.equals(this.blobId, mediaInfo.blobId) &&
        equalsNullable(this.caption, mediaInfo.caption) &&
        equalsNullable(this.capturedAt, mediaInfo.capturedAt) &&
        equalsNullable(this.customerId, mediaInfo.customerId) &&
        equalsNullable(this.device, mediaInfo.device) &&
        equalsNullable(this.externalRef, mediaInfo.externalRef) &&
        Objects.equals(this.frameCount, mediaInfo.frameCount) &&
        equalsNullable(this.gpsLat, mediaInfo.gpsLat) &&
        equalsNullable(this.gpsLon, mediaInfo.gpsLon) &&
        equalsNullable(this.kind, mediaInfo.kind) &&
        equalsNullable(this.metadata, mediaInfo.metadata) &&
        equalsNullable(this.ocrText, mediaInfo.ocrText) &&
        equalsNullable(this.synthetic, mediaInfo.synthetic) &&
        Objects.equals(this.tags, mediaInfo.tags) &&
        Objects.equals(this.transcriptSegments, mediaInfo.transcriptSegments);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(blobId, hashCodeNullable(caption), hashCodeNullable(capturedAt), hashCodeNullable(customerId), hashCodeNullable(device), hashCodeNullable(externalRef), frameCount, hashCodeNullable(gpsLat), hashCodeNullable(gpsLon), hashCodeNullable(kind), hashCodeNullable(metadata), hashCodeNullable(ocrText), hashCodeNullable(synthetic), tags, transcriptSegments);
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
    sb.append("class MediaInfo {\n");
    sb.append("    blobId: ").append(toIndentedString(blobId)).append("\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    capturedAt: ").append(toIndentedString(capturedAt)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    externalRef: ").append(toIndentedString(externalRef)).append("\n");
    sb.append("    frameCount: ").append(toIndentedString(frameCount)).append("\n");
    sb.append("    gpsLat: ").append(toIndentedString(gpsLat)).append("\n");
    sb.append("    gpsLon: ").append(toIndentedString(gpsLon)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    ocrText: ").append(toIndentedString(ocrText)).append("\n");
    sb.append("    synthetic: ").append(toIndentedString(synthetic)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    transcriptSegments: ").append(toIndentedString(transcriptSegments)).append("\n");
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

    if (getCapturedAt() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scaptured_at%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCapturedAt()))));
    }

    if (getCustomerId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scustomer_id%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCustomerId()))));
    }

    if (getDevice() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdevice%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDevice()))));
    }

    if (getExternalRef() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sexternal_ref%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getExternalRef()))));
    }

    if (getFrameCount() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sframe_count%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFrameCount()))));
    }

    if (getGpsLat() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sgps_lat%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getGpsLat()))));
    }

    if (getGpsLon() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sgps_lon%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getGpsLon()))));
    }

    if (getKind() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%skind%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getKind()))));
    }

    if (getMetadata() != null) {
      for (String _key : getMetadata().keySet()) {
        joiner.add(String.format(java.util.Locale.ROOT, "%smetadata%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, _key, containerSuffix),
            getMetadata().get(_key), ApiClient.urlEncode(ApiClient.valueToString(getMetadata().get(_key)))));
      }
    }

    if (getOcrText() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%socr_text%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOcrText()))));
    }

    if (getSynthetic() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssynthetic%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSynthetic()))));
    }

    if (getTags() != null) {
      for (int i = 0; i < getTags().size(); i++) {
        joiner.add(String.format(java.util.Locale.ROOT, "%stags%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(getTags().get(i)))));
      }
    }

    if (getTranscriptSegments() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stranscript_segments%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTranscriptSegments()))));
    }

    return joiner.toString();
  }
}

