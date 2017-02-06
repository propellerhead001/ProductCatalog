package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.TimePeriod;


/**
 * A migration, substitution, dependency or exclusivity relationship between/among product specifications.
 **/

import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "A migration, substitution, dependency or exclusivity relationship between/among product specifications.")

public class ProductSpecificationRelationship   {
  
  private String id = null;
  private String href = null;
  private String type = null;
  private TimePeriod validFor = null;

  /**
   * Unique identifier of the productSpecification
   **/
  public ProductSpecificationRelationship id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Unique identifier of the productSpecification")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Reference of the productSpecification
   **/
  public ProductSpecificationRelationship href(String href) {
    this.href = href;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Reference of the productSpecification")
  public String getHref() {
    return href;
  }
  public void setHref(String href) {
    this.href = href;
  }

  /**
   * Type of relationship such as migration, substitution, dependency, exclusivity
   **/
  public ProductSpecificationRelationship type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Type of relationship such as migration, substitution, dependency, exclusivity")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * The period for which the productSpecificationRelationship is valid
   **/
  public ProductSpecificationRelationship validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "The period for which the productSpecificationRelationship is valid")
  public TimePeriod getValidFor() {
    return validFor;
  }
  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductSpecificationRelationship productSpecificationRelationship = (ProductSpecificationRelationship) o;
    return Objects.equals(id, productSpecificationRelationship.id) &&
        Objects.equals(href, productSpecificationRelationship.href) &&
        Objects.equals(type, productSpecificationRelationship.type) &&
        Objects.equals(validFor, productSpecificationRelationship.validFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, type, validFor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSpecificationRelationship {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
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
