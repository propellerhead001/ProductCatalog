package io.swagger.model;




import io.swagger.annotations.*;
import java.util.Objects;


public class Hub   {
  
  private String id = null;
  private String callback = null;
  private String query = null;

  /**
   **/
  public Hub id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public Hub callback(String callback) {
    this.callback = callback;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getCallback() {
    return callback;
  }
  public void setCallback(String callback) {
    this.callback = callback;
  }

  /**
   **/
  public Hub query(String query) {
    this.query = query;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getQuery() {
    return query;
  }
  public void setQuery(String query) {
    this.query = query;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Hub hub = (Hub) o;
    return Objects.equals(id, hub.id) &&
        Objects.equals(callback, hub.callback) &&
        Objects.equals(query, hub.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, callback, query);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Hub {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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
