package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.TimePeriod;


/**
 * The category resource is used to group product offerings, service and resource candidates in logical containers. Categories can contain other categories and/or product offerings, resource or service candidates. Skipped properties: id,href,id,lastUpdate
 **/

import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "The category resource is used to group product offerings, service and resource candidates in logical containers. Categories can contain other categories and/or product offerings, resource or service candidates. Skipped properties: id,href,id,lastUpdate")

public class CategoryUpdate   {
  
  private String version = null;
  private String lifecycleStatus = null;
  private TimePeriod validFor = null;
  private String parentId = null;
  private Boolean isRoot = null;
  private String name = null;
  private String description = null;

  /**
   * Category version
   **/
  public CategoryUpdate version(String version) {
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
  public CategoryUpdate lifecycleStatus(String lifecycleStatus) {
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
  public CategoryUpdate validFor(TimePeriod validFor) {
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
  public CategoryUpdate parentId(String parentId) {
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
  public CategoryUpdate isRoot(Boolean isRoot) {
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
  public CategoryUpdate name(String name) {
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
  public CategoryUpdate description(String description) {
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
    CategoryUpdate categoryUpdate = (CategoryUpdate) o;
    return Objects.equals(version, categoryUpdate.version) &&
        Objects.equals(lifecycleStatus, categoryUpdate.lifecycleStatus) &&
        Objects.equals(validFor, categoryUpdate.validFor) &&
        Objects.equals(parentId, categoryUpdate.parentId) &&
        Objects.equals(isRoot, categoryUpdate.isRoot) &&
        Objects.equals(name, categoryUpdate.name) &&
        Objects.equals(description, categoryUpdate.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, lifecycleStatus, validFor, parentId, isRoot, name, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryUpdate {\n");
    
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
