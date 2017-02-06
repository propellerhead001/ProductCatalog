package io.swagger.model;

import io.swagger.annotations.ApiModel;


/**
 * Resource Specification reference: The ResourceSpecification is required to realize a ProductSpecification.
 **/

import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "Resource Specification reference: The ResourceSpecification is required to realize a ProductSpecification.")

public class ResourceSpecificationRef   {
  
  private String id = null;
  private String href = null;
  private String name = null;
  private String version = null;

  /**
   * Unique identifier of the resource specification
   **/
  public ResourceSpecificationRef id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Unique identifier of the resource specification")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Reference of the resource specification
   **/
  public ResourceSpecificationRef href(String href) {
    this.href = href;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Reference of the resource specification")
  public String getHref() {
    return href;
  }
  public void setHref(String href) {
    this.href = href;
  }

  /**
   * Name of the requiredResourceSpecification
   **/
  public ResourceSpecificationRef name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Name of the requiredResourceSpecification")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Resource specification version
   **/
  public ResourceSpecificationRef version(String version) {
    this.version = version;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Resource specification version")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceSpecificationRef resourceSpecificationRef = (ResourceSpecificationRef) o;
    return Objects.equals(id, resourceSpecificationRef.id) &&
        Objects.equals(href, resourceSpecificationRef.href) &&
        Objects.equals(name, resourceSpecificationRef.name) &&
        Objects.equals(version, resourceSpecificationRef.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, name, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceSpecificationRef {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
