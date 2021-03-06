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

/**
 * ProcessRequestEditable
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-04-24T19:12:37.315Z[GMT]")
public class ProcessRequestEditable {
  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_CALLABLE_ID = "callable_id";
  @SerializedName(SERIALIZED_NAME_CALLABLE_ID)
  private String callableId;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private String data;

  /**
   * Represents an Eloquent model of a Request which is an instance of a Process.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    DRAFT("DRAFT"),
    
    ACTIVE("ACTIVE"),
    
    COMPLETED("COMPLETED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public ProcessRequestEditable userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Represents an Eloquent model of a Request which is an instance of a Process.
   * @return userId
  **/
  @ApiModelProperty(value = "Represents an Eloquent model of a Request which is an instance of a Process.")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public ProcessRequestEditable callableId(String callableId) {
    this.callableId = callableId;
    return this;
  }

   /**
   * Represents an Eloquent model of a Request which is an instance of a Process.
   * @return callableId
  **/
  @ApiModelProperty(value = "Represents an Eloquent model of a Request which is an instance of a Process.")
  public String getCallableId() {
    return callableId;
  }

  public void setCallableId(String callableId) {
    this.callableId = callableId;
  }

  public ProcessRequestEditable data(String data) {
    this.data = data;
    return this;
  }

   /**
   * Represents an Eloquent model of a Request which is an instance of a Process.
   * @return data
  **/
  @ApiModelProperty(value = "Represents an Eloquent model of a Request which is an instance of a Process.")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public ProcessRequestEditable status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Represents an Eloquent model of a Request which is an instance of a Process.
   * @return status
  **/
  @ApiModelProperty(value = "Represents an Eloquent model of a Request which is an instance of a Process.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessRequestEditable processRequestEditable = (ProcessRequestEditable) o;
    return Objects.equals(this.userId, processRequestEditable.userId) &&
        Objects.equals(this.callableId, processRequestEditable.callableId) &&
        Objects.equals(this.data, processRequestEditable.data) &&
        Objects.equals(this.status, processRequestEditable.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, callableId, data, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessRequestEditable {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    callableId: ").append(toIndentedString(callableId)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

