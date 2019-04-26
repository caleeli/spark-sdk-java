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
import org.openapitools.client.model.ProcessEditable;
import org.threeten.bp.OffsetDateTime;

/**
 * Process
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-04-24T19:12:37.315Z[GMT]")
public class Process {
  public static final String SERIALIZED_NAME_PROCESS_CATEGORY_ID = "process_category_id";
  @SerializedName(SERIALIZED_NAME_PROCESS_CATEGORY_ID)
  private String processCategoryId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * Represents a business process definition.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    
    INACTIVE("INACTIVE");

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

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public Process processCategoryId(String processCategoryId) {
    this.processCategoryId = processCategoryId;
    return this;
  }

   /**
   * Represents a business process definition.
   * @return processCategoryId
  **/
  @ApiModelProperty(value = "Represents a business process definition.")
  public String getProcessCategoryId() {
    return processCategoryId;
  }

  public void setProcessCategoryId(String processCategoryId) {
    this.processCategoryId = processCategoryId;
  }

  public Process name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Represents a business process definition.
   * @return name
  **/
  @ApiModelProperty(value = "Represents a business process definition.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Process description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Represents a business process definition.
   * @return description
  **/
  @ApiModelProperty(value = "Represents a business process definition.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Process status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Represents a business process definition.
   * @return status
  **/
  @ApiModelProperty(value = "Represents a business process definition.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Process userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Represents a business process definition.
   * @return userId
  **/
  @ApiModelProperty(value = "Represents a business process definition.")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public Process id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Represents a business process definition.
   * @return id
  **/
  @ApiModelProperty(value = "Represents a business process definition.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Process createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Represents a business process definition.
   * @return createdAt
  **/
  @ApiModelProperty(value = "Represents a business process definition.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Process updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Represents a business process definition.
   * @return updatedAt
  **/
  @ApiModelProperty(value = "Represents a business process definition.")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Process process = (Process) o;
    return Objects.equals(this.processCategoryId, process.processCategoryId) &&
        Objects.equals(this.name, process.name) &&
        Objects.equals(this.description, process.description) &&
        Objects.equals(this.status, process.status) &&
        Objects.equals(this.userId, process.userId) &&
        Objects.equals(this.id, process.id) &&
        Objects.equals(this.createdAt, process.createdAt) &&
        Objects.equals(this.updatedAt, process.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processCategoryId, name, description, status, userId, id, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Process {\n");
    sb.append("    processCategoryId: ").append(toIndentedString(processCategoryId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

