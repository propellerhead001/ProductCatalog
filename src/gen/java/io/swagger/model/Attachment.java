package io.swagger.model;

import io.swagger.annotations.ApiModel;


/**
 * Describes a product through video, pictures...
 **/

import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "Describes a product through video, pictures...")

public class Attachment   {
  
  private String href = null;
  private String id = null;
  private String type = null;
  private String url = null;

  /**
   * Reference of the attachment
   **/
  public Attachment href(String href) {
    this.href = href;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Reference of the attachment")
  public String getHref() {
    return href;
  }
  public void setHref(String href) {
    this.href = href;
  }

  /**
   * Unique identifier of the attachment
   **/
  public Attachment id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Unique identifier of the attachment")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Attachment type such as video, picture
   **/
  public Attachment type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Attachment type such as video, picture")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Uniform Resource Locator, is a web page address (a subset of URI)
   **/
  public Attachment url(String url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Uniform Resource Locator, is a web page address (a subset of URI)")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attachment attachment = (Attachment) o;
    return Objects.equals(href, attachment.href) &&
        Objects.equals(id, attachment.id) &&
        Objects.equals(type, attachment.type) &&
        Objects.equals(url, attachment.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, id, type, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attachment {\n");
    
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
