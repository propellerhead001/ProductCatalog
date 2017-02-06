package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.Price;
import io.swagger.model.TimePeriod;


/**
 * An amount, usually of money, that modifies a price charged for a productOffering.
 **/

import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "An amount, usually of money, that modifies a price charged for a productOffering.")

public class ProductOfferPriceAlteration   {
  
  private String name = null;
  private String description = null;
  private TimePeriod validFor = null;
  private String priceType = null;
  private String unitOfMeasure = null;
  private String recurringChargePeriod = null;
  private Integer applicationDuration = null;
  private String priceCondition = null;
  private Price price = null;

  /**
   * Name of the prodOfferPriceAlteration
   **/
  public ProductOfferPriceAlteration name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Name of the prodOfferPriceAlteration")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Description of the prodOfferPriceAlteration
   **/
  public ProductOfferPriceAlteration description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Description of the prodOfferPriceAlteration")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The period for which the prodOfferPriceAlteration is valid
   **/
  public ProductOfferPriceAlteration validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "The period for which the prodOfferPriceAlteration is valid")
  public TimePeriod getValidFor() {
    return validFor;
  }
  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  /**
   * Indicates the price type: recurring, one time, usage
   **/
  public ProductOfferPriceAlteration priceType(String priceType) {
    this.priceType = priceType;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Indicates the price type: recurring, one time, usage")
  public String getPriceType() {
    return priceType;
  }
  public void setPriceType(String priceType) {
    this.priceType = priceType;
  }

  /**
   * Could be minutes, GB...
   **/
  public ProductOfferPriceAlteration unitOfMeasure(String unitOfMeasure) {
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
   * Could be month, week...
   **/
  public ProductOfferPriceAlteration recurringChargePeriod(String recurringChargePeriod) {
    this.recurringChargePeriod = recurringChargePeriod;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Could be month, week...")
  public String getRecurringChargePeriod() {
    return recurringChargePeriod;
  }
  public void setRecurringChargePeriod(String recurringChargePeriod) {
    this.recurringChargePeriod = recurringChargePeriod;
  }

  /**
   * Duration during which the prodOfferPriceAlteration applies on the productOffering (for instance 2 months free of charge for the recurring charge)
   **/
  public ProductOfferPriceAlteration applicationDuration(Integer applicationDuration) {
    this.applicationDuration = applicationDuration;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Duration during which the prodOfferPriceAlteration applies on the productOffering (for instance 2 months free of charge for the recurring charge)")
  public Integer getApplicationDuration() {
    return applicationDuration;
  }
  public void setApplicationDuration(Integer applicationDuration) {
    this.applicationDuration = applicationDuration;
  }

  /**
   * Condition that triggers the price application
   **/
  public ProductOfferPriceAlteration priceCondition(String priceCondition) {
    this.priceCondition = priceCondition;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Condition that triggers the price application")
  public String getPriceCondition() {
    return priceCondition;
  }
  public void setPriceCondition(String priceCondition) {
    this.priceCondition = priceCondition;
  }

  /**
   **/
  public ProductOfferPriceAlteration price(Price price) {
    this.price = price;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Price getPrice() {
    return price;
  }
  public void setPrice(Price price) {
    this.price = price;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductOfferPriceAlteration productOfferPriceAlteration = (ProductOfferPriceAlteration) o;
    return Objects.equals(name, productOfferPriceAlteration.name) &&
        Objects.equals(description, productOfferPriceAlteration.description) &&
        Objects.equals(validFor, productOfferPriceAlteration.validFor) &&
        Objects.equals(priceType, productOfferPriceAlteration.priceType) &&
        Objects.equals(unitOfMeasure, productOfferPriceAlteration.unitOfMeasure) &&
        Objects.equals(recurringChargePeriod, productOfferPriceAlteration.recurringChargePeriod) &&
        Objects.equals(applicationDuration, productOfferPriceAlteration.applicationDuration) &&
        Objects.equals(priceCondition, productOfferPriceAlteration.priceCondition) &&
        Objects.equals(price, productOfferPriceAlteration.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, validFor, priceType, unitOfMeasure, recurringChargePeriod, applicationDuration, priceCondition, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOfferPriceAlteration {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    priceType: ").append(toIndentedString(priceType)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
    sb.append("    recurringChargePeriod: ").append(toIndentedString(recurringChargePeriod)).append("\n");
    sb.append("    applicationDuration: ").append(toIndentedString(applicationDuration)).append("\n");
    sb.append("    priceCondition: ").append(toIndentedString(priceCondition)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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
