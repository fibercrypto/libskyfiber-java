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
import org.openapitools.client.model.BlockSchemaBody;
import org.openapitools.client.model.BlockVerboseSchemaHeader;

/**
 * BlockSchema
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-31T11:01:12.060-04:00[America/Havana]")
public class BlockSchema {
  @JsonProperty("header")
  private BlockVerboseSchemaHeader header = null;

  @JsonProperty("body")
  private BlockSchemaBody body = null;

  @JsonProperty("size")
  private Integer size;

  public BlockSchema header(BlockVerboseSchemaHeader header) {
    this.header = header;
    return this;
  }

   /**
   * Get header
   * @return header
  **/
  @ApiModelProperty(value = "")
  public BlockVerboseSchemaHeader getHeader() {
    return header;
  }

  public void setHeader(BlockVerboseSchemaHeader header) {
    this.header = header;
  }

  public BlockSchema body(BlockSchemaBody body) {
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @ApiModelProperty(value = "")
  public BlockSchemaBody getBody() {
    return body;
  }

  public void setBody(BlockSchemaBody body) {
    this.body = body;
  }

  public BlockSchema size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(value = "")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockSchema blockSchema = (BlockSchema) o;
    return Objects.equals(this.header, blockSchema.header) &&
        Objects.equals(this.body, blockSchema.body) &&
        Objects.equals(this.size, blockSchema.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, body, size);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockSchema {\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

