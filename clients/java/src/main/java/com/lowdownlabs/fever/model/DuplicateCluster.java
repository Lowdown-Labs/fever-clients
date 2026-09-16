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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import com.lowdownlabs.fever.ApiClient;

@JsonPropertyOrder({
  DuplicateCluster.JSON_PROPERTY_MEMBER_CUSTOMERS,
  DuplicateCluster.JSON_PROPERTY_MEMBERS,
  DuplicateCluster.JSON_PROPERTY_SIZE,
  DuplicateCluster.JSON_PROPERTY_TIGHTNESS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.25.0")
public class DuplicateCluster {
  public static final String JSON_PROPERTY_MEMBER_CUSTOMERS = "member_customers";
  @javax.annotation.Nullable
  private List<String> memberCustomers = new ArrayList<>();

  public static final String JSON_PROPERTY_MEMBERS = "members";
  @javax.annotation.Nonnull
  private List<Integer> members = new ArrayList<>();

  public static final String JSON_PROPERTY_SIZE = "size";
  @javax.annotation.Nonnull
  private Integer size;

  public static final String JSON_PROPERTY_TIGHTNESS = "tightness";
  @javax.annotation.Nonnull
  private BigDecimal tightness;

  public DuplicateCluster() {
  }

  public DuplicateCluster memberCustomers(@javax.annotation.Nullable List<String> memberCustomers) {
    this.memberCustomers = memberCustomers;
    return this;
  }

  public DuplicateCluster addMemberCustomersItem(String memberCustomersItem) {
    if (this.memberCustomers == null) {
      this.memberCustomers = new ArrayList<>();
    }
    this.memberCustomers.add(memberCustomersItem);
    return this;
  }

  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MEMBER_CUSTOMERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getMemberCustomers() {
    return memberCustomers;
  }

  @JsonProperty(value = JSON_PROPERTY_MEMBER_CUSTOMERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMemberCustomers(@javax.annotation.Nullable List<String> memberCustomers) {
    this.memberCustomers = memberCustomers;
  }

  public DuplicateCluster members(@javax.annotation.Nonnull List<Integer> members) {
    this.members = members;
    return this;
  }

  public DuplicateCluster addMembersItem(Integer membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<>();
    }
    this.members.add(membersItem);
    return this;
  }

  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_MEMBERS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<Integer> getMembers() {
    return members;
  }

  @JsonProperty(value = JSON_PROPERTY_MEMBERS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMembers(@javax.annotation.Nonnull List<Integer> members) {
    this.members = members;
  }

  public DuplicateCluster size(@javax.annotation.Nonnull Integer size) {
    this.size = size;
    return this;
  }

  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_SIZE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getSize() {
    return size;
  }

  @JsonProperty(value = JSON_PROPERTY_SIZE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSize(@javax.annotation.Nonnull Integer size) {
    this.size = size;
  }

  public DuplicateCluster tightness(@javax.annotation.Nonnull BigDecimal tightness) {
    this.tightness = tightness;
    return this;
  }

  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_TIGHTNESS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public BigDecimal getTightness() {
    return tightness;
  }

  @JsonProperty(value = JSON_PROPERTY_TIGHTNESS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTightness(@javax.annotation.Nonnull BigDecimal tightness) {
    this.tightness = tightness;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DuplicateCluster duplicateCluster = (DuplicateCluster) o;
    return Objects.equals(this.memberCustomers, duplicateCluster.memberCustomers) &&
        Objects.equals(this.members, duplicateCluster.members) &&
        Objects.equals(this.size, duplicateCluster.size) &&
        Objects.equals(this.tightness, duplicateCluster.tightness);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberCustomers, members, size, tightness);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DuplicateCluster {\n");
    sb.append("    memberCustomers: ").append(toIndentedString(memberCustomers)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    tightness: ").append(toIndentedString(tightness)).append("\n");
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

    if (getMemberCustomers() != null) {
      for (int i = 0; i < getMemberCustomers().size(); i++) {
        joiner.add(String.format(java.util.Locale.ROOT, "%smember_customers%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(getMemberCustomers().get(i)))));
      }
    }

    if (getMembers() != null) {
      for (int i = 0; i < getMembers().size(); i++) {
        joiner.add(String.format(java.util.Locale.ROOT, "%smembers%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(getMembers().get(i)))));
      }
    }

    if (getSize() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssize%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSize()))));
    }

    if (getTightness() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stightness%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTightness()))));
    }

    return joiner.toString();
  }
}

