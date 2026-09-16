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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import com.lowdownlabs.fever.ApiClient;

@JsonPropertyOrder({
  ApiKey.JSON_PROPERTY_CREATED_AT,
  ApiKey.JSON_PROPERTY_CUSTOMER_ID,
  ApiKey.JSON_PROPERTY_ID,
  ApiKey.JSON_PROPERTY_NAME,
  ApiKey.JSON_PROPERTY_REVOKED,
  ApiKey.JSON_PROPERTY_ROLE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.25.0")
public class ApiKey {
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private JsonNullable<String> createdAt = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customer_id";
  private JsonNullable<String> customerId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nonnull
  private Integer id;

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_REVOKED = "revoked";
  @javax.annotation.Nullable
  private Boolean revoked = false;

  public static final String JSON_PROPERTY_ROLE = "role";
  @javax.annotation.Nullable
  private String role = "scoped";

  public ApiKey() {
  }

  public ApiKey createdAt(@javax.annotation.Nullable String createdAt) {
    this.createdAt = JsonNullable.<String>of(createdAt);
    return this;
  }

  @javax.annotation.Nullable
  @JsonIgnore
  public String getCreatedAt() {
        return createdAt.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_CREATED_AT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCreatedAt_JsonNullable() {
    return createdAt;
  }

  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  public void setCreatedAt_JsonNullable(JsonNullable<String> createdAt) {
    this.createdAt = createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nullable String createdAt) {
    this.createdAt = JsonNullable.<String>of(createdAt);
  }

  public ApiKey customerId(@javax.annotation.Nullable String customerId) {
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

  public ApiKey id(@javax.annotation.Nonnull Integer id) {
    this.id = id;
    return this;
  }

  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getId() {
    return id;
  }

  @JsonProperty(value = JSON_PROPERTY_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(@javax.annotation.Nonnull Integer id) {
    this.id = id;
  }

  public ApiKey name(@javax.annotation.Nullable String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

  @javax.annotation.Nullable
  @JsonIgnore
  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = JsonNullable.<String>of(name);
  }

  public ApiKey revoked(@javax.annotation.Nullable Boolean revoked) {
    this.revoked = revoked;
    return this;
  }

  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_REVOKED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getRevoked() {
    return revoked;
  }

  @JsonProperty(value = JSON_PROPERTY_REVOKED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRevoked(@javax.annotation.Nullable Boolean revoked) {
    this.revoked = revoked;
  }

  public ApiKey role(@javax.annotation.Nullable String role) {
    this.role = role;
    return this;
  }

  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ROLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRole() {
    return role;
  }

  @JsonProperty(value = JSON_PROPERTY_ROLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRole(@javax.annotation.Nullable String role) {
    this.role = role;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiKey apiKey = (ApiKey) o;
    return equalsNullable(this.createdAt, apiKey.createdAt) &&
        equalsNullable(this.customerId, apiKey.customerId) &&
        Objects.equals(this.id, apiKey.id) &&
        equalsNullable(this.name, apiKey.name) &&
        Objects.equals(this.revoked, apiKey.revoked) &&
        Objects.equals(this.role, apiKey.role);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(createdAt), hashCodeNullable(customerId), id, hashCodeNullable(name), revoked, role);
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
    sb.append("class ApiKey {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    revoked: ").append(toIndentedString(revoked)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

    if (getCreatedAt() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%screated_at%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCreatedAt()))));
    }

    if (getCustomerId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scustomer_id%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCustomerId()))));
    }

    if (getId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sid%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getId()))));
    }

    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    if (getRevoked() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%srevoked%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRevoked()))));
    }

    if (getRole() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%srole%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRole()))));
    }

    return joiner.toString();
  }
}

