package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.TimePeriod;


/**
 * The category resource is used to group product offerings, service and resource candidates in logical containers. Categories can contain other categories and/or product offerings, resource or service candidates.
 **/

import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "The category resource is used to group product offerings, service and resource candidates in logical containers. Categories can contain other categories and/or product offerings, resource or service candidates.")

public class Category   {
  
  private String id = null;
  private String href = null;
  private javax.xml.datatype.XMLGregorianCalendar lastUpdate = null;
  private String version = null;
  private String lifecycleStatus = null;
  private TimePeriod validFor = null;
  private String parentId = null;
  private Boolean isRoot = null;
  private String name = null;
  private String description = null;

  /**
   * Unique identifier of the category
   **/
  public Category id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Unique identifier of the category")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Reference of the catalog
   **/
  public Category href(String href) {
    this.href = href;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Reference of the catalog")
  public String getHref() {
    return href;
  }
  public void setHref(String href) {
    this.href = href;
  }

  /**
   * Date and time of the last update
   **/
  public Category lastUpdate(javax.xml.datatype.XMLGregorianCalendar lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Date and time of the last update")
  public javax.xml.datatype.XMLGregorianCalendar getLastUpdate() {
    return lastUpdate;
  }
  public void setLastUpdate(javax.xml.datatype.XMLGregorianCalendar lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  /**
   * Category version
   **/
  public Category version(String version) {
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
   * Used to indicate the current lifecycle status
   **/
  public Category lifecycleStatus(String lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Used to indicate the current lifecycle status")
  public String getLifecycleStatus() {
    return lifecycleStatus;
  }
  public void setLifecycleStatus(String lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
  }

  /**
   * The period for which the category is valid
   **/
  public Category validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "The period for which the category is valid")
  public TimePeriod getValidFor() {
    return validFor;
  }
  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  /**
   * Unique identifier of the parent category
   **/
  public Category parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Unique identifier of the parent category")
  public String getParentId() {
    return parentId;
  }
  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  /**
   * If true, this Boolean indicates that the category is a root of categories
   **/
  public Category isRoot(Boolean isRoot) {
    this.isRoot = isRoot;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "If true, this Boolean indicates that the category is a root of categories")
  public Boolean getIsRoot() {
    return isRoot;
  }
  public void setIsRoot(Boolean isRoot) {
    this.isRoot = isRoot;
  }

  /**
   * Name of the category
   **/
  public Category name(String name) {
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

  /**
   * Description of the category
   **/
  public Category description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Description of the category")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Category category = (Category) o;
    return Objects.equals(id, category.id) &&
        Objects.equals(href, category.href) &&
        Objects.equals(lastUpdate, category.lastUpdate) &&
        Objects.equals(version, category.version) &&
        Objects.equals(lifecycleStatus, category.lifecycleStatus) &&
        Objects.equals(validFor, category.validFor) &&
        Objects.equals(parentId, category.parentId) &&
        Objects.equals(isRoot, category.isRoot) &&
        Objects.equals(name, category.name) &&
        Objects.equals(description, category.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, lastUpdate, version, lifecycleStatus, validFor, parentId, isRoot, name, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Category {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    lifecycleStatus: ").append(toIndentedString(lifecycleStatus)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    isRoot: ").append(toIndentedString(isRoot)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
