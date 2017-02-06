package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.ProductSpecCharRelationship;
import io.swagger.model.ProductSpecCharacteristicValue;
import io.swagger.model.TimePeriod;
import java.util.ArrayList;
import java.util.List;


/**
 * A characteristic quality or distinctive feature of a ProductSpecification.  The characteristic can be take on a discrete value, such as color, can take on a range of values, (for example, sensitivity of 100-240 mV), or can be derived from a formula (for example, usage time (hrs) &#x3D; 30 - talk time *3). Certain characteristics, such as color, may be configured during the ordering or some other process.
 **/

import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "A characteristic quality or distinctive feature of a ProductSpecification.  The characteristic can be take on a discrete value, such as color, can take on a range of values, (for example, sensitivity of 100-240 mV), or can be derived from a formula (for example, usage time (hrs) = 30 - talk time *3). Certain characteristics, such as color, may be configured during the ordering or some other process.")

public class ProductSpecCharacteristic   {
  
  private String name = null;
  private String description = null;
  private String valueType = null;
  private Boolean configurable = null;
  private TimePeriod validFor = null;
  private List<ProductSpecCharRelationship> productSpecCharRelationship = new ArrayList<ProductSpecCharRelationship>();
  private List<ProductSpecCharacteristicValue> productSpecCharacteristicValue = new ArrayList<ProductSpecCharacteristicValue>();

  /**
   * Name of the productSpecCharacteristic
   **/
  public ProductSpecCharacteristic name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Name of the productSpecCharacteristic")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * A narrative that explains in detail what the productSpecCharacteristic is
   **/
  public ProductSpecCharacteristic description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "A narrative that explains in detail what the productSpecCharacteristic is")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * A kind of value that the characteristic can take on, such as numeric, text and so forth
   **/
  public ProductSpecCharacteristic valueType(String valueType) {
    this.valueType = valueType;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "A kind of value that the characteristic can take on, such as numeric, text and so forth")
  public String getValueType() {
    return valueType;
  }
  public void setValueType(String valueType) {
    this.valueType = valueType;
  }

  /**
   * If true, the Boolean indicates that the productSpecCharacteristic is configurable
   **/
  public ProductSpecCharacteristic configurable(Boolean configurable) {
    this.configurable = configurable;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "If true, the Boolean indicates that the productSpecCharacteristic is configurable")
  public Boolean getConfigurable() {
    return configurable;
  }
  public void setConfigurable(Boolean configurable) {
    this.configurable = configurable;
  }

  /**
   * The period for which the productSpecCharacteristic is valid
   **/
  public ProductSpecCharacteristic validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "The period for which the productSpecCharacteristic is valid")
  public TimePeriod getValidFor() {
    return validFor;
  }
  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  /**
   **/
  public ProductSpecCharacteristic productSpecCharRelationship(List<ProductSpecCharRelationship> productSpecCharRelationship) {
    this.productSpecCharRelationship = productSpecCharRelationship;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<ProductSpecCharRelationship> getProductSpecCharRelationship() {
    return productSpecCharRelationship;
  }
  public void setProductSpecCharRelationship(List<ProductSpecCharRelationship> productSpecCharRelationship) {
    this.productSpecCharRelationship = productSpecCharRelationship;
  }

  /**
   **/
  public ProductSpecCharacteristic productSpecCharacteristicValue(List<ProductSpecCharacteristicValue> productSpecCharacteristicValue) {
    this.productSpecCharacteristicValue = productSpecCharacteristicValue;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<ProductSpecCharacteristicValue> getProductSpecCharacteristicValue() {
    return productSpecCharacteristicValue;
  }
  public void setProductSpecCharacteristicValue(List<ProductSpecCharacteristicValue> productSpecCharacteristicValue) {
    this.productSpecCharacteristicValue = productSpecCharacteristicValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductSpecCharacteristic productSpecCharacteristic = (ProductSpecCharacteristic) o;
    return Objects.equals(name, productSpecCharacteristic.name) &&
        Objects.equals(description, productSpecCharacteristic.description) &&
        Objects.equals(valueType, productSpecCharacteristic.valueType) &&
        Objects.equals(configurable, productSpecCharacteristic.configurable) &&
        Objects.equals(validFor, productSpecCharacteristic.validFor) &&
        Objects.equals(productSpecCharRelationship, productSpecCharacteristic.productSpecCharRelationship) &&
        Objects.equals(productSpecCharacteristicValue, productSpecCharacteristic.productSpecCharacteristicValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, valueType, configurable, validFor, productSpecCharRelationship, productSpecCharacteristicValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSpecCharacteristic {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    configurable: ").append(toIndentedString(configurable)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    productSpecCharRelationship: ").append(toIndentedString(productSpecCharRelationship)).append("\n");
    sb.append("    productSpecCharacteristicValue: ").append(toIndentedString(productSpecCharacteristicValue)).append("\n");
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
