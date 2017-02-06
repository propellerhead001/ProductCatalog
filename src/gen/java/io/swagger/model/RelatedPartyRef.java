package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.TimePeriod;


/**
 * RelatedParty reference. RelatedParty defines party or party role linked to a specific entity.
 **/

import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "RelatedParty reference. RelatedParty defines party or party role linked to a specific entity.")

public class RelatedPartyRef   {
  
  private String id = null;
  private String href = null;
  private String role = null;
  private String name = null;
  private TimePeriod validFor = null;

  /**
   * Unique identifier of a related party
   **/
  public RelatedPartyRef id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Unique identifier of a related party")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Reference of the related party, could be a party reference or a partyRole reference
   **/
  public RelatedPartyRef href(String href) {
    this.href = href;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Reference of the related party, could be a party reference or a partyRole reference")
  public String getHref() {
    return href;
  }
  public void setHref(String href) {
    this.href = href;
  }

  /**
   * Role of the related party.
   **/
  public RelatedPartyRef role(String role) {
    this.role = role;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Role of the related party.")
  public String getRole() {
    return role;
  }
  public void setRole(String role) {
    this.role = role;
  }

  /**
   * Name of the related party
   **/
  public RelatedPartyRef name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Name of the related party")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Validity period of the related party
   **/
  public RelatedPartyRef validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Validity period of the related party")
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
    RelatedPartyRef relatedPartyRef = (RelatedPartyRef) o;
    return Objects.equals(id, relatedPartyRef.id) &&
        Objects.equals(href, relatedPartyRef.href) &&
        Objects.equals(role, relatedPartyRef.role) &&
        Objects.equals(name, relatedPartyRef.name) &&
        Objects.equals(validFor, relatedPartyRef.validFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, role, name, validFor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedPartyRef {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
