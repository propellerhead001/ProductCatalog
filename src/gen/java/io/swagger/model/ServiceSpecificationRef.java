package io.swagger.model;

import io.swagger.annotations.ApiModel;


/**
 * Service specification reference: ServiceSpecification(s) required to realize a ProductSpecification.
 **/

import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "Service specification reference: ServiceSpecification(s) required to realize a ProductSpecification.")

public class ServiceSpecificationRef   {
  
  private String id = null;
  private String href = null;
  private String name = null;
  private String version = null;

  /**
   * Unique identifier of the service specification
   **/
  public ServiceSpecificationRef id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Unique identifier of the service specification")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Reference of the serviceSpecification
   **/
  public ServiceSpecificationRef href(String href) {
    this.href = href;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Reference of the serviceSpecification")
  public String getHref() {
    return href;
  }
  public void setHref(String href) {
    this.href = href;
  }

  /**
   * Name of the requiredServiceSpecification
   **/
  public ServiceSpecificationRef name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Name of the requiredServiceSpecification")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Service specification version
   **/
  public ServiceSpecificationRef version(String version) {
    this.version = version;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Service specification version")
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
    ServiceSpecificationRef serviceSpecificationRef = (ServiceSpecificationRef) o;
    return Objects.equals(id, serviceSpecificationRef.id) &&
        Objects.equals(href, serviceSpecificationRef.href) &&
        Objects.equals(name, serviceSpecificationRef.name) &&
        Objects.equals(version, serviceSpecificationRef.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, name, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceSpecificationRef {\n");
    
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
