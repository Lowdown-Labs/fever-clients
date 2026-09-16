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
import com.lowdownlabs.fever.model.DuplicateCluster;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import com.lowdownlabs.fever.ApiClient;

@JsonPropertyOrder({
  DuplicatesResponse.JSON_PROPERTY_CLUSTERS,
  DuplicatesResponse.JSON_PROPERTY_DUPLICATE_CLUSTERS,
  DuplicatesResponse.JSON_PROPERTY_TOTAL_DUPLICATES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.25.0")
public class DuplicatesResponse {
  public static final String JSON_PROPERTY_CLUSTERS = "clusters";
  @javax.annotation.Nonnull
  private Integer clusters;

  public static final String JSON_PROPERTY_DUPLICATE_CLUSTERS = "duplicate_clusters";
  @javax.annotation.Nullable
  private List<DuplicateCluster> duplicateClusters = new ArrayList<>();

  public static final String JSON_PROPERTY_TOTAL_DUPLICATES = "total_duplicates";
  @javax.annotation.Nonnull
  private Integer totalDuplicates;

  public DuplicatesResponse() {
  }

  public DuplicatesResponse clusters(@javax.annotation.Nonnull Integer clusters) {
    this.clusters = clusters;
    return this;
  }

  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_CLUSTERS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getClusters() {
    return clusters;
  }

  @JsonProperty(value = JSON_PROPERTY_CLUSTERS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClusters(@javax.annotation.Nonnull Integer clusters) {
    this.clusters = clusters;
  }

  public DuplicatesResponse duplicateClusters(@javax.annotation.Nullable List<DuplicateCluster> duplicateClusters) {
    this.duplicateClusters = duplicateClusters;
    return this;
  }

  public DuplicatesResponse addDuplicateClustersItem(DuplicateCluster duplicateClustersItem) {
    if (this.duplicateClusters == null) {
      this.duplicateClusters = new ArrayList<>();
    }
    this.duplicateClusters.add(duplicateClustersItem);
    return this;
  }

  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DUPLICATE_CLUSTERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<DuplicateCluster> getDuplicateClusters() {
    return duplicateClusters;
  }

  @JsonProperty(value = JSON_PROPERTY_DUPLICATE_CLUSTERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDuplicateClusters(@javax.annotation.Nullable List<DuplicateCluster> duplicateClusters) {
    this.duplicateClusters = duplicateClusters;
  }

  public DuplicatesResponse totalDuplicates(@javax.annotation.Nonnull Integer totalDuplicates) {
    this.totalDuplicates = totalDuplicates;
    return this;
  }

  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_TOTAL_DUPLICATES, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getTotalDuplicates() {
    return totalDuplicates;
  }

  @JsonProperty(value = JSON_PROPERTY_TOTAL_DUPLICATES, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalDuplicates(@javax.annotation.Nonnull Integer totalDuplicates) {
    this.totalDuplicates = totalDuplicates;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DuplicatesResponse duplicatesResponse = (DuplicatesResponse) o;
    return Objects.equals(this.clusters, duplicatesResponse.clusters) &&
        Objects.equals(this.duplicateClusters, duplicatesResponse.duplicateClusters) &&
        Objects.equals(this.totalDuplicates, duplicatesResponse.totalDuplicates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusters, duplicateClusters, totalDuplicates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DuplicatesResponse {\n");
    sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
    sb.append("    duplicateClusters: ").append(toIndentedString(duplicateClusters)).append("\n");
    sb.append("    totalDuplicates: ").append(toIndentedString(totalDuplicates)).append("\n");
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

    if (getClusters() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sclusters%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getClusters()))));
    }

    if (getDuplicateClusters() != null) {
      for (int i = 0; i < getDuplicateClusters().size(); i++) {
        if (getDuplicateClusters().get(i) != null) {
          joiner.add(getDuplicateClusters().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sduplicate_clusters%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    if (getTotalDuplicates() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stotal_duplicates%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTotalDuplicates()))));
    }

    return joiner.toString();
  }
}

