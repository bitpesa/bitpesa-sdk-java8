/*
 * BitPesa API
 * Reference documentation for the BitPesa API V1
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package co.bitpesa.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * &#x60;&#x60;&#x60;JSON \&quot;details\&quot;: {   \&quot;phone_number\&quot;: \&quot;+2569999999\&quot;,   \&quot;send_instructions\&quot;: true } &#x60;&#x60;&#x60;
 */
@ApiModel(description = "```JSON \"details\": {   \"phone_number\": \"+2569999999\",   \"send_instructions\": true } ```")

public class PayinMethodDetailsMobile {
  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_SEND_INSTRUCTIONS = "send_instructions";
  @SerializedName(SERIALIZED_NAME_SEND_INSTRUCTIONS)
  private Boolean sendInstructions;

  public PayinMethodDetailsMobile phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The phone number where the funds should be collected from
   * @return phoneNumber
  **/
  @ApiModelProperty(example = "+2569999999", required = true, value = "The phone number where the funds should be collected from")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public PayinMethodDetailsMobile sendInstructions(Boolean sendInstructions) {
    this.sendInstructions = sendInstructions;
    return this;
  }

   /**
   * States whether to send out the instructions to the phone number on how to pay the funds or not. This shuold always be set to true, otherwise the sender might not receive a prompt for payment.
   * @return sendInstructions
  **/
  @ApiModelProperty(example = "true", value = "States whether to send out the instructions to the phone number on how to pay the funds or not. This shuold always be set to true, otherwise the sender might not receive a prompt for payment.")
  public Boolean getSendInstructions() {
    return sendInstructions;
  }

  public void setSendInstructions(Boolean sendInstructions) {
    this.sendInstructions = sendInstructions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayinMethodDetailsMobile payinMethodDetailsMobile = (PayinMethodDetailsMobile) o;
    return Objects.equals(this.phoneNumber, payinMethodDetailsMobile.phoneNumber) &&
        Objects.equals(this.sendInstructions, payinMethodDetailsMobile.sendInstructions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, sendInstructions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayinMethodDetailsMobile {\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    sendInstructions: ").append(toIndentedString(sendInstructions)).append("\n");
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

