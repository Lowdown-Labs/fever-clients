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
  QueryRequest.JSON_PROPERTY_ROW_LIMIT,
  QueryRequest.JSON_PROPERTY_SQL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.25.0")
public class QueryRequest {
  public static final String JSON_PROPERTY_ROW_LIMIT = "row_limit";
  @javax.annotation.Nullable
  private Integer rowLimit = 200;

  public static final String JSON_PROPERTY_SQL = "sql";
  @javax.annotation.Nonnull
  private String sql;

  public QueryRequest() {
  }

  public QueryRequest rowLimit(@javax.annotation.Nullable Integer rowLimit) {
    this.rowLimit = rowLimit;
    return this;
  }

  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ROW_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getRowLimit() {
    return rowLimit;
  }

  @JsonProperty(value = JSON_PROPERTY_ROW_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRowLimit(@javax.annotation.Nullable Integer rowLimit) {
    this.rowLimit = rowLimit;
  }

  public QueryRequest sql(@javax.annotation.Nonnull String sql) {
    this.sql = sql;
    return this;
  }

  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_SQL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSql() {
    return sql;
  }

  @JsonProperty(value = JSON_PROPERTY_SQL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSql(@javax.annotation.Nonnull String sql) {
    this.sql = sql;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryRequest queryRequest = (QueryRequest) o;
    return Objects.equals(this.rowLimit, queryRequest.rowLimit) &&
        Objects.equals(this.sql, queryRequest.sql);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rowLimit, sql);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryRequest {\n");
    sb.append("    rowLimit: ").append(toIndentedString(rowLimit)).append("\n");
    sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
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

    if (getRowLimit() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%srow_limit%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRowLimit()))));
    }

    if (getSql() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssql%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSql()))));
    }

    return joiner.toString();
  }
}

