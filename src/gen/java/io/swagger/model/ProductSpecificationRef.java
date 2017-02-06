package io.swagger.model;

import io.swagger.annotations.ApiModel;


/**
 * Product specification reference: A ProductSpecification is a detailed description of a tangible or intangible object made available externally in the form of a ProductOffering to customers or other parties playing a party role.
 **/

import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "Product specification reference: A ProductSpecification is a detailed description of a tangible or intangible object made available externally in the form of a ProductOffering to customers or other parties playing a party role.")

public class ProductSpecificationRef   {
  
  private String id = null;
  private String href = null;
  private String version = null;
  private String name = null;

  /**
   * Unique identifier of the product specification
   **/
  public ProductSpecificationRef id(String id) {
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
  public ProductSpecificationRef href(String href) {
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
   * Version of the product specification
   **/
  public ProductSpecificationRef version(String version) {
    this.version = version;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Version of the product specification")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   * Name of the product specification
   **/
  public ProductSpecificationRef name(String name) {
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
    ProductSpecificationRef productSpecificationRef = (ProductSpecificationRef) o;
    return Objects.equals(id, productSpecificationRef.id) &&
        Objects.equals(href, productSpecificationRef.href) &&
        Objects.equals(version, productSpecificationRef.version) &&
        Objects.equals(name, productSpecificationRef.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, version, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSpecificationRef {\n");
    
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
