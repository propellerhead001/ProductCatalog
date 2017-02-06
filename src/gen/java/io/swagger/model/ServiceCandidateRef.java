package io.swagger.model;

import io.swagger.annotations.ApiModel;


/**
 * ServiceCandidate reference. ServiceCandidate is an entity that makes a ServiceSpecification available to a catalog.
 **/

import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "ServiceCandidate reference. ServiceCandidate is an entity that makes a ServiceSpecification available to a catalog.")

public class ServiceCandidateRef   {
  
  private String id = null;
  private String href = null;
  private String version = null;
  private String name = null;

  /**
   * Unique identifier of the service candidate
   **/
  public ServiceCandidateRef id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Unique identifier of the service candidate")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Unique reference of the service candidate
   **/
  public ServiceCandidateRef href(String href) {
    this.href = href;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Unique reference of the service candidate")
  public String getHref() {
    return href;
  }
  public void setHref(String href) {
    this.href = href;
  }

  /**
   * Version of the service candidate
   **/
  public ServiceCandidateRef version(String version) {
    this.version = version;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Version of the service candidate")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   * Name of the service candidate
   **/
  public ServiceCandidateRef name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Name of the service candidate")
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
    ServiceCandidateRef serviceCandidateRef = (ServiceCandidateRef) o;
    return Objects.equals(id, serviceCandidateRef.id) &&
        Objects.equals(href, serviceCandidateRef.href) &&
        Objects.equals(version, serviceCandidateRef.version) &&
        Objects.equals(name, serviceCandidateRef.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, version, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceCandidateRef {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
