package io.swagger.model;

import io.swagger.annotations.ApiModel;


/**
 * A type of ProductSpecification that belongs to a grouping of ProductSpecifications made available to the market. It inherits of all attributes of ProductSpecification.
 **/

import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "A type of ProductSpecification that belongs to a grouping of ProductSpecifications made available to the market. It inherits of all attributes of ProductSpecification.")

public class BundledProductSpecification   {
  
  private String id = null;
  private String href = null;
  private String lifecycleStatus = null;
  private String name = null;

  /**
   * Unique identifier of the product specification
   **/
  public BundledProductSpecification id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Unique identifier of the product specification")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Reference of the product specification
   **/
  public BundledProductSpecification href(String href) {
    this.href = href;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Reference of the product specification")
  public String getHref() {
    return href;
  }
  public void setHref(String href) {
    this.href = href;
  }

  /**
   * Used to indicate the current lifecycle status
   **/
  public BundledProductSpecification lifecycleStatus(String lifecycleStatus) {
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
   * Name of the product specification
   **/
  public BundledProductSpecification name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Name of the product specification")
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
    BundledProductSpecification bundledProductSpecification = (BundledProductSpecification) o;
    return Objects.equals(id, bundledProductSpecification.id) &&
        Objects.equals(href, bundledProductSpecification.href) &&
        Objects.equals(lifecycleStatus, bundledProductSpecification.lifecycleStatus) &&
        Objects.equals(name, bundledProductSpecification.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, lifecycleStatus, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BundledProductSpecification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    lifecycleStatus: ").append(toIndentedString(lifecycleStatus)).append("\n");
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
