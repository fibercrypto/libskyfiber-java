/*
 * Skycoin REST API.
 * Skycoin is a next-generation cryptocurrency.
 *
 * OpenAPI spec version: 0.25.1
 * Contact: skycoin.doe@example.com
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

/**
 * Apiv1exploreraddressOutputs
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-14T21:13:49.839099-04:00[America/Havana]")
public class Apiv1exploreraddressOutputs {
  public static final String SERIALIZED_NAME_HOURS = "hours";
  @SerializedName(SERIALIZED_NAME_HOURS)
  private Long hours;

  public static final String SERIALIZED_NAME_DST = "dst";
  @SerializedName(SERIALIZED_NAME_DST)
  private String dst;

  public static final String SERIALIZED_NAME_COINS = "coins";
  @SerializedName(SERIALIZED_NAME_COINS)
  private String coins;

  public static final String SERIALIZED_NAME_UXID = "uxid";
  @SerializedName(SERIALIZED_NAME_UXID)
  private String uxid;

  public Apiv1exploreraddressOutputs hours(Long hours) {
    this.hours = hours;
    return this;
  }

   /**
   * Get hours
   * @return hours
  **/
  @ApiModelProperty(value = "")
  public Long getHours() {
    return hours;
  }

  public void setHours(Long hours) {
    this.hours = hours;
  }

  public Apiv1exploreraddressOutputs dst(String dst) {
    this.dst = dst;
    return this;
  }

   /**
   * Get dst
   * @return dst
  **/
  @ApiModelProperty(value = "")
  public String getDst() {
    return dst;
  }

  public void setDst(String dst) {
    this.dst = dst;
  }

  public Apiv1exploreraddressOutputs coins(String coins) {
    this.coins = coins;
    return this;
  }

   /**
   * Get coins
   * @return coins
  **/
  @ApiModelProperty(value = "")
  public String getCoins() {
    return coins;
  }

  public void setCoins(String coins) {
    this.coins = coins;
  }

  public Apiv1exploreraddressOutputs uxid(String uxid) {
    this.uxid = uxid;
    return this;
  }

   /**
   * Get uxid
   * @return uxid
  **/
  @ApiModelProperty(value = "")
  public String getUxid() {
    return uxid;
  }

  public void setUxid(String uxid) {
    this.uxid = uxid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Apiv1exploreraddressOutputs apiv1exploreraddressOutputs = (Apiv1exploreraddressOutputs) o;
    return Objects.equals(this.hours, apiv1exploreraddressOutputs.hours) &&
        Objects.equals(this.dst, apiv1exploreraddressOutputs.dst) &&
        Objects.equals(this.coins, apiv1exploreraddressOutputs.coins) &&
        Objects.equals(this.uxid, apiv1exploreraddressOutputs.uxid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hours, dst, coins, uxid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Apiv1exploreraddressOutputs {\n");
    
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
    sb.append("    dst: ").append(toIndentedString(dst)).append("\n");
    sb.append("    coins: ").append(toIndentedString(coins)).append("\n");
    sb.append("    uxid: ").append(toIndentedString(uxid)).append("\n");
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
