/*
 * Skycoin REST API.
 * Skycoin is a next-generation cryptocurrency.
 *
 * The version of the OpenAPI document: 0.26.0
 * Contact: contact@skycoin.net
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * TransactionVerifyRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-31T11:01:12.060-04:00[America/Havana]")
public class TransactionVerifyRequest {
  @JsonProperty("unsigned")
  private Boolean unsigned;

  @JsonProperty("encoded_transaction")
  private String encodedTransaction;

  public TransactionVerifyRequest unsigned(Boolean unsigned) {
    this.unsigned = unsigned;
    return this;
  }

   /**
   * Get unsigned
   * @return unsigned
  **/
  @ApiModelProperty(value = "")
  public Boolean getUnsigned() {
    return unsigned;
  }

  public void setUnsigned(Boolean unsigned) {
    this.unsigned = unsigned;
  }

  public TransactionVerifyRequest encodedTransaction(String encodedTransaction) {
    this.encodedTransaction = encodedTransaction;
    return this;
  }

   /**
   * Get encodedTransaction
   * @return encodedTransaction
  **/
  @ApiModelProperty(value = "")
  public String getEncodedTransaction() {
    return encodedTransaction;
  }

  public void setEncodedTransaction(String encodedTransaction) {
    this.encodedTransaction = encodedTransaction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionVerifyRequest transactionVerifyRequest = (TransactionVerifyRequest) o;
    return Objects.equals(this.unsigned, transactionVerifyRequest.unsigned) &&
        Objects.equals(this.encodedTransaction, transactionVerifyRequest.encodedTransaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unsigned, encodedTransaction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionVerifyRequest {\n");
    sb.append("    unsigned: ").append(toIndentedString(unsigned)).append("\n");
    sb.append("    encodedTransaction: ").append(toIndentedString(encodedTransaction)).append("\n");
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

