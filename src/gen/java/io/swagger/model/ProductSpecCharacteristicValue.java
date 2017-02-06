package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.TimePeriod;


/**
 * A number or text that can be assigned to a ProductSpecCharacteristic.
 **/

import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "A number or text that can be assigned to a ProductSpecCharacteristic.")

public class ProductSpecCharacteristicValue   {
  
  private String valueType = null;
  private Boolean _default = null;
  private String value = null;
  private String unitOfMeasure = null;
  private String valueFrom = null;
  private String valueTo = null;
  private TimePeriod validFor = null;

  /**
   * A kind of value that the characteristic can take on, such as numeric, text, and so forth
   **/
  public ProductSpecCharacteristicValue valueType(String valueType) {
    this.valueType = valueType;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "A kind of value that the characteristic can take on, such as numeric, text, and so forth")
  public String getValueType() {
    return valueType;
  }
  public void setValueType(String valueType) {
    this.valueType = valueType;
  }

  /**
   * Indicates if the value is the default value for a characteristic
   **/
  public ProductSpecCharacteristicValue _default(Boolean _default) {
    this._default = _default;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Indicates if the value is the default value for a characteristic")
  public Boolean getDefault() {
    return _default;
  }
  public void setDefault(Boolean _default) {
    this._default = _default;
  }

  /**
   * A discrete value that the characteristic can take on
   **/
  public ProductSpecCharacteristicValue value(String value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "A discrete value that the characteristic can take on")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Could be minutes, GB...
   **/
  public ProductSpecCharacteristicValue unitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Could be minutes, GB...")
  public String getUnitOfMeasure() {
    return unitOfMeasure;
  }
  public void setUnitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
  }

  /**
   * The low range value that a characteristic can take on
   **/
  public ProductSpecCharacteristicValue valueFrom(String valueFrom) {
    this.valueFrom = valueFrom;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "The low range value that a characteristic can take on")
  public String getValueFrom() {
    return valueFrom;
  }
  public void setValueFrom(String valueFrom) {
    this.valueFrom = valueFrom;
  }

  /**
   * The upper range value that a characteristic can take on
   **/
  public ProductSpecCharacteristicValue valueTo(String valueTo) {
    this.valueTo = valueTo;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "The upper range value that a characteristic can take on")
  public String getValueTo() {
    return valueTo;
  }
  public void setValueTo(String valueTo) {
    this.valueTo = valueTo;
  }

  /**
   * The period of time for which a value is applicable
   **/
  public ProductSpecCharacteristicValue validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "The period of time for which a value is applicable")
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
    ProductSpecCharacteristicValue productSpecCharacteristicValue = (ProductSpecCharacteristicValue) o;
    return Objects.equals(valueType, productSpecCharacteristicValue.valueType) &&
        Objects.equals(_default, productSpecCharacteristicValue._default) &&
        Objects.equals(value, productSpecCharacteristicValue.value) &&
        Objects.equals(unitOfMeasure, productSpecCharacteristicValue.unitOfMeasure) &&
        Objects.equals(valueFrom, productSpecCharacteristicValue.valueFrom) &&
        Objects.equals(valueTo, productSpecCharacteristicValue.valueTo) &&
        Objects.equals(validFor, productSpecCharacteristicValue.validFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valueType, _default, value, unitOfMeasure, valueFrom, valueTo, validFor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSpecCharacteristicValue {\n");
    
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
    sb.append("    valueFrom: ").append(toIndentedString(valueFrom)).append("\n");
    sb.append("    valueTo: ").append(toIndentedString(valueTo)).append("\n");
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
