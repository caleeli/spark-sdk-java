/*
 * ProcessMaker API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 1.0.0
 * Contact: info@processmaker.com
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
import org.openapitools.client.model.Metadata;
import org.openapitools.client.model.ProcessRequestToken;

/**
 * InlineResponse20018
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-04-24T19:12:37.315Z[GMT]")
public class InlineResponse20018 {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<ProcessRequestToken> data = new ArrayList<ProcessRequestToken>();

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private Metadata meta = null;

  public InlineResponse20018 data(List<ProcessRequestToken> data) {
    this.data = data;
    return this;
  }

  public InlineResponse20018 addDataItem(ProcessRequestToken dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<ProcessRequestToken>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Display a listing of the resource.
   * @return data
  **/
  @ApiModelProperty(value = "Display a listing of the resource.")
  public List<ProcessRequestToken> getData() {
    return data;
  }

  public void setData(List<ProcessRequestToken> data) {
    this.data = data;
  }

  public InlineResponse20018 meta(Metadata meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @ApiModelProperty(value = "")
  public Metadata getMeta() {
    return meta;
  }

  public void setMeta(Metadata meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20018 inlineResponse20018 = (InlineResponse20018) o;
    return Objects.equals(this.data, inlineResponse20018.data) &&
        Objects.equals(this.meta, inlineResponse20018.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, meta);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20018 {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

