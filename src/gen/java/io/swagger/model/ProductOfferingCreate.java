package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.BundledProductOffering;
import io.swagger.model.CategoryRef;
import io.swagger.model.ChannelRef;
import io.swagger.model.PlaceRef;
import io.swagger.model.ProductOfferingPrice;
import io.swagger.model.ProductOfferingTerm;
import io.swagger.model.ProductSpecificationRef;
import io.swagger.model.ResourceCandidateRef;
import io.swagger.model.ServiceCandidateRef;
import io.swagger.model.ServiceLevelAgreementRef;
import io.swagger.model.TimePeriod;
import java.util.ArrayList;
import java.util.List;


/**
 * Represents entities that are orderable from the provider of the catalog, this resource includes pricing information. Skipped properties: id,href
 **/

import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "Represents entities that are orderable from the provider of the catalog, this resource includes pricing information. Skipped properties: id,href")

public class ProductOfferingCreate   {
  
  private String version = null;
  private javax.xml.datatype.XMLGregorianCalendar lastUpdate = null;
  private String name = null;
  private String description = null;
  private Boolean isBundle = null;
  private String lifecycleStatus = null;
  private TimePeriod validFor = null;
  private List<PlaceRef> place = new ArrayList<PlaceRef>();
  private ServiceLevelAgreementRef serviceLevelAgreement = null;
  private ProductSpecificationRef productSpecification = null;
  private List<ChannelRef> channel = new ArrayList<ChannelRef>();
  private ServiceCandidateRef serviceCandidate = null;
  private List<CategoryRef> category = new ArrayList<CategoryRef>();
  private ResourceCandidateRef resourceCandidate = null;
  private List<ProductOfferingPrice> productOfferingPrice = new ArrayList<ProductOfferingPrice>();
  private List<BundledProductOffering> bundledProductOffering = new ArrayList<BundledProductOffering>();
  private List<ProductOfferingTerm> productOfferingTerm = new ArrayList<ProductOfferingTerm>();

  /**
   * ProductOffering version
   **/
  public ProductOfferingCreate version(String version) {
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
   * Date and time of the last update
   **/
  public ProductOfferingCreate lastUpdate(javax.xml.datatype.XMLGregorianCalendar lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Date and time of the last update")
  public javax.xml.datatype.XMLGregorianCalendar getLastUpdate() {
    return lastUpdate;
  }
  public void setLastUpdate(javax.xml.datatype.XMLGregorianCalendar lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  /**
   * Name of the productOffering
   **/
  public ProductOfferingCreate name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "Name of the productOffering")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Description of the productOffering
   **/
  public ProductOfferingCreate description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Description of the productOffering")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * isBundle determines whether a productOffering represents a single productOffering (false), or a bundle of productOfferings (true).
   **/
  public ProductOfferingCreate isBundle(Boolean isBundle) {
    this.isBundle = isBundle;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "isBundle determines whether a productOffering represents a single productOffering (false), or a bundle of productOfferings (true).")
  public Boolean getIsBundle() {
    return isBundle;
  }
  public void setIsBundle(Boolean isBundle) {
    this.isBundle = isBundle;
  }

  /**
   * Used to indicate the current lifecycle status
   **/
  public ProductOfferingCreate lifecycleStatus(String lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Used to indicate the current lifecycle status")
  public String getLifecycleStatus() {
    return lifecycleStatus;
  }
  public void setLifecycleStatus(String lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
  }

  /**
   * The period for which the productOffering is valid
   **/
  public ProductOfferingCreate validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "The period for which the productOffering is valid")
  public TimePeriod getValidFor() {
    return validFor;
  }
  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  /**
   **/
  public ProductOfferingCreate place(List<PlaceRef> place) {
    this.place = place;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<PlaceRef> getPlace() {
    return place;
  }
  public void setPlace(List<PlaceRef> place) {
    this.place = place;
  }

  /**
   **/
  public ProductOfferingCreate serviceLevelAgreement(ServiceLevelAgreementRef serviceLevelAgreement) {
    this.serviceLevelAgreement = serviceLevelAgreement;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public ServiceLevelAgreementRef getServiceLevelAgreement() {
    return serviceLevelAgreement;
  }
  public void setServiceLevelAgreement(ServiceLevelAgreementRef serviceLevelAgreement) {
    this.serviceLevelAgreement = serviceLevelAgreement;
  }

  /**
   **/
  public ProductOfferingCreate productSpecification(ProductSpecificationRef productSpecification) {
    this.productSpecification = productSpecification;
    return this;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "")
  public ProductSpecificationRef getProductSpecification() {
    return productSpecification;
  }
  public void setProductSpecification(ProductSpecificationRef productSpecification) {
    this.productSpecification = productSpecification;
  }

  /**
   **/
  public ProductOfferingCreate channel(List<ChannelRef> channel) {
    this.channel = channel;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<ChannelRef> getChannel() {
    return channel;
  }
  public void setChannel(List<ChannelRef> channel) {
    this.channel = channel;
  }

  /**
   **/
  public ProductOfferingCreate serviceCandidate(ServiceCandidateRef serviceCandidate) {
    this.serviceCandidate = serviceCandidate;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public ServiceCandidateRef getServiceCandidate() {
    return serviceCandidate;
  }
  public void setServiceCandidate(ServiceCandidateRef serviceCandidate) {
    this.serviceCandidate = serviceCandidate;
  }

  /**
   **/
  public ProductOfferingCreate category(List<CategoryRef> category) {
    this.category = category;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<CategoryRef> getCategory() {
    return category;
  }
  public void setCategory(List<CategoryRef> category) {
    this.category = category;
  }

  /**
   **/
  public ProductOfferingCreate resourceCandidate(ResourceCandidateRef resourceCandidate) {
    this.resourceCandidate = resourceCandidate;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public ResourceCandidateRef getResourceCandidate() {
    return resourceCandidate;
  }
  public void setResourceCandidate(ResourceCandidateRef resourceCandidate) {
    this.resourceCandidate = resourceCandidate;
  }

  /**
   **/
  public ProductOfferingCreate productOfferingPrice(List<ProductOfferingPrice> productOfferingPrice) {
    this.productOfferingPrice = productOfferingPrice;
    return this;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<ProductOfferingPrice> getProductOfferingPrice() {
    return productOfferingPrice;
  }
  public void setProductOfferingPrice(List<ProductOfferingPrice> productOfferingPrice) {
    this.productOfferingPrice = productOfferingPrice;
  }

  /**
   **/
  public ProductOfferingCreate bundledProductOffering(List<BundledProductOffering> bundledProductOffering) {
    this.bundledProductOffering = bundledProductOffering;
    return this;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<BundledProductOffering> getBundledProductOffering() {
    return bundledProductOffering;
  }
  public void setBundledProductOffering(List<BundledProductOffering> bundledProductOffering) {
    this.bundledProductOffering = bundledProductOffering;
  }

  /**
   **/
  public ProductOfferingCreate productOfferingTerm(List<ProductOfferingTerm> productOfferingTerm) {
    this.productOfferingTerm = productOfferingTerm;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<ProductOfferingTerm> getProductOfferingTerm() {
    return productOfferingTerm;
  }
  public void setProductOfferingTerm(List<ProductOfferingTerm> productOfferingTerm) {
    this.productOfferingTerm = productOfferingTerm;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductOfferingCreate productOfferingCreate = (ProductOfferingCreate) o;
    return Objects.equals(version, productOfferingCreate.version) &&
        Objects.equals(lastUpdate, productOfferingCreate.lastUpdate) &&
        Objects.equals(name, productOfferingCreate.name) &&
        Objects.equals(description, productOfferingCreate.description) &&
        Objects.equals(isBundle, productOfferingCreate.isBundle) &&
        Objects.equals(lifecycleStatus, productOfferingCreate.lifecycleStatus) &&
        Objects.equals(validFor, productOfferingCreate.validFor) &&
        Objects.equals(place, productOfferingCreate.place) &&
        Objects.equals(serviceLevelAgreement, productOfferingCreate.serviceLevelAgreement) &&
        Objects.equals(productSpecification, productOfferingCreate.productSpecification) &&
        Objects.equals(channel, productOfferingCreate.channel) &&
        Objects.equals(serviceCandidate, productOfferingCreate.serviceCandidate) &&
        Objects.equals(category, productOfferingCreate.category) &&
        Objects.equals(resourceCandidate, productOfferingCreate.resourceCandidate) &&
        Objects.equals(productOfferingPrice, productOfferingCreate.productOfferingPrice) &&
        Objects.equals(bundledProductOffering, productOfferingCreate.bundledProductOffering) &&
        Objects.equals(productOfferingTerm, productOfferingCreate.productOfferingTerm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, lastUpdate, name, description, isBundle, lifecycleStatus, validFor, place, serviceLevelAgreement, productSpecification, channel, serviceCandidate, category, resourceCandidate, productOfferingPrice, bundledProductOffering, productOfferingTerm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOfferingCreate {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isBundle: ").append(toIndentedString(isBundle)).append("\n");
    sb.append("    lifecycleStatus: ").append(toIndentedString(lifecycleStatus)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    place: ").append(toIndentedString(place)).append("\n");
    sb.append("    serviceLevelAgreement: ").append(toIndentedString(serviceLevelAgreement)).append("\n");
    sb.append("    productSpecification: ").append(toIndentedString(productSpecification)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    serviceCandidate: ").append(toIndentedString(serviceCandidate)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    resourceCandidate: ").append(toIndentedString(resourceCandidate)).append("\n");
    sb.append("    productOfferingPrice: ").append(toIndentedString(productOfferingPrice)).append("\n");
    sb.append("    bundledProductOffering: ").append(toIndentedString(bundledProductOffering)).append("\n");
    sb.append("    productOfferingTerm: ").append(toIndentedString(productOfferingTerm)).append("\n");
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
