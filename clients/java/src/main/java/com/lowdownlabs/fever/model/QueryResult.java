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
  QueryResult.JSON_PROPERTY_COLUMNS,
  QueryResult.JSON_PROPERTY_ROWS,
  QueryResult.JSON_PROPERTY_TRUNCATED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.25.0")
public class QueryResult {
  public static final String JSON_PROPERTY_COLUMNS = "columns";
  @javax.annotation.Nonnull
  private List<String> columns = new ArrayList<>();

  public static final String JSON_PROPERTY_ROWS = "rows";
  @javax.annotation.Nonnull
  private List<List<Object>> rows = new ArrayList<>();

  public static final String JSON_PROPERTY_TRUNCATED = "truncated";
  @javax.annotation.Nonnull
  private Boolean truncated;

  public QueryResult() {
  }

  public QueryResult columns(@javax.annotation.Nonnull List<String> columns) {
    this.columns = columns;
    return this;
  }

  public QueryResult addColumnsItem(String columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    return this;
  }

  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_COLUMNS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getColumns() {
    return columns;
  }

  @JsonProperty(value = JSON_PROPERTY_COLUMNS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setColumns(@javax.annotation.Nonnull List<String> columns) {
    this.columns = columns;
  }

  public QueryResult rows(@javax.annotation.Nonnull List<List<Object>> rows) {
    this.rows = rows;
    return this;
  }

  public QueryResult addRowsItem(List<Object> rowsItem) {
    if (this.rows == null) {
      this.rows = new ArrayList<>();
    }
    this.rows.add(rowsItem);
    return this;
  }

  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_ROWS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<List<Object>> getRows() {
    return rows;
  }

  @JsonProperty(value = JSON_PROPERTY_ROWS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRows(@javax.annotation.Nonnull List<List<Object>> rows) {
    this.rows = rows;
  }

  public QueryResult truncated(@javax.annotation.Nonnull Boolean truncated) {
    this.truncated = truncated;
    return this;
  }

  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_TRUNCATED, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getTruncated() {
    return truncated;
  }

  @JsonProperty(value = JSON_PROPERTY_TRUNCATED, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTruncated(@javax.annotation.Nonnull Boolean truncated) {
    this.truncated = truncated;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryResult queryResult = (QueryResult) o;
    return Objects.equals(this.columns, queryResult.columns) &&
        Objects.equals(this.rows, queryResult.rows) &&
        Objects.equals(this.truncated, queryResult.truncated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, rows, truncated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryResult {\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    truncated: ").append(toIndentedString(truncated)).append("\n");
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

    if (getColumns() != null) {
      for (int i = 0; i < getColumns().size(); i++) {
        joiner.add(String.format(java.util.Locale.ROOT, "%scolumns%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(getColumns().get(i)))));
      }
    }

    if (getRows() != null) {
      for (int i = 0; i < getRows().size(); i++) {
        joiner.add(String.format(java.util.Locale.ROOT, "%srows%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(getRows().get(i)))));
      }
    }

    if (getTruncated() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%struncated%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTruncated()))));
    }

    return joiner.toString();
  }
}

