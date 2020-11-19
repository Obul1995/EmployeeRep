package com.societe.employee.api.model;

import java.util.Objects;

import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Message Response
 */
@ApiModel(description = "Message Response")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-11-17T04:10:17.980Z")



@Component
public class MessageResponse   {
  @JsonProperty("successMessage")
  private String successMessage = null;

  public MessageResponse successMessage(String successMessage) {
    this.successMessage = successMessage;
    return this;
  }

  /**
   * Get successMessage
   * @return successMessage
  **/
  @ApiModelProperty(example = "success", value = "")


  public String getSuccessMessage() {
    return successMessage;
  }

  public void setSuccessMessage(String successMessage) {
    this.successMessage = successMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageResponse messageResponse = (MessageResponse) o;
    return Objects.equals(this.successMessage, messageResponse.successMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageResponse {\n");
    
    sb.append("    successMessage: ").append(toIndentedString(successMessage)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

