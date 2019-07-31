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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.ApiV1PendingTxsTransactionOutputs;

/**
 * ApiV1PendingTxsTransaction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-31T11:01:12.060-04:00[America/Havana]")
public class ApiV1PendingTxsTransaction {
  @JsonProperty("length")
  private Long length;

  @JsonProperty("type")
  private Long type;

  @JsonProperty("txid")
  private String txid;

  @JsonProperty("inner_hash")
  private String innerHash;

  @JsonProperty("sigs")
  private List<String> sigs = new ArrayList<String>();

  @JsonProperty("inputs")
  private List<String> inputs = new ArrayList<String>();

  @JsonProperty("outputs")
  private List<ApiV1PendingTxsTransactionOutputs> outputs = new ArrayList<ApiV1PendingTxsTransactionOutputs>();

  public ApiV1PendingTxsTransaction length(Long length) {
    this.length = length;
    return this;
  }

   /**
   * Get length
   * @return length
  **/
  @ApiModelProperty(value = "")
  public Long getLength() {
    return length;
  }

  public void setLength(Long length) {
    this.length = length;
  }

  public ApiV1PendingTxsTransaction type(Long type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public Long getType() {
    return type;
  }

  public void setType(Long type) {
    this.type = type;
  }

  public ApiV1PendingTxsTransaction txid(String txid) {
    this.txid = txid;
    return this;
  }

   /**
   * Get txid
   * @return txid
  **/
  @ApiModelProperty(value = "")
  public String getTxid() {
    return txid;
  }

  public void setTxid(String txid) {
    this.txid = txid;
  }

  public ApiV1PendingTxsTransaction innerHash(String innerHash) {
    this.innerHash = innerHash;
    return this;
  }

   /**
   * Get innerHash
   * @return innerHash
  **/
  @ApiModelProperty(value = "")
  public String getInnerHash() {
    return innerHash;
  }

  public void setInnerHash(String innerHash) {
    this.innerHash = innerHash;
  }

  public ApiV1PendingTxsTransaction sigs(List<String> sigs) {
    this.sigs = sigs;
    return this;
  }

  public ApiV1PendingTxsTransaction addSigsItem(String sigsItem) {
    if (this.sigs == null) {
      this.sigs = new ArrayList<String>();
    }
    this.sigs.add(sigsItem);
    return this;
  }

   /**
   * Get sigs
   * @return sigs
  **/
  @ApiModelProperty(value = "")
  public List<String> getSigs() {
    return sigs;
  }

  public void setSigs(List<String> sigs) {
    this.sigs = sigs;
  }

  public ApiV1PendingTxsTransaction inputs(List<String> inputs) {
    this.inputs = inputs;
    return this;
  }

  public ApiV1PendingTxsTransaction addInputsItem(String inputsItem) {
    if (this.inputs == null) {
      this.inputs = new ArrayList<String>();
    }
    this.inputs.add(inputsItem);
    return this;
  }

   /**
   * Get inputs
   * @return inputs
  **/
  @ApiModelProperty(value = "")
  public List<String> getInputs() {
    return inputs;
  }

  public void setInputs(List<String> inputs) {
    this.inputs = inputs;
  }

  public ApiV1PendingTxsTransaction outputs(List<ApiV1PendingTxsTransactionOutputs> outputs) {
    this.outputs = outputs;
    return this;
  }

  public ApiV1PendingTxsTransaction addOutputsItem(ApiV1PendingTxsTransactionOutputs outputsItem) {
    if (this.outputs == null) {
      this.outputs = new ArrayList<ApiV1PendingTxsTransactionOutputs>();
    }
    this.outputs.add(outputsItem);
    return this;
  }

   /**
   * Get outputs
   * @return outputs
  **/
  @ApiModelProperty(value = "")
  public List<ApiV1PendingTxsTransactionOutputs> getOutputs() {
    return outputs;
  }

  public void setOutputs(List<ApiV1PendingTxsTransactionOutputs> outputs) {
    this.outputs = outputs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV1PendingTxsTransaction apiV1PendingTxsTransaction = (ApiV1PendingTxsTransaction) o;
    return Objects.equals(this.length, apiV1PendingTxsTransaction.length) &&
        Objects.equals(this.type, apiV1PendingTxsTransaction.type) &&
        Objects.equals(this.txid, apiV1PendingTxsTransaction.txid) &&
        Objects.equals(this.innerHash, apiV1PendingTxsTransaction.innerHash) &&
        Objects.equals(this.sigs, apiV1PendingTxsTransaction.sigs) &&
        Objects.equals(this.inputs, apiV1PendingTxsTransaction.inputs) &&
        Objects.equals(this.outputs, apiV1PendingTxsTransaction.outputs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(length, type, txid, innerHash, sigs, inputs, outputs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV1PendingTxsTransaction {\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    txid: ").append(toIndentedString(txid)).append("\n");
    sb.append("    innerHash: ").append(toIndentedString(innerHash)).append("\n");
    sb.append("    sigs: ").append(toIndentedString(sigs)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
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

