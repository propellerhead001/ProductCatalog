package io.swagger.model;

import io.swagger.annotations.ApiModel;


/**
 * Provides all amounts (tax included, duty free, tax rate), used currency and percentage to apply for ProdOfferPriceAlteration.
 **/

import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "Provides all amounts (tax included, duty free, tax rate), used currency and percentage to apply for ProdOfferPriceAlteration.")

public class Price   {
  
  private Float taxIncludedAmount = null;
  private Float dutyFreeAmount = null;
  private Float taxRate = null;
  private String currencyCode = null;
  private Float percentage = null;
  private String priceType = null;

  /**
   * All taxes included amount (expressed in the given currency)
   **/
  public Price taxIncludedAmount(Float taxIncludedAmount) {
    this.taxIncludedAmount = taxIncludedAmount;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "All taxes included amount (expressed in the given currency)")
  public Float getTaxIncludedAmount() {
    return taxIncludedAmount;
  }
  public void setTaxIncludedAmount(Float taxIncludedAmount) {
    this.taxIncludedAmount = taxIncludedAmount;
  }

  /**
   * All taxes excluded amount (expressed in the given currency)
   **/
  public Price dutyFreeAmount(Float dutyFreeAmount) {
    this.dutyFreeAmount = dutyFreeAmount;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "All taxes excluded amount (expressed in the given currency)")
  public Float getDutyFreeAmount() {
    return dutyFreeAmount;
  }
  public void setDutyFreeAmount(Float dutyFreeAmount) {
    this.dutyFreeAmount = dutyFreeAmount;
  }

  /**
   * Tax rate
   **/
  public Price taxRate(Float taxRate) {
    this.taxRate = taxRate;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Tax rate")
  public Float getTaxRate() {
    return taxRate;
  }
  public void setTaxRate(Float taxRate) {
    this.taxRate = taxRate;
  }

  /**
   * A string used as a code for specifying the currency associated to the given amounts. The ISO4217 norm uses 3 letters to define the currency (for example USD for US dollar or EUR for Euro)
   **/
  public Price currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "A string used as a code for specifying the currency associated to the given amounts. The ISO4217 norm uses 3 letters to define the currency (for example USD for US dollar or EUR for Euro)")
  public String getCurrencyCode() {
    return currencyCode;
  }
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  /**
   * Percentage to apply for ProdOfferPriceAlteration
   **/
  public Price percentage(Float percentage) {
    this.percentage = percentage;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Percentage to apply for ProdOfferPriceAlteration")
  public Float getPercentage() {
    return percentage;
  }
  public void setPercentage(Float percentage) {
    this.percentage = percentage;
  }

  /**
   * Indicates the price type: recurring, one time, usage
   **/
  public Price priceType(String priceType) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Price price = (Price) o;
    return Objects.equals(taxIncludedAmount, price.taxIncludedAmount) &&
        Objects.equals(dutyFreeAmount, price.dutyFreeAmount) &&
        Objects.equals(taxRate, price.taxRate) &&
        Objects.equals(currencyCode, price.currencyCode) &&
        Objects.equals(percentage, price.percentage) &&
        Objects.equals(priceType, price.priceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxIncludedAmount, dutyFreeAmount, taxRate, currencyCode, percentage, priceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Price {\n");
    
    sb.append("    taxIncludedAmount: ").append(toIndentedString(taxIncludedAmount)).append("\n");
    sb.append("    dutyFreeAmount: ").append(toIndentedString(dutyFreeAmount)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    priceType: ").append(toIndentedString(priceType)).append("\n");
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
