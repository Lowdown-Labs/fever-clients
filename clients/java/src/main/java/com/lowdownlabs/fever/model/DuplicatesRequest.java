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
  DuplicatesRequest.JSON_PROPERTY_CUSTOMER_ID,
  DuplicatesRequest.JSON_PROPERTY_CUSTOMER_IDS,
  DuplicatesRequest.JSON_PROPERTY_LIMIT,
  DuplicatesRequest.JSON_PROPERTY_THRESHOLD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.25.0")
public class DuplicatesRequest {
  public static final String JSON_PROPERTY_CUSTOMER_ID = "customer_id";
  private JsonNullable<String> customerId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CUSTOMER_IDS = "customer_ids";
  private JsonNullable<List<String>> customerIds = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_LIMIT = "limit";
  @javax.annotation.Nullable
  private Integer limit = 500;

  public static final String JSON_PROPERTY_THRESHOLD = "threshold";
  @javax.annotation.Nullable
  private BigDecimal threshold = new BigDecimal("0.92");

  public DuplicatesRequest() {
  }

  public DuplicatesRequest customerId(@javax.annotation.Nullable String customerId) {
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

  public DuplicatesRequest customerIds(@javax.annotation.Nullable List<String> customerIds) {
    this.customerIds = JsonNullable.<List<String>>of(customerIds);
    return this;
  }

  public DuplicatesRequest addCustomerIdsItem(String customerIdsItem) {
    if (this.customerIds == null || !this.customerIds.isPresent() || this.customerIds.get() == null) {
      this.customerIds = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.customerIds.get().add(customerIdsItem);
    } catch (java.util.NoSuchElementException e) {
    }
    return this;
  }

  @javax.annotation.Nullable
  @JsonIgnore
  public List<String> getCustomerIds() {
        return customerIds.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_IDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getCustomerIds_JsonNullable() {
    return customerIds;
  }

  @JsonProperty(JSON_PROPERTY_CUSTOMER_IDS)
  public void setCustomerIds_JsonNullable(JsonNullable<List<String>> customerIds) {
    this.customerIds = customerIds;
  }

  public void setCustomerIds(@javax.annotation.Nullable List<String> customerIds) {
    this.customerIds = JsonNullable.<List<String>>of(customerIds);
  }

  public DuplicatesRequest limit(@javax.annotation.Nullable Integer limit) {
    this.limit = limit;
    return this;
  }

  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getLimit() {
    return limit;
  }

  @JsonProperty(value = JSON_PROPERTY_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimit(@javax.annotation.Nullable Integer limit) {
    this.limit = limit;
  }

  public DuplicatesRequest threshold(@javax.annotation.Nullable BigDecimal threshold) {
    this.threshold = threshold;
    return this;
  }

  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_THRESHOLD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public BigDecimal getThreshold() {
    return threshold;
  }

  @JsonProperty(value = JSON_PROPERTY_THRESHOLD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreshold(@javax.annotation.Nullable BigDecimal threshold) {
    this.threshold = threshold;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DuplicatesRequest duplicatesRequest = (DuplicatesRequest) o;
    return equalsNullable(this.customerId, duplicatesRequest.customerId) &&
        equalsNullable(this.customerIds, duplicatesRequest.customerIds) &&
        Objects.equals(this.limit, duplicatesRequest.limit) &&
        Objects.equals(this.threshold, duplicatesRequest.threshold);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(customerId), hashCodeNullable(customerIds), limit, threshold);
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
    sb.append("class DuplicatesRequest {\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    customerIds: ").append(toIndentedString(customerIds)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
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

    if (getCustomerId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scustomer_id%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCustomerId()))));
    }

    if (getCustomerIds() != null) {
      for (int i = 0; i < getCustomerIds().size(); i++) {
        joiner.add(String.format(java.util.Locale.ROOT, "%scustomer_ids%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(getCustomerIds().get(i)))));
      }
    }

    if (getLimit() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slimit%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLimit()))));
    }

    if (getThreshold() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sthreshold%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getThreshold()))));
    }

    return joiner.toString();
  }
}

