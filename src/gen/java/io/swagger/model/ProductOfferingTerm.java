package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.TimePeriod;


/**
 * A condition under which a ProductOffering is made available to Customers. For instance, a productOffering can be offered with multiple commitment periods.
 **/

import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "A condition under which a ProductOffering is made available to Customers. For instance, a productOffering can be offered with multiple commitment periods.")

public class ProductOfferingTerm   {
  
  private String name = null;
  private String description = null;
  private String duration = null;
  private TimePeriod validFor = null;

  /**
   * Name of the productOfferingTerm
   **/
  public ProductOfferingTerm name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Name of the productOfferingTerm")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Description of the productOfferingTerm
   **/
  public ProductOfferingTerm description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Description of the productOfferingTerm")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Duration of the productOfferingTerm
   **/
  public ProductOfferingTerm duration(String duration) {
    this.duration = duration;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Duration of the productOfferingTerm")
  public String getDuration() {
    return duration;
  }
  public void setDuration(String duration) {
    this.duration = duration;
  }

  /**
   * The period for which the productOfferingterm is valid
   **/
  public ProductOfferingTerm validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "The period for which the productOfferingterm is valid")
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
    ProductOfferingTerm productOfferingTerm = (ProductOfferingTerm) o;
    return Objects.equals(name, productOfferingTerm.name) &&
        Objects.equals(description, productOfferingTerm.description) &&
        Objects.equals(duration, productOfferingTerm.duration) &&
        Objects.equals(validFor, productOfferingTerm.validFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, duration, validFor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOfferingTerm {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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
