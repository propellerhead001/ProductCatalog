package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.TimePeriod;


/**
 * An aggregation, migration, substitution, dependency or exclusivity relationship between/among productSpecCharacteristics.
 **/

import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "An aggregation, migration, substitution, dependency or exclusivity relationship between/among productSpecCharacteristics.")

public class ProductSpecCharRelationship   {
  
  private String type = null;
  private TimePeriod validFor = null;

  /**
   * Type of relationship such as aggregation, migration, substitution, dependency, exclusivity
   **/
  public ProductSpecCharRelationship type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Type of relationship such as aggregation, migration, substitution, dependency, exclusivity")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * The period for which the productSpecCharRelationship is valid
   **/
  public ProductSpecCharRelationship validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "The period for which the productSpecCharRelationship is valid")
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
    ProductSpecCharRelationship productSpecCharRelationship = (ProductSpecCharRelationship) o;
    return Objects.equals(type, productSpecCharRelationship.type) &&
        Objects.equals(validFor, productSpecCharRelationship.validFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, validFor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSpecCharRelationship {\n");
    
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
