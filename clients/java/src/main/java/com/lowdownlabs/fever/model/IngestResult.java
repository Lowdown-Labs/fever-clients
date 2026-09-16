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
import com.lowdownlabs.fever.model.IngestedMedia;
import com.lowdownlabs.fever.model.Job;
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
  IngestResult.JSON_PROPERTY_EXISTING,
  IngestResult.JSON_PROPERTY_INGESTED,
  IngestResult.JSON_PROPERTY_JOB
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.25.0")
public class IngestResult {
  public static final String JSON_PROPERTY_EXISTING = "existing";
  @javax.annotation.Nullable
  private List<IngestedMedia> existing = new ArrayList<>();

  public static final String JSON_PROPERTY_INGESTED = "ingested";
  @javax.annotation.Nullable
  private List<IngestedMedia> ingested = new ArrayList<>();

  public static final String JSON_PROPERTY_JOB = "job";
  private JsonNullable<Job> job = JsonNullable.<Job>undefined();

  public IngestResult() {
  }

  public IngestResult existing(@javax.annotation.Nullable List<IngestedMedia> existing) {
    this.existing = existing;
    return this;
  }

  public IngestResult addExistingItem(IngestedMedia existingItem) {
    if (this.existing == null) {
      this.existing = new ArrayList<>();
    }
    this.existing.add(existingItem);
    return this;
  }

  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EXISTING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<IngestedMedia> getExisting() {
    return existing;
  }

  @JsonProperty(value = JSON_PROPERTY_EXISTING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExisting(@javax.annotation.Nullable List<IngestedMedia> existing) {
    this.existing = existing;
  }

  public IngestResult ingested(@javax.annotation.Nullable List<IngestedMedia> ingested) {
    this.ingested = ingested;
    return this;
  }

  public IngestResult addIngestedItem(IngestedMedia ingestedItem) {
    if (this.ingested == null) {
      this.ingested = new ArrayList<>();
    }
    this.ingested.add(ingestedItem);
    return this;
  }

  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INGESTED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<IngestedMedia> getIngested() {
    return ingested;
  }

  @JsonProperty(value = JSON_PROPERTY_INGESTED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIngested(@javax.annotation.Nullable List<IngestedMedia> ingested) {
    this.ingested = ingested;
  }

  public IngestResult job(@javax.annotation.Nullable Job job) {
    this.job = JsonNullable.<Job>of(job);
    return this;
  }

  @javax.annotation.Nullable
  @JsonIgnore
  public Job getJob() {
        return job.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_JOB, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Job> getJob_JsonNullable() {
    return job;
  }

  @JsonProperty(JSON_PROPERTY_JOB)
  public void setJob_JsonNullable(JsonNullable<Job> job) {
    this.job = job;
  }

  public void setJob(@javax.annotation.Nullable Job job) {
    this.job = JsonNullable.<Job>of(job);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IngestResult ingestResult = (IngestResult) o;
    return Objects.equals(this.existing, ingestResult.existing) &&
        Objects.equals(this.ingested, ingestResult.ingested) &&
        equalsNullable(this.job, ingestResult.job);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(existing, ingested, hashCodeNullable(job));
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
    sb.append("class IngestResult {\n");
    sb.append("    existing: ").append(toIndentedString(existing)).append("\n");
    sb.append("    ingested: ").append(toIndentedString(ingested)).append("\n");
    sb.append("    job: ").append(toIndentedString(job)).append("\n");
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

    if (getExisting() != null) {
      for (int i = 0; i < getExisting().size(); i++) {
        if (getExisting().get(i) != null) {
          joiner.add(getExisting().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sexisting%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    if (getIngested() != null) {
      for (int i = 0; i < getIngested().size(); i++) {
        if (getIngested().get(i) != null) {
          joiner.add(getIngested().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%singested%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    if (getJob() != null) {
      joiner.add(getJob().toUrlQueryString(prefix + "job" + suffix));
    }

    return joiner.toString();
  }
}

