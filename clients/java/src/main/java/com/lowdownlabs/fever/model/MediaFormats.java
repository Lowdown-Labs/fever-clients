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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import com.lowdownlabs.fever.ApiClient;

@JsonPropertyOrder({
  MediaFormats.JSON_PROPERTY_AUDIO,
  MediaFormats.JSON_PROPERTY_DOCUMENT,
  MediaFormats.JSON_PROPERTY_IMAGE,
  MediaFormats.JSON_PROPERTY_VIDEO
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.25.0")
public class MediaFormats {
  public static final String JSON_PROPERTY_AUDIO = "audio";
  @javax.annotation.Nonnull
  private List<String> audio = new ArrayList<>();

  public static final String JSON_PROPERTY_DOCUMENT = "document";
  @javax.annotation.Nonnull
  private List<String> document = new ArrayList<>();

  public static final String JSON_PROPERTY_IMAGE = "image";
  @javax.annotation.Nonnull
  private List<String> image = new ArrayList<>();

  public static final String JSON_PROPERTY_VIDEO = "video";
  @javax.annotation.Nonnull
  private List<String> video = new ArrayList<>();

  public MediaFormats() {
  }

  public MediaFormats audio(@javax.annotation.Nonnull List<String> audio) {
    this.audio = audio;
    return this;
  }

  public MediaFormats addAudioItem(String audioItem) {
    if (this.audio == null) {
      this.audio = new ArrayList<>();
    }
    this.audio.add(audioItem);
    return this;
  }

  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_AUDIO, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getAudio() {
    return audio;
  }

  @JsonProperty(value = JSON_PROPERTY_AUDIO, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAudio(@javax.annotation.Nonnull List<String> audio) {
    this.audio = audio;
  }

  public MediaFormats document(@javax.annotation.Nonnull List<String> document) {
    this.document = document;
    return this;
  }

  public MediaFormats addDocumentItem(String documentItem) {
    if (this.document == null) {
      this.document = new ArrayList<>();
    }
    this.document.add(documentItem);
    return this;
  }

  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_DOCUMENT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getDocument() {
    return document;
  }

  @JsonProperty(value = JSON_PROPERTY_DOCUMENT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDocument(@javax.annotation.Nonnull List<String> document) {
    this.document = document;
  }

  public MediaFormats image(@javax.annotation.Nonnull List<String> image) {
    this.image = image;
    return this;
  }

  public MediaFormats addImageItem(String imageItem) {
    if (this.image == null) {
      this.image = new ArrayList<>();
    }
    this.image.add(imageItem);
    return this;
  }

  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_IMAGE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getImage() {
    return image;
  }

  @JsonProperty(value = JSON_PROPERTY_IMAGE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setImage(@javax.annotation.Nonnull List<String> image) {
    this.image = image;
  }

  public MediaFormats video(@javax.annotation.Nonnull List<String> video) {
    this.video = video;
    return this;
  }

  public MediaFormats addVideoItem(String videoItem) {
    if (this.video == null) {
      this.video = new ArrayList<>();
    }
    this.video.add(videoItem);
    return this;
  }

  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_VIDEO, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getVideo() {
    return video;
  }

  @JsonProperty(value = JSON_PROPERTY_VIDEO, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVideo(@javax.annotation.Nonnull List<String> video) {
    this.video = video;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaFormats mediaFormats = (MediaFormats) o;
    return Objects.equals(this.audio, mediaFormats.audio) &&
        Objects.equals(this.document, mediaFormats.document) &&
        Objects.equals(this.image, mediaFormats.image) &&
        Objects.equals(this.video, mediaFormats.video);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audio, document, image, video);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaFormats {\n");
    sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
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

    if (getAudio() != null) {
      for (int i = 0; i < getAudio().size(); i++) {
        joiner.add(String.format(java.util.Locale.ROOT, "%saudio%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(getAudio().get(i)))));
      }
    }

    if (getDocument() != null) {
      for (int i = 0; i < getDocument().size(); i++) {
        joiner.add(String.format(java.util.Locale.ROOT, "%sdocument%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(getDocument().get(i)))));
      }
    }

    if (getImage() != null) {
      for (int i = 0; i < getImage().size(); i++) {
        joiner.add(String.format(java.util.Locale.ROOT, "%simage%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(getImage().get(i)))));
      }
    }

    if (getVideo() != null) {
      for (int i = 0; i < getVideo().size(); i++) {
        joiner.add(String.format(java.util.Locale.ROOT, "%svideo%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(getVideo().get(i)))));
      }
    }

    return joiner.toString();
  }
}

