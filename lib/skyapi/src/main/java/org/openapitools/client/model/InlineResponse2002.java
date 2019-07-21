/*
 * Skycoin REST API.
 * Skycoin is a next-generation cryptocurrency.
 *
 * OpenAPI spec version: 0.26.0
 * Contact: contact@skycoin.net
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse2002
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-06-06T13:36:59.326162-04:00[America/Havana]")
public class InlineResponse2002 {
  public static final String SERIALIZED_NAME_CURRENT_COINHOUR_SUPPLY = "current_coinhour_supply";
  @SerializedName(SERIALIZED_NAME_CURRENT_COINHOUR_SUPPLY)
  private String currentCoinhourSupply;

  public static final String SERIALIZED_NAME_CURRENT_SUPPLY = "current_supply";
  @SerializedName(SERIALIZED_NAME_CURRENT_SUPPLY)
  private String currentSupply;

  public static final String SERIALIZED_NAME_LOCKED_DISTRIBUTION_ADDRESSES = "locked_distribution_addresses";
  @SerializedName(SERIALIZED_NAME_LOCKED_DISTRIBUTION_ADDRESSES)
  private List<String> lockedDistributionAddresses = new ArrayList<String>();

  public static final String SERIALIZED_NAME_MAX_SUPPLY = "max_supply";
  @SerializedName(SERIALIZED_NAME_MAX_SUPPLY)
  private String maxSupply;

  public static final String SERIALIZED_NAME_TOTAL_COINHOUR_SUPPLY = "total_coinhour_supply";
  @SerializedName(SERIALIZED_NAME_TOTAL_COINHOUR_SUPPLY)
  private String totalCoinhourSupply;

  public static final String SERIALIZED_NAME_TOTAL_SUPPLY = "total_supply";
  @SerializedName(SERIALIZED_NAME_TOTAL_SUPPLY)
  private String totalSupply;

  public static final String SERIALIZED_NAME_UNLOCKED_DISTRIBUTION_ADDRESSES = "unlocked_distribution_addresses";
  @SerializedName(SERIALIZED_NAME_UNLOCKED_DISTRIBUTION_ADDRESSES)
  private List<String> unlockedDistributionAddresses = new ArrayList<String>();

  public InlineResponse2002 currentCoinhourSupply(String currentCoinhourSupply) {
    this.currentCoinhourSupply = currentCoinhourSupply;
    return this;
  }

   /**
   * CurrentCoinHourSupply is coins hours in non distribution addresses.
   * @return currentCoinhourSupply
  **/
  @ApiModelProperty(value = "CurrentCoinHourSupply is coins hours in non distribution addresses.")
  public String getCurrentCoinhourSupply() {
    return currentCoinhourSupply;
  }

  public void setCurrentCoinhourSupply(String currentCoinhourSupply) {
    this.currentCoinhourSupply = currentCoinhourSupply;
  }

  public InlineResponse2002 currentSupply(String currentSupply) {
    this.currentSupply = currentSupply;
    return this;
  }

   /**
   * Coins distributed beyond the project.
   * @return currentSupply
  **/
  @ApiModelProperty(value = "Coins distributed beyond the project.")
  public String getCurrentSupply() {
    return currentSupply;
  }

  public void setCurrentSupply(String currentSupply) {
    this.currentSupply = currentSupply;
  }

  public InlineResponse2002 lockedDistributionAddresses(List<String> lockedDistributionAddresses) {
    this.lockedDistributionAddresses = lockedDistributionAddresses;
    return this;
  }

  public InlineResponse2002 addLockedDistributionAddressesItem(String lockedDistributionAddressesItem) {
    if (this.lockedDistributionAddresses == null) {
      this.lockedDistributionAddresses = new ArrayList<String>();
    }
    this.lockedDistributionAddresses.add(lockedDistributionAddressesItem);
    return this;
  }

   /**
   * Distribution addresses which are locked and do not count towards total supply.
   * @return lockedDistributionAddresses
  **/
  @ApiModelProperty(value = "Distribution addresses which are locked and do not count towards total supply.")
  public List<String> getLockedDistributionAddresses() {
    return lockedDistributionAddresses;
  }

  public void setLockedDistributionAddresses(List<String> lockedDistributionAddresses) {
    this.lockedDistributionAddresses = lockedDistributionAddresses;
  }

  public InlineResponse2002 maxSupply(String maxSupply) {
    this.maxSupply = maxSupply;
    return this;
  }

   /**
   * MaxSupply is the maximum number of coins to be distributed ever.
   * @return maxSupply
  **/
  @ApiModelProperty(value = "MaxSupply is the maximum number of coins to be distributed ever.")
  public String getMaxSupply() {
    return maxSupply;
  }

  public void setMaxSupply(String maxSupply) {
    this.maxSupply = maxSupply;
  }

  public InlineResponse2002 totalCoinhourSupply(String totalCoinhourSupply) {
    this.totalCoinhourSupply = totalCoinhourSupply;
    return this;
  }

   /**
   * TotalCoinHourSupply is coin hours in all addresses including unlocked distribution addresses.
   * @return totalCoinhourSupply
  **/
  @ApiModelProperty(value = "TotalCoinHourSupply is coin hours in all addresses including unlocked distribution addresses.")
  public String getTotalCoinhourSupply() {
    return totalCoinhourSupply;
  }

  public void setTotalCoinhourSupply(String totalCoinhourSupply) {
    this.totalCoinhourSupply = totalCoinhourSupply;
  }

  public InlineResponse2002 totalSupply(String totalSupply) {
    this.totalSupply = totalSupply;
    return this;
  }

   /**
   * TotalSupply is CurrentSupply plus coins held by the distribution addresses that are spendable.
   * @return totalSupply
  **/
  @ApiModelProperty(value = "TotalSupply is CurrentSupply plus coins held by the distribution addresses that are spendable.")
  public String getTotalSupply() {
    return totalSupply;
  }

  public void setTotalSupply(String totalSupply) {
    this.totalSupply = totalSupply;
  }

  public InlineResponse2002 unlockedDistributionAddresses(List<String> unlockedDistributionAddresses) {
    this.unlockedDistributionAddresses = unlockedDistributionAddresses;
    return this;
  }

  public InlineResponse2002 addUnlockedDistributionAddressesItem(String unlockedDistributionAddressesItem) {
    if (this.unlockedDistributionAddresses == null) {
      this.unlockedDistributionAddresses = new ArrayList<String>();
    }
    this.unlockedDistributionAddresses.add(unlockedDistributionAddressesItem);
    return this;
  }

   /**
   * Distribution addresses which count towards total supply.
   * @return unlockedDistributionAddresses
  **/
  @ApiModelProperty(value = "Distribution addresses which count towards total supply.")
  public List<String> getUnlockedDistributionAddresses() {
    return unlockedDistributionAddresses;
  }

  public void setUnlockedDistributionAddresses(List<String> unlockedDistributionAddresses) {
    this.unlockedDistributionAddresses = unlockedDistributionAddresses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002 inlineResponse2002 = (InlineResponse2002) o;
    return Objects.equals(this.currentCoinhourSupply, inlineResponse2002.currentCoinhourSupply) &&
        Objects.equals(this.currentSupply, inlineResponse2002.currentSupply) &&
        Objects.equals(this.lockedDistributionAddresses, inlineResponse2002.lockedDistributionAddresses) &&
        Objects.equals(this.maxSupply, inlineResponse2002.maxSupply) &&
        Objects.equals(this.totalCoinhourSupply, inlineResponse2002.totalCoinhourSupply) &&
        Objects.equals(this.totalSupply, inlineResponse2002.totalSupply) &&
        Objects.equals(this.unlockedDistributionAddresses, inlineResponse2002.unlockedDistributionAddresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentCoinhourSupply, currentSupply, lockedDistributionAddresses, maxSupply, totalCoinhourSupply, totalSupply, unlockedDistributionAddresses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002 {\n");
    sb.append("    currentCoinhourSupply: ").append(toIndentedString(currentCoinhourSupply)).append("\n");
    sb.append("    currentSupply: ").append(toIndentedString(currentSupply)).append("\n");
    sb.append("    lockedDistributionAddresses: ").append(toIndentedString(lockedDistributionAddresses)).append("\n");
    sb.append("    maxSupply: ").append(toIndentedString(maxSupply)).append("\n");
    sb.append("    totalCoinhourSupply: ").append(toIndentedString(totalCoinhourSupply)).append("\n");
    sb.append("    totalSupply: ").append(toIndentedString(totalSupply)).append("\n");
    sb.append("    unlockedDistributionAddresses: ").append(toIndentedString(unlockedDistributionAddresses)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

