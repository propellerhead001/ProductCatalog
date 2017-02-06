package io.swagger.model;

import io.swagger.annotations.ApiModel;


/**
 * A type of ProductOffering that belongs to a grouping of ProductOfferings made available to the market. It inherits of all attributes of ProductOffering.
 **/

import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "A type of ProductOffering that belongs to a grouping of ProductOfferings made available to the market. It inherits of all attributes of ProductOffering.")

public class BundledProductOffering   {
  
  private String id = null;
  private String href = null;
  private String lifecycleStatus = null;
  private String name = null;

  /**
   * Unique identifier of the BundledProductOffering
   **/
  public BundledProductOffering id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Unique identifier of the BundledProductOffering")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Unique reference of the BundledProductOffering
   **/
  public BundledProductOffering href(String href) {
    this.href = href;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Unique reference of the BundledProductOffering")
  public String getHref() {
    return href;
  }
  public void setHref(String href) {
    this.href = href;
  }

  /**
   * Used to indicate the current lifecycle status
   **/
  public BundledProductOffering lifecycleStatus(String lifecycleStatus) {
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
   * Name of the BundledProductOffering
   **/
  public BundledProductOffering name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Name of the BundledProductOffering")
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
    BundledProductOffering bundledProductOffering = (BundledProductOffering) o;
    return Objects.equals(id, bundledProductOffering.id) &&
        Objects.equals(href, bundledProductOffering.href) &&
        Objects.equals(lifecycleStatus, bundledProductOffering.lifecycleStatus) &&
        Objects.equals(name, bundledProductOffering.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, lifecycleStatus, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BundledProductOffering {\n");
    
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
