package io.swagger.model;

import io.swagger.annotations.ApiModel;


/**
 * Category reference. The category resource is used to group product offerings, service and resource candidates in logical containers. Categories can contain other categories and/or product offerings, resource or service candidates.
 **/

import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "Category reference. The category resource is used to group product offerings, service and resource candidates in logical containers. Categories can contain other categories and/or product offerings, resource or service candidates.")

public class CategoryRef   {
  
  private String id = null;
  private String href = null;
  private String version = null;
  private String name = null;

  /**
   * Unique reference of the category
   **/
  public CategoryRef id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Unique reference of the category")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Unique reference of the category
   **/
  public CategoryRef href(String href) {
    this.href = href;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Unique reference of the category")
  public String getHref() {
    return href;
  }
  public void setHref(String href) {
    this.href = href;
  }

  /**
   * Category version
   **/
  public CategoryRef version(String version) {
    this.version = version;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Category version")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   * Name of the category
   **/
  public CategoryRef name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Name of the category")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryRef categoryRef = (CategoryRef) o;
    return Objects.equals(id, categoryRef.id) &&
        Objects.equals(href, categoryRef.href) &&
        Objects.equals(version, categoryRef.version) &&
        Objects.equals(name, categoryRef.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, version, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryRef {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
