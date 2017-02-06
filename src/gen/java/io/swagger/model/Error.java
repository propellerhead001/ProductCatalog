package io.swagger.model;




import io.swagger.annotations.*;
import java.util.Objects;


public class Error   {
  
  private Integer code = null;
  private String message = null;
  private String description = null;
  private String infoURL = null;

  /**
   * An integer coding the error type. This is given to caller so he can translate them if required.
   **/
  public Error code(Integer code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "An integer coding the error type. This is given to caller so he can translate them if required.")
  public Integer getCode() {
    return code;
  }
  public void setCode(Integer code) {
    this.code = code;
  }

  /**
   * A short localized string that describes the error.
   **/
  public Error message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "A short localized string that describes the error.")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * (optional) A long localized error description if needed. It can contain precise information about which parameter is missing, or what are the identifier acceptable values.
   **/
  public Error description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "(optional) A long localized error description if needed. It can contain precise information about which parameter is missing, or what are the identifier acceptable values.")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * (optional) A URL to online documentation that provides more information about the error.
   **/
  public Error infoURL(String infoURL) {
    this.infoURL = infoURL;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "(optional) A URL to online documentation that provides more information about the error.")
  public String getInfoURL() {
    return infoURL;
  }
  public void setInfoURL(String infoURL) {
    this.infoURL = infoURL;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(code, error.code) &&
        Objects.equals(message, error.message) &&
        Objects.equals(description, error.description) &&
        Objects.equals(infoURL, error.infoURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, description, infoURL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    infoURL: ").append(toIndentedString(infoURL)).append("\n");
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
