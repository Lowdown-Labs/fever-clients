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
import com.lowdownlabs.fever.model.CorpusTag;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import com.lowdownlabs.fever.ApiClient;

@JsonPropertyOrder({
  CorpusStats.JSON_PROPERTY_KINDS,
  CorpusStats.JSON_PROPERTY_TOP_TAGS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.25.0")
public class CorpusStats {
  public static final String JSON_PROPERTY_KINDS = "kinds";
  @javax.annotation.Nonnull
  private Map<String, Integer> kinds = new HashMap<>();

  public static final String JSON_PROPERTY_TOP_TAGS = "top_tags";
  @javax.annotation.Nonnull
  private List<CorpusTag> topTags = new ArrayList<>();

  public CorpusStats() {
  }

  public CorpusStats kinds(@javax.annotation.Nonnull Map<String, Integer> kinds) {
    this.kinds = kinds;
    return this;
  }

  public CorpusStats putKindsItem(String key, Integer kindsItem) {
    if (this.kinds == null) {
      this.kinds = new HashMap<>();
    }
    this.kinds.put(key, kindsItem);
    return this;
  }

  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_KINDS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, Integer> getKinds() {
    return kinds;
  }

  @JsonProperty(value = JSON_PROPERTY_KINDS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKinds(@javax.annotation.Nonnull Map<String, Integer> kinds) {
    this.kinds = kinds;
  }

  public CorpusStats topTags(@javax.annotation.Nonnull List<CorpusTag> topTags) {
    this.topTags = topTags;
    return this;
  }

  public CorpusStats addTopTagsItem(CorpusTag topTagsItem) {
    if (this.topTags == null) {
      this.topTags = new ArrayList<>();
    }
    this.topTags.add(topTagsItem);
    return this;
  }

  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_TOP_TAGS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<CorpusTag> getTopTags() {
    return topTags;
  }

  @JsonProperty(value = JSON_PROPERTY_TOP_TAGS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTopTags(@javax.annotation.Nonnull List<CorpusTag> topTags) {
    this.topTags = topTags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CorpusStats corpusStats = (CorpusStats) o;
    return Objects.equals(this.kinds, corpusStats.kinds) &&
        Objects.equals(this.topTags, corpusStats.topTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kinds, topTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorpusStats {\n");
    sb.append("    kinds: ").append(toIndentedString(kinds)).append("\n");
    sb.append("    topTags: ").append(toIndentedString(topTags)).append("\n");
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

    if (getKinds() != null) {
      for (String _key : getKinds().keySet()) {
        joiner.add(String.format(java.util.Locale.ROOT, "%skinds%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, _key, containerSuffix),
            getKinds().get(_key), ApiClient.urlEncode(ApiClient.valueToString(getKinds().get(_key)))));
      }
    }

    if (getTopTags() != null) {
      for (int i = 0; i < getTopTags().size(); i++) {
        if (getTopTags().get(i) != null) {
          joiner.add(getTopTags().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%stop_tags%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

