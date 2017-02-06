package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.TimePeriod;


/**
 * The category resource is used to group product offerings, service and resource candidates in logical containers. Categories can contain other categories and/or product offerings, resource or service candidates. Skipped properties: id,href
 **/

import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "The category resource is used to group product offerings, service and resource candidates in logical containers. Categories can contain other categories and/or product offerings, resource or service candidates. Skipped properties: id,href")

public class CategoryCreate   {
  
  private javax.xml.datatype.XMLGregorianCalendar lastUpdate = null;
  private String version = null;
  private String lifecycleStatus = null;
  private TimePeriod validFor = null;
  private String parentId = null;
  private Boolean isRoot = null;
  private String name = null;
  private String description = null;

  /**
   * Date and time of the last update
   **/
  public CategoryCreate lastUpdate(javax.xml.datatype.XMLGregorianCalendar lastUpdate) {
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
  public CategoryCreate version(String version) {
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
  public CategoryCreate lifecycleStatus(String lifecycleStatus) {
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
  public CategoryCreate validFor(TimePeriod validFor) {
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
  public CategoryCreate parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "Unique identifier of the parent category")
  public String getParentId() {
    return parentId;
  }
  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  /**
   * If true, this Boolean indicates that the category is a root of categories
   **/
  public CategoryCreate isRoot(Boolean isRoot) {
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
  public CategoryCreate name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "Name of the category")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Description of the category
   **/
  public CategoryCreate description(String description) {
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
    CategoryCreate categoryCreate = (CategoryCreate) o;
    return Objects.equals(lastUpdate, categoryCreate.lastUpdate) &&
        Objects.equals(version, categoryCreate.version) &&
        Objects.equals(lifecycleStatus, categoryCreate.lifecycleStatus) &&
        Objects.equals(validFor, categoryCreate.validFor) &&
        Objects.equals(parentId, categoryCreate.parentId) &&
        Objects.equals(isRoot, categoryCreate.isRoot) &&
        Objects.equals(name, categoryCreate.name) &&
        Objects.equals(description, categoryCreate.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastUpdate, version, lifecycleStatus, validFor, parentId, isRoot, name, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryCreate {\n");
    
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
