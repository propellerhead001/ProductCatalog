package io.swagger.model;

import io.swagger.annotations.ApiModel;


/**
 * ServiceLevelAgreement reference: A service level agreement (SLA) is a type of agreement that represents a formal negotiated agreement between two parties designed to create a common understanding about products, services, priorities, responsibilities, and so forth. The SLA is a set of appropriate procedures and targets formally or informally agreed between parties in order to achieve and maintain specified Quality of Service.
 **/

import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "ServiceLevelAgreement reference: A service level agreement (SLA) is a type of agreement that represents a formal negotiated agreement between two parties designed to create a common understanding about products, services, priorities, responsibilities, and so forth. The SLA is a set of appropriate procedures and targets formally or informally agreed between parties in order to achieve and maintain specified Quality of Service.")

public class ServiceLevelAgreementRef   {
  
  private String id = null;
  private String href = null;
  private String name = null;

  /**
   * Unique identifier of service level agreement
   **/
  public ServiceLevelAgreementRef id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Unique identifier of service level agreement")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Reference of the service level agreement
   **/
  public ServiceLevelAgreementRef href(String href) {
    this.href = href;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Reference of the service level agreement")
  public String getHref() {
    return href;
  }
  public void setHref(String href) {
    this.href = href;
  }

  /**
   * Name of the service level agreement
   **/
  public ServiceLevelAgreementRef name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Name of the service level agreement")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceLevelAgreementRef serviceLevelAgreementRef = (ServiceLevelAgreementRef) o;
    return Objects.equals(id, serviceLevelAgreementRef.id) &&
        Objects.equals(href, serviceLevelAgreementRef.href) &&
        Objects.equals(name, serviceLevelAgreementRef.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceLevelAgreementRef {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
