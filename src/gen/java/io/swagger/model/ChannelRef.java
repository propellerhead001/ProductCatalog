package io.swagger.model;

import io.swagger.annotations.ApiModel;


/**
 * Channel reference. The channel defines the channel for selling product offerings.
 **/

import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "Channel reference. The channel defines the channel for selling product offerings.")

public class ChannelRef   {
  
  private String id = null;
  private String href = null;
  private String name = null;

  /**
   * Unique identifier of the channel
   **/
  public ChannelRef id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Unique identifier of the channel")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Reference of the channel
   **/
  public ChannelRef href(String href) {
    this.href = href;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Reference of the channel")
  public String getHref() {
    return href;
  }
  public void setHref(String href) {
    this.href = href;
  }

  /**
   * Name of the channel
   **/
  public ChannelRef name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Name of the channel")
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
    ChannelRef channelRef = (ChannelRef) o;
    return Objects.equals(id, channelRef.id) &&
        Objects.equals(href, channelRef.href) &&
        Objects.equals(name, channelRef.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelRef {\n");
    
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
