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
 * Metadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-04-24T19:12:37.315Z[GMT]")
public class Metadata {
  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private String filter;

  public static final String SERIALIZED_NAME_SORT_BY = "sort_by";
  @SerializedName(SERIALIZED_NAME_SORT_BY)
  private String sortBy;

  /**
   * Gets or Sets sortOrder
   */
  @JsonAdapter(SortOrderEnum.Adapter.class)
  public enum SortOrderEnum {
    ASC("asc"),
    
    DESC("desc");

    private String value;

    SortOrderEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SortOrderEnum fromValue(String text) {
      for (SortOrderEnum b : SortOrderEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<SortOrderEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SortOrderEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SortOrderEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SortOrderEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_SORT_ORDER = "sort_order";
  @SerializedName(SERIALIZED_NAME_SORT_ORDER)
  private SortOrderEnum sortOrder;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_TOTAL_PAGES = "total_pages";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGES)
  private Integer totalPages;

  public static final String SERIALIZED_NAME_CURRENT_PAGE = "current_page";
  @SerializedName(SERIALIZED_NAME_CURRENT_PAGE)
  private Integer currentPage;

  public static final String SERIALIZED_NAME_FORM = "form";
  @SerializedName(SERIALIZED_NAME_FORM)
  private Integer form;

  public static final String SERIALIZED_NAME_LAST_PAGE = "last_page";
  @SerializedName(SERIALIZED_NAME_LAST_PAGE)
  private Integer lastPage;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_PER_PAGE = "per_page";
  @SerializedName(SERIALIZED_NAME_PER_PAGE)
  private Integer perPage;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private Integer to;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;

  public Metadata filter(String filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @ApiModelProperty(value = "")
  public String getFilter() {
    return filter;
  }

  public void setFilter(String filter) {
    this.filter = filter;
  }

  public Metadata sortBy(String sortBy) {
    this.sortBy = sortBy;
    return this;
  }

   /**
   * Get sortBy
   * @return sortBy
  **/
  @ApiModelProperty(value = "")
  public String getSortBy() {
    return sortBy;
  }

  public void setSortBy(String sortBy) {
    this.sortBy = sortBy;
  }

  public Metadata sortOrder(SortOrderEnum sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

   /**
   * Get sortOrder
   * @return sortOrder
  **/
  @ApiModelProperty(value = "")
  public SortOrderEnum getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(SortOrderEnum sortOrder) {
    this.sortOrder = sortOrder;
  }

  public Metadata count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(value = "")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public Metadata totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

   /**
   * Get totalPages
   * @return totalPages
  **/
  @ApiModelProperty(value = "")
  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  public Metadata currentPage(Integer currentPage) {
    this.currentPage = currentPage;
    return this;
  }

   /**
   * Get currentPage
   * @return currentPage
  **/
  @ApiModelProperty(value = "")
  public Integer getCurrentPage() {
    return currentPage;
  }

  public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
  }

  public Metadata form(Integer form) {
    this.form = form;
    return this;
  }

   /**
   * Get form
   * @return form
  **/
  @ApiModelProperty(value = "")
  public Integer getForm() {
    return form;
  }

  public void setForm(Integer form) {
    this.form = form;
  }

  public Metadata lastPage(Integer lastPage) {
    this.lastPage = lastPage;
    return this;
  }

   /**
   * Get lastPage
   * @return lastPage
  **/
  @ApiModelProperty(value = "")
  public Integer getLastPage() {
    return lastPage;
  }

  public void setLastPage(Integer lastPage) {
    this.lastPage = lastPage;
  }

  public Metadata path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @ApiModelProperty(value = "")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public Metadata perPage(Integer perPage) {
    this.perPage = perPage;
    return this;
  }

   /**
   * Get perPage
   * @return perPage
  **/
  @ApiModelProperty(value = "")
  public Integer getPerPage() {
    return perPage;
  }

  public void setPerPage(Integer perPage) {
    this.perPage = perPage;
  }

  public Metadata to(Integer to) {
    this.to = to;
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @ApiModelProperty(value = "")
  public Integer getTo() {
    return to;
  }

  public void setTo(Integer to) {
    this.to = to;
  }

  public Metadata total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(value = "")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Metadata metadata = (Metadata) o;
    return Objects.equals(this.filter, metadata.filter) &&
        Objects.equals(this.sortBy, metadata.sortBy) &&
        Objects.equals(this.sortOrder, metadata.sortOrder) &&
        Objects.equals(this.count, metadata.count) &&
        Objects.equals(this.totalPages, metadata.totalPages) &&
        Objects.equals(this.currentPage, metadata.currentPage) &&
        Objects.equals(this.form, metadata.form) &&
        Objects.equals(this.lastPage, metadata.lastPage) &&
        Objects.equals(this.path, metadata.path) &&
        Objects.equals(this.perPage, metadata.perPage) &&
        Objects.equals(this.to, metadata.to) &&
        Objects.equals(this.total, metadata.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, sortBy, sortOrder, count, totalPages, currentPage, form, lastPage, path, perPage, to, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Metadata {\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
    sb.append("    form: ").append(toIndentedString(form)).append("\n");
    sb.append("    lastPage: ").append(toIndentedString(lastPage)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

