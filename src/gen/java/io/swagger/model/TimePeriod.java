package io.swagger.model;

import io.swagger.annotations.ApiModel;


/**
 * A base / value business entity used to represent a period of time between two timepoints.
 **/

import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "A base / value business entity used to represent a period of time between two timepoints.")

public class TimePeriod   {
  
  private javax.xml.datatype.XMLGregorianCalendar startDateTime = null;
  private javax.xml.datatype.XMLGregorianCalendar endDateTime = null;

  /**
   * An instant of time, starting at the TimePeriod
   **/
  public TimePeriod startDateTime(javax.xml.datatype.XMLGregorianCalendar startDateTime) {
    this.startDateTime = startDateTime;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "An instant of time, starting at the TimePeriod")
  public javax.xml.datatype.XMLGregorianCalendar getStartDateTime() {
    return startDateTime;
  }
  public void setStartDateTime(javax.xml.datatype.XMLGregorianCalendar startDateTime) {
    this.startDateTime = startDateTime;
  }

  /**
   * An instant of time, ending at the TimePeriod.
   **/
  public TimePeriod endDateTime(javax.xml.datatype.XMLGregorianCalendar endDateTime) {
    this.endDateTime = endDateTime;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "An instant of time, ending at the TimePeriod.")
  public javax.xml.datatype.XMLGregorianCalendar getEndDateTime() {
    return endDateTime;
  }
  public void setEndDateTime(javax.xml.datatype.XMLGregorianCalendar endDateTime) {
    this.endDateTime = endDateTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimePeriod timePeriod = (TimePeriod) o;
    return Objects.equals(startDateTime, timePeriod.startDateTime) &&
        Objects.equals(endDateTime, timePeriod.endDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDateTime, endDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimePeriod {\n");
    
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
    sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
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
