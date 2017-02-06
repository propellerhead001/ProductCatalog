package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.Attachment;
import io.swagger.model.BundledProductSpecification;
import io.swagger.model.ProductSpecCharacteristic;
import io.swagger.model.ProductSpecificationRelationship;
import io.swagger.model.RelatedPartyRef;
import io.swagger.model.ResourceSpecificationRef;
import io.swagger.model.ServiceSpecificationRef;
import io.swagger.model.TimePeriod;
import java.util.ArrayList;
import java.util.List;


/**
 * Is a detailed description of a tangible or intangible object made available externally in the form of a ProductOffering to customers or other parties playing a party role. Skipped properties: id,href,id,lastUpdate
 **/

import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "Is a detailed description of a tangible or intangible object made available externally in the form of a ProductOffering to customers or other parties playing a party role. Skipped properties: id,href,id,lastUpdate")

public class ProductSpecificationUpdate   {
  
  private String version = null;
  private String name = null;
  private String description = null;
  private Boolean isBundle = null;
  private String brand = null;
  private String lifecycleStatus = null;
  private TimePeriod validFor = null;
  private String productNumber = null;
  private List<RelatedPartyRef> relatedParty = new ArrayList<RelatedPartyRef>();
  private List<ProductSpecCharacteristic> productSpecCharacteristic = new ArrayList<ProductSpecCharacteristic>();
  private List<ServiceSpecificationRef> serviceSpecification = new ArrayList<ServiceSpecificationRef>();
  private List<ProductSpecificationRelationship> productSpecificationRelationship = new ArrayList<ProductSpecificationRelationship>();
  private List<ResourceSpecificationRef> resourceSpecification = new ArrayList<ResourceSpecificationRef>();
  private List<Attachment> attachment = new ArrayList<Attachment>();
  private List<BundledProductSpecification> bundledProductSpecification = new ArrayList<BundledProductSpecification>();

  /**
   * Product specification version
   **/
  public ProductSpecificationUpdate version(String version) {
    this.version = version;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Product specification version")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   * Name of the product specification
   **/
  public ProductSpecificationUpdate name(String name) {
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

  /**
   * A narrative that explains in detail what the product specification is
   **/
  public ProductSpecificationUpdate description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "A narrative that explains in detail what the product specification is")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * isBundle determines whether a productSpecification represents a single productSpecification (false), or a bundle of productSpecification (true).
   **/
  public ProductSpecificationUpdate isBundle(Boolean isBundle) {
    this.isBundle = isBundle;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "isBundle determines whether a productSpecification represents a single productSpecification (false), or a bundle of productSpecification (true).")
  public Boolean getIsBundle() {
    return isBundle;
  }
  public void setIsBundle(Boolean isBundle) {
    this.isBundle = isBundle;
  }

  /**
   * The manufacturer or trademark of the specification
   **/
  public ProductSpecificationUpdate brand(String brand) {
    this.brand = brand;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "The manufacturer or trademark of the specification")
  public String getBrand() {
    return brand;
  }
  public void setBrand(String brand) {
    this.brand = brand;
  }

  /**
   * Used to indicate the current lifecycle status
   **/
  public ProductSpecificationUpdate lifecycleStatus(String lifecycleStatus) {
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
   * The period for which the product specification is valid
   **/
  public ProductSpecificationUpdate validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "The period for which the product specification is valid")
  public TimePeriod getValidFor() {
    return validFor;
  }
  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  /**
   * An identification number assigned to uniquely identity the specification
   **/
  public ProductSpecificationUpdate productNumber(String productNumber) {
    this.productNumber = productNumber;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "An identification number assigned to uniquely identity the specification")
  public String getProductNumber() {
    return productNumber;
  }
  public void setProductNumber(String productNumber) {
    this.productNumber = productNumber;
  }

  /**
   **/
  public ProductSpecificationUpdate relatedParty(List<RelatedPartyRef> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<RelatedPartyRef> getRelatedParty() {
    return relatedParty;
  }
  public void setRelatedParty(List<RelatedPartyRef> relatedParty) {
    this.relatedParty = relatedParty;
  }

  /**
   **/
  public ProductSpecificationUpdate productSpecCharacteristic(List<ProductSpecCharacteristic> productSpecCharacteristic) {
    this.productSpecCharacteristic = productSpecCharacteristic;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<ProductSpecCharacteristic> getProductSpecCharacteristic() {
    return productSpecCharacteristic;
  }
  public void setProductSpecCharacteristic(List<ProductSpecCharacteristic> productSpecCharacteristic) {
    this.productSpecCharacteristic = productSpecCharacteristic;
  }

  /**
   **/
  public ProductSpecificationUpdate serviceSpecification(List<ServiceSpecificationRef> serviceSpecification) {
    this.serviceSpecification = serviceSpecification;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<ServiceSpecificationRef> getServiceSpecification() {
    return serviceSpecification;
  }
  public void setServiceSpecification(List<ServiceSpecificationRef> serviceSpecification) {
    this.serviceSpecification = serviceSpecification;
  }

  /**
   **/
  public ProductSpecificationUpdate productSpecificationRelationship(List<ProductSpecificationRelationship> productSpecificationRelationship) {
    this.productSpecificationRelationship = productSpecificationRelationship;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<ProductSpecificationRelationship> getProductSpecificationRelationship() {
    return productSpecificationRelationship;
  }
  public void setProductSpecificationRelationship(List<ProductSpecificationRelationship> productSpecificationRelationship) {
    this.productSpecificationRelationship = productSpecificationRelationship;
  }

  /**
   **/
  public ProductSpecificationUpdate resourceSpecification(List<ResourceSpecificationRef> resourceSpecification) {
    this.resourceSpecification = resourceSpecification;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<ResourceSpecificationRef> getResourceSpecification() {
    return resourceSpecification;
  }
  public void setResourceSpecification(List<ResourceSpecificationRef> resourceSpecification) {
    this.resourceSpecification = resourceSpecification;
  }

  /**
   **/
  public ProductSpecificationUpdate attachment(List<Attachment> attachment) {
    this.attachment = attachment;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<Attachment> getAttachment() {
    return attachment;
  }
  public void setAttachment(List<Attachment> attachment) {
    this.attachment = attachment;
  }

  /**
   **/
  public ProductSpecificationUpdate bundledProductSpecification(List<BundledProductSpecification> bundledProductSpecification) {
    this.bundledProductSpecification = bundledProductSpecification;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<BundledProductSpecification> getBundledProductSpecification() {
    return bundledProductSpecification;
  }
  public void setBundledProductSpecification(List<BundledProductSpecification> bundledProductSpecification) {
    this.bundledProductSpecification = bundledProductSpecification;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductSpecificationUpdate productSpecificationUpdate = (ProductSpecificationUpdate) o;
    return Objects.equals(version, productSpecificationUpdate.version) &&
        Objects.equals(name, productSpecificationUpdate.name) &&
        Objects.equals(description, productSpecificationUpdate.description) &&
        Objects.equals(isBundle, productSpecificationUpdate.isBundle) &&
        Objects.equals(brand, productSpecificationUpdate.brand) &&
        Objects.equals(lifecycleStatus, productSpecificationUpdate.lifecycleStatus) &&
        Objects.equals(validFor, productSpecificationUpdate.validFor) &&
        Objects.equals(productNumber, productSpecificationUpdate.productNumber) &&
        Objects.equals(relatedParty, productSpecificationUpdate.relatedParty) &&
        Objects.equals(productSpecCharacteristic, productSpecificationUpdate.productSpecCharacteristic) &&
        Objects.equals(serviceSpecification, productSpecificationUpdate.serviceSpecification) &&
        Objects.equals(productSpecificationRelationship, productSpecificationUpdate.productSpecificationRelationship) &&
        Objects.equals(resourceSpecification, productSpecificationUpdate.resourceSpecification) &&
        Objects.equals(attachment, productSpecificationUpdate.attachment) &&
        Objects.equals(bundledProductSpecification, productSpecificationUpdate.bundledProductSpecification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, name, description, isBundle, brand, lifecycleStatus, validFor, productNumber, relatedParty, productSpecCharacteristic, serviceSpecification, productSpecificationRelationship, resourceSpecification, attachment, bundledProductSpecification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSpecificationUpdate {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isBundle: ").append(toIndentedString(isBundle)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    lifecycleStatus: ").append(toIndentedString(lifecycleStatus)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    productNumber: ").append(toIndentedString(productNumber)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    productSpecCharacteristic: ").append(toIndentedString(productSpecCharacteristic)).append("\n");
    sb.append("    serviceSpecification: ").append(toIndentedString(serviceSpecification)).append("\n");
    sb.append("    productSpecificationRelationship: ").append(toIndentedString(productSpecificationRelationship)).append("\n");
    sb.append("    resourceSpecification: ").append(toIndentedString(resourceSpecification)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    bundledProductSpecification: ").append(toIndentedString(bundledProductSpecification)).append("\n");
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
