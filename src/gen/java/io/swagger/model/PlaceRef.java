package io.swagger.model;

import io.swagger.annotations.ApiModel;


/**
 * Place reference. Place defines the places where the product offerings are sold.
 **/

import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "Place reference. Place defines the places where the product offerings are sold.")

public class PlaceRef   {
  
  private String id = null;
  private String href = null;
  private String name = null;

  /**
   * Unique identifier of the place
   **/
  public PlaceRef id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Unique identifier of the place")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Unique reference of the place
   **/
  public PlaceRef href(String href) {
    this.href = href;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Unique reference of the place")
  public String getHref() {
    return href;
  }
  public void setHref(String href) {
    this.href = href;
  }

  /**
   * Name of the place
   **/
  public PlaceRef name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Name of the place")
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
    PlaceRef placeRef = (PlaceRef) o;
    return Objects.equals(id, placeRef.id) &&
        Objects.equals(href, placeRef.href) &&
        Objects.equals(name, placeRef.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaceRef {\n");
    
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
