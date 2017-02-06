package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.Price;
import io.swagger.model.ProductOfferPriceAlteration;
import io.swagger.model.TimePeriod;


/**
 * Is based on both the basic cost to develop and produce products and the enterprise&#39;s policy on revenue targets. This price may be further revised through discounting (prodOfferPriceAlteration). The price, applied for a productOffering may also be influenced by the productOfferingTerm, the customer selected - e.g. a productOffering can be offered with multiple terms, like commitment periods for the contract. The price may be influenced by this productOfferingTerm. A productOffering may be cheaper with a 24 month commitment than with a 12 month commitment.
 **/

import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "Is based on both the basic cost to develop and produce products and the enterprise's policy on revenue targets. This price may be further revised through discounting (prodOfferPriceAlteration). The price, applied for a productOffering may also be influenced by the productOfferingTerm, the customer selected - e.g. a productOffering can be offered with multiple terms, like commitment periods for the contract. The price may be influenced by this productOfferingTerm. A productOffering may be cheaper with a 24 month commitment than with a 12 month commitment.")

public class ProductOfferingPrice   {
  
  private String name = null;
  private String description = null;
  private TimePeriod validFor = null;
  private String priceType = null;
  private String unitOfMeasure = null;
  private String recurringChargePeriod = null;
  private String version = null;
  private Price price = null;
  private ProductOfferPriceAlteration productOfferPriceAlteration = null;

  /**
   * Name of the productOfferingPrice
   **/
  public ProductOfferingPrice name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Name of the productOfferingPrice")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Description of the productOfferingPrice
   **/
  public ProductOfferingPrice description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Description of the productOfferingPrice")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The period for which the productOfferingPrice is valid
   **/
  public ProductOfferingPrice validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "The period for which the productOfferingPrice is valid")
  public TimePeriod getValidFor() {
    return validFor;
  }
  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  /**
   * Indicates the price type: recurring, one time, usage
   **/
  public ProductOfferingPrice priceType(String priceType) {
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
  public ProductOfferingPrice unitOfMeasure(String unitOfMeasure) {
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
  public ProductOfferingPrice recurringChargePeriod(String recurringChargePeriod) {
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
   * ProductOffering version
   **/
  public ProductOfferingPrice version(String version) {
    this.version = version;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "ProductOffering version")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   **/
  public ProductOfferingPrice price(Price price) {
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

  /**
   **/
  public ProductOfferingPrice productOfferPriceAlteration(ProductOfferPriceAlteration productOfferPriceAlteration) {
    this.productOfferPriceAlteration = productOfferPriceAlteration;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public ProductOfferPriceAlteration getProductOfferPriceAlteration() {
    return productOfferPriceAlteration;
  }
  public void setProductOfferPriceAlteration(ProductOfferPriceAlteration productOfferPriceAlteration) {
    this.productOfferPriceAlteration = productOfferPriceAlteration;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductOfferingPrice productOfferingPrice = (ProductOfferingPrice) o;
    return Objects.equals(name, productOfferingPrice.name) &&
        Objects.equals(description, productOfferingPrice.description) &&
        Objects.equals(validFor, productOfferingPrice.validFor) &&
        Objects.equals(priceType, productOfferingPrice.priceType) &&
        Objects.equals(unitOfMeasure, productOfferingPrice.unitOfMeasure) &&
        Objects.equals(recurringChargePeriod, productOfferingPrice.recurringChargePeriod) &&
        Objects.equals(version, productOfferingPrice.version) &&
        Objects.equals(price, productOfferingPrice.price) &&
        Objects.equals(productOfferPriceAlteration, productOfferingPrice.productOfferPriceAlteration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, validFor, priceType, unitOfMeasure, recurringChargePeriod, version, price, productOfferPriceAlteration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOfferingPrice {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    priceType: ").append(toIndentedString(priceType)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
    sb.append("    recurringChargePeriod: ").append(toIndentedString(recurringChargePeriod)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    productOfferPriceAlteration: ").append(toIndentedString(productOfferPriceAlteration)).append("\n");
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
